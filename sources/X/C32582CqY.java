package X;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.GiftsInfo;
import com.bytedance.android.livesdk.gift.model.LiveLimitedTimeDiscountGiftInfo;
import com.bytedance.android.livesdk.livesetting.gift.LiveDiscountGiftPriceHide;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.CqY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32582CqY extends AbstractC32678Cs6 {
    public final int LLFII;
    public final String LLFZ;
    public final C47121t6 LLI;
    public final C47121t6 LLIFFJFJJ;
    public final C2A7 LLII;
    public final View LLIIII;

    @Override // X.AbstractC32678Cs6
    public final void f0() {
        C29306Beo.LJIIIZ(this.LLIIII);
        super.f0();
    }

    @Override // X.AbstractC32678Cs6
    public final String Q() {
        return this.LLFZ;
    }

    public C32582CqY(View view, int i) {
        super(view);
        this.LLFII = i;
        this.LLFZ = "LiveGiftGiftEntryViewHolder";
        View findViewById = view.findViewById(R.id.cr4);
        o.LJIIIIZZ(findViewById, "mRootView.findViewById(R.id.education_panel_title)");
        this.LLI = (C47121t6) findViewById;
        View findViewById2 = view.findViewById(R.id.cr3);
        o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R.id.education_panel_desc)");
        this.LLIFFJFJJ = (C47121t6) findViewById2;
        View findViewById3 = view.findViewById(R.id.lob);
        o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R….ttlive_education_button)");
        this.LLII = (C2A7) findViewById3;
        View findViewById4 = view.findViewById(R.id.cr2);
        o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R.id.education_panel_bg)");
        this.LLIIII = findViewById4;
    }

    @Override // X.AbstractC32678Cs6
    public final void N(AbstractC32698CsQ<? extends C30896CAq> abstractC32698CsQ, DataChannel dataChannel, int i) {
        AbstractC32756CtM abstractC32756CtM;
        int i2;
        long j;
        LiveLimitedTimeDiscountGiftInfo liveLimitedTimeDiscountGiftInfo;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.N(abstractC32698CsQ, dataChannel, i);
        C0NB.LIZIZ(this.LLFZ, "bindView portrait, type:14");
        C29306Beo.LJJLJLI(this.LLIIII);
        if (abstractC32698CsQ.LIZJ) {
            C29306Beo.LJIIIZ(this.LLIIII);
        }
        if (this.LLFII == 14) {
            C47121t6 c47121t6 = this.LLI;
            String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lkk);
            o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_giftEdu_entry_hi)");
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
            String LLLZ = C16880lQ.LLLZ(LJIILJJIL, Arrays.copyOf(new Object[]{C05170If.LIZ((User) interfaceC05190Ih)}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c47121t6.setText(LLLZ);
            this.LLIFFJFJJ.setText(C15380j0.LJIILJJIL(R.string.lkj));
            this.LLIFFJFJJ.setReduceFont(true);
            C47061t0 c47061t0 = this.LJLJJLL;
            if (c47061t0 != null) {
                C15490jB.LJ(c47061t0, "tiktok_live_revenue_demand_2", "ttlive_education_panel_entry_banner.png");
            }
            C47061t0 c47061t02 = this.LJLJLJ;
            if (c47061t02 != null) {
                C15490jB.LJ(c47061t02, "tiktok_live_revenue_demand_2", "ttlive_education_panel_entry_banner.png");
            }
            this.LLII.setText(C15380j0.LJIILJJIL(R.string.lkm));
            return;
        }
        C29306Beo.LJI(this.LLI);
        this.LLIFFJFJJ.LJJIJIL(R.style.a4d);
        this.LLIFFJFJJ.setText(C15380j0.LJIILJJIL(R.string.lkl));
        C47121t6 c47121t62 = this.LLIFFJFJJ;
        int LIZ = C15380j0.LIZ(19.0f);
        if (c47121t62 != null) {
            ViewGroup.LayoutParams layoutParams = c47121t62.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = LIZ;
                marginLayoutParams.topMargin = LIZ;
            }
            c47121t62.requestLayout();
        }
        this.LLII.setText(C15380j0.LJIILJJIL(R.string.o1j));
        C32313CmD c32313CmD = AbstractC32320CmK.LIZ;
        if (c32313CmD.LJIIL()) {
            ImageView imageView = this.LJLL;
            C47121t6 c47121t63 = this.LJLJLLL;
            if (imageView == null || c47121t63 == null) {
                return;
            }
            C29306Beo.LJJLJLI(imageView);
            C29306Beo.LJJLJLI(c47121t63);
            Gift LJI = c32313CmD.LJI();
            if (LJI != null) {
                i2 = LJI.diamondCount;
            } else {
                i2 = 0;
            }
            GiftsInfo giftsInfo = c32313CmD.LJ;
            if (giftsInfo != null && (liveLimitedTimeDiscountGiftInfo = giftsInfo.firstRechargeGiftInfo) != null) {
                j = liveLimitedTimeDiscountGiftInfo.originalPrice;
            } else {
                j = 0;
            }
            long j2 = i2;
            int LIZIZ = C15380j0.LIZIZ(R.color.ag);
            int LIZIZ2 = C15380j0.LIZIZ(R.color.a4b);
            boolean z = !LiveDiscountGiftPriceHide.INSTANCE.newUi();
            StringBuilder sb = new StringBuilder();
            sb.append(j2);
            sb.append("  ");
            if (z) {
                sb.append(j);
                sb.append(" ");
            }
            SpannableString spannableString = new SpannableString(sb);
            try {
                spannableString.setSpan(new ForegroundColorSpan(LIZIZ), 0, String.valueOf(j2).length(), 33);
                if (z) {
                    spannableString.setSpan(new StrikethroughSpan(), String.valueOf(j2).length() + 1, String.valueOf(j2).length() + String.valueOf(j).length() + 3, 33);
                    spannableString.setSpan(new ForegroundColorSpan(LIZIZ2), String.valueOf(j2).length() + 1, String.valueOf(j2).length() + String.valueOf(j).length() + 3, 33);
                }
            } catch (Exception e) {
                C0NB.LIZIZ(this.LLFZ, e.toString());
            }
            c47121t63.setText(spannableString);
            return;
        }
        if (!(abstractC32698CsQ instanceof AbstractC32756CtM) || (abstractC32756CtM = (AbstractC32756CtM) abstractC32698CsQ) == null) {
            return;
        }
        int LJIILIIL = abstractC32756CtM.LJIILIIL();
        ImageView imageView2 = this.LJLL;
        if (imageView2 != null) {
            C29306Beo.LJJLJLI(imageView2);
        }
        C47121t6 c47121t64 = this.LJLJLLL;
        if (c47121t64 == null) {
            return;
        }
        c47121t64.setText(C15380j0.LJIILL(R.string.stq, String.valueOf(LJIILIIL)));
    }
}
