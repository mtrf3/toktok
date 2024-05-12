package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.nows.player.util.PlayerPositionStore;

/* renamed from: X.7o6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196907o6 {
    public static PlayerPositionStore LIZ(Fragment fragment) {
        if (fragment == null || fragment.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return null;
        }
        return (PlayerPositionStore) ViewModelProviders.of(fragment).get(PlayerPositionStore.class);
    }
}
