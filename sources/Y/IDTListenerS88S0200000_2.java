package Y;

import X.C1296857c;
import X.C157416Ft;
import X.C168266j0;
import X.C171236nn;
import X.C171246no;
import X.C171266nq;
import X.C188727au;
import X.C24540xm;
import X.C26338AVi;
import X.C45804HyK;
import X.C6G4;
import X.C78915Uy7;
import X.GXR;
import X.InterfaceC1286253a;
import X.InterfaceC168276j1;
import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class IDTListenerS88S0200000_2 implements View.OnTouchListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                return false;
        }
    }

    public IDTListenerS88S0200000_2(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final boolean onTouch$0(IDTListenerS88S0200000_2 iDTListenerS88S0200000_2, View view, MotionEvent motionEvent) {
        InterfaceC168276j1 onSliderListener;
        float f;
        int min;
        C168266j0 c168266j0 = (C168266j0) iDTListenerS88S0200000_2.l0;
        if (c168266j0.LLIFFJFJJ > 0) {
            int max = c168266j0.getMax() - ((((C168266j0) iDTListenerS88S0200000_2.l0).getMax() - ((C168266j0) iDTListenerS88S0200000_2.l0).getMin()) % ((C168266j0) iDTListenerS88S0200000_2.l0).getStep());
            C168266j0 c168266j02 = (C168266j0) iDTListenerS88S0200000_2.l0;
            c168266j02.LJLZ = true;
            if (C26338AVi.LIZLLL(c168266j02)) {
                float x = ((C168266j0) iDTListenerS88S0200000_2.l0).LLI - motionEvent.getX();
                float min2 = max - ((C168266j0) iDTListenerS88S0200000_2.l0).getMin();
                f = (x / r1.LLIFFJFJJ) * min2;
                min = ((C168266j0) iDTListenerS88S0200000_2.l0).getMin();
            } else {
                float x2 = motionEvent.getX();
                float f2 = x2 - r1.LLFZ;
                float min3 = max - ((C168266j0) iDTListenerS88S0200000_2.l0).getMin();
                f = (f2 / r1.LLIFFJFJJ) * min3;
                min = ((C168266j0) iDTListenerS88S0200000_2.l0).getMin();
            }
            c168266j02.setIndicator((int) (f + min + 0.5d));
            ((C168266j0) iDTListenerS88S0200000_2.l0).LJLZ = false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && (onSliderListener = ((C168266j0) iDTListenerS88S0200000_2.l0).getOnSliderListener()) != null) {
                onSliderListener.LIZ((C168266j0) iDTListenerS88S0200000_2.l0);
            }
        } else {
            InterfaceC168276j1 onSliderListener2 = ((C168266j0) iDTListenerS88S0200000_2.l0).getOnSliderListener();
            if (onSliderListener2 != null) {
                onSliderListener2.LIZJ((C168266j0) iDTListenerS88S0200000_2.l0);
            }
        }
        View.OnTouchListener onTouchListener = (View.OnTouchListener) iDTListenerS88S0200000_2.l1;
        if (onTouchListener == null) {
            return true;
        }
        return onTouchListener.onTouch(view, motionEvent);
    }

    public static final boolean onTouch$1(IDTListenerS88S0200000_2 iDTListenerS88S0200000_2, View view, MotionEvent motionEvent) {
        C171236nn c171236nn;
        C171266nq c171266nq = (C171266nq) iDTListenerS88S0200000_2.l0;
        View view2 = (View) iDTListenerS88S0200000_2.l1;
        int adapterPosition = c171266nq.getAdapterPosition();
        if (-1 == adapterPosition || ((EffectModel) ListProtector.get(c171266nq.LJLJL.LJLILLLLZI, adapterPosition)).isGoToCapCutEffect) {
            return false;
        }
        int action = motionEvent.getAction();
        C171246no c171246no = c171266nq.LJLJL;
        if (!c171246no.LJLJJL && (action == 5 || action == 0)) {
            Activity LJIJJ = C45804HyK.LJIJJ(view2.getContext());
            if (LJIJJ != null) {
                C24540xm.LIZ(R.string.i_p, LJIJJ, 1010);
            }
        } else if (action != 0) {
            if ((action == 1 || action == 3) && ((c171236nn = c171246no.LJLJJI) == null || c171236nn.LIZ(1, adapterPosition, (EffectModel) ListProtector.get(c171246no.LJLILLLLZI, adapterPosition)))) {
                c171266nq.LJLJI.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100L).start();
            }
        } else {
            C171236nn c171236nn2 = c171246no.LJLJJI;
            if (c171236nn2 == null || c171236nn2.LIZ(0, adapterPosition, (EffectModel) ListProtector.get(c171246no.LJLILLLLZI, adapterPosition))) {
                c171266nq.LJLJI.animate().scaleX(1.2f).scaleY(1.2f).setDuration(100L).start();
            }
        }
        return true;
    }

    public static final boolean onTouch$2(IDTListenerS88S0200000_2 iDTListenerS88S0200000_2, View view, MotionEvent motionEvent) {
        String string = ((C6G4) iDTListenerS88S0200000_2.l0).getString(R.string.rv);
        o.LJIIIIZZ(string, "getString(R.string.QA_record_sticker_toast)");
        C157416Ft c157416Ft = (C157416Ft) iDTListenerS88S0200000_2.l1;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(string);
        C78915Uy7.LJJIJ(c157416Ft, 3024, creativeToastBuilder);
        GXR.LIZ("qa_sticker_adjust_warn", new C188727au().LIZ);
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS88S0200000_2 iDTListenerS88S0200000_2, View view, MotionEvent motionEvent) {
        InterfaceC1286253a interfaceC1286253a = (InterfaceC1286253a) iDTListenerS88S0200000_2.l0;
        C1296857c c1296857c = (C1296857c) iDTListenerS88S0200000_2.l1;
        interfaceC1286253a.LIZIZ(c1296857c.LJLIL, c1296857c.LJLJI, c1296857c.LJLJJI, motionEvent);
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS88S0200000_2 iDTListenerS88S0200000_2, View view, MotionEvent motionEvent) {
        view.setVisibility(8);
        boolean contains = ((Rect) iDTListenerS88S0200000_2.l0).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        boolean contains2 = ((Rect) iDTListenerS88S0200000_2.l1).contains((int) motionEvent.getX(), (int) motionEvent.getY());
        if (contains || contains2) {
            return true;
        }
        return false;
    }
}
