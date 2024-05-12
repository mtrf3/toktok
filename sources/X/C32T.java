package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.PopHelper$bindPopupWindowShow$1$1$3$1", f = "PopHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32T, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32T extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C4CB LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ SetSticker LJLJJI;
    public final /* synthetic */ VideoSticker LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32T(C4CB c4cb, Throwable th, String str, SetSticker setSticker, VideoSticker videoSticker, InterfaceC67352kd<? super C32T> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c4cb;
        this.LJLILLLLZI = th;
        this.LJLJI = str;
        this.LJLJJI = setSticker;
        this.LJLJJL = videoSticker;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32T(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        Long videoStickerId;
        C141335gf.LIZJ(obj);
        C4CB c4cb = this.LJLIL;
        Throwable th = this.LJLILLLLZI;
        String str = this.LJLJI;
        SetSticker setSticker = this.LJLJJI;
        VideoSticker videoSticker = this.LJLJJL;
        RecyclerView recyclerView = c4cb.LJIJJ;
        if (recyclerView != null) {
            if (th instanceof C38333F2r) {
                C38333F2r c38333F2r = (C38333F2r) th;
                if (c38333F2r.getErrorCode() == 100018) {
                    C26045AKb c26045AKb = new C26045AKb(recyclerView);
                    c26045AKb.LJIIIIZZ(R.string.rnk);
                    c26045AKb.LJIIJ();
                } else {
                    C1FJ.LJI(c38333F2r, new C26045AKb(recyclerView));
                }
            } else {
                C26045AKb c26045AKb2 = new C26045AKb(recyclerView);
                c26045AKb2.LJIIIIZZ(R.string.roa);
                c26045AKb2.LJIIJ();
            }
        }
        boolean z = false;
        C32U stickerStoreAnalytics = IMService.createIIMServicebyMonsterPlugin(false).getStickerStoreAnalytics();
        String str2 = null;
        if (setSticker != null) {
            l = setSticker.getStickerId();
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        if (setSticker != null) {
            Integer stickerType = setSticker.getStickerType();
            int type = EnumC73222u6.ANIMATED.getType();
            if (stickerType != null && stickerType.intValue() == type) {
                z = true;
            }
        }
        if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
            str2 = videoStickerId.toString();
        }
        stickerStoreAnalytics.LIZLLL(str, valueOf, str2, z, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
