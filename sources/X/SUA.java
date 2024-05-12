package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SUA extends AbstractC65781Prl implements InterfaceC65784Pro<TTMStoreLink> {
    public static final SUA LJLIL = new SUA();

    public SUA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TTMStoreLink invoke() {
        String store = YBK.LIZ().links.getRessoStoreLink();
        String onelink = YBK.LIZ().links.getDownloadLink();
        SV7.LIZ.getClass();
        o.LJIIIZ(store, "store");
        o.LJIIIZ(onelink, "onelink");
        android.net.Uri parse = UriProtector.parse(onelink);
        HashMap hashMap = new HashMap();
        for (String name : UriProtector.getQueryParameterNames(parse)) {
            String queryParameter = UriProtector.getQueryParameter(parse, name);
            if (queryParameter == null) {
                queryParameter = "";
            }
            o.LJIIIIZZ(name, "name");
            hashMap.put(name, queryParameter);
        }
        if (SV7.LIZLLL().length() > 0) {
            hashMap.put("advertising_id", SV7.LIZLLL());
        }
        hashMap.put("app_id", "1811");
        hashMap.put("app_name", "resso");
        hashMap.put("af_xp", "social");
        hashMap.put("is_retargeting", "true");
        String json = GsonProtectorUtils.toJson(SVF.LIZ, hashMap);
        o.LJIIIIZZ(json, "ActionReporter.gson.toJson(hashMap)");
        return new TTMStoreLink(store, json);
    }
}
