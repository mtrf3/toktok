package X;

import Y.ARunnableS26S0200000_7;

/* renamed from: X.Gwv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43169Gwv extends C8BS {
    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 1 || !(objArr[0] instanceof C62684Oiu)) {
            return false;
        }
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        this.mHandler.postDelayed(new ARunnableS26S0200000_7(this, objArr, 26), 500L);
        return true;
    }
}
