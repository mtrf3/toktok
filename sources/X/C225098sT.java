package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.8sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225098sT {
    public static void LIZ(VideoItemParams item, boolean z) {
        String str;
        o.LJIIIZ(item, "item");
        Aweme aweme = item.getAweme();
        HashMap hashMap = new HashMap();
        String str2 = item.mEventType;
        if (str2 == null) {
            str2 = "'";
        }
        hashMap.put("enter_from", str2);
        hashMap.put("music_id", aweme.getMusic().getMid());
        hashMap.put("group_id", aweme.getAid());
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("music_new_show", str);
        hashMap.put("location", "name");
        FMX.LJIIL("new_release_show", hashMap);
    }
}
