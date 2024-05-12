package X;

import com.bytedance.android.livesdk.model.message.QuickChatContent;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CJW {
    public static final /* synthetic */ int LJFF = 0;
    public final List<QuickChatContent> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CJW)) {
            return false;
        }
        CJW cjw = (CJW) obj;
        return o.LJ(this.LIZ, cjw.LIZ) && this.LIZIZ == cjw.LIZIZ && this.LIZJ == cjw.LIZJ && o.LJ(this.LIZLLL, cjw.LIZLLL) && this.LJ == cjw.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        List<QuickChatContent> list = this.LIZ;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZLLL, JBR.LIZJ(this.LIZJ, JBR.LIZJ(this.LIZIZ, hashCode * 31, 31), 31), 31);
        boolean z = this.LJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuickCommentModel(contentList=");
        LIZ.append(this.LIZ);
        LIZ.append(", duration=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", priority=");
        LIZ.append(this.LIZJ);
        LIZ.append(", scene=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", hasEmote=");
        return C48339Iy7.LIZJ(LIZ, this.LJ, ')', LIZ);
    }

    public CJW(List list, long j, boolean z, long j2, String str) {
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = z;
    }
}
