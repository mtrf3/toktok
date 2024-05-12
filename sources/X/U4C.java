package X;

import android.util.LruCache;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.gson.j;
import com.google.gson.m;

/* loaded from: classes14.dex */
public final class U4C {
    public static final LruCache<String, m> LIZ = new LruCache<>(5);
    public static boolean LIZIZ;

    public static String LIZJ() {
        m mVar;
        String str = null;
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (mVar = LIZ.get(room.getIdStr())) == null) {
                return null;
            }
            str = mVar.toString();
            return str;
        } catch (Throwable th) {
            C0K2.LIZ("getRawStringValue error", th);
            return str;
        }
    }

    public static Boolean LIZ(String str) {
        m mVar;
        j LJJIJ;
        Boolean bool = null;
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (mVar = LIZ.get(room.getIdStr())) == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return null;
            }
            bool = Boolean.valueOf(LJJIJ.LJFF());
            return bool;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getBoolValue error ");
            LIZ2.append(str);
            C0K2.LIZ(X1D.LIZIZ(LIZ2), th);
            return bool;
        }
    }

    public static Integer LIZIZ(String str) {
        m mVar;
        j LJJIJ;
        Integer num = null;
        try {
            Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
            if (room == null || (mVar = LIZ.get(room.getIdStr())) == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return null;
            }
            num = Integer.valueOf(LJJIJ.LJIILJJIL());
            return num;
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getIntValue error ");
            LIZ2.append(str);
            C0K2.LIZ(X1D.LIZIZ(LIZ2), th);
            return num;
        }
    }

    public static void LIZLLL(String str, String str2) {
        if (str2.length() == 0) {
            return;
        }
        if (str != null && str.length() == 0) {
            return;
        }
        try {
            if (LIZ.put(str2, C38393F4z.LJ(str)) != null) {
                return;
            }
            C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("receive live sei = ");
            LIZ2.append(str);
            String LIZIZ2 = X1D.LIZIZ(LIZ2);
            LJIILIIL.getClass();
            C0NE.LIZ("live_ab", LIZIZ2);
        } catch (Throwable th) {
            C0K2.LIZ("parseSei error", th);
        }
    }
}
