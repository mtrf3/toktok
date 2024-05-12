package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel$checkOriginVideoStatus$1", f = "VideoStickerContentViewModel.kt", l = {227}, m = "invokeSuspend")
/* renamed from: X.2iN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65952iN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ VideoStickerContentViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65952iN(VideoStickerContentViewModel videoStickerContentViewModel, InterfaceC67352kd<? super C65952iN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = videoStickerContentViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C65952iN(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<Aweme> awemeList;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                String obj2 = ORZ.LLJI(this.LJLILLLLZI.LJLJJI).toString();
                this.LJLIL = 1;
                obj = C30U.LIZIZ(obj2, "", this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            AwemeDetailList awemeDetailList = (AwemeDetailList) obj;
            if (awemeDetailList != null && (awemeList = awemeDetailList.getAwemeList()) != null) {
                VideoStickerContentViewModel videoStickerContentViewModel = this.LJLILLLLZI;
                Iterator<Aweme> it = awemeList.iterator();
                while (it.hasNext()) {
                    videoStickerContentViewModel.LJLJI.add(it.next().getAid());
                }
            }
        } catch (Exception e) {
            C34B.LJ("StickerContentViewModel", e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
