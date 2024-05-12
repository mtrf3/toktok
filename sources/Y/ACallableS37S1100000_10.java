package Y;

import X.C198517qh;
import X.C38262Ezy;
import X.C39048FUe;
import X.C39398FdC;
import X.C39836FkG;
import X.C39973FmT;
import X.C47261Igj;
import X.C59835Ne3;
import X.C61161NzR;
import X.C61228O1g;
import X.C61229O1h;
import X.C61328O5c;
import X.C64923Pdv;
import X.C66621QCr;
import X.C76800UCe;
import X.C78685UuP;
import X.C78983UzD;
import X.EJ6;
import X.FLE;
import X.InterfaceC60302Nla;
import X.InterfaceC60323Nlv;
import X.InterfaceC61858OPm;
import X.N96;
import X.NHG;
import X.O2V;
import X.O6D;
import X.O6E;
import X.OJP;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.commercialize.track.RawURLGetter;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ACallableS37S1100000_10 implements Callable {
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
            case 8:
                return call$8(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        boolean z;
        List<InterfaceC61858OPm> LJJIJIL;
        String LIZIZ = FLE.LIZIZ();
        if (LIZIZ.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            LJJIJIL = null;
        } else {
            LJJIJIL = C47261Igj.LJJIJIL(new C66621QCr("User-Agent", LIZIZ));
        }
        ArrayList arrayList = new ArrayList();
        if (LJJIJIL != null) {
            for (InterfaceC61858OPm interfaceC61858OPm : LJJIJIL) {
                arrayList.add(new EJ6(interfaceC61858OPm.getName(), interfaceC61858OPm.getValue()));
            }
        }
        try {
            ((RawURLGetter.RawUrlApi) RawURLGetter.LIZ.getValue()).doGet(aCallableS37S1100000_10.s0, arrayList).get();
            N96 n96 = (N96) aCallableS37S1100000_10.l1;
            if (n96 != null) {
                try {
                    n96.LIZ(200, null, true);
                } catch (Throwable th) {
                    C78983UzD.LJIIZILJ(th);
                }
            }
        } catch (C64923Pdv e) {
            C78983UzD.LJIIZILJ(e);
            N96 n962 = (N96) aCallableS37S1100000_10.l1;
            int statusCode = e.getStatusCode();
            if (n962 != null) {
                try {
                    n962.LIZ(statusCode, e, false);
                } catch (Throwable th2) {
                    C78983UzD.LJIIZILJ(th2);
                }
            }
        } catch (Exception e2) {
            N96 n963 = (N96) aCallableS37S1100000_10.l1;
            int LIZ = C61161NzR.LIZIZ.LIZ.LIZ(e2);
            if (n963 != null) {
                try {
                    n963.LIZ(LIZ, e2, false);
                } catch (Throwable th3) {
                    C78983UzD.LJIIZILJ(th3);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        O6D o6d = (O6D) aCallableS37S1100000_10.l1;
        String str = aCallableS37S1100000_10.s0;
        o6d.getClass();
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("enter_from", "click_tab");
        c198517qh.LIZ.put("previous_page", o6d.LJLJL);
        if (TextUtils.equals("homepage_hot", o6d.LJLJL)) {
            c198517qh.LIZ.put("group_id", O6E.LIZ);
            c198517qh.LIZLLL("author_id", O6E.LIZIZ);
        }
        String str2 = o6d.LJLLI.get(str);
        if (!TextUtils.isEmpty(str2)) {
            o.LJI(str2);
            JSONObject LJ = c198517qh.LJ();
            C39398FdC.LIZ.getClass();
            C39398FdC.LIZIZ(str2, LJ);
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (X.C19N.LJ("ug_diff_download_report_only_diff", false) != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS37S1100000_10 r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS37S1100000_10.call$2(Y.ACallableS37S1100000_10):java.lang.Object");
    }

    public static final Object call$3(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        ((ScanQRCodeActivityV2) aCallableS37S1100000_10.l1).LLIIIJ(aCallableS37S1100000_10.s0);
        return null;
    }

    public static final Object call$4(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        InterfaceC60302Nla Zf;
        try {
            ((C61229O1h) aCallableS37S1100000_10.l1).LJ.invoke(new Throwable(aCallableS37S1100000_10.s0));
        } catch (Throwable th) {
            InterfaceC60323Nlv interfaceC60323Nlv = ((C61229O1h) aCallableS37S1100000_10.l1).LIZLLL.LJIIJ;
            if (interfaceC60323Nlv == null || (Zf = interfaceC60323Nlv.Zf()) == null || !Zf.isDebug()) {
                C61228O1g c61228O1g = ((C61229O1h) aCallableS37S1100000_10.l1).LIZ;
                StringBuilder LIZ = X1D.LIZ();
                C39973FmT.LIZIZ(c61228O1g, C61328O5c.LIZLLL(LIZ, ((C61229O1h) aCallableS37S1100000_10.l1).LIZ.LJLIL, ":reject error ", th, LIZ), null, null, 6);
            } else {
                throw new Throwable(th);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        IAppLogDepend LIZ = C59835Ne3.LIZ();
        if (LIZ != null) {
            LIZ.onEventV3Json(aCallableS37S1100000_10.s0, (JSONObject) aCallableS37S1100000_10.l1);
            return C76800UCe.LIZ;
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:4|(3:10|(3:12|(1:14)(1:21)|15)(3:22|(1:24)(1:26)|25)|(3:17|(1:20)|19))|(5:77|(2:85|(3:87|(1:89)(1:91)|90))|92|(5:148|149|150|(1:152)|153)|(10:95|(1:139)|101|(1:109)|110|(1:120)|121|(1:129)|130|(13:134|31|32|(4:34|(1:38)|39|(1:43))|44|(1:72)(1:50)|51|(4:53|54|(3:56|57|(6:59|60|(2:65|64)|62|63|64))|67)|69|(2:71|67)|54|(0)|67)))|28|(1:30)|31|32|(0)|44|(1:46)|72) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x025d, code lost:
    
        if (r5 != null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x025a, code lost:
    
        if (r5 != null) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x024e, code lost:
    
        if (r5 == null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0195, code lost:
    
        X.C78983UzD.LJIIZILJ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$6(Y.ACallableS37S1100000_10 r22) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS37S1100000_10.call$6(Y.ACallableS37S1100000_10):java.lang.Object");
    }

    public static final Object call$7(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        String str;
        if (C78685UuP.LJJJZ(aCallableS37S1100000_10.s0)) {
            str = aCallableS37S1100000_10.s0;
        } else {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI != null) {
                str = LJJI.LJIIL("lynx_feed");
            } else {
                str = null;
            }
        }
        OJP ojp = (OJP) aCallableS37S1100000_10.l1;
        if (ojp == null) {
            return null;
        }
        Iterator<E> it = ojp.iterator();
        while (it.hasNext()) {
            NHG.LIZJ((String) it.next(), str);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$8(ACallableS37S1100000_10 aCallableS37S1100000_10) {
        try {
            ((O2V) aCallableS37S1100000_10.l1).LIZLLL.invoke(new Throwable(aCallableS37S1100000_10.s0));
        } catch (Throwable th) {
            C39836FkG.LJII.getClass();
            if (!C38262Ezy.LIZ().LIZ) {
                C39048FUe c39048FUe = C39048FUe.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                C39048FUe.LIZIZ(c39048FUe, C61328O5c.LIZLLL(LIZ, ((O2V) aCallableS37S1100000_10.l1).LIZ.LIZ, ":reject error ", th, LIZ), null, null, 6);
            } else {
                throw new Throwable(th);
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS37S1100000_10(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
