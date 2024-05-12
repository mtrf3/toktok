package X;

import X.C2K3;
import X.C8BS;

/* renamed from: X.8BR, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8BR<T extends C8BS, K extends C2K3> implements C8BT {
    public T LJLIL;
    public K LJLILLLLZI;
    public boolean LJLJI = true;

    public void LIZIZ() {
        this.LJLILLLLZI = null;
        LJJII();
    }

    public void LJII() {
    }

    @Override // X.C8BT
    public void onFailed(Exception exc) {
    }

    @Override // X.C8BT
    public void onSuccess() {
    }

    public final boolean LJIL() {
        if (this.LJLILLLLZI != null) {
            return true;
        }
        return false;
    }

    public final boolean LJJIFFI() {
        T t = this.LJLIL;
        if (t != null && t.isLoading()) {
            return true;
        }
        return false;
    }

    public void LJJII() {
        T t = this.LJLIL;
        if (t != null) {
            t.clearNotifyListener(this);
            this.LJLIL = null;
        }
    }

    public boolean LJIILL(Object... objArr) {
        if (this.LJLIL == null || ((LJJIFFI() && this.LJLJI) || !this.LJLIL.sendRequest(objArr))) {
            return false;
        }
        LJII();
        return true;
    }

    public void LJJ(T t) {
        this.LJLIL = t;
        t.addNotifyListener(this);
    }

    public void LJJI(K k) {
        this.LJLILLLLZI = k;
    }
}
