package X;

import com.ss.android.ugc.aweme.model.CreatorCollectionDetailResponse;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionInfo;
import com.ss.android.ugc.aweme.model.ManagementPagePaidCollectionStatus;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.ss.android.ugc.aweme.service.IPaidContentCreationService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.seriescreation.activity.SeriesDraftActivity$onCreate$1$fetchEditSeries$1$1", f = "SeriesDraftActivity.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.9pI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C248609pI extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super CreatorCollectionDetailResponse>, Object> {
    public final /* synthetic */ SeriesDraftActivity LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C248609pI(SeriesDraftActivity seriesDraftActivity, String str, InterfaceC67352kd<? super C248609pI> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = seriesDraftActivity;
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C248609pI(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        SeriesDraftViewModel LLFII = this.LJLIL.LLFII();
        String collectionId = this.LJLILLLLZI;
        LLFII.getClass();
        o.LJIIIZ(collectionId, "collectionId");
        LLFII.setStateImmediate(C248569pE.LJLIL);
        Object value = LLFII.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-creationService>(...)");
        T LJ = ((IPaidContentCreationService) value).LIZ(collectionId).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJ();
        CreatorCollectionDetailResponse fetchEditSeries$lambda$0 = (CreatorCollectionDetailResponse) LJ;
        if (!C7VX.LIZ()) {
            o.LJIIIIZZ(fetchEditSeries$lambda$0, "fetchEditSeries$lambda$0");
            ManagementPagePaidCollectionInfo managementPagePaidCollectionInfo = fetchEditSeries$lambda$0.collectionDetail;
            String collectionId2 = managementPagePaidCollectionInfo.collectionId;
            String str = managementPagePaidCollectionInfo.name;
            String str2 = managementPagePaidCollectionInfo.description;
            String str3 = managementPagePaidCollectionInfo.coverUrl;
            String str4 = managementPagePaidCollectionInfo.coverUri;
            String str5 = managementPagePaidCollectionInfo.priceInUsd;
            int i = managementPagePaidCollectionInfo.numVideos;
            long j = managementPagePaidCollectionInfo.totalDuration;
            ManagementPagePaidCollectionStatus status = managementPagePaidCollectionInfo.status;
            o.LJIIIZ(collectionId2, "collectionId");
            o.LJIIIZ(status, "status");
            new CreatorCollectionDetailResponse(new ManagementPagePaidCollectionInfo(collectionId2, str, str2, str3, str4, str5, null, i, j, status), fetchEditSeries$lambda$0.videos, fetchEditSeries$lambda$0.routerSchema);
        }
        o.LJIIIIZZ(LJ, "creationService.getColle…          }\n            }");
        return LJ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super CreatorCollectionDetailResponse> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
