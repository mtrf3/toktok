package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ACj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25845ACj {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            return "1";
        }
        return CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZ(String str, Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str2;
        String str3;
        Video video;
        String authorUid;
        CaptionItemModel LJIIIIZZ;
        String LJJIIZI = Y01.LIZIZ.LJJIIZI();
        HashMap hashMap = new HashMap();
        String str4 = "";
        if (str == null) {
            str = "";
        }
        hashMap.put("enter_from", str);
        hashMap.put("use_transl", String.valueOf(C86670Xzu.LJIJI(aweme)));
        hashMap.put("subtitle_type", C86670Xzu.LJIIJJI(aweme));
        Integer num = null;
        if (aweme == null || (LJIIIIZZ = C86670Xzu.LJIIIIZZ(aweme)) == null || (str2 = LJIIIIZZ.getLanguageName()) == null) {
            str2 = "";
        }
        hashMap.put("subtitle_source_lang", str2);
        if (aweme == null || (str3 = aweme.getGroupId()) == null) {
            str3 = "";
        }
        hashMap.put("group_id", str3);
        if (aweme != null && (authorUid = aweme.getAuthorUid()) != null) {
            str4 = authorUid;
        }
        hashMap.put("author_id", str4);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            num = Integer.valueOf(video.getDuration());
        }
        hashMap.put("item_duration", String.valueOf(num));
        hashMap.put("translation_lang", LJJIIZI);
        hashMap.put("is_owner", LIZIZ(Boolean.valueOf(z2)));
        hashMap.put("is_landscape_screen", LIZIZ(Boolean.valueOf(z)));
        hashMap.put("is_supported_language", LIZIZ(Boolean.valueOf(z3)));
        hashMap.put("is_ab_enable", LIZIZ(Boolean.valueOf(z5)));
        hashMap.put("ab_value", String.valueOf(C25840ACe.LIZIZ));
        hashMap.put("is_low_storage_enable", LIZIZ(Boolean.valueOf(z6)));
        hashMap.put("is_enter", LIZIZ(Boolean.valueOf(z4)));
        FMX.LJIIL("ttlingo_click_subtitle", hashMap);
    }
}
