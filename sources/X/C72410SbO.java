package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import kotlin.jvm.internal.o;

/* renamed from: X.SbO, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72410SbO implements IFetchResourceListener {
    public final /* synthetic */ InterfaceC67352kd<Boolean> LJLIL;

    public C72410SbO(C84654XKg c84654XKg) {
        this.LJLIL = c84654XKg;
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onFailure(Exception exception) {
        o.LJIIIZ(exception, "exception");
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLIL;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }

    @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
    public final void onSuccess(long j) {
        AIGCPictureHandler.hasDownloadModel = true;
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LJLIL;
        Boolean bool = Boolean.TRUE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }
}
