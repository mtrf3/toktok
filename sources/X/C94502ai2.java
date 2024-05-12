package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.ai2, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94502ai2 extends AbstractC94197ad7 {
    public final /* synthetic */ MainFragment LIZ;

    @Override // X.InterfaceC93654aUM
    public final void LIZJ() {
        LifecycleOwner viewLifecycleOwner = this.LIZ.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94922aoo(this, null), 3);
    }

    public C94502ai2(MainFragment mainFragment) {
        this.LIZ = mainFragment;
    }
}
