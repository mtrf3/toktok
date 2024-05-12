package X;

import com.ss.android.ugc.aweme.sticker.presenter.handler.SavePhotoStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONObject;

/* renamed from: X.Wgm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC82936Wgm implements Runnable {
    public final /* synthetic */ SavePhotoStickerHandler LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ String LJLJJI;

    public RunnableC82936Wgm(SavePhotoStickerHandler savePhotoStickerHandler, int i, int i2, String str) {
        this.LJLIL = savePhotoStickerHandler;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = str;
    }

    public final void LIZ() {
        String extra;
        if (this.LJLILLLLZI != 69 || this.LJLJI != 0) {
            return;
        }
        SavePhotoStickerHandler savePhotoStickerHandler = this.LJLIL;
        String str = this.LJLJJI;
        Effect effect = savePhotoStickerHandler.LJLJI;
        boolean z = false;
        if (effect != null && V3N.LJIJ(effect.getExtra(), "need_to_remove_label_for_capture_image", false)) {
            z = true;
        }
        savePhotoStickerHandler.LJLJJL.LIZJ(str, z);
        Effect effect2 = savePhotoStickerHandler.LJLJI;
        if (effect2 == null || (extra = effect2.getExtra()) == null) {
            return;
        }
        try {
            savePhotoStickerHandler.LJLJJL.LIZ(new JSONObject(extra).optString("hint_for_saving_captured_image"));
        } catch (Exception e) {
            savePhotoStickerHandler.LJLJJLL.LIZIZ(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
