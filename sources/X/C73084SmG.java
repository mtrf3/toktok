package X;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.SmG, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73084SmG implements C9W {
    public static final C73084SmG LIZ = new C73084SmG();

    @Override // X.C9W
    public final void LIZ(EnumC48190Ivi networkType) {
        o.LJIIIZ(networkType, "networkType");
        if (networkType.isWifi()) {
            C0NB.LIZIZ("LiveReplyVideoPlayer", "registerNetworkListener: is wifi");
            java.util.Map<String, String> LIZJ = InterfaceC30442Bx8.f64J.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_REPLAY_SCHEDULED_DOWNLOAD_VIDEO_LIST.value");
            java.util.Map<String, String> LJJLIL = C113554cx.LJJLIL(LIZJ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("taskMap: ");
            LIZ2.append(LJJLIL);
            C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ2));
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Map.Entry entry : ((LinkedHashMap) LJJLIL).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                C0ER.LIZJ().getClass();
                int LIZLLL = C0ER.LIZLLL(str2, str);
                StringBuilder LIZLLL2 = C06540Nm.LIZLLL("foreach replayId: ", str, ", downloadUrl: ", str2, " downloadStatus:");
                C1DD.LJFF(LIZLLL2, LIZLLL, LIZLLL2, "LiveReplyVideoPlayer");
                if (LIZLLL != 2 && LIZLLL != 4) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("postDownloadTask replayId: ");
                    LIZ3.append(str);
                    LIZ3.append(", url; ");
                    LIZ3.append(str2);
                    C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ3));
                    if (!TextUtils.isEmpty(str2)) {
                        C73083SmF.LIZ(str2, str);
                    }
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("toBeRemoveSet replayId: ");
                    LIZ4.append(str);
                    C0NB.LIZIZ("LiveReplyVideoPlayer", X1D.LIZIZ(LIZ4));
                    str.toString();
                    linkedHashSet.add(str);
                }
            }
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                LJJLIL.remove(it.next());
            }
            InterfaceC30442Bx8.f64J.LIZ(LJJLIL);
            return;
        }
        C0NB.LIZIZ("LiveReplyVideoPlayer", "registerNetworkListener: is not wifi");
    }
}
