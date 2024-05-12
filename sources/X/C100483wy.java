package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.service.appsettings.IMUserPortraitDelaySettingsModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.3wy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100483wy {
    public static final java.util.Map<String, String> LIZ = new LinkedHashMap();

    static {
        C221108m2.LIZIZ(C100813xV.LJLIL);
    }

    public static long LIZ() {
        if ((C4LY.LIZIZ() & 64) == 64) {
            return ((IMUserPortraitDelaySettingsModel) C100533x3.LIZIZ.getValue()).longDelay;
        }
        return ((IMUserPortraitDelaySettingsModel) C100533x3.LIZIZ.getValue()).shortDelay;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(java.lang.String r12) {
        /*
            X.Ol8 r0 = X.C100603xA.LIZ
            java.lang.Object r6 = r0.getValue()
            com.bytedance.keva.Keva r6 = (com.bytedance.keva.Keva) r6
            java.lang.String r0 = "kevaRepo"
            kotlin.jvm.internal.o.LJIIIIZZ(r6, r0)
            int r1 = r12.hashCode()
            r0 = -541959104(0xffffffffdfb25c40, float:-2.5704436E19)
            r5 = 0
            if (r1 == r0) goto L97
            r0 = 569317809(0x21ef19b1, float:1.620207E-18)
            if (r1 == r0) goto L8c
            r0 = 585859468(0x22eb818c, float:6.383404E-18)
            if (r1 == r0) goto L80
        L21:
            r10 = r5
        L22:
            if (r10 != 0) goto L25
        L24:
            return r5
        L25:
            java.lang.String r0 = r6.getString(r10, r5)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L34
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Exception -> L34
            goto L35
        L34:
            r0 = r5
        L35:
            if (r0 == 0) goto L24
            long r0 = r0.longValue()
            long r3 = com.ss.android.common.util.NetworkUtils.getServerTimeMills()
            java.lang.String r11 = r6.getString(r12, r5)
            java.lang.String r7 = "key="
            java.lang.String r2 = " timeStamp="
            java.lang.StringBuilder r8 = X.C06490Nh.LIZJ(r7, r12, r2, r0)
            java.lang.String r7 = " currentTime="
            java.lang.String r2 = " portrait="
            X.C0MT.LIZLLL(r8, r7, r3, r2)
            r8.append(r11)
            java.lang.String r2 = X.X1D.LIZIZ(r8)
            java.lang.String r7 = "IMUserPortraitKeva"
            X.C34B.LIZIZ(r7, r2)
            long r8 = r3 - r0
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L79
            java.lang.String r0 = "0"
            r6.storeString(r12, r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r6.storeString(r10, r0)
            java.lang.String r0 = "Over one week, clean portrait"
            X.C34B.LIZIZ(r7, r0)
            goto L24
        L79:
            java.lang.String r0 = "Obtain portrait"
            X.C34B.LIZIZ(r7, r0)
            r5 = r11
            goto L24
        L80:
            java.lang.String r0 = "receive_message_local_label"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L89
            goto L21
        L89:
            java.lang.String r10 = "receive_message_local_time_stamp"
            goto L22
        L8c:
            java.lang.String r0 = "send_message_local_label"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L21
            java.lang.String r10 = "send_message_local_time_stamp"
            goto L22
        L97:
            java.lang.String r0 = "like_message_local_label"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto La0
            goto L21
        La0:
            java.lang.String r10 = "like_message_local_time_stamp"
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C100483wy.LIZIZ(java.lang.String):java.lang.String");
    }

    public static String LIZJ(String str) {
        return C48537J3d.LIZ().LIZJ(str);
    }

    public static void LIZLLL(boolean z, EnumC100693xJ scene) {
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(onEventV3, "onEventV3");
        java.util.Map<String, String> map = LIZ;
        map.put("need_ensure", String.valueOf(z));
        map.put(WM7.SCENE_SERVICE, scene.toString());
        onEventV3.LIZIZ("user_portrait_im_sdk_ensure", map);
    }

    public static void LJFF(String str, String str2) {
        Keva kevaRepo = (Keva) C100603xA.LIZ.getValue();
        o.LJIIIIZZ(kevaRepo, "kevaRepo");
        kevaRepo.storeString(str, str2);
    }

    public static void LJ(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i2) {
        C85323Wm c85323Wm;
        if ((i2 & 4) != 0) {
            str = null;
        }
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            str4 = null;
        }
        if ((i2 & 64) != 0) {
            str5 = null;
        }
        if ((i2 & 128) != 0) {
            str6 = null;
        }
        if ((i2 & 256) != 0) {
            str7 = null;
        }
        if ((i2 & 512) != 0) {
            c85323Wm = C772831o.LIZ();
        } else {
            c85323Wm = null;
        }
        C1HQ c1hq = new C1HQ();
        c1hq.put("experiment", String.valueOf(i));
        c1hq.put("delay_time", String.valueOf(j));
        c1hq.put("has_mutual_follow_friends", str);
        c1hq.put("send_message_label", str2);
        c1hq.put("receive_message_label", str3);
        c1hq.put("like_message_label", str4);
        c1hq.put("send_message_local_label", str5);
        c1hq.put("receive_message_local_label", str6);
        c1hq.put("like_message_local_label", str7);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C30D(c1hq, c85323Wm, null), 3);
    }
}
