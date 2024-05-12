package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.CKEDraftInfo;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.ss.android.ugc.aweme.effectcreator.models.CKEDraftInfoWrapper;
import com.ss.android.ugc.aweme.effectcreator.models.EffectHintWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.aWu, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93812aWu {
    public static final /* synthetic */ int LIZ = 0;

    public static CKEDraftInfo LIZ(CKEDraftInfoWrapper wrapper) {
        EffectHint effectHint;
        o.LJIIIZ(wrapper, "wrapper");
        String str = wrapper.draftID;
        String str2 = wrapper.draftPath;
        String str3 = wrapper.effectPath;
        String str4 = wrapper.effectId;
        String str5 = wrapper.defaultIconPath;
        String str6 = wrapper.defaultName;
        String str7 = wrapper.iconPath;
        String str8 = wrapper.name;
        String str9 = wrapper.createTime;
        String str10 = wrapper.updateTime;
        String str11 = wrapper.modelId;
        String str12 = wrapper.author;
        EffectHintWrapper effectHintWrapper = wrapper.effectHint;
        if (effectHintWrapper == null) {
            effectHint = null;
        } else {
            effectHint = new EffectHint(effectHintWrapper.hintKey, effectHintWrapper.effectKey, effectHintWrapper.hint, effectHintWrapper.hintIcon, effectHintWrapper.hintFile, effectHintWrapper.hintFileFormat);
        }
        return new CKEDraftInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, effectHint, wrapper.iconEdit, 12288);
    }

    public static EffectHintWrapper LIZIZ(EffectHint effectHint) {
        if (effectHint == null) {
            return null;
        }
        return new EffectHintWrapper(effectHint.hintKey, effectHint.effectKey, effectHint.hint, effectHint.hintIcon, effectHint.hintFile, effectHint.hintFileFormat);
    }

    public static CKEDraftInfoWrapper LIZJ(CKEDraftInfo original) {
        o.LJIIIZ(original, "original");
        return new CKEDraftInfoWrapper(original.draftID, original.draftPath, original.effectPath, original.effectId, original.defaultIconPath, original.defaultName, original.iconPath, original.name, original.createTime, original.updateTime, original.modelId, original.author, LIZIZ(original.effectHint), original.iconEdit);
    }
}
