package X;

import Y.ACListenerS25S0101000_7;
import Y.IDiS269S0100000_7;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Hvp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C45649Hvp extends RelativeLayout {
    public static final /* synthetic */ int LJLJL = 0;
    public LinearLayout LJLIL;
    public LinearLayout LJLILLLLZI;
    public ImageView LJLJI;
    public View LJLJJI;
    public int LJLJJL;
    public TuxTextView LJLJJLL;

    public int getTabIndicatorWidth() {
        int i = this.LJLJJL;
        if (i > 0) {
            return i;
        }
        throw new IllegalStateException("tabWidth not initialized, can't get tab indicator width");
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLILLLLZI = (LinearLayout) findViewById(R.id.g40);
        this.LJLIL = (LinearLayout) findViewById(R.id.kyc);
        this.LJLJI = (ImageView) findViewById(R.id.f5d);
        this.LJLJJI = findViewById(R.id.cd9);
    }

    public View getDividerView() {
        return this.LJLJJI;
    }

    public ImageView getTabIndicator() {
        return this.LJLJI;
    }

    public void setPageSelected(int i) {
        TuxTextView tuxTextView = (TuxTextView) this.LJLIL.getChildAt(i).findViewById(R.id.mmo);
        TuxTextView tuxTextView2 = this.LJLJJLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setSelected(false);
            this.LJLJJLL.setTuxFont(42);
        }
        if (tuxTextView != null) {
            tuxTextView.setSelected(true);
            tuxTextView.setTuxFont(43);
            this.LJLJJLL = tuxTextView;
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        boolean z;
        viewPager.getClass();
        viewPager.getAdapter().getClass();
        PagerAdapter adapter = viewPager.getAdapter();
        if (adapter.getCount() == 2) {
            z = true;
        } else {
            z = false;
        }
        Boolean.valueOf(z).getClass();
        this.LJLJJL = KL2.LJIIJJI(getContext()) / adapter.getCount();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.LJLILLLLZI.getLayoutParams();
        layoutParams.width = this.LJLJJL;
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        this.LJLIL.removeAllViews();
        int count = adapter.getCount();
        for (int i = 0; i < count; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.dsw, this.LJLIL, false);
            TuxTextView tuxTextView = (TuxTextView) relativeLayout.findViewById(R.id.mmo);
            if (i == 0) {
                this.LJLJJLL = tuxTextView;
                tuxTextView.setSelected(true);
                tuxTextView.setTuxFont(43);
            }
            CharSequence LJIILIIL = adapter.LJIILIIL(i);
            if (LJIILIIL != null && !TextUtils.isEmpty(LJIILIIL)) {
                tuxTextView.setText(LJIILIIL);
            }
            C16880lQ.LJIJ(relativeLayout, new ACListenerS25S0101000_7(i, viewPager, 3));
            this.LJLIL.addView(relativeLayout);
        }
        viewPager.addOnPageChangeListener(new IDiS269S0100000_7(this, 0));
    }

    public C45649Hvp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
