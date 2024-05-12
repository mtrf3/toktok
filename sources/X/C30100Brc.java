package X;

import Y.AObjectS42S0101000_5;
import Y.AObjectS49S0101000_4;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Brc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30100Brc extends SJC {
    public final BaseFragment LJLIL;
    public final DataChannel LJLILLLLZI;
    public final View LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC88472Yns<MotionEvent, Boolean> LJLJJL;
    public final InterfaceC88474Ynu<MotionEvent, MotionEvent, Float, Float, Boolean> LJLJJLL;
    public final InterfaceC88474Ynu<MotionEvent, MotionEvent, Float, Float, Boolean> LJLJL = null;
    public final InterfaceC88472Yns<MotionEvent, Boolean> LJLJLJ = null;
    public final InterfaceC88472Yns<? super MotionEvent, Boolean> LJLJLLL;

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        InterfaceC88472Yns<? super MotionEvent, Boolean> interfaceC88472Yns = this.LJLJLLL;
        if (interfaceC88472Yns == null || !interfaceC88472Yns.invoke(motionEvent).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Boolean bool;
        Object obj;
        InputMethodManager inputMethodManager;
        ActivityC45651qj mo49getActivity;
        BaseFragment baseFragment = this.LJLIL;
        IBinder iBinder = null;
        if (baseFragment != null) {
            bool = Boolean.valueOf(baseFragment.isViewValid());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            try {
                BaseFragment baseFragment2 = this.LJLIL;
                if (baseFragment2 != null && (mo49getActivity = baseFragment2.mo49getActivity()) != null) {
                    obj = C16880lQ.LLILLJJLI(mo49getActivity, "input_method");
                } else {
                    obj = null;
                }
                if ((obj instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) obj) != null) {
                    View view = this.LJLJI;
                    if (view != null) {
                        iBinder = view.getWindowToken();
                    }
                    inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                    return true;
                }
                return true;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return true;
            }
        }
        return true;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        super.onLongPress(motionEvent);
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel == null || dataChannel.kv0(RoomChannel.class) == null) {
            return;
        }
        C73943T0h.LIZ().LIZIZ(new C28268B7o());
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro == null) {
            return;
        }
        interfaceC65784Pro.invoke();
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        boolean onSingleTapConfirmed;
        if (motionEvent != null) {
            InterfaceC88472Yns<MotionEvent, Boolean> interfaceC88472Yns = this.LJLJJL;
            if (interfaceC88472Yns != null) {
                onSingleTapConfirmed = interfaceC88472Yns.invoke(motionEvent).booleanValue();
            } else {
                onSingleTapConfirmed = super.onSingleTapConfirmed(motionEvent);
            }
            if (onSingleTapConfirmed) {
                return true;
            }
        }
        return false;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (motionEvent != null && motionEvent2 != null && this.LJLJJLL.invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        InterfaceC88474Ynu<MotionEvent, MotionEvent, Float, Float, Boolean> interfaceC88474Ynu;
        if (motionEvent == null || motionEvent2 == null || (interfaceC88474Ynu = this.LJLJL) == null || !interfaceC88474Ynu.invoke(motionEvent, motionEvent2, Float.valueOf(f), Float.valueOf(f2)).booleanValue()) {
            return false;
        }
        return true;
    }

    public C30100Brc(BaseFragment baseFragment, DataChannel dataChannel, View view, AObjectS49S0101000_4 aObjectS49S0101000_4, AObjectS42S0101000_5 aObjectS42S0101000_5, C30106Bri c30106Bri, AObjectS42S0101000_5 aObjectS42S0101000_52) {
        this.LJLIL = baseFragment;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = view;
        this.LJLJJI = aObjectS49S0101000_4;
        this.LJLJJL = aObjectS42S0101000_5;
        this.LJLJJLL = c30106Bri;
        this.LJLJLLL = aObjectS42S0101000_52;
    }
}
