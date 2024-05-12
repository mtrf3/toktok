package Y;

import X.BZI;
import X.C05630Jz;
import X.C0NB;
import X.C141335gf;
import X.C15380j0;
import X.C276516r;
import X.C28787BRn;
import X.C28838BTm;
import X.C29401Dk;
import X.C30868C9o;
import X.C30929CBx;
import X.C30930CBy;
import X.C3C5;
import X.C72242sW;
import X.C78461Uqn;
import X.C78469Uqv;
import X.CC1;
import X.EnumC30931CBz;
import X.InterfaceC64592gB;
import X.RunnableC67235Qa7;
import X.X1D;
import android.content.Context;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.api.PreloadRoomExtra;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class AfS2S2200000_5 implements InterfaceC64592gB {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS2S2200000_5 afS2S2200000_5, Object obj) {
        Room room;
        String str;
        PreloadRoomExtra preloadRoomExtra;
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse != null) {
            room = (Room) baseResponse.data;
        } else {
            room = null;
        }
        if (room == null || room.getId() == 0) {
            ConcurrentHashMap<String, String> concurrentHashMap = ((C28838BTm) afS2S2200000_5.l2).LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS2S2200000_5.s0);
            LIZ.append('-');
            LIZ.append(afS2S2200000_5.s1);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (baseResponse == null || (preloadRoomExtra = (PreloadRoomExtra) baseResponse.extra) == null || (str = preloadRoomExtra.reason) == null) {
                str = "empty";
            }
            concurrentHashMap.put(LIZIZ, str);
        } else {
            ((C28838BTm) afS2S2200000_5.l2).LIZ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(afS2S2200000_5.s0);
            LIZ2.append('-');
            LIZ2.append(afS2S2200000_5.s1);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            Map<String, Room> cacheMap = ((C28838BTm) afS2S2200000_5.l2).LIZ;
            o.LJIIIIZZ(cacheMap, "cacheMap");
            cacheMap.put(LIZIZ2, room);
            ((C28838BTm) afS2S2200000_5.l2).LIZIZ.put(LIZIZ2, Long.valueOf(System.currentTimeMillis()));
            ((C28838BTm) afS2S2200000_5.l2).LIZJ.put(LIZIZ2, "success");
        }
        Runnable runnable = (Runnable) afS2S2200000_5.l3;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void accept$1(AfS2S2200000_5 afS2S2200000_5, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof C29401Dk) {
            ConcurrentHashMap<String, String> concurrentHashMap = ((C28838BTm) afS2S2200000_5.l2).LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS2S2200000_5.s0);
            LIZ.append('-');
            LIZ.append(afS2S2200000_5.s1);
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("error_");
            LIZ2.append(((C276516r) th).getErrorCode());
            concurrentHashMap.put(LIZIZ, X1D.LIZIZ(LIZ2));
        } else {
            String message = th.getMessage();
            ConcurrentHashMap<String, String> concurrentHashMap2 = ((C28838BTm) afS2S2200000_5.l2).LIZJ;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(afS2S2200000_5.s0);
            LIZ3.append('-');
            LIZ3.append(afS2S2200000_5.s1);
            String LIZIZ2 = X1D.LIZIZ(LIZ3);
            if (message != null) {
                if (message.length() > 10) {
                    message = message.substring(0, 10);
                    o.LJIIIIZZ(message, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            } else {
                message = "error";
            }
            concurrentHashMap2.put(LIZIZ2, message);
        }
        Runnable runnable = (Runnable) afS2S2200000_5.l3;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static final void accept$2(AfS2S2200000_5 afS2S2200000_5, Object obj) {
        EnterRoomConfig LIZLLL = C78469Uqv.LIZLLL(-4L, afS2S2200000_5.s0, afS2S2200000_5.s1);
        C30868C9o.LJI(C15380j0.LJIILJJIL(R.string.jv4));
        ((C78461Uqn) afS2S2200000_5.l2).LJIILJJIL((Context) afS2S2200000_5.l3, LIZLLL);
        C0NB.LJI("LiveWatcherUtils", (Throwable) obj);
    }

    public static final void accept$3(AfS2S2200000_5 afS2S2200000_5, Object obj) {
        Throwable th = (Throwable) obj;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livesdk_subscription_");
        LIZ.append(afS2S2200000_5.s0);
        LIZ.append("_failed_new");
        BZI LIZ2 = C28787BRn.LIZ(X1D.LIZIZ(LIZ));
        C30929CBx.LJIIL(LIZ2, (C72242sW) afS2S2200000_5.l3, afS2S2200000_5.s1);
        JSONObject jSONObject = new JSONObject();
        C30929CBx.LIZ.LJIIIZ(th, jSONObject);
        Iterator<String> keys = jSONObject.keys();
        o.LJIIIIZZ(keys, "keys()");
        while (keys.hasNext()) {
            String key = keys.next();
            try {
                o.LJIIIIZZ(key, "key");
                LIZ2.LJIJJ(jSONObject.get(key), key);
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th2) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            }
        }
        LIZ2.LJJIIJZLJL();
        int i = C30930CBy.LIZ[((EnumC30931CBz) afS2S2200000_5.l2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                C30929CBx.LJIILJJIL(((C72242sW) afS2S2200000_5.l3).element, th);
                return;
            }
            C30929CBx.LJIILIIL(((C72242sW) afS2S2200000_5.l3).element, th);
            return;
        }
        C30929CBx.LJIIJ(((C72242sW) afS2S2200000_5.l3).element, th);
    }

    public static final void accept$4(AfS2S2200000_5 afS2S2200000_5, Object obj) {
        ((C72242sW) afS2S2200000_5.l2).element = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("livesdk_subscription_");
        LIZ.append(afS2S2200000_5.s0);
        LIZ.append("_request_new");
        BZI LIZ2 = C28787BRn.LIZ(X1D.LIZIZ(LIZ));
        LIZ2.LJIJJ(Long.valueOf(((C72242sW) afS2S2200000_5.l2).element), "start_time");
        String str = afS2S2200000_5.s1;
        if (str == null) {
            str = "";
        }
        LIZ2.LJIJJ(str, "show_entrance");
        LIZ2.LJJIIJZLJL();
        int i = CC1.LIZ[((EnumC30931CBz) afS2S2200000_5.l3).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                long j = ((C72242sW) afS2S2200000_5.l2).element;
                JSONObject jSONObject = new JSONObject();
                C05630Jz.LJFF(jSONObject, "start_time", j);
                C30929CBx.LJIIZILJ("subscription_privilege_all_detail_request", jSONObject);
                return;
            }
            long j2 = ((C72242sW) afS2S2200000_5.l2).element;
            JSONObject jSONObject2 = new JSONObject();
            C05630Jz.LJFF(jSONObject2, "start_time", j2);
            C30929CBx.LJIIZILJ("subscription_get_emotes_request", jSONObject2);
            return;
        }
        long j3 = ((C72242sW) afS2S2200000_5.l2).element;
        JSONObject jSONObject3 = new JSONObject();
        C05630Jz.LJFF(jSONObject3, "start_time", j3);
        C30929CBx.LJIJ("subscription_get_sub_info_request", jSONObject3);
    }

    public AfS2S2200000_5(String str, C78461Uqn c78461Uqn, Context context, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = "live_bottom_bar";
        this.l2 = c78461Uqn;
        this.l3 = context;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AfS2S2200000_5(X.EnumC30931CBz r2, java.lang.String r3, java.lang.String r4, X.C72242sW r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 3: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l2 = r5
            r0.s0 = r3
            r0.s1 = r4
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.s0 = r3
            r0.l2 = r2
            r0.l3 = r5
            r0.s1 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS2S2200000_5.<init>(X.CBz, java.lang.String, java.lang.String, X.2sW, int):void");
    }

    public AfS2S2200000_5(C28838BTm c28838BTm, String str, String str2, RunnableC67235Qa7 runnableC67235Qa7, int i) {
        this.$t = i;
        this.l2 = c28838BTm;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = runnableC67235Qa7;
    }
}
