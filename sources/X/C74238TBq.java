package X;

import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ui.DubbingStatusViewModel;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TT; */
/* renamed from: X.TBq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74238TBq implements InterfaceC115514g7<Object, AssemViewModel<Y2S>> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZJ;
    public final /* synthetic */ ReusedUISlotAssem LIZ;
    public final /* synthetic */ AbstractC241239dP LIZIZ;

    static {
        TBR tbr = new TBR(C74238TBq.class, "vm", "<v#0>", 0);
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbr};
    }

    /* JADX WARN: Incorrect types in method signature: (TT;LX/9dP;)V */
    public C74238TBq(ReusedUISlotAssem reusedUISlotAssem, AbstractC241239dP abstractC241239dP) {
        this.LIZ = reusedUISlotAssem;
        this.LIZIZ = abstractC241239dP;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.assem.arch.viewModel.AssemViewModel<X.Y2S>, java.lang.Object] */
    @Override // X.InterfaceC115514g7
    public final AssemViewModel<Y2S> LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        ReusedUISlotAssem reusedUISlotAssem = this.LIZ;
        AbstractC241239dP abstractC241239dP = this.LIZIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DubbingStatusViewModel.class);
        return C214348b8.LIZ(reusedUISlotAssem, LIZ, abstractC241239dP, new AqS153S0100000_3(LIZ, 1542), null, C74239TBr.INSTANCE, null, null).LIZ(null, LIZJ[0]);
    }
}
