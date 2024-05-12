package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.cast.framework.media.TracksChooserDialogFragment;

/* renamed from: X.Zel, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class ViewOnClickListenerC90455Zel implements View.OnClickListener {
    public final /* synthetic */ C90816Zka LJLIL;

    public ViewOnClickListenerC90455Zel(C90816Zka c90816Zka) {
        this.LJLIL = c90816Zka;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C90816Zka c90816Zka = this.LJLIL;
        C90639Zhj LJIILL = c90816Zka.LJIILL();
        if (LJIILL == null || !LJIILL.LJIIIZ() || !(c90816Zka.LIZ instanceof ActivityC45651qj)) {
            return;
        }
        TracksChooserDialogFragment tracksChooserDialogFragment = new TracksChooserDialogFragment();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) c90816Zka.LIZ;
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        supportFragmentManager.getClass();
        C1B3 c1b3 = new C1B3(supportFragmentManager);
        Fragment LJJJIL = activityC45651qj.getSupportFragmentManager().LJJJIL("TRACKS_CHOOSER_DIALOG_TAG");
        if (LJJJIL != null) {
            c1b3.LJJI(LJJJIL);
        }
        tracksChooserDialogFragment.show(c1b3, "TRACKS_CHOOSER_DIALOG_TAG");
    }
}
