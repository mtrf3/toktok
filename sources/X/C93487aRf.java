package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IMain;
import com.bytedance.effectcreatormobile.ckeapi.api.objectselect.PrefabData;

/* renamed from: X.aRf, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93487aRf {
    public static /* synthetic */ void LIZ(IMain iMain, FragmentManager fragmentManager, PrefabData prefabData, Long l, int i) {
        if ((i & 2) != 0) {
            prefabData = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        iMain.openPrefabPanel(fragmentManager, prefabData, l);
    }
}
