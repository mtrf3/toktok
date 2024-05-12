package X;

import com.bytedance.im.core.proto.StrangerConversation;
import java.util.Map;

/* renamed from: X.Opv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63119Opv {
    public static boolean LIZ(Long l, java.util.Map map) {
        if (map == null || !map.containsKey("filtered")) {
            return false;
        }
        return ((String) map.get("filtered")).equals(l.toString());
    }

    public static void LIZIZ(C63120Opw c63120Opw, StrangerConversation strangerConversation) {
        java.util.Map<String, String> localExt = c63120Opw.getLocalExt();
        for (Map.Entry<String, String> entry : strangerConversation.ext.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                localExt.put(entry.getKey(), entry.getValue());
            } else if (entry.getKey() != null) {
                localExt.put(entry.getKey(), "");
            }
        }
    }

    public static void LIZJ(C63120Opw c63120Opw, C109544Rq c109544Rq) {
        if (c109544Rq == null) {
            return;
        }
        c63120Opw.setLastShowMessage(c109544Rq);
        c63120Opw.setLastMessageIndex(c109544Rq.getIndex());
        c63120Opw.setUpdatedTime(c109544Rq.getCreatedAt());
    }

    public static void LIZLLL(C63120Opw c63120Opw, C109544Rq c109544Rq, boolean z) {
        String l = Long.toString(C63308Osy.LJI().LIZIZ().getUid());
        boolean z2 = false;
        if (!z) {
            try {
                if (c63120Opw.getCoreInfo() != null && c63120Opw.getCoreInfo().getExt() != null) {
                    java.util.Map<String, String> ext = c63120Opw.getCoreInfo().getExt();
                    if (ext.containsKey("stranger") && l.equals(ext.get("stranger"))) {
                        z2 = true;
                    }
                    c63120Opw.setStranger(z2);
                    return;
                }
            } catch (Exception e) {
                C63322OtC.LJI("StrangerUtil ", "updateStrangerFlag", e);
                C63337OtR.LJFF(e);
                return;
            }
        }
        if (c109544Rq != null && c109544Rq.getExt() != null) {
            java.util.Map<String, String> ext2 = c109544Rq.getExt();
            if (ext2.containsKey("stranger") && l.equals(ext2.get("stranger"))) {
                z2 = true;
            }
            c63120Opw.setStranger(z2);
            return;
        }
        c63120Opw.setStranger(false);
    }
}
