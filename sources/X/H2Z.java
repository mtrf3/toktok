package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEWatermarkParam;
import djb.IDaS68S0100000_7;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes8.dex */
public final class H2Z extends AbstractC43455H3r {
    public VideoPublishEditModel LJFF;
    public C67996QmO LJI;
    public InterfaceC43387H1b LJII;

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.ADD_EFFECT_WATERMARK;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    this.LJFF = ((C43403H1r) next).LIZ;
                    this.LJI = c67996QmO;
                    Iterator<Object> it2 = args.LIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next2 = it2.next();
                        if (next2 instanceof InterfaceC43387H1b) {
                            if (next2 != null) {
                                this.LJII = (InterfaceC43387H1b) next2;
                                VideoPublishEditModel videoPublishEditModel = this.LJFF;
                                if (videoPublishEditModel != null) {
                                    C142365iK c142365iK = new C142365iK(C44526Hdi.LJ(videoPublishEditModel, new VEWatermarkParam()), videoPublishEditModel, this);
                                    XKX.LIZLLL(C48841JEv.LIZ(C150985wE.LIZIZ.plus(new IDaS68S0100000_7(CoroutineExceptionHandler.LJJJJIZL, this, 0))), null, null, new H43(this, c142365iK, null), 3);
                                    return;
                                }
                                o.LJIJI("editModel");
                                throw null;
                            }
                        }
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.publisherbuilder.ITaskExternalDependencyFactory");
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
