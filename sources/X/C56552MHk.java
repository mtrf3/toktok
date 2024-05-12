package X;

import Y.ACallableS84S0200000_7;
import Y.ARunnableS8S0201000_5;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.MHk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56552MHk extends C8BS<MusicDetail> {
    public final /* synthetic */ C56548MHg LJLIL;

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        return objArr != null;
    }

    public C56552MHk(C56548MHg c56548MHg) {
        this.LJLIL = c56548MHg;
    }

    @Override // X.C8BS
    public final boolean sendRequest(Object... objArr) {
        boolean z;
        this.LJLIL.LJLLI = this.mHandler;
        if (!super.sendRequest(objArr)) {
            return false;
        }
        if (objArr.length > 0 && TextUtils.isEmpty((String) objArr[0])) {
            JSONObject jSONObject = new JSONObject();
            try {
                String stackTraceString = android.util.Log.getStackTraceString(new Throwable());
                if (stackTraceString.length() > 1024) {
                    stackTraceString = stackTraceString.substring(0, 1024);
                }
                jSONObject.put("error_stack", stackTraceString);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            FUA.LIZJ("music_id_empty", jSONObject);
        }
        if (objArr.length >= 4) {
            z = ((Boolean) objArr[3]).booleanValue();
        } else {
            z = false;
        }
        if (this.LJLIL.LJLJLLL.booleanValue() && !NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false).isStandardUIEnable()) {
            this.LJLIL.LJLJJLL = Long.valueOf(SystemClock.elapsedRealtime());
            C56548MHg c56548MHg = this.LJLIL;
            c56548MHg.LJLJJI = (String) objArr[0];
            Object obj = objArr[1];
            if (obj != null) {
                c56548MHg.LJLJJL = obj.toString();
            }
            if (objArr.length > 2 && ((Integer) objArr[2]).intValue() == 1) {
                MJ0 mj0 = this.LJLIL.LJLL;
                C57314MeU c57314MeU = new C57314MeU((String) objArr[0], (String) objArr[1]);
                mj0.getClass();
                XKX.LIZLLL(mj0.LIZ(), null, null, new C57320Mea(!z, c57314MeU, new C54840Lfg(), mj0, null), 3);
            } else if (objArr.length >= 5) {
                TreeMap treeMap = new TreeMap();
                if (objArr.length >= 6) {
                    treeMap.put("item_id", objArr[5]);
                }
                if (objArr.length >= 7) {
                    treeMap.put("video_id", objArr[6]);
                }
                if (objArr.length >= 8) {
                    try {
                        int intValue = ((Integer) objArr[7]).intValue();
                        if (intValue == 1) {
                            treeMap.put("enter_from", String.valueOf(intValue));
                        }
                    } catch (ClassCastException unused) {
                    }
                }
                String str = (String) objArr[0];
                MJ0 mj02 = this.LJLIL.LJLL;
                if (str != null) {
                    str = str.trim();
                }
                C57336Meq c57336Meq = new C57336Meq(str, ((Integer) objArr[1]).intValue(), ((Integer) objArr[4]).intValue(), treeMap);
                mj02.getClass();
                XKX.LIZLLL(mj02.LIZ(), null, null, new C57322Mec(!z, c57336Meq, new C73340SqO(), mj02, null), 3);
            } else {
                String str2 = (String) objArr[0];
                MJ0 mj03 = this.LJLIL.LJLL;
                if (str2 != null) {
                    str2 = str2.trim();
                }
                C57327Meh c57327Meh = new C57327Meh(str2, ((Integer) objArr[1]).intValue());
                mj03.getClass();
                XKX.LIZLLL(mj03.LIZ(), null, null, new C57321Meb(!z, c57327Meh, new C76917UGr(), mj03, null), 3);
            }
        } else {
            C56543MHb c56543MHb = C56543MHb.LIZ;
            String str3 = (String) objArr[0];
            String obj2 = objArr[1].toString();
            c56543MHb.getClass();
            MusicDetail LIZ = C56543MHb.LIZ(str3, obj2);
            if (LIZ != null && !z) {
                if (((Boolean) C53006KrC.LIZ.getValue()).booleanValue()) {
                    this.mHandler.post(new ARunnableS8S0201000_5(2, this, LIZ, 10));
                } else {
                    handleData(LIZ);
                    this.LJLIL.onSuccess();
                }
            } else {
                FGR.LIZIZ().LIZ(this.mHandler, new ACallableS84S0200000_7(objArr, this, 4), 0);
            }
        }
        return true;
    }
}
