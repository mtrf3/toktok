package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HMv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43953HMv implements IAVInfoService.IGetInfoCallback<List<? extends MusicModel>> {
    public final /* synthetic */ InterfaceC43955HMx LIZ;

    public C43953HMv(InterfaceC43955HMx interfaceC43955HMx) {
        this.LIZ = interfaceC43955HMx;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
    public final void finish(List<? extends MusicModel> list) {
        List<? extends MusicModel> result = list;
        o.LJIIIZ(result, "result");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cnt:");
        LIZ.append(result.size());
        C36922EeM.LIZLLL(3, "Local Sound filter result", X1D.LIZIZ(LIZ));
        InterfaceC43955HMx interfaceC43955HMx = this.LIZ;
        if (interfaceC43955HMx != null) {
            interfaceC43955HMx.onSuccess(result);
        }
    }
}
