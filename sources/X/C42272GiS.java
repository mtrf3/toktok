package X;

import android.content.Intent;
import android.os.Handler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IPhotoMvFailsStrategy;
import java.util.ArrayList;

/* renamed from: X.GiS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42272GiS extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C42271GiR LJLIL;
    public final /* synthetic */ ArrayList<MediaModel> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI = -1;
    public final /* synthetic */ Intent LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42272GiS(C42271GiR c42271GiR, ArrayList arrayList, int i, Intent intent) {
        super(0);
        this.LJLIL = c42271GiR;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = i;
        this.LJLJJL = intent;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C42271GiR c42271GiR = this.LJLIL;
        ((Handler) c42271GiR.LIZLLL.getValue()).removeCallbacksAndMessages(null);
        C42278GiY c42278GiY = c42271GiR.LIZIZ;
        if (c42278GiY != null) {
            c42278GiY.dismiss();
        }
        IPhotoMvFailsStrategy iPhotoMvFailsStrategy = (IPhotoMvFailsStrategy) ServiceManager.get().getService(IPhotoMvFailsStrategy.class);
        if (iPhotoMvFailsStrategy != null) {
            if (this.LJLILLLLZI.size() > 1) {
                iPhotoMvFailsStrategy.multiPicOriginStrategy(this.LJLIL.LIZ, this.LJLJI, this.LJLJJI, this.LJLJJL);
            } else {
                iPhotoMvFailsStrategy.singlePicOriginStrategy(this.LJLIL.LIZ, this.LJLJI, this.LJLJJI, this.LJLJJL);
            }
        }
        return C76800UCe.LIZ;
    }
}
