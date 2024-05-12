package Y;

import X.C10I;
import X.C10K;
import X.C43753HFd;
import X.C43756HFg;
import X.C45498HtO;
import X.HG7;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import v5.n;

/* loaded from: classes8.dex */
public class AgS43S0400000_7 implements C10I {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS43S0400000_7 agS43S0400000_7, C10K c10k) {
        C45498HtO c45498HtO = (C45498HtO) agS43S0400000_7.l0;
        boolean[] zArr = (boolean[]) agS43S0400000_7.l1;
        View view = (View) agS43S0400000_7.l2;
        MyMediaModel myMediaModel = (MyMediaModel) agS43S0400000_7.l3;
        c45498HtO.getClass();
        if (zArr[0]) {
            zArr[0] = false;
            c45498HtO.LJLL.LIZ(view, myMediaModel);
            return null;
        }
        return null;
    }

    public static final Object then$1(AgS43S0400000_7 agS43S0400000_7, C10K c10k) {
        C43756HFg c43756HFg = (C43756HFg) agS43S0400000_7.l0;
        CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) agS43S0400000_7.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) agS43S0400000_7.l2;
        HG7 hg7 = (HG7) agS43S0400000_7.l3;
        c43756HFg.getClass();
        if (c10k.LJIILJJIL()) {
            C43753HFd.LJII(createBaseAwemeResponse, videoPublishEditModel, Boolean.FALSE, -1001, "custom sticker");
        }
        n nVar = new n();
        C10K.LIZ(new ACallableS56S0300000_7(videoPublishEditModel, hg7, nVar, 10));
        return nVar.LIZ;
    }

    public static final Object then$2(AgS43S0400000_7 agS43S0400000_7, C10K c10k) {
        C43756HFg c43756HFg = (C43756HFg) agS43S0400000_7.l0;
        CreateBaseAwemeResponse createBaseAwemeResponse = (CreateBaseAwemeResponse) agS43S0400000_7.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) agS43S0400000_7.l2;
        HG7 hg7 = (HG7) agS43S0400000_7.l3;
        c43756HFg.getClass();
        if (c10k.LJIILJJIL()) {
            C43753HFd.LJII(createBaseAwemeResponse, videoPublishEditModel, Boolean.FALSE, -1001, "library gallery");
        }
        n nVar = new n();
        C10K.LIZ(new ACallableS56S0300000_7(hg7, videoPublishEditModel, nVar, 9));
        return nVar.LIZ;
    }

    public AgS43S0400000_7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
