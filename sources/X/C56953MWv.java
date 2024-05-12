package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notification.followrequest.vh.NewFollowRequestViewHolder;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MWv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56953MWv extends C8HS<User> implements MX5 {
    public final MX4 LJLIL;
    public final MW5 LJLILLLLZI;

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return 15;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56953MWv(MX4 mActivity) {
        super(false, 1, null);
        o.LJIIIZ(mActivity, "mActivity");
        this.LJLIL = mActivity;
        new HashSet();
        this.LJLILLLLZI = new MW5();
    }

    @Override // X.MX5
    public final void onRemove(int i) {
        List<User> data = getData();
        if (data == null || i < 0 || i >= data.size()) {
            return;
        }
        ListProtector.remove(data, i);
        if (data.isEmpty()) {
            notifyDataSetChanged();
            this.LJLIL.f4();
        } else {
            notifyItemRemoved(i);
        }
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        C57052MaG c57052MaG = C57052MaG.LJLIL;
        C57051MaF c57051MaF = C57053MaH.LIZ;
        if (c57051MaF != null) {
            c57052MaG.invoke(c57051MaF);
        }
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        User user;
        o.LJIIIZ(holder, "holder");
        List<User> data = getData();
        if (data != null && (user = (User) ListProtector.get(data, i)) != null) {
            NewFollowRequestViewHolder.onBind$default((NewFollowRequestViewHolder) holder, user, i, null, 4, null);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.sl, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        NewFollowRequestViewHolder newFollowRequestViewHolder = new NewFollowRequestViewHolder(view, this, this.LJLILLLLZI);
        newFollowRequestViewHolder.setLogScene(EnumC56954MWw.FOLLOW_REQUEST);
        return newFollowRequestViewHolder;
    }
}
