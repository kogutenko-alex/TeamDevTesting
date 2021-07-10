package ua.kogutenko.Brainfuck.command;

import ua.kogutenko.Brainfuck.array.ContainerForArray;
import ua.kogutenko.Brainfuck.memory.Memory;

public class AddCommand extends Command {

    public AddCommand () {}

    @Override
    public void execute() {
        ContainerForArray.increment();
    }
}
