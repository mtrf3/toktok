package X;

import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ir, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209138Ir implements C33Q {
    public final C206898Ab LJLIL;
    public final VideoMaskInfo LJLILLLLZI;

    public C209138Ir() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C209138Ir)) {
            return false;
        }
        C209138Ir c209138Ir = (C209138Ir) obj;
        return o.LJ(this.LJLIL, c209138Ir.LJLIL) && o.LJ(this.LJLILLLLZI, c209138Ir.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        VideoMaskInfo videoMaskInfo = this.LJLILLLLZI;
        return hashCode + (videoMaskInfo == null ? 0 : videoMaskInfo.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("GeneralVideoMaskState(showGeneralMask=");
        LIZ.append(this.LJLIL);
        LIZ.append(", generalMaskInfo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C209138Ir(int i) {
        this(new C206898Ab(false), null);
    }

    public C209138Ir(C206898Ab showGeneralMask, VideoMaskInfo videoMaskInfo) {
        o.LJIIIZ(showGeneralMask, "showGeneralMask");
        this.LJLIL = showGeneralMask;
        this.LJLILLLLZI = videoMaskInfo;
    }
}
