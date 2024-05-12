package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.math.BigDecimal;

/* renamed from: X.QqU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68250QqU extends AbstractC68251QqV {
    public final C68266Qqk LJI;
    public final /* synthetic */ C68279Qqx LJII;

    @Override // X.AbstractC68251QqV
    public final boolean LIZIZ() {
        return false;
    }

    @Override // X.AbstractC68251QqV
    public final boolean LIZJ() {
        return true;
    }

    @Override // X.AbstractC68251QqV
    public final int LIZ() {
        return this.LJI.zzf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68250QqU(C68279Qqx c68279Qqx, String str, int i, C68266Qqk c68266Qqk) {
        super(str, i);
        this.LJII = c68279Qqx;
        this.LJI = c68266Qqk;
    }

    public final boolean LJI(Long l, Long l2, C68259Qqd c68259Qqd, boolean z) {
        boolean z2;
        Object obj;
        C68576Qvk.LIZ();
        boolean LJIILJJIL = this.LJII.LIZ.LJI.LJIILJJIL(this.LIZ, C68555QvP.LJJJJL);
        C68266Qqk c68266Qqk = this.LJI;
        boolean z3 = c68266Qqk.zzi;
        boolean z4 = c68266Qqk.zzj;
        boolean z5 = c68266Qqk.zzk;
        if (z3 || z4 || z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        r5 = null;
        Boolean bool4 = null;
        bool = null;
        if (z && !z2) {
            C67281Qar c67281Qar = this.LJII.LIZ.LIZJ().LJIILIIL;
            Integer valueOf = Integer.valueOf(this.LIZIZ);
            if (this.LJI.LJIL()) {
                num = Integer.valueOf(this.LJI.zzf);
            }
            c67281Qar.LIZJ(valueOf, num, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        C68267Qql LJIJ = c68266Qqk.LJIJ();
        boolean z6 = LJIJ.zzh;
        if (c68259Qqd.LJJIIJZLJL()) {
            if (!LJIJ.LJJI()) {
                this.LJII.LIZ.LIZJ().LJIIIIZZ.LIZIZ(this.LJII.LIZ.LJIIL.LJFF(c68259Qqd.zzg), "No number filter for long property. property");
            } else {
                long j = c68259Qqd.zzi;
                try {
                    bool3 = AbstractC68251QqV.LIZLLL(new BigDecimal(j), LJIJ.LJIJJ(), LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                } catch (NumberFormatException unused) {
                }
                bool = AbstractC68251QqV.LJFF(bool3, z6);
            }
        } else if (c68259Qqd.LJJIIJ()) {
            if (!LJIJ.LJJI()) {
                this.LJII.LIZ.LIZJ().LJIIIIZZ.LIZIZ(this.LJII.LIZ.LJIIL.LJFF(c68259Qqd.zzg), "No number filter for double property. property");
            } else {
                double d = c68259Qqd.zzk;
                try {
                    bool2 = AbstractC68251QqV.LIZLLL(new BigDecimal(d), LJIJ.LJIJJ(), Math.ulp(d));
                } catch (NumberFormatException unused2) {
                }
                bool = AbstractC68251QqV.LJFF(bool2, z6);
            }
        } else if (c68259Qqd.LJJIIZI()) {
            if (!LJIJ.LJJII()) {
                if (!LJIJ.LJJI()) {
                    this.LJII.LIZ.LIZJ().LJIIIIZZ.LIZIZ(this.LJII.LIZ.LJIIL.LJFF(c68259Qqd.zzg), "No string or number filter defined. property");
                } else if (C68243QqN.LJJIJIIJI(c68259Qqd.zzh)) {
                    String str = c68259Qqd.zzh;
                    C68269Qqn LJIJJ = LJIJ.LJIJJ();
                    if (C68243QqN.LJJIJIIJI(str)) {
                        try {
                            bool4 = AbstractC68251QqV.LIZLLL(new BigDecimal(str), LJIJJ, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                        } catch (NumberFormatException unused3) {
                        }
                    }
                    bool = AbstractC68251QqV.LJFF(bool4, z6);
                } else {
                    this.LJII.LIZ.LIZJ().LJIIIIZZ.LIZJ(this.LJII.LIZ.LJIIL.LJFF(c68259Qqd.zzg), c68259Qqd.zzh, "Invalid user property value for Numeric number filter. property, value");
                }
            } else {
                bool = AbstractC68251QqV.LJFF(AbstractC68251QqV.LJ(c68259Qqd.zzh, LJIJ.LJIJJLI(), this.LJII.LIZ.LIZJ()), z6);
            }
        } else {
            this.LJII.LIZ.LIZJ().LJIIIIZZ.LIZIZ(this.LJII.LIZ.LJIIL.LJFF(c68259Qqd.zzg), "User property has no value, property");
        }
        C67281Qar c67281Qar2 = this.LJII.LIZ.LIZJ().LJIILIIL;
        if (bool == null) {
            obj = "null";
        } else {
            obj = bool;
        }
        c67281Qar2.LIZIZ(obj, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.LIZJ = Boolean.TRUE;
        if (z5 && !bool.booleanValue()) {
            return true;
        }
        if (!z || this.LJI.zzi) {
            this.LIZLLL = bool;
        }
        if (bool.booleanValue() && z2 && c68259Qqd.LJJIIZ()) {
            long j2 = c68259Qqd.zzf;
            if (l != null) {
                j2 = l.longValue();
            }
            if (LJIILJJIL) {
                C68266Qqk c68266Qqk2 = this.LJI;
                if (c68266Qqk2.zzi && !c68266Qqk2.zzj && l2 != null) {
                    j2 = l2.longValue();
                }
            }
            if (this.LJI.zzj) {
                this.LJFF = Long.valueOf(j2);
            } else {
                this.LJ = Long.valueOf(j2);
            }
        }
        return true;
    }
}
