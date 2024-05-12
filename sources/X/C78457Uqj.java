package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78457Uqj implements InterfaceC28610BKs {
    public final /* synthetic */ String LIZ;

    @Override // X.InterfaceC28610BKs
    public final List<EnterRoomConfig> LIZIZ() {
        return LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ).LIZ;
    }

    @Override // X.InterfaceC28610BKs
    public final boolean hasMore() {
        return LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ).hasMore();
    }

    @Override // X.InterfaceC28610BKs
    public final void release() {
        LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ);
    }

    public C78457Uqj(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZ(long j) {
        LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ).LIZ(j);
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZJ(java.util.Map<String, String> map) {
        InterfaceC54958Lha interfaceC54958Lha = LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ).LIZIZ;
        if (interfaceC54958Lha != null) {
            interfaceC54958Lha.LIZIZ(map);
        }
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZLLL(int i, C28609BKr callBack) {
        o.LJIIIZ(callBack, "callBack");
        LiveOuterService.LJJJLL().LJIILL().LJFF(this.LIZ).LIZLLL(i, callBack);
    }
}
