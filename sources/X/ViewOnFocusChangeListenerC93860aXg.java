package X;

import android.view.View;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.ugc.effectcreator.layer.LayerImpl;

/* renamed from: X.aXg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnFocusChangeListenerC93860aXg implements View.OnFocusChangeListener {
    public final /* synthetic */ EffectLayerEditorFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public ViewOnFocusChangeListenerC93860aXg(EffectLayerEditorFragment effectLayerEditorFragment, int i) {
        this.LJLIL = effectLayerEditorFragment;
        this.LJLILLLLZI = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            LayerImpl LIZ = C93425aQf.LIZ();
            if (LIZ != null && !LIZ.getLayerDetailStatus()) {
                this.LJLIL.Al().LLIIIJ(false);
                this.LJLIL.Al().LLIFFJFJJ(this.LJLILLLLZI, false);
            }
            C93736aVg.LIZ(this.LJLIL.getContext());
        }
    }
}
