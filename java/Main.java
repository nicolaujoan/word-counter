void main(String... args) {
    System.out.println("Hello, World!");
    if (args.length > 0) {
        for (var arg : args) System.out.println(arg);
    } else {
        System.out.println("No CLI arguments provided.");
    }
}