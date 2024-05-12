package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Hym, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45832Hym implements InterfaceC45841Hyv {
    public final /* synthetic */ InterfaceC67352kd<C45837Hyr> LIZ;

    public C45832Hym(C84654XKg c84654XKg) {
        this.LIZ = c84654XKg;
    }

    @Override // X.InterfaceC45841Hyv
    public final void LIZ(C45828Hyi errorStatus) {
        o.LJIIIZ(errorStatus, "errorStatus");
        C45837Hyr c45837Hyr = new C45837Hyr(false, errorStatus, R.string.r4n);
        InterfaceC67352kd<C45837Hyr> interfaceC67352kd = this.LIZ;
        C3C5.m7constructorimpl(c45837Hyr);
        interfaceC67352kd.resumeWith(c45837Hyr);
    }
}
