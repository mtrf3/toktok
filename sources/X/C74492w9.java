package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS44S1200000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.feed.platform.panel.base.ActionHandler$addAction$1", f = "ActionHandler.kt", l = {143, LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48}, m = "invokeSuspend")
/* renamed from: X.2w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74492w9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ InterfaceC88471Ynr<Object, InterfaceC67352kd<? super C76800UCe>, Object> LJLJI;
    public final /* synthetic */ KU5 LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C74492w9(InterfaceC88471Ynr<Object, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, KU5 ku5, String str, InterfaceC67352kd<? super C74492w9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = interfaceC88471Ynr;
        this.LJLJJI = ku5;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74492w9(this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            KU5 ku5 = this.LJLJJI;
            String str = this.LJLJJL;
            this.LJLIL = str;
            this.LJLILLLLZI = 1;
            XKS xks = new XKS(1, C78555UsJ.LJJII(this));
            xks.LJIIL();
            xks.LJIILIIL(new AqS44S1200000_1(xks, ku5, str, 5));
            CopyOnWriteArraySet<XJL<Object>> copyOnWriteArraySet = ku5.LIZ().get(str);
            if (copyOnWriteArraySet == null) {
                copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            }
            if (ku5.LIZ().get(str) == null) {
                ku5.LIZ().put(str, copyOnWriteArraySet);
            }
            copyOnWriteArraySet.add(xks);
            obj = xks.LJIIJJI();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        InterfaceC88471Ynr<Object, InterfaceC67352kd<? super C76800UCe>, Object> interfaceC88471Ynr = this.LJLJI;
        this.LJLIL = null;
        this.LJLILLLLZI = 2;
        if (interfaceC88471Ynr.invoke(obj, this) == enumC58928NAu) {
            return enumC58928NAu;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
