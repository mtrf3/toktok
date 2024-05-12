package X;

import android.widget.EditText;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;

/* renamed from: X.ahY, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94472ahY extends C94254ae2 {
    public final /* synthetic */ EffectLayerEditorFragment LIZ;
    public final /* synthetic */ EditText LIZIZ;

    public C94472ahY(EffectLayerEditorFragment effectLayerEditorFragment, EditText editText) {
        this.LIZ = effectLayerEditorFragment;
        this.LIZIZ = editText;
    }

    @Override // X.InterfaceC93791aWZ
    public final boolean LLZIL(boolean z, boolean z2, boolean z3) {
        if (z) {
            this.LIZIZ.clearFocus();
            ActivityC45651qj mo49getActivity = this.LIZ.mo49getActivity();
            if (mo49getActivity != null) {
                C93792aWa c93792aWa = this.LIZ.LJLL;
                if (c93792aWa != null) {
                    c93792aWa.LIZ(mo49getActivity);
                }
                this.LIZ.LJLL = null;
                return false;
            }
            return false;
        }
        return false;
    }
}
