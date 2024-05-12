package Y;

import X.C41995Gdz;
import X.C43882HKc;
import X.C43933HMb;
import X.C44694HgQ;
import X.C45498HtO;
import X.C45499HtP;
import X.C45538Hu2;
import X.C60903NvH;
import X.C6BK;
import X.C6QQ;
import X.C76800UCe;
import X.C783835u;
import X.HP8;
import X.InterfaceC45603Hv5;
import X.InterfaceC88472Yns;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;

/* loaded from: classes8.dex */
public class AObjectS87S0300000_7 implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS87S0300000_7 aObjectS87S0300000_7, Object obj) {
        C45498HtO c45498HtO = (C45498HtO) aObjectS87S0300000_7.l0;
        MediaModel mediaModel = (MediaModel) aObjectS87S0300000_7.l1;
        InterfaceC45603Hv5 interfaceC45603Hv5 = (InterfaceC45603Hv5) aObjectS87S0300000_7.l2;
        C43933HMb c43933HMb = (C43933HMb) obj;
        c45498HtO.getClass();
        ChooseMediaExtensionKt.LIZIZ(c43933HMb, mediaModel);
        c45498HtO.LLFII(0, c43933HMb.LJLILLLLZI, c43933HMb.LJLJI);
        C45538Hu2 c45538Hu2 = (C45538Hu2) interfaceC45603Hv5;
        c45538Hu2.LIZLLL.LLIIIZ(c45538Hu2.LIZ, c45538Hu2.LIZIZ, c45538Hu2.LIZJ);
        C45498HtO.LLFFF(mediaModel, true);
        C60903NvH.LJIIJJI().LJIIZILJ().updateMediaTypeCache(mediaModel.fileLocalUriPath);
        return null;
    }

    public static final Object invoke$1(AObjectS87S0300000_7 aObjectS87S0300000_7, Object obj) {
        C45498HtO c45498HtO = (C45498HtO) aObjectS87S0300000_7.l0;
        InterfaceC45603Hv5 interfaceC45603Hv5 = (InterfaceC45603Hv5) aObjectS87S0300000_7.l1;
        MediaModel mediaModel = (MediaModel) aObjectS87S0300000_7.l2;
        C43933HMb c43933HMb = (C43933HMb) obj;
        c45498HtO.getClass();
        interfaceC45603Hv5.getClass();
        ChooseMediaExtensionKt.LIZIZ(c43933HMb, mediaModel);
        c45498HtO.LLFII(1, c43933HMb.LJLILLLLZI, c43933HMb.LJLJI);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("errorCode", String.valueOf(c43933HMb.LJLJJL));
        c6bk.LIZ.put("errorMsg", c43933HMb.LJLJJLL);
        c6bk.LIZ.put("file_subfix", C44694HgQ.LJIILL(mediaModel.fileLocalUriPath, false));
        C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
        C41995Gdz.LIZ(c43933HMb.LJLJJL, 0);
        C6QQ.LIZ(new HP8(c45498HtO.LJLJJL, c43933HMb.LJLJJL, 1000, c45498HtO.LL, c43933HMb));
        if (c45498HtO.LJZL == 21 && c43933HMb.LJLJJL == -6) {
            IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZIZ();
            C783835u.LIZ.LJII();
        }
        C45498HtO.LLFFF(mediaModel, false);
        return null;
    }

    public static final Object invoke$2(AObjectS87S0300000_7 aObjectS87S0300000_7, Object obj) {
        C45499HtP c45499HtP = (C45499HtP) aObjectS87S0300000_7.l0;
        View view = (View) aObjectS87S0300000_7.l1;
        MediaModel mediaModel = (MediaModel) aObjectS87S0300000_7.l2;
        c45499HtP.getClass();
        c45499HtP.LLJLILLLLZIIL(view, mediaModel, ((Boolean) obj).booleanValue());
        return C76800UCe.LIZ;
    }

    public AObjectS87S0300000_7(MyMediaModel myMediaModel, C45538Hu2 c45538Hu2, C45498HtO c45498HtO, int i) {
        this.$t = i;
        switch (i) {
            case 0:
                this.l0 = c45498HtO;
                this.l1 = myMediaModel;
                this.l2 = c45538Hu2;
                return;
            default:
                this.l0 = c45498HtO;
                this.l1 = c45538Hu2;
                this.l2 = myMediaModel;
                return;
        }
    }

    public AObjectS87S0300000_7(C45499HtP c45499HtP, View view, MyMediaModel myMediaModel, int i) {
        this.$t = i;
        this.l0 = c45499HtP;
        this.l1 = view;
        this.l2 = myMediaModel;
    }
}
