package X;

import Y.ARunnableS29S0200000_10;
import android.os.AsyncTask;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.Request;
import kotlin.jvm.internal.o;

/* renamed from: X.O3s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61292O3s extends AbstractC65781Prl implements InterfaceC88472Yns<C61295O3v, C76800UCe> {
    public final /* synthetic */ Forest LJLIL;
    public final /* synthetic */ Request LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C38515F9r LJLJJI;
    public final /* synthetic */ InterfaceC88472Yns LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C61292O3s(Forest forest, Request request, boolean z, C38515F9r c38515F9r, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = forest;
        this.LJLILLLLZI = request;
        this.LJLJI = z;
        this.LJLJJI = c38515F9r;
        this.LJLJJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C61295O3v c61295O3v) {
        C61295O3v it = c61295O3v;
        o.LJIIJ(it, "it");
        if (it.LJZL && this.LJLILLLLZI.getLoadToMemory() && C61325O4z.LIZIZ() && !this.LJLILLLLZI.getAllowIOOnMainThread()) {
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new ARunnableS29S0200000_10(this, it, 5));
        } else {
            this.LJLIL.finishWithCallback(it, this.LJLJI, this.LJLJJI, this.LJLJJL);
        }
        return C76800UCe.LIZ;
    }
}
