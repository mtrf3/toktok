package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0LT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0LT {
    public static Effect LIZ(LiveEffect liveEffect) {
        UrlModel urlModel;
        if (liveEffect.getEffect() != null) {
            return liveEffect.getEffect();
        }
        Effect effect = new Effect();
        effect.setId(liveEffect.realId);
        effect.setEffectId(String.valueOf(liveEffect.effectId));
        effect.setResourceId(liveEffect.getResourceId());
        com.bytedance.android.live.base.model.UrlModel urlModel2 = liveEffect.icon;
        if (urlModel2 == null) {
            urlModel = new UrlModel();
        } else {
            urlModel = new UrlModel();
            urlModel.setUri(urlModel2.uri);
            urlModel.setUrlList(urlModel2.urlList);
        }
        effect.setIconUrl(urlModel);
        effect.setUnzipPath(liveEffect.unzipPath);
        effect.setHint(liveEffect.hint);
        effect.setTags(liveEffect.getTags());
        effect.setDownloaded(liveEffect.isDownloaded);
        effect.setEffectId(liveEffect.getResourceId());
        String str = liveEffect.tagsUpdatedAt;
        if (str != null) {
            effect.setTagsUpdatedAt(str);
        }
        effect.setExtra(liveEffect.extra);
        effect.setTypes(liveEffect.types);
        String str2 = liveEffect.sdkExtra;
        if (str2 != null) {
            effect.setSdkExtra(str2);
        }
        return effect;
    }

    public static LiveEffect LIZIZ(Effect effect) {
        com.bytedance.android.live.base.model.UrlModel urlModel;
        com.bytedance.android.live.base.model.UrlModel urlModel2;
        LiveEffect liveEffect = new LiveEffect();
        UrlModel iconUrl = effect.getIconUrl();
        if (iconUrl == null) {
            urlModel = new com.bytedance.android.live.base.model.UrlModel();
        } else {
            urlModel = new com.bytedance.android.live.base.model.UrlModel();
            urlModel.uri = iconUrl.getUri();
            urlModel.urlList = iconUrl.getUrlList();
        }
        liveEffect.icon = urlModel;
        liveEffect.effectId = CastLongProtector.valueOf(effect.getEffectId()).longValue();
        liveEffect.setRealId(effect.getId());
        liveEffect.setResourceId(effect.getResourceId());
        liveEffect.setUnzipPath(effect.getUnzipPath());
        liveEffect.hint = effect.getHint();
        UrlModel hintIcon = effect.getHintIcon();
        if (hintIcon == null) {
            urlModel2 = new com.bytedance.android.live.base.model.UrlModel();
        } else {
            urlModel2 = new com.bytedance.android.live.base.model.UrlModel();
            urlModel2.uri = hintIcon.getUri();
            urlModel2.urlList = hintIcon.getUrlList();
        }
        liveEffect.hintIcon = urlModel2;
        liveEffect.isDownloaded = effect.isDownloaded();
        liveEffect.setTags(effect.getTags());
        String tagsUpdatedAt = effect.getTagsUpdatedAt();
        if (tagsUpdatedAt != null) {
            liveEffect.tagsUpdatedAt = tagsUpdatedAt;
        }
        liveEffect.types = effect.getTypes();
        liveEffect.name = effect.getName();
        liveEffect.setEffect(effect);
        liveEffect.extra = effect.getExtra();
        liveEffect.sdkExtra = effect.getSdkExtra();
        if (!C38354F3m.LJ(liveEffect.extra)) {
            try {
                new o();
                m LJIIZILJ = o.LIZ(liveEffect.extra).LJIIZILJ();
                if (LJIIZILJ.LJJIJLIJ("ab_group")) {
                    liveEffect.abGroup = LJIIZILJ.LJJIJ("ab_group").LJIILJJIL();
                }
                if (LJIIZILJ.LJJIJLIJ("beautyConfig")) {
                    LIZJ(LJIIZILJ, liveEffect);
                }
                if (LJIIZILJ.LJJIJLIJ("Review_original_frame")) {
                    liveEffect.reviewOriginalFrame = LJIIZILJ.LJJIJ("Review_original_frame").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("effect_name_en")) {
                    liveEffect.nameForEnglish = LJIIZILJ.LJJIJ("effect_name_en").LJJIFFI();
                }
                if (LJIIZILJ.LJJIJLIJ("icon_insert")) {
                    liveEffect.isIconInsert = LJIIZILJ.LJJIJ("icon_insert").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("cohost_insert")) {
                    liveEffect.isIconInsertInCoHost = LJIIZILJ.LJJIJ("cohost_insert").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("multi_insert")) {
                    liveEffect.isIconInsertInMultiGuest = LJIIZILJ.LJJIJ("multi_insert").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("gift_sticker") && LJIIZILJ.LJJIJ("gift_sticker").LJFF()) {
                    liveEffect.coexistGroup.addAll(Collections.singletonList(2));
                }
                if (LJIIZILJ.LJJIJLIJ("quiz")) {
                    liveEffect.setQuiz(LJIIZILJ.LJJIJ("quiz").LJJIFFI());
                }
                if (LJIIZILJ.LJJIJLIJ("effect_preview")) {
                    liveEffect.setRecommendPreviewIcon(LJIIZILJ.LJJIJ("effect_preview").LJJIFFI());
                }
                if (LJIIZILJ.LJJIJLIJ("effect_recommend_start")) {
                    liveEffect.recommendStartTime = LJIIZILJ.LJJIJ("effect_recommend_start").LJIJJLI();
                }
                if (LJIIZILJ.LJJIJLIJ("effect_recommend_end")) {
                    liveEffect.recommendEndTime = LJIIZILJ.LJJIJ("effect_recommend_end").LJIJJLI();
                }
                if (LJIIZILJ.LJJIJLIJ("block_multiplayer")) {
                    liveEffect.forbidInLink = LJIIZILJ.LJJIJ("block_multiplayer").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("is_safe_area")) {
                    liveEffect.needSafeArea = LJIIZILJ.LJJIJ("is_safe_area").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("action_schema")) {
                    liveEffect.setActionSchema(LJIIZILJ.LJJIJ("action_schema").LJJIFFI());
                }
                if (LJIIZILJ.LJJIJLIJ("is_greenscreen")) {
                    liveEffect.isGreenScreen = LJIIZILJ.LJJIJ("is_greenscreen").LJFF();
                }
                if (LJIIZILJ.LJJIJLIJ("not_multiguest_effect")) {
                    liveEffect.notMultiGuestEffect = LJIIZILJ.LJJIJ("not_multiguest_effect").LJFF();
                }
                C0LS.LIZ(liveEffect);
                C0LS.LIZIZ(liveEffect);
            } catch (Throwable unused) {
            }
        }
        if (!C38354F3m.LJ(liveEffect.sdkExtra)) {
            try {
                liveEffect.sdkExtraModel = (LiveEffect.StickerSDKExtra) C09650Zl.LIZIZ.LJI(liveEffect.sdkExtra, LiveEffect.StickerSDKExtra.class);
            } catch (Throwable unused2) {
            }
        }
        return liveEffect;
    }

    public static void LIZJ(m mVar, LiveEffect liveEffect) {
        List<LiveEffect.ComposerConfig> list = (List) GsonProtectorUtils.fromJson(C09650Zl.LIZIZ, GsonProtectorUtils.parse(new o(), mVar.LJJIJ("beautyConfig").LJJIFFI()).LJIIZILJ().LJJIJIIJI("items"), new TypeToken<List<LiveEffect.ComposerConfig>>() { // from class: X.1HI
        }.getType());
        liveEffect.setComposerConfigList(list);
        Iterator<LiveEffect.ComposerConfig> it = list.iterator();
        while (it.hasNext()) {
            liveEffect.updateKeys.add(it.next().tag);
        }
    }
}
