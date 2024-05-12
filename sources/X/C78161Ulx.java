package X;

import Y.ARunnableS14S1100000_13;
import Y.ARunnableS2S1210000_13;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.bytedance.gift.render.model.Effect;

/* renamed from: X.Ulx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78161Ulx implements InterfaceC78208Umi {
    public final C78160Ulw LIZ;
    public final Effect LIZIZ;
    public long LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC78208Umi
    public final void LIZJ(float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC78208Umi
    public final void LJIIIZ() {
    }

    @Override // X.InterfaceC78208Umi
    public final void onStop() {
        LIZIZ(null);
    }

    public final void LJ() {
        boolean z;
        this.LIZJ = C32257ClJ.LIZLLL().LIZ();
        C78160Ulw c78160Ulw = this.LIZ;
        boolean z2 = false;
        if (c78160Ulw != null && c78160Ulw.LIZJ) {
            z = true;
            C65032gt.LIZ(new ARunnableS14S1100000_13(this, "_self", 10));
        } else {
            z = false;
            if (C32257ClJ.LJFF() == 1) {
                C65032gt.LIZ(new ARunnableS14S1100000_13(this, "_anchor", 10));
            }
        }
        C78160Ulw c78160Ulw2 = this.LIZ;
        if (c78160Ulw2 != null && c78160Ulw2.LJIILJJIL) {
            z2 = true;
        }
        if (GiftEventTrackSamplingSetting.shouldBlock(z2)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (z || C32257ClJ.LJFF() == 1)) {
            return;
        }
        C65032gt.LIZ(new ARunnableS14S1100000_13(this, "", 10));
    }

    @Override // X.InterfaceC78208Umi
    public final void onStart() {
        C32257ClJ.LIZLLL().LIZ();
        C32257ClJ.LIZLLL().LIZ();
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZ(C78163Ulz c78163Ulz) {
        LIZIZ(null);
    }

    @Override // X.InterfaceC78208Umi
    public final void LIZIZ(C60382Yo c60382Yo) {
        long j;
        EnumC78167Um3 enumC78167Um3 = EnumC78167Um3.playcontroller_end;
        C78160Ulw c78160Ulw = this.LIZ;
        if (c78160Ulw != null) {
            j = c78160Ulw.LIZ;
        } else {
            j = 0;
        }
        Effect effect = this.LIZIZ;
        C78168Um4.LIZ(enumC78167Um3, j, effect.giftId, effect.LIZ().id);
    }

    public C78161Ulx(C78160Ulw c78160Ulw, Effect effect) {
        this.LIZ = c78160Ulw;
        this.LIZIZ = effect;
    }

    public final void LIZLLL(boolean z, C78163Ulz c78163Ulz) {
        boolean z2;
        boolean z3;
        C78160Ulw c78160Ulw = this.LIZ;
        boolean z4 = false;
        if (c78160Ulw != null && c78160Ulw.LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C32257ClJ.LJFF() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            C65032gt.LIZ(new ARunnableS2S1210000_13(c78163Ulz, this, z, "_self", 0));
        } else if (z3) {
            C65032gt.LIZ(new ARunnableS2S1210000_13(c78163Ulz, this, z, "_anchor", 0));
        }
        C78160Ulw c78160Ulw2 = this.LIZ;
        if (c78160Ulw2 != null && c78160Ulw2.LJIILJJIL) {
            z4 = true;
        }
        if (GiftEventTrackSamplingSetting.shouldBlock(z4)) {
            return;
        }
        if (GiftEventTrackSamplingSetting.enable() && (z2 || z3)) {
            return;
        }
        C65032gt.LIZ(new ARunnableS2S1210000_13(c78163Ulz, this, z, "", 0));
    }
}
