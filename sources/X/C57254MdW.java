package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.MdW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57254MdW extends AbstractChoreographerFrameCallbackC57253MdV {
    public final int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public int LJLJLJ;

    @Override // X.AbstractChoreographerFrameCallbackC57253MdV
    public final void LIZJ() {
        this.LJLJJL = 0;
        this.LJLJJLL = 0;
        this.LJLJL = true;
        this.LJLJLJ = 0;
    }

    @Override // X.AbstractChoreographerFrameCallbackC57253MdV
    public final void LIZIZ() {
        if (this.LJLJJLL >= this.LJLJJL) {
            this.LJLJJLL = 0;
        }
        int i = this.LJLJJLL + 1;
        this.LJLJJLL = i;
        if (this.LJLJLJ >= 3600) {
            this.LJLJLJ = 0;
        }
        int i2 = this.LJLJLJ + 1;
        this.LJLJLJ = i2;
        if (!this.LJLJL) {
            if (i2 >= this.LJLJJI) {
                this.LJLJJLL = i - 1;
                this.LJLJLJ = 0;
            }
            this.LJLJL = true;
        }
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            InterfaceC57255MdX interfaceC57255MdX = (InterfaceC57255MdX) it.next();
            if (interfaceC57255MdX.LIZ() <= 0) {
                interfaceC57255MdX.LIZIZ(0);
            } else if (this.LJLJJLL % interfaceC57255MdX.LIZ() == 0) {
                interfaceC57255MdX.LIZIZ(0);
            }
        }
    }

    @Override // X.AbstractChoreographerFrameCallbackC57253MdV
    public final void LIZLLL() {
        boolean z;
        if (this.LJLJJLL % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJLJL = z;
        if (z) {
            this.LJLJLJ = 0;
        }
    }

    public C57254MdW(int i) {
        super(true);
        this.LJLJJI = i;
        this.LJLJL = true;
    }

    @Override // X.AbstractChoreographerFrameCallbackC57253MdV
    public final void LIZ(InterfaceC57255MdX listener) {
        o.LJIIIZ(listener, "listener");
        int LIZ = listener.LIZ();
        if (LIZ >= 0 && LIZ % 2 == 0) {
            super.LIZ(listener);
            int i = this.LJLJJL;
            if (i != 0) {
                int i2 = i;
                int i3 = LIZ;
                while (i3 > 0) {
                    int i4 = i2 % i3;
                    i2 = i3;
                    i3 = i4;
                }
                LIZ = (i * LIZ) / i2;
            }
            this.LJLJJL = LIZ;
        }
    }
}
