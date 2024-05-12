package X;

import com.ss.android.ugc.aweme.creatortools.api.ShowCaseModel;
import com.ss.android.ugc.aweme.creatortools.api.ShowCaseRespModel;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ADC implements InterfaceC116954iR<ShowCaseRespModel> {
    public final /* synthetic */ C73318Sq2 LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ ADY LJLJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        if (this.LJLILLLLZI) {
            ADD.LIZ = null;
        }
        ADY ady = this.LJLJI;
        if (ady != null) {
            ady.LIZ(null);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(ShowCaseRespModel showCaseRespModel) {
        ShowCaseRespModel showCaseRespModel2 = showCaseRespModel;
        o.LJIIIZ(showCaseRespModel2, "showCaseRespModel");
        ShowCaseModel showCaseModel = showCaseRespModel2.data;
        if (this.LJLILLLLZI) {
            ADD.LIZ = showCaseModel;
        }
        ADY ady = this.LJLJI;
        if (ady != null) {
            ady.LIZ(showCaseModel);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLIL.LIZ(d);
    }

    public ADC(ADV adv, C73318Sq2 c73318Sq2, boolean z) {
        this.LJLIL = c73318Sq2;
        this.LJLILLLLZI = z;
        this.LJLJI = adv;
    }
}
