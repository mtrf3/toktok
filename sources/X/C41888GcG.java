package X;

import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.model.RecordScene;
import kotlin.jvm.internal.o;

/* renamed from: X.GcG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41888GcG extends AbstractC84033WyT {
    public final /* synthetic */ RecordScene LJI;

    @Override // X.AbstractC84033WyT
    public final String LIZJ() {
        InterfaceC171126nc LIZIZ = C5YW.LIZIZ();
        CreativeInfo creativeInfo = this.LJI.creativeInfo;
        o.LJIIIIZZ(creativeInfo, "recordScene.creativeInfo");
        return C164746dK.LJIIIIZZ(LIZIZ, creativeInfo, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41888GcG(RecordScene recordScene) {
        super("");
        this.LJI = recordScene;
    }
}
