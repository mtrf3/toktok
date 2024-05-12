package X;

import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.ItD, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48035ItD implements InterfaceC29937Boz {
    public final /* synthetic */ JBQ LIZ;
    public final /* synthetic */ Aweme LIZIZ;

    public C48035ItD(JBQ jbq, Aweme aweme) {
        this.LIZ = jbq;
        this.LIZIZ = aweme;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        FrameLayout frameLayout;
        JBQ jbq = this.LIZ;
        Aweme aweme = this.LIZIZ;
        jbq.getClass();
        boolean LIZIZ = JBQ.LIZIZ(aweme);
        if (LIZIZ) {
            frameLayout = jbq.LJLILLLLZI;
        } else {
            frameLayout = jbq.LJLIL;
        }
        jbq.LIZ(jbq.LJLJJI, frameLayout, LIZIZ, false);
    }
}
