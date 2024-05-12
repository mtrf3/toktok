package X;

import Y.ACListenerS31S0300000_5;
import Y.ARunnableS41S0100000_5;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.C2p, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30687C2p {
    public static final /* synthetic */ int LJIILIIL = 0;
    public final View LIZ;
    public final Room LIZIZ;
    public final FrameLayout LIZJ;
    public final C47121t6 LIZLLL;
    public final C47061t0 LJ;
    public final C47061t0 LJFF;
    public final C47061t0 LJI;
    public final View LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public final C5H3 LJIIJ;
    public final ARunnableS41S0100000_5 LJIIJJI;
    public final ARunnableS41S0100000_5 LJIIL;

    public final LinkedList<Runnable> LIZ() {
        return (LinkedList) this.LJIIJ.getValue();
    }

    public final void LIZLLL() {
        Runnable poll;
        if (LIZ().size() > 0) {
            LIZ().poll();
            if (LIZ().size() > 0 && (poll = LIZ().poll()) != null) {
                poll.run();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        String str;
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LLLLLJLJLL;
        Integer guideNumber = c48459J0d.LIZJ();
        o.LJIIIIZZ(guideNumber, "guideNumber");
        if (guideNumber.intValue() >= 5) {
            this.LJIIIIZZ = false;
            return;
        }
        if (this.LJIIIIZZ) {
            if (LIZ().size() == 0 || z) {
                this.LJIIIIZZ = false;
                this.LIZJ.setClickable(true);
                this.LIZJ.setVisibility(0);
                C15540jG c15540jG = new C15540jG();
                C15540jG c15540jG2 = new C15540jG();
                C76732zl c76732zl = new C76732zl();
                c76732zl.element = 2;
                c15540jG.LIZLLL(this.LJ);
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_2");
                c15540jG.LJFF = false;
                c15540jG.LJI = 3;
                c15540jG.LJ = new C30688C2q(c15540jG2, c15540jG, this, c76732zl);
                c15540jG2.LIZLLL(this.LJI);
                c15540jG2.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
                c15540jG2.LJFF = false;
                c15540jG2.LJI = 3;
                c15540jG2.LJ = new C30690C2s(c15540jG, c15540jG2, this, c76732zl);
                if (C15380j0.LJIIZILJ()) {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                } else {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                }
                this.LIZLLL.LJJIJIL(R.style.a3v);
                this.LIZLLL.setText(C15380j0.LJIILJJIL(R.string.knj));
                ObjectAnimator LIZ = C0F0.LIZ(this.LIZLLL, View.ALPHA, new float[]{0.0f, 1.0f}, 180L, "ofFloat(guideText, View.…ME_DURATION_180.toLong())");
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZLLL, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
                o.LJIIIIZZ(duration, "ofFloat(guideText, View.…ME_DURATION_180.toLong())");
                duration.setStartDelay(2808L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LIZ, duration);
                animatorSet.start();
                this.LIZJ.setClickable(true);
                C16880lQ.LJIILJJIL(this.LIZJ, new ACListenerS31S0300000_5(this, animatorSet, c15540jG, 36));
                BZI LIZ2 = C28787BRn.LIZ("livesdk_extended_comment_filed_guidence");
                LIZ2.LJFF(String.valueOf(this.LIZIZ.getOwnerUserId()));
                LIZ2.LJJIIJ(String.valueOf(this.LIZIZ.getId()));
                LiveMode streamType = this.LIZIZ.getStreamType();
                if (streamType != null) {
                    str = C28509BGv.LIZ(streamType);
                } else {
                    str = null;
                }
                LIZ2.LJIJ(str);
                LIZ2.LJJIIJZLJL();
                c48459J0d.LIZ(Integer.valueOf(guideNumber.intValue() + 1));
            }
            if (!LIZ().contains(this.LJIIJJI) && !z) {
                LIZ().add(this.LJIIJJI);
            }
        }
    }

    public final void LIZJ(boolean z) {
        this.LJIIIZ = true;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLLLIL;
        Boolean LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_CENTER_HAND_GUIDE_ANIMATION.value");
        if (LIZJ.booleanValue()) {
            if (LIZ().size() == 0 || z) {
                c48459J0d.LIZ(Boolean.FALSE);
                this.LIZJ.setVisibility(0);
                this.LIZJ.setClickable(true);
                C15540jG c15540jG = new C15540jG();
                C15540jG c15540jG2 = new C15540jG();
                c15540jG.LIZLLL(this.LJ);
                c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_2");
                c15540jG.LJFF = true;
                c15540jG.LJ = new C30689C2r(this, c15540jG2);
                c15540jG2.LIZLLL(this.LJFF);
                c15540jG2.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_normal_1");
                c15540jG2.LJFF = true;
                c15540jG2.LJ = new C30692C2u(this);
                if (C15380j0.LJIIZILJ()) {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand_rtl.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line_rtl.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                } else {
                    c15540jG.LIZJ = "ttlive_livecenter_guide_hand.webp";
                    c15540jG2.LIZJ = "ttlive_livecenter_guide_black_line.webp";
                    C15490jB.LJI(c15540jG);
                    C15490jB.LJI(c15540jG2);
                }
                this.LIZLLL.LJJIJIL(R.style.a3v);
                this.LIZLLL.setText(C15380j0.LJIILJJIL(R.string.mfq));
                ObjectAnimator LIZ = C0F0.LIZ(this.LIZLLL, View.ALPHA, new float[]{0.0f, 1.0f}, 180L, "ofFloat(guideText, View.…oLong()\n                )");
                ObjectAnimator duration = ObjectAnimator.ofFloat(this.LIZLLL, (Property<C47121t6, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(180L);
                o.LJIIIIZZ(duration, "ofFloat(guideText, View.…g()\n                    )");
                duration.setStartDelay(2808L);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playSequentially(LIZ, duration);
                animatorSet.start();
                this.LIZJ.setClickable(true);
                C16880lQ.LJIILJJIL(this.LIZJ, new ACListenerS31S0300000_5(this, animatorSet, c15540jG, 37));
            }
            if (!LIZ().contains(this.LJIIL) && !z) {
                LIZ().add(this.LJIIL);
            }
        }
    }

    public C30687C2p(View view, Room room) {
        this.LIZ = view;
        this.LIZIZ = room;
        View findViewById = view.findViewById(R.id.epj);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.instruction_layout)");
        this.LIZJ = (FrameLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.e1a);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.guide_text)");
        this.LIZLLL = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.e0u);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.guide_hand)");
        this.LJ = (C47061t0) findViewById3;
        View findViewById4 = view.findViewById(R.id.aly);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.black_line)");
        this.LJFF = (C47061t0) findViewById4;
        View findViewById5 = view.findViewById(R.id.kco);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.start_black_line)");
        this.LJI = (C47061t0) findViewById5;
        View findViewById6 = view.findViewById(R.id.fva);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.l…ast_extended_screen_view)");
        this.LJII = findViewById6;
        this.LJIIIIZZ = true;
        this.LJIIJ = C78996UzQ.LJJIJIIJI(C30280BuW.LJLIL);
        this.LJIIJJI = new ARunnableS41S0100000_5(this, 336);
        this.LJIIL = new ARunnableS41S0100000_5(this, 337);
    }
}
