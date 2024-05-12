package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JLB extends AbstractC65781Prl implements InterfaceC88472Yns<OSZ<? extends Aweme, ? extends Integer>, Aweme> {
    public static final JLB LJLIL = new JLB();

    public JLB() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Aweme invoke(OSZ<? extends Aweme, ? extends Integer> osz) {
        OSZ<? extends Aweme, ? extends Integer> it = osz;
        o.LJIIIZ(it, "it");
        return it.getFirst();
    }
}
