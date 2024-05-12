package X;

import com.ss.android.ugc.aweme.detail.api.DetailApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

/* renamed from: X.3IB, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3IB extends C8BS<OSZ<Integer, Aweme>> {
    public final C8RO LJLIL = new C8RO("DetailModel");

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final void handleData(OSZ<Integer, Aweme> osz) {
        OSZ<Integer, Aweme> osz2 = osz;
        super.handleData(osz2);
        if (osz2 != null) {
            C8RO c8ro = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[handleData] ");
            LIZ.append(osz2.getFirst());
            c8ro.LJII(osz2.getSecond(), X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        final String str;
        final int i;
        Object obj;
        Object obj2;
        Object obj3;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        final String str2 = (String) objArr[0];
        final String str3 = "";
        if (objArr.length <= 1 || (obj3 = objArr[1]) == null) {
            str = "";
        } else {
            str = (String) obj3;
        }
        if (objArr.length > 2 && (obj2 = objArr[2]) != null) {
            i = ((Integer) obj2).intValue();
        } else {
            i = 0;
        }
        if (objArr.length > 3 && (obj = objArr[3]) != null) {
            str3 = (String) obj;
        }
        C8RO c8ro = this.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[sendRequest] ");
        LIZ.append(str);
        LIZ.append(",");
        LIZ.append(str2);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        FGR.LIZIZ().LIZ(this.mHandler, new Callable() { // from class: X.3IC
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return DetailApi.LIZJ(i, str2, str, str3);
            }
        }, 0);
        return true;
    }
}
