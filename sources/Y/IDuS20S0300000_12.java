package Y;

import X.C47261Igj;
import X.C68322mC;
import X.C72909SjR;
import X.C73433Srt;
import X.C74430TJa;
import X.C74432TJc;
import X.C74438TJi;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.OSZ;
import X.T16;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import java.util.List;

/* loaded from: classes13.dex */
public class IDuS20S0300000_12 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<OSZ<List<Object>, C72909SjR>> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS20S0300000_12 iDuS20S0300000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        interfaceC73573Su9.onNext((OSZ) iDuS20S0300000_12.l0);
        ((FollowerRelationViewModel) iDuS20S0300000_12.l1).Hv0((FollowerRelationState) iDuS20S0300000_12.l2).LJJL(T16.LIZ()).LJJJJZI(new AfS64S0100000_12((C73433Srt) interfaceC73573Su9, 27));
    }

    public static final void subscribe$1(IDuS20S0300000_12 iDuS20S0300000_12, InterfaceC73573Su9 interfaceC73573Su9) {
        C74430TJa c74430TJa = (C74430TJa) iDuS20S0300000_12.l0;
        c74430TJa.LIZLLL.LJII(c74430TJa.LIZJ, C47261Igj.LJJIJ(((C68322mC) iDuS20S0300000_12.l1).element), ((C74438TJi) iDuS20S0300000_12.l2).LJLILLLLZI, new C74432TJc((C73433Srt) interfaceC73573Su9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IDuS20S0300000_12(Object obj, OSZ<? extends List<? extends Object>, C72909SjR> osz, FollowerRelationViewModel followerRelationViewModel, FollowerRelationState followerRelationState) {
        this.$t = followerRelationState;
        this.l0 = obj;
        this.l1 = osz;
        this.l2 = followerRelationViewModel;
    }
}
