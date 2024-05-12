package com.bytedance.location_bpea;

import X.C27433Aph;
import X.C2T9;
import X.C35861aw;
import X.C66236Pz6;
import X.P8B;
import X.Q0A;
import X.Q0B;
import X.Q0C;
import X.X1D;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import com.bytedance.bdlocation.api.IBPEALocal;
import com.bytedance.bdlocation.client.BDLocationConfig;
import com.bytedance.bdlocation.entity.bpea.BDDecryptLocation;
import com.bytedance.bdlocation.entity.bpea.BDEncryptLocation;
import com.bytedance.bdlocation.entity.bpea.BPEACertCheckResult;
import com.bytedance.bdlocation.exception.BDLocationException;
import com.bytedance.bdlocation.log.Logger;
import com.bytedance.bdlocation.permission.PermissionManager;
import com.bytedance.bpea.basics.Cert;
import org.json.JSONObject;

/* loaded from: classes24.dex */
public class BPEAManager implements IBPEALocal {
    public BPEAManager(Context context) {
    }

    private BPEACertCheckResult getCheckResult(C2T9 c2t9) {
        BPEACertCheckResult bPEACertCheckResult = new BPEACertCheckResult();
        if (c2t9 != null) {
            bPEACertCheckResult.setCode(c2t9.LIZ);
            bPEACertCheckResult.setMsg(c2t9.LIZIZ);
            C35861aw c35861aw = c2t9.LIZJ;
            if (c35861aw != null) {
                bPEACertCheckResult.setParams((JSONObject) c35861aw.LJLILLLLZI);
            }
        }
        return bPEACertCheckResult;
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public String getBpeaToken(Object obj) {
        if (obj == null) {
            return "bpea-error-token";
        }
        try {
            return ((Cert) obj).certToken();
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("getBpeaToken error:");
            LIZ.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            throw new BDLocationException("BPEA getBpeaToken Exception", "unknown", "82");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BPEACertCheckResult checkAndTranslateCert(Object obj, String str) {
        try {
            C66236Pz6.LIZJ.getClass();
            return getCheckResult(Q0A.LIZ((Cert) obj, str));
        } catch (Q0C unused) {
            throw new BDLocationException("BPEA check error", "unknown", "58");
        } catch (Exception unused2) {
            throw new BDLocationException("BPEA checkAndTranslateCert Exception", "unknown", "82");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BDDecryptLocation decryptLocation(String str, String str2, Object obj) {
        String message;
        try {
            C66236Pz6.LIZJ.getClass();
            Q0B LIZJ = Q0A.LIZJ(str, str2, (Cert) obj);
            return new BDDecryptLocation(LIZJ.LJLIL, LIZJ.LJLILLLLZI);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bpea decryptLocation error:");
            LIZ.append(e.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            if (e.getMessage() == null) {
                message = "";
            } else {
                message = e.getMessage();
            }
            throw new BDLocationException(message, "unknown", "58");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public BDEncryptLocation encryptLocation(double d, double d2, Object obj) {
        C27433Aph LJFF;
        String str = "";
        try {
            if (obj == null) {
                C66236Pz6.LIZJ.getClass();
                try {
                    try {
                        LJFF = new C27433Aph(Q0A.LIZLLL(d), Q0A.LIZLLL(d2));
                    } catch (Q0C e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    throw new Q0C(-1, message);
                }
            } else {
                C66236Pz6.LIZJ.getClass();
                LJFF = Q0A.LJFF(d, d2, (Cert) obj);
            }
            return new BDEncryptLocation(LJFF.LJLIL, LJFF.LJLILLLLZI);
        } catch (Exception e2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bpea encryptLocation error:");
            LIZ.append(e2.toString());
            Logger.i(X1D.LIZIZ(LIZ));
            if (e2.getMessage() != null) {
                str = e2.getMessage();
            }
            throw new BDLocationException(str, "unknown", "58");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public Location getLastKnownLocation(LocationManager locationManager, String str, Object obj) {
        try {
            if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION", BDLocationConfig.getFinePermission())) {
                return P8B.LIZ(locationManager, str, (Cert) obj);
            }
            return null;
        } catch (Q0C e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BPEA requestSingleUpdate error:");
            LIZ.append(e.getErrorMsg());
            throw new BDLocationException(X1D.LIZIZ(LIZ), "unknown", "58");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public void requestSingleUpdate(LocationManager locationManager, String str, LocationListener locationListener, Looper looper, Object obj) {
        try {
            if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION", BDLocationConfig.getFinePermission())) {
                P8B.LIZJ(locationManager, str, locationListener, looper, (Cert) obj);
            }
        } catch (Q0C e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BPEA requestSingleUpdate error:");
            LIZ.append(e.getErrorMsg());
            throw new BDLocationException(X1D.LIZIZ(LIZ), "unknown", "58");
        }
    }

    @Override // com.bytedance.bdlocation.api.IBPEALocal
    public void requestLocationUpdates(LocationManager locationManager, String str, long j, float f, LocationListener locationListener, Looper looper, Object obj) {
        try {
            if (PermissionManager.hasAnyPermission("android.permission.ACCESS_COARSE_LOCATION", BDLocationConfig.getFinePermission())) {
                P8B.LIZIZ(locationManager, str, j, f, locationListener, looper, (Cert) obj);
            }
        } catch (Q0C e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("BPEA requestLocationUpdates error:");
            LIZ.append(e.getErrorMsg());
            throw new BDLocationException(X1D.LIZIZ(LIZ), "unknown", "58");
        }
    }
}
