package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.definition.LiveDefinitionSelectionDialog;

/* loaded from: classes6.dex */
public final class B9F {
    public static void LIZ(FragmentManager fragmentManager, boolean z) {
        LiveDefinitionSelectionDialog liveDefinitionSelectionDialog = new LiveDefinitionSelectionDialog();
        Bundle bundle = new Bundle();
        bundle.putBoolean("key_is_preview", z);
        liveDefinitionSelectionDialog.setArguments(bundle);
        liveDefinitionSelectionDialog.show(fragmentManager, "LiveDefinitionSelectionDialog");
    }
}
