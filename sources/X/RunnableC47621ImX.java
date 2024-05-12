package X;

import com.bytedance.android.widget.DataCenter;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.ImX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC47621ImX implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                ((DataCenter) this.LJLILLLLZI).gv0(this.LJLJJI, (String) this.LJLJI);
                return;
            case 1:
                C49914JiQ c49914JiQ = (C49914JiQ) this.LJLILLLLZI;
                Exception exc = (Exception) this.LJLJI;
                C10K c10k = (C10K) this.LJLJJI;
                c49914JiQ.mIsLoading = false;
                c49914JiQ.LJLJLJ = false;
                C49919JiV c49919JiV = c49914JiQ.LLIIIL;
                if (exc == null) {
                    exc = c10k.LJIIJ();
                }
                c49919JiV.LJJIIZ(1, exc);
                return;
            default:
                EnginePreloader enginePreloader = (EnginePreloader) this.LJLILLLLZI;
                C47121IeT c47121IeT = (C47121IeT) this.LJLJI;
                C47069Idd c47069Idd = (C47069Idd) this.LJLJJI;
                enginePreloader.getClass();
                InterfaceC47616ImS interfaceC47616ImS = c47069Idd.LIZLLL;
                if (interfaceC47616ImS instanceof C47156If2) {
                    interfaceC47616ImS.getClass();
                } else if (interfaceC47616ImS instanceof C47164IfA) {
                }
                if (c47121IeT.LIZ == 9) {
                    Iterator it = ((CopyOnWriteArrayList) enginePreloader.LJ).iterator();
                    while (it.hasNext()) {
                        InterfaceC47101Ie9 interfaceC47101Ie9 = (InterfaceC47101Ie9) ((Reference) it.next()).get();
                        if (interfaceC47101Ie9 != null) {
                            interfaceC47101Ie9.G1();
                        }
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC47621ImX(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
