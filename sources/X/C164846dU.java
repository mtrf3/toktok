package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractStickerTracksContext;
import java.io.Serializable;

/* renamed from: X.6dU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164846dU implements Serializable {
    public C43722HDy LJLIL;
    public boolean interactStickerCheckEffectSdk;
    public InteractStickerTracksContext mInteractStickerContext;

    public String toBusinessData() {
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), this);
    }

    public InteractStickerTracksContext getInteractStickerContext() {
        return this.mInteractStickerContext;
    }

    public C43722HDy getShareContext() {
        return this.LJLIL;
    }

    public static String getShareContext(String str) {
        C164846dU c164846dU;
        if (C38354F3m.LJ(str) || (c164846dU = (C164846dU) GsonProtectorUtils.fromJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), str, C164846dU.class)) == null || c164846dU.getShareContext() == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), c164846dU.getShareContext());
    }

    public void setInteractStickerContext(InteractStickerTracksContext interactStickerTracksContext) {
        this.mInteractStickerContext = interactStickerTracksContext;
    }

    public void setShareContext(C43722HDy c43722HDy) {
        this.LJLIL = c43722HDy;
    }

    public static String getShareContext(C164846dU c164846dU) {
        if (c164846dU == null || c164846dU.getShareContext() == null) {
            return null;
        }
        return GsonProtectorUtils.toJson(C60903NvH.LJIIJJI().getNetworkService().getRetrofitFactoryGson(), c164846dU.getShareContext());
    }

    public static String updateSDKShareContextWhenSaveOrPost(boolean z, String str) {
        return str;
    }
}
