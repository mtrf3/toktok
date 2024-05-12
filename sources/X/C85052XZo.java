package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XZo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85052XZo implements InterfaceC115514g7<Object, TranslationStatusViewModel> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZJ;
    public TranslationStatusViewModel LIZ;
    public final InterfaceC115514g7 LIZIZ;

    static {
        TBT tbt = new TBT(C85052XZo.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt};
    }

    public C85052XZo(ReusedAssem reusedAssem) {
        C65776Prg LIZ = C65352Pkq.LIZ(TranslationStatusViewModel.class);
        this.LIZIZ = C214348b8.LIZ(reusedAssem, LIZ, null, new AqS165S0100000_15(LIZ, 665), null, C85053XZp.INSTANCE, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel] */
    @Override // X.InterfaceC115514g7
    public final TranslationStatusViewModel LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        if (this.LIZ == null) {
            this.LIZ = (AssemViewModel) this.LIZIZ.LIZ(this, LIZJ[0]);
        }
        TranslationStatusViewModel translationStatusViewModel = this.LIZ;
        if (translationStatusViewModel != null) {
            return translationStatusViewModel;
        }
        o.LJIJI("localCache");
        throw null;
    }
}
