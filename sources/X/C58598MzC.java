package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.MzC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58598MzC extends AbstractC65781Prl implements InterfaceC88472Yns<Map.Entry<? extends Aweme, ? extends Integer>, Aweme> {
    public static final C58598MzC LJLIL = new C58598MzC();

    public C58598MzC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Aweme invoke(Map.Entry<? extends Aweme, ? extends Integer> entry) {
        Map.Entry<? extends Aweme, ? extends Integer> it = entry;
        o.LJIIIZ(it, "it");
        return it.getKey();
    }
}
