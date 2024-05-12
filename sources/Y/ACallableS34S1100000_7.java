package Y;

import X.C268613q;
import X.C36922EeM;
import X.C42348Gjg;
import X.C42622Go6;
import X.C42627GoB;
import X.C44172HVg;
import X.C44694HgQ;
import X.C45700Hwe;
import X.C45702Hwg;
import X.C76800UCe;
import X.C84386X9y;
import X.EnumC72807Shn;
import X.InterfaceC42413Gkj;
import X.InterfaceC44698HgU;
import X.SFS;
import X.W5F;
import X.W5U;
import X.X1D;
import X.X5R;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.n;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.live.livehostimpl.LiveBusinessExtra;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes8.dex */
public class ACallableS34S1100000_7 implements Callable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        try {
            return (LiveBusinessExtra) GsonProtectorUtils.fromJson((Gson) aCallableS34S1100000_7.l1, aCallableS34S1100000_7.s0, LiveBusinessExtra.class);
        } catch (n | ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static final Object call$1(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        W5F LJFF = W5U.LJFF(C44694HgQ.LJIIIIZZ(aCallableS34S1100000_7.s0));
        int i = (int) ((C45700Hwe) aCallableS34S1100000_7.l1).LJLILLLLZI;
        int LJI = SFS.LJI(48.0d);
        LJFF.LJII = i;
        LJFF.LJIIIIZZ = LJI;
        LJFF.LJIJI = Bitmap.Config.ARGB_8888;
        LJFF.LJIJJ = EnumC72807Shn.CENTER_CROP;
        LJFF.LJJIJIL = true;
        LJFF.LJIIIZ(new C45702Hwg((C45700Hwe) aCallableS34S1100000_7.l1, aCallableS34S1100000_7.s0));
        return C76800UCe.LIZ;
    }

    public static final Object call$2(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        boolean z;
        try {
            z = C268613q.LJIIJJI(C44694HgQ.LJIILIIL.LJ(), (Uri) aCallableS34S1100000_7.l1);
            C44694HgQ.LJIIIZ.put(aCallableS34S1100000_7.s0, Boolean.valueOf(z));
        } catch (Exception e) {
            C44694HgQ.LJIILIIL.getClass();
            InterfaceC44698HgU interfaceC44698HgU = C44694HgQ.LIZJ;
            if (interfaceC44698HgU != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("path:");
                LIZ.append(aCallableS34S1100000_7.s0);
                LIZ.append(", ");
                LIZ.append(Log.getStackTraceString(e));
                X1D.LIZIZ(LIZ);
                interfaceC44698HgU.LIZ();
            }
            InterfaceC44698HgU interfaceC44698HgU2 = C44694HgQ.LIZJ;
            if (interfaceC44698HgU2 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("path:");
                LIZ2.append(aCallableS34S1100000_7.s0);
                LIZ2.append(", ");
                LIZ2.append(Log.getStackTraceString(e));
                interfaceC44698HgU2.LIZIZ(9, X1D.LIZIZ(LIZ2));
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object call$3(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        C42348Gjg LIZ = ((C84386X9y) ((VEMediaParserFrameProviderImpl) aCallableS34S1100000_7.l1).LJLJJL.getValue()).LIZ(aCallableS34S1100000_7.s0);
        if (LIZ != null) {
            return LIZ.LJLJI;
        }
        return null;
    }

    public static final Object call$4(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        X5R with;
        boolean z;
        Context context = (Context) aCallableS34S1100000_7.l1;
        String str = aCallableS34S1100000_7.s0;
        if (context != null) {
            try {
                String guessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                Uri LIZJ = C268613q.LIZJ(context, guessFileName);
                with = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                with.LIZJ = guessFileName;
                with.LJ = LIZJ.toString();
                with.LJIIJ = "ss_web_settings";
            } catch (Throwable unused) {
            }
            if (with.LIZJ() != 0) {
                z = true;
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }

    public static final Object call$5(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        try {
            Keva keva = C42622Go6.LJIIIIZZ;
            keva.storeString("promote_replace_music_map_key", C44172HVg.LIZIZ.LJIILLIIL((Map) aCallableS34S1100000_7.l1, new C42627GoB().getType()));
            long currentTimeMillis = System.currentTimeMillis();
            if (aCallableS34S1100000_7.s0 != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(aCallableS34S1100000_7.s0);
                LIZ.append("_promote_replace_music_request_sava_time");
                keva.storeLong(X1D.LIZIZ(LIZ), currentTimeMillis);
            }
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(" PromoteReplaceMusic saveData Exception: ");
            LIZ2.append(e);
            C36922EeM.LJ(X1D.LIZIZ(LIZ2));
            C36922EeM.LJFF(e);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        C42348Gjg LIZ = ((C84386X9y) ((VEMediaParserProviderV2) aCallableS34S1100000_7.l1).LJLJL.getValue()).LIZ(aCallableS34S1100000_7.s0);
        if (LIZ != null) {
            return LIZ.LJLJI;
        }
        return null;
    }

    public static final Object call$7(ACallableS34S1100000_7 aCallableS34S1100000_7) {
        ((InterfaceC42413Gkj) aCallableS34S1100000_7.l1).LIZIZ();
        ((InterfaceC42413Gkj) aCallableS34S1100000_7.l1).onSuccess(aCallableS34S1100000_7.s0);
        return C76800UCe.LIZ;
    }

    public ACallableS34S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
