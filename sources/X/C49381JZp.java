package X;

import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49381JZp implements InterfaceC49388JZw {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC48975JJz LIZ;

    @Override // X.InterfaceC49388JZw
    public final List<HighlightInfo> LIZ() {
        Aweme aweme = this.LIZ.LJLL;
        if (aweme != null) {
            return aweme.getHighlightInfoList();
        }
        return null;
    }

    public C49381JZp(ViewOnAttachStateChangeListenerC48975JJz viewOnAttachStateChangeListenerC48975JJz) {
        this.LIZ = viewOnAttachStateChangeListenerC48975JJz;
    }

    @Override // X.InterfaceC49388JZw
    public final List<Object> LIZIZ(String str, String str2, Position position) {
        boolean z;
        if (o.LJ(str2, "search_desc")) {
            if (this.LIZ.LJLLILLLL == 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return C47261Igj.LJII(new ForegroundColorSpan(C78609UtB.LJJJ(R.attr.go, this.LIZ.itemView.getContext())), new T5W(C49616Jdc.LIZIZ().LIZLLL("medium")));
            }
            return C47261Igj.LJII(new ForegroundColorSpan(C78609UtB.LJJJ(R.attr.dj, this.LIZ.itemView.getContext())), new T5W(C49616Jdc.LIZIZ().LIZLLL("medium")));
        }
        return null;
    }
}
