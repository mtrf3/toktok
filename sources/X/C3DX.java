package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheetViewModel$fetchMissingUsers$1", f = "IMReactionListSheetViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3DX, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3DX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<String> LJLIL;
    public final /* synthetic */ InterfaceC88474Ynu<String, String, Boolean, C3EU, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ IMReactionListSheetViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3DX(List<String> list, InterfaceC88474Ynu<? super String, ? super String, ? super Boolean, ? super C3EU, C76800UCe> interfaceC88474Ynu, IMReactionListSheetViewModel iMReactionListSheetViewModel, InterfaceC67352kd<? super C3DX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = interfaceC88474Ynu;
        this.LJLJI = iMReactionListSheetViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3DX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Iterator<String> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            this.LJLILLLLZI.invoke(it.next(), null, Boolean.FALSE, this.LJLJI.LJLJLJ);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
