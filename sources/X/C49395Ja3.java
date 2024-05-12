package X;

import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchUserViewHolder;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ja3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49395Ja3 implements InterfaceC49388JZw {
    public final /* synthetic */ SearchUserViewHolder LIZ;

    @Override // X.InterfaceC49388JZw
    public final List<HighlightInfo> LIZ() {
        User user = this.LIZ.LLFF;
        if (user != null) {
            return user.getHighlightInfoList();
        }
        return null;
    }

    public C49395Ja3(SearchUserViewHolder searchUserViewHolder) {
        this.LIZ = searchUserViewHolder;
    }

    @Override // X.InterfaceC49388JZw
    public final List<Object> LIZIZ(String str, String str2, Position position) {
        int i;
        if (o.LJ(str2, "search_user_name") || o.LJ(str2, "search_user_desc")) {
            Object[] objArr = new Object[2];
            Integer LJI = C79045V0n.LJI(R.attr.go, this.LIZ.getContext());
            if (LJI != null) {
                i = LJI.intValue();
            } else {
                i = 0;
            }
            objArr[0] = new ForegroundColorSpan(i);
            objArr[1] = new T5W(C49616Jdc.LIZIZ().LIZLLL("medium"));
            return C47261Igj.LJJIJIIJI(objArr);
        }
        return null;
    }
}
