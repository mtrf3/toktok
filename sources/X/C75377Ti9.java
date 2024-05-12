package X;

import Y.AfS29S0110000_13;
import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveSeiTalkSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Ti9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75377Ti9 extends FrameLayout {
    public User LJLIL;
    public CVT LJLILLLLZI;
    public TextView LJLJI;
    public ImageView LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final int[] LJLJJLL;
    public final int[] LJLJL;
    public OSZ<Integer, Integer> LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public C73411SrX LJLLI;
    public final java.util.Map<Integer, View> LJLLILLLL = new LinkedHashMap();

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLLILLLL;
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

    private final Animator getPauseAlphaInAnimation() {
        return (Animator) this.LJLJLLL.getValue();
    }

    private final Animator getPauseAlphaOutAnimation() {
        return (Animator) this.LJLL.getValue();
    }

    private final C75379TiB getTalkVolumeAnimHandler() {
        return (C75379TiB) this.LJLJJL.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getTalkVolumeAnimHandler().LIZIZ = true;
        C73411SrX c73411SrX = this.LJLLI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
    }

    public C75377Ti9(Context context) {
        super(context);
        this.LJLJJL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 302));
        this.LJLJJLL = new int[]{R.id.h1_, R.id.fmx, R.id.ajg, R.id.hb4, R.id.hb_, R.id.hav, R.id.f7o};
        this.LJLJL = new int[]{R.id.h1_, R.id.fmx, R.id.ajg, R.id.hb1, R.id.f7o};
        this.LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 300));
        this.LJLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 301));
        o.LJII(FrameLayout.inflate(getContext(), R.layout.dk7, this), "null cannot be cast to non-null type android.view.ViewGroup");
        setClipChildren(false);
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).setClipChildren(false);
        }
        View findViewById = findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.loading_view)");
        this.LJLILLLLZI = (CVT) findViewById;
        View findViewById2 = findViewById(R.id.h1_);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.nick_name)");
        this.LJLJI = (TextView) findViewById2;
        o.LJIIIIZZ(findViewById(R.id.hb7), "findViewById(R.id.online_ticket)");
        o.LJIIIIZZ(findViewById(R.id.hb9), "findViewById(R.id.online_ticket_icon)");
        ImageView imageView = (ImageView) findViewById(R.id.f7o);
        this.LJLJJI = imageView;
        if (imageView != null) {
            C87277YNd.LJJIIZ(imageView);
        }
        C15490jB.LJ(LIZ(R.id.hb2), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute2.png");
    }

    public final void LIZJ(boolean z) {
        C73411SrX c73411SrX = this.LJLLI;
        if (c73411SrX != null && !c73411SrX.isDisposed()) {
            c73411SrX.dispose();
        }
        this.LJLLI = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(300L, TimeUnit.MILLISECONDS).LJII(new C62705OjF()).LJJJJZI(new AfS29S0110000_13(this, z, 5));
    }

    public final boolean LJ(int i) {
        String str;
        Boolean bool;
        boolean LJ;
        InterfaceC81252Vui controller;
        Animatable LIZ;
        C75379TiB talkVolumeAnimHandler = getTalkVolumeAnimHandler();
        talkVolumeAnimHandler.LIZIZ = false;
        int volumeThreshold = LiveSeiTalkSetting.INSTANCE.volumeThreshold();
        SpeakingVoiceConfig value = LiveMicVoiceSetting.INSTANCE.getValue();
        if (i <= volumeThreshold) {
            str = "";
        } else if (i > volumeThreshold && i <= value.getLow()) {
            str = "ttlive_sound_wavee_anim_low.webp";
        } else if (i > value.getLow() && i <= value.getHigh()) {
            str = "ttlive_sound_wavee_anim_medium.webp";
        } else {
            str = "ttlive_sound_wavee_anim_high.webp";
        }
        talkVolumeAnimHandler.LIZJ = str;
        C47061t0 c47061t0 = talkVolumeAnimHandler.LIZ;
        if (c47061t0 != null && (controller = c47061t0.getController()) != null && (LIZ = controller.LIZ()) != null) {
            bool = Boolean.valueOf(LIZ.isRunning());
        } else {
            bool = null;
        }
        if (C29306Beo.LJJIFFI(bool)) {
            LJ = o.LJ(talkVolumeAnimHandler.LIZJ, "");
        } else {
            talkVolumeAnimHandler.LIZ(talkVolumeAnimHandler.LIZJ);
            LJ = o.LJ(talkVolumeAnimHandler.LIZJ, "");
        }
        return !LJ;
    }

    public final void LJI(EnumC74783TWp state) {
        o.LJIIIZ(state, "state");
        ImageView imageView = this.LJLJJI;
        if (imageView != null) {
            int i = C74782TWo.LIZ[state.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    C87277YNd.LJJIIZ(imageView);
                    return;
                } else {
                    C87277YNd.LJJIJ(imageView);
                    C15490jB.LJ(imageView, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multi_guest_network_state_very_bad.png");
                    return;
                }
            }
            C87277YNd.LJJIJ(imageView);
            C15490jB.LJ(imageView, CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multi_guest_network_state_bad.png");
        }
    }

    public final void setCoinNum(long j) {
        String LJIILJJIL = b.LJIILJJIL(j);
        o.LJIIIIZZ(LJIILJJIL, "getDisplayCountForCoin(count)");
        Locale locale = Locale.ROOT;
        String LIZJ = OKG.LIZJ(locale, "ROOT", LJIILJJIL, locale, "this as java.lang.String).toUpperCase(locale)");
        if (o.LJ(LIZJ, ((AppCompatTextView) LIZ(R.id.hb7)).getText().toString())) {
            return;
        }
        ((TextView) LIZ(R.id.hb7)).setText(LIZJ);
    }

    public final void setMuteState(boolean z) {
        if (z) {
            View online_player_mute = LIZ(R.id.hb2);
            o.LJIIIIZZ(online_player_mute, "online_player_mute");
            C87277YNd.LJJIJ(online_player_mute);
        } else {
            View online_player_mute2 = LIZ(R.id.hb2);
            o.LJIIIIZZ(online_player_mute2, "online_player_mute");
            C87277YNd.LJJIIZ(online_player_mute2);
        }
    }

    public final void setState(EnumC74781TWn state) {
        o.LJIIIZ(state, "state");
        switch (C74782TWo.LIZIZ[state.ordinal()]) {
            case 1:
            case 2:
                CVT cvt = this.LJLILLLLZI;
                if (cvt != null) {
                    C87277YNd.LJJIIZ(cvt);
                    return;
                } else {
                    o.LJIJI("loadingView");
                    throw null;
                }
            case 3:
                CVT cvt2 = this.LJLILLLLZI;
                if (cvt2 != null) {
                    C87277YNd.LJJIIZ(cvt2);
                    return;
                } else {
                    o.LJIJI("loadingView");
                    throw null;
                }
            case 4:
            case 5:
                CVT cvt3 = this.LJLILLLLZI;
                if (cvt3 != null) {
                    C87277YNd.LJJIIZ(cvt3);
                    return;
                } else {
                    o.LJIJI("loadingView");
                    throw null;
                }
            case 6:
                CVT cvt4 = this.LJLILLLLZI;
                if (cvt4 != null) {
                    C87277YNd.LJJIIZ(cvt4);
                    return;
                } else {
                    o.LJIJI("loadingView");
                    throw null;
                }
            default:
                return;
        }
    }

    public final void setUserInfo(User user) {
        o.LJIIIZ(user, "user");
        this.LJLIL = user;
        ImageModel avatarThumb = user.getAvatarThumb();
        C47061t0 online_player_avatar = (C47061t0) LIZ(R.id.hb1);
        o.LJIIIIZZ(online_player_avatar, "online_player_avatar");
        LIZIZ(online_player_avatar, avatarThumb);
        LIZLLL(avatarThumb, (C47061t0) LIZ(R.id.hb4));
        TextView textView = this.LJLJI;
        if (textView != null) {
            textView.setText(C05170If.LIZ(user));
        } else {
            o.LJIJI("onlineName");
            throw null;
        }
    }

    public static void LIZIZ(C47061t0 c47061t0, ImageModel imageModel) {
        if (LiveImageLoaderModuleSetting.useImageModule()) {
            C78720Uuy LJIIIZ = C15650jR.LIZ().LJIIIZ(imageModel);
            LJIIIZ.LJIIIIZZ = R.drawable.cuk;
            int width = c47061t0.getWidth();
            int height = c47061t0.getHeight();
            LJIIIZ.LJ = width;
            LJIIIZ.LJFF = height;
            LJIIIZ.LJIIL = Boolean.TRUE;
            LJIIIZ.LJIIJJI(c47061t0);
            return;
        }
        C31665Cbl.LJIIJ(c47061t0, imageModel, c47061t0.getWidth(), c47061t0.getHeight(), R.drawable.cuk);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.W5O, REQUEST] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.W5O, REQUEST] */
    public static void LIZLLL(ImageModel imageModel, C47061t0 c47061t0) {
        String str;
        List<String> urls;
        C78747UvP c78747UvP = new C78747UvP(5);
        if (C15650jR.LIZIZ(imageModel)) {
            if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                str = (String) ORZ.LJLLLL(urls);
            } else {
                str = null;
            }
            W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(str));
            LIZLLL.LJIIJ = c78747UvP;
            ?? LIZ = LIZLLL.LIZ();
            if (c47061t0 == null) {
                return;
            }
            C81705W4v LIZJ = W5I.LIZJ();
            LIZJ.LIZLLL = LIZ;
            LIZJ.LJIIL = c47061t0.getController();
            LIZJ.LJII = new C75380TiC();
            c47061t0.setController(LIZJ.LIZ());
            return;
        }
        W5P LIZJ2 = W5P.LIZJ(R.drawable.cuk);
        LIZJ2.LJIIJ = c78747UvP;
        ?? LIZ2 = LIZJ2.LIZ();
        if (c47061t0 == null) {
            return;
        }
        C81705W4v LIZJ3 = W5I.LIZJ();
        LIZJ3.LIZLLL = LIZ2;
        LIZJ3.LJIIL = c47061t0.getController();
        LIZJ3.LJII = new C75381TiD();
        c47061t0.setController(LIZJ3.LIZ());
    }

    public final void LJFF(boolean z, boolean z2, C74779TWl dataHolder) {
        View findViewById;
        View findViewById2;
        int i;
        int i2;
        int LJIIJJI;
        Animator pauseAlphaOutAnimation;
        ImageModel imageModel;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        o.LJIIIZ(dataHolder, "dataHolder");
        Boolean LJJZZIII = dataHolder.LJI.LJJZZIII();
        if (LJJZZIII == null) {
            LJJZZIII = Boolean.FALSE;
        }
        boolean booleanValue = LJJZZIII.booleanValue();
        Boolean LJJZZIII2 = dataHolder.LJ.LJJZZIII();
        if (LJJZZIII2 == null) {
            LJJZZIII2 = Boolean.FALSE;
        }
        boolean booleanValue2 = LJJZZIII2.booleanValue();
        EnumC74783TWp LJJLI = C17N.LJJLI(dataHolder.LJII);
        for (int i3 : this.LJLJJLL) {
            View LIZ = LIZ(R.id.hax);
            if (LIZ != null && (findViewById5 = LIZ.findViewById(i3)) != null) {
                C87277YNd.LJJIJ(findViewById5);
            }
        }
        for (int i4 : this.LJLJL) {
            View LIZ2 = LIZ(R.id.hax);
            if (LIZ2 != null && (findViewById4 = LIZ2.findViewById(i4)) != null) {
                C87277YNd.LJJIJ(findViewById4);
            }
        }
        if (!z) {
            LIZJ(false);
            setMuteState(booleanValue2);
            OSZ<Integer, Integer> osz = this.LJLJLJ;
            if (osz != null) {
                int intValue = osz.getFirst().intValue();
                int intValue2 = osz.getSecond().intValue();
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = intValue2;
                    layoutParams.width = intValue;
                }
                setLayoutParams(layoutParams);
            }
            C47061t0 online_player_avatar = (C47061t0) LIZ(R.id.hb1);
            o.LJIIIIZZ(online_player_avatar, "online_player_avatar");
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            if (layoutParams2 != null) {
                i = layoutParams2.width;
            } else {
                i = 0;
            }
            ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
            if (layoutParams3 != null) {
                i2 = layoutParams3.height;
            } else {
                i2 = 0;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("windowWidth = ");
            LIZ3.append(i);
            LIZ3.append(",windowHeight = ");
            LIZ3.append(i2);
            C0NB.LIZIZ("GameLinkMicMaskHelper", X1D.LIZIZ(LIZ3));
            int LJIIJJI2 = i2 - C87277YNd.LJIIJJI(45);
            if (i > LJIIJJI2) {
                i = LJIIJJI2;
            }
            if (i < C87277YNd.LJIIJJI(45)) {
                LJIIJJI = C87277YNd.LJIIJJI(30);
            } else {
                int LJIIJJI3 = C87277YNd.LJIIJJI(45);
                if (i <= C87277YNd.LJIIJJI(70) && LJIIJJI3 <= i) {
                    LJIIJJI = C87277YNd.LJIIJJI(40);
                } else {
                    int LJIIJJI4 = C87277YNd.LJIIJJI(70);
                    if (i <= C87277YNd.LJIIJJI(100) && LJIIJJI4 <= i) {
                        LJIIJJI = C87277YNd.LJIIJJI(48);
                    } else {
                        LJIIJJI = C87277YNd.LJIIJJI(60);
                    }
                }
            }
            C0NB.LIZIZ("GameLinkMicMaskHelper", "avatarWidth = " + LJIIJJI);
            ViewGroup.LayoutParams layoutParams4 = online_player_avatar.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = LJIIJJI;
                layoutParams4.width = LJIIJJI;
            }
            online_player_avatar.setLayoutParams(layoutParams4);
            C47061t0 online_player_avatar2 = (C47061t0) LIZ(R.id.hb1);
            o.LJIIIIZZ(online_player_avatar2, "online_player_avatar");
            C47061t0 online_voice_effect = (C47061t0) LIZ(R.id.hba);
            o.LJIIIIZZ(online_voice_effect, "online_voice_effect");
            BN0.LIZIZ(online_player_avatar2, online_voice_effect);
            ConstraintLayout online_container = (ConstraintLayout) LIZ(R.id.hax);
            o.LJIIIIZZ(online_container, "online_container");
            C1K5 online_player_mute = (C1K5) LIZ(R.id.hb2);
            o.LJIIIIZZ(online_player_mute, "online_player_mute");
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            anonymousClass064.LJII(online_container);
            anonymousClass064.LJFF(online_player_mute.getId());
            anonymousClass064.LJIILL(online_player_mute.getId()).LIZIZ.LIZIZ = online_player_mute.getVisibility();
            anonymousClass064.LJIIIIZZ(online_player_mute.getId(), 7, 0, 7);
            anonymousClass064.LJIIIIZZ(online_player_mute.getId(), 3, 0, 3);
            anonymousClass064.LIZIZ(online_container);
            ViewGroup.LayoutParams layoutParams5 = online_player_mute.getLayoutParams();
            o.LJII(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams5;
            if (z2) {
                marginLayoutParams.width = C15380j0.LIZ(12.0f);
                marginLayoutParams.height = C15380j0.LIZ(12.0f);
                marginLayoutParams.setMarginEnd(C15380j0.LIZ(6.0f));
                marginLayoutParams.bottomMargin = C15380j0.LIZ(0.0f);
                marginLayoutParams.topMargin = C15380j0.LIZ(6.0f);
            } else {
                marginLayoutParams.width = C15380j0.LIZ(16.0f);
                marginLayoutParams.height = C15380j0.LIZ(16.0f);
                marginLayoutParams.setMarginEnd(C15380j0.LIZ(8.0f));
                marginLayoutParams.bottomMargin = C15380j0.LIZ(0.0f);
                marginLayoutParams.topMargin = C15380j0.LIZ(8.0f);
            }
            online_player_mute.setLayoutParams(marginLayoutParams);
            View layout_ticket = LIZ(R.id.fmx);
            o.LJIIIIZZ(layout_ticket, "layout_ticket");
            ViewGroup.LayoutParams layoutParams6 = layout_ticket.getLayoutParams();
            o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams6;
            if (z2) {
                marginLayoutParams2.setMarginStart(C15380j0.LIZ(6.0f));
                marginLayoutParams2.topMargin = C15380j0.LIZ(6.0f);
            } else {
                marginLayoutParams2.setMarginStart(C15380j0.LIZ(8.0f));
                marginLayoutParams2.topMargin = C15380j0.LIZ(8.0f);
            }
            layout_ticket.setLayoutParams(marginLayoutParams2);
            C41541k6 nick_name = (C41541k6) LIZ(R.id.h1_);
            o.LJIIIIZZ(nick_name, "nick_name");
            o.LJIIIIZZ(LIZ(R.id.hax), "online_container");
            ViewGroup.LayoutParams layoutParams7 = nick_name.getLayoutParams();
            o.LJII(layoutParams7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            C018905p c018905p = (C018905p) layoutParams7;
            if (z2) {
                c018905p.setMarginStart(C15380j0.LIZ(3.0f));
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C15380j0.LIZ(6.0f);
                c018905p.goneStartMargin = C15380j0.LIZ(6.0f);
            } else {
                c018905p.setMarginStart(C15380j0.LIZ(4.0f));
                ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = C15380j0.LIZ(8.0f);
                c018905p.goneStartMargin = C15380j0.LIZ(8.0f);
            }
            nick_name.setLayoutParams(c018905p);
            C1K5 iv_network_state = (C1K5) LIZ(R.id.f7o);
            o.LJIIIIZZ(iv_network_state, "iv_network_state");
            ViewGroup.LayoutParams layoutParams8 = iv_network_state.getLayoutParams();
            o.LJII(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams8;
            if (z2) {
                marginLayoutParams3.setMarginStart(C15380j0.LIZ(6.0f));
            } else {
                marginLayoutParams3.setMarginStart(C15380j0.LIZ(8.0f));
            }
            iv_network_state.setLayoutParams(marginLayoutParams3);
            LJI(LJJLI);
            if (booleanValue) {
                for (int i5 : this.LJLJL) {
                    View LIZ4 = LIZ(R.id.hax);
                    if (LIZ4 != null && (findViewById3 = LIZ4.findViewById(i5)) != null) {
                        C87277YNd.LJJIIZ(findViewById3);
                    }
                }
                View LIZ5 = LIZ(R.id.hiw);
                if (LIZ5 != null) {
                    C87277YNd.LJJIJ(LIZ5);
                }
                View online_player_mute2 = LIZ(R.id.hb2);
                o.LJIIIIZZ(online_player_mute2, "online_player_mute");
                C87277YNd.LJJIIZ(online_player_mute2);
                Animator pauseAlphaInAnimation = getPauseAlphaInAnimation();
                if (pauseAlphaInAnimation != null) {
                    pauseAlphaInAnimation.start();
                }
                if (LIZ(R.id.hix) != null) {
                    C15540jG c15540jG = new C15540jG();
                    C47061t0 pause_image = (C47061t0) LIZ(R.id.hix);
                    o.LJIIIIZZ(pause_image, "pause_image");
                    c15540jG.LIZ = pause_image;
                    c15540jG.LIZIZ = CFX.LIZ("tiktok_live_watch_resource", "tiktok_live_watch_resource_normal_1");
                    c15540jG.LIZJ = "ttlive_pause_live_anim.webp";
                    c15540jG.LJFF = true;
                    C15490jB.LJI(c15540jG);
                }
                User user = this.LJLIL;
                if (user != null) {
                    imageModel = user.getAvatarThumb();
                } else {
                    imageModel = null;
                }
                LIZLLL(imageModel, (C47061t0) LIZ(R.id.hb4));
            } else {
                View LIZ6 = LIZ(R.id.hiw);
                if (LIZ6 != null && true == C29306Beo.LJJIIJ(LIZ6) && (pauseAlphaOutAnimation = getPauseAlphaOutAnimation()) != null) {
                    pauseAlphaOutAnimation.start();
                }
            }
            C15490jB.LJ(LIZ(R.id.hb2), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute2.png");
            return;
        }
        for (int i6 : this.LJLJJLL) {
            View LIZ7 = LIZ(R.id.hax);
            if (LIZ7 != null && (findViewById2 = LIZ7.findViewById(i6)) != null) {
                C87277YNd.LJJIIZ(findViewById2);
            }
        }
        setMuteState(booleanValue2);
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new OSZ<>(Integer.valueOf(getLayoutParams().width), Integer.valueOf(getLayoutParams().height));
        }
        BN0.LIZ(this, 48.0f);
        BN0.LIZ(LIZ(R.id.hb1), 40.0f);
        C47061t0 online_player_avatar3 = (C47061t0) LIZ(R.id.hb1);
        o.LJIIIIZZ(online_player_avatar3, "online_player_avatar");
        C47061t0 online_voice_effect2 = (C47061t0) LIZ(R.id.hba);
        o.LJIIIIZZ(online_voice_effect2, "online_voice_effect");
        BN0.LIZIZ(online_player_avatar3, online_voice_effect2);
        ConstraintLayout online_container2 = (ConstraintLayout) LIZ(R.id.hax);
        o.LJIIIIZZ(online_container2, "online_container");
        C1K5 online_player_mute3 = (C1K5) LIZ(R.id.hb2);
        o.LJIIIIZZ(online_player_mute3, "online_player_mute");
        View online_player_avatar4 = LIZ(R.id.hb1);
        o.LJIIIIZZ(online_player_avatar4, "online_player_avatar");
        AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
        anonymousClass0642.LJII(online_container2);
        anonymousClass0642.LJFF(online_player_mute3.getId());
        anonymousClass0642.LJIILL(online_player_mute3.getId()).LIZIZ.LIZIZ = online_player_mute3.getVisibility();
        anonymousClass0642.LJIIIIZZ(online_player_mute3.getId(), 7, online_player_avatar4.getId(), 7);
        anonymousClass0642.LJIIIIZZ(online_player_mute3.getId(), 4, online_player_avatar4.getId(), 4);
        anonymousClass0642.LIZIZ(online_container2);
        ViewGroup.LayoutParams layoutParams9 = online_player_mute3.getLayoutParams();
        o.LJII(layoutParams9, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams9;
        marginLayoutParams4.width = C15380j0.LIZ(14.0f);
        marginLayoutParams4.height = C15380j0.LIZ(14.0f);
        marginLayoutParams4.setMarginEnd(C15380j0.LIZ(-4.0f));
        marginLayoutParams4.bottomMargin = C15380j0.LIZ(-2.0f);
        online_player_mute3.setLayoutParams(marginLayoutParams4);
        C15490jB.LJ(LIZ(R.id.hb2), CFX.LIZ("tiktok_live_link_mic", "tiktok_live_interaction_demand_1"), "ttlive_ic_multilive_mute.png");
        if (booleanValue) {
            for (int i7 : this.LJLJL) {
                View LIZ8 = LIZ(R.id.hax);
                if (LIZ8 != null && (findViewById = LIZ8.findViewById(i7)) != null) {
                    C87277YNd.LJJIIZ(findViewById);
                }
            }
            View online_player_avatar5 = LIZ(R.id.hb1);
            o.LJIIIIZZ(online_player_avatar5, "online_player_avatar");
            C87277YNd.LJJIJ(online_player_avatar5);
            View pause_container = LIZ(R.id.hiw);
            o.LJIIIIZZ(pause_container, "pause_container");
            C87277YNd.LJJIIZ(pause_container);
            View online_player_mute4 = LIZ(R.id.hb2);
            o.LJIIIIZZ(online_player_mute4, "online_player_mute");
            C87277YNd.LJJIIZ(online_player_mute4);
        }
        LIZJ(booleanValue);
    }
}
