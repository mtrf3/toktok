package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.GfR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42085GfR extends AbstractC43455H3r {
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C42086GfS.LJLIL);

    @Override // X.AbstractC43455H3r
    public final H1T LJIIIZ() {
        return H1T.QUICK_FORWARD_RES_RESTORE;
    }

    @Override // X.AbstractC43455H3r
    public final void LJI(ERR args, C67996QmO c67996QmO) {
        Object obj;
        o.LJIIIZ(args, "args");
        Iterator<Object> it = args.LIZ.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                break;
            } else {
                obj = it.next();
            }
        } while (!(obj instanceof AbstractC42364Gjw));
        if ((obj instanceof AbstractC42364Gjw) && obj != null && (obj instanceof C42363Gjv)) {
            c67996QmO.LIZIZ(new C43393H1h("QuickForwardResRestoreTask", "cloud merge success,fast finished."), EnumC43531H6p.OUTER);
            c67996QmO.LJ(C76800UCe.LIZ, false);
            return;
        }
        Iterator<Object> it2 = args.LIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (next instanceof C43403H1r) {
                if (next != null) {
                    VideoPublishEditModel videoPublishEditModel = ((C43403H1r) next).LIZ;
                    C169656lF.LIZJ(videoPublishEditModel.canvasVideoData, videoPublishEditModel.nleData, new C42084GfQ(c67996QmO, videoPublishEditModel, this));
                    return;
                }
            }
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.wavepublish.model.EditModelContainer");
    }
}
