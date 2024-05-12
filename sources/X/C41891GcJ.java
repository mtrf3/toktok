package X;

import android.app.Application;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftSaveResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.GcJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41891GcJ implements GI1 {
    public final /* synthetic */ VideoPublishEditModel LIZ;
    public final /* synthetic */ InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZIZ;
    public final /* synthetic */ InterfaceC88472Yns<DraftSaveResult, C76800UCe> LIZJ;

    @Override // X.GI1
    public final InterfaceC88472Yns<AwemeDraft, C76800UCe> LIZ() {
        return null;
    }

    @Override // X.GI1
    public final void LIZIZ(C142535ib c142535ib) {
        C44172HVg.LJJI.LJI().LIZ().LJ(c142535ib.LJLILLLLZI);
        Application application = C44172HVg.LIZ;
        o.LJIIIIZZ(application, "application");
        new C41896GcO(application, new C41893GcL(application, this.LIZ)).LIZ(c142535ib.LJLILLLLZI);
        this.LIZIZ.invoke(c142535ib.LJLILLLLZI);
    }

    @Override // X.GI1
    public final void LIZJ(C142535ib c142535ib) {
        this.LIZJ.invoke(c142535ib.LJLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C41891GcJ(VideoPublishEditModel videoPublishEditModel, InterfaceC88472Yns<? super AwemeDraft, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super DraftSaveResult, C76800UCe> interfaceC88472Yns2) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = interfaceC88472Yns2;
    }
}
