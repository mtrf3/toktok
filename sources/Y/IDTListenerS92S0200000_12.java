package Y;

import X.C16880lQ;
import X.C188727au;
import X.C26338AVi;
import X.C27949Ay1;
import X.C56K;
import X.C70929Rsb;
import X.C71096RvI;
import X.C74042T4c;
import X.C76800UCe;
import X.C78946Uyc;
import X.FMX;
import X.InterfaceC88472Yns;
import X.K5T;
import X.T5T;
import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.ss.android.ugc.aweme.ecommerce.base.sku.widget.SkuPanelCounterWidget;
import com.ss.android.ugc.aweme.ecommerce.us.osp.module.addon.USAddonOrderVH;
import com.ss.android.ugc.aweme.following.ui.assem.RelationSearchAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDTListenerS92S0200000_12 implements View.OnTouchListener {
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
            case 5:
                return onTouch$5(this, view, motionEvent);
            default:
                return false;
        }
    }

    public IDTListenerS92S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final boolean onTouch$0(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        float f;
        C74042T4c c74042T4c = (C74042T4c) iDTListenerS92S0200000_12.l0;
        if (c74042T4c.LLFFF > 0) {
            int i = c74042T4c.LJZ;
            c74042T4c.getClass();
            C74042T4c c74042T4c2 = (C74042T4c) iDTListenerS92S0200000_12.l0;
            int i2 = i - (i % c74042T4c2.LJZI);
            if (C26338AVi.LIZLLL(c74042T4c2)) {
                float x = ((C74042T4c) iDTListenerS92S0200000_12.l0).LLFF - motionEvent.getX();
                ((C74042T4c) iDTListenerS92S0200000_12.l0).getClass();
                f = (x / r1.LLFFF) * i2;
                ((C74042T4c) iDTListenerS92S0200000_12.l0).getClass();
            } else {
                float x2 = motionEvent.getX();
                float f2 = x2 - r1.LLF;
                ((C74042T4c) iDTListenerS92S0200000_12.l0).getClass();
                f = (f2 / r1.LLFFF) * i2;
                ((C74042T4c) iDTListenerS92S0200000_12.l0).getClass();
            }
            c74042T4c2.setIndicator((int) (f + 0 + 0.5d));
        }
        View.OnTouchListener onTouchListener = (View.OnTouchListener) iDTListenerS92S0200000_12.l1;
        if (onTouchListener != null) {
            return onTouchListener.onTouch(view, motionEvent);
        }
        return true;
    }

    public static final boolean onTouch$1(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                float x = motionEvent.getX();
                float f = ((C56K) iDTListenerS92S0200000_12.l0).element;
                if (x - f <= 0.0f || f == 0.0f) {
                    C27949Ay1.LJIIZILJ("more");
                } else {
                    C27949Ay1.LJIIZILJ("less");
                }
                ((C56K) iDTListenerS92S0200000_12.l0).element = motionEvent.getX();
            }
        } else {
            ((C56K) iDTListenerS92S0200000_12.l0).element = motionEvent.getX();
            USAddonOrderVH uSAddonOrderVH = (USAddonOrderVH) iDTListenerS92S0200000_12.l1;
            if (!uSAddonOrderVH.LJZL) {
                uSAddonOrderVH.LJZL = true;
                uSAddonOrderVH.LJZ.postDelayed(uSAddonOrderVH.LJZI, 1000L);
            }
        }
        return false;
    }

    public static final boolean onTouch$2(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            ((K5T) iDTListenerS92S0200000_12.l0).getEditTextView().setCursorVisible(true);
            RelationSearchAssem relationSearchAssem = (RelationSearchAssem) iDTListenerS92S0200000_12.l1;
            if (relationSearchAssem.LJLJLJ) {
                relationSearchAssem.LJLJLJ = false;
                String enterFrom = relationSearchAssem.v3().getEnterFrom();
                o.LJIIIZ(enterFrom, "enterFrom");
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", enterFrom);
                FMX.LJIIL("fans_following_page_click_search", c188727au.LIZ);
            }
        }
        return false;
    }

    public static final boolean onTouch$3(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            EditText editText = (EditText) iDTListenerS92S0200000_12.l0;
            editText.post(new ARunnableS48S0100000_12(editText, 84));
            C78946Uyc.LJJIIJ((EditText) iDTListenerS92S0200000_12.l0, new C70929Rsb(), new AqS178S0100000_12((SkuPanelCounterWidget) iDTListenerS92S0200000_12.l1, 468));
            ((SkuPanelCounterWidget) iDTListenerS92S0200000_12.l1).LJLJJLL = SystemClock.elapsedRealtime();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$4(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            C71096RvI c71096RvI = (C71096RvI) iDTListenerS92S0200000_12.l0;
            InterfaceC88472Yns<? super C71096RvI, C76800UCe> interfaceC88472Yns = c71096RvI.LJLJJLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(c71096RvI);
                T5T t5t = (T5T) iDTListenerS92S0200000_12.l1;
                t5t.post(new ARunnableS48S0100000_12(t5t, 91));
                T5T onTouch = (T5T) iDTListenerS92S0200000_12.l1;
                o.LJIIIIZZ(onTouch, "onTouch");
                C78946Uyc.LJJIIJ(onTouch, new C70929Rsb(), new AqS178S0100000_12((C71096RvI) iDTListenerS92S0200000_12.l0, 482));
                ((C71096RvI) iDTListenerS92S0200000_12.l0).LJLJL = SystemClock.elapsedRealtime();
                return false;
            }
            o.LJIJI("clickListener");
            throw null;
        }
        return false;
    }

    public static final boolean onTouch$5(IDTListenerS92S0200000_12 iDTListenerS92S0200000_12, View view, MotionEvent motionEvent) {
        View findViewById = ((View) iDTListenerS92S0200000_12.l0).findViewById(R.id.cqb);
        if (findViewById != null) {
            findViewById.clearFocus();
        }
        Object LLILL = C16880lQ.LLILL((Context) iDTListenerS92S0200000_12.l1, "input_method");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) LLILL).hideSoftInputFromWindow(((View) iDTListenerS92S0200000_12.l0).getWindowToken(), 0);
        return false;
    }
}
