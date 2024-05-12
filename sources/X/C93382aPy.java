package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.aPy, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93382aPy implements C8DU {
    public final C68824Qzk LIZ;
    public final List<C93392aQ8> LIZIZ;

    @Override // X.C8DU
    public final C8DV LJJIIZI() {
        return new C93393aQ9(this.LIZ);
    }

    @Override // X.C8DU
    public final C53747L7n LJJIJL() {
        try {
            VisibleRegion LJJIJL = ((InterfaceC68804QzQ) this.LIZ.LIZLLL().LJLIL).LJJIJL();
            o.LJIIIIZZ(LJJIJL, "googleMap.projection.visibleRegion");
            LatLng latLng = LJJIJL.nearLeft;
            C191427fG c191427fG = new C191427fG(latLng.latitude, latLng.longitude);
            LatLng latLng2 = LJJIJL.nearRight;
            C191427fG c191427fG2 = new C191427fG(latLng2.latitude, latLng2.longitude);
            LatLng latLng3 = LJJIJL.farLeft;
            C191427fG c191427fG3 = new C191427fG(latLng3.latitude, latLng3.longitude);
            LatLng latLng4 = LJJIJL.farRight;
            C191427fG c191427fG4 = new C191427fG(latLng4.latitude, latLng4.longitude);
            LatLng latLng5 = LJJIJL.latLngBounds.southwest;
            C191427fG c191427fG5 = new C191427fG(latLng5.latitude, latLng5.longitude);
            LatLng latLng6 = LJJIJL.latLngBounds.northeast;
            return new C53747L7n(c191427fG, c191427fG2, c191427fG3, c191427fG4, new C53746L7m(c191427fG5, new C191427fG(latLng6.latitude, latLng6.longitude)));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final C191207eu LJJJI() {
        return new C191207eu(this.LIZ.LIZJ().zoom, new C191427fG(this.LIZ.LIZJ().target.latitude, this.LIZ.LIZJ().target.longitude), this.LIZ.LIZJ().tilt, this.LIZ.LIZJ().bearing);
    }

    @Override // X.C8DU
    public final void LJJJJIZL() {
        Iterator it = ((ArrayList) this.LIZIZ).iterator();
        while (it.hasNext()) {
            R0A r0a = ((C93392aQ8) it.next()).LIZ;
            r0a.getClass();
            try {
                r0a.LIZ.LJIILLIIL();
            } catch (RemoteException e) {
                throw new C68463Qtv(e);
            }
        }
        ((ArrayList) this.LIZIZ).clear();
    }

    @Override // X.C8DU
    public final float LJJJJL() {
        return this.LIZ.LIZJ().zoom;
    }

    @Override // X.C8DU
    public final void LJJJJLL() {
        C68824Qzk c68824Qzk = this.LIZ;
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.clear();
            ((ArrayList) this.LIZIZ).clear();
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    public C93382aPy(C68824Qzk googleMap) {
        o.LJIIIZ(googleMap, "googleMap");
        this.LIZ = googleMap;
        this.LIZIZ = new ArrayList();
    }

    @Override // X.C8DU
    public final void LJJIJLIJ(AqS175S0100000_9 aqS175S0100000_9) {
        C68824Qzk c68824Qzk = this.LIZ;
        C93385aQ1 c93385aQ1 = new C93385aQ1(aqS175S0100000_9);
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.LJLIIL(new R0M(c93385aQ1));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        C68824Qzk c68824Qzk = this.LIZ;
        C93381aPx c93381aPx = new C93381aPx(interfaceC65784Pro);
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.LLLLLLIL(new R0V(c93381aPx));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJIZ(InterfaceC88472Yns<? super C191207eu, C76800UCe> interfaceC88472Yns) {
        C68824Qzk c68824Qzk = this.LIZ;
        C93380aPw c93380aPw = new C93380aPw(interfaceC88472Yns, this);
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.Q(new R0Q(c93380aPw));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJJJI(AqS159S0100000_9 aqS159S0100000_9) {
        C68824Qzk c68824Qzk = this.LIZ;
        C93386aQ2 c93386aQ2 = new C93386aQ2(aqS159S0100000_9);
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.LJLILLLLZI(new R0U(c93386aQ2));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJJJJL(boolean z) {
        C68824Qzk c68824Qzk = this.LIZ;
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.m(z);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final <T extends InterfaceC191727fk> M36<T> LJJJJLI(Context context) {
        return new C93371aPn(context, this.LIZ);
    }

    @Override // X.C8DU
    public final void LJJJJZ(int i) {
        C68824Qzk c68824Qzk = this.LIZ;
        c68824Qzk.getClass();
        try {
            c68824Qzk.LIZ.LJLIL(i);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final C8DT LJJJJZI(C191427fG c191427fG) {
        try {
            o.LJIIIIZZ((Point) BinderC68153Qov.LLJJIII(((InterfaceC68804QzQ) this.LIZ.LIZLLL().LJLIL).LLIIL(new LatLng(c191427fG.getLat(), c191427fG.getLon()))), "googleMap.projection.toS…ation.lat, location.lon))");
            return new C8DT(r1.x, r1.y);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final C8DW LJJJLIIL(M3I m3i) {
        C68824Qzk c68824Qzk = this.LIZ;
        CircleOptions circleOptions = new CircleOptions();
        C191717fj c191717fj = m3i.LIZ;
        if (c191717fj != null) {
            circleOptions.zza = new LatLng(c191717fj.getLatitude(), c191717fj.getLongitude());
        }
        Double d = m3i.LIZIZ;
        if (d != null) {
            circleOptions.zzb = d.doubleValue();
        }
        Integer num = m3i.LIZJ;
        if (num != null) {
            circleOptions.zze = num.intValue();
        }
        Integer num2 = m3i.LIZLLL;
        if (num2 != null) {
            circleOptions.zzd = num2.intValue();
        }
        Float f = m3i.LJ;
        if (f != null) {
            circleOptions.zzc = f.floatValue();
        }
        Float f2 = m3i.LJFF;
        if (f2 != null) {
            circleOptions.zzf = f2.floatValue();
        }
        circleOptions.zzg = true;
        c68824Qzk.getClass();
        try {
            return new C93391aQ7(new C68837Qzx(c68824Qzk.LIZ.LJJLIL(circleOptions)));
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final InterfaceC199637sV LJJJJJ(C191427fG latlon, C199627sU c199627sU) {
        o.LJIIIZ(latlon, "latlon");
        C68824Qzk c68824Qzk = this.LIZ;
        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.LJJJJL(new LatLng(latlon.getLat(), latlon.getLon()));
        markerOptions.zzh = true;
        markerOptions.zzm = 1.0f;
        String str = c199627sU.LIZIZ;
        if (str != null) {
            markerOptions.zzb = str;
        }
        Bitmap bitmap = c199627sU.LIZ;
        if (bitmap != null) {
            markerOptions.zzd = C78949Uyf.LJIILJJIL(bitmap);
        }
        c68824Qzk.getClass();
        try {
            R04 LJLJJI = c68824Qzk.LIZ.LJLJJI(markerOptions);
            if (LJLJJI == null) {
                return null;
            }
            C93392aQ8 c93392aQ8 = new C93392aQ8(new R0A(LJLJJI));
            ((ArrayList) this.LIZIZ).add(c93392aQ8);
            return c93392aQ8;
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJJ(C191427fG latlon, Float f, M3P m3p) {
        float LJJJJL;
        o.LJIIIZ(latlon, "latlon");
        if (f != null) {
            LJJJJL = f.floatValue();
        } else {
            LJJJJL = LJJJJL();
        }
        LatLng latLng = new LatLng(latlon.getLat(), latlon.getLon());
        try {
            InterfaceC68803QzP interfaceC68803QzP = C17J.LJLJJLL;
            QH7.LJIIIZ(interfaceC68803QzP, "CameraUpdateFactory is not initialized");
            C30931Jh c30931Jh = new C30931Jh(interfaceC68803QzP.J(latLng, LJJJJL));
            C93379aPv c93379aPv = new C93379aPv(m3p);
            if (m3p != null && m3p.LIZ) {
                Long l = m3p.LIZIZ;
                if (l != null) {
                    this.LIZ.LIZ(c30931Jh, (int) l.longValue(), c93379aPv);
                    l.longValue();
                    return;
                }
                this.LIZ.LIZIZ(c30931Jh, c93379aPv);
                return;
            }
            this.LIZ.LJFF(c30931Jh);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJJJ(C191427fG c191427fG, C191427fG c191427fG2, M3P m3p) {
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(c191427fG2.getLat(), c191427fG.getLon()), new LatLng(c191427fG.getLat(), c191427fG2.getLon()));
        try {
            InterfaceC68803QzP interfaceC68803QzP = C17J.LJLJJLL;
            QH7.LJIIIZ(interfaceC68803QzP, "CameraUpdateFactory is not initialized");
            C30931Jh c30931Jh = new C30931Jh(interfaceC68803QzP.LLIL(latLngBounds));
            C93383aPz c93383aPz = new C93383aPz(m3p);
            if (m3p != null && m3p.LIZ) {
                Long l = m3p.LIZIZ;
                if (l != null) {
                    this.LIZ.LIZ(c30931Jh, (int) l.longValue(), c93383aPz);
                    l.longValue();
                    return;
                }
                this.LIZ.LIZIZ(c30931Jh, c93383aPz);
                return;
            }
            this.LIZ.LJFF(c30931Jh);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }

    @Override // X.C8DU
    public final void LJJJIL(C191427fG c191427fG, C191427fG c191427fG2, int i, int i2, M3P m3p) {
        LatLngBounds latLngBounds = new LatLngBounds(new LatLng(c191427fG2.getLat(), c191427fG.getLon()), new LatLng(c191427fG.getLat(), c191427fG2.getLon()));
        try {
            InterfaceC68803QzP interfaceC68803QzP = C17J.LJLJJLL;
            QH7.LJIIIZ(interfaceC68803QzP, "CameraUpdateFactory is not initialized");
            C30931Jh c30931Jh = new C30931Jh(interfaceC68803QzP.LLJILJIL(latLngBounds, i, i2));
            C93384aQ0 c93384aQ0 = new C93384aQ0(m3p);
            if (m3p.LIZ) {
                Long l = m3p.LIZIZ;
                if (l != null) {
                    this.LIZ.LIZ(c30931Jh, (int) l.longValue(), c93384aQ0);
                    l.longValue();
                    return;
                }
                this.LIZ.LIZIZ(c30931Jh, c93384aQ0);
                return;
            }
            this.LIZ.LJFF(c30931Jh);
        } catch (RemoteException e) {
            throw new C68463Qtv(e);
        }
    }
}
