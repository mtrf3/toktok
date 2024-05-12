package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.76S, reason: invalid class name */
/* loaded from: classes4.dex */
public class C76S extends FrameLayout implements InterfaceC176226vq {
    public LinearLayout LJLIL;
    public ObjectAnimator LJLILLLLZI;
    public boolean LJLJI;
    public TuxTextView LJLJJI;
    public String LJLJJL;

    @Override // X.InterfaceC176226vq
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC176226vq
    public final void LIZIZ() {
    }

    public C76S(Context context) {
        this(context, null);
    }

    public void setDefaultLoadingText(String str) {
        this.LJLJJL = str;
    }

    @Override // X.InterfaceC176226vq
    public void setLoading(boolean z) {
        int i;
        if (this.LJLJI == z) {
            return;
        }
        if (z) {
            String string = getContext().getString(R.string.dm9);
            if (!TextUtils.isEmpty(this.LJLJJL)) {
                string = this.LJLJJL;
            }
            this.LJLJJI.setText(string);
            this.LJLILLLLZI.start();
            i = 0;
        } else {
            ObjectAnimator objectAnimator = this.LJLILLLLZI;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            i = 8;
        }
        setVisibility(i);
        this.LJLJI = z;
    }

    public void setLoadingText(int i) {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(i);
        }
    }

    @Override // X.InterfaceC176226vq
    public void setViewVisibility(int i) {
        setVisibility(i);
    }

    public void setLoadingText(String str) {
        TuxTextView tuxTextView = this.LJLJJI;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public C76S(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLIL = linearLayout;
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.LJLIL.setOrientation(0);
        this.LJLIL.setGravity(16);
        TuxIconView tuxIconView = new TuxIconView(getContext());
        tuxIconView.setIconRes(R.raw.icon_spinner_normal);
        tuxIconView.setTintColor(R.attr.gu);
        ObjectAnimator duration = ObjectAnimator.ofFloat(tuxIconView, "rotation", 0.0f, 360.0f).setDuration(800L);
        this.LJLILLLLZI = duration;
        C149985uc.LIZ(duration);
        this.LJLILLLLZI.setRepeatCount(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C32151Nz.LJIILLIIL(14), C32151Nz.LJIILLIIL(14));
        layoutParams.gravity = 16;
        tuxIconView.setLayoutParams(layoutParams);
        this.LJLIL.addView(tuxIconView);
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.gs);
        this.LJLJJI = tuxTextView;
        tuxTextView.setText(R.string.dm9);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = (int) KL2.LIZJ(getContext(), 1.0f);
        layoutParams2.gravity = 16;
        this.LJLJJI.setLayoutParams(layoutParams2);
        this.LJLIL.addView(this.LJLJJI);
        addView(this.LJLIL);
        setLoading(false);
    }
}
