package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Wdm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82750Wdm {
    public final EnumC82774WeA LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final C08630Vn<Boolean> LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final C08630Vn<C76800UCe> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C82750Wdm)) {
            return false;
        }
        C82750Wdm c82750Wdm = (C82750Wdm) obj;
        return this.LIZ == c82750Wdm.LIZ && this.LIZIZ == c82750Wdm.LIZIZ && this.LIZJ == c82750Wdm.LIZJ && this.LIZLLL == c82750Wdm.LIZLLL && o.LJ(this.LJ, c82750Wdm.LJ) && this.LJFF == c82750Wdm.LJFF && this.LJI == c82750Wdm.LJI && this.LJII == c82750Wdm.LJII && o.LJ(this.LJIIIIZZ, c82750Wdm.LJIIIIZZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        boolean z2 = this.LIZJ;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.LIZLLL;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int hashCode2 = (this.LJ.hashCode() + ((i4 + i5) * 31)) * 31;
        boolean z4 = this.LJFF;
        int i6 = z4;
        if (z4 != 0) {
            i6 = 1;
        }
        int i7 = (hashCode2 + i6) * 31;
        boolean z5 = this.LJI;
        int i8 = z5;
        if (z5 != 0) {
            i8 = 1;
        }
        int i9 = (((i7 + i8) * 31) + (this.LJII ? 1 : 0)) * 31;
        C08630Vn<C76800UCe> c08630Vn = this.LJIIIIZZ;
        return i9 + (c08630Vn == null ? 0 : c08630Vn.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordPermissionUISceneStates(currentPermissionState=");
        LIZ.append(this.LIZ);
        LIZ.append(", albumPermissionState=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", showPermissionPage=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showShootWithoutMic=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", showToolbar=");
        LIZ.append(this.LJ);
        LIZ.append(", showMusic=");
        LIZ.append(this.LJFF);
        LIZ.append(", showExit=");
        LIZ.append(this.LJI);
        LIZ.append(", showAlbum=");
        LIZ.append(this.LJII);
        LIZ.append(", refreshAlbumLayout=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C82750Wdm(EnumC82774WeA enumC82774WeA, boolean z, C08630Vn c08630Vn, boolean z2, boolean z3) {
        this(enumC82774WeA, z, true, true, c08630Vn, z2, z3, true, null);
    }

    public C82750Wdm(EnumC82774WeA currentPermissionState, boolean z, boolean z2, boolean z3, C08630Vn<Boolean> c08630Vn, boolean z4, boolean z5, boolean z6, C08630Vn<C76800UCe> c08630Vn2) {
        o.LJIIIZ(currentPermissionState, "currentPermissionState");
        this.LIZ = currentPermissionState;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = c08630Vn;
        this.LJFF = z4;
        this.LJI = z5;
        this.LJII = z6;
        this.LJIIIIZZ = c08630Vn2;
    }

    public static C82750Wdm LIZ(C82750Wdm c82750Wdm, EnumC82774WeA enumC82774WeA, boolean z, boolean z2, C08630Vn c08630Vn, boolean z3, boolean z4, boolean z5, C08630Vn c08630Vn2, int i) {
        boolean z6;
        C08630Vn c08630Vn3 = c08630Vn2;
        boolean z7 = z5;
        boolean z8 = z;
        EnumC82774WeA currentPermissionState = enumC82774WeA;
        boolean z9 = z2;
        C08630Vn showToolbar = c08630Vn;
        boolean z10 = z3;
        boolean z11 = z4;
        if ((i & 1) != 0) {
            currentPermissionState = c82750Wdm.LIZ;
        }
        if ((i & 2) != 0) {
            z6 = c82750Wdm.LIZIZ;
        } else {
            z6 = false;
        }
        if ((i & 4) != 0) {
            z8 = c82750Wdm.LIZJ;
        }
        if ((i & 8) != 0) {
            z9 = c82750Wdm.LIZLLL;
        }
        if ((i & 16) != 0) {
            showToolbar = c82750Wdm.LJ;
        }
        if ((i & 32) != 0) {
            z10 = c82750Wdm.LJFF;
        }
        if ((i & 64) != 0) {
            z11 = c82750Wdm.LJI;
        }
        if ((i & 128) != 0) {
            z7 = c82750Wdm.LJII;
        }
        if ((i & 256) != 0) {
            c08630Vn3 = c82750Wdm.LJIIIIZZ;
        }
        c82750Wdm.getClass();
        o.LJIIIZ(currentPermissionState, "currentPermissionState");
        o.LJIIIZ(showToolbar, "showToolbar");
        return new C82750Wdm(currentPermissionState, z6, z8, z9, showToolbar, z10, z11, z7, c08630Vn3);
    }
}
