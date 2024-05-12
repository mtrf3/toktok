package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.O3c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61276O3c {
    public final Context LIZ;
    public final OAW LIZIZ;
    public final VJR LIZJ;
    public InterfaceC61566OEg LIZLLL;
    public final List<String> LJ;
    public final List<String> LJFF;
    public final C59125NIj LJI;
    public Long LJII;
    public final String LJIIIIZZ;
    public String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final File LJIIL;
    public final boolean LJIILIIL;
    public final boolean LJIILJJIL;

    public final PThreadPoolExecutor LIZ() {
        if (((Boolean) C34847Dlz.LIZIZ.getValue()).booleanValue()) {
            return C38019Ew3.LIZ;
        }
        return this.LIZJ;
    }

    public C61276O3c(O2T o2t) {
        Context context = o2t.LIZLLL;
        this.LIZ = context;
        if (context != null) {
            List<String> list = o2t.LIZIZ;
            this.LJ = list;
            List<String> list2 = o2t.LIZJ;
            this.LJFF = list2;
            this.LJI = o2t.LJFF;
            this.LJII = o2t.LJI;
            if (TextUtils.isEmpty(o2t.LJII)) {
                this.LJIIIIZZ = C61588OFc.LIZJ(context);
            } else {
                this.LJIIIIZZ = o2t.LJII;
            }
            this.LJIIIZ = o2t.LJIIIIZZ;
            this.LJIIJJI = o2t.LJIIJJI;
            File file = o2t.LJIIJ;
            if (file == null) {
                this.LJIIL = new File(C16880lQ.LLIIJLIL(context), "gecko_offline_res_x");
            } else {
                this.LJIIL = file;
            }
            String str = o2t.LJIIIZ;
            this.LJIIJ = str;
            if (!TextUtils.isEmpty(str)) {
                if (list != null && !list.isEmpty()) {
                    if (list2 != null && !list2.isEmpty()) {
                        if (list2.containsAll(list)) {
                            if (this.LJII != null) {
                                if (!TextUtils.isEmpty(this.LJIIIZ)) {
                                    OAP oap = OAR.LIZ;
                                    if (oap.LIZJ == null) {
                                        oap.LIZJ = new OAW();
                                    }
                                    this.LIZIZ = oap.LIZJ;
                                    if (oap.LIZ == null) {
                                        VJR vjr = new VJR(TimeUnit.SECONDS, new OAL());
                                        oap.LIZ = vjr;
                                        vjr.allowCoreThreadTimeOut(true);
                                    }
                                    this.LIZJ = oap.LIZ;
                                    InterfaceC61566OEg interfaceC61566OEg = o2t.LIZ;
                                    if (interfaceC61566OEg == null) {
                                        this.LIZLLL = new C64602PXa();
                                    } else {
                                        this.LIZLLL = interfaceC61566OEg;
                                    }
                                    this.LJIILIIL = o2t.LJIIL;
                                    this.LJIILJJIL = true;
                                    return;
                                }
                                throw new IllegalArgumentException("deviceId key empty");
                            }
                            throw new IllegalArgumentException("appId is null");
                        }
                        throw new IllegalArgumentException("local accessKey must contain accessKey");
                    }
                    throw new IllegalArgumentException("local accessKey is empty");
                }
                throw new IllegalArgumentException("accessKey is empty");
            }
            throw new IllegalArgumentException("host is null");
        }
        throw new IllegalArgumentException("context == null");
    }
}
