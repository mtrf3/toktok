package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.2Qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58162Qa {
    public static void LIZ(InterfaceC58172Qb interfaceC58172Qb, List<? extends Aweme> list, int i) {
        if (list == null || list.isEmpty()) {
            return;
        }
        List syncList = Collections.synchronizedList(list);
        o.LJIIIIZZ(syncList, "syncList");
        synchronized (syncList) {
            if (i >= 0) {
                if (i <= syncList.size() - 1) {
                    if (((Aweme) syncList.get(i)).isAd()) {
                        return;
                    }
                    int i2 = i + 1;
                    if (i2 <= syncList.size() - 1 && ((Aweme) syncList.get(i2)).isAd()) {
                        return;
                    }
                    int i3 = i - 1;
                    if (i3 >= 0 && ((Aweme) syncList.get(i3)).isAd()) {
                        return;
                    }
                    if (i + 2 > syncList.size() - 1) {
                        return;
                    }
                    interfaceC58172Qb.LJIIJ(i, list);
                }
            }
        }
    }
}
