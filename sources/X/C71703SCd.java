package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SCd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71703SCd implements SEI {
    public final SCQ LIZ;
    public String LIZIZ = "";
    public String LIZJ = "";
    public String LIZLLL = "";
    public Boolean LJ;
    public String LJFF;

    @Override // X.SDK
    public final void LIZLLL(View view) {
    }

    public C71703SCd(SCQ scq) {
        this.LIZ = scq;
    }

    @Override // X.SDK
    public final C71729SDd LIZ(SDF sdf) {
        String str;
        Object obj;
        Object obj2;
        SCQ scq;
        SC6 sc6;
        C71665SAr c71665SAr;
        List<String> value;
        CharSequence LIZIZ;
        C71729SDd<C71740SDo> LIZ = sdf.LIZ(sdf.LIZIZ);
        C71740SDo c71740SDo = LIZ.LIZ;
        InterfaceC71722SCw interfaceC71722SCw = c71740SDo.LJIIJ;
        boolean z = false;
        if (interfaceC71722SCw == null || (LIZIZ = interfaceC71722SCw.LIZIZ()) == null || LIZIZ.length() == 0) {
            str = "";
        } else {
            str = "normal";
        }
        this.LIZIZ = str;
        SAN san = SAN.LIZ;
        String str2 = this.LJFF;
        san.getClass();
        String LIZJ = SAN.LIZJ(str2);
        Boolean bool = null;
        r6 = null;
        r6 = null;
        Boolean bool2 = null;
        Object obj3 = null;
        if (o.LJ(LIZJ, "date")) {
            InterfaceC71722SCw interfaceC71722SCw2 = c71740SDo.LJIIJ;
            if ((interfaceC71722SCw2 instanceof C71665SAr) && (c71665SAr = (C71665SAr) interfaceC71722SCw2) != null && (value = c71665SAr.value()) != null) {
                obj = ORZ.LJLLLLLL(0, value);
                if (value != null) {
                    obj2 = ORZ.LJLLLLLL(1, value);
                    scq = this.LIZ;
                    if (scq != null && (sc6 = scq.LIZIZ) != null && sc6.LIZIZ.LIZ()) {
                        if (o.LJ(sc6.LIZIZ.LIZ, obj) && o.LJ(sc6.LIZIZ.LIZIZ, obj2)) {
                            z = true;
                        }
                        bool2 = Boolean.valueOf(z);
                    }
                    this.LJ = bool2;
                }
            } else {
                obj = null;
            }
            obj2 = null;
            scq = this.LIZ;
            if (scq != null) {
                if (o.LJ(sc6.LIZIZ.LIZ, obj)) {
                    z = true;
                }
                bool2 = Boolean.valueOf(z);
            }
            this.LJ = bool2;
        } else if (o.LJ(LIZJ, "card_number")) {
            SCQ scq2 = this.LIZ;
            if (scq2 != null) {
                InterfaceC71722SCw interfaceC71722SCw3 = c71740SDo.LJIIJ;
                if (interfaceC71722SCw3 != null) {
                    obj3 = interfaceC71722SCw3.value();
                }
                bool = scq2.LIZJ(String.valueOf(obj3));
            }
            this.LJ = bool;
        }
        return LIZ;
    }

    @Override // X.SEI
    public final void LIZIZ(boolean z) {
        if (z) {
            String str = this.LIZLLL;
            o.LJIIIZ(str, "<set-?>");
            C28112B1o.LIZ = str;
            C28112B1o.LJFF(this.LIZLLL);
            C28112B1o.LJIILJJIL(this.LIZLLL);
            return;
        }
        String str2 = this.LIZLLL;
        C28112B1o.LJIIIIZZ(str2, C28112B1o.LIZ(str2), this.LIZIZ, null);
        C28112B1o.LIZ = "";
    }

    @Override // X.SEI
    public final void LIZJ(InterfaceC71708SCi item) {
        o.LJIIIZ(item, "item");
        if (item instanceof C71704SCe) {
            this.LIZJ = ((C71704SCe) item).LJLILLLLZI.LJIIL();
        }
        this.LJFF = item.getElementDTO().id;
        this.LIZLLL = C28112B1o.LJIILIIL(item.getElementDTO().paramName);
    }

    @Override // X.SEI
    public final void LJ(boolean z) {
        C28112B1o.LJI(this.LJ, this.LIZJ, this.LIZLLL, this.LIZIZ, z);
    }
}
