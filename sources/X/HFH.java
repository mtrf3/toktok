package X;

/* loaded from: classes8.dex */
public final class HFH<F, T> implements InterfaceC65644PpY {
    public static final HFH<F, T> LJLIL = new HFH<>();

    @Override // X.InterfaceC65644PpY
    public final Object apply(Object obj) {
        String str = (String) obj;
        if (str != null) {
            return new OJD("/data/user/0/").replaceFirst(str, "/data/data/");
        }
        return null;
    }
}
