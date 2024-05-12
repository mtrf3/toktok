package X;

import Y.ARunnableS43S0100000_7;
import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Haj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC44341Haj implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJI;
    public final C82622Wbi LJLIL;
    public final C82631Wbr LJLILLLLZI;

    static {
        TBT tbt = new TBT(AbstractC44341Haj.class, "host", "getHost()Landroidx/fragment/app/FragmentActivity;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJI = new InterfaceC74236TBo[]{tbt};
    }

    public abstract long LIZ();

    public abstract void LIZIZ(int i, long j, String str);

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public AbstractC44341Haj(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJII(diContainer, ActivityC45651qj.class, null);
    }

    public final void LIZJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        Activity activity = (Activity) this.LJLILLLLZI.LIZ(this, LJLJI[0]);
        if (activity != null) {
            activity.runOnUiThread(new ARunnableS43S0100000_7((InterfaceC65784Pro) interfaceC65784Pro, 138));
        }
    }
}
