package X;

import Y.ARunnableS16S0110000_10;
import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Osy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63308Osy {
    public static volatile C63308Osy LJIILL;
    public Context LIZ;
    public C114444eO LIZIZ;
    public C114594ed LIZLLL;
    public volatile boolean LJ;
    public InterfaceC116924iO LJFF;
    public C114604ee LJI;
    public C114494eT LJII;
    public long LJIIJ;
    public String LJIIJJI;
    public volatile C63383OuB LJIIL;
    public InterfaceC63292Osi LIZJ = new C114714ep(0);
    public volatile boolean LJIIIIZZ = false;
    public final java.util.Map<Integer, Runnable> LJIIIZ = new HashMap();
    public final Handler LJIILIIL = new Handler(C16880lQ.LLJJJJ());
    public C4ZC LJIILJJIL = null;

    public final synchronized void LIZ() {
        C63346Ota.LIZLLL();
        C120394nz.LIZ = null;
        C63269OsL.LJ();
        C115284fk.LJIILIIL().LIZLLL();
        C63127Oq3.LIZIZ().getClass();
        Iterator<InterfaceC63520OwO> it = C63521OwP.LIZIZ().LIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ().clear();
        }
        if (LJI().LIZLLL().LJLJJL) {
            C63315Ot5.LIZ.getClass();
            C63322OtC.LIZIZ("RepairManagerV2 ", "stopAllMsgPolling");
            if (C63315Ot5.LIZLLL) {
                int size = C63315Ot5.LJFF.size();
                for (int i = 0; i < size; i++) {
                    C63315Ot5.LJI(C63315Ot5.LJFF.keyAt(i));
                }
                C63315Ot5.LIZJ().removeCallbacksAndMessages(null);
            }
        } else if (C63319Ot9.LJ) {
            C63319Ot9 LIZIZ = C63319Ot9.LIZIZ();
            LIZIZ.LJ();
            LIZIZ.LIZ.removeCallbacksAndMessages(null);
        }
        C63309Osz.LJIIJJI = false;
        if (C63275OsR.LJLJJL) {
            C63275OsR LIZIZ2 = C63275OsR.LIZIZ();
            LIZIZ2.getClass();
            C63322OtC.LJFF("ReportManager innerRelease");
            LIZIZ2.LJLIL.removeCallbacksAndMessages(null);
            ((CopyOnWriteArrayList) LIZIZ2.LJLJI).clear();
        }
        C115394fv LJII = C115394fv.LJII();
        LJII.getClass();
        C63322OtC.LJFF("StrangerManager reset");
        ((CopyOnWriteArraySet) LJII.LIZLLL).clear();
        LJII.LIZJ.evictAll();
        C63159OqZ LIZJ = C63159OqZ.LIZJ();
        LIZJ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SendMsgCache reset, lru:");
        LIZ.append(LIZJ.LIZ.size());
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        LIZJ.LIZ.evictAll();
        RunnableC63345OtZ.LIZIZ();
        C63141OqH.LIZ.evictAll();
        C4WO.LIZIZ().getClass();
        C47922IrO.LIZ();
    }

    public final synchronized void LJII() {
        C63322OtC.LJFF("IMClient login");
        try {
            this.LJ = true;
            LIZ();
            C63324OtE.LIZ();
            LIZIZ().LJII();
            C63356Otk.LJIIIZ().getClass();
            new C63339OtT();
            for (int i : C63312Ot2.LIZLLL()) {
                C63356Otk.LJIIIZ().getClass();
                new C63294Osk(i).LJIIZILJ(false);
            }
            C63356Otk.LJIIIZ().getClass();
            C63305Osv.LIZIZ().LIZLLL();
            if (LJI().LIZIZ().LIZ() != null) {
                LJI().LIZIZ().LIZ().getClass();
            }
            C4ZF.LIZ().getClass();
            C63324OtE.LIZ();
            C63321OtB.LIZ();
            C63310Ot0.LJLIL.LIZLLL();
            this.LJIILIIL.postDelayed(new ARunnableS46S0100000_10(this, 121), 5000L);
        } catch (Throwable th) {
            C63322OtC.LJ("IMClient login error", th);
            C63272OsO.LJIIIIZZ(true, th, this.LJIIJ, this.LJIIJJI, this.LIZ);
            C63337OtR.LJFF(th);
        }
    }

    public final synchronized void LJIIIIZZ() {
        C63322OtC.LJFF("IMClient logout");
        try {
            this.LJ = false;
            this.LJIIIIZZ = false;
            C63324OtE.LIZJ = null;
            C63356Otk.LJIIIZ().getClass();
            new C63338OtS();
            C63356Otk.LJIIIZ().LJLIL.removeCallbacksAndMessages(null);
            LIZ();
            C63305Osv.LIZIZ().LIZLLL = -1;
            C4ZF.LIZ().getClass();
            C63324OtE.LIZJ = null;
            C63321OtB.LIZJ = null;
            C63333OtN.LIZ.removeCallbacks(C63333OtN.LIZIZ);
            C115374ft.LIZ.clear();
            C63291Osh.LIZ().getClass();
            C63291Osh.LIZ = -1L;
            C63291Osh.LIZIZ = -1L;
            C63291Osh.LIZJ = null;
            LJFF().LIZJ();
        } catch (Throwable th) {
            C63322OtC.LJ("IMClient logout error", th);
            C63272OsO.LJIIIIZZ(false, th, this.LJIIJ, this.LJIIJJI, this.LIZ);
            C63337OtR.LJFF(th);
        }
    }

    public static C63308Osy LJI() {
        if (LJIILL == null) {
            synchronized (C63308Osy.class) {
                if (LJIILL == null) {
                    LJIILL = new C63308Osy();
                }
            }
        }
        return LJIILL;
    }

    public final InterfaceC63292Osi LIZIZ() {
        InterfaceC63292Osi interfaceC63292Osi = this.LIZJ;
        if (interfaceC63292Osi == null) {
            return new C114714ep(0);
        }
        return interfaceC63292Osi;
    }

    public final C114444eO LIZLLL() {
        C114444eO c114444eO = this.LIZIZ;
        if (c114444eO != null) {
            return c114444eO;
        }
        return new C114444eO();
    }

    public final C63383OuB LJFF() {
        if (this.LJIIL == null) {
            synchronized (C63308Osy.class) {
                if (this.LJIIL == null) {
                    this.LJIIL = C63388OuG.LIZ();
                }
            }
        }
        return this.LJIIL;
    }

    public C63308Osy() {
        C54840Lfg.LJLJI = new C54840Lfg() { // from class: X.4f8
            @Override // X.C54840Lfg
            public final boolean LJIJJLI() {
                return C63308Osy.LJI().LIZLLL().LJZ;
            }

            @Override // X.C54840Lfg
            public final boolean LJIL() {
                return C63308Osy.LJI().LIZLLL().LJ;
            }

            @Override // X.C54840Lfg
            public final long LJJII() {
                C63308Osy.LJI().getClass();
                return C63308Osy.LJ();
            }

            @Override // X.C54840Lfg
            public final String LJJLIIIJLJLI() {
                return C63308Osy.LJI().LIZIZ().getSecUid();
            }

            @Override // X.C54840Lfg
            public final long LJJLIL() {
                return C63308Osy.LJI().LIZIZ().getUid();
            }

            @Override // X.C54840Lfg
            public final boolean LJLI() {
                return C63308Osy.LJI().LIZLLL().LIZLLL;
            }
        };
        C109504Rm.LIZ = new InterfaceC109534Rp() { // from class: X.4fx
            public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C115434fz.LJLIL);
            public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C115424fy.LJLIL);

            @Override // X.InterfaceC109534Rp
            public final long LIZ(C63120Opw conversation) {
                boolean z;
                o.LJIIIZ(conversation, "conversation");
                String conversationId = conversation.getConversationId();
                if (conversationId == null || conversationId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return conversation.getLastMessageIndex() + 1;
                }
                C62822Ol8 c62822Ol8 = LIZJ;
                Long l = (Long) ((ConcurrentHashMap) c62822Ol8.getValue()).get(conversation.getConversationId());
                if (l == null) {
                    l = 0L;
                }
                long longValue = l.longValue();
                if (longValue < conversation.getLastMessageIndex()) {
                    longValue = conversation.getLastMessageIndex();
                }
                long j = longValue + 1;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c62822Ol8.getValue();
                String conversationId2 = conversation.getConversationId();
                o.LJIIIIZZ(conversationId2, "conversation.conversationId");
                concurrentHashMap.put(conversationId2, Long.valueOf(j));
                return j;
            }

            @Override // X.InterfaceC109534Rp
            public final long LIZIZ(C63120Opw conversation) {
                boolean z;
                o.LJIIIZ(conversation, "conversation");
                String conversationId = conversation.getConversationId();
                if (conversationId == null || conversationId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return conversation.getLastMessageOrderIndex() + 1;
                }
                C62822Ol8 c62822Ol8 = LIZIZ;
                Long l = (Long) ((ConcurrentHashMap) c62822Ol8.getValue()).get(conversation.getConversationId());
                if (l == null) {
                    l = 0L;
                }
                long longValue = l.longValue();
                if (longValue < conversation.getLastMessageOrderIndex()) {
                    longValue = conversation.getLastMessageOrderIndex();
                }
                long j = longValue + 1;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c62822Ol8.getValue();
                String conversationId2 = conversation.getConversationId();
                o.LJIIIIZZ(conversationId2, "conversation.conversationId");
                concurrentHashMap.put(conversationId2, Long.valueOf(j));
                return j;
            }
        };
    }

    public static long LJ() {
        LJI().LIZLLL().getClass();
        return LJI().LIZIZ().LJIILIIL();
    }

    public final void LJIIIZ() {
        long j;
        LIZIZ();
        if (this.LIZ != null) {
            C63322OtC.LJFF("onWsConnFailed");
            C63310Ot0.LJLJL = false;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onWsConnFailed isBackground ");
            LIZ.append(C63310Ot0.LJLJJI);
            LIZ.append(" isEnabled ");
            LIZ.append(C63314Ot4.LJII());
            LIZ.append(" interval ");
            JSONObject jSONObject = C63314Ot4.LJIILIIL;
            if (jSONObject != null) {
                j = jSONObject.optInt("defaultPollingMsgInterval");
            } else {
                j = C63314Ot4.LIZJ;
            }
            LIZ.append(j);
            C63322OtC.LIZIZ("ImSDKMonitorHelper", X1D.LIZIZ(LIZ));
            if (LJI().LIZIZ().isAppBackground() && C63314Ot4.LJII()) {
                return;
            }
            if (LJI().LIZLLL().LJLJJL) {
                C63315Ot5.LIZ.getClass();
                C63315Ot5.LJFF();
            } else {
                C63319Ot9.LIZLLL();
            }
        }
    }

    public final void LJIIJ() {
        LIZIZ();
        if (this.LIZ != null) {
            C63322OtC.LJFF("onWsConnSucc");
            C63322OtC.LJI("ImSDKMonitorHelper", "onWsConnSuccess", null);
            if (LJI().LIZLLL().LJLJJL) {
                C63315Ot5.LIZ.getClass();
                C63315Ot5.LIZ();
            } else {
                C63319Ot9.LIZ();
            }
            if (!C63310Ot0.LJLJL) {
                LJI().LIZLLL().getClass();
                if ("1".equals(C63314Ot4.LIZJ("is_ws_change_pull_msg")) && !C63314Ot4.LIZ() && !C63314Ot4.LJI()) {
                    LJI().LJIILIIL(11, null);
                }
            }
            C63310Ot0.LJLJL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILJJIL(org.json.JSONObject r2) {
        /*
            java.lang.String r1 = "data"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto Lf
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            if (r2 == 0) goto L5f
        Lf:
            java.lang.String r1 = "app"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L60
            org.json.JSONObject r2 = r2.optJSONObject(r1)
        L1b:
            if (r2 == 0) goto L5f
        L1d:
            java.lang.String r1 = "sdk_key_imsdk"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L5f
            org.json.JSONObject r0 = r2.optJSONObject(r1)
            X.C63314Ot4.LJIILJJIL = r0
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L4b
            X.Osh r0 = X.C63291Osh.LIZ()
            java.lang.String r2 = r2.toString()
            X.Osj r1 = X.C63291Osh.LJ
            r0.getClass()
            java.lang.String r0 = "key_imsdk_settings"
            java.lang.String r0 = X.C63291Osh.LJIIIZ(r0)
            r1.putString(r0, r2)
        L4b:
            org.json.JSONObject r0 = X.C63314Ot4.LJIILJJIL
            if (r0 == 0) goto L5f
            java.lang.String r1 = "im_config"
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto L5f
            org.json.JSONObject r0 = X.C63314Ot4.LJIILJJIL
            org.json.JSONObject r0 = r0.optJSONObject(r1)
            X.C63314Ot4.LJIILIIL = r0
        L5f:
            return
        L60:
            java.lang.String r1 = "settings"
            boolean r0 = r2.has(r1)
            if (r0 == 0) goto L1d
            org.json.JSONObject r2 = r2.optJSONObject(r1)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63308Osy.LJIILJJIL(org.json.JSONObject):void");
    }

    public final void LJIIJJI(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IMClient recover, deleteDB:");
        LIZ.append(z);
        C63322OtC.LJFF(X1D.LIZIZ(LIZ));
        C115064fO c115064fO = new C115064fO();
        c115064fO.LIZ = "core";
        c115064fO.LIZIZ = "db_crash";
        C63291Osh.LIZ().getClass();
        c115064fO.LIZJ.put("last_reset_time", Long.valueOf(C63291Osh.LIZLLL.LIZLLL(0L, C63291Osh.LJIIIZ("im_reset_time"))));
        C63291Osh.LIZ().getClass();
        c115064fO.LIZJ.put("reset_count", Integer.valueOf(C63291Osh.LIZLLL.getInt(C63291Osh.LJIIIZ("im_reset_count"))));
        c115064fO.LIZ();
        C63356Otk.LJIIIZ().LJIIJ(new ARunnableS16S0110000_10(this, z, 2));
    }

    public final synchronized void LJIIL(int i, int i2) {
        if (!this.LJ) {
            return;
        }
        if (LIZLLL().LJJLIIIJJIZ) {
            LJFF().LIZIZ(i, i2, null);
        } else {
            C63356Otk.LJIIIZ().getClass();
            C63356Otk.LJI(i, i2, null);
        }
    }

    public final synchronized void LJIILIIL(int i, java.util.Map<String, Object> map) {
        if (this.LJ) {
            int[] LIZLLL = C63312Ot2.LIZLLL();
            if (LIZLLL == null) {
                return;
            }
            LJI().LIZLLL().getClass();
            LIZJ(LIZLLL, i, map);
        }
    }

    public final void LIZJ(int[] iArr, int i, java.util.Map<String, Object> map) {
        if (iArr == null) {
            return;
        }
        for (int i2 : iArr) {
            if (i2 != -1 && (i2 != 3 || LIZLLL().LJLJJL)) {
                if (LIZLLL().LJJLIIIJJIZ) {
                    LJFF().LIZIZ(i2, i, map);
                } else {
                    C63356Otk.LJIIIZ().getClass();
                    C63356Otk.LJI(i2, i, map);
                }
            }
        }
    }
}
