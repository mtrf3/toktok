package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;

/* loaded from: classes9.dex */
public final class JS0 implements InterfaceC29937Boz {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ JRJ LIZIZ;

    public JS0(int i, JRJ jrj) {
        this.LIZ = i;
        this.LIZIZ = jrj;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        if (this.LIZ < this.LIZIZ.getDisposableList().size()) {
            ListProtector.remove(this.LIZIZ.getDisposableList(), this.LIZ);
        }
    }
}