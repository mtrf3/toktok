package X;

import com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService;
import kotlin.jvm.internal.o;

/* renamed from: X.SJj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71891SJj implements ILiveGeckoLoaderService {
    public static final C71891SJj LIZ = new C71891SJj();

    @Override // com.ss.android.ugc.aweme.live.ILiveGeckoLoaderService
    public final void loadGeckoLottie(C29701Eo c29701Eo, String channel, String fileName, boolean z, InterfaceC71889SJh interfaceC71889SJh) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(fileName, "fileName");
        if (interfaceC71889SJh != null) {
            C15490jB.LJIIJJI(c29701Eo, channel, fileName, z, new C71890SJi(interfaceC71889SJh));
        } else {
            C15490jB.LJIIJJI(c29701Eo, channel, fileName, z, null);
        }
    }
}
