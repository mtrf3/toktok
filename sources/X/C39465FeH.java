package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FeH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39465FeH extends AbstractC39461FeD {
    public final C31926Cfy LIZJ;
    public final /* synthetic */ C39456Fe8 LIZLLL;

    @Override // X.AbstractC39461FeD
    public final List<EnumC37847EtH> LIZ() {
        return C47261Igj.LJJIJ(EnumC37847EtH.ALL);
    }

    public C39465FeH(C39456Fe8 c39456Fe8, C31926Cfy c31926Cfy) {
        this.LIZLLL = c39456Fe8;
        this.LIZJ = c31926Cfy;
    }

    @Override // X.AbstractC39461FeD
    public final boolean LIZIZ(Context context, String schema, java.util.Map extraInfo) {
        o.LJIIIZ(schema, "schema");
        o.LJIIIZ(extraInfo, "extraInfo");
        if (!o.LJ(extraInfo.get("useSysBrowser"), Boolean.TRUE) || TextUtils.isEmpty(schema)) {
            return false;
        }
        String lowerCase = schema.toLowerCase();
        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase()");
        if (ujb.o.LJJJLIIL(lowerCase, "http://", false) || ujb.o.LJJJLIIL(lowerCase, "https://", false)) {
            Context context2 = (Context) FCS.LIZIZ(this.LIZJ, Context.class);
            if (context2 != null) {
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(schema));
                intent.addFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                ResolveInfo resolveActivity = context2.getPackageManager().resolveActivity(intent, 65536);
                if (resolveActivity != null) {
                    ActivityInfo activityInfo = resolveActivity.activityInfo;
                    intent.setClassName(activityInfo.packageName, activityInfo.name);
                    C16880lQ.LIZJ(context2, intent);
                    return true;
                }
            }
            JSONObject LIZJ = C65232Piu.LIZJ("type", "webview");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", schema);
            LIZJ.put("args", jSONObject);
            C38282F0s.LIZIZ(context2, LIZJ);
            return true;
        }
        if (context == null) {
            return false;
        }
        boolean openAdOpenUrl = this.LIZLLL.LIZ().openAdOpenUrl(context, schema, false);
        if (!openAdOpenUrl) {
            return openAdOpenUrl;
        }
        C59127NIl LIZ = C59128NIm.LIZ();
        LIZ.LIZ = "draw_ad";
        LIZ.LIZIZ = "open_url_app";
        LIZ.LJIIIZ(context);
        C58704N2e.LJ("draw_ad", "open_url_app", CardStruct.IStatusCode.DEFAULT, "", CardStruct.IStatusCode.DEFAULT).LJII();
        this.LIZLLL.LIZ().pendingDeepLinkLog(new AqS172S0100000_6(context, 90));
        return openAdOpenUrl;
    }
}
