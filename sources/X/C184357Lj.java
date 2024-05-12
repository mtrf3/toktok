package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.fullpagev3.assem.FullPageParam;
import com.ss.android.ugc.aweme.model.PostModeDetailParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7Lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184357Lj {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(ViewGroup viewGroup, Context context, FullPageParam param) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Z9N z9n = Z9N.LIZIZ;
        Aweme aweme = param.getAweme();
        PostModeDetailParams postModeDetailParams = param.getPostModeDetailParams();
        String str2 = null;
        if (postModeDetailParams != null) {
            str = postModeDetailParams.eventType;
        } else {
            str = null;
        }
        PostModeDetailParams postModeDetailParams2 = param.getPostModeDetailParams();
        if (postModeDetailParams2 != null) {
            str2 = postModeDetailParams2.tabName;
        }
        z9n.LJJJJJL(viewGroup, context, aweme, str, str2, C2S6.LIZ(context).getSessionId());
    }
}
