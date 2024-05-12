package X;

import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import java.util.HashMap;

/* renamed from: X.2Kj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56692Kj {
    public static C56692Kj LIZLLL;
    public InterfaceC56552Jv LIZ;
    public InterfaceC56552Jv LIZIZ;
    public final HashMap<String, RoomStruct> LIZJ = new HashMap<>();

    public static C56692Kj LIZ() {
        if (LIZLLL == null) {
            synchronized (C56692Kj.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C56692Kj();
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZIZ() {
        InterfaceC56552Jv interfaceC56552Jv = this.LIZ;
        if (interfaceC56552Jv != null) {
            interfaceC56552Jv.LIZ();
        }
        InterfaceC56552Jv interfaceC56552Jv2 = this.LIZIZ;
        if (interfaceC56552Jv2 != null) {
            interfaceC56552Jv2.LIZ();
        }
    }
}
