package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist.VideoStickerContentCell$onItemViewCreated$4$2", f = "VideoStickerContentCell.kt", l = {170}, m = "invokeSuspend")
/* renamed from: X.346, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass346 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ VideoStickerContentCell LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass346(String str, VideoStickerContentCell videoStickerContentCell, InterfaceC67352kd<? super AnonymousClass346> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = videoStickerContentCell;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new AnonymousClass346(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.3bU] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long videoStickerId;
        Integer stickerType;
        String str;
        Long creatorUid;
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
            String str2 = this.LJLILLLLZI;
            View itemView = this.LJLJI.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            VideoSticker videoSticker = this.LJLJI.LJLJLLL;
            if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
                long longValue = videoStickerId.longValue();
                VideoSticker videoSticker2 = this.LJLJI.LJLJLLL;
                if (videoSticker2 != null && (stickerType = videoSticker2.getStickerType()) != null) {
                    int intValue = stickerType.intValue();
                    VideoSticker videoSticker3 = this.LJLJI.LJLJLLL;
                    if (videoSticker3 != null && (creatorUid = videoSticker3.getCreatorUid()) != null) {
                        str = creatorUid.toString();
                    } else {
                        str = null;
                    }
                    final VideoStickerContentCell videoStickerContentCell = this.LJLJI;
                    ?? r11 = new InterfaceC71992s7() { // from class: X.3bU
                        @Override // X.InterfaceC71992s7
                        public final void onFail() {
                            VideoStickerContentCell.this.L(Integer.valueOf(EnumC87173bV.NOT_FAVORITE.getStatus()));
                            VideoStickerContentCell.this.LJLJLJ = false;
                        }

                        @Override // X.InterfaceC71992s7
                        public final void LIZ(VideoSticker videoSticker4) {
                            VideoStickerContentCell.this.g0(videoSticker4);
                            VideoStickerContentCell.this.LJLJLJ = false;
                        }
                    };
                    this.LJLIL = 1;
                    if (c88873eF.LIZ(str2, "favourite_icon", itemView, longValue, intValue, str, r11, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    return C76800UCe.LIZ;
                }
            } else {
                return C76800UCe.LIZ;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
