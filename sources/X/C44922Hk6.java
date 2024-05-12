package X;

import android.app.Activity;

/* renamed from: X.Hk6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44922Hk6 extends C44921Hk5 {
    public final /* synthetic */ InterfaceC43172Gwy LIZIZ;

    @Override // X.C44921Hk5, X.InterfaceC43172Gwy
    public final void onCancel() {
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZIZ() {
        this.LIZIZ.LIZIZ();
    }

    @Override // X.InterfaceC43172Gwy
    public final void LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        this.LIZIZ.LIZJ(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44922Hk6(Activity activity, InterfaceC43172Gwy interfaceC43172Gwy) {
        super(activity);
        this.LIZIZ = interfaceC43172Gwy;
    }
}
