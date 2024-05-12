package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NtF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60777NtF extends AbstractC60629Nqr<OM1> implements InterfaceC60707Ns7 {
    public static final /* synthetic */ int LJLJLJ = 0;
    public final C60785NtN LJLJL = new C60785NtN(this);

    @Override // X.AbstractC60629Nqr
    public final void LIZJ() {
        this.LJLJI = "image";
        C60640Nr2 extendable = (C60640Nr2) LIZ();
        o.LJFF(extendable, "extendable");
        C60631Nqt.LIZ(extendable.getExtendableWebViewClient(), this.LJLJL);
    }

    public static boolean LJFF(O48 o48, O53 o532) {
        C39745Fin LIZ = C61300O4a.LIZ(o48.LIZIZ);
        if (LIZ == null) {
            return false;
        }
        String str = LIZ.LIZJ;
        o.LJFF(str, "mediaType.subtype()");
        o532.LJIIIZ = str;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LIZ.LIZIZ);
        LIZ2.append('/');
        LIZ2.append(LIZ.LIZJ);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (!o.LJ(LIZIZ, "image/heic") && !o.LJ(LIZIZ, "image/heif")) {
            return false;
        }
        return true;
    }
}
