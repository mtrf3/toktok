package X;

import Y.ARunnableS12S0101000_8;
import android.content.Context;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import defpackage.e1;
import java.util.ConcurrentModificationException;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.Ilf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC47567Ilf {
    public static final /* synthetic */ EnumC47567Ilf[] LJLJJLL;
    public static final EnumC47567Ilf instance;
    public InterfaceC47568Ilg LJLIL;
    public InterfaceC47565Ild LJLJJI;
    public JSONArray LJLILLLLZI = new JSONArray();
    public JSONArray LJLJI = new JSONArray();
    public int LJLJJL = 2;

    public int getLoggerVersion() {
        return com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(this);
    }

    public synchronized JSONArray popAllEvents() {
        JSONArray jSONArray;
        jSONArray = this.LJLILLLLZI;
        this.LJLILLLLZI = new JSONArray();
        return jSONArray;
    }

    public void setUploader(InterfaceC47569Ilh interfaceC47569Ilh) {
    }

    static {
        EnumC47567Ilf enumC47567Ilf = new EnumC47567Ilf();
        instance = enumC47567Ilf;
        LJLJJLL = new EnumC47567Ilf[]{enumC47567Ilf};
    }

    public static EnumC47567Ilf[] values() {
        return (EnumC47567Ilf[]) LJLJJLL.clone();
    }

    public JSONArray popAllEventsV2() {
        JSONArray jSONArray = this.LJLJI;
        synchronized (EnumC47567Ilf.class) {
            this.LJLJI = new JSONArray();
        }
        return jSONArray;
    }

    public int com_ss_ttvideoengine_log_VideoEventManager__getLoggerVersion$___twin___() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getLoggerVersion: ");
        LIZ.append(this.LJLJJL);
        C78253UnR.LIZLLL("VideoEventManager", X1D.LIZIZ(LIZ));
        return this.LJLJJL;
    }

    public static void LIZLLL(JSONObject jSONObject) {
        if (((TTVideoEngineLog.getLogNotifyLevel() >> 1) & 1) == 1 || ((TTVideoEngineLog.getLogTurnOn() >> 1) & 1) == 1) {
            try {
                String jSONObject2 = jSONObject.toString();
                if (jSONObject2 != null) {
                    int i = 3900;
                    if (jSONObject2.length() > 3900) {
                        int length = jSONObject2.length();
                        int i2 = 0;
                        while (i < length) {
                            TTVideoEngineLog.d("VideoEventManager", jSONObject2.substring(i2, i));
                            i2 += 3900;
                            i = Math.min(i + 3900, length);
                        }
                        TTVideoEngineLog.d("VideoEventManager", jSONObject2.substring(i2, i));
                        return;
                    }
                }
                TTVideoEngineLog.d("VideoEventManager", jSONObject2);
            } catch (ConcurrentModificationException e) {
                C78253UnR.LIZLLL("VideoEventManager", e.toString());
            }
        }
    }

    public static int com_ss_ttvideoengine_log_VideoEventManager_com_ss_android_ugc_aweme_video_VideoEventManagerLancet_getLoggerVersion(EnumC47567Ilf enumC47567Ilf) {
        if (!e1.LIZ(31744, "player_event_log_v2_open", true, true)) {
            return 1;
        }
        return 2;
    }

    public static EnumC47567Ilf valueOf(String str) {
        return (EnumC47567Ilf) V0N.LJJJ(EnumC47567Ilf.class, str);
    }

    public void setContext(Context context) {
        C16880lQ.LLLLL(context);
    }

    public synchronized void setEngineUploader(InterfaceC47565Ild interfaceC47565Ild) {
        this.LJLJJI = interfaceC47565Ild;
    }

    public void setListener(InterfaceC47568Ilg interfaceC47568Ilg) {
        this.LJLIL = interfaceC47568Ilg;
    }

    public void setLoggerVersion(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setLoggerVersion: ");
        LIZ.append(i);
        C78253UnR.LIZLLL("VideoEventManager", X1D.LIZIZ(LIZ));
        if (i == 1 || i == 2) {
            this.LJLJJL = i;
        }
    }

    public final void LIZJ(JSONObject jSONObject, boolean z) {
        synchronized (EnumC47567Ilf.class) {
            if (jSONObject == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addEvent  uploadLog = ");
            LIZ.append(z);
            TTVideoEngineLog.d("VideoEventManager", X1D.LIZIZ(LIZ));
            InterfaceC47565Ild interfaceC47565Ild = this.LJLJJI;
            if (interfaceC47565Ild != null) {
                ((C47570Ili) interfaceC47565Ild).LIZJ("video_playq", jSONObject);
            } else {
                if (this.LJLIL != null) {
                    this.LJLILLLLZI.put(jSONObject);
                    this.LJLIL.onEvent();
                } else {
                    C78253UnR.LIZLLL("VideoEventManager", "no listener set");
                }
                EngineThreadPool.addExecuteTask(new ARunnableS12S0101000_8(6, jSONObject, 33));
            }
        }
    }

    public void addEventV2(boolean z, JSONObject jSONObject, String str) {
        synchronized (EnumC47567Ilf.class) {
            if (jSONObject == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("addEventV2  uploadLog = ");
            LIZ.append(z);
            LIZ.append(", listener:");
            LIZ.append(this.LJLIL);
            LIZ.append(", uploader:");
            LIZ.append((Object) null);
            TTVideoEngineLog.d("VideoEventManager", X1D.LIZIZ(LIZ));
            InterfaceC47565Ild interfaceC47565Ild = this.LJLJJI;
            if (interfaceC47565Ild != null) {
                ((C47570Ili) interfaceC47565Ild).LIZLLL(str, jSONObject);
            } else {
                if (this.LJLIL != null) {
                    this.LJLJI.put(jSONObject);
                    this.LJLIL.onEventV2(str);
                } else {
                    C78253UnR.LIZLLL("VideoEventManager", "no listener set");
                }
                EngineThreadPool.addExecuteTask(new ARunnableS12S0101000_8(1, jSONObject, 8));
            }
        }
    }
}
