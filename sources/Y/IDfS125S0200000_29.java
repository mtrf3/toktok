package Y;

import X.C91149Zpx;
import X.C91247ZrX;
import X.C91330Zss;
import X.C91469Zv7;
import X.C91485ZvN;
import X.C91494ZvW;
import X.C91495ZvX;
import X.InterfaceC64592gB;
import X.InterfaceC91296ZsK;
import X.InterfaceC91298ZsM;
import X.X1D;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerViewModel;
import com.ss.android.ugc.aweme.dsp.playpage.mainpage.MainPlayerViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes22.dex */
public class IDfS125S0200000_29 implements InterfaceC64592gB {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void accept$0(IDfS125S0200000_29 iDfS125S0200000_29, Object obj) {
        String str;
        String id = ((InterfaceC91296ZsK) iDfS125S0200000_29.l0).getId();
        InterfaceC91296ZsK interfaceC91296ZsK = ((C91330Zss) iDfS125S0200000_29.l1).LJLJJI;
        if (interfaceC91296ZsK != null) {
            str = interfaceC91296ZsK.getId();
        } else {
            str = null;
        }
        if (!o.LJ(id, str)) {
            return;
        }
        InterfaceC91298ZsM LIZ = ((InterfaceC91296ZsK) iDfS125S0200000_29.l0).LIZ();
        if (!(LIZ instanceof C91469Zv7)) {
            return;
        }
        C91469Zv7 c91469Zv7 = (C91469Zv7) LIZ;
        ((C91330Zss) iDfS125S0200000_29.l1).LJIIL().LJI(c91469Zv7.LIZ.getUrlPlayerInfo(), c91469Zv7.LIZ.getAuthorization(), c91469Zv7.LIZ.getVideoModel());
        ((C91330Zss) iDfS125S0200000_29.l1).LJIIL().LIZJ();
    }

    public static final void accept$1(IDfS125S0200000_29 iDfS125S0200000_29, Object obj) {
        C91485ZvN c91485ZvN = (C91485ZvN) iDfS125S0200000_29.l0;
        InterfaceC91296ZsK interfaceC91296ZsK = (InterfaceC91296ZsK) iDfS125S0200000_29.l1;
        c91485ZvN.getClass();
        C91149Zpx.LIZIZ(interfaceC91296ZsK.LJIIIIZZ().getDspMusic().getPlayInfo(), null);
        String.valueOf(((InterfaceC91296ZsK) iDfS125S0200000_29.l1).LJIIIIZZ().getDspMusic().getPlayInfo());
    }

    public static final void accept$2(IDfS125S0200000_29 iDfS125S0200000_29, Object obj) {
        List it = (List) obj;
        o.LJIIIIZZ(it, "it");
        if (!it.isEmpty()) {
            ((FavPlayerViewModel) iDfS125S0200000_29.l0).LJLJJI.setValue(Boolean.FALSE);
            ((FavPlayerViewModel) iDfS125S0200000_29.l0).kv0((C91495ZvX) iDfS125S0200000_29.l1);
        } else {
            ((FavPlayerViewModel) iDfS125S0200000_29.l0).LJLJJI.setValue(Boolean.TRUE);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadData ");
        LIZ.append(!it.isEmpty());
        X1D.LIZIZ(LIZ);
    }

    public static final void accept$3(IDfS125S0200000_29 iDfS125S0200000_29, Object obj) {
        List it = (List) obj;
        o.LJIIIIZZ(it, "it");
        if (!it.isEmpty()) {
            C91247ZrX.LIZ(((MainPlayerViewModel) iDfS125S0200000_29.l0).LJLJJI, Boolean.FALSE);
            ((MainPlayerViewModel) iDfS125S0200000_29.l0).kv0((C91494ZvW) iDfS125S0200000_29.l1);
        } else {
            C91247ZrX.LIZ(((MainPlayerViewModel) iDfS125S0200000_29.l0).LJLJJI, Boolean.TRUE);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MainPlayerViewModel ");
        LIZ.append(!it.isEmpty());
        X1D.LIZIZ(LIZ);
    }

    public IDfS125S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
