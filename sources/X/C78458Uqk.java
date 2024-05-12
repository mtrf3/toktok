package X;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Uqk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78458Uqk implements InterfaceC28610BKs {
    public static final /* synthetic */ int LIZJ = 0;
    public List<EnterRoomConfig> LIZ;
    public InterfaceC54958Lha LIZIZ;

    @Override // X.InterfaceC28610BKs
    public final void release() {
    }

    @Override // X.InterfaceC28610BKs
    public final boolean hasMore() {
        InterfaceC54958Lha interfaceC54958Lha = this.LIZIZ;
        if (interfaceC54958Lha == null || !interfaceC54958Lha.hasMore()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC28610BKs
    public final List<EnterRoomConfig> LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZ(long j) {
        InterfaceC54958Lha interfaceC54958Lha = this.LIZIZ;
        if (interfaceC54958Lha != null) {
            interfaceC54958Lha.LIZ(j);
        }
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZJ(java.util.Map<String, String> map) {
        InterfaceC54958Lha interfaceC54958Lha = this.LIZIZ;
        if (interfaceC54958Lha != null) {
            interfaceC54958Lha.LIZIZ(map);
        }
    }

    @Override // X.InterfaceC28610BKs
    public final void LIZLLL(int i, C28609BKr callBack) {
        o.LJIIIZ(callBack, "callBack");
        InterfaceC54958Lha interfaceC54958Lha = this.LIZIZ;
        if (interfaceC54958Lha != null) {
            interfaceC54958Lha.LIZJ(new C50039JkR(callBack));
        }
    }
}
