package X;

import kotlin.jvm.internal.o;

/* renamed from: X.HCd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43675HCd extends AbstractC65781Prl implements InterfaceC88472Yns<HJU, CharSequence> {
    public static final C43675HCd LJLIL = new C43675HCd();

    public C43675HCd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(HJU hju) {
        HJU it = hju;
        o.LJIIIZ(it, "it");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isVideoType = ");
        LIZ.append(it.LIZJ);
        LIZ.append(", path = ");
        LIZ.append(it.LIZIZ);
        return X1D.LIZIZ(LIZ);
    }
}
