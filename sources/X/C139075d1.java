package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import defpackage.i0;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139075d1 extends TIR {
    public final VideoPublishEditModel LIZIZ;
    public final int LIZJ;
    public InterfaceC65784Pro<C76800UCe> LIZLLL;
    public InterfaceC65784Pro<C76800UCe> LJ;

    @Override // X.InterfaceC72862Sig
    public final void LIZ(Effect effect) {
        if (effect == null) {
            return;
        }
        LIZLLL(effect);
    }

    @Override // X.TIR
    public final void LIZIZ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("cancel_remove_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
    }

    @Override // X.TIR
    public final void LIZJ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("cancel_report_and_remove_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
    }

    @Override // X.TIR
    public final void LJ(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("remove_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
    }

    @Override // X.TIR
    public final void LJFF(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("report_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
    }

    @Override // X.TIR
    public final void LJI(Effect curEffect) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("confirm_remove_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
        C139085d2 c139085d2 = new C139085d2();
        String effectId2 = curEffect.getEffectId();
        o.LJIIIZ(effectId2, "effectId");
        String currentUserID = C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
        java.util.Set LJLIIL = ORY.LJLIIL(c139085d2.LIZ(currentUserID));
        LJLIIL.add(effectId2);
        c139085d2.LIZ.storeStringArray(i0.LJFF("block_editing_sticker_list_", currentUserID), (String[]) LJLIIL.toArray(new String[0]));
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJ;
        if (interfaceC65784Pro2 != null) {
            interfaceC65784Pro2.invoke();
        }
        VideoPublishEditModel editModel2 = this.LIZIZ;
        String effectId3 = curEffect.getEffectId();
        int i2 = this.LIZJ;
        int source2 = curEffect.getSource();
        String designerId2 = curEffect.getDesignerId();
        o.LJIIIZ(editModel2, "editModel");
        o.LJIIIZ(effectId3, "effectId");
        o.LJIIIZ(designerId2, "designerId");
        GXR.LIZ("remove_effect_success", C135005Ro.LIZ(i2, source2, editModel2, effectId3, designerId2).LIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139075d1(ActivityC45651qj activity, VideoPublishEditModel editModel, int i) {
        super(activity);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editModel, "editModel");
        this.LIZIZ = editModel;
        this.LIZJ = i;
    }

    public final void LJII(Effect curEffect, AqS152S0100000_2 aqS152S0100000_2, InterfaceC65784Pro interfaceC65784Pro) {
        o.LJIIIZ(curEffect, "curEffect");
        VideoPublishEditModel editModel = this.LIZIZ;
        String effectId = curEffect.getEffectId();
        int i = this.LIZJ;
        int source = curEffect.getSource();
        String designerId = curEffect.getDesignerId();
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(effectId, "effectId");
        o.LJIIIZ(designerId, "designerId");
        GXR.LIZ("report_and_remove_effect", C135005Ro.LIZ(i, source, editModel, effectId, designerId).LIZ);
        this.LIZLLL = aqS152S0100000_2;
        this.LJ = interfaceC65784Pro;
        LIZ(curEffect);
    }
}
