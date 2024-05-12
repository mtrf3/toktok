package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS1S0000000_4;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.live.gift.GiftStartSendEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalStrikeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2A extends FrameLayout {
    public float LJLIL;
    public ValueAnimator LJLILLLLZI;
    public ValueAnimator LJLJI;
    public AnimatorSet LJLJJI;
    public float LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public U2D LJLLI;
    public boolean LJLLILLLL;
    public DataChannel LJLLJ;
    public EnumC76178Tv4 LJLLL;
    public Gift LJLLLL;
    public boolean LJLLLLLL;
    public final ARunnableS49S0100000_13 LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public int LL;
    public C47061t0 LLD;
    public boolean LLF;
    public final java.util.Map<Integer, View> LLFF;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LLFF;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final int getAbsDiffScore() {
        return Math.abs(this.LJLJLJ - this.LJLJLLL);
    }

    public final boolean LIZIZ() {
        if (this.LJLLL == EnumC76178Tv4.START && this.LJZI && !this.LJZ) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        ArrayList arrayList = new ArrayList();
        this.LJLJJI = new AnimatorSet();
        int childCount = ((ViewGroup) LIZ(R.id.j1m)).getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((ViewGroup) LIZ(R.id.j1m)).getChildAt(i);
            Property property = View.TRANSLATION_X;
            float[] fArr = new float[2];
            fArr[0] = LIZ(R.id.nbf).getWidth() * (-1.0f);
            U2C u2c = (U2C) LIZ(R.id.nbf);
            float f = 0.0f;
            if (u2c != null) {
                f = u2c.LIZJ(0.0f);
            }
            fArr[1] = ((int) f) * 1.0f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
            ofFloat.setStartDelay(i * 500);
            ofFloat.setDuration(3500L);
            ofFloat.setRepeatMode(1);
            ofFloat.setRepeatCount(-1);
            arrayList.add(ofFloat);
        }
        AnimatorSet animatorSet = this.LJLJJI;
        if (animatorSet != null) {
            animatorSet.playTogether(arrayList);
        }
        AnimatorSet animatorSet2 = this.LJLJJI;
        if (animatorSet2 != null) {
            animatorSet2.setDuration(4000L);
        }
        AnimatorSet animatorSet3 = this.LJLJJI;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final boolean LJ() {
        if (C76265TwT.LIZ.LJII() && !this.LJZL) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        String str;
        User user;
        String str2;
        C75832TpU c75832TpU = C75832TpU.LIZ;
        boolean z = this.LJLLILLLL;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C75832TpU.LJIILIIL(linkedHashMap);
        if (z) {
            str = "anchor";
        } else {
            str = "user";
        }
        linkedHashMap.put("user_type", str);
        C75832TpU.LJI(linkedHashMap, false);
        if (C75832TpU.LJIIZILJ()) {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_only_gift_gift_click", linkedHashMap, "1");
        } else {
            C75832TpU.LJJJIL(c75832TpU, "livesdk_pk_only_gift_gift_click", linkedHashMap, CardStruct.IStatusCode.DEFAULT);
        }
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            user = room.getOwner();
        } else {
            user = null;
        }
        C32004ChE c32004ChE = new C32004ChE(user);
        c32004ChE.LIZIZ = "only_gift_pk_mode";
        HashMap hashMap = new HashMap();
        C75832TpU.LJI(hashMap, false);
        C76280Twi c76280Twi = C76265TwT.LIZ;
        int i = C75833TpV.LIZ[c76280Twi.LJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "";
            } else {
                str2 = "punish";
            }
        } else {
            str2 = "pk_phase";
        }
        hashMap.put("match_status", str2);
        c32004ChE.LJ = hashMap;
        c32004ChE.LJIIIIZZ = c76280Twi.LJIILL;
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            dataChannel.qv0(SendGiftEvent.class, c32004ChE);
        }
    }

    public final void LJIIJJI() {
        long j;
        if (C30922CBq.LIZIZ) {
            GiftModeMeta giftModeMeta = C76265TwT.LIZ.LJIILLIIL;
            if (giftModeMeta != null) {
                j = giftModeMeta.giftId;
            } else {
                j = 0;
            }
            View LIZ = LIZ(R.id.gfe);
            StringBuilder LIZJ = V10.LIZJ("match progress extra info, left gift:", j, ", left text:");
            LIZJ.append((Object) ((AppCompatTextView) LIZ(R.id.fpn)).getText());
            LIZ.setTag(X1D.LIZIZ(LIZJ));
            View LIZ2 = LIZ(R.id.gfm);
            StringBuilder LIZJ2 = V10.LIZJ("match progress extra info, right gift:", j, ", right text:");
            LIZJ2.append((Object) ((AppCompatTextView) LIZ(R.id.j3a)).getText());
            LIZ2.setTag(X1D.LIZIZ(LIZJ2));
        }
    }

    public final void LJIIL() {
        int i;
        Boolean bool;
        if (this.LJLLL != EnumC76178Tv4.START || this.LL < 1) {
            return;
        }
        U2D u2d = this.LJLLI;
        U2D u2d2 = U2D.SHOCK;
        if (u2d == u2d2) {
            return;
        }
        if (!this.LJZ) {
            LIZ(R.id.hqo).setAlpha(0.0f);
        }
        LJFF((C47061t0) LIZ(R.id.hqo), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_2"), "match_blood_shock_wave.webp");
        LJIIIZ(72.0f, 26.0f, 2.0f, 0.0f);
        LJIIZILJ(72.0f);
        this.LJLLI = u2d2;
        C0NB.LIZIZ("BattleHealthBarTAG", "animation state = shock");
        LJIJ(this.LJLIL);
        LIZ(R.id.hqo).setScaleX(1.0f);
        ImageView imageView = (ImageView) LIZ(R.id.hqo);
        if (this.LJZ) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ((ImageView) LIZ(R.id.gj8)).setVisibility(8);
        if (!this.LJZ) {
            ObjectAnimator.ofFloat(LIZ(R.id.hqo), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f).setDuration(200L).start();
        }
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(UserIsAnchorChannel.class)) != null) {
            bool.booleanValue();
        }
        LJIILLIIL();
    }

    public final void LJIILJJIL() {
        float f;
        if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
            LJFF((C47061t0) LIZ(R.id.hqo), "tiktok_live_match_redesign_resource", "live_battle_score_animation_weak.webp");
        } else {
            LJFF((C47061t0) LIZ(R.id.hqo), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_battle_score_weak_animation.webp");
        }
        if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
            f = -2.3f;
        } else {
            f = 0.5f;
        }
        LJIIIZ(50.0f, 35.0f, f, 4.0f);
        LJIIZILJ(50.0f);
        this.LJLLI = U2D.WEAK;
        C0NB.LIZIZ("BattleHealthBarTAG", "animation state = weak");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C75622Tm6.LJIJ(EnumC76429Tz7.MATCH_HEALTH_BAR);
        super.onDetachedFromWindow();
    }

    public final void LJIILLIIL() {
        if (LIZ(R.id.nbf) == null || this.LLF) {
            return;
        }
        View LIZ = LIZ(R.id.j1m);
        int i = 0;
        if (LIZ != null) {
            LIZ.setVisibility(0);
        }
        this.LLF = true;
        ViewGroup viewGroup = (ViewGroup) LIZ(R.id.j1m);
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            ((ViewGroup) LIZ(R.id.j1m)).removeAllViews();
        }
        do {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dkf, C16880lQ.LLZIL(getContext()), null);
            ViewGroup viewGroup2 = (ViewGroup) LIZ(R.id.j1m);
            if (viewGroup2 != null) {
                viewGroup2.addView(LLLZIIL, new FrameLayout.LayoutParams(-1, -1));
            }
            i++;
        } while (i < 3);
        if (LIZ(R.id.nbf).getMeasuredWidth() == 0) {
            LIZ(R.id.nbf).post(new ARunnableS49S0100000_13(this, 27));
        } else {
            LIZJ();
        }
    }

    public final View getLeftTextView$liveinteract_impl_release() {
        View left_text = LIZ(R.id.fpn);
        o.LJIIIIZZ(left_text, "left_text");
        return left_text;
    }

    public final int getLeftValue$liveinteract_impl_release() {
        U2C u2c = (U2C) LIZ(R.id.nbf);
        if (u2c != null) {
            return u2c.getLeftValue();
        }
        return 0;
    }

    public final View getRightTextView$liveinteract_impl_release() {
        View right_text = LIZ(R.id.j3a);
        o.LJIIIIZZ(right_text, "right_text");
        return right_text;
    }

    public final int getRightValue$liveinteract_impl_release() {
        U2C u2c = (U2C) LIZ(R.id.nbf);
        if (u2c != null) {
            return u2c.getRightValue();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        U2C u2c = (U2C) LIZ(R.id.nbf);
        AqS179S0100000_13 aqS179S0100000_13 = new AqS179S0100000_13(this, 70);
        AqS179S0100000_13 aqS179S0100000_132 = new AqS179S0100000_13(this, 71);
        u2c.LLFFF = aqS179S0100000_13;
        u2c.LLFII = aqS179S0100000_132;
        LJIIZILJ(50.0f);
    }

    public final DataChannel getDataChannel() {
        return this.LJLLJ;
    }

    public final void LIZLLL(Gift gift) {
        C76280Twi c76280Twi = C76265TwT.LIZ;
        if (!c76280Twi.LJIJ && gift.id == c76280Twi.LJIILL) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 10);
            ofInt.setDuration(400L);
            ofInt.addListener(new ALAdapterS10S0100000_13(this, 26));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.35f);
            ofFloat.setDuration(260L);
            ofFloat.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 64));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.35f, 0.8f);
            ofFloat2.setDuration(200L);
            ofFloat2.setInterpolator(C18950ol.LIZIZ(0.66f, 0.0f, 0.67f, 1.0f));
            ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(this, 65));
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.8f, 1.2f);
            ofFloat3.setDuration(200L);
            ofFloat3.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 66));
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(1.2f, 0.9f);
            ofFloat4.setDuration(200L);
            ofFloat4.setInterpolator(C18950ol.LIZIZ(0.33f, 0.0f, 0.67f, 1.0f));
            ofFloat4.addUpdateListener(new AUListenerS100S0100000_13(this, 67));
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.9f, 1.0f);
            ofFloat5.setDuration(200L);
            ofFloat5.setInterpolator(C18950ol.LIZIZ(0.2f, 0.0f, 0.36f, 1.0f));
            ofFloat5.addUpdateListener(new AUListenerS100S0100000_13(this, 69));
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(LIZ(R.id.dtb), (Property<View, Float>) View.ALPHA, 0.0f, 0.9f);
            ofFloat6.setDuration(260L);
            ofFloat6.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            ofFloat6.addUpdateListener(new AUListenerS100S0100000_13(this, 62));
            ofFloat6.addListener(new ALAdapterS10S0100000_13(this, 28));
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(LIZ(R.id.dtb), (Property<View, Float>) View.ALPHA, 0.9f, 0.0f);
            ofFloat7.setDuration(800L);
            ofFloat7.setInterpolator(C18950ol.LIZIZ(0.23f, 0.0f, 0.42f, 1.0f));
            ofFloat7.addUpdateListener(new AUListenerS100S0100000_13(this, 63));
            ofFloat7.addListener(new ALAdapterS10S0100000_13(this, 29));
            ValueAnimator ofInt2 = ValueAnimator.ofInt(1, 10);
            ofInt2.setDuration(1200L);
            ofInt2.addListener(new ALAdapterS1S0000000_4(0));
            ValueAnimator ofFloat8 = ValueAnimator.ofFloat(1.0f, 10.0f);
            ofFloat8.setDuration(2660L);
            ofFloat8.addListener(new ALAdapterS10S0100000_13(this, 34));
            AnimatorSet animatorSet = new AnimatorSet();
            AnimatorSet.Builder before = animatorSet.play(ofInt).before(ofFloat);
            View LIZ = LIZ(R.id.j1m);
            if (LIZ != null) {
                LIZ.setVisibility(8);
            }
            ViewGroup viewGroup = (ViewGroup) LIZ(R.id.j1m);
            if (viewGroup != null && viewGroup.getChildCount() > 0) {
                ((ViewGroup) LIZ(R.id.j1m)).removeAllViews();
            }
            int LIZ2 = C15380j0.LIZ(95.0f);
            int i = 0;
            do {
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.dke, C16880lQ.LLZIL(getContext()), null);
                ViewGroup viewGroup2 = (ViewGroup) LIZ(R.id.j1m);
                if (viewGroup2 != null) {
                    viewGroup2.addView(LLLZIIL, new FrameLayout.LayoutParams(LIZ2, -1));
                }
                LLLZIIL.setTranslationX(-LIZ2);
                i++;
            } while (i < 2);
            float f = -LIZ2;
            ValueAnimator ofFloat9 = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat9.setDuration(1300L);
            ofFloat9.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            ofFloat9.addUpdateListener(new AUListenerS100S0100000_13(this, 59));
            ofFloat9.addListener(new ALAdapterS10S0100000_13(this, 25));
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(((ViewGroup) LIZ(R.id.j1m)).getChildAt(0), (Property<View, Float>) View.ALPHA, 0.5f, 0.0f);
            ValueAnimator ofFloat11 = ValueAnimator.ofFloat(f, 0.0f);
            ofFloat11.setDuration(1300L);
            ofFloat11.setInterpolator(C18950ol.LIZIZ(0.0f, 0.0f, 0.34f, 1.0f));
            ofFloat11.addUpdateListener(new AUListenerS100S0100000_13(this, 61));
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(((ViewGroup) LIZ(R.id.j1m)).getChildAt(1), (Property<View, Float>) View.ALPHA, 0.5f, 0.0f);
            ValueAnimator ofInt3 = ValueAnimator.ofInt(0, 12);
            ofInt3.setDuration(1000L);
            ValueAnimator ofInt4 = ValueAnimator.ofInt(0, 12);
            ofInt4.setDuration(300L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.play(ofInt3).before(ofFloat9).before(ofInt4);
            animatorSet2.play(ofFloat11).after(ofInt4);
            animatorSet2.play(ofFloat10).after(2000L);
            animatorSet2.play(ofFloat12).after(2300L);
            animatorSet2.addListener(new ALAdapterS10S0100000_13(this, 23));
            before.before(animatorSet2).before(ofFloat6).before(ofInt2);
            animatorSet.play(ofFloat2).after(ofFloat);
            animatorSet.play(ofFloat3).after(ofFloat2);
            animatorSet.play(ofFloat4).after(ofFloat3);
            animatorSet.play(ofFloat5).after(ofFloat4);
            animatorSet.play(ofFloat7).after(ofFloat6);
            animatorSet.play(ofFloat8).after(ofInt2);
            animatorSet.addListener(new ALAdapterS10S0100000_13(this, 24));
            animatorSet.start();
            C76280Twi c76280Twi2 = C76265TwT.LIZ;
            c76280Twi2.LJIJ = true;
            c76280Twi2.LJIIZILJ = true;
        }
        if (((IGiftService) CN1.LIZ(IGiftService.class)).isFirstRechargeGift(gift.id)) {
            ((U2C) LIZ(R.id.nbf)).LIZIZ();
            return;
        }
        this.LJLLLLLL = false;
        this.LJLLLL = gift;
        ((U2C) LIZ(R.id.nbf)).setPreviewValue(gift.diamondCount);
    }

    public final void LJII(boolean z) {
        GiftModeMeta giftModeMeta;
        ImageModel imageModel;
        Boolean bool;
        C0NB.LIZIZ("BattleHealthBarTAG", "reset progress bar to middle");
        this.LJLJL = -1;
        this.LJLJJLL = -1;
        boolean z2 = false;
        ((ImageView) LIZ(R.id.gj8)).setVisibility(0);
        ((ImageView) LIZ(R.id.hqo)).setVisibility(8);
        LIZ(R.id.c_p).setVisibility(8);
        LIZ(R.id.c_q).setVisibility(8);
        this.LJLL = true;
        this.LJLLI = U2D.MIDDLE;
        C0NB.LIZIZ("BattleHealthBarTAG", "animation state = middle");
        this.LJZ = false;
        this.LJZI = false;
        View LIZ = LIZ(R.id.j1m);
        if (LIZ != null) {
            LIZ.setVisibility(8);
        }
        ViewGroup viewGroup = (ViewGroup) LIZ(R.id.j1m);
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        if (LJ()) {
            ((U2C) LIZ(R.id.nbf)).setExtraSpace(C15380j0.LJIIL() * 0.08f);
            ((TextView) LIZ(R.id.fpn)).setText("x 0");
            ((TextView) LIZ(R.id.j3a)).setText("0 x");
            ((ImageView) LIZ(R.id.fou)).setVisibility(0);
            ((ImageView) LIZ(R.id.j2e)).setVisibility(0);
        } else {
            ((U2C) LIZ(R.id.nbf)).setExtraSpace(0.0f);
            ((TextView) LIZ(R.id.fpn)).setText(CardStruct.IStatusCode.DEFAULT);
            ((TextView) LIZ(R.id.j3a)).setText(CardStruct.IStatusCode.DEFAULT);
            ((ImageView) LIZ(R.id.fou)).setVisibility(8);
            ((ImageView) LIZ(R.id.j2e)).setVisibility(8);
        }
        ((C56414MCc) LIZ(R.id.dt8)).setVisibility(8);
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLIL = 0.5f;
        LJIIZILJ(50.0f);
        U2C u2c = (U2C) LIZ(R.id.nbf);
        if (u2c != null) {
            u2c.LJLJLJ = 0;
            u2c.LJLJLLL = 0;
            u2c.LJLJJLL = 0.5f;
            u2c.LJLJL = 0.5f;
            u2c.LJZL = true;
            u2c.LLFF = 0.0f;
            u2c.LL = false;
            u2c.LLD = false;
            u2c.LIZLLL();
            u2c.LIZIZ();
            u2c.invalidate();
        }
        Gift gift = null;
        if (z) {
            if (!this.LJZL) {
                DataChannel dataChannel = this.LJLLJ;
                if (dataChannel != null) {
                    gift = (Gift) dataChannel.kv0(GiftSelectedChangeEvent.class);
                }
                DataChannel dataChannel2 = this.LJLLJ;
                if (dataChannel2 != null && (bool = (Boolean) dataChannel2.kv0(GiftDialogVisibilityChannel.class)) != null) {
                    z2 = bool.booleanValue();
                }
                if (gift != null && z2) {
                    LIZLLL(gift);
                }
                if (LJ() && (giftModeMeta = C76265TwT.LIZ.LJIILLIIL) != null && (imageModel = giftModeMeta.giftIconImage) != null) {
                    C15640jQ.LIZLLL((ImageView) LIZ(R.id.fou), imageModel);
                    C15640jQ.LIZLLL((ImageView) LIZ(R.id.j2e), imageModel);
                }
            }
        } else {
            this.LJLLLL = null;
            this.LJLLLLLL = false;
            removeCallbacks(this.LJLZ);
        }
        LJIIJJI();
    }

    public final void LJIIJ(DataChannel dataChannel) {
        Object obj;
        Long l;
        this.LJLLILLLL = true;
        this.LJLLJ = dataChannel;
        ((U2C) LIZ(R.id.nbf)).LJFF(C76128TuG.LIZIZ(dataChannel, this.LJZL, 2));
        DataChannel dataChannel2 = this.LJLLJ;
        if (dataChannel2 != null) {
            dataChannel2.mv0(BattleTimeLeftChannel.class, this, new AqS179S0100000_13(this, 363));
            dataChannel2.mv0(BattleStateChannel.class, this, new AqS179S0100000_13(this, 364));
            dataChannel2.mv0(BattleBonusTaskStateChannel.class, this, new AqS179S0100000_13(this, 365));
            dataChannel2.mv0(BattleCriticalStrikeCardEffectChannel.class, this, new AqS179S0100000_13(this, 366));
            dataChannel2.mv0(BattleSmokeDebuffChannel.class, this, new AqS179S0100000_13(this, 367));
            dataChannel2.mv0(GiftDialogVisibilityChannel.class, this, new AqS179S0100000_13(this, 368));
            dataChannel2.mv0(GiftSelectedChangeEvent.class, this, new AqS179S0100000_13(this, 369));
            dataChannel2.mv0(GiftStartSendEvent.class, this, new AqS179S0100000_13(this, 370));
        }
        DataChannel dataChannel3 = this.LJLLJ;
        if (dataChannel3 != null) {
            obj = dataChannel3.kv0(BattleStateChannel.class);
        } else {
            obj = null;
        }
        EnumC76178Tv4 enumC76178Tv4 = EnumC76178Tv4.PUNISH;
        if (obj == enumC76178Tv4) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("initAnimation, state=");
            LIZ.append(enumC76178Tv4);
            setEmojiAnim(X1D.LIZIZ(LIZ));
            return;
        }
        DataChannel dataChannel4 = this.LJLLJ;
        if (dataChannel4 == null || (l = (Long) dataChannel4.kv0(BattleTimeLeftChannel.class)) == null) {
            return;
        }
        long longValue = l.longValue();
        if (longValue != 0 && longValue < LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue() && !LIZIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("initAnimation, leftTime=");
            LIZ2.append(longValue);
            setEmojiAnim(X1D.LIZIZ(LIZ2));
        }
        if (!LIZIZ()) {
            return;
        }
        LJIIL();
    }

    public final void LJIILL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Object obj;
        int i;
        if (LIZ(R.id.nbf) == null) {
            return;
        }
        if (this.LL >= 1) {
            interfaceC65784Pro.invoke();
            return;
        }
        View LIZ = LIZ(R.id.gfb);
        if (LIZ != null) {
            LIZ.setVisibility(0);
        }
        this.LLD = new C47061t0(getContext());
        DataChannel dataChannel = this.LJLLJ;
        if (dataChannel != null) {
            obj = dataChannel.kv0(BattleSmokeDebuffChannel.class);
        } else {
            obj = null;
        }
        if (obj == EnumC76461Tzd.EFFECTING) {
            i = C15380j0.LJIIL();
        } else {
            U2C u2c = (U2C) LIZ(R.id.nbf);
            float f = 0.0f;
            if (u2c != null) {
                f = u2c.LIZJ(0.0f);
            }
            i = (int) f;
        }
        ViewGroup viewGroup = (ViewGroup) LIZ(R.id.gfb);
        if (viewGroup != null) {
            viewGroup.addView(this.LLD, 0, new FrameLayout.LayoutParams(i, C87277YNd.LJIIJJI(26), 16));
        }
        C012403c.LJ("show Flash Animation ---effectWidth = ", i, "BattleHealthBarTAG");
        if (this.LLD == null) {
            return;
        }
        C15540jG c15540jG = new C15540jG();
        c15540jG.LJIILIIL = true;
        C47061t0 c47061t0 = this.LLD;
        if (c47061t0 != null) {
            c15540jG.LIZ = c47061t0;
            c15540jG.LIZIZ = CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1");
            c15540jG.LIZJ = "match_item_effect_blood_flash.webp";
            c15540jG.LJFF = true;
            c15540jG.LJ = new U2B(this, interfaceC65784Pro);
            C15490jB.LJI(c15540jG);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void LJIIZILJ(float f) {
        if (LIZ(R.id.nbf) == null) {
            return;
        }
        this.LJLJJL = f;
        ((U2C) LIZ(R.id.nbf)).setCoverWidth(f);
    }

    public final void LJIJ(float f) {
        if (LIZ(R.id.hqo) == null) {
            return;
        }
        float startSpace$liveinteract_impl_release = ((U2C) LIZ(R.id.nbf)).getStartSpace$liveinteract_impl_release() + ((getWidth() - (((U2C) LIZ(R.id.nbf)).getStartSpace$liveinteract_impl_release() * 2.0f)) * f);
        View LIZ = LIZ(R.id.hqo);
        if (LIZ != null) {
            LIZ.setTranslationX(startSpace$liveinteract_impl_release - (C15380j0.LIZ(this.LJLJJL) / 2));
        }
        LIZ(R.id.nbf).invalidate();
        View LIZ2 = LIZ(R.id.j1m);
        if (LIZ2 == null) {
            return;
        }
        C78866UxK.LJJLJ((int) (startSpace$liveinteract_impl_release - (C15380j0.LIZ(this.LJLJJL) / 2)), LIZ2);
    }

    public final void setAnchor(boolean z) {
        this.LJLLILLLL = z;
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLLJ = dataChannel;
    }

    public final void setEmojiAnim(String str) {
        String str2;
        float f;
        float f2;
        C279017q.LJ("animation state = emoji, source=", str, "BattleHealthBarTAG");
        boolean LIZIZ = C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2);
        if (!LIZIZ) {
            float f3 = this.LJLIL;
            if (f3 < 0.25f) {
                str2 = "live_battle_score_cry_animation.webp";
            } else if (f3 < 0.5f || f3 == 0.5f) {
                str2 = "live_battle_score_strive_animation.webp";
            } else if (f3 < 0.75f) {
                str2 = "live_battle_score_clap_animation.webp";
            } else {
                str2 = "live_battle_score_tongue_animation.webp";
            }
        } else {
            float f4 = this.LJLIL;
            if (f4 < 0.25f) {
                str2 = "live_battle_score_animation_sad.webp";
            } else if (f4 < 0.5f || f4 == 0.5f) {
                str2 = "live_battle_score_animation_come_on.webp";
            } else if (f4 < 0.75f) {
                str2 = "live_battle_score_animation_clap.webp";
            } else {
                str2 = "live_battle_score_animation_sunglasses.webp";
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("and animationState = ");
        LIZ.append(this.LJLLI);
        LIZ.append(" filename = ");
        LIZ.append(str2);
        C0NB.LIZIZ("BattleHealthBarTAG", X1D.LIZIZ(LIZ));
        if (LIZIZ) {
            LJFF((C47061t0) LIZ(R.id.hqo), "tiktok_live_match_redesign_resource", str2);
        } else {
            LJFF((C47061t0) LIZ(R.id.hqo), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), str2);
        }
        float f5 = 28.0f;
        if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
            f = 34.0f;
        } else {
            f = 28.0f;
        }
        if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
            f2 = 34.0f;
        } else {
            f2 = 28.0f;
        }
        LJIIIZ(f, f2, 0.0f, 0.0f);
        if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
            f5 = 34.0f;
        }
        LJIIZILJ(f5);
        this.LJLLI = U2D.EMOJI;
        LJIJ(this.LJLIL);
        LIZ(R.id.hqo).setScaleX(1.0f);
        ((ImageView) LIZ(R.id.hqo)).setVisibility(0);
        ((ImageView) LIZ(R.id.gj8)).setVisibility(8);
    }

    public final void setIsFromFeed(boolean z) {
        this.LJZL = z;
        ((U2C) LIZ(R.id.nbf)).LJFF(C76128TuG.LIZIZ(null, z, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setLeftData(X.C76385TyP r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U2A.setLeftData(X.TyP):void");
    }

    public final void setRightValue(int i) {
        if (!this.LJZ) {
            LIZ(R.id.j3a).setVisibility(0);
        } else {
            LIZ(R.id.j3a).setVisibility(8);
        }
        if (this.LJLJL == i) {
            return;
        }
        this.LJLJL = i;
        if (C76265TwT.LIZ.LJII()) {
            ((U2C) LIZ(R.id.nbf)).setExtraSpace(C15380j0.LJIIL() * 0.08f);
        }
        LJIIIIZZ(((U2C) LIZ(R.id.nbf)).getLeftValue(), i);
        LJIILIIL(i, false, false);
        U2C u2c = (U2C) LIZ(R.id.nbf);
        if (u2c != null) {
            u2c.setRightValue(i);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        ImageModel imageModel;
        super.setVisibility(i);
        if (i == 0) {
            long LIZ = C30725C4b.LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("componentLoadStartTime = ");
            LIZ2.append(C75622Tm6.LJI);
            LIZ2.append(" --------22222----loadSuccess = ");
            LIZ2.append(LIZ);
            C0NB.LIZIZ("loadTime", X1D.LIZIZ(LIZ2));
            if (C75622Tm6.LJI == 0) {
                C75622Tm6.LJI = LIZ;
            }
            C75622Tm6.LJIJI(EnumC76429Tz7.MATCH_HEALTH_BAR, true, null);
            if (LJ() && LIZ(R.id.fou).getVisibility() != 0) {
                ((ImageView) LIZ(R.id.fou)).setVisibility(0);
                ((ImageView) LIZ(R.id.j2e)).setVisibility(0);
                GiftModeMeta giftModeMeta = C76265TwT.LIZ.LJIILLIIL;
                if (giftModeMeta != null && (imageModel = giftModeMeta.giftIconImage) != null) {
                    C15640jQ.LIZLLL((ImageView) LIZ(R.id.fou), imageModel);
                    C15640jQ.LIZLLL((ImageView) LIZ(R.id.j2e), imageModel);
                }
                LJIIJJI();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2A(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int i;
        int i2;
        this.LLFF = C62850Ola.LJFF(context, "context");
        this.LJLIL = 0.5f;
        this.LJLJJL = 50.0f;
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLL = true;
        this.LJLLI = U2D.MIDDLE;
        this.LJLLL = EnumC76178Tv4.NORMAL;
        this.LJLZ = new ARunnableS49S0100000_13(this, 107);
        C16880lQ.LLLZIIL(R.layout.dg5, C16880lQ.LLZIL(context), this);
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.dcd);
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        C15490jB.LJ(LIZ(R.id.gj8), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_battle_score_initial_animation.webp");
        View left_gift_icon_iv = LIZ(R.id.fou);
        o.LJIIIIZZ(left_gift_icon_iv, "left_gift_icon_iv");
        C29306Beo.LJJJLL(left_gift_icon_iv, 500L, new AqS179S0100000_13(this, 361));
        View right_gift_icon_iv = LIZ(R.id.j2e);
        o.LJIIIIZZ(right_gift_icon_iv, "right_gift_icon_iv");
        C29306Beo.LJJJLL(right_gift_icon_iv, 500L, new AqS179S0100000_13(this, 362));
        View LIZ = LIZ(R.id.fou);
        if (C76128TuG.LIZIZ(this.LJLLJ, false, 6)) {
            i = R.drawable.ct8;
        } else {
            i = R.drawable.ct7;
        }
        LIZ.setBackground(C04270Et.LIZIZ(context, i));
        View LIZ2 = LIZ(R.id.j2e);
        if (C76128TuG.LIZIZ(this.LJLLJ, false, 6)) {
            i2 = R.drawable.ct6;
        } else {
            i2 = R.drawable.ct5;
        }
        LIZ2.setBackground(C04270Et.LIZIZ(context, i2));
        setClipChildren(false);
    }

    public final void LJIIIIZZ(int i, int i2) {
        float f;
        float f2;
        if (i == 0 && i2 == 0) {
            return;
        }
        int i3 = 8;
        ((ImageView) LIZ(R.id.gj8)).setVisibility(8);
        ImageView imageView = (ImageView) LIZ(R.id.hqo);
        if (!this.LJZ) {
            i3 = 0;
        }
        imageView.setVisibility(i3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("leftValue =");
        LIZ.append(i);
        LIZ.append(" rightValue = ");
        LIZ.append(i2);
        LIZ.append(" and animationState = ");
        LIZ.append(this.LJLLI);
        C0NB.LIZIZ("RedesignHealth", X1D.LIZIZ(LIZ));
        U2D u2d = this.LJLLI;
        if (u2d != U2D.EMOJI) {
            U2D u2d2 = U2D.SHOCK;
            if (u2d == u2d2 && this.LJZI) {
                return;
            }
            int i4 = i - this.LJLJLJ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("animationSTate = ");
            LIZ2.append(this.LJLLI);
            LIZ2.append(" leftChangedValue = ");
            LIZ2.append(i4);
            LIZ2.append(" oldRightValue ");
            LIZ2.append(this.LJLJLLL);
            C0NB.LJ("BattleHealthBarTAG", X1D.LIZIZ(LIZ2));
            if (i4 >= 1000) {
                U2D u2d3 = this.LJLLI;
                U2D u2d4 = U2D.STRONG;
                if (u2d3 != u2d4) {
                    if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
                        LJFF((C47061t0) LIZ(R.id.hqo), "tiktok_live_match_redesign_resource", "live_battle_score_animation_rush.webp");
                    } else {
                        LJFF((C47061t0) LIZ(R.id.hqo), CFX.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_normal_1"), "live_battle_score_strong_animation.webp");
                    }
                    if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
                        f = 55.0f;
                    } else {
                        f = 50.0f;
                    }
                    if (C76128TuG.LIZIZ(this.LJLLJ, this.LJZL, 2)) {
                        f2 = 1.0f;
                    } else {
                        f2 = 3.0f;
                    }
                    LJIIIZ(f, 30.0f, f2, 0.0f);
                    LJIIZILJ(50.0f);
                    this.LJLLI = u2d4;
                    C0NB.LIZIZ("BattleHealthBarTAG", "animation state = strong");
                }
            } else if (i4 > 0) {
                if (this.LJLLI != U2D.WEAK) {
                    LJIILJJIL();
                }
            } else if (this.LJLJLJ == 0 && this.LJLJLLL == 0) {
                if (this.LJLLI != U2D.WEAK) {
                    LJIILJJIL();
                }
            } else if (!this.LJZI && this.LJLLI == u2d2) {
                LJIILJJIL();
            }
            this.LJLJLJ = i;
            this.LJLJLLL = i2;
            this.LJLL = true;
            U2C u2c = (U2C) LIZ(R.id.nbf);
            if (u2c == null) {
                return;
            }
            u2c.setAnimationToRight(this.LJLL);
        }
    }

    public static void LJFF(C47061t0 c47061t0, String str, String str2) {
        Object obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadGecko ----->>");
        Object obj2 = null;
        if (c47061t0 != null) {
            obj = c47061t0.getTag(R.id.lrv);
        } else {
            obj = null;
        }
        LIZ.append(obj);
        C0NB.LIZIZ("RedesignHealth", X1D.LIZIZ(LIZ));
        if (c47061t0 != null) {
            obj2 = c47061t0.getTag(R.id.lrv);
        }
        if (o.LJ(obj2, str2)) {
            return;
        }
        if (c47061t0 != null) {
            c47061t0.setTag(R.id.lrv, str2);
        }
        C15490jB.LJ(c47061t0, str, str2);
    }

    public final void LJIILIIL(int i, boolean z, boolean z2) {
        float f;
        String valueOf = String.valueOf(i);
        if (z) {
            TextView textView = (TextView) LIZ(R.id.fpn);
            if (LJ()) {
                valueOf = i0.LJFF("x ", valueOf);
            }
            textView.setText(valueOf);
            ValueAnimator valueAnimator = this.LJLILLLLZI;
            if ((valueAnimator != null && valueAnimator.isRunning()) || LIZ(R.id.fpn).getVisibility() == 8) {
                return;
            }
            float[] fArr = new float[2];
            fArr[0] = 1.0f;
            if (z2) {
                f = 2.0f;
            } else {
                f = 1.3f;
            }
            fArr[1] = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.LJLILLLLZI = ofFloat;
            if (ofFloat != null) {
                ofFloat.setDuration(200L);
            }
            ValueAnimator valueAnimator2 = this.LJLILLLLZI;
            if (valueAnimator2 != null) {
                valueAnimator2.setRepeatCount(1);
            }
            ValueAnimator valueAnimator3 = this.LJLILLLLZI;
            if (valueAnimator3 != null) {
                valueAnimator3.setRepeatMode(2);
            }
            ValueAnimator valueAnimator4 = this.LJLILLLLZI;
            if (valueAnimator4 != null) {
                valueAnimator4.addUpdateListener(new AUListenerS100S0100000_13(this, 56));
            }
            ValueAnimator valueAnimator5 = this.LJLILLLLZI;
            if (valueAnimator5 != null) {
                valueAnimator5.start();
            }
        } else {
            TextView textView2 = (TextView) LIZ(R.id.j3a);
            if (LJ()) {
                valueOf = i0.LJFF(valueOf, " x");
            }
            textView2.setText(valueOf);
            ValueAnimator valueAnimator6 = this.LJLJI;
            if ((valueAnimator6 == null || !valueAnimator6.isRunning()) && LIZ(R.id.j3a).getVisibility() != 8) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 1.3f);
                this.LJLJI = ofFloat2;
                if (ofFloat2 != null) {
                    ofFloat2.setDuration(200L);
                }
                ValueAnimator valueAnimator7 = this.LJLJI;
                if (valueAnimator7 != null) {
                    valueAnimator7.setRepeatCount(1);
                }
                ValueAnimator valueAnimator8 = this.LJLJI;
                if (valueAnimator8 != null) {
                    valueAnimator8.setRepeatMode(2);
                }
                ValueAnimator valueAnimator9 = this.LJLJI;
                if (valueAnimator9 != null) {
                    valueAnimator9.addUpdateListener(new AUListenerS100S0100000_13(this, 57));
                }
                ValueAnimator valueAnimator10 = this.LJLJI;
                if (valueAnimator10 != null) {
                    valueAnimator10.start();
                }
            } else {
                return;
            }
        }
        LJIIJJI();
    }

    public final void LJIIIZ(float f, float f2, float f3, float f4) {
        ViewGroup.LayoutParams layoutParams;
        View LIZ = LIZ(R.id.hqo);
        if (LIZ != null) {
            layoutParams = LIZ.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 80;
        layoutParams2.bottomMargin = C15380j0.LIZ(f3);
        layoutParams2.topMargin = C15380j0.LIZ(f4);
        layoutParams2.width = C15380j0.LIZ(f);
        layoutParams2.height = C15380j0.LIZ(f2);
        C47061t0 c47061t0 = (C47061t0) LIZ(R.id.hqo);
        if (c47061t0 == null) {
            return;
        }
        c47061t0.setLayoutParams(layoutParams2);
    }
}
