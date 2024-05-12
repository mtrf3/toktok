package X;

/* loaded from: classes15.dex */
public final class W9F implements W4P<C81738W6c> {
    @Override // X.W4P
    public final C81738W6c get() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 1048576;
        } else if (min < 33554432) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        return new C81738W6c(i, Integer.MAX_VALUE, i, i / 8);
    }
}
