package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WlP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83223WlP extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLL = 0;
    public final C83224WlQ LJLIL;
    public final ImageView LJLILLLLZI;
    public final View LJLJI;
    public final Context LJLJJI;
    public final C62822Ol8 LJLJJL;
    public AqS196S0100000_14 LJLJJLL;
    public AqS164S0100000_14 LJLJL;
    public final View LJLJLJ;
    public final C83221WlN LJLJLLL;

    public final void M() {
        int i;
        ValueAnimator valueAnimator = (ValueAnimator) this.LJLJJL.getValue();
        if (valueAnimator.isRunning()) {
            valueAnimator.cancel();
        }
        ImageView ivDownload = this.LJLILLLLZI;
        o.LJIIIIZZ(ivDownload, "ivDownload");
        ivDownload.setRotation(0.0f);
        this.LJLJLLL.getClass();
        Integer num = 0;
        if (num.intValue() != 0) {
            i = num.intValue();
        } else {
            i = R.drawable.tf;
        }
        this.LJLILLLLZI.setImageResource(i);
    }

    public void N(boolean z) {
        float f;
        View view = this.LJLJLJ;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.34f;
        }
        view.setAlpha(f);
    }

    public C83223WlP(View view, C83221WlN c83221WlN) {
        super(view);
        this.LJLJLJ = view;
        this.LJLJLLL = c83221WlN;
        this.LJLIL = (C83224WlQ) this.itemView.findViewById(R.id.evm);
        this.LJLILLLLZI = (ImageView) this.itemView.findViewById(R.id.ez8);
        this.LJLJI = this.itemView.findViewById(R.id.evo);
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        this.LJLJJI = context;
        this.LJLJJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 510));
    }

    public final void L(boolean z, boolean z2) {
        float f;
        float f2;
        float f3 = 12.0f;
        if (this.LJLJLLL.LJIILIIL) {
            f2 = 16.0f;
            f3 = 8.0f;
            f = 12.0f;
        } else {
            f = 20.0f;
            f2 = 20.0f;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        ViewGroup.LayoutParams layoutParams = itemView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.rightMargin = (int) C74275TDb.LIZIZ(this.LJLJJI, f3);
            if (z) {
                marginLayoutParams.leftMargin = (int) C74275TDb.LIZIZ(this.LJLJJI, f2);
            } else {
                marginLayoutParams.leftMargin = 0;
            }
            marginLayoutParams.setMarginEnd((int) C74275TDb.LIZIZ(this.LJLJJI, f3));
            if (z) {
                marginLayoutParams.setMarginStart((int) C74275TDb.LIZIZ(this.LJLJJI, f2));
            } else {
                marginLayoutParams.setMarginStart(0);
            }
            if (z2) {
                marginLayoutParams.rightMargin = (int) C74275TDb.LIZIZ(this.LJLJJI, f);
                marginLayoutParams.setMarginEnd((int) C74275TDb.LIZIZ(this.LJLJJI, f));
            }
            View itemView2 = this.itemView;
            o.LJIIIIZZ(itemView2, "itemView");
            itemView2.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
