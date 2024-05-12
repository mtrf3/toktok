package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.S6n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71557S6n {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String authorId, boolean z) {
        String str;
        o.LJIIIZ(authorId, "authorId");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        return UPJ.LIZIZ("aweme://ec/billboard_effect_v2?author_id=", authorId, "&is_new_user=", str, "&previous_page=live_effect");
    }
}
