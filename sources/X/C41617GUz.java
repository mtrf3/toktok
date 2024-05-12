package X;

/* renamed from: X.GUz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41617GUz extends C163356b5 {
    public final /* synthetic */ GUV LJLIL;
    public final /* synthetic */ GV1 LJLILLLLZI;

    @Override // X.C163356b5, X.InterfaceC42472Glg
    public final void onAppBackground() {
        if (this.LJLIL.LIZ.LJLJJL.LIZ.publishType != 0) {
            return;
        }
        GV1 gv1 = this.LJLILLLLZI;
        gv1.getClass();
        if (C19N.LJ("studio_fix_publish_service_start_crash", false)) {
            GUV guv = gv1.LJLJJI;
            guv.getClass();
            try {
                C41730GZi.LIZIZ(guv.LIZ.LJLJJL.LIZIZ);
            } catch (Exception unused) {
            }
        } else {
            C41730GZi.LIZIZ(gv1.LJLJJI.LIZ.LJLJJL.LIZIZ);
        }
        this.LJLIL.LIZ(true);
    }

    public C41617GUz(GUV guv, GV1 gv1) {
        this.LJLIL = guv;
        this.LJLILLLLZI = gv1;
    }
}
