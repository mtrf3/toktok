package X;

import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public final class QRS implements InterfaceC66998QRe {
    public static volatile QRS LIZIZ;
    public List<InterfaceC66998QRe> LIZ = Collections.emptyList();

    @Override // X.InterfaceC66998QRe
    public final void LIZ() {
    }

    public static QRS LJI() {
        if (LIZIZ == null) {
            synchronized (QRS.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QRS();
                }
            }
        }
        return LIZIZ;
    }

    @Override // X.InterfaceC67018QRy
    public final void LJ() {
        List<InterfaceC66998QRe> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC66998QRe> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().LJ();
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC67018QRy
    public final void LIZJ(Intent intent) {
        List<InterfaceC66998QRe> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC66998QRe> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().LIZJ(intent);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC67018QRy
    public final void LJFF(Context context) {
        List<InterfaceC66998QRe> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC66998QRe> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().LJFF(context);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC66998QRe
    public final void LIZIZ(Context context, java.util.Map<String, String> map) {
        List<InterfaceC66998QRe> list = this.LIZ;
        if (list != null) {
            Iterator<InterfaceC66998QRe> it = list.iterator();
            while (it.hasNext()) {
                try {
                    it.next().LIZIZ(context, map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // X.InterfaceC66998QRe
    public final void LIZLLL(Context context, C60016Ngy c60016Ngy) {
        new T2R();
        List<InterfaceC66998QRe> list = this.LIZ;
        if (list != null) {
            for (InterfaceC66998QRe interfaceC66998QRe : list) {
                try {
                    interfaceC66998QRe.LIZ();
                    interfaceC66998QRe.LIZLLL(context, c60016Ngy);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
