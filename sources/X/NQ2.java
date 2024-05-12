package X;

import Y.IDAListenerS78S0100000_10;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy;
import com.zhiliaoapp.musically.R;

/* loaded from: classes11.dex */
public class NQ2 extends NQ1 implements G27 {
    public static final /* synthetic */ int LLIIIJ = 0;
    public float LLIIII;
    public float LLIIIILZ;

    @Override // X.NQ1
    public final void LIZ() {
    }

    @Override // X.NQ1
    public int getLayoutId() {
        return R.layout.adn;
    }

    @Override // X.G27
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
    }

    @Override // X.NQ1
    public final boolean LJIIJJI() {
        Aweme aweme = this.LJLLLL;
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            if (C63081OpJ.LLJILLL(this.LJLLLL)) {
                return true;
            }
            if (!C63081OpJ.LJLIIIL(this.LJLLLL) && (this.LJLLLL.getAwemeRawAd().getAnimationType() == 1 || this.LJLLLL.getAwemeRawAd().getAnimationType() == 3)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.NQ1
    public final boolean LJIIL() {
        if (C63081OpJ.LLIIIL(this.LJLLLL) || C63081OpJ.LJLJJLL(this.LJLLLL)) {
            return true;
        }
        DmNoticeProxy LJI = DmNoticeProxyImpl.LJI();
        Aweme aweme = this.LJLLLL;
        if (aweme != null && aweme.isAd() && this.LJLLLL.getAwemeRawAd() != null && this.LJLLLL.getAwemeRawAd().getButtonType() == 0 && ((!TextUtils.isEmpty(this.LJLLLL.getAwemeRawAd().getWebUrl()) || C63081OpJ.LLD(this.LJLLLL) || ((C63081OpJ.LJJLJLI(this.LJLLLL) && LJI != null && !LJI.LIZIZ()) || C63081OpJ.LJJLJ(this.LJLLLL))) && this.LJLLLL.getAwemeRawAd().getAnimationType() != -1)) {
            return true;
        }
        return false;
    }

    @Override // X.NQ1
    public final boolean LJIILIIL() {
        return C63081OpJ.LLJLL(this.LJLLLL);
    }

    public static float getButtonShapePX() {
        int i;
        if (L2J.LIZ()) {
            i = 5;
        } else {
            i = 2;
        }
        return C32151Nz.LJIIZILJ(Integer.valueOf(i));
    }

    private View getSlotView() {
        if ((getParent() instanceof View) && (getParent() instanceof C218518hr)) {
            return (View) getParent();
        }
        return null;
    }

    public final void LJIJ(Boolean bool) {
        if (this.LJLZ == null || C63081OpJ.LLIIIILZ(this.LJLLLL)) {
            return;
        }
        if (C63081OpJ.LJLJJLL(this.LJLLLL)) {
            setLabelVisibility(0);
            setTopViewLivePlayingViewVisible(0);
            if (!bool.booleanValue()) {
                LJIIJ(NPC.LIZLLL(getContext(), this.LJLLLL), 0);
                LJII(C63081OpJ.LJJIJLIJ(this.LJLLLL));
            } else {
                String LJJIJLIJ = C63081OpJ.LJJIJLIJ(this.LJLLLL);
                LJIIJJI();
                LJII(LJJIJLIJ);
            }
            this.LJLJLLL.setImageResource(R.drawable.ajl);
            return;
        }
        Aweme aweme = this.LJLLLL;
        if (aweme != null && aweme.getAwemeRawAd() != null && (!TextUtils.isEmpty(this.LJLLLL.getAwemeRawAd().getWebUrl()) || C63081OpJ.LLD(this.LJLLLL) || C63081OpJ.LJJLJLI(this.LJLLLL) || C63081OpJ.LJJLJ(this.LJLLLL))) {
            if (!bool.booleanValue() && C1DF.LJIL(this.LJLLLL)) {
                LJIIJ(NPC.LIZIZ(getContext(), this.LJLLLL), 0);
                C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
                Context context = getContext();
                Aweme aweme2 = this.LJLLLL;
                LJIJJLI.getClass();
                LJII(M2C.LIZ(context, aweme2, false));
            }
            setTopViewLivePlayingViewVisible(8);
            return;
        }
        setLabelVisibility(8);
    }

    public final void LJIJI(boolean z) {
        if (this.LJLZ == null) {
            return;
        }
        if (C63081OpJ.LLIIIL(this.LJLLLL)) {
            setLabelVisibility(0);
            setTopViewLivePlayingViewVisible(0);
            if (!z) {
                LJIIJ(AnonymousClass636.LJIIIIZZ(R.attr.eb, getContext()), 0);
            }
            String LJJIZ = C63081OpJ.LJJIZ(this.LJLLLL);
            LJIIJJI();
            LJII(LJJIZ);
            ImageView imageView = this.LJLJLLL;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ajl);
                return;
            }
            return;
        }
        if (!C63081OpJ.LLIIIILZ(this.LJLLLL)) {
            return;
        }
        if (!TextUtils.isEmpty(this.LJLLLL.getAwemeRawAd().getWebUrl())) {
            setTopViewLivePlayingViewVisible(8);
            if (!z) {
                LJIIJ(NPC.LIZIZ(getContext(), this.LJLLLL), 0);
            }
            C61491OBj LJIJJLI = C73340SqO.LJIJJLI();
            Context context = getContext();
            Aweme aweme = this.LJLLLL;
            LJIJJLI.getClass();
            String LIZ = M2C.LIZ(context, aweme, false);
            LJIIJJI();
            LJII(LIZ);
            this.LJLJLLL.setImageResource(R.drawable.bnu);
            return;
        }
        setLabelVisibility(8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Context LIZIZ;
        if (!C63081OpJ.LJZL(this.LJLLLL)) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                double hypot = Math.hypot(motionEvent.getX() - this.LLIIII, motionEvent.getY() - this.LLIIIILZ);
                if (getContext() != null) {
                    LIZIZ = getContext();
                } else {
                    LIZIZ = EF7.LIZIZ();
                }
                if (hypot < ViewConfiguration.get(LIZIZ).getScaledTouchSlop() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        } else {
            this.LLIIII = motionEvent.getX();
            this.LLIIIILZ = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // X.NQ1
    public void setLabelVisibility(int i) {
        if (i == 0 && this.LJLLLL.isAd()) {
            this.LJLLLL.getAwemeRawAd().setIsCTAFirstShown(true);
        }
        setVisibility(i);
        if (getSlotView() != null) {
            getSlotView().setVisibility(i);
        }
    }

    public NQ2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setDefaultColor(C04330Ez.LIZIZ(context, R.color.bm));
        C9XU.LIZ(context.hashCode(), this);
    }

    @Override // X.NQ1
    public final void LJIIJ(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(getButtonShapePX());
        int i3 = this.LJLJI;
        if (i3 != 0 && i3 == i) {
            return;
        }
        this.LJLJI = i;
        if (i2 == 0) {
            gradientDrawable.setColor(i);
            setBackground(gradientDrawable);
            if (C63081OpJ.LLIIIILZ(this.LJLLLL) || !LJIIJJI()) {
                this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
                this.LJLJLLL.setImageResource(R.drawable.ajl);
                LJIILLIIL(true);
                return;
            } else if (O5Y.LJJIJIL(this.LJLLLL)) {
                this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
                this.LJLJLLL.setImageResource(R.drawable.ajl);
                LJIILLIIL(true);
                return;
            } else {
                this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext()));
                this.LJLJLLL.setImageResource(R.drawable.bnu);
                LJIILLIIL(false);
                return;
            }
        }
        gradientDrawable.setColor(getBackGroundColor());
        KP0.LIZJ(this, gradientDrawable, getBackGroundColor(), i, i2, new IDAListenerS78S0100000_10(this, 1));
        if (C63081OpJ.LLIIIILZ(this.LJLLLL) || !LJIIJJI()) {
            this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext()));
            this.LJLJLLL.setImageResource(R.drawable.ajl);
            LJIILLIIL(true);
        } else {
            this.LJLJJL.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext()));
            this.LJLJLLL.setImageResource(R.drawable.bnu);
            LJIILLIIL(false);
        }
    }
}
