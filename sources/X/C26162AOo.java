package X;

import androidx.fragment.app.DialogFragment;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("upsell_2sv_hva_inbox")
/* renamed from: X.AOo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26162AOo extends AbstractC56325M8r<DialogFragment> {
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

    public C26162AOo(ActivityC45651qj activity, C85057XZt popupData) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(popupData, "popupData");
        this.LJLIL = activity;
        this.LJLILLLLZI = popupData;
        this.LJLJI = 200;
    }
}
