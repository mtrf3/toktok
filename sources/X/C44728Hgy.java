package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44728Hgy implements InterfaceC42558Gn4 {
    public final /* synthetic */ C83058Wik LIZ;

    @Override // X.InterfaceC42558Gn4
    public final OSZ<Float, Float> LIZIZ() {
        if (this.LIZ.LJLLILLLL != null) {
            return new OSZ<>(Float.valueOf(r2.width), Float.valueOf(r2.height));
        }
        return new OSZ<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
    }

    @Override // X.InterfaceC42558Gn4
    public final InterfaceC153045zY getEditor() {
        InterfaceC153045zY LJJ;
        C5MG WS = this.LIZ.LIZIZ().WS();
        if (WS != null && (LJJ = WS.LJJ()) != null) {
            return LJJ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC42558Gn4
    public final String LIZ() {
        InterfaceC43072GvM LJ = C62850Ola.LJ();
        CreativeInfo creativeInfo = this.LIZ.LIZJ().creativeInfo;
        o.LJIIIIZZ(creativeInfo, "publishEditModel.creativeInfo");
        return C43073GvN.LIZLLL(LJ, creativeInfo, EnumC43649HBd.CUSTOM_STICKER, null, false, 12);
    }

    public C44728Hgy(C83058Wik c83058Wik) {
        this.LIZ = c83058Wik;
    }
}
