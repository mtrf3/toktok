package X;

import android.view.View;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import com.zhiliaoapp.musically.R;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel$addStickerSet$1$1$3$1", f = "StickerSetContentViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71662ra extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ StickerSetContentViewModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C72412sn LJLJI;
    public final /* synthetic */ Throwable LJLJJI;
    public final /* synthetic */ View LJLJJL;
    public final /* synthetic */ Long LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71662ra(StickerSetContentViewModel stickerSetContentViewModel, int i, C72412sn c72412sn, Throwable th, View view, Long l, InterfaceC67352kd<? super C71662ra> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = stickerSetContentViewModel;
        this.LJLILLLLZI = i;
        this.LJLJI = c72412sn;
        this.LJLJJI = th;
        this.LJLJJL = view;
        this.LJLJJLL = l;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71662ra(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean z;
        C141335gf.LIZJ(obj);
        String str2 = null;
        this.LJLIL.listSetItemAt(this.LJLILLLLZI, (int) C72412sn.L(StickerSetInfo.copy$default(this.LJLJI.LJLIL, null, null, null, null, null, null, null, null, new Integer(EnumC71912rz.IN_STORE.getStatus()), null, null, null, null, 7935, null)));
        Throwable th = this.LJLJJI;
        boolean z2 = true;
        if (th instanceof C38333F2r) {
            if (((C38306F1q) th).getErrorCode() == 100018) {
                C71572rR.LJII.LJJ(this.LJLJI.LJLIL);
                C26045AKb c26045AKb = new C26045AKb(this.LJLJJL);
                c26045AKb.LJIIIIZZ(R.string.ro8);
                c26045AKb.LJIIJ();
                String l = this.LJLJJLL.toString();
                Long authorUid = this.LJLJI.LJLIL.getAuthorUid();
                if (authorUid != null) {
                    str = authorUid.toString();
                } else {
                    str = null;
                }
                String ov0 = this.LJLIL.ov0();
                Integer stickerType = this.LJLJI.LJLIL.getStickerType();
                int type = EnumC73222u6.ANIMATED.getType();
                if (stickerType == null || stickerType.intValue() != type) {
                    z = false;
                } else {
                    z = true;
                }
                C87393br.LJII(l, str, ov0, z, true);
            } else {
                C1FJ.LJI((C38333F2r) this.LJLJJI, new C26045AKb(this.LJLJJL));
            }
        } else {
            C26045AKb c26045AKb2 = new C26045AKb(this.LJLJJL);
            c26045AKb2.LJIIIIZZ(R.string.roa);
            c26045AKb2.LJIIJ();
        }
        String l2 = this.LJLJJLL.toString();
        Long authorUid2 = this.LJLJI.LJLIL.getAuthorUid();
        if (authorUid2 != null) {
            str2 = authorUid2.toString();
        }
        String ov02 = this.LJLIL.ov0();
        Integer stickerType2 = this.LJLJI.LJLIL.getStickerType();
        int type2 = EnumC73222u6.ANIMATED.getType();
        if (stickerType2 == null || stickerType2.intValue() != type2) {
            z2 = false;
        }
        C87393br.LJII(l2, str2, ov02, z2, false);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
