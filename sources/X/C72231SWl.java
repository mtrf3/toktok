package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.SWl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72231SWl implements C33Q {
    public final Music LJLIL;
    public final boolean LJLILLLLZI;
    public final AwemeRawAd LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final Boolean LJLJL;

    public C72231SWl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72231SWl)) {
            return false;
        }
        C72231SWl c72231SWl = (C72231SWl) obj;
        return o.LJ(this.LJLIL, c72231SWl.LJLIL) && this.LJLILLLLZI == c72231SWl.LJLILLLLZI && o.LJ(this.LJLJI, c72231SWl.LJLJI) && this.LJLJJI == c72231SWl.LJLJJI && this.LJLJJL == c72231SWl.LJLJJL && this.LJLJJLL == c72231SWl.LJLJJLL && o.LJ(this.LJLJL, c72231SWl.LJLJL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        Music music = this.LJLIL;
        int hashCode = (music == null ? 0 : music.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        AwemeRawAd awemeRawAd = this.LJLJI;
        int hashCode2 = (i2 + (awemeRawAd == null ? 0 : awemeRawAd.hashCode())) * 31;
        boolean z2 = this.LJLJJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (hashCode2 + i3) * 31;
        boolean z3 = this.LJLJJL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (((i4 + i5) * 31) + (this.LJLJJLL ? 1 : 0)) * 31;
        Boolean bool = this.LJLJL;
        return i6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoMusicTitleState(music=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isScheduleVideo=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", awemeRawAd=");
        LIZ.append(this.LJLJI);
        LIZ.append(", startMusicAnimation=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", pauseNotesAnimation=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", stopNotesAnimation=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", showAddSongIcon=");
        return C78920UyC.LIZIZ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C72231SWl(int i) {
        this(null, false, null, false, false, false, null);
    }

    public C72231SWl(Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4, Boolean bool) {
        this.LJLIL = music;
        this.LJLILLLLZI = z;
        this.LJLJI = awemeRawAd;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
        this.LJLJL = bool;
    }

    public static C72231SWl LIZ(C72231SWl c72231SWl, Music music, boolean z, AwemeRawAd awemeRawAd, boolean z2, boolean z3, boolean z4, Boolean bool, int i) {
        Boolean bool2 = bool;
        boolean z5 = z;
        Music music2 = music;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        boolean z6 = z2;
        boolean z7 = z3;
        boolean z8 = z4;
        if ((i & 1) != 0) {
            music2 = c72231SWl.LJLIL;
        }
        if ((i & 2) != 0) {
            z5 = c72231SWl.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            awemeRawAd2 = c72231SWl.LJLJI;
        }
        if ((i & 8) != 0) {
            z6 = c72231SWl.LJLJJI;
        }
        if ((i & 16) != 0) {
            z7 = c72231SWl.LJLJJL;
        }
        if ((i & 32) != 0) {
            z8 = c72231SWl.LJLJJLL;
        }
        if ((i & 64) != 0) {
            bool2 = c72231SWl.LJLJL;
        }
        c72231SWl.getClass();
        return new C72231SWl(music2, z5, awemeRawAd2, z6, z7, z8, bool2);
    }
}
