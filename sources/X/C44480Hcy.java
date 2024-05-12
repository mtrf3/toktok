package X;

import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44480Hcy implements InterfaceC44493HdB {
    public final /* synthetic */ WaterMarkBuilder LIZ;
    public final /* synthetic */ C44488Hd6 LIZIZ;

    @Override // X.InterfaceC44493HdB
    public final void onSuccess() {
        this.LIZIZ.LJFF(-1, -1, null, true);
        C44488Hd6 c44488Hd6 = this.LIZIZ;
        HOW how = c44488Hd6.LJI;
        if (how != null) {
            how.reset();
        }
        WaterMarkBuilder waterMarkBuilder = c44488Hd6.LIZLLL;
        o.LJI(waterMarkBuilder);
        if (waterMarkBuilder.listener != null) {
            WaterMarkBuilder waterMarkBuilder2 = c44488Hd6.LIZLLL;
            o.LJI(waterMarkBuilder2);
            WaterMarkListener waterMarkListener = waterMarkBuilder2.listener;
            WaterMarkBuilder waterMarkBuilder3 = c44488Hd6.LIZLLL;
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

    @Override // X.InterfaceC44493HdB
    public final void LIZ(float f) {
        WaterMarkListener waterMarkListener = this.LIZ.listener;
        if (waterMarkListener != null) {
            waterMarkListener.onProgress((int) (f * 100));
        }
    }

    public C44480Hcy(WaterMarkBuilder waterMarkBuilder, C44488Hd6 c44488Hd6) {
        this.LIZ = waterMarkBuilder;
        this.LIZIZ = c44488Hd6;
    }

    @Override // X.InterfaceC44493HdB
    public final void LIZIZ(int i, int i2, String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
        this.LIZIZ.LIZLLL(i, i2, errorMsg);
        this.LIZIZ.LJFF(i, i2, errorMsg, false);
    }
}
