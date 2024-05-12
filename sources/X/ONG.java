package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class ONG extends AbstractC65781Prl implements InterfaceC88472Yns<Option, CharSequence> {
    public static final ONG LJLIL = new ONG();

    public ONG() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Option option) {
        Option it = option;
        o.LJIIIZ(it, "it");
        return it.getName();
    }
}
