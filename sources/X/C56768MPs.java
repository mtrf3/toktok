package X;

import Y.AObserverS73S0200000_9;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import kotlin.jvm.internal.o;

/* renamed from: X.MPs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56768MPs extends C56906MVa {
    public final Fragment LJLIL;
    public final AObserverS73S0200000_9 LJLILLLLZI;

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onAttached() {
        super.onAttached();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        o.LJII(interfaceC56771MPv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        NotificationVM notificationVM = (NotificationVM) interfaceC56771MPv;
        notificationVM.hv0().LJII().observe(this.LJLIL, this.LJLILLLLZI);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        ((C73305Spp) view).setVisibility(0);
        View view2 = this.itemView;
        o.LJII(view2, "null cannot be cast to non-null type com.bytedance.tux.status.TuxStatusView");
        ((C73305Spp) view2).LJFF();
        if (!notificationVM.hv0().LJIIIZ()) {
            notificationVM.hv0().LJIIJJI();
        }
    }

    @Override // X.MVV, X.ViewOnClickListenerC56908MVc
    public final void onDetached() {
        super.onDetached();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        o.LJII(interfaceC56771MPv, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vm.NotificationVM");
        ((NotificationVM) interfaceC56771MPv).hv0().LJII().removeObserver(this.LJLILLLLZI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56768MPs(View view, Fragment curFragment) {
        super(view);
        o.LJIIIZ(curFragment, "curFragment");
        this.LJLIL = curFragment;
        this.LJLILLLLZI = new AObserverS73S0200000_9(this, view, 4);
    }
}
