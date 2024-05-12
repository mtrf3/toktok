package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderNew;
import com.ss.android.ugc.aweme.feed.adapter.FeedLiveViewHolderOpt;
import kotlin.jvm.internal.o;

/* renamed from: X.Llm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55218Llm extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C55218Llm LJLIL = new C55218Llm();

    public C55218Llm() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ c222588oQ) {
        C222588oQ producerParams = c222588oQ;
        o.LJIIIZ(producerParams, "producerParams");
        View convertView = producerParams.LIZ;
        String eventType = producerParams.LJIIIZ;
        Fragment fragment = producerParams.LIZJ;
        o.LJIIIZ(convertView, "convertView");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(fragment, "fragment");
        if (C53254KvC.LIZ()) {
            return new FeedLiveViewHolderOpt(convertView, fragment, eventType);
        }
        return new FeedLiveViewHolderNew(convertView, fragment, eventType);
    }
}
