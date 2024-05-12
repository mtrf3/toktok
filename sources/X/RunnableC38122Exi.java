package X;

import android.webkit.WebResourceResponse;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.o;

/* renamed from: X.Exi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC38122Exi implements Runnable {
    public final /* synthetic */ C38113ExZ LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C68322mC<WebResourceResponse> LJLJJI;
    public final /* synthetic */ C68322mC<String> LJLJJL;
    public final /* synthetic */ CountDownLatch LJLJJLL;

    public RunnableC38122Exi(C38113ExZ c38113ExZ, C68322mC<String> c68322mC, C68322mC<String> c68322mC2, C68322mC<WebResourceResponse> c68322mC3, C68322mC<String> c68322mC4, CountDownLatch countDownLatch) {
        this.LJLIL = c38113ExZ;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = c68322mC2;
        this.LJLJJI = c68322mC3;
        this.LJLJJL = c68322mC4;
        this.LJLJJLL = countDownLatch;
    }

    public final void LIZ() {
        AbstractC38114Exa abstractC38114Exa;
        C38113ExZ c38113ExZ = this.LJLIL;
        if (c38113ExZ != null) {
            abstractC38114Exa = c38113ExZ.LIZ;
        } else {
            abstractC38114Exa = null;
        }
        o.LJII(abstractC38114Exa, "null cannot be cast to non-null type com.bytedance.ies.web.jsbridge2.WebViewBridge");
        C38115Exb c38115Exb = (C38115Exb) abstractC38114Exa;
        String str = this.LJLILLLLZI.element;
        C38124Exk c38124Exk = new C38124Exk(this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        String str2 = this.LJLJI.element;
        if (c38115Exb.LJFF) {
            return;
        }
        C38185Eyj c38185Eyj = new C38185Eyj();
        c38185Eyj.LIZLLL();
        c38185Eyj.LIZ = "label_pre_call_origin_url";
        TimeLineEvent LIZIZ = c38185Eyj.LIZIZ();
        C1JX.LJIIIIZZ("Received call: ", str);
        c38115Exb.LIZLLL.execute(new RunnableC38121Exh(c38115Exb, str, c38124Exk, str2, LIZIZ));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
