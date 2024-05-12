package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.XZm, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85050XZm implements InterfaceC115514g7<Object, VideoDescVM> {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LIZJ;
    public VideoDescVM LIZ;
    public final InterfaceC115514g7 LIZIZ;

    static {
        TBT tbt = new TBT(C85050XZm.class, "vmByAssemViewModel", "getVmByAssemViewModel()Lcom/bytedance/assem/arch/viewModel/AssemViewModel;", 0);
        C65352Pkq.LIZ.getClass();
        LIZJ = new InterfaceC74236TBo[]{tbt};
    }

    public C85050XZm(ReusedAssem reusedAssem) {
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDescVM.class);
        this.LIZIZ = C214348b8.LIZ(reusedAssem, LIZ, null, new AqS165S0100000_15(LIZ, 908), null, C85051XZn.INSTANCE, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.assem.arch.viewModel.AssemViewModel, com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM] */
    @Override // X.InterfaceC115514g7
    public final VideoDescVM LIZ(Object obj, InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        if (this.LIZ == null) {
            this.LIZ = (AssemViewModel) this.LIZIZ.LIZ(this, LIZJ[0]);
        }
        VideoDescVM videoDescVM = this.LIZ;
        if (videoDescVM != null) {
            return videoDescVM;
        }
        o.LJIJI("localCache");
        throw null;
    }
}
