package Y;

import X.C34B;
import X.C4BT;
import X.C4NH;
import X.C55096Ljo;
import X.C60996Nwm;
import X.C73340SqO;
import X.C99603vY;
import X.InterfaceC99593vX;
import X.O6R;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.base.BaseInputView;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatInputAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatInputVM;
import java.util.Iterator;
import kotlin.jvm.internal.AqS26S0001000_1;

/* loaded from: classes2.dex */
public class IDLListenerS189S0100000_1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    public static final void onGlobalLayout$3(IDLListenerS189S0100000_1 iDLListenerS189S0100000_1) {
        C4BT.LIZLLL((C4BT) iDLListenerS189S0100000_1.l0);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                return;
            case 1:
                onGlobalLayout$1(this);
                return;
            case 2:
                onGlobalLayout$2(this);
                return;
            case 3:
                onGlobalLayout$3(this);
                return;
            case 4:
                onGlobalLayout$4(this);
                return;
            default:
                return;
        }
    }

    public static final void onGlobalLayout$0(IDLListenerS189S0100000_1 iDLListenerS189S0100000_1) {
        View view = ((BaseInputView) iDLListenerS189S0100000_1.l0).LJLJJLL;
        if (view != null && view.getVisibility() == 0) {
            return;
        }
        C34B.LJI("BaseInputView", "edit text is not visible, will reset keyboard");
        ((BaseInputView) iDLListenerS189S0100000_1.l0).LJIILJJIL();
    }

    public static final void onGlobalLayout$1(IDLListenerS189S0100000_1 iDLListenerS189S0100000_1) {
        Lifecycle.State state;
        Fragment LJIIIZ;
        Lifecycle lifecycle;
        Fragment LJIIIZ2 = C55096Ljo.LJIIIZ((GroupChatInputAssem) iDLListenerS189S0100000_1.l0);
        if (LJIIIZ2 != null && (lifecycle = LJIIIZ2.getLifecycle()) != null) {
            state = lifecycle.getCurrentState();
        } else {
            state = null;
        }
        if (state != Lifecycle.State.DESTROYED && (LJIIIZ = C55096Ljo.LJIIIZ((GroupChatInputAssem) iDLListenerS189S0100000_1.l0)) != null && !LJIIIZ.isDetached()) {
            try {
                int[] iArr = new int[2];
                ((GroupChatInputAssem) iDLListenerS189S0100000_1.l0).getContainerView().getLocationOnScreen(iArr);
                ((GroupChatInputVM) ((GroupChatInputAssem) iDLListenerS189S0100000_1.l0).LJLLLL.getValue()).setStateImmediate(new AqS26S0001000_1(iArr[1], 6));
            } catch (Exception e) {
                String str = ((GroupChatInputAssem) iDLListenerS189S0100000_1.l0).LJLLLLLL;
                String message = e.getMessage();
                if (message == null) {
                    message = "failed to get VM in onGlobalLayoutListener";
                }
                C34B.LIZJ(str, message);
            }
        }
    }

    public static final void onGlobalLayout$2(IDLListenerS189S0100000_1 iDLListenerS189S0100000_1) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View rootView;
        if (C73340SqO.LJJIJ(((C4NH) iDLListenerS189S0100000_1.l0).LLIILZL)) {
            Rect rect = new Rect();
            View LJJIFFI = ((C4NH) iDLListenerS189S0100000_1.l0).LJJIFFI();
            if (LJJIFFI != null) {
                LJJIFFI.getWindowVisibleDisplayFrame(rect);
            }
            View LJJIFFI2 = ((C4NH) iDLListenerS189S0100000_1.l0).LJJIFFI();
            if (LJJIFFI2 != null && (rootView = LJJIFFI2.getRootView()) != null) {
                i = rootView.getHeight();
            } else {
                i = 0;
            }
            if (i - rect.bottom > i * 0.15d) {
                C4NH c4nh = (C4NH) iDLListenerS189S0100000_1.l0;
                if (!c4nh.LLILIL) {
                    c4nh.LLILIL = true;
                    FrameLayout LJJI = c4nh.LJJI();
                    if (LJJI != null && (layoutParams2 = LJJI.getLayoutParams()) != null) {
                        layoutParams2.height = -1;
                    }
                    FrameLayout LJJI2 = ((C4NH) iDLListenerS189S0100000_1.l0).LJJI();
                    if (LJJI2 != null) {
                        LJJI2.requestLayout();
                        return;
                    }
                    return;
                }
                return;
            }
            C4NH c4nh2 = (C4NH) iDLListenerS189S0100000_1.l0;
            if (!c4nh2.LLILIL) {
                return;
            }
            c4nh2.LLILIL = false;
            FrameLayout LJJI3 = c4nh2.LJJI();
            if (LJJI3 != null && (layoutParams = LJJI3.getLayoutParams()) != null) {
                layoutParams.height = O6R.LJJIIZ(C60996Nwm.LJ(((C4NH) iDLListenerS189S0100000_1.l0).LLIILZL) * 0.73f);
            }
            FrameLayout LJJI4 = ((C4NH) iDLListenerS189S0100000_1.l0).LJJI();
            if (LJJI4 == null) {
                return;
            }
            LJJI4.requestLayout();
        }
    }

    public static final void onGlobalLayout$4(IDLListenerS189S0100000_1 iDLListenerS189S0100000_1) {
        boolean z;
        C99603vY c99603vY = (C99603vY) iDLListenerS189S0100000_1.l0;
        c99603vY.getClass();
        Rect rect = new Rect();
        c99603vY.LIZJ.getWindowVisibleDisplayFrame(rect);
        int intValue = c99603vY.LIZIZ.invoke().intValue() - rect.bottom;
        if (intValue > 0) {
            z = true;
        } else {
            z = false;
        }
        if (intValue != c99603vY.LIZLLL) {
            Iterator<InterfaceC99593vX> it = c99603vY.LJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(intValue, z);
            }
        }
        c99603vY.LIZLLL = intValue;
    }

    public IDLListenerS189S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
