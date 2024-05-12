package X;

import android.animation.Animator;
import android.view.View;
import android.widget.LinearLayout;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.acl, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94175acl extends C93719aVP {
    public final /* synthetic */ EffectLayerEditorFragment LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View findViewById = this.LJLILLLLZI.findViewById(R.id.d2v);
        o.LJIIIIZZ(findViewById, "view.findViewById<View>(R.id.fade)");
        findViewById.setVisibility(0);
        LinearLayout linearLayout = this.LJLIL.LJLJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        } else {
            o.LJIJI("checkBoxContainer");
            throw null;
        }
    }

    public C94175acl(EffectLayerEditorFragment effectLayerEditorFragment, View view) {
        this.LJLIL = effectLayerEditorFragment;
        this.LJLILLLLZI = view;
    }
}
