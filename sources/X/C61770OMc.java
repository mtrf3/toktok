package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.o;

/* renamed from: X.OMc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61770OMc extends AbstractC65781Prl implements InterfaceC88472Yns<Option, CharSequence> {
    public static final C61770OMc LJLIL = new C61770OMc();

    public C61770OMc() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Option option) {
        Option it = option;
        o.LJIIIZ(it, "it");
        return it.getName();
    }
}
