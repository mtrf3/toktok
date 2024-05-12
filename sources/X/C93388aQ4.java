package X;

import android.os.RemoteException;
import androidx.fragment.app.Fragment;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.SupportMapFragment;
import java.util.ArrayList;

/* renamed from: X.aQ4, reason: case insensitive filesystem */
/* loaded from: classes32.dex */
public final class C93388aQ4 implements InterfaceC191227ew {
    public final C191247ey LIZ;
    public SupportMapFragment LIZIZ;

    @Override // X.InterfaceC191227ew
    public final Fragment LIZIZ() {
        C191247ey c191247ey = this.LIZ;
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        int i = C93354aPW.LIZ[c191247ey.LIZJ.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            i2 = 4;
                        } else {
                            throw new C162476Zf();
                        }
                    }
                } else {
                    i2 = 2;
                }
            }
        } else {
            i2 = 0;
        }
        googleMapOptions.zzd = i2;
        Boolean bool = Boolean.TRUE;
        googleMapOptions.zzi = bool;
        googleMapOptions.zzh = bool;
        googleMapOptions.zzk = Boolean.valueOf(c191247ey.LIZ);
        googleMapOptions.zzj = Boolean.valueOf(c191247ey.LIZIZ);
        SupportMapFragment vl = SupportMapFragment.vl(googleMapOptions);
        this.LIZIZ = vl;
        return vl;
    }

    public C93388aQ4(C191247ey c191247ey) {
        this.LIZ = c191247ey;
    }

    @Override // X.InterfaceC191227ew
    public final void LIZ(InterfaceC88472Yns<? super C8DU, C76800UCe> interfaceC88472Yns) {
        C93401aQH c93401aQH = new C93401aQH(this, interfaceC88472Yns);
        SupportMapFragment supportMapFragment = this.LIZIZ;
        if (supportMapFragment != null) {
            C93387aQ3 c93387aQ3 = new C93387aQ3(c93401aQH);
            QH7.LJ("getMapAsync must be called on the main thread.");
            C68817Qzd c68817Qzd = supportMapFragment.LJLIL;
            T t = c68817Qzd.LIZ;
            if (t != 0) {
                try {
                    ((R01) t).LIZIZ.a0(new BinderC68820Qzg(c93387aQ3));
                    return;
                } catch (RemoteException e) {
                    throw new C68463Qtv(e);
                }
            }
            ((ArrayList) c68817Qzd.LJII).add(c93387aQ3);
        }
    }
}
