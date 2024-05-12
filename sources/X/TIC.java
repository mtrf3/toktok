package X;

import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TIC implements TIJ {
    public static final TIC LIZ = new TIC();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.TIJ
    public final TIG LIZ(TEZ stickerDataManager, Effect effect) {
        String str;
        String str2;
        List<String> children;
        String str3;
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        if (effect == null || effect.getEffectId() == null) {
            return new TIG();
        }
        InterfaceC74301TEb LJIIIIZZ = stickerDataManager.LJIIIIZZ();
        String effectId = effect.getEffectId();
        EffectTemplate effectTemplate = (EffectTemplate) LJIIIIZZ.LIZLLL().getValue();
        String str4 = null;
        if (effectTemplate != null) {
            str = effectTemplate.getEffectId();
        } else {
            str = null;
        }
        if (o.LJ(effectId, str)) {
            return new TIG();
        }
        String effectId2 = effect.getEffectId();
        EffectTemplate effectTemplate2 = (EffectTemplate) LJIIIIZZ.LJIILLIIL().getValue();
        if (effectTemplate2 != null) {
            str2 = effectTemplate2.getEffectId();
        } else {
            str2 = null;
        }
        if (o.LJ(effectId2, str2)) {
            return new TIG();
        }
        if (!TextUtils.isEmpty(effect.getParentId())) {
            String parentId = effect.getParentId();
            EffectTemplate effectTemplate3 = (EffectTemplate) LJIIIIZZ.LJIILLIIL().getValue();
            if (effectTemplate3 != null) {
                str3 = effectTemplate3.getEffectId();
            } else {
                str3 = null;
            }
            if (ujb.o.LJJJJIZL(parentId, str3, false)) {
                return new TIG();
            }
        }
        if (ID0.LJIIZILJ(effect) && (children = effect.getChildren()) != null && !children.isEmpty()) {
            EffectTemplate effectTemplate4 = (EffectTemplate) LJIIIIZZ.LIZLLL().getValue();
            if (effectTemplate4 != null) {
                str4 = effectTemplate4.getEffectId();
            }
            if (ORZ.LJLJJI(str4, children)) {
                return new TIG();
            }
        }
        return new TIG(false, "not_latest_want_to_use_sticker");
    }
}
