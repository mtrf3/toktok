package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Hyl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45831Hyl implements InterfaceC45841Hyv {
    public final /* synthetic */ C34K LIZ;
    public final /* synthetic */ InterfaceC67352kd<C45837Hyr> LIZIZ;

    @Override // X.InterfaceC45841Hyv
    public final void LIZ(C45828Hyi errorStatus) {
        o.LJIIIZ(errorStatus, "errorStatus");
        C45837Hyr c45837Hyr = new C45837Hyr(false, errorStatus, R.string.c5l);
        if (!this.LIZ.element) {
            InterfaceC67352kd<C45837Hyr> interfaceC67352kd = this.LIZIZ;
            C3C5.m7constructorimpl(c45837Hyr);
            interfaceC67352kd.resumeWith(c45837Hyr);
            this.LIZ.element = true;
        }
    }

    public C45831Hyl(C34K c34k, C84654XKg c84654XKg) {
        this.LIZ = c34k;
        this.LIZIZ = c84654XKg;
    }
}
