package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.objectselect.AssetsFragment;
import com.bytedance.effectcreatormobile.objectselect.EffectSelectFragment;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;

/* renamed from: X.ahH, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94455ahH extends AbstractC94345afV<Object> {
    public C94455ahH(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override // X.AbstractC94345afV
    public final BottomDrawerFragment LJ(Bundle bundle) {
        String string = bundle.getString("page");
        String str = "";
        if (string == null) {
            string = "";
        }
        int hashCode = string.hashCode();
        if (hashCode != -1300184214) {
            if (hashCode == 1556174136 && string.equals("assets_select")) {
                return new AssetsFragment();
            }
        } else if (string.equals("effect_select")) {
            String string2 = bundle.getString("enter_from_key");
            if (string2 != null) {
                str = string2;
            }
            EffectSelectFragment effectSelectFragment = new EffectSelectFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("enter_from_key", str);
            effectSelectFragment.setArguments(bundle2);
            return effectSelectFragment;
        }
        String string3 = bundle.getString("enter_from_key");
        if (string3 != null) {
            str = string3;
        }
        EffectSelectFragment effectSelectFragment2 = new EffectSelectFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString("enter_from_key", str);
        effectSelectFragment2.setArguments(bundle3);
        return effectSelectFragment2;
    }
}
