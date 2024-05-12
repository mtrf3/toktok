package X;

import Y.ACallableS110S0100000_7;
import Y.ARunnableS43S0100000_7;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* renamed from: X.H2t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43431H2t implements InterfaceC134045Nw {
    public final /* synthetic */ H2Z LIZ;
    public final /* synthetic */ C133765Mu LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ VideoPublishEditModel LIZLLL;
    public final /* synthetic */ String LJ;

    @Override // X.InterfaceC134045Nw
    public final void onCompileDone() {
        if (this.LIZJ) {
            C39579Fg7.LJIL(this.LIZLLL.getLocalTempPath());
            C39579Fg7.LIZLLL(this.LJ, this.LIZLLL.getLocalTempPath());
        }
        InterfaceC43387H1b interfaceC43387H1b = this.LIZ.LJII;
        if (interfaceC43387H1b != null) {
            interfaceC43387H1b.LIZLLL().LIZJ();
            C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(this.LIZIZ, 96), 37));
            C67996QmO c67996QmO = this.LIZ.LJI;
            if (c67996QmO == null) {
                o.LJIJI("nodeCallback");
                throw null;
            }
            c67996QmO.LIZIZ(new C43393H1h("effect-watermark", "video compile success"), EnumC43531H6p.OUTER);
            C67996QmO c67996QmO2 = this.LIZ.LJI;
            if (c67996QmO2 != null) {
                c67996QmO2.LJ(null, false);
                return;
            } else {
                o.LJIJI("nodeCallback");
                throw null;
            }
        }
        o.LJIJI("dependency");
        throw null;
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileProgress(float f) {
        C60903NvH.LJIIJJI().LJJIIJ();
    }

    @Override // X.InterfaceC134045Nw
    public final void onCompileError(int i, int i2, float f, String str) {
        StringBuilder LIZJ = C06460Ne.LIZJ("error: ", i, ", ext=", i2, ", f=");
        LIZJ.append(f);
        LIZJ.append(", msg=");
        LIZJ.append(str);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        C162486Zg c162486Zg = new C162486Zg(LIZIZ);
        C67996QmO c67996QmO = this.LIZ.LJI;
        if (c67996QmO != null) {
            C41819Gb9 c41819Gb9 = new C41819Gb9(c162486Zg.getMessage(), c162486Zg);
            c41819Gb9.setErrorCode(i);
            c67996QmO.LIZLLL(i, c41819Gb9);
            C67996QmO c67996QmO2 = this.LIZ.LJI;
            if (c67996QmO2 != null) {
                c67996QmO2.LIZIZ(new C43393H1h("effect-watermark", i0.LJFF("watermark video compile error, reason: ", LIZIZ)), EnumC43531H6p.OUTER);
                InterfaceC43387H1b interfaceC43387H1b = this.LIZ.LJII;
                if (interfaceC43387H1b != null) {
                    interfaceC43387H1b.LIZLLL().LIZJ();
                    C10K.LIZJ(new ACallableS110S0100000_7((Runnable) new ARunnableS43S0100000_7(this.LIZIZ, 97), 37));
                    return;
                } else {
                    o.LJIJI("dependency");
                    throw null;
                }
            }
            o.LJIJI("nodeCallback");
            throw null;
        }
        o.LJIJI("nodeCallback");
        throw null;
    }

    public C43431H2t(H2Z h2z, C133765Mu c133765Mu, boolean z, VideoPublishEditModel videoPublishEditModel, String str) {
        this.LIZ = h2z;
        this.LIZIZ = c133765Mu;
        this.LIZJ = z;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = str;
    }
}
