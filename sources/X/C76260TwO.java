package X;

import Y.ARunnableS32S0200000_13;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.livesetting.linkmic.EnableSpecificGiftEntranceOptimizeSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTest;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS55S0110000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.TwO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76260TwO {
    public C47151t9 LIZ;
    public C47061t0 LIZIZ;
    public C47121t6 LIZJ;
    public View LIZLLL;
    public View LJ;
    public View LJFF;
    public LinearLayout LJI;
    public LinearLayout LJII;
    public C47121t6 LJIIIIZZ;
    public View LJIIIZ;
    public AnimatorSet LJIIJ;
    public InterfaceC65784Pro<C76800UCe> LJIIJJI;
    public InterfaceC75477Tjl LJIIL;
    public long LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;

    public static int LIZIZ() {
        if (C76265TwT.LIZ()) {
            return 37;
        }
        return 0;
    }

    public C76260TwO(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
    }

    public final void LIZJ(boolean z) {
        C76280Twi c76280Twi;
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
            if (c76280Twi.LJIILL == 0 && !c76280Twi.LJIILJJIL) {
                c76280Twi.LJIILL = C76265TwT.LJIIJJI;
            }
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        boolean z2 = false;
        c76280Twi.LJIILJJIL = false;
        if (c76280Twi.LJ() == EnumC76178Tv4.INVITED) {
            z2 = true;
        }
        this.LJIILL = z2;
        AnimatorSet animatorSet = this.LJIIJ;
        if (animatorSet != null) {
            C16880lQ.LJLJJL(animatorSet);
        }
        AnimatorSet animatorSet2 = this.LJIIJ;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJIIJ = null;
    }

    public final void LIZLLL(float f) {
        View view = this.LJFF;
        if (view != null) {
            view.setAlpha(f);
        }
        C47121t6 c47121t6 = this.LIZJ;
        if (c47121t6 != null) {
            c47121t6.setAlpha(f);
        }
        C47061t0 c47061t0 = this.LIZIZ;
        if (c47061t0 != null) {
            c47061t0.setAlpha(f);
        }
        C47121t6 c47121t62 = this.LJIIIIZZ;
        if (c47121t62 != null) {
            c47121t62.setAlpha(f);
        }
        View view2 = this.LJIIIZ;
        if (view2 == null) {
            return;
        }
        view2.setAlpha(f);
    }

    public final void LIZ(View parent, InterfaceC75477Tjl interfaceC75477Tjl, InterfaceC65784Pro<C76800UCe> showGiftSelectDialog) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(showGiftSelectDialog, "showGiftSelectDialog");
        this.LIZ = (C47151t9) parent.findViewById(R.id.dtu);
        this.LIZIZ = (C47061t0) parent.findViewById(R.id.dt6);
        this.LIZJ = (C47121t6) parent.findViewById(R.id.dtq);
        this.LIZLLL = parent.findViewById(R.id.dtv);
        this.LJFF = parent.findViewById(R.id.dv0);
        this.LJI = (LinearLayout) parent.findViewById(R.id.g3k);
        this.LJII = (LinearLayout) parent.findViewById(R.id.g4r);
        this.LJIIIIZZ = (C47121t6) parent.findViewById(R.id.gzk);
        this.LJIIIZ = parent.findViewById(R.id.gzj);
        this.LJ = parent;
        this.LJIILJJIL = true;
        this.LJIIL = interfaceC75477Tjl;
        this.LJIIJJI = showGiftSelectDialog;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("findView isShowSelectAnimator = ");
        FT5.LJ(LIZ, this.LJIILJJIL, LIZ, "GiftOnlySelectUtils");
    }

    public final void LJ(boolean z, Text text, boolean z2) {
        C76280Twi c76280Twi;
        String str;
        C47151t9 c47151t9;
        java.util.Map<String, String> LIZJ;
        boolean z3;
        BattleABTestList battleABTestList;
        List<BattleABTest> list;
        String LJIILL;
        C0RN.LIZLLL("isMulti = ", z2, "GiftOnlySelectUtils");
        if (z) {
            c76280Twi = C76265TwT.LIZIZ;
        } else {
            c76280Twi = C76265TwT.LIZ;
        }
        long j = c76280Twi.LJIILL;
        if ((j == 0 || j == C76265TwT.LJIIJJI) && this.LJIILIIL != 0) {
            C0NB.LJIIIZ("GiftOnlySelectUtils", "lastGiftId");
            c76280Twi.LJIILL = this.LJIILIIL;
        } else {
            this.LJIILIIL = j;
        }
        if (C76265TwT.LIZ()) {
            List<GiftMode> LIZJ2 = C76265TwT.LIZJ();
            if (LIZJ2 != null) {
                for (GiftMode giftMode : LIZJ2) {
                    if (giftMode.giftId == c76280Twi.LJIILL) {
                        C47151t9 c47151t92 = this.LIZ;
                        if (c47151t92 != null) {
                            c47151t92.setVisibility(0);
                        }
                        C15640jQ.LIZLLL(this.LIZIZ, giftMode.giftIconImage);
                        C47121t6 c47121t6 = this.LIZJ;
                        if (c47121t6 != null) {
                            if (giftMode.giftId == 0) {
                                LJIILL = giftMode.giftName;
                            } else {
                                LJIILL = C15380j0.LJIILL(R.string.mxp, giftMode.giftName);
                            }
                            c47121t6.setText(LJIILL);
                        }
                    }
                }
            }
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            java.util.Map LIZIZ2 = C76265TwT.LIZIZ();
            if (LIZIZ2 != null) {
                z3 = false;
                for (Map.Entry entry : LIZIZ2.entrySet()) {
                    if (((C29374Bfu) LIZIZ).getCurrentUserId() != ((Number) entry.getKey()).longValue() && (battleABTestList = (BattleABTestList) entry.getValue()) != null && (list = battleABTestList.abTestList) != null) {
                        for (BattleABTest battleABTest : list) {
                            if (battleABTest.abTestType == 2 && battleABTest.group != 1) {
                                z3 = true;
                            }
                        }
                    }
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                if (c76280Twi.LJ() == EnumC76178Tv4.INVITED) {
                    View view = this.LIZLLL;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    View view2 = this.LIZLLL;
                    if (view2 != null) {
                        C29306Beo.LJJJLL(view2, 500L, C76262TwQ.LJLIL);
                    }
                    LIZLLL(0.5f);
                } else {
                    View view3 = this.LIZLLL;
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    LIZLLL(1.0f);
                }
            } else {
                View view4 = this.LIZLLL;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = this.LIZLLL;
                if (view5 != null) {
                    C29306Beo.LJJJLL(view5, 500L, C76263TwR.LJLIL);
                }
                LIZLLL(0.5f);
            }
        }
        C47151t9 c47151t93 = this.LIZ;
        if (c47151t93 != null) {
            C29306Beo.LJJJLL(c47151t93, 500L, new AqS55S0110000_13(this, z, 4));
        }
        if (c76280Twi.LJIILL != 0 || !EnableSpecificGiftEntranceOptimizeSetting.INSTANCE.getValue()) {
            return;
        }
        if (this.LJIILL) {
            this.LJIILJJIL = false;
            return;
        }
        List<GiftMode> LIZJ3 = C76265TwT.LIZJ();
        if (LIZJ3 == null) {
            return;
        }
        for (GiftMode giftMode2 : LIZJ3) {
            if (giftMode2.giftId != 0 && giftMode2.hasFlashEffect) {
                C48459J0d<java.util.Map<String, String>> c48459J0d = InterfaceC30442Bx8.P2;
                if (c48459J0d != null && (LIZJ = c48459J0d.LIZJ()) != null) {
                    str = LIZJ.get(String.valueOf(giftMode2.giftId));
                } else {
                    str = null;
                }
                if (o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
                    if (text == null || (c47151t9 = this.LIZ) == null) {
                        return;
                    }
                    c47151t9.postDelayed(new ARunnableS32S0200000_13(this, text, 136), 1500L);
                    return;
                }
            }
        }
    }
}
