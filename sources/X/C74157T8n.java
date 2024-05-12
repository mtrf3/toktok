package X;

import Y.ACallableS0S1000000_1;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import kotlin.jvm.internal.o;

/* renamed from: X.T8n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74157T8n extends C8BR<C8BS<DuetDetailModel>, InterfaceC74156T8m> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        K k = this.LJLILLLLZI;
        if (k != 0 && (t = this.LJLIL) != 0) {
            Object data = t.getData();
            o.LJIIIIZZ(data, "mModel.data");
            ((InterfaceC74156T8m) k).OY((DuetDetailModel) data);
        }
    }

    public C74157T8n() {
        LJJ(new C8BS<DuetDetailModel>() { // from class: X.3IQ
            @Override // X.C8BS
            public final boolean checkParams(Object... params) {
                o.LJIIIZ(params, "params");
                return true;
            }

            @Override // X.C8BS
            public final boolean sendRequest(Object... params) {
                o.LJIIIZ(params, "params");
                if (!super.sendRequest(params)) {
                    return false;
                }
                C74157T8n c74157T8n = C74157T8n.this;
                WeakHandler mHandler = this.mHandler;
                o.LJIIIIZZ(mHandler, "mHandler");
                Object obj = params[0];
                o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj;
                c74157T8n.getClass();
                if (!AV1.LJIIJJI()) {
                    FGR.LIZIZ().LIZ(mHandler, new ACallableS0S1000000_1(str, 4), 0);
                }
                return true;
            }
        });
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC74156T8m) k).W10(e);
        }
    }
}
