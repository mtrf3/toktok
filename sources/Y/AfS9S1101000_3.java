package Y;

import X.ASQ;
import X.ASX;
import X.C192567h6;
import X.C193027hq;
import X.InterfaceC192547h4;
import X.InterfaceC64592gB;
import android.os.Bundle;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageResponse;

/* loaded from: classes4.dex */
public class AfS9S1101000_3 implements InterfaceC64592gB {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(AfS9S1101000_3 afS9S1101000_3, Object obj) {
        String str;
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        C192567h6 c192567h6 = new C192567h6();
        c192567h6.LIZLLL = ((C193027hq) afS9S1101000_3.l1).LJLJI;
        c192567h6.LJIILJJIL = String.valueOf((Object) 0);
        if (afS9S1101000_3.i2 == 3) {
            str = "on";
        } else {
            str = "off";
        }
        c192567h6.LJIILL = str;
        c192567h6.LJIILIIL();
        ((C193027hq) afS9S1101000_3.l1).LIZ(false, new CollectionDetail(collectionManageResponse.collectionId, afS9S1101000_3.s0, null, null, null, null, null, null, null, 508, null));
    }

    public static final void accept$1(AfS9S1101000_3 afS9S1101000_3, Object obj) {
        String str;
        String str2;
        CollectionManageResponse collectionManageResponse = (CollectionManageResponse) obj;
        C192567h6 c192567h6 = new C192567h6();
        Bundle arguments = ((ChooseCollectionSheetFragment) afS9S1101000_3.l1).getArguments();
        if (arguments != null) {
            str = arguments.getString("enterFrom");
        } else {
            str = null;
        }
        c192567h6.LIZLLL = str;
        c192567h6.LJIILJJIL = String.valueOf((Object) 0);
        if (afS9S1101000_3.i2 == 3) {
            str2 = "on";
        } else {
            str2 = "off";
        }
        c192567h6.LJIILL = str2;
        c192567h6.LJIILIIL();
        InterfaceC192547h4 interfaceC192547h4 = ((ChooseCollectionSheetFragment) afS9S1101000_3.l1).LJLILLLLZI;
        if (interfaceC192547h4 != null) {
            interfaceC192547h4.ag(true, new CollectionDetail(collectionManageResponse.collectionId, afS9S1101000_3.s0, null, null, null, null, null, null, null, 508, null));
        }
        ASQ.LJ((ChooseCollectionSheetFragment) afS9S1101000_3.l1, ASX.LIZ);
    }

    public AfS9S1101000_3(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.i2 = i;
        this.s0 = str;
    }
}
