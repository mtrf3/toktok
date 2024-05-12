package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.creative.model.DraftInfo;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ERV implements ERB {
    public final DraftEffect LIZ;

    @Override // X.ERB
    public final void onMessageReceived(int i, int i2, int i3, String str) {
    }

    public ERV(DraftEffect draftEffect) {
        this.LIZ = draftEffect;
    }

    @Override // X.ERB
    public final UploadableMobileEffect2 LIZ(List<UploadableMobileEffect2> exportEffects) {
        Object obj;
        o.LJIIIZ(exportEffects, "exportEffects");
        Iterator<UploadableMobileEffect2> it = exportEffects.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            UploadableMobileEffect2 next = it.next();
            DraftInfo draftInfo = next.draftInfo;
            if (draftInfo != null) {
                obj = draftInfo.draftId;
            }
            if (o.LJ(obj, this.LIZ.getDraft().draftID)) {
                obj = next;
                break;
            }
        }
        return (UploadableMobileEffect2) obj;
    }

    @Override // X.ERB
    public final ERF LIZJ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2) {
        String str;
        String str2 = this.LIZ.getDraft().draftID;
        EffectHintWrapper effectHintWrapper = this.LIZ.getDraft().effectHint;
        if (effectHintWrapper == null || (str = effectHintWrapper.hintKey) == null) {
            str = "";
        }
        uploadableMobileEffect2.draftInfo = new DraftInfo(str2, false, false, str, 6, null);
        String str3 = this.LIZ.getDraft().name;
        o.LJIIIZ(str3, "<set-?>");
        uploadableMobileEffect2.effectName = str3;
        FaceStickerBean LJFF = SFS.LJFF(this.LIZ, null);
        o.LJIIIIZZ(LJFF, "covert(draftEffect, null)");
        LJFF.setStickerId(CastLongProtector.parseLong(uploadableMobileEffect2.effectId));
        LJFF.setName(this.LIZ.getDraft().name);
        LJFF.setEffectPassedModeration(false);
        return new ERF(ERX.LJLIL, 0, LJFF);
    }

    @Override // X.ERB
    public final Object LIZIZ(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd interfaceC67352kd) {
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new ERW(uploadableMobileEffect2, this, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.ERB
    public final Object LIZLLL(Effect effect, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new ERT(uploadableMobileEffect2, this, null), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}
