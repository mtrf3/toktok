package X;

import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49382JZq implements InterfaceC49388JZw {
    public final /* synthetic */ SearchVideoHolder LIZ;
    public final /* synthetic */ View LIZIZ;

    @Override // X.InterfaceC49388JZw
    public final List<HighlightInfo> LIZ() {
        Aweme aweme = this.LIZ.LJLIL;
        if (aweme != null) {
            return aweme.getHighlightInfoList();
        }
        return null;
    }

    public C49382JZq(SearchVideoHolder searchVideoHolder, View view) {
        this.LIZ = searchVideoHolder;
        this.LIZIZ = view;
    }

    @Override // X.InterfaceC49388JZw
    public final List<Object> LIZIZ(String str, String str2, Position position) {
        int i;
        if (o.LJ(str2, "search_desc")) {
            Object[] objArr = new Object[2];
            Integer LIZIZ = C19N.LIZIZ(this.LIZIZ, "itemView.context", R.attr.go);
            if (LIZIZ != null) {
                i = LIZIZ.intValue();
            } else {
                i = 0;
            }
            objArr[0] = new ForegroundColorSpan(i);
            objArr[1] = new T5W(C49616Jdc.LIZIZ().LIZLLL("medium"));
            return C47261Igj.LJII(objArr);
        }
        return null;
    }
}
