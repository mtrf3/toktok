package X;

import X.C0M9;
import java.util.Iterator;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WST {
    public boolean LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public final C1HQ<String, Boolean> LIZLLL;
    public long LJ;
    public final WSX LJFF;
    public final InterfaceC82086WJm LJI;
    public final I37 LJII;
    public final InterfaceC88472Yns<Boolean, C76800UCe> LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        boolean z;
        Iterator it = ((C0M9.b) this.LIZLLL.entrySet()).iterator();
        while (true) {
            C0M8 c0m8 = (C0M8) it;
            if (c0m8.hasNext()) {
                c0m8.next();
                V value = c0m8.getValue();
                o.LJIIIIZZ(value, "entry.value");
                if (((Boolean) value).booleanValue()) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (this.LIZ != z) {
            this.LIZ = z;
            C6QQ.LIZ(new AqS164S0100000_14(this, 35));
        }
    }

    public WST(InterfaceC82086WJm cameraApiComponent, I37 beautyApi, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(beautyApi, "beautyApi");
        this.LJI = cameraApiComponent;
        this.LJII = beautyApi;
        this.LJIIIIZZ = aqS180S0100000_14;
        this.LIZLLL = new C1HQ<>();
        this.LJFF = new WSX(this);
    }
}
