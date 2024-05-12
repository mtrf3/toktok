package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.CreativeInfo;

/* renamed from: X.GWc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41646GWc {
    public static void LIZ(Bundle bundle, Activity activity) {
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.putExtra("shoot_way", "story");
        if (!intent.hasExtra("creation_id")) {
            C77412UZs.LJJIJIL(intent, new CreativeInfo(null, 0, null, 7, null));
        }
        I9T.LJFF(null);
        C41658GWo.LIZLLL().LJFF();
        if (HZV.LIZ().LJIIL(activity, intent)) {
            HZV.LIZ().LJIIIIZZ(activity, intent);
        } else {
            HZV.LIZ().LJIJJ(activity, intent);
            HZV.LIZ().LJJI(activity, intent);
        }
    }
}
