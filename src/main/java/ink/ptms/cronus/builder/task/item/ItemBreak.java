package ink.ptms.cronus.builder.task.item;

import ink.ptms.cronus.builder.task.TaskEntry;
import ink.ptms.cronus.builder.task.data.Count;
import ink.ptms.cronus.builder.task.data.Item;
import ink.ptms.cronus.internal.QuestTask;
import ink.ptms.cronus.internal.task.item.TaskItemBreak;
import ink.ptms.cronus.uranus.annotations.Auto;
import io.izzel.taboolib.util.item.ItemBuilder;
import io.izzel.taboolib.util.lite.Materials;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;

/**
 * @Author 坏黑
 * @Since 2019-06-22 22:19
 */
@Auto
public class ItemBreak extends TaskEntry {

    public ItemBreak() {
        objective.add(Count.class);
        objective.add(Item.class);
    }

    @Override
    public ItemStack getItem() {
        return new ItemBuilder(Materials.DAMAGED_ANVIL.parseItem()).name("§f物品损坏").lore("", "§7点击选择").flags(ItemFlag.values()).build();
    }

    @Override
    public Class<? extends QuestTask> getTask() {
        return TaskItemBreak.class;
    }
}
