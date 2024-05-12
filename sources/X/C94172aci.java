package X;

import android.animation.Animator;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.ugc.effectcreator.layer.LayerImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aci, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94172aci extends C93719aVP {
    public final /* synthetic */ EffectLayerEditorFragment LJLIL;

    public C94172aci(EffectLayerEditorFragment effectLayerEditorFragment) {
        this.LJLIL = effectLayerEditorFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FragmentManager fragmentManager = this.LJLIL.getFragmentManager();
        if (fragmentManager != null) {
            C1B3 c1b3 = new C1B3(fragmentManager);
            c1b3.LJJI(this.LJLIL);
            c1b3.LJI();
        }
    }

    @Override // X.C93719aVP, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View findViewById;
        LayerImpl LIZ = C93425aQf.LIZ();
        if (LIZ != null) {
            LIZ.updatePageStatus(EnumC93712aVI.GONE);
        }
        View view = this.LJLIL.getView();
        if (view != null && (findViewById = view.findViewById(R.id.d2v)) != null) {
            findViewById.setVisibility(8);
        }
    }
}
