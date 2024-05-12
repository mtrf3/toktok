package X;

import com.ss.android.ugc.effectmanager.knadapt.ListenerAdaptExtKt;
import com.ss.ugc.effectplatform.model.net.InfoStickerListResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TOq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74576TOq implements XDR<InfoStickerListResponse> {
    public final /* synthetic */ InterfaceC65052gv LIZ;

    public C74576TOq(C73578SuE c73578SuE) {
        this.LIZ = c73578SuE;
    }

    @Override // X.XDR
    public final void onSuccess(InfoStickerListResponse infoStickerListResponse) {
        InfoStickerListResponse response = infoStickerListResponse;
        o.LJIIIZ(response, "response");
        ((C73578SuE) this.LIZ).onSuccess(C1XY.LJJIIJ(response.getData()));
    }

    @Override // X.XDR
    public final void preProcess(InfoStickerListResponse infoStickerListResponse) {
    }

    @Override // X.XDR
    public final void onFail(InfoStickerListResponse infoStickerListResponse, C84418XBe exception) {
        o.LJIIIZ(exception, "exception");
        ((C73578SuE) this.LIZ).tryOnError(C84499XEh.LJIIIZ(ListenerAdaptExtKt.toOldExceptionResult(exception)));
    }
}
