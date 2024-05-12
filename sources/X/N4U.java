package X;

import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N4U extends F9E implements TZM {
    public final java.util.Map<String, Integer> LJLIL;
    public final java.util.Map<String, Integer> LJLILLLLZI;
    public final java.util.Map<String, Integer> LJLJI;
    public final java.util.Map<String, Integer> LJLJJI;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(N4V.LJLIL);

    @Override // X.InterfaceC75402TiY
    public final void LJJJJI() {
    }

    @Override // X.InterfaceC75402TiY
    public final Class<Object> LLIIJI() {
        return TZM.class;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public final void L(String str) {
        Iterator it = ((ArrayList) this.LJLJJL.getValue()).iterator();
        while (it.hasNext()) {
            ((N4W) it.next()).LIZIZ(this, str);
        }
    }

    @Override // X.TZM
    public final boolean LJL(String interactId) {
        Integer num;
        o.LJIIIZ(interactId, "interactId");
        Integer num2 = this.LJLIL.get(interactId);
        if ((num2 == null || num2.intValue() != 3) && ((num = this.LJLIL.get(interactId)) == null || num.intValue() != 4)) {
            return false;
        }
        return true;
    }

    @Override // X.TZM
    public final int LL(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        Integer num = this.LJLIL.get(interactId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.TZM
    public final int LLILZIL(String interactId) {
        int i;
        int i2;
        int i3;
        o.LJIIIZ(interactId, "interactId");
        Integer num = this.LJLIL.get(interactId);
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        Integer num2 = this.LJLILLLLZI.get(interactId);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 0;
        }
        Integer num3 = this.LJLJI.get(interactId);
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 0;
        }
        if (i3 == 2 || i2 == 2) {
            return 2;
        }
        if (i != 2 && i != 3 && i != 4) {
            return 0;
        }
        return 1;
    }

    @Override // X.TZM
    public final void LLIZ(N4W listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLJJL.getValue()).add(listener);
        listener.LIZJ(this);
    }

    @Override // X.TZM
    public final void LLLFF(N4W listener) {
        o.LJIIIZ(listener, "listener");
        ((ArrayList) this.LJLJJL.getValue()).remove(listener);
    }

    @Override // X.TZM
    public final int b(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        Integer num = this.LJLJJI.get(interactId);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // X.TZM
    public final boolean k(String interactId) {
        boolean z;
        o.LJIIIZ(interactId, "interactId");
        Integer num = this.LJLIL.get(interactId);
        if (num == null || (num.intValue() != 0 && num.intValue() != 1)) {
            z = false;
        } else {
            z = true;
        }
        return !z;
    }

    @Override // X.TZM
    public final void remove(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLIL.remove(interactId);
        this.LJLILLLLZI.remove(interactId);
        this.LJLJI.remove(interactId);
        this.LJLJJI.remove(interactId);
    }

    @Override // X.TZM
    public final boolean u(String interactId) {
        o.LJIIIZ(interactId, "interactId");
        Integer num = this.LJLILLLLZI.get(interactId);
        if (num == null || num.intValue() != 2) {
            return false;
        }
        return true;
    }

    @Override // X.TZM
    public final void LJJLIIIJJI(int i, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLIL.put(interactId, Integer.valueOf(i));
        L(interactId);
    }

    @Override // X.TZM
    public final void LJJLIIJ(int i, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLJI.put(interactId, Integer.valueOf(i));
        L(interactId);
    }

    @Override // X.TZM
    public final void LLILII(int i, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLJJI.put(interactId, Integer.valueOf(i));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(interactId);
        LIZ.append(' ');
        b1.LJ(LIZ, i, LIZ, "VoiceInfoKeeper");
        Iterator it = ((ArrayList) this.LJLJJL.getValue()).iterator();
        while (it.hasNext()) {
            ((N4W) it.next()).LIZ(this, interactId);
        }
    }

    @Override // X.TZM
    public final void LLLLZIL(int i, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        this.LJLILLLLZI.put(interactId, Integer.valueOf(i));
        L(interactId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0014, code lost:
    
        if (r4 != false) goto L7;
     */
    @Override // X.TZM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLIIII(java.lang.String r3, boolean r4, boolean r5) {
        /*
            r2 = this;
            int r1 = com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedSettings.getValue()
            r0 = 1
            if (r0 != r1) goto L14
            if (r4 == 0) goto L10
            if (r5 == 0) goto Lc
            r0 = 3
        Lc:
            r2.LJJLIIIJJI(r0, r3)
            return
        L10:
            if (r5 == 0) goto L17
            r0 = 4
            goto Lc
        L14:
            if (r4 == 0) goto L17
            goto Lc
        L17:
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4U.LLLIIII(java.lang.String, boolean, boolean):void");
    }

    public N4U(java.util.Map<String, Integer> map, java.util.Map<String, Integer> map2, java.util.Map<String, Integer> map3, java.util.Map<String, Integer> map4) {
        this.LJLIL = map;
        this.LJLILLLLZI = map2;
        this.LJLJI = map3;
        this.LJLJJI = map4;
    }
}
