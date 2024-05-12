package X;

import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.BiW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29536BiW {
    public static List LIZ;
    public static List LIZIZ;
    public static String LIZJ;
    public static StickerCheckResponse LIZLLL;

    public static boolean LIZJ(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != 0 && charAt != '\t' && charAt != '\n' && charAt != '\r' && (' ' > charAt || (charAt >= 55296 && (57344 > charAt || (charAt >= 65534 && (0 > charAt || charAt >= 0)))))) {
                return true;
            }
        }
        return false;
    }

    public static String LIZLLL(Long l) {
        List list;
        Object obj;
        String str;
        if (l == null) {
            return null;
        }
        l.longValue();
        if (LIZJ == null && (list = LIZ) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (o.LJ(((C1QC) obj2).LJLIL, "livestickertext")) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (((Sticker) obj).id == l.longValue()) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                Sticker sticker = (Sticker) obj;
                if (sticker != null) {
                    str = sticker.LIZ;
                } else {
                    str = null;
                }
                LIZJ = str;
            }
        }
        return LIZJ;
    }

    public static boolean LJ(Long l) {
        java.util.Map<Long, Boolean> map;
        if (l != null) {
            l.longValue();
            StickerCheckResponse stickerCheckResponse = LIZLLL;
            if (stickerCheckResponse != null && (map = stickerCheckResponse.stickerCheckMap) != null) {
                return o.LJ(map.get(l), Boolean.TRUE);
            }
        }
        return false;
    }

    public static String LJFF(String str) {
        if (str != null) {
            List LJLJJI = s.LJLJJI(str, new char[]{'/'}, false, 6);
            int size = LJLJJI.size();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append((String) ListProtector.get(LJLJJI, size - 2));
            LIZ2.append('/');
            LIZ2.append((String) ListProtector.get(LJLJJI, size - 1));
            return X1D.LIZIZ(LIZ2);
        }
        return "";
    }

    public static boolean LIZ(RoomSticker roomSticker, String str) {
        List list = LIZ;
        if (list != null) {
            if (roomSticker != null) {
                return LIZIZ(str, Long.valueOf(roomSticker.id), list);
            }
        } else if (roomSticker != null) {
            return roomSticker.edited;
        }
        return false;
    }

    public static boolean LIZIZ(String str, Long l, List list) {
        Object obj;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (o.LJ(((C1QC) obj2).LJLIL, "livestickertext")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Iterator<Object> it2 = ((C1QC) it.next()).LJLILLLLZI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj = it2.next();
                    long j = ((Sticker) obj).id;
                    if (l != null && j == l.longValue()) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Sticker sticker = (Sticker) obj;
            if (sticker != null && (str2 = sticker.content) != null) {
                z = !o.LJ(str2, str);
            }
        }
        return z;
    }
}
