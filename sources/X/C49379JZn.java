package X;

import android.content.Context;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.searchphoto.core.SearchPhotoStaticInfoAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JZn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49379JZn implements InterfaceC49388JZw {
    public final /* synthetic */ SearchPhotoStaticInfoAssem LIZ;

    @Override // X.InterfaceC49388JZw
    public final List<HighlightInfo> LIZ() {
        Aweme aweme = this.LIZ.LL;
        if (aweme != null) {
            return aweme.getHighlightInfoList();
        }
        return null;
    }

    public C49379JZn(SearchPhotoStaticInfoAssem searchPhotoStaticInfoAssem) {
        this.LIZ = searchPhotoStaticInfoAssem;
    }

    @Override // X.InterfaceC49388JZw
    public final List<Object> LIZIZ(String str, String str2, Position position) {
        Context context;
        int i;
        if (o.LJ(str2, "search_desc") && (context = this.LIZ.getContext()) != null) {
            Object[] objArr = new Object[2];
            Integer LJI = C79045V0n.LJI(R.attr.go, context);
            if (LJI != null) {
                i = LJI.intValue();
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
