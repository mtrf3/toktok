package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HT9 extends M56 {
    @Override // X.M56
    public final String LIZJ(android.net.Uri uri) {
        o.LJIIIZ(uri, "uri");
        return "prop_detail";
    }

    @Override // X.M56
    public final boolean LJFF(String str, String str2) {
        return SC5.LIZIZ(str, "host", str2, "path", str, "stickers");
    }

    @Override // X.M56
    public final Intent LIZ(Activity activity, android.net.Uri uri, String host, String path, String fromTokenType, boolean z) {
        boolean z2;
        List list;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(fromTokenType, "fromTokenType");
        if (!TextUtils.isEmpty(path) && ujb.o.LJJJLIIL(path, "/detail/", false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        ArrayList arrayList = null;
        if (!z2) {
            return null;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment)) {
            o.LJI(lastPathSegment);
            List<String> split = new OJD(",").split(lastPathSegment, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C61878OQg.INSTANCE;
            String[] strArr = (String[]) list.toArray(new String[0]);
            arrayList = new ArrayList(Arrays.asList(Arrays.copyOf(strArr, strArr.length)));
        }
        IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
        if (!createIMainServicebyMonsterPlugin.isAppHot()) {
            C16880lQ.LIZIZ(activity, createIMainServicebyMonsterPlugin.getMainActivityIntent(activity));
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(activity, "//stickers/detail");
        buildRoute.withParam("extra_stickers", arrayList);
        Intent buildIntent = buildRoute.buildIntent();
        M62.LIZIZ.LIZIZ(uri, "prop_detail", z);
        return buildIntent;
    }
}
