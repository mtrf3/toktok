package X;

import com.ss.android.ugc.aweme.notification.creator.vm.CreatorNoticeResultVM;
import com.ss.android.ugc.aweme.placediscovery.model.PoiCategory;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.AqS97S0101000_9;

/* loaded from: classes10.dex */
public final class MTY implements InterfaceC86070XqE {
    public final /* synthetic */ C56854MTa LIZ;

    @Override // X.InterfaceC86070XqE
    public final String LIZIZ() {
        return this.LIZ.LJLIL.nv0();
    }

    public MTY(C56854MTa c56854MTa) {
        this.LIZ = c56854MTa;
    }

    @Override // X.InterfaceC86070XqE
    public final void LIZ(int i) {
        if (i != this.LIZ.LJLIL.lv0()) {
            CreatorNoticeResultVM creatorNoticeResultVM = this.LIZ.LJLIL;
            creatorNoticeResultVM.getClass();
            creatorNoticeResultVM.withState(new AqS97S0101000_9(creatorNoticeResultVM, i, 11));
        }
    }

    @Override // X.InterfaceC86070XqE
    public final void LIZJ(List<Integer> list) {
        CreatorNoticeResultVM creatorNoticeResultVM = this.LIZ.LJLIL;
        creatorNoticeResultVM.getClass();
        creatorNoticeResultVM.setState(new AqS175S0100000_9(list, (List<PoiCategory>) 531));
    }
}
