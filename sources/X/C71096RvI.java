package X;

import Y.IDObjectS183S0100000_12;
import Y.IDTListenerS92S0200000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.core.utils.KeyBoardVisibilityUtil;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RvI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71096RvI extends LinearLayout implements InterfaceC71003Rtn {
    public int LJLIL;
    public C70109RfN LJLILLLLZI;
    public String LJLJI;
    public InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> LJLJJI;
    public InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> LJLJJL;
    public InterfaceC88472Yns<? super C71096RvI, C76800UCe> LJLJJLL;
    public long LJLJL;
    public int LJLJLJ;
    public C27959AyB LJLJLLL;
    public C71094RvG LJLL;
    public final C62822Ol8 LJLLI;
    public boolean LJLLILLLL;
    public final java.util.Map<Integer, View> LJLLJ;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLJ;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final List<View> getCounterViews() {
        return (List) this.LJLLI.getValue();
    }

    public final void LIZIZ() {
        int i;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.gp, context);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        int LJIIIIZZ2 = AnonymousClass636.LJIIIIZZ(R.attr.go, context2);
        TuxIconView tuxIconView = (TuxIconView) LIZ(R.id.bwk);
        if (this.LJLIL >= this.LJLILLLLZI.LJLILLLLZI) {
            i = LJIIIIZZ;
        } else {
            i = LJIIIIZZ2;
        }
        tuxIconView.setTintColor(i);
        TuxIconView tuxIconView2 = (TuxIconView) LIZ(R.id.bwj);
        if (this.LJLIL > this.LJLILLLLZI.LJLIL) {
            LJIIIIZZ = LJIIIIZZ2;
        }
        tuxIconView2.setTintColor(LJIIIIZZ);
    }

    public final EditText getInput() {
        EditText counter_input = (EditText) LIZ(R.id.bwi);
        o.LJIIIIZZ(counter_input, "counter_input");
        return counter_input;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC71003Rtn
    public List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        C78915Uy7.LJJIL(c70858RrS, new AqS178S0100000_12(this, 182));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLILLLL) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setClickListener(InterfaceC88472Yns<? super C71096RvI, C76800UCe> l) {
        o.LJIIIZ(l, "l");
        this.LJLJJLL = l;
    }

    public final void setKeyBoardHeightListener(InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> l) {
        o.LJIIIZ(l, "l");
        this.LJLJJL = l;
    }

    public final void setPurchaseNoticeHelper(C71094RvG helper) {
        o.LJIIIZ(helper, "helper");
        this.LJLL = helper;
    }

    public final void setQuantity(int i) {
        this.LJLIL = i;
        ((TextView) LIZ(R.id.bwi)).setText(String.valueOf(this.LJLIL));
        if (LIZ(R.id.bwi).hasFocus()) {
            ((EditText) LIZ(R.id.bwi)).setSelection(String.valueOf(this.LJLIL).length());
        }
        LIZIZ();
    }

    public final void setQuantityChangeListener(InterfaceC88471Ynr<? super Integer, ? super String, C76800UCe> l) {
        o.LJIIIZ(l, "l");
        this.LJLJJI = l;
    }

    public final void setQuantityLimit(C70109RfN quantityLimit) {
        o.LJIIIZ(quantityLimit, "quantityLimit");
        this.LJLILLLLZI = quantityLimit;
    }

    public final void setSku(C27959AyB skuInfoVO) {
        o.LJIIIZ(skuInfoVO, "skuInfoVO");
        this.LJLJLLL = skuInfoVO;
    }

    public final void setSkuId(String id) {
        o.LJIIIZ(id, "id");
        this.LJLJI = id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71096RvI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLJ = C62850Ola.LJFF(context, "context");
        this.LJLILLLLZI = new C70109RfN(1, 200);
        this.LJLJI = "";
        this.LJLJJI = C71232qt.LJLIL;
        this.LJLJL = -1L;
        this.LJLJLJ = -1;
        this.LJLLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1121));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a5i, this, true);
        if (context instanceof C29S) {
            new KeyBoardVisibilityUtil((C1AU) context, 32, new AqS194S0100000_12(this, 213));
        }
        View counter_plus = LIZ(R.id.bwk);
        o.LJIIIIZZ(counter_plus, "counter_plus");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 79, 42, 42), counter_plus);
        View counter_plus2 = LIZ(R.id.bwk);
        o.LJIIIIZZ(counter_plus2, "counter_plus");
        C78946Uyc.LJJIIJZLJL(counter_plus2, new C70918RsQ(0), C71098RvK.LJLIL, C70780RqC.LJLIL);
        View counter_minus = LIZ(R.id.bwj);
        o.LJIIIIZZ(counter_minus, "counter_minus");
        C16880lQ.LJIIJ(new Au2S20S0100000_12(this, 80, 42, 42), counter_minus);
        View counter_minus2 = LIZ(R.id.bwj);
        o.LJIIIIZZ(counter_minus2, "counter_minus");
        C78946Uyc.LJJIIJZLJL(counter_minus2, new C70918RsQ(0), C71099RvL.LJLIL, C70781RqD.LJLIL);
        T5T t5t = (T5T) LIZ(R.id.bwi);
        t5t.setOnTouchListener(new IDTListenerS92S0200000_12(t5t, this, 4));
        t5t.addTextChangedListener(new IDObjectS183S0100000_12(this, 8));
        t5t.setKeyListener(new C70411RkF());
        if (C90193gN.LIZ()) {
            LIZ(R.id.bwj).setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ab_));
            LIZ(R.id.bwk).setBackground(C04270Et.LIZIZ(getContext(), R.drawable.ab9));
        }
    }
}
