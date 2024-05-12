package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6QE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6QE {
    public final Context LIZ;
    public final C1NS<C6QB> LIZIZ;
    public final LifecycleOwner LIZJ;
    public InterfaceC82683Wch LIZLLL;
    public C6QG LJ;

    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = this.LIZLLL;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
    }

    public C6QE(Context context, C1NS<C6QB> stateContainer, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(stateContainer, "stateContainer");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = context;
        this.LIZIZ = stateContainer;
        this.LIZJ = lifecycleOwner;
        stateContainer.LIZ(new TBT() { // from class: X.6QF
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C6QB) obj).LJLILLLLZI);
            }
        }).LJIIIIZZ(lifecycleOwner, Lifecycle.State.STARTED, new AqS168S0100000_2(this, 557));
    }
}
