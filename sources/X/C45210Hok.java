package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.List;

/* renamed from: X.Hok, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45210Hok implements InterfaceC84907XTz {
    public final /* synthetic */ C45201Hob LIZ;
    public final /* synthetic */ List<InterfaceC45209Hoj> LIZIZ;

    @Override // X.InterfaceC84907XTz
    public final void LIZ(Exception exc) {
        AbstractC45196HoW.LJIIJ(this.LIZ, 1002, null, null, null, 14);
    }

    @Override // X.InterfaceC84907XTz
    public final void LIZIZ(AVMusic aVMusic) {
        if (aVMusic == null) {
            AbstractC45196HoW.LJIIJ(this.LIZ, 1003, null, null, null, 14);
        } else {
            this.LIZ.LJII(aVMusic, this.LIZIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C45210Hok(C45201Hob c45201Hob, List<? extends InterfaceC45209Hoj> list) {
        this.LIZ = c45201Hob;
        this.LIZIZ = list;
    }
}
