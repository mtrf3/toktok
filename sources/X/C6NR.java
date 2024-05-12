package X;

import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6NR, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NR {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public final EditPreviewInfo LIZ(List<? extends EditVideoSegment> list) {
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(new ArrayList(), this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        if (!list.isEmpty()) {
            editPreviewInfo.getVideoList().addAll(list);
            return editPreviewInfo;
        }
        throw new IllegalArgumentException("segments must not be NullOrEmpty");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C6NR(int r9, int r10, int r11) {
        /*
            r8 = this;
            r6 = r10
            r5 = r9
            r0 = r11 & 1
            if (r0 == 0) goto L7
            r5 = 0
        L7:
            r0 = r11 & 2
            if (r0 == 0) goto Lc
            r6 = 0
        Lc:
            r1 = 0
            r0 = r11 & 16
            if (r0 == 0) goto L1a
            java.lang.String r7 = ""
        L14:
            r0 = r8
            r3 = r1
            r0.<init>(r1, r3, r5, r6, r7)
            return
        L1a:
            r7 = 0
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6NR.<init>(int, int, int):void");
    }

    public C6NR(long j, long j2, int i, int i2, String draftDir) {
        o.LJIIIZ(draftDir, "draftDir");
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = draftDir;
    }
}
