package X;

import android.view.View;
import com.ss.android.ugc.aweme.placediscovery.ui.INearbyCategoryTabAbility;

/* renamed from: X.LXa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC54410LXa implements View.OnClickListener {
    public static final ViewOnClickListenerC54410LXa LJLIL = new ViewOnClickListenerC54410LXa();

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        INearbyCategoryTabAbility iNearbyCategoryTabAbility;
        ActivityC45651qj LJ = C1DG.LJ(view, "it.context");
        if (LJ != null && (iNearbyCategoryTabAbility = (INearbyCategoryTabAbility) C55096Ljo.LIZ(C55230Lly.LIZLLL(LJ, null), INearbyCategoryTabAbility.class, null)) != null) {
            iNearbyCategoryTabAbility.vG();
        }
    }
}
