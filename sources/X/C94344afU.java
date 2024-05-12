package X;

import android.view.View;
import com.bytedance.effectcreatormobile.modelselect.ModelSelectFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.afU, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94344afU implements InterfaceC94004aa0 {
    public final /* synthetic */ ModelSelectFragment LIZ;

    public C94344afU(ModelSelectFragment modelSelectFragment) {
        this.LIZ = modelSelectFragment;
    }

    @Override // X.InterfaceC94004aa0
    public final void LIZ(View view) {
        view.setSelected(false);
    }

    @Override // X.InterfaceC94004aa0
    public final void LIZIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        view.setSelected(true);
        this.LIZ.xl().kv0(i);
    }
}
