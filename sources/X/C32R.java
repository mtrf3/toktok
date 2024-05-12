package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerUpdateResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.emojiPageV2.PopHelper$bindPopupWindowShow$1$1$2$1", f = "PopHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32R, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C32R extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C4CB LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ FavStickerUpdateResponse LJLJJI;
    public final /* synthetic */ RecyclerView LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ SetSticker LJLJL;
    public final /* synthetic */ VideoSticker LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32R(int i, C4CB c4cb, Long l, FavStickerUpdateResponse favStickerUpdateResponse, RecyclerView recyclerView, String str, SetSticker setSticker, VideoSticker videoSticker, InterfaceC67352kd<? super C32R> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = i;
        this.LJLILLLLZI = c4cb;
        this.LJLJI = l;
        this.LJLJJI = favStickerUpdateResponse;
        this.LJLJJL = recyclerView;
        this.LJLJJLL = str;
        this.LJLJL = setSticker;
        this.LJLJLJ = videoSticker;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C32R(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Long l;
        boolean z;
        Long videoStickerId;
        C141335gf.LIZJ(obj);
        int i = this.LJLIL;
        if (i == AnonymousClass321.ADD.getAction()) {
            C4CB c4cb = this.LJLILLLLZI;
            Long l2 = this.LJLJI;
            FavStickerStruct favSticker = this.LJLJJI.getFavSticker();
            RecyclerView recyclerView = this.LJLJJL;
            c4cb.getClass();
            C71512rL.LJII.LJJ(favSticker);
            IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJ(l2, true);
            C26045AKb c26045AKb = new C26045AKb(recyclerView);
            c26045AKb.LJIIIIZZ(R.string.rnj);
            c26045AKb.LJIIJ();
        } else if (i == AnonymousClass321.REMOVE.getAction()) {
            C4CB c4cb2 = this.LJLILLLLZI;
            Long l3 = this.LJLJI;
            RecyclerView recyclerView2 = this.LJLJJL;
            String str = this.LJLJJLL;
            SetSticker setSticker = this.LJLJL;
            VideoSticker videoSticker = this.LJLJLJ;
            c4cb2.getClass();
            C71512rL.LJII.LJJIII(l3);
            IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJ(l3, false);
            C26045AKb c26045AKb2 = new C26045AKb(recyclerView2);
            c26045AKb2.LJIIIIZZ(R.string.ro2);
            c26045AKb2.LJIIJ();
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
                    if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
                        str2 = videoStickerId.toString();
                    }
                    stickerStoreAnalytics.LIZLLL(str, valueOf, str2, z, true);
                }
            }
            z = false;
            if (videoSticker != null) {
                str2 = videoStickerId.toString();
            }
            stickerStoreAnalytics.LIZLLL(str, valueOf, str2, z, true);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
