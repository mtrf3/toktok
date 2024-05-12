package X;

import com.ss.android.ugc.aweme.models.RssArticle;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T3V extends F9E implements InterfaceC57784Mm4 {
    public final RssArticle LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public T3V(RssArticle rssArticle) {
        o.LJIIIZ(rssArticle, "rssArticle");
        this.LJLIL = rssArticle;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
