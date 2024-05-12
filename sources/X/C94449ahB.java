package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.objectselect.prefab.PrefabPanelFragment;
import com.bytedance.effectcreatormobile.objectselect.prefab.edit.PrefabEditFragment;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.ahB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94449ahB extends AbstractC94345afV<Object> {
    public C94449ahB(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override // X.AbstractC94345afV
    public final BottomDrawerFragment LJ(Bundle bundle) {
        String string = bundle.getString("page");
        if (string == null) {
            string = "";
        }
        int hashCode = string.hashCode();
        Object obj = null;
        if (hashCode != -2024028187) {
            if (hashCode != 1689709449 || !string.equals("prefab_panel")) {
                return null;
            }
            Parcelable parcelable = bundle.getParcelable("prefab_data");
            Object LLJJIII = C16880lQ.LLJJIII(bundle, "feature_id");
            if (LLJJIII instanceof Long) {
                obj = LLJJIII;
            }
            Long l = (Long) obj;
            if (parcelable != null) {
                PrefabPanelFragment prefabPanelFragment = new PrefabPanelFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("prefab_data", parcelable);
                prefabPanelFragment.setArguments(bundle2);
                return prefabPanelFragment;
            }
            o.LJI(l);
            long longValue = l.longValue();
            PrefabPanelFragment prefabPanelFragment2 = new PrefabPanelFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putLong("feature_id", longValue);
            prefabPanelFragment2.setArguments(bundle3);
            return prefabPanelFragment2;
        }
        if (!string.equals("prefab_edit")) {
            return null;
        }
        return new PrefabEditFragment();
    }
}
