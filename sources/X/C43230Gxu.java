package X;

import Y.ACallableS110S0100000_7;
import com.ss.android.ugc.trill.share.api.AutoShare;

/* renamed from: X.Gxu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43230Gxu extends C8BS<AutoShare> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 10) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS110S0100000_7(objArr, 22), 0);
        return true;
    }
}
