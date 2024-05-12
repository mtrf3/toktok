package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Cc5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31685Cc5 extends ConstraintLayout {
    public ImageView LJLIL;
    public TextView LJLILLLLZI;
    public View LJLJI;
    public TextView LJLJJI;
    public ImageView LJLJJL;

    private int getLayoutId() {
        return R.layout.djp;
    }

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    public final void LJJLJLI() {
        this.LJLJI.setVisibility(8);
        this.LJLJJL.setVisibility(8);
        this.LJLJJI.setVisibility(8);
    }

    public ImageView getAlertImageView() {
        return this.LJLJJL;
    }

    public TextView getAlertText() {
        return this.LJLJJI;
    }

    public ImageView getIconView() {
        return this.LJLIL;
    }

    public View getRedDotView() {
        return this.LJLJI;
    }

    public TextView getTextView() {
        return this.LJLILLLLZI;
    }

    public void setIconMarginTop(int i) {
        ImageView imageView = this.LJLIL;
        if (imageView == null || !(imageView.getLayoutParams() instanceof C018905p)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.LJLIL.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.LJLIL.setLayoutParams(marginLayoutParams);
    }

    public C31685Cc5(ActivityC45651qj activityC45651qj, int i) {
        super(activityC45651qj, null, 0);
        ViewGroup.inflate(getContext(), getLayoutId(), this);
        this.LJLIL = (ImageView) findViewById(R.id.ldg);
        this.LJLILLLLZI = (TextView) findViewById(R.id.ldf);
        this.LJLJJI = (TextView) findViewById(R.id.ld8);
        this.LJLJJL = (ImageView) findViewById(R.id.ld6);
        this.LJLJI = findViewById(R.id.ldc);
    }
}
