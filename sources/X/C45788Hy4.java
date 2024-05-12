package X;

import android.content.Context;
import com.ss.android.ugc.aweme.services.IFoundationAVService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* renamed from: X.Hy4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45788Hy4 implements IFoundationAVService.IFetchResourcesListener {
    public final /* synthetic */ InterfaceC45790Hy6 LJLIL;
    public final /* synthetic */ AVMusic LJLILLLLZI;
    public final /* synthetic */ C45774Hxq LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ InterfaceC149485to LJLJL;

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onFailed(Exception exc) {
        InterfaceC45790Hy6 interfaceC45790Hy6 = this.LJLIL;
        if (interfaceC45790Hy6 != null) {
            interfaceC45790Hy6.LJ(exc);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
    public final void onSuccess(String[] requirements) {
        o.LJIIIZ(requirements, "requirements");
        InterfaceC45790Hy6 interfaceC45790Hy6 = this.LJLIL;
        if (interfaceC45790Hy6 != null) {
            interfaceC45790Hy6.LJFF();
        }
        AVMusic aVMusic = this.LJLILLLLZI;
        if (aVMusic != null) {
            C45771Hxn.LJII(aVMusic);
            C45774Hxq c45774Hxq = this.LJLJI;
            Context context = this.LJLJJI;
            AVMusic aVMusic2 = this.LJLILLLLZI;
            C45791Hy7 c45791Hy7 = new C45791Hy7(this.LJLIL);
            c45774Hxq.getClass();
            C45422HsA.LIZIZ(context, aVMusic2, c45791Hy7);
            return;
        }
        C45774Hxq c45774Hxq2 = this.LJLJI;
        final int i = this.LJLJJL;
        final String str = this.LJLJJLL;
        C45789Hy5 c45789Hy5 = new C45789Hy5(this.LJLIL, c45774Hxq2, this.LJLJJI);
        InterfaceC149485to interfaceC149485to = this.LJLJL;
        c45774Hxq2.getClass();
        C10K.LIZJ(new Callable() { // from class: X.6DW
            @Override // java.util.concurrent.Callable
            public final Object call() {
                try {
                    return C78934UyQ.LJLIL.getMusicService().LJJIIZI(i, str);
                } catch (Exception e) {
                    C6BJ.LIZLLL(e, false);
                    C16880lQ.LLLLIIL(e);
                    return null;
                }
            }
        }).LJ(new C45787Hy3(c45789Hy5, c45774Hxq2, i, interfaceC149485to), C10K.LJIIIIZZ, null);
    }

    public C45788Hy4(InterfaceC45790Hy6 interfaceC45790Hy6, AVMusic aVMusic, Context context, int i, String str, long j, InterfaceC149485to interfaceC149485to) {
        C45774Hxq c45774Hxq = C45774Hxq.LIZ;
        this.LJLIL = interfaceC45790Hy6;
        this.LJLILLLLZI = aVMusic;
        this.LJLJI = c45774Hxq;
        this.LJLJJI = context;
        this.LJLJJL = i;
        this.LJLJJLL = str;
        this.LJLJL = interfaceC149485to;
    }
}
