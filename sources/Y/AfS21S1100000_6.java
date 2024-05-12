package Y;

import X.C141335gf;
import X.C27739Aud;
import X.C36669EaH;
import X.C3C5;
import X.C40461FuL;
import X.C64797Pbt;
import X.C64799Pbv;
import X.C65330PkU;
import X.C65352Pkq;
import X.C76542zS;
import X.C76800UCe;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.PVC;
import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommercebase.network.StatusResponse;
import java.net.URL;
import java.util.Map;
import kotlin.jvm.internal.AqS11S2200000_6;
import kotlin.jvm.internal.AqS156S0100000_6;
import kotlin.jvm.internal.AqS48S1200000_6;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class AfS21S1100000_6 implements InterfaceC64592gB {
    public final int $t;
    public Object l1;
    public String s0;

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
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS21S1100000_6(Map map, int i) {
        this.$t = i;
        this.s0 = "mall";
        this.l1 = map;
    }

    public static final void accept$0(AfS21S1100000_6 afS21S1100000_6, Object obj) {
        Activity activity = (Activity) obj;
        o.LJIIIIZZ(activity, "activity");
        PopupManager.LJIIL(new C40461FuL(activity, afS21S1100000_6.s0, null, new AqS156S0100000_6((InterfaceC65784Pro) afS21S1100000_6.l1, (InterfaceC65784Pro<C76800UCe>) 35)));
    }

    public static final void accept$1(AfS21S1100000_6 afS21S1100000_6, Object obj) {
        try {
            C76542zS.LIZJ("rd_tiktokec_network", new AqS48S1200000_6((C64797Pbt) obj, (C64797Pbt<Response<Object>>) afS21S1100000_6.s0, (String) afS21S1100000_6.l1, (OSZ<String, ? extends Object>[]) 2));
        } catch (Exception unused) {
        }
    }

    public static final void accept$2(AfS21S1100000_6 afS21S1100000_6, Object obj) {
        m LJJIJIL;
        j LJJIJ;
        String LJJIFFI;
        Throwable th = (Throwable) obj;
        if (!(th instanceof C64799Pbv)) {
            return;
        }
        try {
            String str = null;
            try {
                Object LJII = C27739Aud.LJFF().LJII(((C64799Pbv) th).getRequestLog(), C65330PkU.LIZJ(C65352Pkq.LJI(m.class)));
                if (!(LJII instanceof m)) {
                    LJII = null;
                }
                m mVar = (m) LJII;
                if (mVar != null && (LJJIJIL = mVar.LJJIJIL("base")) != null && (LJJIJ = LJJIJIL.LJJIJ("origin_url")) != null && (LJJIFFI = LJJIJ.LJJIFFI()) != null) {
                    str = new URL(LJJIFFI).getPath();
                }
            } catch (s unused) {
            }
            C76542zS.LIZJ("rd_tiktokec_network", new AqS11S2200000_6(th, (Throwable) str, afS21S1100000_6.s0, (String) afS21S1100000_6.l1, (OSZ<String, ? extends Object>[]) 1));
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$3(AfS21S1100000_6 afS21S1100000_6, Object obj) {
        int i;
        C64797Pbt c64797Pbt = (C64797Pbt) obj;
        String str = afS21S1100000_6.s0;
        Map map = (Map) afS21S1100000_6.l1;
        String str2 = "unknown";
        if (c64797Pbt != null) {
            try {
                if (c64797Pbt.LIZIZ()) {
                    T t = c64797Pbt.LIZIZ;
                    if (t instanceof String) {
                        OSZ<Integer, String> LIZ = C36669EaH.LIZ(new JSONObject((String) t));
                        i = LIZ.getFirst().intValue();
                        str2 = LIZ.getSecond();
                    } else if ((t instanceof TypedByteArray) && o.LJ(((TypedByteArray) t).mimeType(), "application/json; charset=utf-8")) {
                        byte[] bytes = ((TypedByteArray) t).getBytes();
                        o.LJIIIIZZ(bytes, "body.bytes");
                        OSZ<Integer, String> LIZ2 = C36669EaH.LIZ(new JSONObject(new String(bytes, PVC.LIZ)));
                        i = LIZ2.getFirst().intValue();
                        str2 = LIZ2.getSecond();
                    } else if (t instanceof BaseResponse) {
                        i = ((BaseResponse) t).status_code;
                        str2 = ((BaseResponse) t).message;
                        o.LJIIIIZZ(str2, "body.message");
                    } else if (t instanceof Response) {
                        i = ((Response) t).code;
                        String str3 = ((Response) t).message;
                        if (str3 != null) {
                            str2 = str3;
                        }
                    } else if (t instanceof com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) {
                        i = ((com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) t).getCode();
                        str2 = ((com.ss.android.ugc.aweme.ecommercebase.network.BaseResponse) t).getMessage();
                    } else if (t instanceof StatusResponse) {
                        i = ((StatusResponse) t).getCode();
                        str2 = ((StatusResponse) t).getMessage();
                    } else {
                        str2 = "not_adapted";
                        i = -3;
                    }
                } else {
                    i = c64797Pbt.LIZ.LIZIZ;
                }
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
                return;
            }
        } else {
            i = -1;
        }
        C36669EaH.LJ(str, i, str2, c64797Pbt, null, map, 16);
        C3C5.m7constructorimpl(C76800UCe.LIZ);
    }

    public static final void accept$4(AfS21S1100000_6 afS21S1100000_6, Object obj) {
        Throwable th = (Throwable) obj;
        String str = afS21S1100000_6.s0;
        Map map = (Map) afS21S1100000_6.l1;
        try {
            String message = th.getMessage();
            if (message == null) {
                message = "unknown";
            }
            if (th instanceof C64799Pbv) {
                C36669EaH.LJ(str, -2, message, null, (C64799Pbv) th, map, 8);
            } else {
                C36669EaH.LJ(str, -2, message, null, null, map, 24);
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS21S1100000_6(String str, String str2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.$t = interfaceC65784Pro;
        this.s0 = str;
        this.l1 = str2;
    }
}
