package X;

import androidx.compose.runtime.ParcelableSnapshotMutableState;

/* renamed from: X.0sv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21530sv {
    public final ParcelableSnapshotMutableState LIZ;
    public final ParcelableSnapshotMutableState LIZIZ;
    public final ParcelableSnapshotMutableState LIZJ;
    public final ParcelableSnapshotMutableState LIZLLL;
    public final ParcelableSnapshotMutableState LJ;
    public final ParcelableSnapshotMutableState LJFF;
    public final ParcelableSnapshotMutableState LJI;
    public final ParcelableSnapshotMutableState LJII;
    public final ParcelableSnapshotMutableState LJIIIIZZ;
    public final ParcelableSnapshotMutableState LJIIIZ;
    public final ParcelableSnapshotMutableState LJIIJ;
    public final ParcelableSnapshotMutableState LJIIJJI;
    public final ParcelableSnapshotMutableState LJIIL;

    /* JADX WARN: Multi-variable type inference failed */
    public final long LIZ() {
        return ((C11850dJ) this.LJ.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LIZIZ() {
        return ((C11850dJ) this.LJI.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LIZJ() {
        return ((C11850dJ) this.LJII.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LIZLLL() {
        return ((C11850dJ) this.LJIIIIZZ.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJ() {
        return ((C11850dJ) this.LJIIJ.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJFF() {
        return ((C11850dJ) this.LIZ.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LJI() {
        return ((C11850dJ) this.LJFF.getValue()).LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJII() {
        return ((Boolean) this.LJIIL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Colors(primary=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LJFF()));
        sb.append(", primaryVariant=");
        C78920UyC.LJ(((C11850dJ) this.LIZIZ.getValue()).LIZ, sb, ", secondary=");
        C78920UyC.LJ(((C11850dJ) this.LIZJ.getValue()).LIZ, sb, ", secondaryVariant=");
        sb.append((Object) C11850dJ.LJIIIIZZ(((C11850dJ) this.LIZLLL.getValue()).LIZ));
        sb.append(", background=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZ()));
        sb.append(", surface=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LJI()));
        sb.append(", error=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZIZ()));
        sb.append(", onPrimary=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZJ()));
        sb.append(", onSecondary=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LIZLLL()));
        sb.append(", onBackground=");
        sb.append((Object) C11850dJ.LJIIIIZZ(((C11850dJ) this.LJIIIZ.getValue()).LIZ));
        sb.append(", onSurface=");
        sb.append((Object) C11850dJ.LJIIIIZZ(LJ()));
        sb.append(", onError=");
        sb.append((Object) C11850dJ.LJIIIIZZ(((C11850dJ) this.LJIIJJI.getValue()).LIZ));
        sb.append(", isLight=");
        sb.append(LJII());
        sb.append(')');
        return sb.toString();
    }

    public C21530sv(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, boolean z) {
        C11850dJ c11850dJ = new C11850dJ(j);
        C36041bE c36041bE = C36041bE.LIZ;
        this.LIZ = C78966Uyw.LJJJI(c11850dJ, c36041bE);
        this.LIZIZ = C06530Nl.LIZ(j2, c36041bE);
        this.LIZJ = C06530Nl.LIZ(j3, c36041bE);
        this.LIZLLL = C06530Nl.LIZ(j4, c36041bE);
        this.LJ = C06530Nl.LIZ(j5, c36041bE);
        this.LJFF = C06530Nl.LIZ(j6, c36041bE);
        this.LJI = C06530Nl.LIZ(j7, c36041bE);
        this.LJII = C06530Nl.LIZ(j8, c36041bE);
        this.LJIIIIZZ = C06530Nl.LIZ(j9, c36041bE);
        this.LJIIIZ = C06530Nl.LIZ(j10, c36041bE);
        this.LJIIJ = C06530Nl.LIZ(j11, c36041bE);
        this.LJIIJJI = C06530Nl.LIZ(j12, c36041bE);
        this.LJIIL = C78966Uyw.LJJJI(Boolean.valueOf(z), c36041bE);
    }
}
