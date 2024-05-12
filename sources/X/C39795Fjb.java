package X;

import com.bytedance.pumbaa.hybrid.rasp.RaspServiceImpl;
import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;

/* renamed from: X.Fjb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39795Fjb implements InterfaceC58734N3i {
    @Override // X.InterfaceC58734N3i
    public final String LIZ() {
        return "rasp";
    }

    @Override // X.InterfaceC58734N3i
    public final boolean LIZIZ(int i, String str) {
        Boolean LJI;
        IRaspService LJIIIIZZ = RaspServiceImpl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJI = LJIIIIZZ.LJI(str, "qrcode")) != null) {
            return LJI.booleanValue();
        }
        return false;
    }
}
