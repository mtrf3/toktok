package X;

import android.view.View;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.StickerStoreHelper$getAddToFavAction$1$1", f = "StickerStoreHelper.kt", l = {437}, m = "invokeSuspend")
/* renamed from: X.2sE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C72062sE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72062sE(View view, Long l, Integer num, String str, InterfaceC67352kd<? super C72062sE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = view;
        this.LJLJI = l;
        this.LJLJJI = num;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72062sE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            View view = this.LJLILLLLZI;
            if (view == null) {
                return C76800UCe.LIZ;
            }
            Long l = this.LJLJI;
            if (l != null) {
                long longValue = l.longValue();
                Integer num = this.LJLJJI;
                if (num != null) {
                    int intValue = num.intValue();
                    String str = this.LJLJJL;
                    if (str == null) {
                        return C76800UCe.LIZ;
                    }
                    this.LJLIL = 1;
                    if (c88873eF.LIZ("video_sticker_chat_message", "click", view, longValue, intValue, str, null, this) == enumC58928NAu) {
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
