package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.VaT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79997VaT {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, List list) {
        java.util.Map<String, List<String>> hashMap;
        try {
            hashMap = (java.util.Map) GsonProtectorUtils.fromJson(C09650Zl.LIZJ, str, new TypeToken<java.util.Map<String, ? extends List<? extends String>>>() { // from class: X.2Su
            }.getType());
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
        } catch (s unused) {
            hashMap = new HashMap<>();
        }
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames((String[]) list.toArray(new String[0]), hashMap, new C283719l());
    }
}
