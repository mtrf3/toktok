package X;

import Y.ARunnableS41S0100000_5;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.android.livesdk.dataChannel.GoLiveButtonClickEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSmoothGoLiveConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveDirtyLensDetectionSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.C3x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30721C3x implements InterfaceC30359Bvn {
    public final ActivityC45651qj LIZ;
    public final InterfaceC21020s6 LIZIZ;
    public final InterfaceC12610eX LIZJ;
    public final C1MZ LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final InterfaceC65784Pro<C76800UCe> LJFF;
    public final InterfaceC88472Yns<Bundle, C76800UCe> LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;
    public final InterfaceC88472Yns<Float, C76800UCe> LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public final C5H3 LJIIJ;
    public C40 LJIIJJI;
    public C41 LJIIL;
    public final C5H3 LJIILIIL;
    public boolean LJIILJJIL;
    public float LJIILL;
    public float LJIILLIIL;

    @Override // X.InterfaceC30359Bvn
    public final void LIZ(String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZJ(String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJII() {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILL(LiveEffect liveEffect, String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJJ(Boolean bool) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJ(LiveEffect liveEffect, String str) {
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJ() {
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.notifyKeyboardHide(true);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILIIL() {
        this.LJII.invoke();
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILLIIL() {
        this.LJ.invoke();
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIL() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        ((IBroadcastService) LIZ).getLiveCoreInitUtil();
        C3Z.LIZLLL();
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJ() {
        this.LJFF.invoke();
    }

    public final C0WB LJJIIZ() {
        return (C0WB) this.LJIIIZ.getValue();
    }

    public final C1QA LJJIIZI() {
        return (C1QA) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC30359Bvn
    public final int getCameraInfo() {
        return this.LIZIZ.getExposureCompensationRange();
    }

    public final void LJI(boolean z) {
        if (!LiveDirtyLensDetectionSetting.INSTANCE.getENABLED() || !LiveBroadcastSmoothGoLiveConfigSetting.INSTANCE.getValue().enableDirtyLenDetect) {
            return;
        }
        C83655WsN c83655WsN = (C83655WsN) this.LJIILIIL.getValue();
        C30722C3y c30722C3y = new C30722C3y(this, z);
        c83655WsN.getClass();
        c83655WsN.LIZ((InterfaceC83704WtA) EUR.LIZ(c30722C3y));
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIIZZ(String[] strArr) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJIIIIZZ(strArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJ(C40 c40) {
        this.LJIIJJI = c40;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIJJI(InterfaceC30516ByK listener) {
        o.LJIIIZ(listener, "listener");
        ((AbstractC30473Bxd) this.LIZJ).LJIIIIZZ(listener);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIILJJIL(InterfaceC30516ByK listener) {
        o.LJIIIZ(listener, "listener");
        ((AbstractC30473Bxd) this.LIZJ).LIZ(listener);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJ(String[] strArr) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJIIJJI(strArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIFFI(int i) {
        this.LIZLLL.LJI(i);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJII(C41 c41) {
        this.LJIIL = c41;
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIII(Bundle bundle) {
        this.LJI.invoke(bundle);
    }

    @Override // X.InterfaceC30359Bvn
    public final void closeCamera(Cert cert) {
        o.LJIIIZ(cert, "cert");
        ((C30514ByI) this.LIZJ).LJIILLIIL(cert, false);
        ((C30514ByI) this.LIZJ).LJIILL();
        this.LJIILJJIL = true;
    }

    @Override // X.InterfaceC30359Bvn
    public final void openCamera(Cert cert) {
        o.LJIIIZ(cert, "cert");
        ((C30514ByI) this.LIZJ).LJIILLIIL(cert, true);
        this.LJIILJJIL = false;
        C15610jN.LIZ().postDelayed(new ARunnableS41S0100000_5((Object) new AqS155S0100000_5(this, 306), 256), 500L);
    }

    @Override // X.InterfaceC30359Bvn
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        if (this.LJIILLIIL == -1.0f) {
            this.LJIILLIIL = this.LIZIZ.LJJ();
        }
        float f = 0.0f;
        if (this.LJIILLIIL <= 0.0f) {
            return Boolean.FALSE;
        }
        if (scaleGestureDetector != null) {
            if (scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan() == 0.0f) {
                return Boolean.FALSE;
            }
            float currentSpan = ((scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan()) * (this.LJIILLIIL / 1000)) + this.LJIILL;
            if (0.0f < currentSpan) {
                f = currentSpan;
            }
            this.LJIILL = f;
            float f2 = this.LJIILLIIL;
            if (f > f2) {
                f = f2;
            }
            this.LJIILL = f;
            this.LIZIZ.LIZIZ(f);
            this.LJIIIIZZ.invoke(Float.valueOf(this.LJIILL));
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override // X.InterfaceC30359Bvn
    public final void setExposureCompensation(int i) {
        this.LIZIZ.setExposureCompensation(i);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJFF(String[] strArr, String[] strArr2) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJFF(strArr, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIIZ(String[] strArr, String[] strArr2) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJIIIZ(strArr, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIL(int i, C78862UxG c78862UxG) {
        if (i != 0) {
            if (i == 1) {
                this.LIZIZ.LJJIIJZLJL(1, c78862UxG);
            }
        } else {
            this.LIZIZ.LJJIIJZLJL(2, c78862UxG);
        }
        LJI(false);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJI(String[] strArr, String[] strArr2) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJI(strArr, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIJJLI(FilterModel filterModel, float f) {
        this.LIZLLL.LJII(filterModel, f);
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIIJZLJL(String[] strArr, String[] strArr2) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LJIIJ(strArr, strArr2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final int LLIIIJ(String str, String str2) {
        if (str == null || str2 == null) {
            return -1;
        }
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.setCustomEffect(str, str2);
            return 0;
        }
        return 0;
    }

    @Override // X.YLK
    public final void processLongPressEvent(float f, float f2) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processLongPressEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processRotationEvent(float f, float f2) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processRotationEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processScaleEvent(float f, float f2) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processScaleEvent(f, f2);
        }
    }

    @Override // X.YLK
    public final void processTouchEvent(float f, float f2) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processTouchEvent(f, f2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void setFilter(String str, float f) {
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.setFilter(str, f);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void setRenderCacheString(String str, String value) {
        o.LJIIIZ(value, "value");
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.setRenderCacheString(str, value);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZIZ(String[] strArr, String[] strArr2, float[] fArr) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LIZIZ(strArr, strArr2, fArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJIIZILJ(String[] strArr, String[] strArr2, String[] strArr3) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.LIZJ(strArr, strArr2, strArr3);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJI(int i, int i2, MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LIZIZ.setFocusAreas(i, i2, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerCheckNodeExclusion(String str, String str2, int[] iArr) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.composerCheckNodeExclusion(str, str2, iArr);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void composerUpdateNode(String str, String str2, float f) {
        C0WB LJJIIZ = LJJIIZ();
        if (LJJIIZ != null) {
            LJJIIZ.composerUpdateNode(str, str2, f);
        }
    }

    @Override // X.YLK
    public final void processTouchDownEvent(float f, float f2, int i) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processTouchDownEvent(f, f2, i);
        }
    }

    @Override // X.YLK
    public final void processTouchUpEvent(float f, float f2, int i) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processTouchUpEvent(f, f2, i);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LIZLLL(int i, int i2, String str, String str2) {
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.setInputText(str, i, i2, str2);
        }
    }

    @Override // X.InterfaceC30359Bvn
    public final void LJJIJL(int i, long j, long j2, String str) {
        IFilterManager videoFilterMgr = this.LIZIZ.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.sendEffectMsg(i, (int) j, (int) j2, str);
        }
    }

    @Override // X.YLK
    public final void processPanEvent(float f, float f2, float f3, float f4, float f5) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processPanEvent(f, f2, f3, f4, f5);
        }
    }

    @Override // X.YLK
    public final void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2) {
        C1QA LJJIIZI = LJJIIZI();
        if (LJJIIZI != null) {
            ((C41571k9) LJJIIZI).processTouchEventWithTouchType(j, f, f2, f3, f4, i, i2);
        }
    }

    public C30721C3x(ActivityC45651qj fragmentActivity, CKO cko, InterfaceC12610eX interfaceC12610eX, C1MZ c1mz, InterfaceC65784Pro startCountdown, InterfaceC65784Pro stopCountdown, InterfaceC88472Yns goLive, AqS165S0100000_15 aqS165S0100000_15, AqS175S0100000_9 aqS175S0100000_9) {
        o.LJIIIZ(fragmentActivity, "fragmentActivity");
        o.LJIIIZ(startCountdown, "startCountdown");
        o.LJIIIZ(stopCountdown, "stopCountdown");
        o.LJIIIZ(goLive, "goLive");
        this.LIZ = fragmentActivity;
        this.LIZIZ = cko;
        this.LIZJ = interfaceC12610eX;
        this.LIZLLL = c1mz;
        this.LJ = startCountdown;
        this.LJFF = stopCountdown;
        this.LJI = goLive;
        this.LJII = aqS165S0100000_15;
        this.LJIIIIZZ = aqS175S0100000_9;
        this.LJIIIZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 307));
        this.LJIIJ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 308));
        this.LJIILIIL = C78996UzQ.LJJIJIIJI(C43.LJLIL);
        this.LJIILLIIL = -1.0f;
        IFilterManager videoFilterMgr = cko.getVideoFilterMgr();
        if (videoFilterMgr != null) {
            videoFilterMgr.composerSetMode(1, 0);
        }
        C30723C3z c30723C3z = new C30723C3z(this);
        AbstractC30473Bxd abstractC30473Bxd = (AbstractC30473Bxd) interfaceC12610eX;
        synchronized (abstractC30473Bxd) {
            if (abstractC30473Bxd.LJLIL == null) {
                abstractC30473Bxd.LJLIL = new ArrayList();
            }
            ((ArrayList) abstractC30473Bxd.LJLIL).add(c30723C3z);
        }
        DataChannelGlobal.LJLJJI.nv0(this, fragmentActivity, GoLiveButtonClickEvent.class, new AqS171S0100000_5(this, 586));
    }
}
