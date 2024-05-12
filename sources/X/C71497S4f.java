package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S4f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71497S4f<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ FavoriteVideoPickerViewModel LJLIL;

    public C71497S4f(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
        this.LJLIL = favoriteVideoPickerViewModel;
    }

    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        FeedItemList feedItemList = (FeedItemList) obj;
        this.LJLIL.LJLJJLL.setValue(Boolean.FALSE);
        if (feedItemList != null) {
            FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.LJLIL;
            favoriteVideoPickerViewModel.LJLJJL++;
            if (feedItemList.hasMore == 0) {
                favoriteVideoPickerViewModel.LJLJJL = -1;
            }
            ArrayList arrayList = new ArrayList();
            List<Aweme> value = favoriteVideoPickerViewModel.LJLJL.getValue();
            o.LJI(value);
            arrayList.addAll(value);
            List<Aweme> items = feedItemList.getItems();
            if (items != null) {
                arrayList.addAll(items);
            }
            favoriteVideoPickerViewModel.LJLJL.setValue(arrayList);
            if (favoriteVideoPickerViewModel.LJLJJL == 1) {
                favoriteVideoPickerViewModel.LJLJLLL.setValue(null);
            }
        }
    }
}
