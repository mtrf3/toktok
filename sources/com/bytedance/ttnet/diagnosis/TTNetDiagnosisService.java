package com.bytedance.ttnet.diagnosis;

import X.C05040Hs;
import X.C16880lQ;
import X.C64693PaD;
import X.C64752PbA;
import X.C66686QFe;
import X.JBR;
import X.KMP;
import X.X1D;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.ttnet.TTNetInit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public class TTNetDiagnosisService {
    public static final Map<Integer, String> sTypeStringMap;

    static {
        HashMap hashMap = new HashMap();
        sTypeStringMap = hashMap;
        hashMap.put(0, "DNS_RESOLVE_TARGET");
        hashMap.put(1, "RACE_TARGETS");
        hashMap.put(2, "ACCELERATE_TARGET");
        hashMap.put(3, "DIAGNOSE_TARGET");
        hashMap.put(4, "DIAGNOSE_V2_TARGET");
        hashMap.put(5, "RAW_DETECT_TARGETS");
    }

    public static C64693PaD getCronetHttpClient() {
        if (C64752PbA.LIZ()) {
            return C64693PaD.LJIILIIL(TTNetInit.getTTNetDepend().getContext());
        }
        throw new UnsupportedOperationException("Cronet is not enabled");
    }

    public static boolean isOneTargetRequestType(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    if (i == 5) {
                        return false;
                    }
                    throw new IllegalArgumentException(KMP.LJ("Illegal request type: ", i));
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void reportUserLog(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            if (getCronetHttpClient() == null) {
                return;
            }
            ICronetClient iCronetClient = C64693PaD.LIZLLL;
            if (iCronetClient != null) {
                Reflect.on(iCronetClient).call("reportNetDiagnosisUserLog", new Class[]{String.class}, str);
                return;
            }
            throw new UnsupportedOperationException("CronetEngine has not been initialized.");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static String requestTypeToString(int i) {
        return sTypeStringMap.get(Integer.valueOf(i));
    }

    public static boolean isValidNetDetect(int i, long j) {
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    return true;
                }
                if (i != 5) {
                    throw new IllegalArgumentException(KMP.LJ("Illegal request type: ", i));
                }
            } else {
                if (j == 1 || j == 2 || j == 64) {
                    return true;
                }
                return false;
            }
        }
        if (((-1) & j) != 0 && (j & 0) == 0) {
            return true;
        }
        return false;
    }

    public static IDiagnosisRequest createRequest(int i, List<String> list, int i2, int i3) {
        if (!isOneTargetRequestType(i)) {
            if (isValidNetDetect(i, i2)) {
                if (i != 1 && i != 5) {
                    return null;
                }
                return new C66686QFe(i, list, i2, 0, i3);
            }
            throw new IllegalArgumentException(KMP.LJ("Illegal netDetectType: ", i2));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Type ");
        throw new IllegalArgumentException(JBR.LJFF(LIZ, requestTypeToString(i), " of request should be created with only one target.", LIZ));
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3) {
        return createRequest(i, str, i2, 0, i3);
    }

    public static IDiagnosisRequest createRequest(int i, String str, int i2, int i3, int i4) {
        if (isOneTargetRequestType(i)) {
            if (isValidNetDetect(i, i2)) {
                if (i != 0 && i != 2 && i != 3 && i != 4) {
                    return null;
                }
                return new C66686QFe(i, C05040Hs.LIZIZ(str), i2, i3, i4);
            }
            throw new IllegalArgumentException(KMP.LJ("Illegal netDetectType: ", i2));
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Type ");
        throw new IllegalArgumentException(JBR.LJFF(LIZ, requestTypeToString(i), " of request should be created with multiple targets.", LIZ));
    }
}
