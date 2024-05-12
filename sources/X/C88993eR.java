package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.feed.model.InteractionPermission;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.AwemeDetailList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.stickercreation.fragment.VideoCreationTailFragment$checkAweStatus$2$1$1", f = "VideoCreationTailFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3eR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88993eR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AwemeDetailList LJLIL;
    public final /* synthetic */ VideoCreationTailFragment LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C88993eR(AwemeDetailList awemeDetailList, VideoCreationTailFragment videoCreationTailFragment, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C88993eR> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = awemeDetailList;
        this.LJLILLLLZI = videoCreationTailFragment;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C88993eR(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Aweme aweme;
        Long l;
        Integer num;
        InteractPermission interactPermission;
        InteractionPermission allowCreateSticker;
        InteractPermission interactPermission2;
        InteractionPermission allowCreateSticker2;
        String toast;
        InteractPermission interactPermission3;
        InteractionPermission allowCreateSticker3;
        List<Aweme> awemeList;
        C141335gf.LIZJ(obj);
        AwemeDetailList awemeDetailList = this.LJLIL;
        String str = null;
        if (awemeDetailList != null && (awemeList = awemeDetailList.getAwemeList()) != null) {
            aweme = (Aweme) ORZ.LJLLLLLL(0, awemeList);
        } else {
            aweme = null;
        }
        this.LJLILLLLZI.vl().LJLILLLLZI = SystemClock.elapsedRealtime() - this.LJLILLLLZI.vl().LJLILLLLZI;
        if (aweme != null && (interactPermission3 = aweme.getInteractPermission()) != null && (allowCreateSticker3 = interactPermission3.getAllowCreateSticker()) != null && allowCreateSticker3.getStatus() == 0) {
            this.LJLJI.invoke();
        } else {
            DialogC25756A8y dialogC25756A8y = this.LJLILLLLZI.LJLLL;
            if (dialogC25756A8y != null) {
                V1B.LJLILLLLZI(dialogC25756A8y);
            }
            if (aweme != null && (interactPermission2 = aweme.getInteractPermission()) != null && (allowCreateSticker2 = interactPermission2.getAllowCreateSticker()) != null && (toast = allowCreateSticker2.getToast()) != null && C78685UuP.LJJJZ(toast)) {
                C26045AKb c26045AKb = new C26045AKb(this.LJLILLLLZI);
                c26045AKb.LJIIIZ(toast);
                c26045AKb.LJIIJ();
            }
            Integer num2 = new Integer(EnumC89013eT.CHECK_VIDEO_PERMISSION_FAIL.getStatus());
            Long l2 = new Long(SystemClock.elapsedRealtime() - this.LJLILLLLZI.vl().LJLIL);
            Long l3 = new Long(this.LJLILLLLZI.vl().LJLILLLLZI);
            VideoCreationTailFragment videoCreationTailFragment = this.LJLILLLLZI;
            String str2 = videoCreationTailFragment.LJLJLJ;
            VideoSticker videoSticker = videoCreationTailFragment.LJLLI;
            if (videoSticker != null) {
                l = videoSticker.getVideoStickerId();
            } else {
                l = null;
            }
            AwemeDetailList awemeDetailList2 = this.LJLIL;
            if (awemeDetailList2 != null) {
                num = new Integer(awemeDetailList2.error_code);
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            if (aweme != null && (interactPermission = aweme.getInteractPermission()) != null && (allowCreateSticker = interactPermission.getAllowCreateSticker()) != null) {
                str = allowCreateSticker.getToast();
            }
            C35U.LIZ(num2, l2, l3, null, null, str2, l, valueOf, str);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
