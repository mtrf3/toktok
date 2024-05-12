package Y;

import X.AnonymousClass798;
import X.C10K;
import X.C73433Srt;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import com.ss.android.ugc.aweme.comment.likelist.viewmodel.LikeListVM;

/* loaded from: classes4.dex */
public class IDuS315S0100000_3 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<T> interfaceC73573Su9) {
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

    public IDuS315S0100000_3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void subscribe$0(IDuS315S0100000_3 iDuS315S0100000_3, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C10K) iDuS315S0100000_3.l0).LIZLLL(new AgS121S0100000_3((C73433Srt) interfaceC73573Su9, 2));
    }

    public static final void subscribe$1(IDuS315S0100000_3 iDuS315S0100000_3, InterfaceC73573Su9 interfaceC73573Su9) {
        LikeListVM likeListVM = (LikeListVM) iDuS315S0100000_3.l0;
        likeListVM.lv0(new AnonymousClass798(likeListVM.LJLILLLLZI, false, null, 28), (C73433Srt) interfaceC73573Su9);
    }
}
