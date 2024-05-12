package X;

import com.ss.android.ugc.aweme.music.model.PinnedMusicList;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9c0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C240369c0 implements InterfaceC198557ql {
    public final String LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C43I<Boolean> LJFF;
    public final PinnedMusicList LJI;
    public final List<Long> LJII;
    public final String LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C240369c0)) {
            return false;
        }
        C240369c0 c240369c0 = (C240369c0) obj;
        return o.LJ(this.LIZ, c240369c0.LIZ) && o.LJ(this.LIZIZ, c240369c0.LIZIZ) && this.LIZJ == c240369c0.LIZJ && this.LIZLLL == c240369c0.LIZLLL && this.LJ == c240369c0.LJ && o.LJ(this.LJFF, c240369c0.LJFF) && o.LJ(this.LJI, c240369c0.LJI) && o.LJ(this.LJII, c240369c0.LJII) && o.LJ(this.LJIIIIZZ, c240369c0.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.LIZJ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.LIZLLL;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (((i2 + i3) * 31) + (this.LJ ? 1 : 0)) * 31;
        C43I<Boolean> c43i = this.LJFF;
        int hashCode3 = (i4 + (c43i == null ? 0 : c43i.hashCode())) * 31;
        PinnedMusicList pinnedMusicList = this.LJI;
        int hashCode4 = (hashCode3 + (pinnedMusicList == null ? 0 : pinnedMusicList.hashCode())) * 31;
        List<Long> list = this.LJII;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginMusicCommonData(userId=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUserId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", isMe=");
        LIZ.append(this.LIZJ);
        LIZ.append(", canPin=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", fromSearch=");
        LIZ.append(this.LJ);
        LIZ.append(", onVisibleChanged=");
        LIZ.append(this.LJFF);
        LIZ.append(", pinnedMusicList=");
        LIZ.append(this.LJI);
        LIZ.append(", newReleaseIds=");
        LIZ.append(this.LJII);
        LIZ.append(", originalHighlightedMusicId=");
        return q.LIZIZ(LIZ, this.LJIIIIZZ, ')', LIZ);
    }

    public static C240369c0 LIZ(C240369c0 c240369c0, String str, String str2, C43I c43i, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        PinnedMusicList pinnedMusicList;
        List<Long> list;
        C43I c43i2 = c43i;
        String str3 = str;
        String str4 = str2;
        if ((i & 1) != 0) {
            str3 = c240369c0.LIZ;
        }
        if ((i & 2) != 0) {
            str4 = c240369c0.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c240369c0.LIZJ;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = c240369c0.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = c240369c0.LJ;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            c43i2 = c240369c0.LJFF;
        }
        String str5 = null;
        if ((i & 64) != 0) {
            pinnedMusicList = c240369c0.LJI;
        } else {
            pinnedMusicList = null;
        }
        if ((i & 128) != 0) {
            list = c240369c0.LJII;
        } else {
            list = null;
        }
        if ((i & 256) != 0) {
            str5 = c240369c0.LJIIIIZZ;
        }
        c240369c0.getClass();
        return new C240369c0(str3, str4, z, z2, z3, (C43I<Boolean>) c43i2, pinnedMusicList, list, str5);
    }

    public /* synthetic */ C240369c0(String str, String str2, boolean z, boolean z2, boolean z3, PinnedMusicList pinnedMusicList, List list, String str3, int i) {
        this(str, str2, z, z2, z3, (C43I<Boolean>) null, (i & 64) != 0 ? null : pinnedMusicList, (List<Long>) ((i & 128) != 0 ? null : list), (i & 256) != 0 ? null : str3);
    }

    public C240369c0(String str, String str2, boolean z, boolean z2, boolean z3, C43I<Boolean> c43i, PinnedMusicList pinnedMusicList, List<Long> list, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = c43i;
        this.LJI = pinnedMusicList;
        this.LJII = list;
        this.LJIIIIZZ = str3;
    }
}
