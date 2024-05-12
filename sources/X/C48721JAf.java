package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JAf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48721JAf {
    public static void LIZ(Context context, InterfaceC48720JAe interfaceC48720JAe, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        synchronized (aweme) {
            if (interfaceC48720JAe.LIZJ(aweme)) {
                C58582Rq.LIZ("prepareRender: onPreRender", "IAdHybridPreRender");
                interfaceC48720JAe.LJFF(context, aweme);
                C58582Rq.LIZIZ(context, "superlike new prerender");
            }
        }
    }

    public static void LIZJ(Context context, InterfaceC48720JAe interfaceC48720JAe, Aweme aweme) {
        synchronized (aweme) {
            interfaceC48720JAe.LIZ(context, aweme);
        }
    }

    public static void LIZIZ(InterfaceC48720JAe interfaceC48720JAe, Context context, List<? extends Aweme> list, int i) {
        o.LJIIIZ(context, "context");
        if (!interfaceC48720JAe.LJ() || list == null || list.isEmpty()) {
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
                    int i4 = i + 2;
                    if (i4 > syncList.size() - 1) {
                        return;
                    }
                    int size = list.size();
                    while (i4 < size) {
                        Aweme aweme = list.get(i4);
                        if (interfaceC48720JAe.LIZJ(aweme)) {
                            C58582Rq.LIZ("prepareRender: onPreRender", "IAdHybridPreRender");
                            interfaceC48720JAe.LJFF(context, aweme);
                            C58582Rq.LIZIZ(context, "superlike new prerender");
                            return;
                        }
                        i4++;
                    }
                }
            }
        }
    }
}
