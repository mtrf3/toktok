package Y;

import X.AbstractC1041546x;
import X.C212418Vh;
import X.C4EN;
import X.C4EU;
import X.C4NJ;
import X.C76800UCe;
import X.C93363lU;
import X.C95003o8;
import X.EnumC105154At;
import X.InterfaceC88472Yns;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.ecomsearch.videoinnerflow.ui.EcomSearchSwipeGuideUiComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.setlist.StickerSetContentCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.setlist.StickerSetContentCell2;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.edittext.IMInputEditTextAssem;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDTListenerS111S0100000_1 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            case 9:
                return onTouch$9(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS111S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            C93363lU.LIZJ("share");
            ((C4NJ) iDTListenerS111S0100000_1.l0).LJLILLLLZI.requestFocus();
            KeyboardUtils.LIZLLL(((C4NJ) iDTListenerS111S0100000_1.l0).LJLILLLLZI);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        C212418Vh.LJIIJJI(((StickerSetContentCell) iDTListenerS111S0100000_1.l0).M(), new AqS132S0200000_1(motionEvent, (StickerSetContentCell) iDTListenerS111S0100000_1.l0, 13));
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        C212418Vh.LJIIJJI(((StickerSetContentCell2) iDTListenerS111S0100000_1.l0).N(), new AqS132S0200000_1(motionEvent, (StickerSetContentCell2) iDTListenerS111S0100000_1.l0, 14));
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            ((IMInputEditTextAssem) iDTListenerS111S0100000_1.l0).A3().tr(EnumC105154At.KEYBOARD);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        ((AbstractC1041546x) iDTListenerS111S0100000_1.l0).LLFII.LIZJ(v, ((AbstractC1041546x) iDTListenerS111S0100000_1.l0).LJLIL.getMessagePositionType(), event);
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        InterfaceC88472Yns<C4EN, C76800UCe> onDismissCallback;
        if (motionEvent != null && motionEvent.getAction() == 0 && (onDismissCallback = ((C4EU) iDTListenerS111S0100000_1.l0).getOnDismissCallback()) != null) {
            onDismissCallback.invoke(C4EN.CLICK_OUTSIDE);
        }
        return false;
    }

    public static final boolean onTouch$6(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 1) {
            ((EcomSearchSwipeGuideUiComponent) iDTListenerS111S0100000_1.l0).dismiss();
        }
        return true;
    }

    public static final boolean onTouch$7(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        return ((GestureDetector) iDTListenerS111S0100000_1.l0).onTouchEvent(motionEvent);
    }

    public static final boolean onTouch$8(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        PthreadTimer pthreadTimer;
        if (motionEvent.getAction() == 0 && (pthreadTimer = ((VideoCreationTailFragment) iDTListenerS111S0100000_1.l0).LJLLLLLL) != null) {
            pthreadTimer.cancel();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$9(IDTListenerS111S0100000_1 iDTListenerS111S0100000_1, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            ((C95003o8) iDTListenerS111S0100000_1.l0).LIZ = (int) motionEvent.getRawY();
            return false;
        }
        return false;
    }
}
