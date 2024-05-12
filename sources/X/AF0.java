package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AF0 {
    public final List<ContentLanguage> LIZ;
    public final List<ContentLanguage> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AF0)) {
            return false;
        }
        AF0 af0 = (AF0) obj;
        return o.LJ(this.LIZ, af0.LIZ) && o.LJ(this.LIZIZ, af0.LIZIZ);
    }

    public final int hashCode() {
        List<ContentLanguage> list = this.LIZ;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ContentLanguage> list2 = this.LIZIZ;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentLanguageResult(selected=");
        LIZ.append(this.LIZ);
        LIZ.append(", unselect=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AF0(List<? extends ContentLanguage> list, List<? extends ContentLanguage> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
