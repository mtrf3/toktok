package X;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NsZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60735NsZ extends C60736Nsa {
    public final ArrayList<C60736Nsa> LIZ = new ArrayList<>();
    public final InterfaceC65784Pro<C60736Nsa> LIZIZ;

    public C60735NsZ(AqS160S0100000_10 aqS160S0100000_10) {
        this.LIZIZ = aqS160S0100000_10;
    }

    @Override // X.C60736Nsa
    public final void LJI(C61295O3v response) {
        o.LJIIJ(response, "response");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LJI(response);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJI(response);
        }
    }

    @Override // X.C60736Nsa
    public final void LJII(O26 resourceInfo) {
        o.LJIIJ(resourceInfo, "resourceInfo");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LJII(resourceInfo);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJII(resourceInfo);
        }
    }

    @Override // X.C60736Nsa
    public final void LIZ(C61295O3v response, String url) {
        o.LJIIJ(url, "url");
        o.LJIIJ(response, "response");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LIZ(response, url);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZ(response, url);
        }
    }

    @Override // X.C60736Nsa
    public final void LIZIZ(O26 resourceInfo, String url) {
        o.LJIIJ(url, "url");
        o.LJIIJ(resourceInfo, "resourceInfo");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LIZIZ(resourceInfo, url);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(resourceInfo, url);
        }
    }

    @Override // X.C60736Nsa
    public final void LJ(C61295O3v response, String url) {
        o.LJIIJ(url, "url");
        o.LJIIJ(response, "response");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LJ(response, url);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJ(response, url);
        }
    }

    @Override // X.C60736Nsa
    public final void LJFF(O26 resourceInfo, String url) {
        o.LJIIJ(url, "url");
        o.LJIIJ(resourceInfo, "resourceInfo");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LJFF(resourceInfo, url);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LJFF(resourceInfo, url);
        }
    }

    @Override // X.C60736Nsa
    public final void LIZJ(String url, java.util.Map map, boolean z) {
        o.LJIIJ(url, "url");
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LIZJ(url, map, z);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZJ(url, map, z);
        }
    }

    @Override // X.C60736Nsa
    public final void LIZLLL(String str, java.util.Map map, boolean z) {
        C60736Nsa invoke = this.LIZIZ.invoke();
        if (invoke != null) {
            invoke.LIZLLL(str, map, z);
        }
        Iterator<C60736Nsa> it = this.LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZLLL(str, map, z);
        }
    }
}
