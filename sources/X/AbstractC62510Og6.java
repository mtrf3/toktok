package X;

import android.content.Context;
import com.ss.android.ugc.aweme.share.ShareExtService;
import kotlin.jvm.internal.o;

/* renamed from: X.Og6, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC62510Og6 implements ShareExtService {
    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final void LJIIL(Context context, String command) {
        o.LJIIIZ(command, "command");
        if (C16880lQ.LLLLL(context) == null) {
            return;
        }
        F9J.LIZIZ(C16880lQ.LLLLL(context), 0, "share_command").edit().putString("command", command).apply();
    }

    @Override // com.ss.android.ugc.aweme.share.ShareExtService
    public final AbstractC73635Sv9<String> LJJLIIIJLLLLLLLZ(String itemType, String channel, String str) {
        o.LJIIIZ(itemType, "itemType");
        o.LJIIIZ(channel, "channel");
        if (str != null && str.length() == 0) {
            C73320Sq4.LIZ("", "item is null");
            return new C73535StX("");
        }
        o.LJI(str);
        return C62619Ohr.LIZIZ(itemType, channel, str);
    }
}
