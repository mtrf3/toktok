package X;

/* loaded from: classes8.dex */
public final class HFI<F, T> implements InterfaceC65644PpY {
    public static final HFI<F, T> LJLIL = new HFI<>();

    @Override // X.InterfaceC65644PpY
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str != null) {
            return new OJD("/data/data/").replaceFirst(str, "/data/user/0/");
        }
        return null;
    }
}
