package X;

import android.view.View;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.service.CommerceToolsTcmServiceImpl;

/* loaded from: classes8.dex */
public final class G62 implements View.OnClickListener {
    public final /* synthetic */ G7M LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ CommerceToolsTcmModel LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ int LJLJJL;

    public G62(G7M g7m, boolean z, CommerceToolsTcmModel commerceToolsTcmModel, boolean z2, int i) {
        this.LJLIL = g7m;
        this.LJLILLLLZI = z;
        this.LJLJI = commerceToolsTcmModel;
        this.LJLJJI = z2;
        this.LJLJJL = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        CommerceToolsTcmServiceImpl.LJIJJ().LJIIL(this.LJLIL.mActivity, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
    }
}
