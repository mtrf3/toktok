package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.tools.ToolsUrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.V4t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C79155V4t {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final ToolsUrlModel LJFF;
    public final List<String> LJI;
    public final String LJII;
    public final android.net.Uri LJIIIIZZ;
    public final String LJIIIZ;

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZJ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJ;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ToolsUrlModel toolsUrlModel = this.LJFF;
        int hashCode5 = (hashCode4 + (toolsUrlModel != null ? toolsUrlModel.hashCode() : 0)) * 31;
        List<String> list = this.LJI;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str5 = this.LJII;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        android.net.Uri uri = this.LJIIIIZZ;
        int hashCode8 = (hashCode7 + (uri != null ? uri.hashCode() : 0)) * 31;
        String str6 = this.LJIIIZ;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FilterMeta(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", resId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZJ);
        LIZ.append(", category=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", enName=");
        LIZ.append(this.LJ);
        LIZ.append(", resource=");
        LIZ.append(this.LJFF);
        LIZ.append(", tags=");
        LIZ.append(this.LJI);
        LIZ.append(", tagsUpdatedAt=");
        LIZ.append(this.LJII);
        LIZ.append(", thumbnail=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", extra=");
        return JBR.LJFF(LIZ, this.LJIIIZ, ")", LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C79155V4t)) {
            return false;
        }
        C79155V4t c79155V4t = (C79155V4t) obj;
        if (this.LIZ == c79155V4t.LIZ && TextUtils.equals(this.LIZLLL, c79155V4t.LIZLLL)) {
            return true;
        }
        return false;
    }

    public C79155V4t(int i, String resId, String name, String category, String str, ToolsUrlModel toolsUrlModel, List<String> tags, String str2, android.net.Uri uri, String str3) {
        o.LJIIIZ(resId, "resId");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(tags, "tags");
        this.LIZ = i;
        this.LIZIZ = resId;
        this.LIZJ = name;
        this.LIZLLL = category;
        this.LJ = str;
        this.LJFF = toolsUrlModel;
        this.LJI = tags;
        this.LJII = str2;
        this.LJIIIIZZ = uri;
        this.LJIIIZ = str3;
    }
}
