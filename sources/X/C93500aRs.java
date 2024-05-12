package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.aRs, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93500aRs {
    public static Bundle LIZ(String lokiPanelKey, String typeName, String category, String effectIdentity, boolean z, String effectPath, String capabilities) {
        o.LJIIIZ(lokiPanelKey, "lokiPanelKey");
        o.LJIIIZ(typeName, "typeName");
        o.LJIIIZ(category, "category");
        o.LJIIIZ(effectIdentity, "effectIdentity");
        o.LJIIIZ(effectPath, "effectPath");
        o.LJIIIZ(capabilities, "capabilities");
        Bundle bundle = new Bundle();
        bundle.putString("page", "assets_select");
        bundle.putString("loki_panel_key", lokiPanelKey);
        bundle.putString("type_name", typeName);
        bundle.putString("key_effect_category", category);
        bundle.putString("key_effect_identity", effectIdentity);
        bundle.putString("key_effect_path", effectPath);
        bundle.putBoolean("sub_page_style", z);
        bundle.putString("capabilities_key", capabilities);
        return bundle;
    }
}
