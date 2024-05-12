package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import defpackage.q;
import java.util.List;
import java.util.Objects;

/* renamed from: X.MOz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56749MOz extends MusNotice {
    public final List<UrlModel> LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.LIZ, Boolean.valueOf(this.LIZIZ));
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecommendLiveNotice(avatarList=");
        LIZ.append(this.LIZ);
        LIZ.append(", enable=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", requestId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    @Override // com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56749MOz)) {
            return false;
        }
        C56749MOz c56749MOz = (C56749MOz) obj;
        if (this.type == c56749MOz.type && Objects.equals(this.LIZ, c56749MOz.LIZ) && this.LIZIZ == c56749MOz.LIZIZ) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C56749MOz(List<? extends UrlModel> list, boolean z, String str) {
        super(true);
        this.LIZ = list;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.type = 50;
        this.nid = String.valueOf(hashCode());
        this.createTime = 9223372036854775806L;
    }
}
