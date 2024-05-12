package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* renamed from: X.I8i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46124I8i {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(ShortVideoContext shortVideoContext) {
        String str;
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (C00F.LIZ(31744, 0, "enable_play_music_by_default_try_effect", true) > 0 && !shortVideoContext.mIsFromDraft && !C78685UuP.LJJJZ(shortVideoContext.newDraftId) && !o.LJ(shortVideoContext.enterFrom, "super_entrance") && shortVideoContext.isSpecialPlusIcon != 1 && (((str = shortVideoContext.presetEffectId) == null || str.length() == 0) && "direct_shoot".equals(shortVideoContext.shootWay))) {
            return true;
        }
        if (!C46125I8j.LIZ() || !o.LJ(shortVideoContext.shootWay, "single_song")) {
            return false;
        }
        return !C78605Ut7.LIZJ(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"});
    }

    public static boolean LIZ(ShortVideoContext shortVideoContext, Effect effect) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        if (!LIZIZ(shortVideoContext) || V16.LJJIJLIJ(shortVideoContext) || shortVideoContext.LJJJI() || shortVideoContext.LJJIJIIJI() || shortVideoContext.cameraComponentModel.isRetakeMode || C1DG.LJIIIIZZ() || shortVideoContext.LJIIIIZZ() > 0 || V3N.LJJI(effect) || V3N.LJIILLIIL(effect)) {
            return false;
        }
        return true;
    }
}
