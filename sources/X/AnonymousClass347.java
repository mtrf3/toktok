package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell$onItemViewCreated$4$1", f = "VideoStickerContentCell.kt", l = {135}, m = "invokeSuspend")
/* renamed from: X.347, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass347 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ Fragment LJLILLLLZI;
    public final /* synthetic */ VideoStickerContentCell LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass347(Fragment fragment, VideoStickerContentCell videoStickerContentCell, InterfaceC67352kd<? super AnonymousClass347> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = fragment;
        this.LJLJI = videoStickerContentCell;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass347(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.3bT] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C88873eF c88873eF = C88873eF.LIZ;
            Fragment fragment = this.LJLILLLLZI;
            VideoSticker videoSticker = this.LJLJI.LJLJLLL;
            Integer num = null;
            if (videoSticker != null) {
                l = videoSticker.getVideoStickerId();
            } else {
                l = null;
            }
            VideoSticker videoSticker2 = this.LJLJI.LJLJLLL;
            if (videoSticker2 != null) {
                num = videoSticker2.getStickerType();
            }
            final VideoStickerContentCell videoStickerContentCell = this.LJLJI;
            ?? r7 = new InterfaceC71992s7() { // from class: X.3bT
                @Override // X.InterfaceC71992s7
                public final void onFail() {
                    VideoStickerContentCell.this.L(Integer.valueOf(EnumC87173bV.FAVORITE.getStatus()));
                    VideoStickerContentCell.this.LJLJLJ = false;
                }

                @Override // X.InterfaceC71992s7
                public final void LIZ(VideoSticker videoSticker3) {
                    VideoStickerContentCell.this.g0(videoSticker3);
                    VideoStickerContentCell.this.LJLJLJ = false;
                }
            };
            this.LJLIL = 1;
            if (c88873eF.LJFF(fragment, l, num, r7, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
