package X;

import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.LiveEffectRestoreManager$observeBeautyData$1", f = "LiveEffectRestoreManager.kt", l = {255}, m = "invokeSuspend")
/* renamed from: X.2Bl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54372Bl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LJLJI;
    public final /* synthetic */ ComposerFilterViewModel LJLJJI;
    public final /* synthetic */ DataChannel LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54372Bl(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, ComposerFilterViewModel composerFilterViewModel, DataChannel dataChannel, InterfaceC67352kd<? super C54372Bl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = liveSmallItemBeautyViewModel;
        this.LJLJJI = composerFilterViewModel;
        this.LJLJJL = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54372Bl c54372Bl = new C54372Bl(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
        c54372Bl.LJLILLLLZI = obj;
        return c54372Bl;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            XLL xll = this.LJLJI.LJLJI;
            C1KT c1kt = new C1KT(this.LJLJJI, this.LJLJJL, interfaceC70422pa);
            this.LJLIL = 1;
            if (xll.collect(c1kt, this) == enumC58928NAu) {
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
