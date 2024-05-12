package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$1", f = "ChangAvatarActionStage.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5P8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5P8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ List<OSZ<C121514pn, StickerItemModel>> LJLILLLLZI;
    public final /* synthetic */ C41356GKy LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5P8(VideoPublishEditModel videoPublishEditModel, List<? extends OSZ<C121514pn, ? extends StickerItemModel>> list, C41356GKy c41356GKy, InterfaceC67352kd<? super C5P8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = list;
        this.LJLJI = c41356GKy;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5P8(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C133765Mu LIZIZ = C135215Sj.LIZIZ(this.LJLIL, false);
        List<OSZ<C121514pn, StickerItemModel>> list = this.LJLILLLLZI;
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        for (OSZ<C121514pn, StickerItemModel> osz : list) {
            LIZIZ.LJI().LJIIIIZZ().LJIJI(osz.getFirst());
            osz.getSecond().uuid = osz.getFirst().LIZ;
            videoPublishEditModel.infoStickerModel.stickers.add(osz.getSecond());
        }
        VideoPublishEditModel videoPublishEditModel2 = this.LJLIL;
        videoPublishEditModel2.getPreviewInfo().setPreviewVideoLength(LIZIZ.getDuration());
        videoPublishEditModel2.nleData = LIZIZ.LLJJL();
        this.LJLJI.LIZ(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
