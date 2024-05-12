package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* renamed from: X.6dK */
/* loaded from: classes3.dex */
public final class C164746dK {
    public static /* synthetic */ String LJFF(InterfaceC171126nc interfaceC171126nc) {
        return interfaceC171126nc.LJIJJLI("");
    }

    public static /* synthetic */ String LJIIIZ(InterfaceC171126nc interfaceC171126nc, VideoPublishEditModel videoPublishEditModel) {
        return interfaceC171126nc.LJJIL(videoPublishEditModel, "");
    }

    public static /* synthetic */ String LJIIIIZZ(InterfaceC171126nc interfaceC171126nc, CreativeInfo creativeInfo, int i) {
        String str;
        boolean z;
        if ((i & 2) != 0) {
            str = "";
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        return interfaceC171126nc.LJIJ(creativeInfo, str, z);
    }
}
