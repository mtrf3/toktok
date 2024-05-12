package X;

import com.ss.android.ugc.aweme.setting.model.CommonResponse;

/* renamed from: X.Oj3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62693Oj3 extends I4X implements C8BT {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        Object obj = this.LJLILLLLZI;
        if (((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData).statusCode == 0 && ((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData).result) {
            Object obj2 = this.LJLJI;
            if (obj2 != null) {
                ((InterfaceC62699Oj9) ((I4Y) obj2)).LJJIJ();
                return;
            }
            return;
        }
        if (this.LJLJI == null) {
            return;
        }
        C38333F2r c38333F2r = new C38333F2r(((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData).statusCode);
        c38333F2r.setErrorMsg(((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData).statusMsg);
        ((InterfaceC62699Oj9) ((I4Y) this.LJLJI)).LJIL(c38333F2r);
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62699Oj9) ((I4Y) obj)).LJIL(exc);
        }
    }

    public C62693Oj3(C62696Oj6 c62696Oj6, InterfaceC62699Oj9 interfaceC62699Oj9) {
        super(c62696Oj6, interfaceC62699Oj9);
        ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).addNotifyListener(this);
    }
}
