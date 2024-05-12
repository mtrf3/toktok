package X;

import android.view.View;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;

/* renamed from: X.Lb1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54551Lb1 implements View.OnClickListener {
    public static final ViewOnClickListenerC54551Lb1 LJLIL = new ViewOnClickListenerC54551Lb1();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        INearbyCategoryTabAbility iNearbyCategoryTabAbility;
        ActivityC45651qj LJ = C1DG.LJ(view, "it.context");
        if (LJ != null && (iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJ, null), INearbyCategoryTabAbility.class, null)) != null) {
            iNearbyCategoryTabAbility.ia();
        }
    }
}
