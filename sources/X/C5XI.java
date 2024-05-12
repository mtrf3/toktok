package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5XI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XI {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, int[] iArr, InterfaceC65784Pro interfaceC65784Pro) {
        LoudnessDetectResult LJIIZILJ = C79004UzY.LJIIZILJ(videoPublishEditModel.canvasVideoData);
        com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult loudnessDetectResult = videoPublishEditModel.creativeModel.loudnessBalanceModel.loudnessMap.get(videoPublishEditModel.getWavFile());
        boolean z = true;
        if (LJIIZILJ == null) {
            WJR wjr = WJR.LIZ;
            boolean isUseMusicBeforeEdit = videoPublishEditModel.isUseMusicBeforeEdit();
            wjr.getClass();
            if (!WJR.LIZ().enableLoudnessNorm || !WJR.LIZ().enableMicButton || !isUseMusicBeforeEdit) {
                WJU wju = WJU.LIZ;
                boolean isDuet = videoPublishEditModel.isDuet();
                wju.getClass();
                if (!WJU.LIZ().enableLoudnessNorm || !isDuet || videoPublishEditModel.isMuted || loudnessDetectResult == null) {
                    z = false;
                }
            }
        }
        if (ORY.LJJIJ(0, iArr) && z) {
            interfaceC65784Pro.invoke();
        }
    }

    public static final void LIZ(InterfaceC153045zY interfaceC153045zY, VideoPublishEditModel editModel, int[] types, C5XH c5xh) {
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(types, "types");
        if (interfaceC153045zY == null) {
            return;
        }
        C5P6 c5p6 = new C5P6();
        LIZIZ(editModel, types, new AqS91S0300000_2(c5p6, interfaceC153045zY, editModel, 4));
        Iterator it = ((ArrayList) c5p6.LIZIZ()).iterator();
        while (it.hasNext()) {
            C5XE c5xe = (C5XE) it.next();
            if (!editModel.creativeModel.loudnessBalanceModel.balanceTypes.contains(Integer.valueOf(c5xe.LJI))) {
                editModel.creativeModel.loudnessBalanceModel.balanceTypes.add(Integer.valueOf(c5xe.LJI));
            }
        }
        C79004UzY.LJIIZILJ(editModel.canvasVideoData);
        c5p6.LIZJ(editModel, interfaceC153045zY, c5xh);
    }
}
