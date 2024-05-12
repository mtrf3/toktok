package Y;

import X.C09650Zl;
import X.C09900aA;
import X.C18180nW;
import X.C19500pe;
import X.C1FP;
import X.C29306Beo;
import X.C39223FaN;
import X.C46991st;
import X.C47121t6;
import X.C64028PAy;
import X.C64089PDh;
import X.C64093PDl;
import X.C76800UCe;
import X.C78248UnM;
import X.CN1;
import X.I2U;
import X.InterfaceC88471Ynr;
import X.PCC;
import X.PCE;
import X.PEE;
import android.text.TextUtils;
import com.benchmark.strategy.nativePort.ByteBenchFeatureCenterPort;
import com.bytedance.android.live.broadcast.mirror.GameCastWiredFragment;
import com.bytedance.android.live.core.monitor.PersistenceReporter;
import com.bytedance.android.livesdk.game.model.GameLiveFragment;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class IDRunnableS4S1100000 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        StringBuilder sb = new StringBuilder();
        String str = this.s0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                if (sb.length() > 0) {
                    sb.append("_");
                }
                sb.append(Character.toLowerCase(charAt));
            } else {
                sb.append(charAt);
            }
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZJ, (IMessage) this.l1);
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "eventNameBuilder.toString()");
        C18180nW.LIZ(sb2, new JSONObject(json));
    }

    public static final void run$0(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            HashSet hashSet = C1FP.LJLILLLLZI;
            if (hashSet != null && !hashSet.isEmpty() && C1FP.LJLILLLLZI.contains(iDRunnableS4S1100000.s0)) {
                ByteBenchFeatureCenterPort.LIZIZ(iDRunnableS4S1100000.s0, (JSONObject) iDRunnableS4S1100000.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        try {
            HashSet hashSet = C1FP.LJLILLLLZI;
            if (hashSet != null && !hashSet.isEmpty() && C1FP.LJLILLLLZI.contains(iDRunnableS4S1100000.s0)) {
                ByteBenchFeatureCenterPort.LIZIZ(iDRunnableS4S1100000.s0, new JSONObject((Map) iDRunnableS4S1100000.l1));
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            if (C39223FaN.LIZ(th)) {
            } else {
                throw th;
            }
        }
    }

    public static final void run$10(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            iDRunnableS4S1100000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            ((GameCastWiredFragment) iDRunnableS4S1100000.l1).vl();
            GameCastWiredFragment gameCastWiredFragment = (GameCastWiredFragment) iDRunnableS4S1100000.l1;
            gameCastWiredFragment.LJLILLLLZI = false;
            C47121t6 c47121t6 = gameCastWiredFragment.LJLJL;
            if (c47121t6 != null) {
                c47121t6.setText(iDRunnableS4S1100000.s0);
            }
            GameCastWiredFragment gameCastWiredFragment2 = (GameCastWiredFragment) iDRunnableS4S1100000.l1;
            gameCastWiredFragment2.getClass();
            C29306Beo.LJJJIL(new C46991st(false, gameCastWiredFragment2));
            gameCastWiredFragment2.LJLJI = false;
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            ((PersistenceReporter) iDRunnableS4S1100000.l1).LJFF.erase(iDRunnableS4S1100000.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            C64089PDh.LJIIJ().LIZLLL(new PEE(iDRunnableS4S1100000.s0, (JSONObject) iDRunnableS4S1100000.l1));
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new PEE(iDRunnableS4S1100000.s0, (JSONObject) iDRunnableS4S1100000.l1).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorExceptionLog", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            String str = iDRunnableS4S1100000.s0;
            JSONObject jSONObject = (JSONObject) iDRunnableS4S1100000.l1;
            if (TextUtils.isEmpty(str)) {
                if (C78248UnM.LJIIJ()) {
                    C64028PAy.LIZ("APM-CommonEvent", "logType must be not empty");
                }
            } else {
                PCE.LIZJ(new PCC(str, jSONObject));
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            JSONObject LIZ2 = new C64093PDl((JSONObject) iDRunnableS4S1100000.l1, iDRunnableS4S1100000.s0).LIZ();
            if (LIZ2 != null) {
                C09900aA.LJIILLIIL("monitorCommonLog", LIZ2.toString());
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            InterfaceC88471Ynr<? super String, ? super Map<String, String>, C76800UCe> interfaceC88471Ynr = C19500pe.LIZJ;
            if (interfaceC88471Ynr != null) {
                interfaceC88471Ynr.invoke(iDRunnableS4S1100000.s0, (HashMap) iDRunnableS4S1100000.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.1cQ] */
    public static final void run$9(IDRunnableS4S1100000 iDRunnableS4S1100000) {
        boolean LIZ;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(iDRunnableS4S1100000.s0);
            IHostCreativeTool iHostCreativeTool = (IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class);
            final GameLiveFragment gameLiveFragment = (GameLiveFragment) iDRunnableS4S1100000.l1;
            iHostCreativeTool.Ab(arrayList, new I2U() { // from class: X.1cQ
                @Override // X.I2U
                public final void onSuccess() {
                    if (C30922CBq.LIZIZ) {
                        C0NB.LJIIIZ("HighLightVideoOperateImpl", "downloadVideoAndSaveToDraft(). save to draft. onSuccess.");
                    }
                    String str = GameLiveFragment.this.fragmentIdStr;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (str == null) {
                        str = "";
                    }
                    linkedHashMap.put("fragment_id", str);
                    linkedHashMap.put("timestamp", Long.valueOf(System.currentTimeMillis()));
                    C0K2.LJII(0, O5Y.LJJL("ttlive_highlight_to_draft_monitor"), linkedHashMap);
                }

                @Override // X.I2U
                public final void onFailed(Exception exc) {
                    String str;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("downloadVideoAndSaveToDraft(). save to draft. onFailed e=");
                    String str2 = null;
                    if (exc != null) {
                        str = exc.getMessage();
                    } else {
                        str = null;
                    }
                    C1EW.LIZLLL(LIZ2, str, LIZ2, "HighLightVideoOperateImpl");
                    String str3 = GameLiveFragment.this.fragmentIdStr;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("save highlight to draft error, error msg:");
                    if (exc != null) {
                        str2 = exc.getMessage();
                    }
                    LIZ3.append(str2);
                    C78685UuP.LJJLI(2, 4, str3, X1D.LIZIZ(LIZ3));
                }
            });
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS4S1100000(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
