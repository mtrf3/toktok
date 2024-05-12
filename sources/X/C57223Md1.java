package X;

import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.o;

/* renamed from: X.Md1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57223Md1 implements C33Q {
    public final Music LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    public C57223Md1() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57223Md1)) {
            return false;
        }
        C57223Md1 c57223Md1 = (C57223Md1) obj;
        return o.LJ(this.LJLIL, c57223Md1.LJLIL) && this.LJLILLLLZI == c57223Md1.LJLILLLLZI && this.LJLJI == c57223Md1.LJLJI && this.LJLJJI == c57223Md1.LJLJJI && this.LJLJJL == c57223Md1.LJLJJL && this.LJLJJLL == c57223Md1.LJLJJLL && this.LJLJL == c57223Md1.LJLJL;
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
        boolean z2 = this.LJLJI;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LJLJJI;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.LJLJJL;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        boolean z5 = this.LJLJJLL;
        int i9 = z5;
        if (z5 != 0) {
            i9 = 1;
        }
        return ((i8 + i9) * 31) + (this.LJLJL ? 1 : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VideoMusicCoverState(music=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isAd=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isScheduleVideo=");
        LIZ.append(this.LJLJI);
        LIZ.append(", startMusicAnimation=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", startNotesAnimation=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", pauseNotesAnimation=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(", stopNotesAnimation=");
        return C48339Iy7.LIZJ(LIZ, this.LJLJL, ')', LIZ);
    }

    public /* synthetic */ C57223Md1(int i) {
        this(null, false, false, false, false, false, false);
    }

    public C57223Md1(Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.LJLIL = music;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = z5;
        this.LJLJL = z6;
    }

    public static C57223Md1 LIZ(C57223Md1 c57223Md1, Music music, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        boolean z6;
        boolean z7 = z5;
        boolean z8 = z4;
        boolean z9 = z3;
        boolean z10 = z2;
        Music music2 = music;
        boolean z11 = z;
        if ((i & 1) != 0) {
            music2 = c57223Md1.LJLIL;
        }
        if ((i & 2) != 0) {
            z11 = c57223Md1.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z10 = c57223Md1.LJLJI;
        }
        if ((i & 8) != 0) {
            z9 = c57223Md1.LJLJJI;
        }
        if ((i & 16) != 0) {
            z6 = c57223Md1.LJLJJL;
        } else {
            z6 = false;
        }
        if ((i & 32) != 0) {
            z8 = c57223Md1.LJLJJLL;
        }
        if ((i & 64) != 0) {
            z7 = c57223Md1.LJLJL;
        }
        c57223Md1.getClass();
        return new C57223Md1(music2, z11, z10, z9, z6, z8, z7);
    }
}
