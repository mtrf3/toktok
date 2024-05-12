package X;

import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("upsell_2sv_hva_profile")
/* renamed from: X.AOn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26161AOn extends AbstractC56325M8r<DialogFragment> {
    public final ActivityC45651qj LJLIL;
    public final C85057XZt LJLILLLLZI;
    public final int LJLJI;

    @Override // X.InterfaceC55641Lsb
    public final C54082LKk getPopupContext() {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        return C54081LKj.LIZ(activityC45651qj, activityC45651qj);
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJI;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        HG3.LJIIL();
        return HG3.LJLJL.LJIIL().showUpsell2svCommonPopUp(this.LJLIL, this.LJLILLLLZI);
    }

    public C26161AOn(ActivityC45651qj activity, C85057XZt c85057XZt) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = c85057XZt;
        this.LJLJI = LiveCoverMinSizeSetting.DEFAULT;
    }
}
