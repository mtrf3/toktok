package X;

import android.view.View;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.BtI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC30204BtI {
    public static final EnumC30204BtI ANCHOR_PARTNERSHIP;
    public static final EnumC30204BtI ANCHOR_PARTNERSHIP_DROPS;
    public static final EnumC30204BtI ANCHOR_SUBSCRIPTION;
    public static final EnumC30204BtI AUDIENCE_INTERACTION_FEATURES;
    public static final EnumC30204BtI AUDIENCE_LANDSCAPE_PARTNERSHIP;
    public static final EnumC30204BtI AUDIENCE_SLOT;
    public static final EnumC30204BtI BACKGROUND;
    public static final EnumC30204BtI BEAUTY;
    public static final EnumC30204BtI BROADCAST_GIFT;
    public static final EnumC30204BtI COHOST;
    public static final EnumC30204BtI COMMENT;
    public static final EnumC30204BtI COMMENT_EXT;
    public static final EnumC30204BtI COMMERCIAL_CONTENT_TOGGLE;
    public static final EnumC30204BtI CUSTOM_POLL;
    public static final EnumC30204BtI DUAL_DEVICE;
    public static final EnumC30204BtI DUMMY_BROADCAST_GIFT;
    public static final EnumC30204BtI DUMMY_FAST_GIFT;
    public static final EnumC30204BtI DUMMY_GIFT;
    public static final EnumC30204BtI ECHO_MODE;
    public static final EnumC30204BtI EFFECT;
    public static final EnumC30204BtI EVENT_PROMOTION;
    public static final EnumC30204BtI FAST_GIFT;
    public static final EnumC30204BtI GIFT;
    public static final EnumC30204BtI GoodyBag;
    public static final EnumC30204BtI INTERACTION_FEATURES;
    public static final EnumC30204BtI INTERACTION_PK;
    public static final EnumC30204BtI INTRO;
    public static final EnumC30204BtI KARAOKE;
    public static final EnumC30204BtI LANDSCAPE_MESSAGE;
    public static final EnumC30204BtI LIVE_CENTER;
    public static final /* synthetic */ EnumC30204BtI[] LJLJL;
    public static final EnumC30204BtI MESSAGE_ALERT;
    public static final EnumC30204BtI MORE;
    public static final EnumC30204BtI MULTIGUEST;
    public static final EnumC30204BtI MULTI_GUEST_LIVE_SHOW;
    public static final EnumC30204BtI MULTI_GUEST_MANAGE;
    public static final EnumC30204BtI MULTI_GUEST_MIC;
    public static final EnumC30204BtI MULTI_GUEST_VIDEO;
    public static final EnumC30204BtI MUSIC;
    public static final EnumC30204BtI MUTE_MIC;
    public static final EnumC30204BtI PAUSE_LIVE;
    public static final EnumC30204BtI POLL;
    public static final EnumC30204BtI PROPS;
    public static final EnumC30204BtI QUESTION;
    public static final EnumC30204BtI REDENVELOPE;
    public static final EnumC30204BtI REVERSE_CAMERA;
    public static final EnumC30204BtI REVERSE_MIRROR;
    public static final EnumC30204BtI SETTING;
    public static final EnumC30204BtI SHARE;
    public static final EnumC30204BtI SLOT;
    public static final EnumC30204BtI SOUND_EFFECT;
    public static final EnumC30204BtI STICKER;
    public static final EnumC30204BtI STICKER_DONATION;
    public static final EnumC30204BtI STREAM_KEY;
    public static final EnumC30204BtI SUBSCRIPTION_IN_MORE_DIALOG;
    public static final EnumC30204BtI TASK;
    public static final EnumC30204BtI TOPICS;
    public static final EnumC30204BtI TOPICS_DISABLE;
    public static final EnumC30204BtI TRY_MODE_COHOST;
    public static final EnumC30204BtI TRY_MODE_MULTIGUEST;
    public static final EnumC30204BtI UN_KNOW;
    public static final EnumC30204BtI VOICE_CHAT;
    public static final EnumC30204BtI VOICE_EFFECT;
    public C30233Btl LJLIL;
    public C30233Btl LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final Integer LJLJJL;
    public EnumC30226Bte LJLJJLL;
    public boolean isButtonVisible = true;
    public boolean isEnableClick = true;
    public boolean isRedDotVisible;

    public static /* synthetic */ void isRedDotVisible$annotations() {
    }

    public static EnumC30204BtI valueOf(String str) {
        return (EnumC30204BtI) V0N.LJJJ(EnumC30204BtI.class, str);
    }

    public static EnumC30204BtI[] values() {
        return (EnumC30204BtI[]) LJLJL.clone();
    }

    public final Integer getRTLDrawable() {
        return null;
    }

    static {
        C30233Btl c30233Btl;
        C30233Btl c30233Btl2;
        EnumC30204BtI enumC30204BtI = new EnumC30204BtI("INTERACTION_PK", 0, R.layout.dmi);
        INTERACTION_PK = enumC30204BtI;
        EnumC30204BtI enumC30204BtI2 = new EnumC30204BtI("COHOST", 1, C44384HbQ.LJJLJ(R.layout.dm6, R.layout.dm7));
        COHOST = enumC30204BtI2;
        EnumC30204BtI enumC30204BtI3 = new EnumC30204BtI("TRY_MODE_COHOST", 2, R.layout.dm6);
        TRY_MODE_COHOST = enumC30204BtI3;
        EnumC30204BtI enumC30204BtI4 = new EnumC30204BtI("MULTIGUEST", 3, C44384HbQ.LJJLJ(R.layout.dmo, R.layout.dmv));
        MULTIGUEST = enumC30204BtI4;
        EnumC30204BtI enumC30204BtI5 = new EnumC30204BtI("TRY_MODE_MULTIGUEST", 4, R.layout.dn3);
        TRY_MODE_MULTIGUEST = enumC30204BtI5;
        EnumC30204BtI enumC30204BtI6 = new EnumC30204BtI("VOICE_CHAT", 5, R.layout.dmn);
        VOICE_CHAT = enumC30204BtI6;
        EnumC30204BtI enumC30204BtI7 = new EnumC30204BtI("MULTI_GUEST_MIC", 6, C44384HbQ.LJJLJ(R.layout.dms, R.layout.dmt));
        MULTI_GUEST_MIC = enumC30204BtI7;
        EnumC30204BtI enumC30204BtI8 = new EnumC30204BtI("MULTI_GUEST_VIDEO", 7, C44384HbQ.LJJLJ(R.layout.dmw, R.layout.dmx));
        MULTI_GUEST_VIDEO = enumC30204BtI8;
        EnumC30204BtI enumC30204BtI9 = new EnumC30204BtI("MULTI_GUEST_MANAGE", 8, C44384HbQ.LJJLJ(R.layout.dmp, R.layout.dmq));
        MULTI_GUEST_MANAGE = enumC30204BtI9;
        EnumC30204BtI enumC30204BtI10 = new EnumC30204BtI("MULTI_GUEST_LIVE_SHOW", 9, R.drawable.d3u, R.string.nd2);
        MULTI_GUEST_LIVE_SHOW = enumC30204BtI10;
        EnumC30204BtI enumC30204BtI11 = new EnumC30204BtI("SLOT", 10, C44384HbQ.LJJLJ(R.layout.dm2, R.layout.dm3));
        SLOT = enumC30204BtI11;
        EnumC30204BtI enumC30204BtI12 = new EnumC30204BtI("AUDIENCE_SLOT", 11, R.layout.dlv);
        AUDIENCE_SLOT = enumC30204BtI12;
        boolean hasText = ToolBarButtonWithTextExperiment.hasText();
        Integer valueOf = Integer.valueOf(R.style.i4);
        if (hasText) {
            c30233Btl = new C30233Btl(C15380j0.LIZIZ(R.color.aat), valueOf, Integer.valueOf(C15380j0.LIZIZ(R.color.a5h)), 0.6666667f, 0.6666667f);
        } else {
            c30233Btl = new C30233Btl(C15380j0.LIZIZ(R.color.aat), null, null, 1.0f, 1.0f);
        }
        EnumC30204BtI enumC30204BtI13 = new EnumC30204BtI("QUESTION", 12, R.attr.av8, 0, c30233Btl, new C30233Btl(C15380j0.LIZIZ(R.color.aat), null, null, 1.0f, 1.0f));
        QUESTION = enumC30204BtI13;
        EnumC30204BtI enumC30204BtI14 = new EnumC30204BtI("POLL", 13, C44384HbQ.LJJLJ(R.drawable.cyo, R.drawable.cyp), 0);
        POLL = enumC30204BtI14;
        EnumC30204BtI enumC30204BtI15 = new EnumC30204BtI("INTERACTION_FEATURES", 14, C44384HbQ.LJJLJ(R.drawable.d5m, R.drawable.d5o), R.string.lz1);
        INTERACTION_FEATURES = enumC30204BtI15;
        EnumC30204BtI enumC30204BtI16 = new EnumC30204BtI("AUDIENCE_INTERACTION_FEATURES", 15, C44384HbQ.LJJLJ(R.layout.dlr, R.layout.dls));
        AUDIENCE_INTERACTION_FEATURES = enumC30204BtI16;
        EnumC30204BtI enumC30204BtI17 = new EnumC30204BtI("STICKER_DONATION", 16, R.drawable.d2i, R.string.kxb);
        STICKER_DONATION = enumC30204BtI17;
        EnumC30204BtI enumC30204BtI18 = new EnumC30204BtI("SHARE", 17, C44384HbQ.LJJLJ(R.drawable.d0_, R.drawable.d0c), R.string.t13);
        SHARE = enumC30204BtI18;
        EnumC30204BtI enumC30204BtI19 = new EnumC30204BtI("EFFECT", 18, C44384HbQ.LJJLJ(R.drawable.cuq, R.drawable.cur), 0);
        EFFECT = enumC30204BtI19;
        EnumC30204BtI enumC30204BtI20 = new EnumC30204BtI("MORE", 19, C44384HbQ.LJJLJ(R.drawable.cxl, R.drawable.cxm), 0);
        MORE = enumC30204BtI20;
        EnumC30204BtI enumC30204BtI21 = new EnumC30204BtI("REVERSE_CAMERA", 20, R.drawable.czw, R.string.mke);
        REVERSE_CAMERA = enumC30204BtI21;
        EnumC30204BtI enumC30204BtI22 = new EnumC30204BtI("REVERSE_MIRROR", 21, R.layout.dlx);
        REVERSE_MIRROR = enumC30204BtI22;
        EnumC30204BtI enumC30204BtI23 = new EnumC30204BtI("INTRO", 22, R.drawable.cx0, R.string.k1_);
        INTRO = enumC30204BtI23;
        EnumC30204BtI enumC30204BtI24 = new EnumC30204BtI("PAUSE_LIVE", 23, R.drawable.cya, R.string.k_r);
        PAUSE_LIVE = enumC30204BtI24;
        EnumC30204BtI enumC30204BtI25 = new EnumC30204BtI("MUTE_MIC", 24, R.layout.dml);
        MUTE_MIC = enumC30204BtI25;
        EnumC30204BtI enumC30204BtI26 = new EnumC30204BtI("DUAL_DEVICE", 25, R.drawable.dbv, R.string.mw6);
        DUAL_DEVICE = enumC30204BtI26;
        EnumC30204BtI enumC30204BtI27 = new EnumC30204BtI("SETTING", 26, R.drawable.cx8, R.string.me4);
        SETTING = enumC30204BtI27;
        EnumC30204BtI enumC30204BtI28 = new EnumC30204BtI("COMMENT", 27, R.drawable.cuc, R.string.t0l);
        COMMENT = enumC30204BtI28;
        EnumC30204BtI enumC30204BtI29 = new EnumC30204BtI("COMMENT_EXT", 28, R.attr.as8, R.string.t0l, new C30233Btl(C15380j0.LIZIZ(R.color.aat), valueOf, Integer.valueOf(C15380j0.LIZIZ(R.color.a5h)), 0.6666667f, 0.6666667f), new C30233Btl(C15380j0.LIZIZ(R.color.aat), null, null, 1.0f, 1.0f));
        COMMENT_EXT = enumC30204BtI29;
        EnumC30204BtI enumC30204BtI30 = new EnumC30204BtI("LANDSCAPE_MESSAGE", 29, R.drawable.cbm, R.string.t0l);
        LANDSCAPE_MESSAGE = enumC30204BtI30;
        EnumC30204BtI enumC30204BtI31 = new EnumC30204BtI("STREAM_KEY", 30, R.drawable.d0m, R.string.o7k);
        STREAM_KEY = enumC30204BtI31;
        EnumC30204BtI enumC30204BtI32 = new EnumC30204BtI("TOPICS", 31, R.drawable.dbw, R.string.mo6);
        TOPICS = enumC30204BtI32;
        EnumC30204BtI enumC30204BtI33 = new EnumC30204BtI("TOPICS_DISABLE", 32, R.layout.dm5);
        TOPICS_DISABLE = enumC30204BtI33;
        EnumC30204BtI enumC30204BtI34 = new EnumC30204BtI("TASK", 33, R.attr.asa, R.string.mug, new C30233Btl(C15380j0.LIZIZ(R.color.ck), null, null, 1.0f, 1.0f), new C30233Btl(C15380j0.LIZIZ(R.color.ck), null, null, 1.0f, 1.0f));
        TASK = enumC30204BtI34;
        EnumC30204BtI enumC30204BtI35 = new EnumC30204BtI("BEAUTY", 34, R.drawable.d0q, C44384HbQ.LJJJZ());
        BEAUTY = enumC30204BtI35;
        EnumC30204BtI enumC30204BtI36 = new EnumC30204BtI("STICKER", 35, R.drawable.cx9, R.string.mgc);
        STICKER = enumC30204BtI36;
        EnumC30204BtI enumC30204BtI37 = new EnumC30204BtI("BACKGROUND", 36, R.drawable.cwg, R.string.m9k);
        BACKGROUND = enumC30204BtI37;
        EnumC30204BtI enumC30204BtI38 = new EnumC30204BtI("PROPS", 37, R.drawable.cx7, R.string.k0w);
        PROPS = enumC30204BtI38;
        EnumC30204BtI enumC30204BtI39 = new EnumC30204BtI("GIFT", 38, C44384HbQ.LJJLJ(R.layout.dmc, R.layout.dmd));
        GIFT = enumC30204BtI39;
        EnumC30204BtI enumC30204BtI40 = new EnumC30204BtI("FAST_GIFT", 39, R.layout.dmc);
        FAST_GIFT = enumC30204BtI40;
        EnumC30204BtI enumC30204BtI41 = new EnumC30204BtI("BROADCAST_GIFT", 40, R.layout.dm0);
        BROADCAST_GIFT = enumC30204BtI41;
        EnumC30204BtI enumC30204BtI42 = new EnumC30204BtI("DUMMY_GIFT", 41, R.drawable.d2m, R.string.stn);
        DUMMY_GIFT = enumC30204BtI42;
        EnumC30204BtI enumC30204BtI43 = new EnumC30204BtI("DUMMY_FAST_GIFT", 42, R.layout.dmc);
        DUMMY_FAST_GIFT = enumC30204BtI43;
        EnumC30204BtI enumC30204BtI44 = new EnumC30204BtI("DUMMY_BROADCAST_GIFT", 43, R.drawable.d2l, R.string.mkg);
        DUMMY_BROADCAST_GIFT = enumC30204BtI44;
        EnumC30204BtI enumC30204BtI45 = new EnumC30204BtI("VOICE_EFFECT", 44, R.drawable.d60, R.string.mp9);
        VOICE_EFFECT = enumC30204BtI45;
        EnumC30204BtI enumC30204BtI46 = new EnumC30204BtI("SOUND_EFFECT", 45, R.drawable.d5c, R.string.o40);
        SOUND_EFFECT = enumC30204BtI46;
        EnumC30204BtI enumC30204BtI47 = new EnumC30204BtI("ECHO_MODE", 46, R.layout.dlz);
        ECHO_MODE = enumC30204BtI47;
        EnumC30204BtI enumC30204BtI48 = new EnumC30204BtI("MESSAGE_ALERT", 47, R.drawable.cxb, R.string.o0i);
        MESSAGE_ALERT = enumC30204BtI48;
        EnumC30204BtI enumC30204BtI49 = new EnumC30204BtI("COMMERCIAL_CONTENT_TOGGLE", 48, R.drawable.cud, R.string.kfh);
        COMMERCIAL_CONTENT_TOGGLE = enumC30204BtI49;
        EnumC30204BtI enumC30204BtI50 = new EnumC30204BtI("GoodyBag", 49, R.drawable.cvg, R.string.lrt);
        GoodyBag = enumC30204BtI50;
        EnumC30204BtI enumC30204BtI51 = new EnumC30204BtI("REDENVELOPE", 50, R.drawable.d0s, R.string.oqh);
        REDENVELOPE = enumC30204BtI51;
        EnumC30204BtI enumC30204BtI52 = new EnumC30204BtI("LIVE_CENTER", 51, R.drawable.cwi, 0);
        LIVE_CENTER = enumC30204BtI52;
        EnumC30204BtI enumC30204BtI53 = new EnumC30204BtI("MUSIC", 52, R.drawable.cx4, R.string.met);
        MUSIC = enumC30204BtI53;
        EnumC30204BtI enumC30204BtI54 = new EnumC30204BtI("KARAOKE", 53, R.drawable.d3i, R.string.jvh);
        KARAOKE = enumC30204BtI54;
        EnumC30204BtI enumC30204BtI55 = new EnumC30204BtI("CUSTOM_POLL", 54, C44384HbQ.LJJLJ(R.layout.dm9, R.layout.dma));
        CUSTOM_POLL = enumC30204BtI55;
        EnumC30204BtI enumC30204BtI56 = new EnumC30204BtI("EVENT_PROMOTION", 55, R.attr.as_, R.string.mmu);
        EVENT_PROMOTION = enumC30204BtI56;
        EnumC30204BtI enumC30204BtI57 = new EnumC30204BtI("UN_KNOW", 56, R.drawable.cwi, 0);
        UN_KNOW = enumC30204BtI57;
        EnumC30204BtI enumC30204BtI58 = new EnumC30204BtI("ANCHOR_PARTNERSHIP", 57, R.drawable.cv9, R.string.lh6);
        ANCHOR_PARTNERSHIP = enumC30204BtI58;
        EnumC30204BtI enumC30204BtI59 = new EnumC30204BtI("ANCHOR_PARTNERSHIP_DROPS", 58, R.drawable.d4k, R.string.lh6);
        ANCHOR_PARTNERSHIP_DROPS = enumC30204BtI59;
        EnumC30204BtI enumC30204BtI60 = new EnumC30204BtI("AUDIENCE_LANDSCAPE_PARTNERSHIP", 59, R.layout.dlu);
        AUDIENCE_LANDSCAPE_PARTNERSHIP = enumC30204BtI60;
        if (ToolBarButtonWithTextExperiment.hasText()) {
            c30233Btl2 = new C30233Btl(C15380j0.LIZIZ(R.color.aat), valueOf, Integer.valueOf(C15380j0.LIZIZ(R.color.a5h)), 0.6666667f, 0.6666667f);
        } else {
            c30233Btl2 = new C30233Btl(C15380j0.LIZIZ(R.color.aat), null, null, 1.0f, 1.0f);
        }
        EnumC30204BtI enumC30204BtI61 = new EnumC30204BtI("ANCHOR_SUBSCRIPTION", 60, R.attr.avh, R.string.kph, c30233Btl2, new C30233Btl(C15380j0.LIZIZ(R.color.aat), null, null, 1.0f, 1.0f));
        ANCHOR_SUBSCRIPTION = enumC30204BtI61;
        EnumC30204BtI enumC30204BtI62 = new EnumC30204BtI("SUBSCRIPTION_IN_MORE_DIALOG", 61, R.attr.arn, R.string.mme);
        SUBSCRIPTION_IN_MORE_DIALOG = enumC30204BtI62;
        LJLJL = new EnumC30204BtI[]{enumC30204BtI, enumC30204BtI2, enumC30204BtI3, enumC30204BtI4, enumC30204BtI5, enumC30204BtI6, enumC30204BtI7, enumC30204BtI8, enumC30204BtI9, enumC30204BtI10, enumC30204BtI11, enumC30204BtI12, enumC30204BtI13, enumC30204BtI14, enumC30204BtI15, enumC30204BtI16, enumC30204BtI17, enumC30204BtI18, enumC30204BtI19, enumC30204BtI20, enumC30204BtI21, enumC30204BtI22, enumC30204BtI23, enumC30204BtI24, enumC30204BtI25, enumC30204BtI26, enumC30204BtI27, enumC30204BtI28, enumC30204BtI29, enumC30204BtI30, enumC30204BtI31, enumC30204BtI32, enumC30204BtI33, enumC30204BtI34, enumC30204BtI35, enumC30204BtI36, enumC30204BtI37, enumC30204BtI38, enumC30204BtI39, enumC30204BtI40, enumC30204BtI41, enumC30204BtI42, enumC30204BtI43, enumC30204BtI44, enumC30204BtI45, enumC30204BtI46, enumC30204BtI47, enumC30204BtI48, enumC30204BtI49, enumC30204BtI50, enumC30204BtI51, enumC30204BtI52, enumC30204BtI53, enumC30204BtI54, enumC30204BtI55, enumC30204BtI56, enumC30204BtI57, enumC30204BtI58, enumC30204BtI59, enumC30204BtI60, enumC30204BtI61, enumC30204BtI62};
    }

    public final int getDrawable() {
        return this.LJLJI;
    }

    public final C30233Btl getIconConfig() {
        return this.LJLIL;
    }

    public final C30233Btl getIconConfigWithoutBackground() {
        return this.LJLILLLLZI;
    }

    public final Integer getLayoutId() {
        return this.LJLJJL;
    }

    public final int getTitleId() {
        return this.LJLJJI;
    }

    public final EnumC30226Bte getToolbarStyle() {
        return this.LJLJJLL;
    }

    public static InterfaceC30205BtJ LIZJ(DataChannel dataChannel) {
        return ((IToolbarService) CN1.LIZ(IToolbarService.class)).pk(dataChannel);
    }

    public final View getView(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            return LIZJ.LJIIL(dataChannel, this);
        }
        return null;
    }

    public final C76800UCe hide(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LIZ(this, dataChannel, false);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe hideBySwitchManager(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LIZ(this, dataChannel, true);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe hideRedDot(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIZILJ(this, dataChannel, false);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final boolean isRedDotShowing(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            return LIZJ.LJ(dataChannel, this);
        }
        return false;
    }

    public final boolean isShowing(DataChannel dataChannel) {
        Boolean bool;
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            bool = Boolean.valueOf(LIZJ.LJIILJJIL(dataChannel, this));
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public final boolean isShowingInInteractionDialog(DataChannel dataChannel) {
        Boolean bool;
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            bool = Boolean.valueOf(LIZJ.LIZLLL(dataChannel, this));
        } else {
            bool = null;
        }
        return C29306Beo.LJJIFFI(bool);
    }

    public final void setIconConfig(C30233Btl c30233Btl) {
        this.LJLIL = c30233Btl;
    }

    public final void setIconConfigWithoutBackground(C30233Btl c30233Btl) {
        this.LJLILLLLZI = c30233Btl;
    }

    public final void setToolbarStyle(EnumC30226Bte enumC30226Bte) {
        this.LJLJJLL = enumC30226Bte;
    }

    public final C76800UCe show(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIJJI(this, dataChannel, false);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe showBySwitchManager(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIJJI(this, dataChannel, true);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe showRedDot(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIZILJ(this, dataChannel, true);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe unload(DataChannel dataChannel) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIILL(dataChannel, this);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe load(DataChannel dataChannel, InterfaceViewOnClickListenerC30227Btf behavior) {
        o.LJIIIZ(behavior, "behavior");
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LIZJ(this, dataChannel, behavior, true);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe setEnableClick(DataChannel dataChannel, boolean z) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIJ(this, dataChannel, z);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public final C76800UCe setRedDotVisible(DataChannel dataChannel, boolean z) {
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LJIIZILJ(this, dataChannel, z);
            return C76800UCe.LIZ;
        }
        return null;
    }

    public EnumC30204BtI(String str, int i, int i2) {
        this.LJLJJL = Integer.valueOf(i2);
    }

    public final void load(DataChannel dataChannel, InterfaceViewOnClickListenerC30227Btf behavior, boolean z) {
        o.LJIIIZ(behavior, "behavior");
        this.isButtonVisible = z;
        InterfaceC30205BtJ LIZJ = LIZJ(dataChannel);
        if (LIZJ != null) {
            LIZJ.LIZJ(this, dataChannel, behavior, z);
        }
    }

    public EnumC30204BtI(String str, int i, int i2, int i3) {
        this.LJLJI = i2;
        this.LJLJJI = i3;
    }

    public EnumC30204BtI(String str, int i, int i2, int i3, C30233Btl c30233Btl, C30233Btl c30233Btl2) {
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLIL = c30233Btl;
        this.LJLILLLLZI = c30233Btl2;
    }
}
