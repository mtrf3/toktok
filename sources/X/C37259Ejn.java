package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.Ejn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37259Ejn extends AbstractC43455H3r {
    public final VideoPublishEditModel LJFF;
    public final Context LJI;
    public final C37260Ejo LJII;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.VE_CODEC_DOWNLOAD;
    }

    public C37259Ejn(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LJFF = model;
        this.LJI = C16880lQ.LLLLJI(C60903NvH.LJ);
        this.LJII = new C37260Ejo();
    }

    public final void LJIIJJI(C67996QmO c67996QmO) {
        try {
            C16880lQ.LLJJJIL("bytevc1enc10b");
            C16880lQ.LLJJJIL("vebytevc1enc10bwrapper");
            H78.LIZ("VECodecDownloadTask -> VECodec loadLibrary: libbytevc1enc10b.so and libvebytevc1enc10bwrapper Success");
            this.LJFF.creativeModel.hdrModel.veCodecIsReady = true;
            c67996QmO.LJ(null, true);
        } catch (Throwable th) {
            this.LJFF.creativeModel.hdrModel.veCodecIsReady = false;
            c67996QmO.LJ(null, true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VECodecDownloadTask -> VECodec loadLibrary: libbytevc1enc10b.so and libvebytevc1enc10bwrapper failed, error: ");
            LIZ.append(th.getMessage());
            LIZ.append(", cause = ");
            LIZ.append(th.getCause());
            H78.LIZJ(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        o.LJIIIZ(args, "args");
        if (!e1.LIZ(31744, "studio_enable_HDR_full_link", true, false) || !H7R.LJJJJJ(this.LJFF.creativeModel.hdrModel)) {
            H78.LIZ("VECodecDownloadTask -> don't need to download vecodec");
            c67996QmO.LJ(null, true);
            return;
        }
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        try {
            if (LIZLLL.checkPluginInstalled("com.ss.android.ugc.ve.codec")) {
                H78.LIZ("VECodecDownloadTask -> VECodec Plugin has been installed");
                if (LIZLLL.LIZJ() != null) {
                    C39647FhD.LIZLLL(this.LJI);
                    LJIIJJI(c67996QmO);
                    return;
                }
                return;
            }
            H78.LIZ("VECodecDownloadTask -> start install");
            C37132Ehk c37132Ehk = new C37132Ehk();
            c37132Ehk.LIZIZ = false;
            c37132Ehk.LIZ = "com.ss.android.ugc.ve.codec";
            F5Q f5q = new F5Q();
            f5q.LIZIZ = false;
            f5q.LIZJ = false;
            f5q.LIZLLL = false;
            f5q.LJIIIIZZ = false;
            f5q.LJIIIZ = this.LJII;
            c37132Ehk.LJ = new F5R(f5q);
            c37132Ehk.LIZLLL = new C37258Ejm(LIZLLL, c67996QmO, this);
            LIZLLL.LIZ(new C37131Ehj(c37132Ehk));
        } catch (Throwable th) {
            c67996QmO.LJ(null, true);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("VECodecDownloadTask -> VECodecPluginInstallTask run failed ");
            LIZ.append(th.getMessage());
            H78.LIZJ(X1D.LIZIZ(LIZ));
        }
    }
}
