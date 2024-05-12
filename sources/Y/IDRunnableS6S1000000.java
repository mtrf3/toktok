package Y;

import X.C09970aH;
import X.C14590hj;
import X.C15510jD;
import X.C18230nb;
import X.C29702BlC;
import X.C33641Ts;
import X.C42981mQ;
import X.CN1;
import X.F9U;
import X.InterfaceC30442Bx8;
import X.PMM;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyParamSetting;
import com.bytedance.android.livesdkapi.host.IHostResource;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDRunnableS6S1000000 implements Runnable {
    public final int $t;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        String str;
        C29702BlC LIZ = C18230nb.LIZ("ttlive_enter_preview_all");
        LIZ.LIZJ("beauty_skin", InterfaceC30442Bx8.LJJIFFI.LIZJ());
        LIZ.LIZJ("big_eyes", InterfaceC30442Bx8.LJJII.LIZJ());
        LIZ.LIZJ("face_lift", InterfaceC30442Bx8.LJJIII.LIZJ());
        LiveBeautyParamSetting liveBeautyParamSetting = LiveBeautyParamSetting.INSTANCE;
        LIZ.LIZJ("beauty_skin_default", Float.valueOf(liveBeautyParamSetting.getValue().beauty.def));
        LIZ.LIZJ("beauty_skin_scale", Float.valueOf(liveBeautyParamSetting.getValue().beauty.scale));
        LIZ.LIZJ("big_eyes_default", Float.valueOf(liveBeautyParamSetting.getValue().bigEyes.def));
        LIZ.LIZJ("big_eyes_scale", Float.valueOf(liveBeautyParamSetting.getValue().bigEyes.scale));
        LIZ.LIZJ("face_lift_default", Float.valueOf(liveBeautyParamSetting.getValue().lift.def));
        LIZ.LIZJ("face_lift_scale", Float.valueOf(liveBeautyParamSetting.getValue().lift.scale));
        Integer LIZJ = InterfaceC30442Bx8.LJIIIZ.LIZJ();
        if (LIZJ == null || LIZJ.intValue() != 1) {
            str = "back";
        } else {
            str = "front";
        }
        LIZ.LIZLLL("camera_type", str);
        LIZ.LIZLLL("live_mode", this.s0);
        LIZ.LIZ(InterfaceC30442Bx8.LJIJI.LIZJ(), "filter_position");
        LIZ.LJI = true;
        LIZ.LJIIIZ();
    }

    public final void LIZ$1() {
        C42981mQ c42981mQ = C14590hj.LIZ;
        String str = this.s0;
        if (!c42981mQ.LJLJL || c42981mQ.LJLILLLLZI || c42981mQ.LJLZ) {
            return;
        }
        synchronized (c42981mQ.LJLLILLLL) {
            PMM.LIZ(C09970aH.LIZ, c42981mQ.LJZL, c42981mQ.LJLJLJ);
            if (TextUtils.isEmpty(c42981mQ.LJLL)) {
                F9U.LIZ.LIZ(c42981mQ);
            }
            c42981mQ.LJLL = str;
            c42981mQ.LJIILLIIL();
        }
    }

    public final void LIZ$2() {
        C42981mQ c42981mQ = C14590hj.LIZ;
        String str = this.s0;
        if (!c42981mQ.LJLJL) {
            return;
        }
        synchronized (c42981mQ.LJLLILLLL) {
            if (!str.equals(c42981mQ.LJLL)) {
                return;
            }
            c42981mQ.LJLL = null;
            F9U.LIZ.LJI(c42981mQ);
            HandlerThread handlerThread = PMM.LIZ;
            if (handlerThread != null) {
                handlerThread.quit();
                ((C33641Ts) PMM.LIZJ).LIZ.LJIILLIIL();
                PMM.LIZ = null;
                PMM.LIZIZ = null;
                PMM.LIZJ = null;
            }
            c42981mQ.LJIILLIIL();
        }
    }

    public final void LIZ$3() {
        if (C15510jD.LIZIZ == null) {
            C15510jD.LIZIZ = new LinkedHashSet<>();
        }
        LinkedHashSet<String> linkedHashSet = C15510jD.LIZIZ;
        if (linkedHashSet != null) {
            String channel = this.s0;
            if (!linkedHashSet.contains(channel)) {
                linkedHashSet.add(channel);
                o.LJIIIZ(channel, "channel");
                ((IHostResource) CN1.LIZ(IHostResource.class)).K00(channel);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$4() {
        /*
            r3 = this;
            java.lang.String r2 = r3.s0
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            com.google.gson.Gson r0 = X.C19550pj.LIZ     // Catch: java.lang.Exception -> L18
            if (r0 != 0) goto Lf
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L18
            r0.<init>()     // Catch: java.lang.Exception -> L18
            X.C19550pj.LIZ = r0     // Catch: java.lang.Exception -> L18
        Lf:
            com.google.gson.Gson r0 = X.C19550pj.LIZ     // Catch: java.lang.Exception -> L18
            if (r0 == 0) goto L18
            java.lang.Object r2 = r0.LJII(r2, r1)     // Catch: java.lang.Exception -> L18
            goto L19
        L18:
            r2 = 0
        L19:
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L3e
            X.0nQ r0 = X.EnumC18120nQ.ABNORMAL
            java.lang.String r1 = r0.getValue()
            java.lang.String r0 = "scene"
            r2.put(r0, r1)
            X.Ynr<? super java.lang.String, ? super java.util.Map<java.lang.String, java.lang.String>, X.UCe> r1 = X.C19500pe.LIZJ
            if (r1 == 0) goto L31
            java.lang.String r0 = "btm_page_show"
            r1.invoke(r0, r2)
        L31:
            X.Ol8 r0 = X.C19500pe.LJFF
            java.lang.Object r1 = r0.getValue()
            com.bytedance.keva.Keva r1 = (com.bytedance.keva.Keva) r1
            java.lang.String r0 = "btm_current_cache_page"
            r1.erase(r0)
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDRunnableS6S1000000.LIZ$4():void");
    }

    public static final void run$0(IDRunnableS6S1000000 iDRunnableS6S1000000) {
        boolean LIZ;
        try {
            iDRunnableS6S1000000.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(IDRunnableS6S1000000 iDRunnableS6S1000000) {
        boolean LIZ;
        try {
            iDRunnableS6S1000000.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(IDRunnableS6S1000000 iDRunnableS6S1000000) {
        boolean LIZ;
        try {
            iDRunnableS6S1000000.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(IDRunnableS6S1000000 iDRunnableS6S1000000) {
        boolean LIZ;
        try {
            iDRunnableS6S1000000.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(IDRunnableS6S1000000 iDRunnableS6S1000000) {
        boolean LIZ;
        try {
            iDRunnableS6S1000000.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public IDRunnableS6S1000000(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
