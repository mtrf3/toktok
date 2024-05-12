package X;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.wallet.model.LocationObject;
import com.bytedance.android.live.walletnew.ui.LocationList;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.UfT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77759UfT implements InterfaceC77764UfY {
    public final /* synthetic */ LocationList LIZ;

    public C77759UfT(LocationList locationList) {
        this.LIZ = locationList;
    }

    @Override // X.InterfaceC77764UfY
    public final void LIZIZ(String str) {
        String str2;
        RecyclerView recyclerView;
        C0A2 layoutManager;
        LocationObject locationObject;
        List<LocationObject> list = this.LIZ.LJLJLJ;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List<LocationObject> list2 = this.LIZ.LJLJLJ;
                if (list2 != null && (locationObject = (LocationObject) ListProtector.get(list2, i)) != null) {
                    str2 = locationObject.M();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str2, str) && (recyclerView = this.LIZ.LJLJJLL) != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
                    layoutManager.LJZL(i);
                }
            }
        }
    }
}
