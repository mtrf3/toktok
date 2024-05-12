package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ui.jedi.SearchJediMixFeedFragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Jf9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49711Jf9 extends AbstractC65781Prl implements InterfaceC88471Ynr<C3C8, Boolean, C76800UCe> {
    public final /* synthetic */ SearchJediMixFeedFragment LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49711Jf9(SearchJediMixFeedFragment searchJediMixFeedFragment) {
        super(2);
        this.LJLIL = searchJediMixFeedFragment;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(C3C8 selectSubscribe, Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (booleanValue && C46438IKk.LJJIZ()) {
            java.util.Map<String, C50420Jqa> map = this.LJLIL.om().LJLIL;
            if (!map.isEmpty()) {
                SearchJediMixFeedFragment searchJediMixFeedFragment = this.LJLIL;
                Iterator it = ((LinkedHashMap) map).entrySet().iterator();
                while (it.hasNext()) {
                    searchJediMixFeedFragment.Ln((C50420Jqa) ((Map.Entry) it.next()).getValue());
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
