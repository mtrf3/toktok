package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.Gson;
import com.google.gson.internal.m;
import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import com.ss.android.ugc.aweme.discover.abtest.SearchSecurityControlValue;
import java.util.HashMap;

/* renamed from: X.JpZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50357JpZ extends AbstractC65781Prl implements InterfaceC65784Pro<SearchSecurityControlValue> {
    public static final C50357JpZ LJLIL = new C50357JpZ();

    public C50357JpZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SearchSecurityControlValue invoke() {
        SearchSecurityControlValue searchSecurityControlValue;
        SearchSecurityControlConfig.LIZ.getClass();
        try {
            HashMap hashMap = (HashMap) SettingsManager.LIZLLL().LJIIIIZZ("tiktok_search", HashMap.class, SearchSecurityControlConfig.LIZIZ);
            if (hashMap != null && hashMap.containsKey("tiktok_search_security_control")) {
                m mVar = (m) hashMap.get("tiktok_search_security_control");
                Gson gson = SearchSecurityControlConfig.LIZJ;
                searchSecurityControlValue = (SearchSecurityControlValue) gson.LJII(gson.LJIILL(mVar), new C50360Jpc().getType());
                if (searchSecurityControlValue == null) {
                    searchSecurityControlValue = new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 32767, null);
                }
            } else {
                searchSecurityControlValue = new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 32767, null);
            }
            return searchSecurityControlValue;
        } catch (Throwable unused) {
            return new SearchSecurityControlValue(false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, 32767, null);
        }
    }
}
