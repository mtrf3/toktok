package Y;

import X.C16880lQ;
import X.C2MA;
import X.C45505HtV;
import X.C45509HtZ;
import X.IDP;
import X.InterfaceC65784Pro;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.tools.draft.DraftBoxActivity;

/* loaded from: classes8.dex */
public class AObjectS51S0201000_7 implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS51S0201000_7 aObjectS51S0201000_7) {
        switch (aObjectS51S0201000_7.i2) {
            case 0:
                IDP idp = (IDP) aObjectS51S0201000_7.l0;
                C2MA c2ma = (C2MA) aObjectS51S0201000_7.l1;
                idp.getClass();
                return Long.valueOf(idp.LJJIJ(c2ma.getCurrentAweme()));
            default:
                Context context = (Context) aObjectS51S0201000_7.l0;
                Bundle bundle = (Bundle) aObjectS51S0201000_7.l1;
                Intent intent = new Intent(context, (Class<?>) DraftBoxActivity.class);
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                C16880lQ.LIZJ(context, intent);
                return null;
        }
    }

    public static final Object invoke$1(AObjectS51S0201000_7 aObjectS51S0201000_7) {
        C45505HtV c45505HtV = (C45505HtV) aObjectS51S0201000_7.l0;
        int i = aObjectS51S0201000_7.i2;
        MyMediaModel myMediaModel = (MyMediaModel) aObjectS51S0201000_7.l1;
        c45505HtV.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("user clicked item, position(include header) = ");
        LIZ.append(i);
        LIZ.append(", choosePhotoScene=");
        LIZ.append(c45505HtV.LJLJLJ.LJZL);
        LIZ.append(", model = ");
        LIZ.append(myMediaModel);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$2(AObjectS51S0201000_7 aObjectS51S0201000_7) {
        C45509HtZ c45509HtZ = (C45509HtZ) aObjectS51S0201000_7.l0;
        int i = aObjectS51S0201000_7.i2;
        MyMediaModel myMediaModel = (MyMediaModel) aObjectS51S0201000_7.l1;
        c45509HtZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("user selected item, position(include header) = ");
        LIZ.append(i);
        LIZ.append(", choosePhotoScene=");
        LIZ.append(c45509HtZ.LJLJL.LJZL);
        LIZ.append(", model = ");
        LIZ.append(myMediaModel);
        return X1D.LIZIZ(LIZ);
    }

    public AObjectS51S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
