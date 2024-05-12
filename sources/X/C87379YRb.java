package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.YRb, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87379YRb {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final YMS LJI;
    public final long LJII;
    public final int LJIIIIZZ;
    public final long LJIIIZ;
    public final int LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final int LJIILJJIL;
    public final int LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;
    public final boolean LJIJ;
    public final EnumC32070CiI LJIJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C87379YRb)) {
            return false;
        }
        C87379YRb c87379YRb = (C87379YRb) obj;
        return this.LIZ == c87379YRb.LIZ && this.LIZIZ == c87379YRb.LIZIZ && this.LIZJ == c87379YRb.LIZJ && o.LJ(this.LIZLLL, c87379YRb.LIZLLL) && o.LJ(this.LJ, c87379YRb.LJ) && o.LJ(this.LJFF, c87379YRb.LJFF) && o.LJ(this.LJI, c87379YRb.LJI) && this.LJII == c87379YRb.LJII && this.LJIIIIZZ == c87379YRb.LJIIIIZZ && this.LJIIIZ == c87379YRb.LJIIIZ && this.LJIIJ == c87379YRb.LJIIJ && this.LJIIJJI == c87379YRb.LJIIJJI && this.LJIIL == c87379YRb.LJIIL && this.LJIILIIL == c87379YRb.LJIILIIL && this.LJIILJJIL == c87379YRb.LJIILJJIL && this.LJIILL == c87379YRb.LJIILL && this.LJIILLIIL == c87379YRb.LJIILLIIL && this.LJIIZILJ == c87379YRb.LJIIZILJ && this.LJIJ == c87379YRb.LJIJ && this.LJIJI == c87379YRb.LJIJI;
    }

    public final String toString() {
        return "BasicConfig(duplicateSize=" + this.LIZ + ", enableFeatureMessage=" + this.LIZIZ + ", enableDirectDispatchP2pMsg=" + this.LIZJ + ", directDispatchAllowList=" + this.LIZLLL + ", byPassDispatchAllowList=" + this.LJ + ", directDispatchP2pBlockList=" + this.LJFF + ", uplinkConfig=" + this.LJI + ", dispatchMessageTimeout=" + this.LJII + ", dispatchStrategy=" + this.LJIIIIZZ + ", optwindowWindowTime=" + this.LJIIIZ + ", optwindowMinDispatchSize=" + this.LJIIJ + ", fixfreqDispatchInterval=" + this.LJIIJJI + ", fixfreqDispatchSize=" + this.LJIIL + ", fixfreqMaxQueueSize=" + this.LJIILIIL + ", dispatchLimitDuration=" + this.LJIILJJIL + ", dispatchDynamicDuration=" + this.LJIILL + ", enableDispatchListOptimize=" + this.LJIILLIIL + ", enableAsyncDispatch=" + this.LJIIZILJ + ", enableInactiveOpt=" + this.LJIJ + ", messageScene=" + this.LJIJI + ')';
    }

    public C87379YRb() {
        this(512, false, false, new ArrayList(), new ArrayList(), new ArrayList(), null, 10L, 0, 50L, 3, 50L, 8, -1, -1, 8, false, false, false, EnumC32070CiI.LIVE_ROOM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i = this.LIZ * 31;
        boolean z = this.LIZIZ;
        int i2 = 1;
        int i3 = z;
        if (z != 0) {
            i3 = 1;
        }
        int i4 = (i + i3) * 31;
        boolean z2 = this.LIZJ;
        int i5 = z2;
        if (z2 != 0) {
            i5 = 1;
        }
        int LIZIZ = AnonymousClass391.LIZIZ(this.LJFF, AnonymousClass391.LIZIZ(this.LJ, AnonymousClass391.LIZIZ(this.LIZLLL, (i4 + i5) * 31, 31), 31), 31);
        YMS yms = this.LJI;
        if (yms == null) {
            hashCode = 0;
        } else {
            hashCode = yms.hashCode();
        }
        int LIZJ = (((((((JBR.LIZJ(this.LJIIJJI, (JBR.LIZJ(this.LJIIIZ, (JBR.LIZJ(this.LJII, (LIZIZ + hashCode) * 31, 31) + this.LJIIIIZZ) * 31, 31) + this.LJIIJ) * 31, 31) + this.LJIIL) * 31) + this.LJIILIIL) * 31) + this.LJIILJJIL) * 31) + this.LJIILL) * 31;
        boolean z3 = this.LJIILLIIL;
        int i6 = z3;
        if (z3 != 0) {
            i6 = 1;
        }
        int i7 = (LIZJ + i6) * 31;
        boolean z4 = this.LJIIZILJ;
        int i8 = z4;
        if (z4 != 0) {
            i8 = 1;
        }
        int i9 = (i7 + i8) * 31;
        if (!this.LJIJ) {
            i2 = 0;
        }
        return this.LJIJI.hashCode() + ((i9 + i2) * 31);
    }

    public C87379YRb(int i, boolean z, boolean z2, List<String> directDispatchAllowList, List<String> byPassDispatchAllowList, List<String> directDispatchP2pBlockList, YMS yms, long j, int i2, long j2, int i3, long j3, int i4, int i5, int i6, int i7, boolean z3, boolean z4, boolean z5, EnumC32070CiI messageScene) {
        o.LJIIIZ(directDispatchAllowList, "directDispatchAllowList");
        o.LJIIIZ(byPassDispatchAllowList, "byPassDispatchAllowList");
        o.LJIIIZ(directDispatchP2pBlockList, "directDispatchP2pBlockList");
        o.LJIIIZ(messageScene, "messageScene");
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = directDispatchAllowList;
        this.LJ = byPassDispatchAllowList;
        this.LJFF = directDispatchP2pBlockList;
        this.LJI = yms;
        this.LJII = j;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = j2;
        this.LJIIJ = i3;
        this.LJIIJJI = j3;
        this.LJIIL = i4;
        this.LJIILIIL = i5;
        this.LJIILJJIL = i6;
        this.LJIILL = i7;
        this.LJIILLIIL = z3;
        this.LJIIZILJ = z4;
        this.LJIJ = z5;
        this.LJIJI = messageScene;
    }
}
