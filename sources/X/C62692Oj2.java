package X;

import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* renamed from: X.Oj2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62692Oj2 extends I4X implements C8BT {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C8BT
    public final void onSuccess() {
        Object obj = this.LJLILLLLZI;
        if (((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData).statusCode == 0 && ((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) obj)).mData).result) {
            Object obj2 = this.LJLJI;
            if (obj2 != null) {
                ((InterfaceC62698Oj8) ((I4Y) obj2)).LJJIJIIJIL();
            }
            C2U8.LIZ(new IEvent() { // from class: X.2JI
                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent post() {
                    C2U8.LIZ(this);
                    return this;
                }

                @Override // com.ss.android.ugc.governance.eventbus.IEvent
                public final /* synthetic */ IEvent postSticky() {
                    C2U8.LIZIZ(this);
                    return this;
                }
            });
            return;
        }
        if (this.LJLJI == null) {
            return;
        }
        C38333F2r c38333F2r = new C38333F2r(((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData).statusCode);
        c38333F2r.setErrorMsg(((CommonResponse) ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).mData).statusMsg);
        ((InterfaceC62698Oj8) ((I4Y) this.LJLJI)).LJIILJJIL(c38333F2r);
    }

    @Override // X.C8BT
    public final void onFailed(Exception exc) {
        Object obj = this.LJLJI;
        if (obj != null) {
            ((InterfaceC62698Oj8) ((I4Y) obj)).LJIILJJIL(exc);
        }
    }

    public C62692Oj2(C62695Oj5 c62695Oj5, InterfaceC62698Oj8 interfaceC62698Oj8) {
        super(c62695Oj5, interfaceC62698Oj8);
        ((AbstractC57537Mi5) ((InterfaceC62173Oaf) this.LJLILLLLZI)).addNotifyListener(this);
    }
}
