package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A22 implements InterfaceC87283bg {
    public VideoPublishEditModel LJLIL;
    public boolean LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public String LJLJL;

    public A22() {
        this(null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A22)) {
            return false;
        }
        A22 a22 = (A22) obj;
        return o.LJ(this.LJLIL, a22.LJLIL) && this.LJLILLLLZI == a22.LJLILLLLZI && o.LJ(this.LJLJI, a22.LJLJI) && o.LJ(this.LJLJJI, a22.LJLJJI) && o.LJ(this.LJLJJL, a22.LJLJJL) && o.LJ(this.LJLJJLL, a22.LJLJJLL) && o.LJ(this.LJLJL, a22.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        if (videoPublishEditModel == null) {
            hashCode = 0;
        } else {
            hashCode = videoPublishEditModel.hashCode();
        }
        int i = hashCode * 31;
        boolean z = this.LJLILLLLZI;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return this.LJLJL.hashCode() + C79062V1e.LJ(this.LJLJJLL, C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, C79062V1e.LJ(this.LJLJI, (i + i2) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SeriesPostHierarchyData(editModel=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFromPublish=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", collectionId=");
        LIZ.append(this.LJLJI);
        LIZ.append(", collectionCoverUrl=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", collectionName=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", entryPoint=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public A22(VideoPublishEditModel videoPublishEditModel, int i) {
        String collectionId;
        String collectionCoverUrl;
        String collectionName;
        String entryPoint;
        videoPublishEditModel = (i & 1) != 0 ? null : videoPublishEditModel;
        if ((i & 4) != 0) {
            collectionId = "";
        } else {
            collectionId = null;
        }
        if ((i & 8) != 0) {
            collectionCoverUrl = "";
        } else {
            collectionCoverUrl = null;
        }
        if ((i & 16) != 0) {
            collectionName = "";
        } else {
            collectionName = null;
        }
        if ((i & 32) != 0) {
            entryPoint = "";
        } else {
            entryPoint = null;
        }
        String enterFrom = (i & 64) != 0 ? "" : null;
        o.LJIIIZ(collectionId, "collectionId");
        o.LJIIIZ(collectionCoverUrl, "collectionCoverUrl");
        o.LJIIIZ(collectionName, "collectionName");
        o.LJIIIZ(entryPoint, "entryPoint");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = false;
        this.LJLJI = collectionId;
        this.LJLJJI = collectionCoverUrl;
        this.LJLJJL = collectionName;
        this.LJLJJLL = entryPoint;
        this.LJLJL = enterFrom;
    }
}
