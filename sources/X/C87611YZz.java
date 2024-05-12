package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS147S0200000_16;
import kotlin.jvm.internal.o;

/* renamed from: X.YZz, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87611YZz implements InterfaceC87588YZc {
    public final /* synthetic */ C87612Ya0 LIZ;

    @Override // X.InterfaceC87588YZc
    public final void onStart() {
        C87613Ya1 c87613Ya1 = this.LIZ.LIZ;
        c87613Ya1.getClass();
        ArrayList arrayList = new ArrayList();
        if (c87613Ya1.LIZ.isEmpty()) {
            C87614Ya2 c87614Ya2 = c87613Ya1.LIZJ;
            if (c87614Ya2 != null) {
                arrayList.addAll(c87614Ya2.LJFF);
            } else {
                o.LJIJI("net");
                throw null;
            }
        }
        C87614Ya2 c87614Ya22 = c87613Ya1.LIZJ;
        if (c87614Ya22 != null) {
            arrayList.addAll(c87614Ya22.LJ);
            java.util.Set<C87612Ya0> set = c87613Ya1.LIZ;
            ArrayList arrayList2 = new ArrayList();
            Iterator<C87612Ya0> it = set.iterator();
            while (it.hasNext()) {
                Object obj = ((C87595YZj) it.next().LIZJ()).LIZJ;
                if (obj != null) {
                    arrayList2.add(obj);
                }
            }
            arrayList.addAll(arrayList2);
            ERR err = new ERR(arrayList);
            if (o.LJ(this.LIZ.LJII, C87629YaH.LIZ)) {
                C87612Ya0 c87612Ya0 = this.LIZ;
                c87612Ya0.LIZJ = c87612Ya0.LJIIIIZZ.invoke();
                AbstractC43456H3s abstractC43456H3s = this.LIZ.LIZJ;
                o.LJI(abstractC43456H3s);
                abstractC43456H3s.LJ(err, new C87618Ya6(this.LIZ));
                return;
            }
            C87612Ya0 c87612Ya02 = this.LIZ;
            c87612Ya02.LIZ.LIZJ(new C41870Gby(c87612Ya02.LJII, err, new C41875Gc3(0)));
            this.LIZ.LJ("onStart", new AqS147S0200000_16(this, err, 8));
            return;
        }
        o.LJIJI("net");
        throw null;
    }

    public C87611YZz(C87612Ya0 c87612Ya0) {
        this.LIZ = c87612Ya0;
    }

    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Node:");
        LIZ.append(this.LIZ.LJII);
        LIZ.append(' ');
        LIZ.append(str);
        C41816Gb6.LIZIZ(777002, X1D.LIZIZ(LIZ), null);
    }

    @Override // X.InterfaceC87588YZc
    public final void LIZLLL(Object obj) {
        if (o.LJ(this.LIZ.LJII, C87629YaH.LIZ)) {
            return;
        }
        C87612Ya0 c87612Ya0 = this.LIZ;
        c87612Ya0.LIZ.LIZJ(new C41868Gbw(new C41875Gc3(0), c87612Ya0.LJII, obj));
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIZ(AbstractC42983Gtv cause) {
        o.LJIIIZ(cause, "cause");
        if (o.LJ(this.LIZ.LJII, C87629YaH.LIZ)) {
            return;
        }
        C87612Ya0 c87612Ya0 = this.LIZ;
        c87612Ya0.LIZ.LIZJ(new C41853Gbh(c87612Ya0.LJII, new C41875Gc3(0), cause));
        this.LIZ.LJ("onCancel", new AqS147S0200000_16(this, cause, 5));
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIJ(Object obj) {
        if (o.LJ(this.LIZ.LJII, C87629YaH.LIZ)) {
            return;
        }
        this.LIZ.getClass();
        this.LIZ.LJ("onPause", new AqS147S0200000_16(this, obj, 6));
    }

    @Override // X.InterfaceC87588YZc
    public final void LJ(Object obj, InterfaceC88472Yns<? super AbstractC87605YZt, C76800UCe> hasResultOnPaused) {
        o.LJIIIZ(hasResultOnPaused, "hasResultOnPaused");
        if (o.LJ(this.LIZ.LJII, C87629YaH.LIZ)) {
            return;
        }
        this.LIZ.getClass();
        C87612Ya0 c87612Ya0 = this.LIZ;
        AbstractC87605YZt abstractC87605YZt = c87612Ya0.LJFF;
        if (abstractC87605YZt instanceof C87604YZs) {
            hasResultOnPaused.invoke(abstractC87605YZt);
            C87604YZs c87604YZs = (C87604YZs) abstractC87605YZt;
            this.LIZ.LIZ.LIZLLL(c87604YZs.LIZIZ, c87604YZs.LIZJ, abstractC87605YZt.LIZ);
            return;
        }
        if (abstractC87605YZt instanceof C87603YZr) {
            hasResultOnPaused.invoke(abstractC87605YZt);
            this.LIZ.LIZ.LIZIZ(((C87603YZr) abstractC87605YZt).LIZIZ, abstractC87605YZt.LIZ);
        } else {
            c87612Ya0.LJ("onResume", new AqS147S0200000_16(this, obj, 7));
        }
    }

    @Override // X.InterfaceC87588YZc
    public final void LJFF(C42360Gjs e, boolean z, boolean z2, C41875Gc3 happenTime) {
        o.LJIIIZ(e, "e");
        o.LJIIIZ(happenTime, "happenTime");
        if (z) {
            if (this.LIZ.LIZLLL) {
                LIZ("set failed on cancel state when task support cancel");
            }
            C87612Ya0 c87612Ya0 = this.LIZ;
            c87612Ya0.LIZ.LIZJ(new C41868Gbw(happenTime, c87612Ya0.LJII, null));
            return;
        }
        if (z2) {
            if (this.LIZ.LJ) {
                LIZ("set failed on pause state when task support pause");
            }
            this.LIZ.LJFF = new C87603YZr(e, happenTime);
            return;
        }
        this.LIZ.LIZ.LIZIZ(e, happenTime);
    }

    @Override // X.InterfaceC87588YZc
    public final void LJIIIIZZ(Object obj, boolean z, boolean z2, boolean z3, C41875Gc3 happenTime) {
        o.LJIIIZ(happenTime, "happenTime");
        if (z2) {
            if (this.LIZ.LIZLLL) {
                LIZ("set success on cancel state when task support cancel");
            }
            C87612Ya0 c87612Ya0 = this.LIZ;
            c87612Ya0.LIZ.LIZJ(new C41868Gbw(happenTime, c87612Ya0.LJII, null));
            return;
        }
        if (z3) {
            if (this.LIZ.LJ) {
                LIZ("set success on pause state when task support pause");
            }
            this.LIZ.LJFF = new C87604YZs(obj, z, happenTime);
            return;
        }
        this.LIZ.LIZ.LIZLLL(obj, z, happenTime);
    }
}
