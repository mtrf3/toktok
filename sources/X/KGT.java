package X;

import com.ss.android.ugc.aweme.discover.model.SearchUser;
import java.util.List;

/* loaded from: classes9.dex */
public interface KGT {
    void clearData();

    void resetLoadMoreState();

    void setData(List<SearchUser> list);

    void setDataAfterLoadMore(List<SearchUser> list);

    void setLoadEmptyText(CharSequence charSequence);

    void setLoadEmptyTextColor(Integer num);

    void setLoadMoreListener(InterfaceC191547fS interfaceC191547fS);

    void setShowFooter(boolean z);

    void showLoadMoreEmpty();

    void showLoadMoreError();

    void showLoadMoreLoading();
}
