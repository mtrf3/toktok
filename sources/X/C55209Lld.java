package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.search.SearchLiveCardViewHolder;
import kotlin.jvm.internal.o;

/* renamed from: X.Lld, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55209Lld extends AbstractC65781Prl implements InterfaceC88472Yns<C222588oQ, C2MA> {
    public static final C55209Lld LJLIL = new C55209Lld();

    public C55209Lld() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C2MA invoke(C222588oQ c222588oQ) {
        C222588oQ it = c222588oQ;
        o.LJIIIZ(it, "it");
        View convertView = it.LIZ;
        String eventType = it.LJIIIZ;
        Fragment fragment = it.LIZJ;
        o.LJIIIZ(convertView, "convertView");
        o.LJIIIZ(eventType, "eventType");
        o.LJIIIZ(fragment, "fragment");
        return new SearchLiveCardViewHolder(convertView, fragment, eventType);
    }
}
