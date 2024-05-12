package X;

import Y.IDLListenerS200S0100000_15;
import Y.IDiS167S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.zhiliaoapp.musically.R;
import o3.h0;

/* renamed from: X.Y8u, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C86904Y8u extends RelativeLayout implements G27 {
    public static final /* synthetic */ int LJZ = 0;
    public LinearLayout LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public ViewPager LJLJJI;
    public boolean LJLJJL;
    public C1BC LJLJJLL;
    public boolean LJLJL;
    public IDiS167S0200000_15 LJLJLJ;
    public AwemePagerVM LJLJLLL;
    public User LJLL;
    public Aweme LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public Y4A LJLZ;

    public int getTabCount() {
        LinearLayout linearLayout = this.LJLIL;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    public InterfaceC82683Wch getToolTip() {
        Y4A y4a = this.LJLZ;
        if (y4a != null) {
            return y4a.LJI;
        }
        return null;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLIL = (LinearLayout) findViewById(R.id.kyc);
        this.LJLJI = findViewById(R.id.gbj);
    }

    private void setTabPressFeedback(View view) {
        view.setBackground(null);
        C9AE.LIZ(view, C9AC.ALPHA, 0.0f);
    }

    public final View LIZIZ(int i) {
        return this.LJLIL.getChildAt(i);
    }

    public void setIsLandingTabPublish(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLLL = z;
    }

    public void setScrollable(boolean z) {
        this.LJLJL = z;
    }

    public C86904Y8u(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLJL = true;
        this.LJLLLL = true;
    }

    public final void LIZJ(LBF lbf, int i) {
        h0.LJIJI(lbf, new C54176LOa(this, i));
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        ViewPager viewPager = this.LJLJJI;
        if (viewPager == null || this.LJLJI == null) {
            return;
        }
        viewPager.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS200S0100000_15(this, 0));
    }

    public final void LIZ(float f, int i, View view) {
        if (!C27740Aue.LJFF(view)) {
            return;
        }
        View LIZIZ = LIZIZ(i);
        View LIZIZ2 = LIZIZ(i + 1);
        if (LIZIZ == null || LIZIZ.getVisibility() != 0 || LIZIZ2 == null || LIZIZ2.getVisibility() != 0) {
            if (C27740Aue.LJFF(LIZIZ)) {
                view.setX(((LIZIZ.getX() + getX()) + (LIZIZ.getWidth() / 2)) - (view.getWidth() / 2));
                return;
            }
            return;
        }
        float x = (LIZIZ.getX() + (LIZIZ.getWidth() / 2)) - (view.getWidth() / 2);
        view.setX(((((LIZIZ2.getX() + (LIZIZ2.getWidth() / 2)) - (view.getWidth() / 2)) - x) * f) + getX() + x);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.app.Activity r22, final X.VW9 r23, final boolean r24, final X.InterfaceC86908Y8y r25, int r26, android.view.View r27) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86904Y8u.LIZLLL(android.app.Activity, X.VW9, boolean, X.Y8y, int, android.view.View):void");
    }
}
