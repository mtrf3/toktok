package X;

import com.bytedance.android.live.liveinteract.multimatch.clientai.CoHostFriendNoticeService;
import kotlin.jvm.internal.o;

/* renamed from: X.Cjm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32162Cjm implements InterfaceC22840v2 {
    public final /* synthetic */ CoHostFriendNoticeService LJLIL;

    public C32162Cjm(CoHostFriendNoticeService coHostFriendNoticeService) {
        this.LJLIL = coHostFriendNoticeService;
    }

    @Override // X.InterfaceC22840v2
    public final void LJIILIIL(C22830v1 outputData) {
        o.LJIIIZ(outputData, "outputData");
        if (!outputData.LIZ()) {
            return;
        }
        this.LJLIL.LJLJJLL = outputData.LIZIZ;
    }
}
