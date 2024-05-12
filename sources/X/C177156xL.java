package X;

import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6xL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C177156xL {
    public final String LIZ;
    public final String LIZIZ;
    public List<? extends TextExtraStruct> LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public String LJI;
    public Integer LJII;
    public List<CommentEmojiSpan> LJIIIIZZ;

    public C177156xL() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C177156xL)) {
            return false;
        }
        C177156xL c177156xL = (C177156xL) obj;
        return o.LJ(this.LIZ, c177156xL.LIZ) && o.LJ(this.LIZIZ, c177156xL.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventTrackingBundle(fromLocation=");
        LIZ.append(this.LIZ);
        LIZ.append(", fromPage=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C177156xL(int i) {
        this("", "");
    }

    public C177156xL(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LJI = "";
        this.LJII = -1;
    }
}
