package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.HBs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43664HBs {
    public static void LIZ(ShortVideoContext shortVideoContext, long j, long j2, InterfaceC65784Pro stickerApiComponentProvider, InterfaceC88472Yns interfaceC88472Yns) {
        int i;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(stickerApiComponentProvider, "stickerApiComponentProvider");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", shortVideoContext.shootWay);
        c145995oB.LJI("enter_from", shortVideoContext.enterFrom);
        c145995oB.LJI("enter_method", shortVideoContext.enterMethod);
        c145995oB.LIZIZ(j, "duration");
        c145995oB.LIZIZ(j2, "take_photo_duration");
        InterfaceC82400WVo interfaceC82400WVo = (InterfaceC82400WVo) stickerApiComponentProvider.invoke();
        if (interfaceC82400WVo != null && C82398WVm.LIZJ(interfaceC82400WVo) != null) {
            i = 1;
        } else {
            i = 0;
        }
        c145995oB.LIZ(i, "has_effect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(shortVideoContext.cameraComponentModel.mVideoWidth);
        LIZ.append('*');
        LIZ.append(shortVideoContext.cameraComponentModel.mVideoHeight);
        c145995oB.LJI("resolution", X1D.LIZIZ(LIZ));
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c145995oB);
        }
        FMX.LJIIL("tools_performance_take_photo_process", c145995oB.LIZ);
    }
}
