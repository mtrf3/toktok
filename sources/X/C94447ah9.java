package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment;
import com.bytedance.effectcreatormobile.behaviour.view.preview.BehaviourPreviewFragment;
import com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment;

/* renamed from: X.ah9, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94447ah9 extends AbstractC94345afV<String> {
    public C94447ah9(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override // X.AbstractC94345afV
    public final BottomDrawerFragment LJ(Bundle bundle) {
        String string = bundle.getString("page");
        if (string == null || string.hashCode() != -2061140916 || !string.equals("behaviour_edit")) {
            return new BehaviourPreviewFragment();
        }
        return new BehaviourEditFragment();
    }
}
