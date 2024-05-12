package X;

import Y.ACallableS87S0200000_10;

/* loaded from: classes11.dex */
public final class OQG extends C8BS<String> {
    public Boolean LJLIL = Boolean.FALSE;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS87S0200000_10(this, objArr, 1), 0);
        return true;
    }
}
