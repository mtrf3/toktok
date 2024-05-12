package X;

import Y.ACallableS81S0200000_3;
import java.util.HashMap;

/* renamed from: X.6zT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178476zT extends C8BS<C15070iV<String, Integer>> {
    public int LJLIL;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1 || !(objArr[0] instanceof HashMap)) {
            return false;
        }
        return true;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!super.sendRequest(objArr)) {
            return false;
        }
        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS81S0200000_3(this, objArr, 9), 0);
        return true;
    }
}
