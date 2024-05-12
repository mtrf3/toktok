package X;

import Y.IDCListenerS149S0200000_42;
import android.animation.Animator;
import android.view.View;
import android.widget.LinearLayout;
import com.ugc.effectcreator.layer.EffectLayerEditorFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.ack, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94174ack extends C93719aVP {
    public final /* synthetic */ IDCListenerS149S0200000_42 LJLIL;

    public C94174ack(IDCListenerS149S0200000_42 iDCListenerS149S0200000_42) {
        this.LJLIL = iDCListenerS149S0200000_42;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View findViewById = ((View) this.LJLIL.l1).findViewById(R.id.d2v);
        o.LJIIIIZZ(findViewById, "view.findViewById<View>(R.id.fade)");
        findViewById.setVisibility(0);
        LinearLayout linearLayout = ((EffectLayerEditorFragment) this.LJLIL.l0).LJLJI;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        } else {
            o.LJIJI("checkBoxContainer");
            throw null;
        }
    }
}
