package X;

import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: X.LjX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55079LjX {
    public final SparseArray<LinkedList<View>> LIZ = new SparseArray<>();
    public final HashMap<Aweme, C55080LjY> LIZIZ = new HashMap<>();

    public final void LIZIZ() {
        View view;
        C2MA c2ma;
        for (C55080LjY c55080LjY : this.LIZIZ.values()) {
            if (c55080LjY != null && (view = c55080LjY.LIZ) != null && (c2ma = (C2MA) view.getTag(R.id.d87)) != null) {
                c2ma.unBind();
            }
        }
        this.LIZIZ.clear();
    }

    public final void LIZ(int i, View view) {
        if (i == 0) {
            LinkedList<View> linkedList = this.LIZ.get(i);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                this.LIZ.put(i, linkedList);
            }
            if (linkedList.size() >= 1) {
                return;
            }
            linkedList.push(view);
        }
    }
}
