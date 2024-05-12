package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class JZQ extends AbstractC51777KTt<Aweme> {
    public final int LJZ(String str) {
        List<T> list = this.mmItems;
        if (list != 0 && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            int size = this.mmItems.size();
            for (int i = 0; i < size; i++) {
                Aweme aweme = (Aweme) ListProtector.get(this.mmItems, i);
                if (aweme != null && C38354F3m.LIZJ(str, aweme.getAid())) {
                    if (this.LJLIL != null) {
                        return i + 1;
                    }
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean LJZI(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    public void LJZL(FollowStatus followStatus) {
        User author;
        List<T> list = this.mmItems;
        if (list == 0 || list.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId)) {
            return;
        }
        for (T t : this.mmItems) {
            if (t != null && (author = t.getAuthor()) != null && followStatus.userId.equals(author.getUid())) {
                author.setFollowStatus(followStatus.followStatus);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MK7, X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        if (LJZI(viewHolder)) {
            ((MFR) viewHolder).LJJII(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.MK7, X.AbstractC029409q
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (LJZI(viewHolder)) {
            MFR mfr = (MFR) viewHolder;
            mfr.LJJII(false);
            mfr.d();
        }
    }
}
