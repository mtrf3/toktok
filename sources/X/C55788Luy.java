package X;

import Y.ACListenerS44S0200000_9;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Luy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55788Luy extends JZQ {
    public final MH9 LJLJI;
    public String LJLJJI;

    public C55788Luy(MH9 listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJI = listener;
        this.LJLJJI = "";
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Aweme aweme;
        UrlModel avatarLarger;
        long j;
        List<T> list = this.mmItems;
        String str = null;
        if (list == 0 || i < 0 || i >= list.size() || (aweme = (Aweme) ListProtector.get(list, i)) == null) {
            return;
        }
        o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.profile.AdFakeUserAwemeViewHolder");
        C55789Luz c55789Luz = (C55789Luz) viewHolder;
        String curAwemeId = this.LJLJJI;
        o.LJIIIZ(curAwemeId, "curAwemeId");
        c55789Luz.LJLJLJ = aweme;
        User author = aweme.getAuthor();
        if (author != null) {
            if (author.getAvatarMedium() != null) {
                avatarLarger = author.getAvatarMedium();
            } else if (author.getAvatarThumb() != null) {
                avatarLarger = author.getAvatarThumb();
            } else if (author.getAvatarLarger() != null) {
                avatarLarger = author.getAvatarLarger();
            }
            if (avatarLarger != null) {
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(avatarLarger.getUrlList()));
                LJIIIZ.LJJIIJ = c55789Luz.LJLJJI;
                C16880lQ.LLJJJ(LJIIIZ);
            }
        }
        c55789Luz.LJLJI.setText(aweme.getDesc());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('@');
        User author2 = aweme.getAuthor();
        if (author2 != null) {
            str = author2.getNickname();
        }
        LIZ.append(str);
        c55789Luz.LJLJJL.setText(X1D.LIZIZ(LIZ));
        TuxTextView tuxTextView = c55789Luz.LJLJJLL;
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            j = statistics.getDiggCount();
        } else {
            j = 0;
        }
        tuxTextView.setText(C77123UOp.LJJIIJ(j));
        if (o.LJ(aweme.getAid(), curAwemeId)) {
            c55789Luz.LJLJL.setVisibility(0);
            C16880lQ.LJJIJLIJ(c55789Luz.LJLILLLLZI, new ACListenerS44S0200000_9(aweme, c55789Luz, 6));
        } else {
            c55789Luz.LJLJL.setVisibility(8);
            C16880lQ.LJJIJLIJ(c55789Luz.LJLILLLLZI, new ACListenerS44S0200000_9(aweme, c55789Luz, 7));
        }
        c55789Luz.LLZLLLL();
    }

    @Override // X.AbstractC51777KTt, X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        if (viewGroup == null) {
            return null;
        }
        return new C55789Luz(C1FL.LIZIZ(viewGroup, R.layout.c5b, viewGroup, false, "from(parent.context)\n   …ser_aweme, parent, false)"), this.LJLJI);
    }
}
