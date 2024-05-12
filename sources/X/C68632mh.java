package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutTemplateComponent$compressMedias$3$compressVideoTask$1", f = "AutoCutTemplateComponent.kt", l = {315}, m = "invokeSuspend")
/* renamed from: X.2mh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68632mh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends Long>>, Object> {
    public int LJLIL;
    public final /* synthetic */ HKJ LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;
    public final /* synthetic */ List<HJU> LJLJJI;
    public final /* synthetic */ CreativeInfo LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68632mh(HKJ hkj, Context context, List<HJU> list, CreativeInfo creativeInfo, InterfaceC67352kd<? super C68632mh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = hkj;
        this.LJLJI = context;
        this.LJLJJI = list;
        this.LJLJJL = creativeInfo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68632mh(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            HKJ hkj = this.LJLILLLLZI;
            Context context = this.LJLJI;
            List<HJU> list = this.LJLJJI;
            String LJIIIIZZ = C45087Hml.LJIIIIZZ(this.LJLJJL);
            this.LJLIL = 1;
            obj = hkj.LJJLIIJ(context, list, LJIIIIZZ, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super OSZ<? extends Boolean, ? extends Long>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
