package X;

import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.8Iz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209218Iz implements C33Q {
    public final C206898Ab LJLIL;
    public final VideoMaskInfo LJLILLLLZI;

    public C209218Iz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C209218Iz)) {
            return false;
        }
        C209218Iz c209218Iz = (C209218Iz) obj;
        return o.LJ(this.LJLIL, c209218Iz.LJLIL) && o.LJ(this.LJLILLLLZI, c209218Iz.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        VideoMaskInfo videoMaskInfo = this.LJLILLLLZI;
        return hashCode + (videoMaskInfo == null ? 0 : videoMaskInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContentClassificationMaskState(showContentClassificationMask=");
        LIZ.append(this.LJLIL);
        LIZ.append(", contentClassificationMaskInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C209218Iz(int i) {
        this(new C206898Ab(false), null);
    }

    public C209218Iz(C206898Ab showContentClassificationMask, VideoMaskInfo videoMaskInfo) {
        o.LJIIIZ(showContentClassificationMask, "showContentClassificationMask");
        this.LJLIL = showContentClassificationMask;
        this.LJLILLLLZI = videoMaskInfo;
    }
}
