package X;

import android.content.res.AssetFileDescriptor;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.PlayModel;
import kotlin.jvm.internal.o;

/* renamed from: X.Sql, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73363Sql {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AssetFileDescriptor LIZLLL;
    public final PlayModel LJ;

    public C73363Sql() {
        this(null, null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73363Sql)) {
            return false;
        }
        C73363Sql c73363Sql = (C73363Sql) obj;
        return o.LJ(this.LIZ, c73363Sql.LIZ) && o.LJ(this.LIZIZ, c73363Sql.LIZIZ) && o.LJ(this.LIZJ, c73363Sql.LIZJ) && o.LJ(this.LIZLLL, c73363Sql.LIZLLL) && o.LJ(this.LJ, c73363Sql.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AssetFileDescriptor assetFileDescriptor = this.LIZLLL;
        int hashCode4 = (hashCode3 + (assetFileDescriptor != null ? assetFileDescriptor.hashCode() : 0)) * 31;
        PlayModel playModel = this.LJ;
        return hashCode4 + (playModel != null ? playModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlayerModel(playUrl=");
        LIZ.append(this.LIZ);
        LIZ.append(", localFilePath=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", cacheKey=");
        LIZ.append(this.LIZJ);
        LIZ.append(", assetFd=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C73363Sql(String str, String str2, PlayModel playModel, int i) {
        str = (i & 1) != 0 ? "" : str;
        str2 = (i & 2) != 0 ? null : str2;
        playModel = (i & 16) != 0 ? null : playModel;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = playModel;
    }
}
