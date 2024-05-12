package X;

import android.webkit.ValueCallback;

/* renamed from: X.EvI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37972EvI<T> implements ValueCallback<String> {
    public final /* synthetic */ AbstractC37959Ev5 LIZ;
    public final /* synthetic */ C37955Ev1 LIZIZ;

    public C37972EvI(AbstractC37959Ev5 abstractC37959Ev5, C37955Ev1 c37955Ev1) {
        this.LIZ = abstractC37959Ev5;
        this.LIZIZ = c37955Ev1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(String str) {
        C37955Ev1 c37955Ev1 = this.LIZIZ;
        c37955Ev1.LJJIIJ = str;
        C37904EuC c37904EuC = this.LIZ.LIZ;
        c37904EuC.LIZJ.LIZLLL(c37904EuC, c37955Ev1);
    }
}
