package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.C3g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30704C3g extends AbstractC30707C3j {
    public LiveEffect LJFF;
    public LiveEffect LJI;
    public final InterfaceC31971Nh LJII;

    public C30704C3g(InterfaceC31971Nh interfaceC31971Nh) {
        this.LJII = interfaceC31971Nh;
        if (this.LJFF == null) {
            LiveEffect liveEffect = new LiveEffect();
            this.LJFF = liveEffect;
            liveEffect.effectId = 1111L;
            liveEffect.updateKeys.addAll(Arrays.asList("", "smooth/frag/smoothIntensity", "smooth/frag/brightenIntensity"));
            this.LJFF.setUnzipPath(EnumC31814CeA.INST.getBeautyComposerFilePath());
        }
        if (this.LJI == null) {
            LiveEffect liveEffect2 = new LiveEffect();
            this.LJI = liveEffect2;
            liveEffect2.effectId = 1112L;
            liveEffect2.updateKeys.addAll(Arrays.asList("FaceDistortionCheekIntensity", "FaceDistortionEyeIntensity"));
            this.LJI.setUnzipPath(EnumC31814CeA.INST.getReshapeComposerFilePath());
        }
        LJFF(InterfaceC30442Bx8.LJJIFFI.LIZJ().floatValue());
        LJII(InterfaceC30442Bx8.LJJIII.LIZJ().floatValue());
        LJI(InterfaceC30442Bx8.LJJII.LIZJ().floatValue());
    }

    @Override // X.AbstractC30707C3j
    public final void LIZIZ(float f) {
        if (!LJIIIIZZ(this.LJFF, this.LJII.LIZ("beauty"))) {
            this.LJII.LIZIZ(this.LJFF, "beauty");
            LJIIIZ(this.LIZ, "smooth/frag/smoothIntensity");
        } else {
            LJIIIZ(f, "smooth/frag/smoothIntensity");
        }
    }

    @Override // X.AbstractC30707C3j
    public final void LIZJ(float f) {
        if (!LJIIIIZZ(this.LJI, this.LJII.LIZ("beauty"))) {
            this.LJII.LIZIZ(this.LJI, "beauty");
            LJIIIZ(this.LIZIZ, "FaceDistortionEyeIntensity");
            LJIIIZ(this.LIZJ, "FaceDistortionCheekIntensity");
            return;
        }
        LJIIIZ(f, "FaceDistortionEyeIntensity");
    }

    @Override // X.AbstractC30707C3j
    public final void LIZLLL(float f) {
        if (!LJIIIIZZ(this.LJI, this.LJII.LIZ("beauty"))) {
            this.LJII.LIZIZ(this.LJI, "beauty");
            LJIIIZ(this.LIZIZ, "FaceDistortionEyeIntensity");
            LJIIIZ(this.LIZJ, "FaceDistortionCheekIntensity");
            return;
        }
        LJIIIZ(f, "FaceDistortionCheekIntensity");
    }

    public static boolean LJIIIIZZ(LiveEffect liveEffect, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (C38354F3m.LIZJ(((LiveEffect) it.next()).unzipPath, liveEffect.unzipPath)) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIIZ(float f, String str) {
        this.LJII.LJJIIZI(f, str);
    }
}
