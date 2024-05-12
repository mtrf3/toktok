package X;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M5O extends M5R {
    @Override // X.M5R
    public final OSZ<Boolean, String> LIZ(M5X m5x, HashMap<String, Object> appendedMap) {
        Bundle bundle;
        String str;
        M56 m56;
        String str2;
        C1AT c1at;
        o.LJIIIZ(appendedMap, "appendedMap");
        android.net.Uri uri = m5x.LJLILLLLZI;
        Activity activity = m5x.LJLIL;
        List<M56> deeplinkCommands = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeeplinkCommands();
        o.LJI(deeplinkCommands);
        Iterator<M56> it = deeplinkCommands.iterator();
        while (true) {
            bundle = null;
            str = "";
            if (it.hasNext()) {
                m56 = it.next();
                if (m56 != null) {
                    String scheme = uri.getScheme();
                    if (scheme == null) {
                        scheme = "";
                    }
                    String host = uri.getHost();
                    if (host == null) {
                        host = "";
                    }
                    String path = uri.getPath();
                    if (path == null) {
                        path = "";
                    }
                    if (m56.LJ(uri, scheme, host, path)) {
                        break;
                    }
                }
            } else {
                m56 = null;
                break;
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommandStrategy, handle link through Command -> ");
        if (m56 != null) {
            str2 = C16880lQ.LJLLJ(m56.getClass());
        } else {
            str2 = null;
        }
        LIZ.append(str2);
        X1D.LIZIZ(LIZ);
        M5R.LIZIZ(uri, m5x, appendedMap);
        Object obj = m5x.LJLJJL.get("from_token");
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        String str3 = (String) obj;
        Object obj2 = m5x.LJLJJL.get("is_from_notification");
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        if (m56 != null) {
            Object obj3 = m5x.LJLJJL.get("is_async_render_fact");
            o.LJII(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((Boolean) obj3).booleanValue()) {
                String host2 = uri.getHost();
                if (host2 == null) {
                    host2 = "";
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    str = path2;
                }
                Intent LIZIZ = m56.LIZIZ(activity, uri, host2, str, str3, booleanValue);
                if (LIZIZ != null) {
                    ComponentName component = LIZIZ.getComponent();
                    o.LJI(component);
                    if (TextUtils.equals(component.getClassName(), DetailFeedServiceImpl.LJIIJ().LJIIIZ().getName())) {
                        c1at = new C1AT(ActivityOptions.makeCustomAnimation(activity, R.anim.dl, R.anim.dl));
                    } else {
                        c1at = null;
                    }
                    if (!LIZIZ.getBooleanExtra("intercept_by_incentive", false)) {
                        if (c1at != null) {
                            bundle = c1at.LIZLLL();
                        }
                        C78598Ut0.LJIJJ(LIZIZ, activity);
                        activity.startActivity(LIZIZ, bundle);
                    }
                } else {
                    m56.LIZLLL(activity, uri, booleanValue);
                }
            }
            String LIZJ = m56.LIZJ(uri);
            o.LJIIIZ(LIZJ, "<set-?>");
            this.LIZ = LIZJ;
            this.LIZIZ = true;
            C56235M5f.LJI = LIZJ;
        }
        C56235M5f.LIZLLL(LiveNetAdaptiveHurryTimeSetting.DEFAULT, m5x.LJLILLLLZI, "independent_transfer");
        activity.finish();
        return new OSZ<>(Boolean.valueOf(this.LIZIZ), this.LIZ);
    }
}
