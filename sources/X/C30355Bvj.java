package X;

import android.content.Context;
import com.bytedance.android.live.effect.model.VideoSize;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Bvj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30355Bvj {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C30336BvQ.LJLIL);

    public static final C1MZ LJII() {
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            C1MZ liveComposerFilterHelper = C7N.LJII().getLiveComposerFilterHelper();
            o.LJIIIIZZ(liveComposerFilterHelper, "{\n            effectServ…serFilterHelper\n        }");
            return liveComposerFilterHelper;
        }
        C1MZ liveFilterHelper = C7N.LJII().getLiveFilterHelper();
        o.LJIIIIZZ(liveFilterHelper, "{\n            effectServ…iveFilterHelper\n        }");
        return liveFilterHelper;
    }

    public static final InterfaceC08070Tj<? extends LiveEffect> LJIIIZ() {
        return (InterfaceC08070Tj) LIZ.getValue();
    }

    public static final C0WF LIZJ() {
        C0WF baseComposerManager = C7N.LJII().baseComposerManager();
        o.LJIIIIZZ(baseComposerManager, "effectService.baseComposerManager()");
        return baseComposerManager;
    }

    public static final C0WI LIZLLL() {
        C0WI liveBeautyLogManager = C7N.LJII().getLiveBeautyLogManager();
        o.LJIIIIZZ(liveBeautyLogManager, "effectService.liveBeautyLogManager");
        return liveBeautyLogManager;
    }

    public static final C0WR LJ() {
        C0WR liveEffectDataProvider = C7N.LJII().getLiveEffectDataProvider();
        o.LJIIIIZZ(liveEffectDataProvider, "effectService.liveEffectDataProvider");
        return liveEffectDataProvider;
    }

    public static final InterfaceC08030Tf LJFF() {
        InterfaceC08030Tf liveEffectRedDotManager = C7N.LJII().getLiveEffectRedDotManager();
        o.LJIIIIZZ(liveEffectRedDotManager, "effectService.liveEffectRedDotManager");
        return liveEffectRedDotManager;
    }

    public static final C0WS LJI() {
        C0WS liveEffectRestoreManager = C7N.LJII().getLiveEffectRestoreManager();
        o.LJIIIIZZ(liveEffectRestoreManager, "effectService.liveEffectRestoreManager");
        return liveEffectRestoreManager;
    }

    public static final C0WT LJIIIIZZ() {
        C0WT liveFilterLogManager = C7N.LJII().getLiveFilterLogManager();
        o.LJIIIIZZ(liveFilterLogManager, "effectService.liveFilterLogManager");
        return liveFilterLogManager;
    }

    public static final C0WV LJIIJ() {
        C0WV liveStickerLogManager = C7N.LJII().getLiveStickerLogManager();
        o.LJIIIIZZ(liveStickerLogManager, "effectService.liveStickerLogManager");
        return liveStickerLogManager;
    }

    public static final InterfaceC08150Tr LJIIJJI() {
        InterfaceC08150Tr liveVoiceEffectHelper = C7N.LJII().getLiveVoiceEffectHelper();
        o.LJIIIIZZ(liveVoiceEffectHelper, "effectService.liveVoiceEffectHelper");
        return liveVoiceEffectHelper;
    }

    public static final C0WW LJIIL() {
        C0WW uploadEffectRelatedLog = C7N.LJII().getUploadEffectRelatedLog();
        o.LJIIIIZZ(uploadEffectRelatedLog, "effectService.uploadEffectRelatedLog");
        return uploadEffectRelatedLog;
    }

    public static final boolean LJIILIIL() {
        Boolean hasUsedBGMFunction = C7N.LJII().hasUsedBGMFunction();
        o.LJIIIIZZ(hasUsedBGMFunction, "effectService.hasUsedBGMFunction()");
        return hasUsedBGMFunction.booleanValue();
    }

    public static final boolean LJIILJJIL() {
        Boolean isUsingBGMFunction = C7N.LJII().isUsingBGMFunction();
        o.LJIIIIZZ(isUsingBGMFunction, "effectService.isUsingBGMFunction()");
        return isUsingBGMFunction.booleanValue();
    }

    public static final LiveDialogFragment LIZ(Context context, DataChannel dataChannel) {
        LiveDialogFragment effectNewDialogFragment = C7N.LJII().getEffectNewDialogFragment(context, dataChannel);
        o.LJIIIIZZ(effectNewDialogFragment, "effectService.getEffectN…ent(context, dataChannel)");
        return effectNewDialogFragment;
    }

    public static LiveDialogFragment LIZIZ(JSONObject params, VideoSize videoSize) {
        o.LJIIIZ(params, "params");
        LiveDialogFragment liveGoalBackgroundDialogFragment = C7N.LJII().getLiveGoalBackgroundDialogFragment(params, videoSize);
        o.LJIIIIZZ(liveGoalBackgroundDialogFragment, "effectService.getLiveGoa…agment(params, videoSize)");
        return liveGoalBackgroundDialogFragment;
    }
}
