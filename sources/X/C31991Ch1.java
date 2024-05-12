package X;

import com.bytedance.android.livesdk.effect.StickerMessageManager;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.List;

/* renamed from: X.Ch1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31991Ch1 implements InterfaceC32013ChN {
    public final /* synthetic */ CKI LIZ;
    public final /* synthetic */ StickerMessageManager LIZIZ;

    @Override // X.InterfaceC32013ChN
    public final void onFailed() {
    }

    @Override // X.InterfaceC32013ChN
    public final void onSuccess(List<AssetsModel> list) {
        StickerMessageManager stickerMessageManager = this.LIZIZ;
        stickerMessageManager.downLoadStickAssets(stickerMessageManager.mCurrentMessage, this.LIZ);
    }

    public C31991Ch1(StickerMessageManager stickerMessageManager, C31990Ch0 c31990Ch0) {
        this.LIZIZ = stickerMessageManager;
        this.LIZ = c31990Ch0;
    }
}
