package X;

/* renamed from: X.MKu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56640MKu<I, O> implements C14Q {
    public static final C56640MKu<I, O> LJLIL = new C56640MKu<>();

    @Override // X.C14Q
    public final Object apply(Object obj) {
        EnumC56637MKr enumC56637MKr = (EnumC56637MKr) obj;
        if (enumC56637MKr != null) {
            int i = C56638MKs.LIZ[enumC56637MKr.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4 || i == 5) {
                            return EnumC94693nd.LOADING;
                        }
                    } else {
                        return EnumC94693nd.EMPTY;
                    }
                } else {
                    return EnumC94693nd.FAIL;
                }
            } else {
                return EnumC94693nd.SUCCESS;
            }
        }
        return EnumC94693nd.LOADING;
    }
}
