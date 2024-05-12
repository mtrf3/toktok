package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ON5 extends AbstractC65781Prl implements InterfaceC88472Yns<Option, CharSequence> {
    public static final ON5 LJLIL = new ON5();

    public ON5() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Option option) {
        Option it = option;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.getId());
    }
}
