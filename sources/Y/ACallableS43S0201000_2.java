package Y;

import X.C133765Mu;
import X.C145995oB;
import X.C1554568f;
import X.C24730y5;
import X.C44384HbQ;
import X.C5U8;
import X.C68M;
import X.C6DR;
import X.EnumC82528WaC;
import X.GXR;
import X.InterfaceC153045zY;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewActivity;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.vesdk.clipparam.VEClipSourceParam;
import com.ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS43S0201000_2 implements Callable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS43S0201000_2 aCallableS43S0201000_2) {
        switch (aCallableS43S0201000_2.i2) {
            case 0:
                C24730y5 this$0 = (C24730y5) aCallableS43S0201000_2.l0;
                Callable callable = (Callable) aCallableS43S0201000_2.l1;
                o.LJIIIZ(this$0, "this$0");
                o.LJIIIZ(callable, "$callable");
                try {
                    this$0.LIZIZ = callable.call();
                } finally {
                    CountDownLatch countDownLatch = (CountDownLatch) this$0.LIZ;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
            default:
                return ((C6DR) aCallableS43S0201000_2.l0).LIZIZ.LIZLLL((Effect) aCallableS43S0201000_2.l1);
        }
    }

    public static final Object call$1(ACallableS43S0201000_2 aCallableS43S0201000_2) {
        switch (aCallableS43S0201000_2.i2) {
            case 0:
                IDObjectS384S0100000_2 iDObjectS384S0100000_2 = (IDObjectS384S0100000_2) ((IFetchEffectChannelListener) aCallableS43S0201000_2.l0);
                ((C68M) iDObjectS384S0100000_2.l0).LJIJJ((EffectChannelResponse) ((Serializable) aCallableS43S0201000_2.l1));
                return null;
            default:
                IDObjectS384S0100000_2 iDObjectS384S0100000_22 = (IDObjectS384S0100000_2) ((IFetchEffectChannelListener) aCallableS43S0201000_2.l0);
                return ((C1554568f) iDObjectS384S0100000_22.l0).LIZLLL((Effect) ((Serializable) aCallableS43S0201000_2.l1));
        }
    }

    public static final Object call$2(ACallableS43S0201000_2 aCallableS43S0201000_2) {
        switch (aCallableS43S0201000_2.i2) {
            case 0:
                IVideo2GifService.ConvertListener convertListener = (IVideo2GifService.ConvertListener) aCallableS43S0201000_2.l0;
                C133765Mu c133765Mu = (C133765Mu) aCallableS43S0201000_2.l1;
                convertListener.onDone(false);
                c133765Mu.destroy();
                return null;
            default:
                VEVideoPublishPreviewActivity vEVideoPublishPreviewActivity = (VEVideoPublishPreviewActivity) aCallableS43S0201000_2.l0;
                C145995oB c145995oB = (C145995oB) aCallableS43S0201000_2.l1;
                c145995oB.LIZLLL("original_resolution", C44384HbQ.LJJLIIIJLJLI(vEVideoPublishPreviewActivity.LJLL));
                GXR.LIZ("tool_performance_publish_preview", c145995oB.LIZ);
                return null;
        }
    }

    public static final Object call$3(ACallableS43S0201000_2 aCallableS43S0201000_2) {
        int i = aCallableS43S0201000_2.i2;
        List list = (List) aCallableS43S0201000_2.l0;
        o.LJI(list);
        int size = i - list.size();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (VideoSegment videoSegment : (List) aCallableS43S0201000_2.l0) {
            VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
            String LJII = videoSegment.LJII(false);
            LJII.toString();
            vEClipSourceParam.clipFilePath = LJII;
            vEClipSourceParam.clipWidth = videoSegment.width;
            vEClipSourceParam.clipHeight = videoSegment.height;
            arrayList.add(vEClipSourceParam);
            VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
            vEClipTimelineParam.speed = EnumC82528WaC.NORMAL.value();
            vEClipTimelineParam.trimIn = 0;
            vEClipTimelineParam.trimOut = (int) videoSegment.duration;
            arrayList2.add(vEClipTimelineParam);
        }
        InterfaceC153045zY interfaceC153045zY = ((C5U8) aCallableS43S0201000_2.l1).LIZ;
        o.LJI(interfaceC153045zY);
        int LLJLLIL = interfaceC153045zY.LLJLLIL(size, arrayList, arrayList2);
        if (LLJLLIL >= 0) {
            InterfaceC153045zY interfaceC153045zY2 = ((C5U8) aCallableS43S0201000_2.l1).LIZ;
            o.LJI(interfaceC153045zY2);
            LLJLLIL = interfaceC153045zY2.updateAlgorithmFromNormal();
            if (LLJLLIL >= 0) {
                InterfaceC153045zY interfaceC153045zY3 = ((C5U8) aCallableS43S0201000_2.l1).LIZ;
                o.LJI(interfaceC153045zY3);
                LLJLLIL = interfaceC153045zY3.genRandomSolve();
            }
        }
        return Integer.valueOf(LLJLLIL);
    }

    public ACallableS43S0201000_2(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
