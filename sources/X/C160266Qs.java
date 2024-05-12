package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.6Qs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C160266Qs {
    public final Context LIZ;
    public final LifecycleOwner LIZIZ;

    public C160266Qs(Context context, C1NS<C160296Qv> stateContainer, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stateContainer, "stateContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        stateContainer.LIZ(new TBT() { // from class: X.6Qw
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C160296Qv) obj).LJLIL;
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS167S0100000_1(this, 425));
    }
}
