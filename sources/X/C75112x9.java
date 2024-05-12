package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.EcMessageApi;
import com.ss.android.ugc.aweme.ecommercelive.business.audience.api.SlimShortTouch;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.ECAudienceWidget$refreshShortTouchItems$1", f = "ECAudienceWidget.kt", l = {1304}, m = "invokeSuspend")
/* renamed from: X.2x9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75112x9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ C71188Rwm LJLJJL;
    public final /* synthetic */ int LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75112x9(String str, String str2, List<String> list, C71188Rwm c71188Rwm, int i, InterfaceC67352kd<? super C75112x9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = list;
        this.LJLJJL = c71188Rwm;
        this.LJLJJLL = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75112x9(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<SlimShortTouch> list;
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
                C74992wx c74992wx = EcMessageApi.LIZ;
                String str = this.LJLILLLLZI;
                String str2 = this.LJLJI;
                List<String> list2 = this.LJLJJI;
                C71188Rwm c71188Rwm = this.LJLJJL;
                Integer num = new Integer(this.LJLJJLL);
                int intValue = ((Number) this.LJLJJL.LLJILJILJ.getValue()).intValue();
                c71188Rwm.getClass();
                long LJIJI = intValue + C78842Uww.LJIJI(V0Q.Default, new UIW(0L, num.intValue()));
                this.LJLIL = 1;
                obj = c74992wx.LIZ(str, str2, list2, LJIJI, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            list = (List) obj;
        } catch (Exception unused) {
            list = null;
        }
        C71188Rwm c71188Rwm2 = this.LJLJJL;
        Room room = c71188Rwm2.LJLJLLL;
        if (room != null && list != null) {
            c71188Rwm2.LJJI(room, list);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
