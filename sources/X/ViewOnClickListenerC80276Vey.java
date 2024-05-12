package X;

import android.view.View;

/* renamed from: X.Vey, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnClickListenerC80276Vey implements View.OnClickListener {
    public final /* synthetic */ C80274Vew LJLIL;

    public ViewOnClickListenerC80276Vey(C80274Vew c80274Vew) {
        this.LJLIL = c80274Vew;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C281618q itemData = ((C80272Veu) view).getItemData();
        C80274Vew c80274Vew = this.LJLIL;
        if (!c80274Vew.LLFII.LJIILLIIL(itemData, c80274Vew.LLFFF, 0)) {
            itemData.setChecked(true);
        }
    }
}
