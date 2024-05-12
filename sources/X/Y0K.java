package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0K {
    public static final void LIZ(C188727au c188727au, Aweme aweme, IQE translateStatus, boolean z) {
        o.LJIIIZ(translateStatus, "translateStatus");
        if (aweme == null) {
            return;
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        int i = 0;
        if (interactStickerStructs != null) {
            for (InteractStickerStruct interactStickerStruct : interactStickerStructs) {
                if (interactStickerStruct.getType() == 20) {
                    if (interactStickerStruct != null) {
                        c188727au.LIZLLL(1, "is_burned_in");
                        c188727au.LJI("subtitle_source_lang", Y02.LIZ(aweme));
                        c188727au.LIZLLL(1, "has_subtitle");
                        if (!z) {
                            c188727au.LJI("subtitle_type", "sticker_creator");
                            c188727au.LJI("target_lang", C86670Xzu.LJIJ().LJJIIZI());
                            if (translateStatus == IQE.TRANSLATED) {
                                i = 1;
                            }
                            c188727au.LIZLLL(i, "use_transl");
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }
}
