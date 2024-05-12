package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creatortools.InboxCreatorApi;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class AE3 {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(AE5.LJLIL);

    public static void LIZ(Context context, boolean z, AE6 ae6) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", Integer.valueOf(z ? 1 : 0));
        InboxCreatorApi.LIZ.getClass();
        AE4.LIZIZ.updateInboxCreatorSetting(hashMap).enqueue(new AE2(ae6, context));
    }
}
