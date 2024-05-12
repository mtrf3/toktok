package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;

/* loaded from: classes10.dex */
public interface MGV extends Serializable {
    MGX getJumpToVideoParam(MGX mgx, Aweme aweme);

    C51031K1b getPresenter(int i, ActivityC45651qj activityC45651qj);

    C220538l7 onCreateDetailAwemeViewHolder(View view, String str, MH9 mh9);

    void onJumpToDetail(String str);

    boolean sendCustomRequest(C51031K1b c51031K1b, int i);
}
