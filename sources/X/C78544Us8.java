package X;

import com.ss.android.ugc.aweme.port.internal.IFluencyService;
import com.ss.android.ugc.aweme.setting.performance.ToolsBaseInfoConfig;
import fjb.a;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.ToolsFluencyEventReport$start$2$1$1", f = "ToolsFluencyEventReport.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Us8, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78544Us8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C78542Us6 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78544Us8(C78542Us6 c78542Us6, InterfaceC67352kd<? super C78544Us8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c78542Us6;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C78544Us8(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IFluencyService LJJI = C60903NvH.LJIIJJI().LJJI();
        C62822Ol8 c62822Ol8 = C78547UsB.LIZJ;
        ToolsBaseInfoConfig value = (ToolsBaseInfoConfig) c62822Ol8.getValue();
        o.LJIIIIZZ(value, "value");
        LJJI.getCurrentFluencyInfo(value.getCollectDuration(), new AqS179S0100000_13(this.LJLIL, 357), new AqS179S0100000_13(this.LJLIL, 358));
        C78542Us6 c78542Us6 = this.LJLIL;
        ToolsBaseInfoConfig value2 = (ToolsBaseInfoConfig) c62822Ol8.getValue();
        o.LJIIIIZZ(value2, "value");
        c78542Us6.LJIILLIIL = new Long(value2.getCollectDuration());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
