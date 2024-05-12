package X;

import android.graphics.Paint;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TaO, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74896TaO {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C124304uI.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C124314uJ.LJLIL);

    public static java.util.Map LIZLLL() {
        return (java.util.Map) LIZ.getValue();
    }

    public static java.util.Map LJ() {
        return (java.util.Map) LIZIZ.getValue();
    }

    public static List LIZIZ(long j) {
        List<String> list;
        C124294uH c124294uH = (C124294uH) LJ().get(Long.valueOf(j));
        if (c124294uH == null || (list = c124294uH.LIZIZ) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static List LIZJ(long j) {
        List<String> list;
        C124294uH c124294uH = (C124294uH) LJ().get(Long.valueOf(j));
        if (c124294uH == null || (list = c124294uH.LIZ) == null) {
            return new ArrayList();
        }
        return list;
    }

    public static void LJI(LinkPlayerInfo info) {
        o.LJIIIZ(info, "info");
        List<String> list = info.tagKeyList;
        if (list != null) {
            LJ().put(Long.valueOf(info.mUser.getId()), new C124294uH(list, LIZ(0, info)));
        }
    }

    public static void LJIIIIZZ(java.util.Map map) {
        LIZLLL().clear();
        LIZLLL().putAll(map);
    }

    public static List LIZ(int i, LinkPlayerInfo info) {
        int i2;
        String str;
        o.LJIIIZ(info, "info");
        ArrayList arrayList = new ArrayList();
        List<String> list = info.tagKeyList;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        StringBuilder sb = new StringBuilder("");
        String str2 = null;
        if (i2 == 1) {
            List<String> list2 = info.tagKeyList;
            if (list2 != null) {
                str2 = (String) ListProtector.get(list2, 0);
            }
            LJII(sb, arrayList, str2, i);
        } else if (i2 > 1) {
            List<String> list3 = info.tagKeyList;
            if (list3 != null) {
                str = (String) ListProtector.get(list3, 0);
            } else {
                str = null;
            }
            Boolean valueOf = Boolean.valueOf(LJII(sb, arrayList, str, i));
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                sb.append(" · ");
                List<String> list4 = info.tagKeyList;
                if (list4 != null) {
                    str2 = (String) ListProtector.get(list4, 1);
                }
                LJII(sb, arrayList, str2, i);
            }
        }
        return arrayList;
    }

    public static String LJFF(int i, LinkPlayerInfo info) {
        o.LJIIIZ(info, "info");
        List LIZ2 = LIZ(i, info);
        ArrayList arrayList = (ArrayList) LIZ2;
        if (arrayList.size() == 1) {
            String str = (String) LIZLLL().get(ListProtector.get(LIZ2, 0));
            if (str == null) {
                return "";
            }
            return str;
        }
        if (arrayList.size() <= 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((String) LIZLLL().get(ListProtector.get(LIZ2, 0)));
        sb.append(" · ");
        return C0EH.LIZJ(sb, (String) LIZLLL().get(ListProtector.get(LIZ2, 1)), "StringBuilder().apply {\n…\n            }.toString()");
    }

    public static boolean LJII(StringBuilder sb, List list, String str, int i) {
        String str2;
        if (str == null || (str2 = (String) LIZLLL().get(str)) == null) {
            return false;
        }
        Paint paint = new Paint();
        paint.setTextSize(C15380j0.LIZ(13.0f));
        if (paint.measureText(sb.toString() + str2) <= (C15380j0.LJIIL() - C15380j0.LIZ(224.0f)) - i) {
            sb.append(str2);
            ((ArrayList) list).add(str);
            return true;
        }
        return false;
    }
}
