package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.Iterator;

/* renamed from: X.Gvl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43097Gvl extends AbstractC43106Gvu {
    public final long LIZ() {
        C43068GvI LIZIZ = C1DG.LJFF().LIZIZ(this.LIZ);
        C43099Gvn c43099Gvn = new C43099Gvn(null, null, 3);
        Iterator<T> it = LIZIZ.iterator();
        long j = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            C39532FfM c39532FfM = new C39532FfM(3);
            c39532FfM.LIZ(c43099Gvn);
            if (str != null) {
                c39532FfM.LIZLLL(C60903NvH.LJIIJJI().LJJIJL().getFileProvider().LIZJ(str));
            }
            j += c43099Gvn.LIZJ;
            c43099Gvn.LIZJ = 0L;
        }
        return j;
    }

    public C43097Gvl(AwemeDraft awemeDraft) {
        super(awemeDraft);
    }
}
