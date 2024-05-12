package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;

/* renamed from: X.5tq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149505tq {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final EditPreviewInfo LIZ(EditVideoSegment editVideoSegment) {
        return new EditPreviewInfo(C47261Igj.LJJIJIL(editVideoSegment), this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, "");
    }

    public C149505tq(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
    }
}
