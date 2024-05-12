package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.ProTemplateEffect;
import kotlin.jvm.internal.o;

/* renamed from: X.ERz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36443ERz implements ERP {
    public final /* synthetic */ ES0 LJLIL;

    public C36443ERz(ES0 es0) {
        this.LJLIL = es0;
    }

    @Override // X.ERP
    public final FaceStickerBean LIZ(Effect effect) {
        boolean z;
        UploadableMobileEffect LIZ;
        boolean z2 = false;
        if (effect != null && C78886Uxe.LJJIJL(effect)) {
            z = true;
        } else {
            z = false;
        }
        if (z || (effect != null && C78886Uxe.LJJJ(effect) && !V0N.LJJI(effect))) {
            FaceStickerBean LJFF = SFS.LJFF(effect, null);
            LJFF.setStackableEffect(true);
            return LJFF;
        }
        if (((effect instanceof MobileEffect) || (effect != null && V0N.LJJIFFI(effect))) && !DiyPropParser.LJII(effect)) {
            FaceStickerBean LJFF2 = SFS.LJFF(effect, null);
            LJFF2.setMobileEffect(true);
            if (effect instanceof MobileEffect) {
                if (((MobileEffect) effect).getModerationStatus() == 3) {
                    z2 = true;
                }
                LJFF2.setEffectPassedModeration(z2);
            }
            return LJFF2;
        }
        if (effect instanceof ProTemplateEffect) {
            return FaceStickerBean.NONE;
        }
        if (effect instanceof DraftEffect) {
            UploadableDraftEffect uploadableDraftEffect = this.LJLIL.LJII;
            if (uploadableDraftEffect != null) {
                FaceStickerBean LJFF3 = SFS.LJFF(effect, null);
                LJFF3.setStickerId(CastLongProtector.parseLong(uploadableDraftEffect.effectId));
                LJFF3.setName(effect.getName());
                LJFF3.setEffectPassedModeration(false);
                return LJFF3;
            }
            return FaceStickerBean.NONE;
        }
        if (effect != null) {
            this.LJLIL.getClass();
            if (ES0.LIZ(effect) || this.LJLIL.LIZIZ(effect)) {
                ES5 es5 = this.LJLIL.LJI;
                if (es5 != null && (LIZ = es5.LIZ()) != null && o.LJ(LIZ.templateEffectId, effect.getEffectId())) {
                    FaceStickerBean LJFF4 = SFS.LJFF(effect, null);
                    LJFF4.setMobileEffect(true);
                    LJFF4.setStickerId(CastLongProtector.parseLong(LIZ.effectId));
                    LJFF4.setResourceID(LIZ.templateResourceId);
                    LJFF4.setName(LIZ.effectName);
                    LJFF4.setCustomizedPropId(LIZ.effectId);
                    return LJFF4;
                }
                return FaceStickerBean.NONE;
            }
        }
        return null;
    }
}
