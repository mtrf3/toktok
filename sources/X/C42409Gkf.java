package X;

import Y.IDLCallbackS106S0200000_7;
import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gkf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42409Gkf {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, String str, int i, String str2) {
        android.net.Uri parse = UriProtector.parse(str);
        o.LJIIIIZZ(parse, "parse(schema)");
        String queryParameter = UriProtector.getQueryParameter(parse, "music_id");
        String queryParameter2 = UriProtector.getQueryParameter(parse, "share_id");
        String queryParameter3 = UriProtector.getQueryParameter(parse, "shoot_way");
        if (queryParameter3 == null) {
            queryParameter3 = "share_sound";
        }
        if ((i == R.id.h4i || i == R.id.lvf) && context != null) {
            o.LJI(queryParameter);
            o.LJI(queryParameter2);
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("shoot_way", queryParameter3);
            c188727au.LJIIIZ("open_platform_share_id", queryParameter2);
            c188727au.LJIIIZ("channel", str2);
            FMX.LJIIL("shoot", c188727au.LIZ);
            RecordConfig.Builder builder = new RecordConfig.Builder();
            builder.shootWay(queryParameter3);
            builder.musicId(queryParameter);
            builder.shareId(queryParameter2);
            builder.clientId(str2);
            AVExternalServiceImpl.LIZ().asyncService(context, queryParameter3, new IDLCallbackS106S0200000_7(context, builder, 9));
        }
    }
}
