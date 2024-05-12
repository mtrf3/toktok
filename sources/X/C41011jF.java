package X;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.1jF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C41011jF extends C1K6 implements InterfaceC12860ew {
    public static final /* synthetic */ int LJLJJL = 0;
    public TextView LJLJI;
    public LinearLayout LJLJJI;

    public void setButtonOrientation(int i) {
        this.LJLJJI.setOrientation(i);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof Space) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.LJLJJI.getOrientation() == 1) {
                    layoutParams.width = -2;
                    layoutParams.height = getContext().getResources().getDimensionPixelSize(R.dimen.x2);
                } else {
                    layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.xk);
                    layoutParams.height = -2;
                }
                childAt.setLayoutParams(layoutParams);
            }
        }
        for (int i3 = 0; i3 < this.LJLJJI.getChildCount(); i3++) {
            View childAt2 = this.LJLJJI.getChildAt(i3);
            if (!(childAt2 instanceof Space)) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                if (i == 1) {
                    layoutParams2.width = -1;
                    layoutParams2.weight = 0.0f;
                } else {
                    layoutParams2.width = 0;
                    layoutParams2.weight = 1.0f;
                }
                childAt2.setLayoutParams(layoutParams2);
            }
        }
    }

    public void setTopText(CharSequence charSequence) {
        this.LJLJI.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            this.LJLJI.setVisibility(8);
        } else {
            this.LJLJI.setVisibility(0);
        }
    }

    public C41011jF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LinearLayout.inflate(getContext(), R.layout.bpm, this);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.xi);
        setPadding(dimensionPixelSize, getContext().getResources().getDimensionPixelSize(R.dimen.xj), dimensionPixelSize, getContext().getResources().getDimensionPixelSize(R.dimen.xc));
        setOrientation(1);
        TextView textView = (TextView) findViewById(R.id.apy);
        this.LJLJI = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.LJLJJI = (LinearLayout) findViewById(R.id.apt);
    }
}
