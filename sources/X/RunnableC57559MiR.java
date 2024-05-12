package X;

import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;

/* renamed from: X.MiR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class RunnableC57559MiR implements Runnable {
    public boolean LJLIL;
    public final /* synthetic */ AbstractC62595OhT LJLILLLLZI;

    public final void LIZ() {
        if (!this.LJLIL) {
            long currentTimeMillis = System.currentTimeMillis();
            AbstractC62595OhT abstractC62595OhT = this.LJLILLLLZI;
            if (currentTimeMillis >= abstractC62595OhT.LLF) {
                abstractC62595OhT.onDismiss();
                AbstractC62595OhT abstractC62595OhT2 = this.LJLILLLLZI;
                if (!abstractC62595OhT2.LJLLJ && (abstractC62595OhT2.LJLJLJ instanceof InterfaceC55058LjC)) {
                    C55888Lwa.LIZIZ.LIZ(this.LJLILLLLZI.LJLJLJ, new GuideOutPushParam("normal", "homepage_hot", "", "publish", ""));
                }
            }
        }
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

    public RunnableC57559MiR(AbstractC62595OhT abstractC62595OhT) {
        this.LJLILLLLZI = abstractC62595OhT;
    }
}
