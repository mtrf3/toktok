package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GQZ extends GQR {
    public final ActivityC45651qj LIZ;
    public final VideoPublishEditModel LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f7, code lost:
    
        if (r5 != null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1 A[LOOP:0: B:24:0x00ab->B:26:0x00b1, LOOP_END] */
    @Override // X.GQR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.AbstractC41508GQu> LIZ() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GQZ.LIZ():java.util.List");
    }

    @Override // X.GQR
    public final GQV LIZJ() {
        return GQV.DUET_CHAIN;
    }

    @Override // X.GQR
    public final void LIZLLL(List<AbstractC41508GQu> original) {
        o.LJIIIZ(original, "original");
        Iterator<AbstractC41508GQu> it = original.iterator();
        while (it.hasNext()) {
            AbstractC41508GQu next = it.next();
            if (next instanceof GR2) {
                it.remove();
                if (it.hasNext()) {
                    GQR.LJ(it.next());
                    return;
                }
                return;
            }
            if (!GQR.LIZIZ(next)) {
                return;
            }
        }
    }

    public GQZ(ActivityC45651qj activityC45651qj, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel);
        this.LIZ = activityC45651qj;
        this.LIZIZ = videoPublishEditModel;
    }
}
