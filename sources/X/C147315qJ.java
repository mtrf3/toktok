package X;

import android.graphics.RectF;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5qJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147315qJ {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(InterfaceC153045zY interfaceC153045zY, InterfaceC147355qN interfaceC147355qN, List<? extends InterfaceC147435qV> list) {
        o.LJIIIZ(list, "list");
        boolean z = false;
        if (interfaceC147355qN.LIZLLL() == interfaceC147355qN.LJFF(true) && interfaceC147355qN.LJI() == interfaceC147355qN.LIZ(true)) {
            return false;
        }
        VESize LLILZ = interfaceC153045zY.LLILZ();
        int LJFF = interfaceC147355qN.LJFF(true);
        int LIZ2 = interfaceC147355qN.LIZ(true);
        interfaceC147355qN.LIZLLL();
        interfaceC147355qN.LJI();
        float f = (LLILZ.height - (((LLILZ.width * 1.0f) / LJFF) * LIZ2)) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f, LLILZ.width, LLILZ.height - f);
        for (InterfaceC147435qV interfaceC147435qV : list) {
            if (interfaceC147435qV != null) {
                z |= interfaceC147435qV.Rc(rectF);
            }
        }
        return z;
    }

    public static final boolean LIZIZ(InterfaceC153045zY interfaceC153045zY, InterfaceC147355qN interfaceC147355qN, C63C stickerScene) {
        InterfaceC1541863i interfaceC1541863i;
        Boolean valueOf;
        o.LJIIIZ(stickerScene, "stickerScene");
        if (interfaceC147355qN.LIZLLL() == interfaceC147355qN.LJFF(true) && interfaceC147355qN.LJI() == interfaceC147355qN.LIZ(true)) {
            return false;
        }
        VESize LLILZ = interfaceC153045zY.LLILZ();
        int LJFF = interfaceC147355qN.LJFF(true);
        int LIZ2 = interfaceC147355qN.LIZ(true);
        interfaceC147355qN.LIZLLL();
        interfaceC147355qN.LJI();
        float f = (LLILZ.height - (((LLILZ.width * 1.0f) / LJFF) * LIZ2)) / 2.0f;
        RectF rectF = new RectF();
        rectF.set(0.0f, f, LLILZ.width, LLILZ.height - f);
        if (!C143125jY.LIZ() || (interfaceC1541863i = (InterfaceC1541863i) C44384HbQ.LJJJI(stickerScene).LJ(InterfaceC1541863i.class)) == null || (valueOf = Boolean.valueOf(interfaceC1541863i.nN(rectF))) == null) {
            return false;
        }
        return valueOf.booleanValue();
    }
}
