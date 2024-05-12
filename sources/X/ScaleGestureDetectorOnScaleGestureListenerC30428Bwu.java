package X;

import Y.AfS57S0100000_5;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.bytedance.android.live.broadcast.api.ExposureCompensationVisibleChannel;
import com.bytedance.android.live.broadcast.api.RefreshExposureCompensationViewChannel;
import com.bytedance.android.live.broadcast.api.ZoomCameraScaleEvent;
import com.bytedance.android.live.liveinteract.api.MultiGuestAnchorMaskTouchEventChannel;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveFocusAndExposureSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.Bwu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC30428Bwu extends AbstractC32821Qo implements ScaleGestureDetector.OnScaleGestureListener {
    public final Context LJLIL;
    public final DataChannel LJLILLLLZI;
    public final int LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public final CKO LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final ScaleGestureDetector LJLJLLL;
    public boolean LJLL;
    public C32811Qn LJLLI;
    public boolean LJLLILLLL;
    public C73411SrX LJLLJ;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public InterfaceC65784Pro<C76800UCe> LJZI;
    public InterfaceC65784Pro<C76800UCe> LJZL;
    public int LL;
    public boolean LLD;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final void LJFF() {
        this.LJLLJ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS57S0100000_5(this, 226));
    }

    @Override // X.AbstractC32821Qo
    public final int LIZ() {
        return this.LJLJI;
    }

    public final boolean LJ(MotionEvent motionEvent) {
        C32811Qn c32811Qn = this.LJLLI;
        if (c32811Qn == null) {
            return false;
        }
        if (C29306Beo.LJJI()) {
            this.LL = (int) c32811Qn.LJLILLLLZI;
            if (motionEvent.getY() <= C15380j0.LIZ(8.0f) + this.LJLLLL) {
                return false;
            }
            if (this.LL - motionEvent.getY() <= C15380j0.LIZ(8.0f) + this.LJLLLLLL) {
                return false;
            }
        } else {
            if (this.LJLIL != null) {
                C15380j0.LJIIL();
                this.LL = C15380j0.LJIIJJI();
            }
            if (motionEvent.getY() <= this.LJLZ || this.LL - motionEvent.getY() <= this.LJZ) {
                return false;
            }
        }
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        C32811Qn c32811Qn;
        if (motionEvent == null || !C29306Beo.LJJI() || (c32811Qn = this.LJLLI) == null) {
            return false;
        }
        int i = (int) c32811Qn.LJLIL;
        int i2 = (int) c32811Qn.LJLILLLLZI;
        int i3 = i2 / 10;
        float f = i / 10;
        if (motionEvent.getX() < f || i - motionEvent.getX() < f) {
            return false;
        }
        float f2 = i3;
        if (motionEvent.getY() < f2 || i2 - motionEvent.getY() < f2) {
            return false;
        }
        C78920UyC.LJI("livesdk_camera_switch", "double_click", "event_type");
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIIIZ;
        Integer currentCameraType = c48459J0d.LIZIZ();
        InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LJLILLLLZI);
        if (LJIILIIL == null) {
            return false;
        }
        o.LJIIIIZZ(currentCameraType, "currentCameraType");
        LJIILIIL.LJIIL(1 - currentCameraType.intValue(), C78857UxB.LJJIIJ(1476788229, "bpea-operate_camera"));
        c48459J0d.LJ(Integer.valueOf(1 - currentCameraType.intValue()));
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        if (C29306Beo.LJJI()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        if (this.LJLJL == null) {
            InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LJLILLLLZI);
            if (LJIILIIL == null) {
                return false;
            }
            Boolean scaleCamera = LJIILIIL.scaleCamera(detector);
            o.LJIIIIZZ(scaleCamera, "it.scaleCamera(detector)");
            return scaleCamera.booleanValue();
        }
        if (this.LJLJJLL == -1.0f) {
            this.LJLJJLL = r3.LJJ();
        }
        float f = 0.0f;
        if (this.LJLJJLL <= 0.0f || detector.getCurrentSpan() - detector.getPreviousSpan() == 0.0f) {
            return false;
        }
        float currentSpan = ((detector.getCurrentSpan() - detector.getPreviousSpan()) * (this.LJLJJLL / 1000)) + this.LJLJJI;
        if (0.0f < currentSpan) {
            f = currentSpan;
        }
        this.LJLJJI = f;
        float f2 = this.LJLJJLL;
        if (f > f2) {
            f = f2;
        }
        this.LJLJJI = f;
        CKO cko = this.LJLJL;
        if (cko != null) {
            cko.LIZIZ(f);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        o.LJIIIZ(detector, "detector");
        if (this.LJLJL != null) {
            ((C32537Cpp) this.LJLILLLLZI.gv0(C2E2.class)).LIZ = Boolean.TRUE;
            this.LJLJJL = this.LJLJJI;
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Boolean, O] */
    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScaleEnd(android.view.ScaleGestureDetector r6) {
        /*
            r5 = this;
            java.lang.String r0 = "detector"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.CKO r0 = r5.LJLJL
            if (r0 == 0) goto L27
            com.bytedance.ies.sdk.datachannel.DataChannel r2 = r5.LJLILLLLZI
            java.lang.Class<X.2E2> r0 = X.C2E2.class
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.Cps r0 = r2.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r1
            boolean r0 = X.C29306Beo.LJJI()
            if (r0 != 0) goto L27
            com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting r0 = com.bytedance.android.livesdk.livesetting.performance.UnusedLogOfflineSetting.INSTANCE
            java.lang.String r4 = "livesdk_zoom_in"
            boolean r0 = r0.isEnable(r4)
            if (r0 != 0) goto L28
        L27:
            return
        L28:
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r5.LJLILLLLZI
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.InteractModeChannel> r0 = com.bytedance.android.livesdk.dataChannel.InteractModeChannel.class
            java.lang.Object r2 = r1.kv0(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 != 0) goto L5a
        L34:
            java.lang.String r3 = "live_take_detail"
        L36:
            float r2 = r5.LJLJJI
            float r1 = r5.LJLJJL
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L50
            java.lang.String r2 = "zoom_in"
        L40:
            X.BZI r1 = X.C28787BRn.LIZ(r4)
            r1.LJIIJJI(r3)
            java.lang.String r0 = "hand_gesture"
            r1.LJIJJ(r2, r0)
            r1.LJJIIJZLJL()
            goto L27
        L50:
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 >= 0) goto L57
            java.lang.String r2 = "zoom_out"
            goto L40
        L57:
            java.lang.String r2 = "no_change"
            goto L40
        L5a:
            int r1 = r2.intValue()
            r0 = 1
            if (r1 != r0) goto L64
            java.lang.String r3 = "guest_connect"
            goto L36
        L64:
            int r1 = r2.intValue()
            r0 = 2
            if (r1 != r0) goto L34
            java.lang.String r3 = "host_connect"
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC30428Bwu.onScaleEnd(android.view.ScaleGestureDetector):void");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, O] */
    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean z;
        CKO cko;
        boolean z2 = false;
        if (motionEvent == null) {
            return false;
        }
        if (C29306Beo.LJJI()) {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJZI;
            if (interfaceC65784Pro != null) {
                interfaceC65784Pro.invoke();
            }
        } else {
            InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJZL;
            if (interfaceC65784Pro2 != null) {
                interfaceC65784Pro2.invoke();
            }
        }
        InterfaceC30431Bwx interfaceC30431Bwx = (InterfaceC30431Bwx) this.LJLILLLLZI.kv0(MultiGuestAnchorMaskTouchEventChannel.class);
        if (interfaceC30431Bwx != null) {
            z = interfaceC30431Bwx.LIZ(motionEvent);
        } else {
            z = false;
        }
        C32811Qn c32811Qn = this.LJLLI;
        if (c32811Qn != null && !z && LiveFocusAndExposureSetting.INSTANCE.enable() && LJ(motionEvent)) {
            z2 = true;
            this.LJLLILLLL = true;
            ?? arrayList = new ArrayList();
            arrayList.add(Float.valueOf(motionEvent.getX()));
            arrayList.add(Float.valueOf(motionEvent.getY()));
            ((C32537Cpp) this.LJLILLLLZI.gv0(C55022Dy.class)).LIZ = arrayList;
            this.LJLILLLLZI.rv0(ExposureCompensationVisibleChannel.class, Boolean.TRUE);
            C70657RoD.LJJI(0.01d, new AqS155S0100000_5(this, 328));
            if (C29306Beo.LJJI()) {
                InterfaceC30359Bvn LJIILIIL = C87277YNd.LJIILIIL(this.LJLILLLLZI);
                if (LJIILIIL != null) {
                    LJIILIIL.LJJI((int) c32811Qn.LJLIL, (int) c32811Qn.LJLILLLLZI, motionEvent);
                }
            } else {
                C32811Qn c32811Qn2 = this.LJLLI;
                if (c32811Qn2 != null && (cko = this.LJLJL) != null) {
                    cko.setFocusAreas((int) c32811Qn2.LJLIL, (int) c32811Qn2.LJLILLLLZI, (int) motionEvent.getX(), (int) motionEvent.getY());
                }
            }
        }
        return z2;
    }

    @Override // X.AbstractC32821Qo
    public final boolean LIZLLL(MotionEvent event, C32811Qn c32811Qn) {
        C73411SrX c73411SrX;
        o.LJIIIZ(event, "event");
        if (this.LJLILLLLZI.kv0(LiveCenterStatusChannel.class) != EnumC30738C4o.DISMISS || this.LJLILLLLZI.kv0(LiveExtendedScreenStatus.class) != EnumC31158CKs.HIDE) {
            return false;
        }
        this.LJLLI = c32811Qn;
        int action = event.getAction() & 255;
        if (action == 0) {
            this.LJLL = false;
            if (LJ(event) && (c73411SrX = this.LJLLJ) != null) {
                c73411SrX.dispose();
            }
        }
        if (action == 1) {
            LJFF();
            this.LLD = false;
        }
        if (event.getPointerCount() > 1) {
            this.LJLL = true;
        }
        if (this.LJLL) {
            return this.LJLJLLL.onTouchEvent(event);
        }
        C16230kN c16230kN = (C16230kN) this.LJLJLJ.getValue();
        if (c16230kN == null) {
            return true;
        }
        return c16230kN.LIZ(event);
    }

    public ScaleGestureDetectorOnScaleGestureListenerC30428Bwu(Context context, DataChannel dataChannel, int i, BaseFragment fragment) {
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(fragment, "fragment");
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = i;
        this.LJLJJLL = -1.0f;
        this.LJLJL = C3Z.LIZ.LIZIZ();
        this.LJLJLJ = C221108m2.LIZIZ(new AqS155S0100000_5(this, 327));
        o.LJI(context);
        this.LJLJLLL = new ScaleGestureDetector(context, this);
        dataChannel.ov0(fragment.getViewLifecycleOwner(), ZoomCameraScaleEvent.class, new AqS171S0100000_5(this, 647));
        dataChannel.lv0(fragment.getViewLifecycleOwner(), RefreshExposureCompensationViewChannel.class, new AqS171S0100000_5(this, 648));
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.LJLLILLLL || motionEvent == null || motionEvent2 == null) {
            return false;
        }
        LJFF();
        if (this.LJLLI == null || ((!LJ(motionEvent) || Math.abs(motionEvent.getRawY() - motionEvent2.getRawY()) <= Math.abs(motionEvent.getRawX() - motionEvent2.getRawX())) && !this.LLD)) {
            return false;
        }
        this.LLD = true;
        this.LJLILLLLZI.rv0(RefreshExposureCompensationViewChannel.class, Boolean.TRUE);
        int rawY = (int) ((motionEvent.getRawY() - motionEvent2.getRawY()) * 0.01d);
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLLL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(rawY));
        }
        return true;
    }
}
