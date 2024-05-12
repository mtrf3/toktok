package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.o;

/* renamed from: X.OMd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61771OMd extends AbstractC65781Prl implements InterfaceC88472Yns<Option, CharSequence> {
    public static final C61771OMd LJLIL = new C61771OMd();

    public C61771OMd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Option option) {
        Option it = option;
        o.LJIIIZ(it, "it");
        return it.getName();
    }
}
