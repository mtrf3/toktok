package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C31999Ch9;
import X.C36817Ecf;
import X.C38515F9r;
import X.C38805FKv;
import X.C61295O3v;
import X.C65896Ptc;
import X.C66532Q9g;
import X.C76800UCe;
import X.C79604VMa;
import X.ET4;
import X.EnumC39910FlS;
import X.F9J;
import X.FD4;
import X.FD5;
import X.InterfaceC38802FKs;
import X.InterfaceC60761Nsz;
import X.InterfaceC65784Pro;
import X.InterfaceC88471Ynr;
import X.NJ1;
import X.ORZ;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.android.monitorV2.HybridMultiMonitor;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.keva.KevaImpl;
import com.kakao.sdk.common.KakaoSdk;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class AqS73S1100000_6 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case 9:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS73S1100000_6 aqS73S1100000_6) {
        C61295O3v LIZ;
        WebResourceResponse V;
        NJ1 nj1 = (NJ1) aqS73S1100000_6.l1;
        String str = aqS73S1100000_6.s0;
        nj1.getClass();
        Forest forest = AdWebViewInterceptorService.LIZJ().LIZIZ().LIZ;
        OSZ osz = null;
        boolean z = true;
        RequestParams requestParams = new RequestParams(null, 1, null);
        requestParams.setDisableOffline(true);
        requestParams.setEnableMemoryCache(Boolean.TRUE);
        requestParams.setDisableBuiltin(true);
        requestParams.setEnableRequestReuse(true);
        requestParams.setDisablePrefixParser(true);
        requestParams.setDisableCdn(true);
        requestParams.setLoadToMemory(true);
        requestParams.setNetWorker(EnumC39910FlS.TTNet);
        C38515F9r createSyncRequest = forest.createSyncRequest(str, requestParams);
        if (createSyncRequest != null && (LIZ = createSyncRequest.LIZ()) != null && (V = LIZ.V()) != null) {
            if (!LIZ.LJLLLL && !LIZ.LJLLLLLL) {
                z = false;
            }
            osz = new OSZ(V, Boolean.valueOf(z));
        }
        return osz;
    }

    public static final Object invoke$1(AqS73S1100000_6 aqS73S1100000_6) {
        return F9J.LIZIZ(((C36817Ecf) aqS73S1100000_6.l1).LIZIZ, 0, aqS73S1100000_6.s0);
    }

    public static final Object invoke$2(AqS73S1100000_6 aqS73S1100000_6) {
        KakaoSdk.init$default((Context) aqS73S1100000_6.l1, aqS73S1100000_6.s0, null, null, null, null, null, 124, null);
        return C66532Q9g.LIZ(C76800UCe.LIZ);
    }

    public static final Object invoke$3(AqS73S1100000_6 aqS73S1100000_6) {
        return KevaImpl.getRepoFromSp((Context) aqS73S1100000_6.l1, aqS73S1100000_6.s0, 0);
    }

    public static final Object invoke$4(AqS73S1100000_6 aqS73S1100000_6) {
        return F9J.LIZIZ((Context) aqS73S1100000_6.l1, 0, aqS73S1100000_6.s0);
    }

    public static final Object invoke$5(AqS73S1100000_6 aqS73S1100000_6) {
        boolean z;
        String path;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RequestStackManager handleRequestStack ");
        LIZ.append((C65896Ptc) aqS73S1100000_6.l1);
        LIZ.append(" threadName:");
        LIZ.append(aqS73S1100000_6.s0);
        LIZ.append(" hasPath:");
        Uri uri = (Uri) ORZ.LJLLLL(((C65896Ptc) aqS73S1100000_6.l1).LJLILLLLZI);
        if (uri == null || (path = uri.getPath()) == null || ujb.o.LJJJJJL(path)) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(!z);
        return X1D.LIZIZ(LIZ);
    }

    public static final Object invoke$6(AqS73S1100000_6 aqS73S1100000_6) {
        ((ArrayList) ((ET4) aqS73S1100000_6.l1).LIZJ).add(aqS73S1100000_6.s0);
        ((ET4) aqS73S1100000_6.l1).LIZ();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS73S1100000_6 aqS73S1100000_6) {
        InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) aqS73S1100000_6.l1;
        if (interfaceC65784Pro != null) {
            String str = aqS73S1100000_6.s0;
            Object invoke = interfaceC65784Pro.invoke();
            if (str != null) {
                C38805FKv.LIZ.getClass();
                InterfaceC38802FKs interfaceC38802FKs = C38805FKv.LJFF;
                if (interfaceC38802FKs != null) {
                    System.currentTimeMillis();
                    interfaceC38802FKs.LIZ(str);
                    return invoke;
                }
                return invoke;
            }
            return invoke;
        }
        return null;
    }

    public static final Object invoke$8(AqS73S1100000_6 aqS73S1100000_6) {
        InterfaceC60761Nsz interfaceC60761Nsz;
        String str = aqS73S1100000_6.s0;
        FD4 fd42 = null;
        if (str != null) {
            C31999Ch9.LIZJ.getClass();
            interfaceC60761Nsz = C31999Ch9.LIZIZ(str);
        } else {
            interfaceC60761Nsz = null;
        }
        Iterator<FD4> it = FD5.LIZIZ.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            FD4 next = it.next();
            if (next.LIZIZ(interfaceC60761Nsz)) {
                fd42 = next;
                break;
            }
        }
        FD4 fd43 = fd42;
        if (fd43 != null) {
            fd43.LIZ(interfaceC60761Nsz, (C79604VMa) aqS73S1100000_6.l1);
        } else {
            HybridMultiMonitor.getInstance().customReport((C79604VMa) aqS73S1100000_6.l1);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS73S1100000_6 aqS73S1100000_6) {
        InterfaceC88471Ynr<? super String, ? super Map<String, ? extends Object>, C76800UCe> interfaceC88471Ynr = FD5.LIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(aqS73S1100000_6.s0, (Map) aqS73S1100000_6.l1);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(ET4 et4, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = et4;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(C36817Ecf c36817Ecf, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c36817Ecf;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(NJ1 nj1, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = nj1;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(C65896Ptc c65896Ptc, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c65896Ptc;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(Context context, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = context;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(String str, C79604VMa c79604VMa, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = c79604VMa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(String str, Map map, int i) {
        super(0);
        this.$t = i;
        this.s0 = str;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS73S1100000_6(long j, String str, InterfaceC65784Pro interfaceC65784Pro, int i) {
        super(0);
        this.$t = i;
        this.l1 = interfaceC65784Pro;
        this.s0 = str;
    }
}
