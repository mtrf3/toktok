package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcChooseStyleFragment;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class STS implements View.OnClickListener {
    public final /* synthetic */ ProfileAigcChooseStyleFragment LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public STS(ProfileAigcChooseStyleFragment profileAigcChooseStyleFragment, int i, int i2) {
        this.LJLIL = profileAigcChooseStyleFragment;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        STD.LIZ(Integer.valueOf(((EL9) ((AssemViewModel) this.LJLIL.LJLIL.getValue()).getState()).LJLILLLLZI.LIZ.size()), "continue");
        STD.LJIIIIZZ("show");
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        C26227ARb c26227ARb = new C26227ARb(context);
        Resources resources = view.getContext().getResources();
        int i = this.LJLILLLLZI;
        int i2 = this.LJLJI;
        c26227ARb.LIZIZ(resources.getQuantityString(i, i2, Integer.valueOf(i2)));
        UC0.LIZJ(c26227ARb, new AqS143S0200000_12(view, this.LJLIL, 3));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }
}
