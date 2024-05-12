package Y;

import X.C09590Zf;
import X.C0TB;
import X.C16880lQ;
import X.C38891fp;
import X.C38901fq;
import X.C39745Fin;
import X.C47261Igj;
import X.C64797Pbt;
import X.C65083PgV;
import X.C89999ZTv;
import X.EnumC275216e;
import X.PVP;
import X.X1D;
import X.ZTU;
import X.ZTV;
import X.ZU2;
import X.ZU4;
import X.ZU6;
import X.ZUA;
import X.ZUR;
import X.ZUU;
import android.os.RemoteException;
import com.benchmark.netUtils.BytebenchFaasAPI;
import com.benchmark.tools.DefaultSharedpreference;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public class IDCallableS415S0100000_17 implements Callable {
    public final int $t;
    public Object l0;

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
            default:
                return null;
        }
    }

    public static final Object call$0(IDCallableS415S0100000_17 iDCallableS415S0100000_17) {
        ZTU ztu = (ZTU) iDCallableS415S0100000_17.l0;
        ZTV ztv = ztu.LJLJJI;
        ZU2 zu2 = ztv.LIZ;
        if (zu2 != null) {
            try {
                String str = ztu.LJLIL;
                if (str != null) {
                    zu2.p0(ztu.LJLILLLLZI, ztu.LJLJI, str, ztv.LIZLLL);
                    return null;
                }
                return null;
            } catch (RemoteException e) {
                C38901fq.LJIIIZ(e);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r8.equalsIgnoreCase(r0) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$1(Y.IDCallableS415S0100000_17 r13) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDCallableS415S0100000_17.call$1(Y.IDCallableS415S0100000_17):java.lang.Object");
    }

    public static final Object call$2(IDCallableS415S0100000_17 iDCallableS415S0100000_17) {
        ZU2 zu2;
        ZTV ztv = ((ZUU) iDCallableS415S0100000_17.l0).LIZIZ;
        ztv.getClass();
        if (ZU4.LIZJ.LIZIZ.LJ) {
            if (!ztv.LJI || (zu2 = ztv.LIZ) == null) {
                ZU6 zu6 = ztv.LJ;
                if (zu6 != null) {
                    ((ZUR) zu6).LIZ(102, -1, "stop failed");
                    return null;
                }
                return null;
            }
            try {
                zu2.LLZLL();
                return null;
            } catch (RemoteException e) {
                C38901fq.LJIIIZ(e);
                return null;
            }
        }
        ztv.LJFF.stopByteBench();
        ZU6 zu62 = ztv.LJ;
        if (zu62 == null) {
            return null;
        }
        ((ZUR) zu62).LIZIZ(102, "stop");
        return null;
    }

    public static final Object call$3(IDCallableS415S0100000_17 iDCallableS415S0100000_17) {
        String str;
        ZUU zuu = ((ZUR) iDCallableS415S0100000_17.l0).LIZ;
        String[] result = zuu.LIZIZ.LJFF.getResult();
        if (result != null) {
            String str2 = null;
            if (result.length > 0) {
                str = result[0];
            } else {
                str = null;
            }
            if (result.length > 1) {
                str2 = result[1];
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("result: ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            C47261Igj.LJIILJJIL("BytebenchV2");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("leftTask: ");
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
            C47261Igj.LJIILJJIL("BytebenchV2");
            try {
                if (zuu.LIZ != null && str != null) {
                    JSONObject jSONObject = new JSONObject(str);
                    jSONObject.put("sdk_version", "14.9.13-mt");
                    C38891fp.LJJII("bytebench_task", jSONObject);
                    if (ZU4.LIZJ.LIZIZ.LIZLLL == EnumC275216e.FAAS_API) {
                        C89999ZTv.LIZ(new IDCallableS415S0100000_17(jSONObject, 4), C89999ZTv.LJ);
                    }
                }
            } catch (Exception e) {
                C38901fq.LJIIIZ(e);
            }
            if (str2 != null) {
                DefaultSharedpreference.getInstance().setString(C09590Zf.LJIILLIIL.LIZ, "benchmark", str2);
                if (zuu.LIZLLL == ZUA.QUITTING) {
                    zuu.LIZLLL = ZUA.LOAD;
                }
            } else {
                zuu.LIZLLL = ZUA.INVALID;
            }
        }
        return Boolean.TRUE;
    }

    public static final Object call$4(IDCallableS415S0100000_17 iDCallableS415S0100000_17) {
        BytebenchFaasAPI bytebenchFaasAPI = (BytebenchFaasAPI) C65083PgV.LJIIL("").LIZ(BytebenchFaasAPI.class);
        String jSONObject = ((JSONObject) iDCallableS415S0100000_17.l0).toString();
        C64797Pbt<TypedInput> execute = bytebenchFaasAPI.reportResult(C0TB.LIZIZ().LIZ(), PVP.LIZJ(C39745Fin.LIZJ("application/json"), jSONObject)).execute();
        try {
            byte[] bArr = new byte[4096];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            InputStream in = execute.LIZIZ.in();
            while (true) {
                int read = in.read(bArr, 0, 4096);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject);
            int optInt = jSONObject2.optInt("status_code");
            String optString = jSONObject2.optString("message");
            if (optInt != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("reportResultFromAPI failed: ");
                LIZ.append(optInt);
                LIZ.append("  ");
                LIZ.append(optString);
                X1D.LIZIZ(LIZ);
                C47261Igj.LJIILL("BytebenchV2");
                return null;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public IDCallableS415S0100000_17(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
