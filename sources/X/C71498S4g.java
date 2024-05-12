package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.ui.FavoriteVideoPickerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.S4g, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71498S4g<T1, T2> implements InterfaceC73459SsJ {
    public final /* synthetic */ FavoriteVideoPickerViewModel LJLIL;

    public C71498S4g(FavoriteVideoPickerViewModel favoriteVideoPickerViewModel) {
        this.LJLIL = favoriteVideoPickerViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC73459SsJ
    public final void accept(Object obj, Object obj2) {
        String str;
        FeedItemList feedItemList = (FeedItemList) obj;
        if (feedItemList != null) {
            FavoriteVideoPickerViewModel favoriteVideoPickerViewModel = this.LJLIL;
            ArrayList arrayList = new ArrayList();
            List<Aweme> items = feedItemList.getItems();
            if (items != null) {
                arrayList.addAll(items);
            }
            favoriteVideoPickerViewModel.LJLJL.setValue(arrayList);
            Iterator it = arrayList.iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                String aid = ((Aweme) next).getAid();
                Aweme value = favoriteVideoPickerViewModel.LJLJLLL.getValue();
                if (value != null) {
                    str = value.getAid();
                }
                if (o.LJ(aid, str)) {
                    str = next;
                    break;
                }
            }
            favoriteVideoPickerViewModel.LJLJLLL.setValue(str);
        }
    }
}
