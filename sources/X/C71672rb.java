package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel$addStickerSet$2$3$1", f = "StickerSetDetailViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2rb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71672rb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerSetDetailViewModel LJLIL;
    public final /* synthetic */ Throwable LJLILLLLZI;
    public final /* synthetic */ StickerSetInfo LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71672rb(StickerSetDetailViewModel stickerSetDetailViewModel, Throwable th, StickerSetInfo stickerSetInfo, View view, long j, InterfaceC67352kd<? super C71672rb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerSetDetailViewModel;
        this.LJLILLLLZI = th;
        this.LJLJI = stickerSetInfo;
        this.LJLJJI = view;
        this.LJLJJL = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71672rb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        this.LJLIL.setState(new AqS167S0100000_1(this.LJLJI, 106));
        Throwable th = this.LJLILLLLZI;
        boolean z2 = true;
        String str2 = null;
        if (th instanceof C38333F2r) {
            if (((C38306F1q) th).getErrorCode() == 100018) {
                C71572rR.LJII.LJJ(this.LJLJI);
                C26045AKb c26045AKb = new C26045AKb(this.LJLJJI);
                c26045AKb.LJIIIIZZ(R.string.ro8);
                c26045AKb.LJIIJ();
                String valueOf = String.valueOf(this.LJLJJL);
                Long authorUid = this.LJLJI.getAuthorUid();
                if (authorUid != null) {
                    str = authorUid.toString();
                } else {
                    str = null;
                }
                Integer stickerType = this.LJLJI.getStickerType();
                int type = EnumC73222u6.ANIMATED.getType();
                if (stickerType == null || stickerType.intValue() != type) {
                    z = false;
                } else {
                    z = true;
                }
                C87393br.LJII(valueOf, str, "sticker_set_details_page", z, true);
            } else {
                C1FJ.LJI((C38333F2r) this.LJLILLLLZI, new C26045AKb(this.LJLJJI));
            }
        } else {
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLJJI);
            c26045AKb2.LJIIIIZZ(R.string.roa);
            c26045AKb2.LJIIJ();
        }
        String valueOf2 = String.valueOf(this.LJLJJL);
        Long authorUid2 = this.LJLJI.getAuthorUid();
        if (authorUid2 != null) {
            str2 = authorUid2.toString();
        }
        Integer stickerType2 = this.LJLJI.getStickerType();
        int type2 = EnumC73222u6.ANIMATED.getType();
        if (stickerType2 == null || stickerType2.intValue() != type2) {
            z2 = false;
        }
        C87393br.LJII(valueOf2, str2, "sticker_set_details_page", z2, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
