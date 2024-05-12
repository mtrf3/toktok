package X;

import Y.ACListenerS29S0100000_9;
import Y.ARunnableS45S0100000_9;
import Y.AUListenerS97S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LQ1 extends PopupWindow {
    public C53887LCx LIZ;
    public final C53873LCj LIZIZ;
    public final C47061t0 LIZJ;
    public final LiveIconView LIZLLL;
    public final C47121t6 LJ;
    public final View LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        String str;
        String str2;
        Long l;
        Long l2;
        C53887LCx c53887LCx;
        Room roomData;
        Room roomData2;
        LogPb logPb;
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        if (!this.LJIILIIL) {
            super.dismiss();
            this.LJIIIZ = false;
            BZI LIZ = C28787BRn.LIZ("livesdk_toplive_bubble_duration");
            LiveBubbleData liveBubbleData = LQM.LJI;
            if (liveBubbleData != null && liveBubbleData.getShowHead()) {
                str = "head";
            } else {
                str = "icon";
            }
            LIZ.LJIJJ(str, "live_bubble_mode");
            LIZ.LJIJJ(LQ2.LIZ(), "is_title_run");
            LIZ.LJIJJ(LQ2.LJ, "withdraw_reason");
            I9A.LIZ(System.currentTimeMillis(), LQ2.LIZLLL, LIZ, "bubble_show_duration");
            LiveBubbleExtra liveBubbleExtra = LQM.LJII;
            if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
                str2 = logPb.getImprId();
            } else {
                str2 = null;
            }
            LIZ.LJIJJ(str2, "request_id");
            LiveBubbleData liveBubbleData2 = LQM.LJI;
            if (liveBubbleData2 != null && (roomData2 = liveBubbleData2.getRoomData()) != null) {
                l = Long.valueOf(roomData2.getId());
            } else {
                l = null;
            }
            LIZ.LJIJJ(l, "room_id");
            LiveBubbleData liveBubbleData3 = LQM.LJI;
            if (liveBubbleData3 != null && (roomData = liveBubbleData3.getRoomData()) != null) {
                l2 = Long.valueOf(roomData.getOwnerUserId());
            } else {
                l2 = null;
            }
            LIZ.LJIJJ(l2, "anchor_id");
            LIZ.LJJIIJZLJL();
            this.LJI.removeCallbacks(null);
            LiveBubbleData liveBubbleData4 = LQM.LJI;
            if (liveBubbleData4 != null && liveBubbleData4.getShowHead() && (c53887LCx = this.LIZ) != null) {
                c53887LCx.LJII();
            }
            View view = LQM.LJIIIIZZ;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = LQM.LJIIJ;
            if (view2 != null) {
                view2.setVisibility(0);
            }
            View view3 = LQM.LJIIJJI;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            View view4 = LQM.LJIIL;
            if (view4 != null) {
                view4.setVisibility(0);
            }
            LIZJ(1.0f, 1.0f);
            View view5 = LQM.LJIIJ;
            if (view5 != null) {
                view5.setAlpha(1.0f);
            }
            View view6 = LQM.LJIIJJI;
            if (view6 != null) {
                view6.setAlpha(1.0f);
            }
            View view7 = LQM.LJIIL;
            if (view7 == null) {
                return;
            }
            view7.setAlpha(1.0f);
            return;
        }
        LIZIZ(this.LJIIJ, 0, false);
    }

    public LQ1(Context context) {
        super(context);
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
        setWidth(C15380j0.LJIIL() - C15380j0.LIZ(60.0f));
        setHeight(-2);
        setFocusable(false);
        setOutsideTouchable(false);
        setBackgroundDrawable(new ColorDrawable(0));
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bqv, C16880lQ.LLZIL(context), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(\n …ow_layout, null\n        )");
        this.LJIIIIZZ = LLLZIIL;
        setContentView(LLLZIIL);
        View findViewById = LLLZIIL.findViewById(R.id.hwz);
        o.LJIIIIZZ(findViewById, "popContentView.findViewById(R.id.pop_head_image)");
        this.LIZJ = (C47061t0) findViewById;
        View findViewById2 = LLLZIIL.findViewById(R.id.hww);
        o.LJIIIIZZ(findViewById2, "popContentView.findViewById(R.id.pop_desc_tv)");
        C47121t6 c47121t6 = (C47121t6) findViewById2;
        this.LJ = c47121t6;
        View findViewById3 = LLLZIIL.findViewById(R.id.hwu);
        o.LJIIIIZZ(findViewById3, "popContentView.findViewById(R.id.pop_close_icon)");
        this.LJFF = findViewById3;
        View findViewById4 = LLLZIIL.findViewById(R.id.hwx);
        o.LJIIIIZZ(findViewById4, "popContentView.findViewById(R.id.pop_head_circle)");
        this.LIZIZ = (C53873LCj) findViewById4;
        View findViewById5 = LLLZIIL.findViewById(R.id.hwy);
        o.LJIIIIZZ(findViewById5, "popContentView.findViewById(R.id.pop_head_icon)");
        this.LIZLLL = (LiveIconView) findViewById5;
        View findViewById6 = LLLZIIL.findViewById(R.id.hwv);
        o.LJIIIIZZ(findViewById6, "popContentView.findViewById(R.id.pop_content)");
        this.LJI = findViewById6;
        View findViewById7 = LLLZIIL.findViewById(R.id.e37);
        o.LJIIIIZZ(findViewById7, "popContentView.findViewById(R.id.head_container)");
        this.LJII = findViewById7;
        c47121t6.setSelected(true);
        findViewById6.setVisibility(4);
        this.LJIILIIL = true;
        this.LJIILJJIL = true;
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 156), findViewById3);
        C16880lQ.LJIIJ(new ACListenerS29S0100000_9(this, 157), findViewById6);
    }

    public static void LIZJ(float f, float f2) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f2 < 0.0f) {
            f2 = 0.0f;
        } else if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        View view = LQM.LJIIIIZZ;
        if (view != null) {
            view.setScaleX(f);
        }
        View view2 = LQM.LJIIIIZZ;
        if (view2 != null) {
            view2.setScaleY(f);
        }
        View view3 = LQM.LJIIIIZZ;
        if (view3 == null) {
            return;
        }
        view3.setAlpha(f2);
    }

    public final void LIZLLL(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.LJI.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.LJI.setLayoutParams(layoutParams);
    }

    public final void LIZ(int i, int i2, boolean z) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AUListenerS97S0100000_9(this, 56));
        if (z) {
            ofInt.setDuration(300L);
        } else {
            ofInt.setDuration(200L);
        }
        ofInt.start();
    }

    public final void LIZIZ(int i, int i2, boolean z) {
        long j;
        long j2;
        if (z) {
            LIZJ(1.0f, 1.0f);
            this.LJIIIIZZ.setVisibility(8);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new AUListenerS97S0100000_9(this, 57));
            ofFloat.setDuration(140L);
            ofFloat.start();
            long j3 = 160;
            this.LJI.postDelayed(new ARunnableS45S0100000_9(this, 207), 160L);
            LiveBubbleData liveBubbleData = LQM.LJI;
            if (liveBubbleData == null || liveBubbleData.getShowHead()) {
                j3 = 360;
            }
            this.LJI.postDelayed(new LQ0(this, i, i2, z), j3);
            LiveBubbleData liveBubbleData2 = LQM.LJI;
            if (liveBubbleData2 != null && !liveBubbleData2.getShowHead()) {
                j = 310;
            } else {
                j = 510;
            }
            this.LJI.postDelayed(RunnableC54227LPz.LJLIL, j);
            LiveBubbleData liveBubbleData3 = LQM.LJI;
            if (liveBubbleData3 != null && !liveBubbleData3.getShowHead()) {
                j2 = 460;
            } else {
                j2 = 660;
            }
            this.LJI.postDelayed(new ARunnableS45S0100000_9(this, 208), j2);
            return;
        }
        this.LJI.removeCallbacks(null);
        LIZJ(1.0f, 0.0f);
        LIZLLL(this.LJIIJ, this.LJIIJJI);
        LIZ(i, i2, z);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 0.4f);
        ofFloat2.addUpdateListener(C54168LNs.LJLIL);
        ofFloat2.setDuration(200L);
        ofFloat2.start();
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.addUpdateListener(new AUListenerS97S0100000_9(this, 59));
        ofFloat3.setDuration(200L);
        ofFloat3.start();
        this.LJI.postDelayed(new ARunnableS45S0100000_9(this, 209), 200L);
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View anchor, int i, int i2, int i3) {
        o.LJIIIZ(anchor, "anchor");
        LQM.LJIJI = true;
        this.LJI.setVisibility(4);
        super.showAtLocation(anchor, i, i2, i3);
        LQ2.LIZLLL = System.currentTimeMillis();
        this.LJI.post(new ARunnableS45S0100000_9(this, 210));
    }
}
