package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import kotlin.jvm.internal.IDqS175S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aV2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93696aV2 extends FrameLayout {
    public static final /* synthetic */ int LJLJLJ = 0;
    public AppCompatTextView LJLIL;
    public C94210adK LJLILLLLZI;
    public C93691aUx LJLJI;
    public C94062aaw LJLJJI;
    public LinearLayout LJLJJL;
    public LinearLayout LJLJJLL;
    public View LJLJL;

    public final C93691aUx getActionContainer() {
        C93691aUx c93691aUx = this.LJLJI;
        if (c93691aUx != null) {
            return c93691aUx;
        }
        o.LJIJI("actionContainer");
        throw null;
    }

    public final View getDeleteIcon() {
        View view = this.LJLJL;
        if (view != null) {
            return view;
        }
        o.LJIJI("deleteIcon");
        throw null;
    }

    public final C94210adK getObjectContainer() {
        C94210adK c94210adK = this.LJLILLLLZI;
        if (c94210adK != null) {
            return c94210adK;
        }
        o.LJIJI("objectContainer");
        throw null;
    }

    public final LinearLayout getExtraContainer() {
        return this.LJLJJL;
    }

    public final C94062aaw getExtraSeekBar() {
        return this.LJLJJI;
    }

    public C93696aV2(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(C93902aYM.LIZIZ(this, -1, -2, 0, 0, Integer.valueOf(C93742aVm.LIZIZ(24)), null, 476));
        new IDqS419S0100000_42(this, 54).invoke(linearLayout);
        C93902aYM.LIZ(linearLayout, this);
        View view = new View(context);
        view.setLayoutParams(C93902aYM.LIZIZ(this, C93742aVm.LIZIZ(34), C93742aVm.LIZIZ(36), 0, 0, Integer.valueOf(C93742aVm.LIZIZ(8)), 8388629, 220));
        new IDqS175S0200000_42(this, context, 12).invoke(view);
        C93902aYM.LIZ(view, this);
        LinearLayout linearLayout2 = this.LJLJJLL;
        if (linearLayout2 != null) {
            LIZ(linearLayout2, null, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        } else {
            o.LJIJI("contentContainer");
            throw null;
        }
    }

    public final void LIZ(LinearLayout linearLayout, Double d, double d2, double d3) {
        LinearLayout linearLayout2;
        linearLayout.removeAllViews();
        if (d == null) {
            linearLayout.setOrientation(0);
            linearLayout2 = linearLayout;
        } else {
            linearLayout.setOrientation(1);
            linearLayout2 = new LinearLayout(linearLayout.getContext());
            linearLayout2.setLayoutParams(C93902aYM.LIZJ(linearLayout, -1, -2, 0, 0, null, null, null, null, null, null, 1020));
            C94627ak3 attrBlock = C94627ak3.LJLIL;
            o.LJIIIZ(attrBlock, "attrBlock");
            attrBlock.invoke(linearLayout2);
            C93902aYM.LIZ(linearLayout2, linearLayout);
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout2.getContext(), null);
        appCompatTextView.setLayoutParams(C93902aYM.LIZJ(linearLayout2, 0, 0, 0, 0, null, null, null, null, null, null, 1023));
        new IDqS419S0100000_42(this, 59).invoke(appCompatTextView);
        C93902aYM.LIZ(appCompatTextView, linearLayout2);
        Context context = linearLayout2.getContext();
        o.LJIIIIZZ(context, "context");
        C94210adK c94210adK = new C94210adK(context, null, 0);
        LinearLayout linearLayout3 = linearLayout2;
        c94210adK.setLayoutParams(C93902aYM.LIZJ(linearLayout3, 0, -2, 0, 0, Integer.valueOf(C93742aVm.LIZIZ(8)), null, null, null, Float.valueOf(1.0f), null, 748));
        new IDqS419S0100000_42(this, 60).invoke(c94210adK);
        C93902aYM.LIZ(c94210adK, linearLayout2);
        Context context2 = linearLayout2.getContext();
        o.LJIIIIZZ(context2, "context");
        C93691aUx c93691aUx = new C93691aUx(context2);
        LinearLayout linearLayout4 = linearLayout2;
        c93691aUx.setLayoutParams(C93902aYM.LIZJ(linearLayout4, 0, -2, 0, 0, Integer.valueOf(C93742aVm.LIZIZ(8)), null, null, null, Float.valueOf(1.0f), null, 748));
        new IDqS419S0100000_42(this, 61).invoke(c93691aUx);
        C93902aYM.LIZ(c93691aUx, linearLayout2);
        if (d != null) {
            LIZIZ(linearLayout, d2, d3, d.doubleValue());
        }
    }

    public final void LIZIZ(LinearLayout linearLayout, double d, double d2, double d3) {
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        linearLayout2.setLayoutParams(C93902aYM.LIZJ(linearLayout, -1, -2, 0, 0, null, null, Integer.valueOf(C93742aVm.LIZIZ(6)), null, null, null, 956));
        new C94628ak4(this, d, d2, d3).invoke(linearLayout2);
        C93902aYM.LIZ(linearLayout2, linearLayout);
    }
}
