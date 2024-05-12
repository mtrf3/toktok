package X;

import com.ss.android.ugc.aweme.feed.model.survey.Option;
import kotlin.jvm.internal.o;

/* renamed from: X.OMh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61775OMh extends AbstractC65781Prl implements InterfaceC88472Yns<Option, CharSequence> {
    public static final C61775OMh LJLIL = new C61775OMh();

    public C61775OMh() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Option option) {
        Option it = option;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.getId());
    }
}
