package X;

import com.ss.android.ugc.aweme.friends.model.RecommendList;
import com.ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;

/* renamed from: X.Mi7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57539Mi7 extends I4X implements C8BT {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        C54960Lhc.LIZ.LIZIZ();
        Object obj = this.LJLILLLLZI;
        if (((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mQueryType == 1) {
            ((InterfaceC57542MiA) ((I4Y) this.LJLJI)).LJIILL((RecommendList) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData);
        } else {
            if (((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mQueryType != 4) {
                return;
            }
            ((InterfaceC57542MiA) ((I4Y) this.LJLJI)).LJIIL((RecommendList) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData);
        }
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        ((InterfaceC57542MiA) ((I4Y) this.LJLJI)).LJII(exc);
    }

    public C57539Mi7(RecommendCommonUserModel recommendCommonUserModel, InterfaceC57542MiA interfaceC57542MiA) {
        super(recommendCommonUserModel, interfaceC57542MiA);
        ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).addNotifyListener(this);
    }
}
