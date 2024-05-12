package com.ss.android.ugc.aweme.services.sticker;

import X.C16880lQ;
import X.EQ7;
import X.ETV;
import X.ID0;
import X.V3N;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean hasUnlocked(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return ETV.LIZ(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean idUnlocked(String id) {
        o.LJIIIZ(id, "id");
        ArrayList<String> LIZ = EQ7.LIZ();
        if (LIZ.isEmpty()) {
            return false;
        }
        return LIZ.contains(id);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isLockSticker(Effect effect) {
        return V3N.LJIJJ(effect);
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isScanUnLockType(String extra) {
        o.LJIIIZ(extra, "extra");
        if (!TextUtils.isEmpty(extra) && !o.LJ(extra, "{}")) {
            try {
                if (JSONObjectProtectorUtils.getInt(new JSONObject(extra), "lock_type") == 1) {
                    return true;
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService
    public boolean isStickerPreviewable(Effect effect) {
        o.LJIIIZ(effect, "effect");
        return ID0.LJJ(effect);
    }
}
