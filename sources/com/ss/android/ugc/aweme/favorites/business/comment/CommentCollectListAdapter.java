package com.ss.android.ugc.aweme.favorites.business.comment;

import X.C06490Nh;
import X.C8HS;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.base.BaseCollectListFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class CommentCollectListAdapter extends C8HS<Comment> {
    public static final int $stable = 8;
    public final boolean isFromMyProfile;
    public final Activity mActivity;
    public final Fragment mFragment;

    public final void removeItem(Comment item) {
        o.LJIIIZ(item, "item");
        List<Comment> data = getData();
        if (data != null) {
            data.remove(item);
        }
        notifyDataSetChanged();
        List<Comment> data2 = getData();
        if (data2 != null && data2.isEmpty()) {
            Fragment fragment = this.mFragment;
            o.LJII(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.favorites.business.comment.CommentCollectListFragment");
            ((BaseCollectListFragment) fragment).Ne();
        }
    }

    @Override // X.C4II
    public void onBindBasicViewHolder(RecyclerView.ViewHolder holder, int i) {
        Comment comment;
        o.LJIIIZ(holder, "holder");
        List<Comment> data = getData();
        if (data != null) {
            comment = (Comment) ListProtector.get(data, i);
        } else {
            comment = null;
        }
        ((CommentCollectViewHolder) holder).bindView(comment, this.mActivity, this.mFragment, this);
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        View view = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.av3, viewGroup, false);
        o.LJIIIIZZ(view, "view");
        return new CommentCollectViewHolder(view, this.isFromMyProfile);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentCollectListAdapter(Activity mActivity, Fragment mFragment, boolean z) {
        super(false, 1, null);
        o.LJIIIZ(mActivity, "mActivity");
        o.LJIIIZ(mFragment, "mFragment");
        this.mActivity = mActivity;
        this.mFragment = mFragment;
        this.isFromMyProfile = z;
    }
}
