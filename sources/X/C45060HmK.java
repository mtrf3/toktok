package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HmK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45060HmK {
    public final OSZ<Integer, C63A> LIZ;
    public final AutoCutThemeData LIZIZ;
    public final String LIZJ;
    public final List<AutoCutMediaModel> LIZLLL;
    public final CreativeInfo LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C45060HmK)) {
            return false;
        }
        C45060HmK c45060HmK = (C45060HmK) obj;
        return o.LJ(this.LIZ, c45060HmK.LIZ) && o.LJ(this.LIZIZ, c45060HmK.LIZIZ) && o.LJ(this.LIZJ, c45060HmK.LIZJ) && o.LJ(this.LIZLLL, c45060HmK.LIZLLL) && o.LJ(this.LJ, c45060HmK.LJ) && this.LJFF == c45060HmK.LJFF && o.LJ(this.LJI, c45060HmK.LJI) && o.LJ(this.LJII, c45060HmK.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31;
        String str = this.LIZJ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (this.LJ.hashCode() + AnonymousClass391.LIZIZ(this.LIZLLL, (hashCode3 + hashCode) * 31, 31)) * 31;
        boolean z = this.LJFF;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode4 + i2) * 31;
        String str2 = this.LJI;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i4 = (i3 + hashCode2) * 31;
        String str3 = this.LJII;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PreloadRequest(theme=");
        LIZ.append(this.LIZ);
        LIZ.append(", musicData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", taskId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mediaModelList=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", creativeInfo=");
        LIZ.append(this.LJ);
        LIZ.append(", ignoreCompress=");
        LIZ.append(this.LJFF);
        LIZ.append(", creationId=");
        LIZ.append(this.LJI);
        LIZ.append(", shootWay=");
        return q.LIZIZ(LIZ, this.LJII, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45060HmK(OSZ<Integer, ? extends C63A> osz, AutoCutThemeData autoCutThemeData, String str, List<AutoCutMediaModel> mediaModelList, CreativeInfo creativeInfo, boolean z, String str2, String str3) {
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.LIZ = osz;
        this.LIZIZ = autoCutThemeData;
        this.LIZJ = str;
        this.LIZLLL = mediaModelList;
        this.LJ = creativeInfo;
        this.LJFF = z;
        this.LJI = str2;
        this.LJII = str3;
    }
}
