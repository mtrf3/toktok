package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastTaskResourceIdSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$emitKeyword$1", f = "IMSearchEngine.kt", l = {LiveBroadcastTaskResourceIdSetting.DEFAULT}, m = "invokeSuspend")
/* renamed from: X.3Zy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86223Zy extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C86233Zz<SEARCH_RESULT> LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86223Zy(C86233Zz<SEARCH_RESULT> c86233Zz, String str, String str2, InterfaceC67352kd<? super C86223Zy> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c86233Zz;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C86223Zy(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
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
            C3BJ c3bj = (C3BJ) this.LJLILLLLZI.LJI.getValue();
            C86333a9 c86333a9 = new C86333a9(this.LJLJI, this.LJLJJI, System.currentTimeMillis());
            this.LJLIL = 1;
            if (c3bj.emit(c86333a9, this) == enumC58928NAu) {
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
