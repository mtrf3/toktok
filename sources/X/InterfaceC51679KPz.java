package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.KPz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC51679KPz {
    void bindView(KQA kqa);

    boolean cannotLoadLatest();

    boolean cannotLoadMore();

    boolean deleteItem(String str);

    int getPageType(int i);

    Object getViewModel();

    boolean init(Fragment fragment);

    boolean isDataEmpty();

    boolean isLoading();

    void request(int i, M89 m89, int i2, boolean z);

    void unInit();
}
