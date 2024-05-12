package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.core.ui.SkeletonSharePanelFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.Ofb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class DialogInterfaceOnDismissListenerC62479Ofb implements DialogInterface.OnDismissListener {
    public final /* synthetic */ SkeletonSharePanelFragment LJLIL;
    public final /* synthetic */ C62387Oe7 LJLILLLLZI;
    public final /* synthetic */ ActivityC45651qj LJLJI;

    public DialogInterfaceOnDismissListenerC62479Ofb(SkeletonSharePanelFragment skeletonSharePanelFragment, C62387Oe7 c62387Oe7, ActivityC45651qj activityC45651qj) {
        this.LJLIL = skeletonSharePanelFragment;
        this.LJLILLLLZI = c62387Oe7;
        this.LJLJI = activityC45651qj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface it) {
        C62387Oe7 c62387Oe7 = this.LJLILLLLZI;
        InterfaceC62474OfW interfaceC62474OfW = c62387Oe7.LJIILIIL;
        if (interfaceC62474OfW != null) {
            interfaceC62474OfW.LJ(this.LJLJI, c62387Oe7.LJIIJ);
        }
        C62468OfQ.LIZIZ(this.LJLIL.LJLILLLLZI, this.LJLILLLLZI);
        InterfaceC62533OgT interfaceC62533OgT = C62494Ofq.LJFF;
        if (interfaceC62533OgT != null) {
            interfaceC62533OgT.LIZJ();
        }
        SkeletonSharePanelFragment skeletonSharePanelFragment = this.LJLIL;
        o.LJIIIIZZ(it, "it");
        AST LJIIIIZZ = ASQ.LJIIIIZZ(it);
        BaseSharePackage baseSharePackage = skeletonSharePanelFragment.LJLJJI;
        if (baseSharePackage != null) {
            C62468OfQ.LJI(LJIIIIZZ, baseSharePackage);
        } else {
            o.LJIJI("sharePackage");
            throw null;
        }
    }
}
