package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUA extends PagerAdapter {
    public final List<LiveSubMediaModel> LJLILLLLZI = new ArrayList();

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object item) {
        o.LJIIIZ(item, "item");
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLILLLLZI).size();
    }

    public final void setData(List<LiveSubMediaModel> dataList) {
        o.LJIIIZ(dataList, "dataList");
        ((ArrayList) this.LJLILLLLZI).clear();
        ((ArrayList) this.LJLILLLLZI).addAll(dataList);
        notifyDataSetChanged();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.W5O, REQUEST] */
    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object LJIILLIIL(int i, ViewGroup container) {
        InterfaceC81252Vui interfaceC81252Vui;
        o.LJIIIZ(container, "container");
        LiveSubMediaModel liveSubMediaModel = (LiveSubMediaModel) ListProtector.get(this.LJLILLLLZI, i);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(container.getContext()), R.layout.dg1, container, false);
        container.addView(LLLLIILL);
        VA9 va9 = (VA9) LLLLIILL.findViewById(R.id.eh0);
        ?? LIZ = W5P.LIZLLL(C28829BTd.LIZ(liveSubMediaModel.getFileLocalUriPath())).LIZ();
        C81705W4v LIZJ = W5I.LIZJ();
        if (va9 != null) {
            interfaceC81252Vui = va9.getController();
        } else {
            interfaceC81252Vui = null;
        }
        LIZJ.LJIIL = interfaceC81252Vui;
        LIZJ.LIZLLL = LIZ;
        W4R LIZ2 = LIZJ.LIZ();
        if (va9 != null) {
            va9.setController(LIZ2);
        }
        return LLLLIILL;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean LJIIZILJ(View view, Object item) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(item, "item");
        if (item instanceof View) {
            return o.LJ(item, view);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        if (item instanceof View) {
            C16880lQ.LJLLL((View) item, container);
        }
    }
}
