package X;

import Y.ACListenerS24S0100000_4;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailVideoListAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.A3r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25619A3r extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C25621A3t, C76800UCe> {
    public final /* synthetic */ TuxTextView LJLIL;
    public final /* synthetic */ TuxIconView LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ PaidContentCollectionDetailVideoListAssem LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25619A3r(TuxTextView tuxTextView, TuxIconView tuxIconView, View view, PaidContentCollectionDetailVideoListAssem paidContentCollectionDetailVideoListAssem) {
        super(2);
        this.LJLIL = tuxTextView;
        this.LJLILLLLZI = tuxIconView;
        this.LJLJI = view;
        this.LJLJJI = paidContentCollectionDetailVideoListAssem;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem selectSubscribe, C25621A3t state) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(state, "state");
        if (state.LJLIL && !state.LJLILLLLZI) {
            this.LJLIL.setText(selectSubscribe.getContainerView().getContext().getString(R.string.tqs));
            this.LJLILLLLZI.setIconRes(R.raw.icon_chevron_down_fill);
            C16880lQ.LJIIJ(new ACListenerS24S0100000_4(this.LJLJJI, 98), this.LJLJI);
            this.LJLJJI.v3().LJLJJLL(this.LJLJI);
            return;
        }
        this.LJLJJI.v3().LJLL();
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, C25621A3t c25621A3t) {
        invoke2(uIAssem, c25621A3t);
        return C76800UCe.LIZ;
    }
}
