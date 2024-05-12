package X;

import Y.AfS56S0200000_7;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H44 extends AbstractC43455H3r {
    public H45 LJFF;
    public C67996QmO LJI;
    public boolean LJII;
    public C73411SrX LJIIIIZZ;
    public long LJIIIZ = -1;
    public final long LJIIJ = C00F.LIZ(31744, 1000, "upload_parameter_optimize_timeout", true);

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.WAIT_UPLOAD_PARAMS;
    }

    @Override // X.AbstractC43456H3s
    public final void LIZIZ(Object info) {
        o.LJIIIZ(info, "info");
        if (this.LJFF == null && (info instanceof H5I)) {
            H45 h45 = new H45(info, false);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WaitUploadParamsTask: msg: ");
            LIZ.append(info);
            H78.LIZ(X1D.LIZIZ(LIZ));
            C67996QmO c67996QmO = this.LJI;
            if (c67996QmO != null) {
                LJIIJJI(h45, c67996QmO);
                this.LJI = null;
            } else {
                this.LJFF = h45;
            }
        }
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        DMMediaModel dMMediaModel;
        o.LJIIIZ(args, "args");
        this.LJIIIZ = System.currentTimeMillis();
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C43403H1r) next).LIZ;
                    if (H7R.LJJJJL(videoPublishEditModel) || (((dMMediaModel = videoPublishEditModel.creativeModel.dmMediaModel) != null && dMMediaModel.type == 0) || C00F.LIZ(31744, 0, "enable_upload_parameter_optimize", true) != 1)) {
                        LJIIJJI(new H45(true, 1), c67996QmO);
                        return;
                    }
                    H78.LIZ("WaitUploadParamsTask: begin");
                    H45 h45 = this.LJFF;
                    if (h45 != null) {
                        LJIIJJI(h45, c67996QmO);
                        return;
                    } else {
                        this.LJI = c67996QmO;
                        this.LJIIIIZZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(this.LJIIJ, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(new C73950T0o(EnumC169566l6.LJLIL)).LJJJJZI(new AfS56S0200000_7(this, c67996QmO, 7));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }

    public final void LJIIJJI(H45 h45, C67996QmO c67996QmO) {
        this.LJII = true;
        Object obj = h45.LIZ;
        if (!(obj instanceof H5I)) {
            obj = null;
        }
        c67996QmO.LJ(obj, h45.LIZIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WaitUploadParamsTask: task done, cost time: ");
        LIZ.append(System.currentTimeMillis() - this.LJIIIZ);
        H78.LIZ(X1D.LIZIZ(LIZ));
        C73411SrX c73411SrX = this.LJIIIIZZ;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            C73411SrX c73411SrX2 = this.LJIIIIZZ;
            if (c73411SrX2 != null) {
                c73411SrX2.dispose();
            }
            this.LJIIIIZZ = null;
        }
    }
}
