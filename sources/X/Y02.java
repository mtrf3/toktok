package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y02 {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        String str;
        if (aweme == null || (str = aweme.getTextStickerMajorityLang()) == null) {
            str = "";
        }
        if (o.LJ(str, "zh")) {
            return "zh-Hans";
        }
        return str;
    }

    public static final boolean LIZJ(List<InteractStickerStruct> list) {
        if (list == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : list) {
            if (interactStickerStruct != null && interactStickerStruct.getType() == 20) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LIZLLL(List<InteractStickerStruct> list) {
        if (list == null) {
            return false;
        }
        for (InteractStickerStruct interactStickerStruct : list) {
            if (interactStickerStruct != null && interactStickerStruct.getType() == 18) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme == null || ABZ.LIZ != 2 || !LIZLLL(aweme.getInteractStickerStructs()) || !aweme.isTextStickerTranslatable()) {
            return false;
        }
        String LJJIIZI = C86678Y0c.LIZIZ().LJJIIZI();
        String LIZ2 = LIZ(aweme);
        if (o.LJ(LIZ2, LJJIIZI) || ORY.LJJIJIIJIL(LIZ2, C86678Y0c.LIZIZ().LJIILLIIL())) {
            return false;
        }
        return true;
    }

    public static final List LIZIZ(Aweme aweme, List list) {
        String str;
        List LJJIJIL = C47261Igj.LJJIJIL(0, 0, 0);
        if (list == null) {
            return LJJIJIL;
        }
        if (aweme == null) {
            return LJJIJIL;
        }
        String LIZ2 = LIZ(aweme);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InteractStickerStruct interactStickerStruct = (InteractStickerStruct) it.next();
            if (interactStickerStruct != null && interactStickerStruct.getType() == 18) {
                interactStickerStruct.getTextStruct();
                TextStickerInfo textInfo = interactStickerStruct.getTextInfo();
                if (textInfo != null) {
                    TextStickerInfo textInfo2 = interactStickerStruct.getTextInfo();
                    if (textInfo2 != null) {
                        str = textInfo2.getSrcLanguage();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, "zh")) {
                        str = "zh-Hans";
                    }
                    if (o.LJ(str, LIZ2)) {
                        ListProtector.set(LJJIJIL, 0, Integer.valueOf(((Number) ListProtector.get(LJJIJIL, 0)).intValue() + 1));
                        if (o.LJ(textInfo.getBgColor(), "#00000000")) {
                            ListProtector.set(LJJIJIL, 1, Integer.valueOf(((Number) ListProtector.get(LJJIJIL, 1)).intValue() + 1));
                        } else {
                            ListProtector.set(LJJIJIL, 2, Integer.valueOf(((Number) ListProtector.get(LJJIJIL, 2)).intValue() + 1));
                        }
                    }
                }
            }
        }
        return LJJIJIL;
    }

    public static final void LJFF(Aweme aweme, String str, Integer num, Integer num2, C188727au c188727au) {
        int i;
        if (ABZ.LIZ() && aweme != null) {
            List LIZIZ = LIZIZ(aweme, aweme.getInteractStickerStructs());
            if (LIZLLL(aweme.getInteractStickerStructs()) || LIZJ(aweme.getInteractStickerStructs())) {
                String groupId = aweme.getGroupId();
                if (groupId == null) {
                    groupId = "";
                }
                c188727au.LJIIIZ("group_id", groupId);
                String authorUid = aweme.getAuthorUid();
                if (authorUid == null) {
                    authorUid = "";
                }
                c188727au.LJIIIZ("author_id", authorUid);
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("enter_from", str);
                c188727au.LJFF(num2, "is_title_translatable");
                c188727au.LJFF(num, "is_title_translated");
                if (((Number) ListProtector.get(LIZIZ, 0)).intValue() != 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                c188727au.LIZLLL(i, "has_text_sticker");
                c188727au.LIZLLL(((Number) ListProtector.get(LIZIZ, 0)).intValue(), "text_sticker_cnt");
                c188727au.LIZLLL(((Number) ListProtector.get(LIZIZ, 1)).intValue(), "transparent_text_sticker_cnt");
                c188727au.LIZLLL(((Number) ListProtector.get(LIZIZ, 2)).intValue(), "opaque_text_sticker_cnt");
                c188727au.LIZLLL(LJ(aweme) ? 1 : 0, "is_text_sticker_translatable");
                c188727au.LJFF(num, "is_text_sticker_translated");
                c188727au.LJIIIZ("text_sticker_source_lang", LIZ(aweme));
                c188727au.LJI("text_sticker_lang", C86678Y0c.LIZIZ().LJJIIZI());
            }
        }
    }
}
