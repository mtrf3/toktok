package X;

import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectPackageDataWrapper;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.VideoCreation;
import com.ss.android.ugc.aweme.sticker.model.MobileEffectTemplateInfo;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.jvm.internal.o;

/* renamed from: X.T9q, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74186T9q {
    public static final C145995oB LIZJ(MobileEffectData mobileEffectData) {
        String str;
        String str2;
        String str3;
        MobileEffectTemplateInfo mobileEffectTemplateInfo;
        MobileEffectTemplateInfo mobileEffectTemplateInfo2;
        o.LJIIIZ(mobileEffectData, "<this>");
        C145995oB c145995oB = new C145995oB();
        NewFaceStickerBean newFaceStickerBean = mobileEffectData.effect;
        String str4 = null;
        if (newFaceStickerBean != null && (mobileEffectTemplateInfo2 = newFaceStickerBean.mobileEffectTemplate) != null) {
            str = mobileEffectTemplateInfo2.getTemplateId();
        } else {
            str = null;
        }
        c145995oB.LJI("template_id", str);
        NewFaceStickerBean newFaceStickerBean2 = mobileEffectData.effect;
        if (newFaceStickerBean2 != null && (mobileEffectTemplateInfo = newFaceStickerBean2.mobileEffectTemplate) != null) {
            str2 = mobileEffectTemplateInfo.getTemplateId();
        } else {
            str2 = null;
        }
        c145995oB.LJI("template_name", str2);
        NewFaceStickerBean newFaceStickerBean3 = mobileEffectData.effect;
        if (newFaceStickerBean3 != null) {
            str3 = newFaceStickerBean3.effectId;
        } else {
            str3 = null;
        }
        c145995oB.LJI("effect_id", str3);
        NewFaceStickerBean newFaceStickerBean4 = mobileEffectData.effect;
        if (newFaceStickerBean4 != null) {
            str4 = newFaceStickerBean4.name;
        }
        c145995oB.LJI("effect_name", str4);
        c145995oB.LJI("enter_from", "prop_page");
        return c145995oB;
    }

    public static final C145995oB LIZLLL(MobileEffectData mobileEffectData) {
        String str;
        o.LJIIIZ(mobileEffectData, "<this>");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", mobileEffectData.creationId);
        c145995oB.LJI("enter_from", mobileEffectData.shootPageEnterFrom);
        c145995oB.LJI("shoot_way", mobileEffectData.shootWay);
        EffectPackageDataWrapper effectPackageDataWrapper = mobileEffectData.publishData;
        if (effectPackageDataWrapper != null) {
            str = effectPackageDataWrapper.projectSource;
        } else {
            str = null;
        }
        c145995oB.LIZ(o.LJ(str, "template") ? 1 : 0, "is_pro_template");
        return c145995oB;
    }

    public static final Object LJ(InterfaceC67352kd<? super UploadAuthKeyConfig> interfaceC67352kd) {
        C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(interfaceC67352kd));
        C76L<VideoCreation> LIZJ = C60903NvH.LJIIJJI().getPublishService().LJJIJIIJI().LIZJ(null);
        C37311Ekd c37311Ekd = new C37311Ekd(c84654XKg);
        LIZJ.LJFF(new RunnableC65751PrH(LIZJ, c37311Ekd), EnumC169566l6.LJLIL);
        return c84654XKg.LIZ();
    }

    public static final void LIZ(C145995oB c145995oB, EffectPackageDataWrapper effectPackageDataWrapper) {
        String str;
        String str2;
        Long l;
        String str3;
        Integer num;
        Integer num2;
        String str4;
        Long l2 = null;
        if (effectPackageDataWrapper != null) {
            str = effectPackageDataWrapper.projectId;
        } else {
            str = null;
        }
        c145995oB.LIZLLL("project_id", str);
        if (effectPackageDataWrapper != null) {
            str2 = effectPackageDataWrapper.projectSource;
        } else {
            str2 = null;
        }
        c145995oB.LIZLLL("project_source", str2);
        if (effectPackageDataWrapper != null) {
            l = Long.valueOf(effectPackageDataWrapper.projectSize);
        } else {
            l = null;
        }
        c145995oB.LIZJ(l, "project_size");
        if (effectPackageDataWrapper != null) {
            str3 = effectPackageDataWrapper.templateId;
        } else {
            str3 = null;
        }
        c145995oB.LIZLLL("template_id", str3);
        if (effectPackageDataWrapper != null) {
            num = Integer.valueOf(effectPackageDataWrapper.objectCount);
        } else {
            num = null;
        }
        c145995oB.LIZJ(num, "object_cnt");
        if (effectPackageDataWrapper != null) {
            num2 = Integer.valueOf(effectPackageDataWrapper.sequenceCount);
        } else {
            num2 = null;
        }
        c145995oB.LIZJ(num2, "sequence_cnt");
        if (effectPackageDataWrapper != null) {
            l2 = Long.valueOf(effectPackageDataWrapper.duration);
        }
        c145995oB.LIZJ(l2, "effect_create_duration");
        if (effectPackageDataWrapper == null || (str4 = effectPackageDataWrapper.enterFrom) == null) {
            str4 = "";
        }
        c145995oB.LIZLLL("ame_enter_from", str4);
    }

    public static final void LIZIZ(java.util.Map<String, String> map, EffectHintWrapper effectHintWrapper) {
        String str;
        String str2;
        if (effectHintWrapper == null || (str = effectHintWrapper.hint) == null) {
            str = "None";
        }
        map.put("hint_text", str);
        if (effectHintWrapper == null || (str2 = effectHintWrapper.hintKey) == null) {
            str2 = "null";
        }
        map.put("hint_id", str2);
    }

    public static Object LJFF(CKEDraftInfoWrapper cKEDraftInfoWrapper, String str, String str2, String str3, EffectHintWrapper effectHintWrapper, boolean z, int i, InterfaceC67352kd interfaceC67352kd, int i2) {
        boolean z2 = z;
        String str4 = str;
        int i3 = i;
        if ((i2 & 2) != 0) {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if ((i2 & 64) != 0) {
            i3 = 0;
        }
        Object LJI = XKX.LJI(C78613UtF.LIZJ, new EQR(i3, cKEDraftInfoWrapper, effectHintWrapper, str2, str3, str4, null, z2), interfaceC67352kd);
        if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJI;
        }
        return C76800UCe.LIZ;
    }
}
