package X;

import android.os.Bundle;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;

/* renamed from: X.aS1, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93509aS1 {
    public static Bundle LIZ(PrefabData prefabData, Long l, int i) {
        if ((i & 1) != 0) {
            prefabData = null;
        }
        if ((i & 2) != 0) {
            l = null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("page", "prefab_panel");
        bundle.putParcelable("prefab_data", prefabData);
        if (l != null) {
            l.longValue();
            bundle.putLong("feature_id", l.longValue());
        }
        return bundle;
    }
}
