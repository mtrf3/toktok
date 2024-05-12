package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBGMSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.TtLiveBackgroundSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.preview.LivePreviewMoreSetting;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformRedDotConfig;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: X.Bwc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC30410Bwc {
    public static final EnumC30410Bwc LIVE_BROADCAST_EHANCE;
    public static final EnumC30410Bwc LIVE_BROADCAST_ENHANCE_BACKGROUND;
    public static final EnumC30410Bwc LIVE_BROADCAST_ENHANCE_BGM;
    public static final EnumC30410Bwc LIVE_BROADCAST_KARAOKE;
    public static final EnumC30410Bwc LIVE_BROADCAST_MORE;
    public static final EnumC30410Bwc LIVE_BROADCAST_MORE_GOODYBAG;
    public static final EnumC30410Bwc LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE;
    public static final EnumC30410Bwc LIVE_BROADCAST_PREVIEW_MORE;
    public static final EnumC30410Bwc LIVE_BROADCAST_PREVIEW_PROMOTE;
    public static final EnumC30410Bwc LIVE_BROADCAST_PREVIEW_VOICE_CHAT;
    public static final EnumC30410Bwc LIVE_EFFECT_RECENT_TAB;
    public static final EnumC30410Bwc LIVE_GENERAL_SETTINGS_MATURETHEMES;
    public static final /* synthetic */ EnumC30410Bwc[] LJLJLJ;
    public String[] LJLIL;
    public EnumC30414Bwg[] LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public EnumC30411Bwd LJLJJL;
    public String LJLJJLL;
    public LiveMessagePlatformRedDotConfig LJLJL;

    public EnumC30410Bwc() {
        throw null;
    }

    public static EnumC30410Bwc valueOf(String str) {
        return (EnumC30410Bwc) V0N.LJJJ(EnumC30410Bwc.class, str);
    }

    public static EnumC30410Bwc[] values() {
        return (EnumC30410Bwc[]) LJLJLJ.clone();
    }

    static {
        EnumC30414Bwg enumC30414Bwg = EnumC30414Bwg.EVENT_PAGE_BROADCAST_PREVIEW;
        EnumC30411Bwd enumC30411Bwd = EnumC30411Bwd.LEVEL2;
        EnumC30410Bwc enumC30410Bwc = new EnumC30410Bwc("LIVE_GENERAL_SETTINGS_MATURETHEMES", 0, new String[]{"RedDotMatureThemes"}, new EnumC30414Bwg[]{enumC30414Bwg}, false, false, enumC30411Bwd, 108);
        LIVE_GENERAL_SETTINGS_MATURETHEMES = enumC30410Bwc;
        EnumC30411Bwd enumC30411Bwd2 = EnumC30411Bwd.LEVEL1;
        EnumC30411Bwd enumC30411Bwd3 = enumC30411Bwd2;
        EnumC30410Bwc enumC30410Bwc2 = new EnumC30410Bwc("LIVE_BROADCAST_PREVIEW_MORE", 1, new String[]{"RedDotFansClubPromoteDirect", "RedDotPromoteDirect"}, new EnumC30414Bwg[]{enumC30414Bwg}, false, false, enumC30411Bwd2, 108);
        LIVE_BROADCAST_PREVIEW_MORE = enumC30410Bwc2;
        EnumC30410Bwc enumC30410Bwc3 = new EnumC30410Bwc("LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE", 2, new String[]{"RedDotFansClubPromote"}, new EnumC30414Bwg[]{enumC30414Bwg}, false, true, LivePreviewMoreSetting.INSTANCE.useMoreBtn() ? enumC30411Bwd : enumC30411Bwd3, 100);
        LIVE_BROADCAST_PREVIEW_FANSCLUBPROMOTE = enumC30410Bwc3;
        boolean z = true;
        EnumC30410Bwc enumC30410Bwc4 = new EnumC30410Bwc("LIVE_BROADCAST_PREVIEW_PROMOTE", 3, new String[]{"RedDotPromote"}, new EnumC30414Bwg[]{enumC30414Bwg}, false, true, enumC30411Bwd2, 100);
        LIVE_BROADCAST_PREVIEW_PROMOTE = enumC30410Bwc4;
        EnumC30410Bwc enumC30410Bwc5 = new EnumC30410Bwc("LIVE_BROADCAST_PREVIEW_VOICE_CHAT", 4, new String[]{"RedDotPreviewVoiceChat"}, new EnumC30414Bwg[]{enumC30414Bwg}, false, true, null, 116);
        LIVE_BROADCAST_PREVIEW_VOICE_CHAT = enumC30410Bwc5;
        EnumC30414Bwg enumC30414Bwg2 = EnumC30414Bwg.EVENT_PAGE_BROADCAST;
        EnumC30410Bwc enumC30410Bwc6 = new EnumC30410Bwc("LIVE_BROADCAST_EHANCE", 5, new String[]{"live_broadcast_ehance", "live_broadcast_enhance_bgm"}, new EnumC30414Bwg[]{enumC30414Bwg2}, false, false, null, 124);
        LIVE_BROADCAST_EHANCE = enumC30410Bwc6;
        EnumC30410Bwc enumC30410Bwc7 = new EnumC30410Bwc("LIVE_EFFECT_RECENT_TAB", 6, new String[]{"LiveEffectRecentTab"}, new EnumC30414Bwg[]{enumC30414Bwg, enumC30414Bwg2}, false, false, null, 124);
        LIVE_EFFECT_RECENT_TAB = enumC30410Bwc7;
        String[] strArr = {"RedDotAnchorBGMusic"};
        EnumC30414Bwg[] enumC30414BwgArr = {enumC30414Bwg2};
        LiveBGMSetting liveBGMSetting = LiveBGMSetting.INSTANCE;
        if (!liveBGMSetting.inLiveBGMUpgradeV1() && !liveBGMSetting.inLiveBGMUpgradeV3()) {
            z = false;
        }
        EnumC30410Bwc enumC30410Bwc8 = new EnumC30410Bwc("LIVE_BROADCAST_ENHANCE_BGM", 7, strArr, enumC30414BwgArr, z, false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        LIVE_BROADCAST_ENHANCE_BGM = enumC30410Bwc8;
        EnumC30410Bwc enumC30410Bwc9 = new EnumC30410Bwc("LIVE_BROADCAST_ENHANCE_BACKGROUND", 8, new String[]{"RedDotAnchorBackgroundButton"}, new EnumC30414Bwg[]{enumC30414Bwg2}, TtLiveBackgroundSetting.INSTANCE.enable(), false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        LIVE_BROADCAST_ENHANCE_BACKGROUND = enumC30410Bwc9;
        EnumC30410Bwc enumC30410Bwc10 = new EnumC30410Bwc("LIVE_BROADCAST_MORE", 9, new String[]{"live_broadcast_more", "RedDotLiveKaraokMoreDirect"}, new EnumC30414Bwg[]{enumC30414Bwg2}, false, false, null, 124);
        LIVE_BROADCAST_MORE = enumC30410Bwc10;
        EnumC30410Bwc enumC30410Bwc11 = new EnumC30410Bwc("LIVE_BROADCAST_MORE_GOODYBAG", 10, new String[]{"GoodyBagToolsRedDot"}, new EnumC30414Bwg[]{enumC30414Bwg2}, false, false, null, 124);
        LIVE_BROADCAST_MORE_GOODYBAG = enumC30410Bwc11;
        EnumC30410Bwc enumC30410Bwc12 = new EnumC30410Bwc("LIVE_BROADCAST_KARAOKE", 11, new String[]{"RedDotLiveKaraokMenu"}, new EnumC30414Bwg[]{enumC30414Bwg2}, LiveKaraokeSetting.INSTANCE.enable(), false, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        LIVE_BROADCAST_KARAOKE = enumC30410Bwc12;
        LJLJLJ = new EnumC30410Bwc[]{enumC30410Bwc, enumC30410Bwc2, enumC30410Bwc3, enumC30410Bwc4, enumC30410Bwc5, enumC30410Bwc6, enumC30410Bwc7, enumC30410Bwc8, enumC30410Bwc9, enumC30410Bwc10, enumC30410Bwc11, enumC30410Bwc12};
    }

    public final String getCurrentId() {
        return this.LJLJJLL;
    }

    public final String[] getIds() {
        return this.LJLIL;
    }

    public final LiveMessagePlatformRedDotConfig getLiveMessagePlatformRedDotConfig() {
        return this.LJLJL;
    }

    public final EnumC30414Bwg[] getLivePage() {
        return this.LJLILLLLZI;
    }

    public final EnumC30411Bwd getPageLevel() {
        return this.LJLJJL;
    }

    public final boolean isDynamic() {
        return this.LJLJJI;
    }

    public final boolean isValid() {
        return this.LJLJI;
    }

    public final void setCurrentId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLJJLL = str;
    }

    public final void setDynamic(boolean z) {
        this.LJLJJI = z;
    }

    public final void setIds(String[] strArr) {
        o.LJIIIZ(strArr, "<set-?>");
        this.LJLIL = strArr;
    }

    public final void setLiveMessagePlatformRedDotConfig(LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig) {
        o.LJIIIZ(liveMessagePlatformRedDotConfig, "<set-?>");
        this.LJLJL = liveMessagePlatformRedDotConfig;
    }

    public final void setLivePage(EnumC30414Bwg[] enumC30414BwgArr) {
        o.LJIIIZ(enumC30414BwgArr, "<set-?>");
        this.LJLILLLLZI = enumC30414BwgArr;
    }

    public final void setPageLevel(EnumC30411Bwd enumC30411Bwd) {
        o.LJIIIZ(enumC30411Bwd, "<set-?>");
        this.LJLJJL = enumC30411Bwd;
    }

    public final void setValid(boolean z) {
        this.LJLJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EnumC30410Bwc(String str, int i, String[] strArr, EnumC30414Bwg[] enumC30414BwgArr, boolean z, boolean z2, EnumC30411Bwd enumC30411Bwd, int i2) {
        String str2;
        boolean z3 = z2;
        EnumC30411Bwd enumC30411Bwd2 = enumC30411Bwd;
        boolean z4 = (i2 & 4) != 0 ? true : z;
        z3 = (i2 & 8) != 0 ? false : z3;
        enumC30411Bwd2 = (i2 & 16) != 0 ? EnumC30411Bwd.LEVEL1 : enumC30411Bwd2;
        if ((i2 & 32) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        LiveMessagePlatformRedDotConfig liveMessagePlatformRedDotConfig = (i2 & 64) != 0 ? new LiveMessagePlatformRedDotConfig(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0) : null;
        this.LJLIL = strArr;
        this.LJLILLLLZI = enumC30414BwgArr;
        this.LJLJI = z4;
        this.LJLJJI = z3;
        this.LJLJJL = enumC30411Bwd2;
        this.LJLJJLL = str2;
        this.LJLJL = liveMessagePlatformRedDotConfig;
    }
}
