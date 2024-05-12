package X;

import com.bytedance.keva.Keva;
import defpackage.i0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C76082yi {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZIZ() {
        Keva repo = Keva.getRepo("upvote_publish_cache");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upvote_publish_");
        LIZ2.append(curUserId);
        return C75792yF.LIZLLL(String[].class, repo.getString(X1D.LIZIZ(LIZ2), ""));
    }

    public static java.util.Map LIZJ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Keva repo = Keva.getRepo("upvote_publish_cache");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upvote_publish_failed_3_times_");
        LIZ2.append(curUserId);
        String string = repo.getString(X1D.LIZIZ(LIZ2), "");
        if (string == null || string.length() == 0) {
            return linkedHashMap;
        }
        Object LIZ3 = C75792yF.LIZ(string, new LinkedHashMap().getClass());
        o.LJIIIIZZ(LIZ3, "fromJson(serializedQueue…g, Double>()::class.java)");
        return (java.util.Map) LIZ3;
    }

    public static void LIZ(String itemId) {
        o.LJIIIZ(itemId, "itemId");
        List LLJILJILJ = ORZ.LLJILJILJ(LIZIZ());
        ((ArrayList) LLJILJILJ).remove(itemId);
        LIZLLL(LLJILJILJ);
    }

    public static void LIZLLL(List list) {
        Keva.getRepo("upvote_publish_cache").storeString(i0.LJFF("upvote_publish_", ((RBX) HG3.LJIILL()).getCurUserId()), C75792yF.LIZJ(list));
    }
}
