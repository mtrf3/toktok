package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.review.repo.dto.ReviewFilterStruct;
import kotlin.jvm.internal.AqS159S0200000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.RqT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnClickListenerC70797RqT implements View.OnClickListener {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ C70795RqR LJLJI;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> LJLJJLL;

    public ViewOnClickListenerC70797RqT(boolean z, AqS159S0200000_12 aqS159S0200000_12, C70795RqR c70795RqR, AqS194S0100000_12 aqS194S0100000_12, int i, AqS194S0100000_12 aqS194S0100000_122) {
        this.LJLIL = z;
        this.LJLILLLLZI = aqS159S0200000_12;
        this.LJLJI = c70795RqR;
        this.LJLJJI = aqS194S0100000_12;
        this.LJLJJL = i;
        this.LJLJJLL = aqS194S0100000_122;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        int i;
        if (this.LJLIL) {
            this.LJLILLLLZI.invoke();
            return;
        }
        if (o.LJ(it, this.LJLJI.LJLJI)) {
            C70795RqR c70795RqR = this.LJLJI;
            c70795RqR.LIZ(c70795RqR.LJLJJL);
            this.LJLJJI.invoke(-1, this.LJLJI.LJLJJL);
            return;
        }
        C70795RqR c70795RqR2 = this.LJLJI;
        o.LJIIIIZZ(it, "it");
        View view = c70795RqR2.LJLJI;
        if (view != null) {
            C70795RqR.LIZJ(view, false);
        }
        c70795RqR2.LJLJI = it;
        C70795RqR.LIZJ(it, true);
        C70795RqR c70795RqR3 = this.LJLJI;
        c70795RqR3.LIZIZ(c70795RqR3.LJLJJL);
        if (this.LJLJI.LJLILLLLZI) {
            i = this.LJLJJL - 1;
        } else {
            i = this.LJLJJL;
        }
        InterfaceC88471Ynr<Integer, ReviewFilterStruct, C76800UCe> interfaceC88471Ynr = this.LJLJJLL;
        Integer valueOf = Integer.valueOf(i);
        Object tag = it.getTag();
        if (!(tag instanceof ReviewFilterStruct)) {
            tag = null;
        }
        interfaceC88471Ynr.invoke(valueOf, tag);
    }
}
