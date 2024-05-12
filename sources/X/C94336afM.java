package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import kotlin.jvm.internal.o;

/* renamed from: X.afM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94336afM implements InterfaceC93473aRR {
    public final /* synthetic */ MainFragment LIZ;

    @Override // X.InterfaceC93473aRR
    public final void LIZ() {
        this.LIZ.LJLLLL.LIZ = false;
        CKEffectEditorContext.LJIILJJIL(null);
        this.LIZ.Ll().jv0();
        LifecycleOwner viewLifecycleOwner = this.LIZ.getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "viewLifecycleOwner");
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new C94946apC(this, null), 3);
    }

    @Override // X.InterfaceC93473aRR
    public final void onCancel() {
        this.LIZ.requireActivity().finish();
    }

    public C94336afM(MainFragment mainFragment) {
        this.LIZ = mainFragment;
    }
}
