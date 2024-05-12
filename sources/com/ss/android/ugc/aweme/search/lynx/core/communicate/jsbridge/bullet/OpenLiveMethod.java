package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet;

import X.C50345JpN;
import X.EnumC38014Evy;
import X.F3T;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class OpenLiveMethod extends BaseBridgeMethod {
    public final String LJLIL;
    public final C50345JpN LJLILLLLZI;
    public EnumC38014Evy LJLJI;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.AbstractC37121EhZ, X.InterfaceC38217EzF
    public final EnumC38014Evy getAccess() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC38217EzF
    public final String getName() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenLiveMethod(F3T contextProviderFactory) {
        super(contextProviderFactory);
        o.LJIIIZ(contextProviderFactory, "contextProviderFactory");
        this.LJLIL = "open_live";
        this.LJLILLLLZI = new C50345JpN(contextProviderFactory, "open_live");
        this.LJLJI = EnumC38014Evy.PRIVATE;
    }

    public final Map<String, String> LIZJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            o.LJIIIIZZ(next, "next");
            String string = JSONObjectProtectorUtils.getString(jSONObject, next);
            o.LJIIIIZZ(string, "jsonObject.getString(next)");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    @Override // X.AbstractC37121EhZ
    public final void setAccess(EnumC38014Evy enumC38014Evy) {
        o.LJIIIZ(enumC38014Evy, "<set-?>");
        this.LJLJI = enumC38014Evy;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x02b6 A[Catch: Exception -> 0x0303, TryCatch #2 {Exception -> 0x0303, blocks: (B:56:0x00cb, B:58:0x00de, B:59:0x00e5, B:61:0x00f4, B:63:0x010c, B:64:0x00fa, B:67:0x0116, B:69:0x0125, B:70:0x0136, B:72:0x013a, B:75:0x015e, B:79:0x016b, B:81:0x0171, B:83:0x0180, B:84:0x0191, B:86:0x0195, B:88:0x01b7, B:91:0x01c0, B:93:0x01c6, B:95:0x01cc, B:97:0x01d6, B:100:0x01df, B:102:0x0208, B:105:0x0217, B:108:0x0222, B:111:0x022d, B:114:0x0238, B:117:0x0243, B:120:0x024e, B:123:0x0259, B:126:0x0261, B:128:0x0287, B:130:0x028f, B:132:0x0293, B:133:0x0299, B:135:0x029d, B:138:0x02aa, B:141:0x02b2, B:143:0x02b6, B:144:0x02ba, B:146:0x02c1, B:148:0x02c7, B:150:0x02cb, B:152:0x02d1, B:155:0x02d9, B:157:0x02df, B:159:0x02e5, B:161:0x02ae, B:164:0x02e8, B:172:0x020b), top: B:55:0x00cb }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02bd  */
    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(org.json.JSONObject r20, X.InterfaceC37146Ehy r21) {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenLiveMethod.handle(org.json.JSONObject, X.Ehy):void");
    }
}
