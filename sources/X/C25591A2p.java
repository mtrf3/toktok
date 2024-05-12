package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import com.ss.android.ugc.aweme.service.IPaidContentSdpTrailerService;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem$setupCollectionHeaderUI$imageLoadCallback$1$onComplete$videoPrepJob$1$1", f = "PaidContentCollectionDetailDescriptionAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.A2p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25591A2p extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PaidContentCollectionDetailDescriptionAssem LJLIL;
    public final /* synthetic */ PaidVideoItem LJLILLLLZI;
    public final /* synthetic */ CollectionDetailModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25591A2p(PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem, PaidVideoItem paidVideoItem, CollectionDetailModel collectionDetailModel, InterfaceC67352kd<? super C25591A2p> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = paidContentCollectionDetailDescriptionAssem;
        this.LJLILLLLZI = paidVideoItem;
        this.LJLJI = collectionDetailModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C25591A2p(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Video video;
        boolean z;
        C141335gf.LIZJ(obj);
        Object value = this.LJLIL.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-coverVideoPlayButton>(...)");
        ((View) value).setVisibility(8);
        C16880lQ.LJJIJLIJ(this.LJLIL.v3(), null);
        this.LJLIL.F3().LJLILLLLZI = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI.getAweme();
        if (aweme != null && (video = aweme.getVideo()) != null) {
            PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem = this.LJLIL;
            PaidVideoItem paidVideoItem = this.LJLILLLLZI;
            CollectionDetailModel collectionDetailModel = this.LJLJI;
            paidContentCollectionDetailDescriptionAssem.v3().setVisibility(8);
            J14 A3 = paidContentCollectionDetailDescriptionAssem.A3();
            Object value2 = paidContentCollectionDetailDescriptionAssem.LLIIIILZ.getValue();
            o.LJIIIIZZ(value2, "<get-coverAreaContainer>(...)");
            int width = ((View) value2).getWidth();
            Object value3 = paidContentCollectionDetailDescriptionAssem.LLIIIILZ.getValue();
            o.LJIIIIZZ(value3, "<get-coverAreaContainer>(...)");
            int height = ((View) value3).getHeight();
            int width2 = video.getWidth();
            int height2 = video.getHeight();
            IPaidContentSdpTrailerService iPaidContentSdpTrailerService = (IPaidContentSdpTrailerService) paidContentCollectionDetailDescriptionAssem.LJLJLLL.getValue();
            String valueOf = String.valueOf(collectionDetailModel.getCollectionId());
            if (paidContentCollectionDetailDescriptionAssem.C3().LJLLILLLL != null) {
                z = true;
            } else {
                z = false;
            }
            A3.LIZIZ(paidVideoItem, width, height, width2, height2, iPaidContentSdpTrailerService.LIZJ(valueOf, z));
        }
        this.LJLIL.A3().LIZ();
        return C76800UCe.LIZ;
    }
}
