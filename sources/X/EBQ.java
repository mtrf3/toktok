package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import fjb.a;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.smartcheck.core.SmartCheck$init$2$1", f = "SmartCheck.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_40}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class EBQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public Object LJLIL;
    public ISmartCheckService LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ ISmartCheckService LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EBQ(ISmartCheckService iSmartCheckService, InterfaceC67352kd<? super EBQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = iSmartCheckService;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new EBQ(this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        java.util.Map map;
        ISmartCheckService it;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJI;
        try {
            if (i != 0) {
                if (i == 1) {
                    it = this.LJLILLLLZI;
                    map = (java.util.Map) this.LJLIL;
                    C141335gf.LIZJ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                EBL.LIZ.getClass();
                map = (ConcurrentHashMap) EBL.LIZJ.getValue();
                it = this.LJLJJI;
                o.LJIIIIZZ(it, "it");
                ISmartCheckService iSmartCheckService = this.LJLJJI;
                this.LJLIL = map;
                this.LJLILLLLZI = it;
                this.LJLJI = 1;
                obj = iSmartCheckService.LIZJ(this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            z = ((Boolean) obj).booleanValue();
        } catch (Exception unused) {
            EBX.LIZ(this.LJLJJI.getServiceInfo().LIZ, EBW.INIT);
            z = false;
        }
        map.put(it, Boolean.valueOf(z));
        EBL.LIZ.getClass();
        Object obj2 = ((ConcurrentHashMap) EBL.LIZJ.getValue()).get(this.LJLJJI);
        if (obj2 == null) {
            return Boolean.FALSE;
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
