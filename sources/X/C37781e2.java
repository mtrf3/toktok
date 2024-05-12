package X;

import Y.IDTListenerS110S0100000;
import Y.IDUListenerS170S0200000;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1e2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37781e2 extends ConstraintLayout {
    public C12D LJLIL;
    public XKQ LJLILLLLZI;
    public final ValueAnimator LJLJI;
    public final ValueAnimator LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public long LJLJL;
    public String LJLJLJ;
    public long LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;

    private final String getAnchorId() {
        return (String) this.LJLLLLLL.getValue();
    }

    private final long getRoomId() {
        return ((Number) this.LJLLLL.getValue()).longValue();
    }

    public final boolean getCanHide() {
        return this.LJLLL;
    }

    public final int getEndX() {
        return this.LJLLJ;
    }

    public final C12D getSmallMoreView() {
        return this.LJLIL;
    }

    public final int getStartX() {
        return this.LJLLILLLL;
    }

    public final void LJJLL(boolean z) {
        String str;
        if (z) {
            str = "livesdk_anchor_floating_gift_msg_show";
        } else {
            str = "livesdk_anchor_floating_gift_msg_cancel";
        }
        boolean z2 = this.LJLJJLL;
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIJJ(Long.valueOf(getRoomId()), "room_id");
        LIZ.LJIJJ(getAnchorId(), "anchor_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLJLLL), "user_id");
        LIZ.LJIJJ(Long.valueOf(this.LJLL), "gift_id");
        LIZ.LJIJJ(Integer.valueOf(z2 ? 1 : 0), "is_first_gift");
        LIZ.LJIJJ(this.LJLJLJ, "combo_cnt");
        LIZ.LJIJJ(Long.valueOf(this.LJLJL), "show_duration");
        UFE.LIZIZ(this.LJLLI, LIZ, "cancel_cnt");
    }

    public final void setCanHide(boolean z) {
        this.LJLLL = z;
    }

    public final void setEndX(int i) {
        this.LJLLJ = i;
    }

    public final void setSmallMoreView(C12D c12d) {
        this.LJLIL = c12d;
    }

    public final void setStartX(int i) {
        this.LJLLILLLL = i;
    }

    public final void LJJLJLI(boolean z, final boolean z2) {
        XKQ xkq = this.LJLILLLLZI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        if (z) {
            this.LJLJJL = false;
            this.LJLJI.cancel();
            this.LJLJJI.cancel();
            this.LJLJI.addListener(new Animator.AnimatorListener() { // from class: X.12W
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator p0) {
                    o.LJIIIZ(p0, "p0");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator p0) {
                    o.LJIIIZ(p0, "p0");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator p0) {
                    o.LJIIIZ(p0, "p0");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator p0) {
                    o.LJIIIZ(p0, "p0");
                    C12D smallMoreView = C37781e2.this.getSmallMoreView();
                    if (smallMoreView != null) {
                        smallMoreView.LJI(C37781e2.this, z2);
                    }
                    C37781e2.this.setSmallMoreView(null);
                }
            });
            this.LJLJI.start();
            this.LJLJJI.start();
            return;
        }
        C12D c12d = this.LJLIL;
        if (c12d != null) {
            c12d.LJI(this, z2);
        }
        this.LJLIL = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37781e2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "ctx");
        this.LJLJJL = true;
        this.LJLJL = 2000L;
        this.LJLJLJ = "";
        this.LJLLLL = C221108m2.LIZIZ(AnonymousClass289.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(AnonymousClass288.LJLIL);
        o.LJII(ViewGroup.inflate(context, R.layout.dku, this), "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = findViewById(R.id.dvl);
        findViewById.setOnTouchListener(new IDTListenerS110S0100000(this, 9));
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new IDUListenerS170S0200000(findViewById, this, 3));
        this.LJLJI = ofFloat;
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new IDUListenerS170S0200000(findViewById, this, 4));
        this.LJLJJI = ofFloat2;
    }
}
