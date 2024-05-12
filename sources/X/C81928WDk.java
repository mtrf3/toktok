package X;

import android.graphics.drawable.Animatable;
import kotlin.jvm.internal.o;

/* renamed from: X.WDk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81928WDk implements W4Z<InterfaceC81599W0t> {
    public final String LIZ;
    public final String LIZIZ;
    public final C3VM LIZJ;
    public final C62822Ol8 LIZLLL;
    public boolean LJ;

    @Override // X.W4Z
    public final void LIZIZ(String str, Throwable th) {
    }

    public final String LJII() {
        return (String) this.LIZLLL.getValue();
    }

    @Override // X.W4Z
    public final void LIZJ(String str) {
        C3UX c84733Uf;
        if (this.LJ) {
            return;
        }
        if (C64861Pcv.LIZ(this.LIZIZ)) {
            String keyForPerfEvent = LJII();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LJII();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        this.LJ = true;
        C3VM c3vm = this.LIZJ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        c3vm.LIZ(c84733Uf, new C30J(str2, str3, false, false, null, null, 0, 0, false, 391));
    }

    public C81928WDk(String str, String scene) {
        C84683Ua durationPerfMon = C84683Ua.LJFF;
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(durationPerfMon, "durationPerfMon");
        this.LIZ = str;
        this.LIZIZ = scene;
        this.LIZJ = durationPerfMon;
        this.LIZLLL = C221108m2.LIZIZ(C63895P5v.LJLIL);
    }

    @Override // X.W4Z
    public final void LJ(String str, Throwable th) {
        C3UX c84733Uf;
        if (C64861Pcv.LIZ(this.LIZIZ)) {
            String keyForPerfEvent = LJII();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LJII();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        this.LJ = true;
        C3VM c3vm = this.LIZJ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZ;
        if (str3 == null) {
            str3 = "";
        }
        String LIZJ = C64861Pcv.LIZJ(th);
        String str4 = this.LIZ;
        if (str4 == null) {
            str4 = "empty url";
        }
        c3vm.LIZ(c84733Uf, new C30J(str2, str3, false, false, LIZJ, C64861Pcv.LIZIZ(str4, th), 0, 0, false, 7));
    }

    @Override // X.W4Z
    public final void LJI(Object obj, String str) {
        C3UX c84733Uf;
        if (C64861Pcv.LIZ(this.LIZIZ)) {
            String keyForPerfEvent = LJII();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LJII();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        this.LIZJ.LIZIZ(c84733Uf, true);
    }

    @Override // X.W4Z
    public final /* bridge */ /* synthetic */ void LIZLLL(Object obj, String str) {
    }

    @Override // X.W4Z
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LJFF(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
        C3UX c84733Uf;
        boolean z;
        int i;
        int i2;
        if (C64861Pcv.LIZ(this.LIZIZ)) {
            String keyForPerfEvent = LJII();
            o.LJIIIIZZ(keyForPerfEvent, "keyForPerfEvent");
            c84733Uf = new C4PF(keyForPerfEvent);
        } else {
            String keyForPerfEvent2 = LJII();
            o.LJIIIIZZ(keyForPerfEvent2, "keyForPerfEvent");
            c84733Uf = new C84733Uf(keyForPerfEvent2);
        }
        this.LJ = true;
        C3VM c3vm = this.LIZJ;
        if (animatable != null) {
            z = true;
        } else {
            z = false;
        }
        if (interfaceC81599W0t != null) {
            i = interfaceC81599W0t.getWidth();
            i2 = interfaceC81599W0t.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        String str2 = this.LIZ;
        if (str2 == null) {
            str2 = "";
        }
        c3vm.LIZ(c84733Uf, new C30J(this.LIZIZ, str2, z, true, null, null, i, i2, false, 384));
    }
}
