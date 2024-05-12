package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.following.ui.SuggestRelationFragment;
import com.ss.android.ugc.aweme.notice.api.bean.GuideOutPushParam;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Av8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27770Av8 implements InterfaceC57910Mo6 {
    public final /* synthetic */ SuggestRelationFragment LJLIL;

    public C27770Av8(SuggestRelationFragment suggestRelationFragment) {
        this.LJLIL = suggestRelationFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC57910Mo6
    public final void kR(AbstractC57828Mmm<?> abstractC57828Mmm) {
        Context context;
        String str;
        List<String> urlList;
        if (abstractC57828Mmm instanceof C57830Mmo) {
            User user = (User) abstractC57828Mmm.LIZ;
            if ((user.getFollowStatus() == EnumC57435MgR.FOLLOWED.getValue() || user.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue() || user.getFollowStatus() == EnumC57435MgR.FOLLOW_REQUESTED.getValue()) && (context = this.LJLIL.getContext()) != null) {
                SuggestRelationFragment suggestRelationFragment = this.LJLIL;
                INoticeService LJJJJJ = NoticeServiceImpl.LJJJJJ();
                if (LJJJJJ != null) {
                    suggestRelationFragment.getClass();
                    UrlModel avatarThumb = user.getAvatarThumb();
                    if (avatarThumb != null && (urlList = avatarThumb.getUrlList()) != null) {
                        str = (String) ORZ.LJLLLL(urlList);
                    } else {
                        str = null;
                    }
                    LJJJJJ.LJJJJI(context, new GuideOutPushParam("suggested_list", (String) null, "follow", str, 5));
                }
            }
        }
    }

    @Override // X.InterfaceC57910Mo6
    public final void ww(C57778Mly state) {
        o.LJIIIZ(state, "state");
    }

    @Override // X.InterfaceC57910Mo6
    public final void LJLZ(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }
}
