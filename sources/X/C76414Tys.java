package X;

import Y.ALAdapterS10S0100000_13;
import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS100S0100000_13;
import Y.AUListenerS102S0200000_13;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.chatroom.model.interact.CohostTopic;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchRequestLayoutSettings;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tys, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76414Tys extends FrameLayout {
    public static final /* synthetic */ int LJLLILLLL = 0;
    public AnimatorSet LJLIL;
    public final C47061t0 LJLILLLLZI;
    public AnimatorSet LJLJI;
    public AnimatorSet LJLJJI;
    public AnimatorSet LJLJJL;
    public long LJLJJLL;
    public C81705W4v LJLJL;
    public C73411SrX LJLJLJ;
    public ValueAnimator LJLJLLL;
    public InterfaceC76416Tyu LJLL;
    public final java.util.Map<Integer, View> LJLLI;

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AnimatorSet LIZJ() {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZ(R.id.me0), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat.setDuration(100L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LIZ(R.id.f8n), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat2.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(LIZ(R.id.fgu), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat3.setDuration(100L);
        ofFloat3.setStartDelay(100L);
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        return animatorSet;
    }

    public final void LJIIJ() {
        if (this.LJLJLJ != null) {
            C0NB.LIZIZ("LinkCrossTitleLayout", "dispose topic marquee textview count down");
            C73411SrX c73411SrX = this.LJLJLJ;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
        }
    }

    public final void LIZLLL() {
        C29306Beo.LJI(LIZ(R.id.fgv));
        ((ImageView) LIZ(R.id.f5b)).setVisibility(8);
        LIZ(R.id.fgu).setVisibility(4);
    }

    public final void LJFF() {
        LIZ(R.id.fn8).setVisibility(8);
        LIZ(R.id.fn8).setTranslationY(0.0f);
        LIZ(R.id.fn8).setScaleX(1.0f);
        LIZ(R.id.fn8).setScaleY(1.0f);
    }

    public final void LJI() {
        LIZ(R.id.me0).setAlpha(1.0f);
        LIZ(R.id.f8n).setAlpha(1.0f);
        LIZ(R.id.fgu).setAlpha(1.0f);
    }

    public final void LJIILJJIL() {
        RoomLinkInfo linkMicInfo;
        RoomLinkInfo linkMicInfo2;
        BattleInfoResponse battleInfoResponse;
        BattleSetting battleSetting;
        RoomLinkInfo linkMicInfo3;
        BattleInfoResponse battleInfoResponse2;
        BattleSetting battleSetting2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateWithLinkCross, channelId = ");
        LIZ.append(C8E.LIZLLL().LJJLI());
        LIZ.append(", topicInfo = ");
        LIZ.append(C75633TmH.LIZ);
        C0NB.LJIIIZ("LinkCrossTitleLayout", X1D.LIZIZ(LIZ));
        LIZ(R.id.fgu).setVisibility(8);
        LIZ(R.id.fgv).setVisibility(8);
        LIZ(R.id.fjd).setVisibility(0);
        C47061t0 c47061t0 = this.LJLILLLLZI;
        if (c47061t0 != null) {
            c47061t0.setVisibility(0);
        }
        if (!C75633TmH.LIZ.isEmpty()) {
            if (C75633TmH.LIZ.containsKey(0L)) {
                C75633TmH.LIZ.put(U26.LIZ(), C75633TmH.LIZ.remove(0L));
            }
            CohostTopic cohostTopic = (CohostTopic) ((LinkedHashMap) C75633TmH.LIZ).get(U26.LIZ());
            if (cohostTopic != null) {
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("updateWithLinkCross, battleState = ");
                LIZ2.append(C76265TwT.LIZ.LJ());
                LIZ2.append(", status = ");
                Integer num = null;
                if (room != null && (linkMicInfo3 = room.getLinkMicInfo()) != null && (battleInfoResponse2 = linkMicInfo3.battleInfo) != null && (battleSetting2 = battleInfoResponse2.setting) != null) {
                    num = Integer.valueOf(battleSetting2.status);
                }
                QZY.LIZJ(LIZ2, num, LIZ2, "LinkCrossTitleLayout");
                if (room == null || (linkMicInfo = room.getLinkMicInfo()) == null || linkMicInfo.battleInfo == null || (room != null && (linkMicInfo2 = room.getLinkMicInfo()) != null && (battleInfoResponse = linkMicInfo2.battleInfo) != null && (battleSetting = battleInfoResponse.setting) != null && battleSetting.status == 2)) {
                    C0NB.LIZIZ("LinkCrossTitleLayout", "start cohost topic bubble animation, update with link cross");
                    LIZIZ(cohostTopic, 0L);
                }
            }
        }
        AnimatorSet animatorSet = this.LJLJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final long getTopicHeat() {
        return CastLongProtector.parseLong(((AppCompatTextView) LIZ(R.id.mon)).getText().toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LJIIJ();
        AnimatorSet animatorSet = this.LJLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJLJJL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJLL = null;
        C75622Tm6.LJIJ(EnumC76429Tz7.MATCH_TITLE_BAR);
    }

    public final InterfaceC76416Tyu getTopicSetAnimationEndListener() {
        return this.LJLL;
    }

    public static final void LJII(C76414Tys c76414Tys) {
        AnimatorSet animatorSet = c76414Tys.LJLIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = c76414Tys.LJLIL;
            if (animatorSet2 != null) {
                C16880lQ.LJLJJL(animatorSet2);
            }
            AnimatorSet animatorSet3 = c76414Tys.LJLIL;
            if (animatorSet3 != null) {
                animatorSet3.end();
            }
            c76414Tys.LJLIL = null;
        }
    }

    public final void LJ(CohostTopic topic) {
        o.LJIIIZ(topic, "topic");
        AnimatorSet animatorSet = this.LJLJJL;
        if (animatorSet != null && animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LJLJJI;
        if (animatorSet2 != null && animatorSet2.isRunning()) {
            return;
        }
        LJIIJ();
        C0NB.LIZIZ("LinkCrossTitleLayout", "start cohost topic change animation");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 44));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(LIZ(R.id.f5b), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat2.setDuration(100L);
        ofFloat2.addListener(new ALAdapterS10S0100000_13(this, 14));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(LIZ(R.id.fjd).getMeasuredWidth(), C15380j0.LIZ(40.0f));
        ofFloat3.setDuration(300L);
        ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 45));
        ofFloat3.addListener(new ALAdapterS10S0200000_13(this, topic, 11));
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(ofFloat).before(ofFloat2);
        animatorSet3.play(ofFloat2).with(ofFloat3);
        animatorSet3.start();
        this.LJLJJL = animatorSet3;
    }

    public final void LJIIL(int i) {
        ConstraintLayout layout_battle_countdown = (ConstraintLayout) LIZ(R.id.fgu);
        o.LJIIIIZZ(layout_battle_countdown, "layout_battle_countdown");
        LJIILIIL(i, layout_battle_countdown);
    }

    public final void setTopicSetAnimationEndListener(InterfaceC76416Tyu interfaceC76416Tyu) {
        this.LJLL = interfaceC76416Tyu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76414Tys(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLLI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dc7, this, true);
        C80955Vpv c80955Vpv = (C80955Vpv) findViewById(R.id.ddg);
        ViewGroup.LayoutParams layoutParams = c80955Vpv.getLayoutParams();
        layoutParams.width = -1;
        c80955Vpv.setLayoutParams(layoutParams);
        c80955Vpv.setEnableSizeChange(true);
        c80955Vpv.setEnableFixedSize(LiveMatchRequestLayoutSettings.INSTANCE.isMatchEnabled());
        this.LJLILLLLZI = (C47061t0) findViewById(R.id.f5b);
        setOnClickListener(new ViewOnClickListenerC13880ga(ViewOnClickListenerC76417Tyv.LJLIL));
    }

    public static void LJIILIIL(int i, ConstraintLayout constraintLayout) {
        ViewParent parent = constraintLayout.getParent();
        if (parent instanceof FrameLayout) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            layoutParams.width = i;
            constraintLayout.setLayoutParams(layoutParams);
        } else {
            if (!(parent instanceof ConstraintLayout)) {
                return;
            }
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            ConstraintLayout constraintLayout2 = (ConstraintLayout) parent;
            anonymousClass064.LJII(constraintLayout2);
            anonymousClass064.LJIIL(constraintLayout.getId(), i);
            anonymousClass064.LIZIZ(constraintLayout2);
        }
    }

    public final void LIZIZ(CohostTopic topic, long j) {
        Number valueOf;
        o.LJIIIZ(topic, "topic");
        AnimatorSet animatorSet = this.LJLJJI;
        if ((animatorSet != null && animatorSet.isRunning()) || topic.titleKey.length() == 0) {
            return;
        }
        C75633TmH.LIZLLL = System.currentTimeMillis();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.1f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new InterpolatorC77120UOm(0.63f, 0.0f, 0.43f, 1.01f));
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 35));
        ofFloat.addListener(new ALAdapterS10S0200000_13(this, topic, 8));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.1f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setInterpolator(new InterpolatorC77120UOm(0.69f, 0.0f, 0.47f, 0.95f));
        ofFloat2.addUpdateListener(new AUListenerS100S0100000_13(this, 36));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.5f);
        ofFloat3.setDuration(200L);
        ofFloat3.setInterpolator(new InterpolatorC77120UOm(0.63f, 0.0f, 0.43f, 1.01f));
        ofFloat3.addUpdateListener(new AUListenerS100S0100000_13(this, 37));
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(LIZ(R.id.fn8), (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
        ofFloat4.setDuration(200L);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(LIZ(R.id.fn8), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat5.setDuration(200L);
        ValueAnimator ofFloat6 = ValueAnimator.ofFloat(0.0f, -C15380j0.LIZ(34.0f));
        ofFloat6.setDuration(300L);
        ofFloat6.addUpdateListener(new AUListenerS100S0100000_13(this, 38));
        ofFloat6.addListener(new ALAdapterS10S0100000_13(this, 13));
        ValueAnimator ofFloat7 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat7.setDuration(3500L);
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(1.0f, 1.25f);
        ofFloat8.setDuration(260L);
        ofFloat8.setInterpolator(new InterpolatorC77120UOm(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat8.addUpdateListener(new AUListenerS102S0200000_13(this, ofFloat8, 3));
        ValueAnimator ofFloat9 = ValueAnimator.ofFloat(1.25f, 1.0f);
        ofFloat9.setDuration(240L);
        ofFloat9.setInterpolator(new InterpolatorC77120UOm(0.33f, 0.0f, 0.67f, 1.0f));
        ofFloat9.addUpdateListener(new AUListenerS102S0200000_13(this, ofFloat9, 4));
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(LIZ(R.id.f5b), (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
        ofFloat10.setDuration(100L);
        C34K c34k = new C34K();
        int LIZ = C15380j0.LIZ(40.0f);
        ((C47121t6) LIZ(R.id.moo)).LJJIJIL(R.style.oy);
        ((C47121t6) LIZ(R.id.mon)).LJJIJIL(R.style.oy);
        String LIZ2 = C86881Y7x.LIZIZ().LIZ(topic.titleKey);
        if (LIZ2 == null) {
            LIZ2 = "";
        }
        float measureText = ((TextView) LIZ(R.id.moo)).getPaint().measureText(LIZ2);
        if (j == 0) {
            j = C75633TmH.LJFF;
        }
        String LJIIL = b.LJIIL(j);
        ((TextView) LIZ(R.id.moo)).setText(LIZ2);
        ((TextView) LIZ(R.id.mon)).setText(LJIIL);
        TextPaint paint = ((TextView) LIZ(R.id.mon)).getPaint();
        LJIIL.toString();
        float measureText2 = paint.measureText(LJIIL) + measureText;
        if (measureText2 > C15380j0.LIZ(210.0f)) {
            c34k.element = true;
            valueOf = Integer.valueOf(C15380j0.LIZ(268.0f));
        } else {
            valueOf = Float.valueOf(measureText2 + C15380j0.LIZ(58.0f));
        }
        ValueAnimator ofFloat11 = ValueAnimator.ofFloat(LIZ, valueOf.floatValue() * 1.06f);
        ofFloat11.setDuration(340L);
        ofFloat11.setInterpolator(new InterpolatorC77120UOm(0.14f, 0.0f, 0.52f, 0.99f));
        ofFloat11.addUpdateListener(new AUListenerS100S0100000_13(this, 42));
        ValueAnimator ofFloat12 = ValueAnimator.ofFloat(valueOf.floatValue() * 1.06f, valueOf.floatValue());
        ofFloat12.setDuration(300L);
        ofFloat12.setInterpolator(new InterpolatorC77120UOm(0.46f, -0.03f, 0.93f, 0.99f));
        ofFloat12.addUpdateListener(new AUListenerS100S0100000_13(this, 43));
        ValueAnimator ofFloat13 = ValueAnimator.ofFloat(1.0f, 1.06f);
        ofFloat13.setDuration(340L);
        ofFloat13.setInterpolator(new InterpolatorC77120UOm(0.14f, 0.0f, 0.52f, 0.99f));
        ofFloat13.addUpdateListener(new AUListenerS100S0100000_13(this, 39));
        ValueAnimator ofFloat14 = ValueAnimator.ofFloat(1.06f, 1.0f);
        ofFloat14.setDuration(300L);
        ofFloat14.setInterpolator(new InterpolatorC77120UOm(0.46f, -0.03f, 0.93f, 0.99f));
        ofFloat14.addUpdateListener(new AUListenerS100S0100000_13(this, 40));
        ofFloat14.addListener(new ALAdapterS10S0200000_13(this, c34k, 9));
        ValueAnimator ofFloat15 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat15.setDuration(120L);
        ofFloat15.addUpdateListener(new AUListenerS100S0100000_13(this, 41));
        ofFloat15.addListener(new ALAdapterS10S0200000_13(this, topic, 10));
        AnimatorSet animatorSet2 = new AnimatorSet();
        ValueAnimator ofFloat16 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat16.setDuration(560L);
        animatorSet2.play(ofFloat).with(ofFloat4).with(ofFloat7).before(ofFloat2);
        animatorSet2.play(ofFloat3).with(ofFloat5).with(ofFloat6).after(ofFloat7);
        animatorSet2.play(ofFloat8).with(ofFloat16).after(ofFloat7);
        animatorSet2.play(ofFloat9).after(ofFloat8);
        animatorSet2.play(ofFloat10).after(ofFloat16);
        animatorSet2.play(ofFloat11).with(ofFloat13).after(ofFloat9);
        animatorSet2.play(ofFloat12).with(ofFloat14).after(ofFloat11);
        animatorSet2.play(ofFloat15).after(ofFloat10);
        animatorSet2.start();
        this.LJLJJI = animatorSet2;
    }

    public final void LJIIJJI(long j, String str) {
        Object valueOf;
        String LJIIJJI = b.LJIIJJI(j);
        o.LJIIIIZZ(LJIIJJI, "getCoHostTopicHeatCount(heatScore)");
        ((TextView) LIZ(R.id.mon)).setText(LJIIJJI);
        if (C29306Beo.LJIJJLI(str)) {
            ((TextView) LIZ(R.id.moo)).setText(str);
        }
        ValueAnimator valueAnimator = this.LJLJLLL;
        if ((valueAnimator != null && valueAnimator.isRunning()) || LIZ(R.id.mon).getVisibility() == 8) {
            return;
        }
        ((ImageView) LIZ(R.id.f5b)).setVisibility(8);
        float measureText = ((TextView) LIZ(R.id.mon)).getPaint().measureText(LJIIJJI) + ((TextView) LIZ(R.id.moo)).getPaint().measureText(((AppCompatTextView) LIZ(R.id.moo)).getText().toString());
        if (measureText > C15380j0.LIZ(210.0f)) {
            valueOf = Integer.valueOf(C15380j0.LIZ(268.0f));
        } else {
            valueOf = Float.valueOf(measureText + C15380j0.LIZ(58.0f));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 1.3f);
        ofFloat.setDuration(200L);
        ofFloat.setRepeatCount(1);
        ofFloat.setRepeatMode(2);
        ofFloat.addUpdateListener(new AUListenerS100S0100000_13(this, 46));
        ofFloat.addListener(new ALAdapterS10S0200000_13(this, valueOf, 12));
        ofFloat.start();
        this.LJLJLLL = ofFloat;
    }

    public static final AnimatorSet LJIIIIZZ(C47121t6 c47121t6, float f, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.ALPHA, f, 1.0f));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public static final AnimatorSet LJIIIZ(C47121t6 c47121t6, float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(c47121t6, (Property<C47121t6, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }
}
