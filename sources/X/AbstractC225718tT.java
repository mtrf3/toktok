package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.8tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC225718tT implements MGV {
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        return 0;
    }

    @Override // X.MGV
    public abstract /* synthetic */ MGX getJumpToVideoParam(MGX mgx, Aweme aweme);

    @Override // X.MGV
    public abstract /* synthetic */ C51031K1b getPresenter(int i, ActivityC45651qj activityC45651qj);

    public abstract AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, MH9 mh9);

    @Override // X.MGV
    public C220538l7 onCreateDetailAwemeViewHolder(View view, String str, MH9 mh9) {
        return null;
    }

    @Override // X.MGV
    public /* bridge */ /* synthetic */ void onJumpToDetail(String str) {
        C220408ku.LIZ(this, str);
    }

    @Override // X.MGV
    public abstract /* synthetic */ boolean sendCustomRequest(C51031K1b c51031K1b, int i);
}
