package X;

import Y.IDAListenerS69S0100000;
import Y.IDCListenerS135S0100000;
import Y.IDTListenerS110S0100000;
import Y.IDUListenerS263S0100000;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.publicscreen.api.NewMessageNumChannel;
import com.bytedance.android.livesdk.livesetting.level.UserLevelGeckoUpdateSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30031Fv extends ConstraintLayout {
    public static final /* synthetic */ int LLFF = 0;
    public final C30021Fu LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final C119254m9 LJLJI;
    public final View LJLJJI;
    public final C05340Iw LJLJJL;
    public final TextView LJLJJLL;
    public final TextView LJLJL;
    public final ConstraintLayout LJLJLJ;
    public CVC LJLJLLL;
    public DataChannel LJLL;
    public String LJLLI;
    public String LJLLILLLL;
    public String LJLLJ;
    public boolean LJLLL;
    public String LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public int LJZ;
    public boolean LJZI;
    public ValueAnimator LJZL;
    public final ValueAnimator LL;
    public boolean LLD;
    public boolean LLF;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C30031Fv(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 4, 0);
        o.LJIIIZ(ctx, "ctx");
    }

    public final boolean getCanHide() {
        return this.LJZI;
    }

    public final int getEndX() {
        return this.LJZ;
    }

    public final int getHideNum() {
        return this.LJLLLLLL;
    }

    public final int getStartX() {
        return this.LJLZ;
    }

    public final void LJJLJLI(CVC cvc) {
        int i;
        Integer num;
        if (cvc == null) {
            LJJLL(false);
            return;
        }
        if (this.LJLLL && (o.LJ(cvc.LJLIL, this.LJLLJ) || o.LJ(cvc.LJLIL, "") || cvc.LJLLI == CZV.BLANK)) {
            LJJLL(false);
            return;
        }
        this.LJLLL = false;
        this.LJLJLLL = cvc;
        if (cvc.LJLJJLL == 20) {
            this.LJLIL.setGear(EnumC05330Iv.HIGH);
            this.LJLLI = "up_grade";
        } else {
            this.LJLIL.setGear(EnumC05330Iv.LOW);
            this.LJLLI = "basic";
        }
        if (cvc.LJLLI == CZV.BLANK) {
            this.LJLJI.setVisibility(0);
            this.LJLILLLLZI.setVisibility(8);
        } else {
            this.LJLJI.setVisibility(8);
            this.LJLILLLLZI.setVisibility(0);
            this.LJLJJL.setVisibility(0);
            C05340Iw c05340Iw = this.LJLJJL;
            long j = cvc.LJLJLLL;
            if (cvc.LJLJJLL == 20) {
                LinearLayout linearLayout = c05340Iw.LJLIL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                LinearLayout linearLayout2 = c05340Iw.LJLILLLLZI;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(0);
                }
                c05340Iw.setHighGearDuration(j);
            } else {
                LinearLayout linearLayout3 = c05340Iw.LJLIL;
                if (linearLayout3 != null) {
                    linearLayout3.setVisibility(0);
                }
                LinearLayout linearLayout4 = c05340Iw.LJLILLLLZI;
                if (linearLayout4 != null) {
                    linearLayout4.setVisibility(8);
                }
                c05340Iw.setLowGearDuration(j);
            }
        }
        this.LJLJJLL.setText(C05170If.LIZ(cvc.LJLILLLLZI));
        this.LJLJL.setText(cvc.LJLJI);
        if (!o.LJ(cvc.LJLIL, this.LJLLILLLL)) {
            this.LJLLILLLL = cvc.LJLIL;
            BZI LIZ = C28787BRn.LIZ("livesdk_star_comment_overlay_show");
            LIZ.LJIJJ(this.LJLLI, "gear_type");
            LIZ.LJIJJ(this.LJLLILLLL, "comment_id");
            C06490Nh.LIZLLL(LIZ, this.LJLLLL, "overlay_status", "floating_bal", "overlay_type");
            Boolean LIZJ = InterfaceC30442Bx8.LJJIL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_GAME_STAR_COMMENT_MSG_PUSH.value");
            if (LIZJ.booleanValue()) {
                DataChannel dataChannel = this.LJLL;
                if (dataChannel != null && (num = (Integer) dataChannel.kv0(NewMessageNumChannel.class)) != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                int i2 = i - 1;
                DataChannel dataChannel2 = this.LJLL;
                if (dataChannel2 != null) {
                    dataChannel2.rv0(NewMessageNumChannel.class, Integer.valueOf(i2));
                }
            }
        }
        this.LJLJLJ.setAlpha(1.0f);
        this.LJLJLJ.setScaleX(1.0f);
        this.LJLJLJ.setScaleY(1.0f);
        this.LL.cancel();
        this.LJZL.cancel();
        if (this.LJLJLJ.getVisibility() == 8) {
            C87277YNd.LJJIJ(this.LJLJLJ);
            this.LLD = true;
            C16880lQ.LJLJL(this.LJZL);
            this.LL.start();
            this.LJZL.start();
        }
        C87277YNd.LJJIJ(this.LJLJLJ);
    }

    public final void LJJLL(boolean z) {
        this.LL.cancel();
        this.LJZL.cancel();
        if (z && this.LLF && getVisibility() == 0) {
            this.LLD = false;
            this.LJZL.addListener(new IDAListenerS69S0100000(this, 3));
            this.LL.start();
            this.LJZL.start();
            return;
        }
        C87277YNd.LJJIIZ(this.LJLJLJ);
    }

    public final void setCanHide(boolean z) {
        this.LJZI = z;
    }

    public final void setEndX(int i) {
        this.LJZ = i;
    }

    public final void setHideNum(int i) {
        this.LJLLLLLL = i;
    }

    public final void setStartX(int i) {
        this.LJLZ = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30031Fv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "ctx");
        this.LJLLI = "";
        this.LJLLILLLL = "";
        this.LJLLJ = "";
        this.LJLLLL = "";
        this.LLD = true;
        this.LLF = true;
        o.LJII(ViewGroup.inflate(context, R.layout.dcr, this), "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = findViewById(R.id.dqv);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.game_star_comment_view)");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        this.LJLJLJ = constraintLayout;
        View findViewById2 = findViewById(R.id.ant);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.border_view)");
        this.LJLIL = (C30021Fu) findViewById2;
        View findViewById3 = findViewById(R.id.btg);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.content_container)");
        this.LJLILLLLZI = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(R.id.k1z);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.skeleton_container)");
        C119254m9 c119254m9 = (C119254m9) findViewById4;
        this.LJLJI = c119254m9;
        View findViewById5 = findViewById(R.id.c6i);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.delete_pin)");
        this.LJLJJI = findViewById5;
        View findViewById6 = findViewById(R.id.l3u);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.text_countdown)");
        this.LJLJJL = (C05340Iw) findViewById6;
        View findViewById7 = findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.name)");
        this.LJLJJLL = (TextView) findViewById7;
        View findViewById8 = findViewById(R.id.bst);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.content)");
        this.LJLJL = (TextView) findViewById8;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(1000L);
        valueAnimator.setRepeatCount(-1);
        valueAnimator.setRepeatMode(2);
        valueAnimator.setIntValues(c119254m9.getPlaceholderColor(), c119254m9.getPulsingColor());
        valueAnimator.setEvaluator(new ArgbEvaluator());
        c119254m9.setAnimator(valueAnimator);
        C29306Beo.LJJJJLI(C87277YNd.LJIIJJI(300), constraintLayout);
        constraintLayout.setOnTouchListener(new IDTListenerS110S0100000(this, 0));
        C29306Beo.LJJJJLI(-2, constraintLayout);
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 6));
        this.LJZL = ofFloat;
        ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new IDUListenerS263S0100000(this, 7));
        this.LL = ofFloat2;
    }

    public final void LJJZ(boolean z, DataChannel dataChannel, C37661dq c37661dq) {
        this.LJLL = dataChannel;
        if (z) {
            this.LJLLLL = "unfolded";
            C16880lQ.LJIJI(this.LJLJJLL, new IDCListenerS135S0100000(c37661dq, 15));
            C16880lQ.LJIJI(this.LJLJL, new IDCListenerS135S0100000(c37661dq, 16));
            ValueAnimator ofFloat = ObjectAnimator.ofFloat(0.8f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new IDUListenerS263S0100000(this, 8));
            this.LJZL = ofFloat;
            this.LLF = false;
        } else {
            this.LJLJLJ.getLayoutParams().width = C87277YNd.LJIIJJI(UserLevelGeckoUpdateSetting.DEFAULT);
            this.LJLLLL = "folded";
            this.LJLIL.m2setBackgroundColor8_81llA(C78897Uxp.LJFF(2147483648L));
        }
        C16880lQ.LJIIJ(new IDCListenerS135S0100000(this, 17), this.LJLJJI);
    }

    public /* synthetic */ C30031Fv(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
