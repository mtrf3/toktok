package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WI4 extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;

    static {
        TBT tbt = new TBT(WI4.class, "recordAdaptComponent", "getRecordAdaptComponent()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return new WI3();
    }

    @Override // X.WJB
    public final void LJFF() {
        W4F LIZ = ((WLA) this.LJLJJL.LIZ(this, LJLJJLL[0])).CR().LIZ();
        if (LIZ != null) {
            LIZ.CK(!LIZ.Ps());
        }
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return !HYV.LIZ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WI4(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, WLA.class, null);
    }
}
