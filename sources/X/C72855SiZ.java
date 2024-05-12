package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SiZ, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72855SiZ<TTaskResult, TContinuationResult> implements C10I {
    public final /* synthetic */ C72854SiY LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ Effect LIZJ;

    public C72855SiZ(C72854SiY c72854SiY, String str, Effect effect) {
        this.LIZ = c72854SiY;
        this.LIZIZ = str;
        this.LIZJ = effect;
    }

    @Override // X.C10I
    public final Object then(C10K task) {
        CommerceSticker commerceSticker;
        NewFaceStickerBean newFaceStickerBean;
        o.LJIIIZ(task, "task");
        Effect effect = this.LIZ.LJIIIIZZ;
        if (effect == null || TextUtils.equals(effect.getEffectId(), this.LIZIZ)) {
            if (task.LJIIL() || task.LJIILJJIL()) {
                C72854SiY c72854SiY = this.LIZ;
                c72854SiY.LIZ((CommerceSticker) ((HashMap) c72854SiY.LJII).get(this.LIZIZ), V3N.LJIILJJIL(this.LIZJ), true);
            } else {
                try {
                    List<? extends NewFaceStickerBean> list = ((NewFaceStickerListBean) task.LJIIJJI()).mStickers;
                    if (list != null && (newFaceStickerBean = (NewFaceStickerBean) ListProtector.get(list, 0)) != null) {
                        commerceSticker = newFaceStickerBean.commerceSticker;
                    } else {
                        commerceSticker = null;
                    }
                    o.LJI(commerceSticker);
                    ((HashMap) this.LIZ.LJII).put(this.LIZIZ, commerceSticker);
                    this.LIZ.LIZ(commerceSticker, V3N.LJIILJJIL(this.LIZJ), true);
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
            }
        }
        return null;
    }
}
