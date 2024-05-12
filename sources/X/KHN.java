package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.vision.EComPhotoSearchServiceImpl;

/* loaded from: classes9.dex */
public final class KHN implements View.OnClickListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ EComPhotoSearchServiceImpl LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ KHW LJLJJI;

    public KHN(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, EComPhotoSearchServiceImpl eComPhotoSearchServiceImpl, Context context, KHW khw) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = eComPhotoSearchServiceImpl;
        this.LJLJI = context;
        this.LJLJJI = khw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLILLLLZI.LJI(this.LJLJI, this.LJLJJI);
    }
}
