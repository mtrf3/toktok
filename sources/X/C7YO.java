package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7YO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7YO implements InterfaceC87283bg {
    public final Aweme LJLIL;
    public final Music LJLILLLLZI;
    public final List<MusicOwnerInfo> LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7YO)) {
            return false;
        }
        C7YO c7yo = (C7YO) obj;
        return o.LJ(this.LJLIL, c7yo.LJLIL) && o.LJ(this.LJLILLLLZI, c7yo.LJLILLLLZI) && o.LJ(this.LJLJI, c7yo.LJLJI) && o.LJ(this.LJLJJI, c7yo.LJLJJI) && o.LJ(this.LJLJJL, c7yo.LJLJJL) && this.LJLJJLL == c7yo.LJLJJLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        Aweme aweme = this.LJLIL;
        int i = 0;
        if (aweme == null) {
            hashCode = 0;
        } else {
            hashCode = aweme.hashCode();
        }
        int i2 = hashCode * 31;
        Music music = this.LJLILLLLZI;
        if (music != null) {
            i = music.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LJLJJL, C79062V1e.LJ(this.LJLJJI, AnonymousClass391.LIZIZ(this.LJLJI, (i2 + i) * 31, 31), 31), 31);
        boolean z = this.LJLJJLL;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        return LJ + i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ArtistProfileAssemHierarchyData(aweme=");
        LIZ.append(this.LJLIL);
        LIZ.append(", music=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", artistProfileList=");
        LIZ.append(this.LJLJI);
        LIZ.append(", enterType=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", enterMethod=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", showFollowButton=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJJLL, ')', LIZ);
    }

    public C7YO(Aweme aweme, Music music, List<MusicOwnerInfo> list, String enterType, String enterMethod, boolean z) {
        o.LJIIIZ(enterType, "enterType");
        o.LJIIIZ(enterMethod, "enterMethod");
        this.LJLIL = aweme;
        this.LJLILLLLZI = music;
        this.LJLJI = list;
        this.LJLJJI = enterType;
        this.LJLJJL = enterMethod;
        this.LJLJJLL = z;
    }
}
