package X;

import Y.ACallableS104S0100000_1;

/* renamed from: X.3I1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3I1 extends C8BS<String> {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS104S0100000_1(objArr, 12), 0);
        return true;
    }
}
