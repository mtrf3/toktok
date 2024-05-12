package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Cz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105734Cz {
    public final NaviStatusCode LIZ;
    public final LinkedHashMap<Resources, List<Emoji>> LIZIZ;

    public C105734Cz() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C105734Cz)) {
            return false;
        }
        C105734Cz c105734Cz = (C105734Cz) obj;
        return this.LIZ == c105734Cz.LIZ && o.LJ(this.LIZIZ, c105734Cz.LIZIZ);
    }

    public final int hashCode() {
        NaviStatusCode naviStatusCode = this.LIZ;
        int hashCode = (naviStatusCode == null ? 0 : naviStatusCode.hashCode()) * 31;
        LinkedHashMap<Resources, List<Emoji>> linkedHashMap = this.LIZIZ;
        return hashCode + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EmojiData(naviStatusCode=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C105734Cz(NaviStatusCode naviStatusCode, LinkedHashMap<Resources, List<Emoji>> linkedHashMap) {
        this.LIZ = naviStatusCode;
        this.LIZIZ = linkedHashMap;
    }
}
