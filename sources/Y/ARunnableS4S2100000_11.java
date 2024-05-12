package Y;

import X.C0M4;
import X.C0M9;
import X.C1HQ;
import X.C64401PPh;
import X.C65817PsL;
import X.C65819PsN;
import X.C65825PsT;
import X.C66059PwF;
import X.C66083Pwd;
import X.C66085Pwf;
import X.C66373Q3d;
import X.EnumC65821PsP;
import X.F9J;
import X.Q8U;
import X.QKA;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import com.ss.android.token.AuthTokenMultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;
import m43.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS4S2100000_11 implements Runnable {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        synchronized (((QKA) this.l2).LJLILLLLZI) {
            if (((QKA) this.l2).LJLILLLLZI.LJIILIIL != null) {
                ((QKA) this.l2).LJLILLLLZI.LJIILIIL.LIZIZ(this.s0, this.s1);
                ((QKA) this.l2).LJLILLLLZI.LJIILIIL = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l2
            com.bytedance.helios.api.config.SignalConfig r0 = (com.bytedance.helios.api.config.SignalConfig) r0
            java.util.Map<java.lang.String, java.util.List<com.bytedance.helios.api.config.ConcernedALog>> r1 = r0.alog
            java.lang.String r0 = r6.s0
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L8b
            java.util.Iterator r4 = r0.iterator()
        L14:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r3 = r4.next()
            com.bytedance.helios.api.config.ConcernedALog r3 = (com.bytedance.helios.api.config.ConcernedALog) r3
            java.lang.String r2 = r6.s1
            java.lang.String r1 = r3.content
            r0 = 0
            boolean r0 = ujb.s.LJJJLZIJ(r2, r1, r0)
            if (r0 == 0) goto L14
            java.util.List<java.lang.String> r0 = r3.dataTypes
            java.util.Iterator r5 = r0.iterator()
        L31:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.hashCode()
            r0 = 93166550(0x58d9bd6, float:1.3316821E-35)
            if (r1 == r0) goto L58
            r0 = 112202875(0x6b0147b, float:6.6233935E-35)
            if (r1 == r0) goto L4c
            goto L31
        L4c:
            java.lang.String r0 = "video"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L31
            X.PvF r4 = X.EnumC65997PvF.CAMERA
            goto L62
        L58:
            java.lang.String r0 = "audio"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L31
            X.PvF r4 = X.EnumC65997PvF.AUDIO
        L62:
            if (r4 == 0) goto L31
            X.Pvl r3 = X.EnumC66029Pvl.ALOG
            com.bytedance.helios.sdk.signal.Signal r2 = new com.bytedance.helios.sdk.signal.Signal
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r0 = 91
            r1.append(r0)
            java.lang.String r0 = r6.s0
            r1.append(r0)
            r0 = 93
            r1.append(r0)
            java.lang.String r0 = r6.s1
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            X.C65985Pv3.LIZIZ(r3, r4, r2)
            goto L31
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS4S2100000_11.LIZ$1():void");
    }

    public final void LIZ$2() {
        String str = this.s0;
        String str2 = this.s1;
        ApmEvent apmEvent = new ApmEvent("nvwa_api_fact");
        apmEvent.LIZ(str2, "reason");
        apmEvent.LIZ(str, "api_id");
        ArrayList arrayList = (ArrayList) ((C66085Pwf) this.l2).LJFF;
        if (arrayList.isEmpty()) {
            return;
        }
        C66085Pwf c66085Pwf = (C66085Pwf) this.l2;
        List<String> list = c66085Pwf.LJII;
        List<String> list2 = c66085Pwf.LJIIIIZZ;
        List<String> list3 = c66085Pwf.LJI;
        C1HQ c1hq = c66085Pwf.LIZIZ;
        long j = 1000;
        long longValue = ((Number) ListProtector.get(arrayList, 0)).longValue() / j;
        int i = 1;
        ArrayList arrayList2 = new ArrayList(arrayList.size() - 1);
        int size = arrayList.size();
        long j2 = longValue;
        while (i < size) {
            long longValue2 = ((Number) ListProtector.get(arrayList, i)).longValue() / j;
            arrayList2.add(Long.valueOf(longValue2 - j2));
            i++;
            j2 = longValue2;
        }
        apmEvent.LIZJ(Long.valueOf(j2 - longValue), "duration");
        apmEvent.LIZJ(Long.valueOf(((C66085Pwf) this.l2).LJ), "used_time");
        apmEvent.LIZIZ(Long.valueOf(longValue), "start_time");
        apmEvent.LIZIZ(Long.valueOf(j2), "end_time");
        long j3 = ((C66085Pwf) this.l2).LIZLLL;
        if (j3 > 0) {
            apmEvent.LIZIZ(Long.valueOf(j3 / j), "background_time");
        }
        apmEvent.LIZIZ(TextUtils.join(",", arrayList2), "time_series");
        apmEvent.LIZIZ(new JSONArray((Collection) list3), "cert_token");
        apmEvent.LIZIZ(new JSONArray((Collection) list2), "last_page");
        apmEvent.LIZ(C66083Pwd.LJI, "release_build");
        apmEvent.LIZ(C66083Pwd.LJII, "git_commit");
        ArrayList arrayList3 = (ArrayList) list;
        C0M4 c0m4 = new C0M4(arrayList3.size());
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        c0m4.addAll(arrayList3);
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(Integer.valueOf(c0m4.indexOf(it.next())));
        }
        apmEvent.LIZIZ(new JSONArray((Collection) c0m4), "stack_set");
        apmEvent.LIZIZ(new JSONArray((Collection) arrayList4), "stack");
        apmEvent.LIZJ(Long.valueOf(arrayList.size()), "count");
        Iterator it2 = ((C0M9.b) c1hq.entrySet()).iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            apmEvent.LIZ(entry.getValue(), (String) entry.getKey());
        }
        apmEvent.LIZ(Boolean.valueOf(C64401PPh.LIZLLL), "launch_from_user");
        apmEvent.LIZ(Integer.valueOf(C64401PPh.LJ), "init_importance_reason_code");
        ComponentName componentName = C64401PPh.LJFF;
        if (componentName != null) {
            apmEvent.LIZ(componentName.flattenToString(), "init_importance_reason_component");
        }
        C66059PwF.LIZIZ(apmEvent);
        C66085Pwf c66085Pwf2 = (C66085Pwf) this.l2;
        ((ArrayList) c66085Pwf2.LJFF).clear();
        ((ArrayList) c66085Pwf2.LJI).clear();
        ((ArrayList) c66085Pwf2.LJIIIIZZ).clear();
        ((ArrayList) c66085Pwf2.LJII).clear();
    }

    public static final void run$0(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        EnumC65821PsP enumC65821PsP;
        Context context = (Context) aRunnableS4S2100000_11.l2;
        String settingsKey = aRunnableS4S2100000_11.s0;
        String applicationId = aRunnableS4S2100000_11.s1;
        o.LJIIIZ(context, "$context");
        o.LJIIIZ(settingsKey, "$settingsKey");
        o.LJIIIZ(applicationId, "$applicationId");
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "com.facebook.internal.preferences.APP_SETTINGS");
        C65825PsT c65825PsT = null;
        String string = LIZIZ.getString(settingsKey, null);
        if (!C66373Q3d.LJIJJ(string)) {
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    C65819PsN.LIZ.getClass();
                    c65825PsT = C65819PsN.LIZLLL(applicationId, jSONObject);
                } catch (JSONException unused) {
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        C65819PsN c65819PsN = C65819PsN.LIZ;
        c65819PsN.getClass();
        JSONObject LIZ = C65819PsN.LIZ();
        C65819PsN.LIZLLL(applicationId, LIZ);
        LIZIZ.edit().putString(settingsKey, LIZ.toString()).apply();
        if (c65825PsT != null) {
            String str = c65825PsT.LJI;
            if (!C65819PsN.LJFF && str != null && str.length() > 0) {
                C65819PsN.LJFF = true;
            }
        }
        C65817PsL.LIZ.getClass();
        JSONObject LIZ2 = C65817PsL.LIZ();
        F9J.LIZIZ(u.LIZJ(), 0, "com.facebook.internal.preferences.APP_GATEKEEPERS").edit().putString(Q8U.LIZIZ(new Object[]{applicationId}, 1, "com.facebook.internal.APP_GATEKEEPERS.%s", "java.lang.String.format(format, *args)"), LIZ2.toString()).apply();
        C65817PsL.LIZJ(applicationId, LIZ2);
        AtomicReference<EnumC65821PsP> atomicReference = C65819PsN.LIZLLL;
        if (((ConcurrentHashMap) C65819PsN.LIZJ).containsKey(applicationId)) {
            enumC65821PsP = EnumC65821PsP.SUCCESS;
        } else {
            enumC65821PsP = EnumC65821PsP.ERROR;
        }
        atomicReference.set(enumC65821PsP);
        c65819PsN.LJ();
    }

    public static final void run$1(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            aRunnableS4S2100000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            aRunnableS4S2100000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            WsChannelMultiProcessSharedProvider wsChannelMultiProcessSharedProvider = (WsChannelMultiProcessSharedProvider) aRunnableS4S2100000_11.l2;
            wsChannelMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(WsChannelMultiProcessSharedProvider.LIZ(wsChannelMultiProcessSharedProvider.getContext(), aRunnableS4S2100000_11.s0, aRunnableS4S2100000_11.s1), null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            PushMultiProcessSharedProvider pushMultiProcessSharedProvider = (PushMultiProcessSharedProvider) aRunnableS4S2100000_11.l2;
            pushMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(PushMultiProcessSharedProvider.LIZIZ(pushMultiProcessSharedProvider.getContext(), aRunnableS4S2100000_11.s0, aRunnableS4S2100000_11.s1), null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            AuthTokenMultiProcessSharedProvider authTokenMultiProcessSharedProvider = (AuthTokenMultiProcessSharedProvider) aRunnableS4S2100000_11.l2;
            authTokenMultiProcessSharedProvider.getContext().getContentResolver().notifyChange(AuthTokenMultiProcessSharedProvider.LIZIZ(authTokenMultiProcessSharedProvider.getContext(), aRunnableS4S2100000_11.s0, aRunnableS4S2100000_11.s1), null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS4S2100000_11 aRunnableS4S2100000_11) {
        boolean LIZ;
        try {
            aRunnableS4S2100000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS4S2100000_11(Object obj, String str, String str2, int i) {
        this.$t = i;
        this.l2 = obj;
        this.s0 = str;
        this.s1 = str2;
    }
}
