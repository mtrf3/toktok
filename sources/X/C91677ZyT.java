package X;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavControllerViewModel;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.ZyT, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91677ZyT {
    public static /* synthetic */ NavBackStackEntry LIZIZ(Context context, C91720ZzA c91720ZzA, Bundle bundle, Lifecycle.State state, NavControllerViewModel navControllerViewModel) {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        return LIZ(context, c91720ZzA, bundle, state, navControllerViewModel, uuid, null);
    }

    public static NavBackStackEntry LIZ(Context context, C91720ZzA destination, Bundle bundle, Lifecycle.State hostLifecycleState, InterfaceC91691Zyh interfaceC91691Zyh, String id, Bundle bundle2) {
        o.LJIIIZ(destination, "destination");
        o.LJIIIZ(hostLifecycleState, "hostLifecycleState");
        o.LJIIIZ(id, "id");
        return new NavBackStackEntry(context, destination, bundle, hostLifecycleState, interfaceC91691Zyh, id, bundle2);
    }
}
