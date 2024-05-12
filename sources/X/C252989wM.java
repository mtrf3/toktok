package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9wM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public class C252989wM extends LinearLayout {
    public final boolean LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public View LIZIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
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

    public View getContentView() {
        return null;
    }

    public int getContentViewLayoutId() {
        return -1;
    }

    public View getFooterView() {
        return null;
    }

    public int getFooterViewLayoutId() {
        return -1;
    }

    public final void LIZJ() {
        C252969wK c252969wK = (C252969wK) LIZIZ(R.id.eoa);
        c252969wK.LJLIL.setBackgroundColor(c252969wK.LJLJJI);
        c252969wK.LJLILLLLZI.setVisibility(8);
    }

    public final void LIZLLL(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        LIZIZ(R.id.x5).setVisibility(0);
        ((TextView) LIZIZ(R.id.x5)).setText(str);
    }

    public final void LJ(C253009wO c253009wO) {
        int i;
        if (c253009wO != null) {
            C252969wK c252969wK = (C252969wK) LIZIZ(R.id.eoa);
            c252969wK.getClass();
            if (c252969wK.LJLJJLL) {
                c252969wK.LJLIL.setVisibility(0);
                View view = c252969wK.LJLIL;
                if (C78897Uxp.LJJIJL(c253009wO)) {
                    i = c252969wK.LJLJJI;
                } else {
                    i = c252969wK.LJLJJL;
                }
                view.setBackgroundColor(i);
            } else {
                c252969wK.LJLIL.setVisibility(8);
            }
            String str = c253009wO.LIZ;
            if (str != null && str.length() > 0) {
                c252969wK.LJLILLLLZI.setVisibility(0);
                c252969wK.LJLJI.setText(c253009wO.LIZ);
                if (c253009wO.LIZIZ == EnumC253019wP.Tips) {
                    TextView textView = c252969wK.LJLJI;
                    Context context = c252969wK.getContext();
                    o.LJIIIIZZ(context, "context");
                    textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context));
                    ((TuxIconView) c252969wK.LIZ()).setIconRes(R.raw.icon_exclamation_mark_circle);
                    ((TuxIconView) c252969wK.LIZ()).setTintColorRes(R.attr.gu);
                    return;
                }
                TextView textView2 = c252969wK.LJLJI;
                Context context2 = c252969wK.getContext();
                o.LJIIIIZZ(context2, "context");
                textView2.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.e7, context2));
                ((TuxIconView) c252969wK.LIZ()).setIconRes(R.raw.icon_exclamation_mark_triangle_fill);
                ((TuxIconView) c252969wK.LIZ()).setTintColorRes(R.attr.e7);
            }
        }
    }

    public final void setTitle(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LIZIZ(R.id.title).setVisibility(8);
            LIZIZ(R.id.l9p).setVisibility(0);
        } else {
            LIZIZ(R.id.title).setVisibility(0);
            LIZIZ(R.id.l9p).setVisibility(8);
            ((TextView) LIZIZ(R.id.title)).setText(str);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C252989wM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C252989wM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.x_, this);
        this.LJLIL = true;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        int contentViewLayoutId = getContentViewLayoutId();
        View contentView = getContentView();
        if (contentViewLayoutId != -1) {
            View.inflate(context, contentViewLayoutId, this);
        } else if (contentView != null) {
            addView(contentView);
        }
        int footerViewLayoutId = getFooterViewLayoutId();
        View inflate = footerViewLayoutId != -1 ? View.inflate(context, footerViewLayoutId, null) : getFooterView();
        if (inflate != null) {
            ((ViewGroup) LIZIZ(R.id.dlo)).addView(inflate);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.LJLIL) {
            ((ViewGroup) LIZIZ(R.id.bt5)).addView(view, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }
}
