package X;

import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class LPI implements InterfaceC42561Gn7 {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final Lifecycle LJLIL;
    public InterfaceC83060Wim LJLJI;
    public final List<InterfaceC53742L7i> LJLILLLLZI = new ArrayList();
    public boolean LJLJJI = true;
    public final LPB LJLJJL = new LPB(this);

    static {
        TBV tbv = new TBV(LPI.class, "renderContext", "getRenderContext()Lcom/ss/android/ugc/aweme/editSticker/gesture/group/IVETextStickerRenderContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbv};
    }

    @Override // X.InterfaceC42561Gn7
    public final InterfaceC42558Gn4 LIZ() {
        return this.LJLJJL.LIZ(this, LJLJJLL[0]);
    }

    public LPI(Lifecycle lifecycle) {
        this.LJLIL = lifecycle;
    }
}
