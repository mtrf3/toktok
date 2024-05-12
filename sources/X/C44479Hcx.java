package X;

import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44479Hcx implements InterfaceC44493HdB {
    public final /* synthetic */ C44487Hd5 LIZ;

    @Override // X.InterfaceC44493HdB
    public final void onSuccess() {
        this.LIZ.LJFF(-1, -1, null, true);
        C44487Hd5 c44487Hd5 = this.LIZ;
        c44487Hd5.LIZLLL = null;
        c44487Hd5.LJ = null;
        HOW how = c44487Hd5.LJIIIIZZ;
        if (how != null) {
            how.reset();
        }
        WaterMarkBuilder waterMarkBuilder = c44487Hd5.LJFF;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = c44487Hd5.LJFF;
            o.LJI(waterMarkBuilder2);
            WaterMarkListener waterMarkListener = waterMarkBuilder2.listener;
            WaterMarkBuilder waterMarkBuilder3 = c44487Hd5.LJFF;
            o.LJI(waterMarkBuilder3);
            waterMarkListener.onSuccess(waterMarkBuilder3.outPath);
        }
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C43882HKc.LIZLLL(0, "aweme_download_synthesis_error_rate", null, true);
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJI("enter_from", "download_video");
                FMX.LJIIL("add_watermark", c145995oB.LIZ);
            }
        } catch (Exception unused) {
        }
    }

    public C44479Hcx(C44487Hd5 c44487Hd5) {
        this.LIZ = c44487Hd5;
    }

    @Override // X.InterfaceC44493HdB
    public final void LIZ(float f) {
        WaterMarkBuilder waterMarkBuilder = this.LIZ.LJFF;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = this.LIZ.LJFF;
            o.LJI(waterMarkBuilder2);
            waterMarkBuilder2.listener.onProgress((int) (f * 100));
        }
    }

    @Override // X.InterfaceC44493HdB
    public final void LIZIZ(int i, int i2, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZ.LIZLLL(i, i2, errorMsg);
        this.LIZ.LJFF(i, i2, errorMsg, false);
    }
}
