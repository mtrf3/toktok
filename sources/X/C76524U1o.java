package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.U1o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76524U1o extends AbstractC29229BdZ {
    public final ArrayList<ImageModel> LJLJJLL;
    public final List<Integer> LJLJL;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return Integer.MAX_VALUE;
    }

    public C76524U1o(Context context, LayoutInflater layoutInflater) {
        super(context, layoutInflater, 0);
        this.LJLJJLL = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        Integer valueOf = Integer.valueOf(R.drawable.d_s);
        arrayList.add(valueOf);
        arrayList.add(Integer.valueOf(R.drawable.d_q));
        arrayList.add(Integer.valueOf(R.drawable.d_p));
        arrayList.add(Integer.valueOf(R.drawable.d_r));
        arrayList.add(valueOf);
        this.LJLJL = arrayList;
    }

    @Override // X.AbstractC29229BdZ
    public final View LJJIII(int i, View view, ViewGroup viewGroup) {
        C76612U4y c76612U4y;
        if (!(view instanceof C76612U4y) || (c76612U4y = (C76612U4y) view) == null) {
            Context mContext = this.LJLJJL;
            o.LJIIIIZZ(mContext, "mContext");
            c76612U4y = new C76612U4y(mContext);
        }
        c76612U4y.setTag(Integer.valueOf(i));
        if (this.LJLJJLL.size() >= 10) {
            Object obj = ListProtector.get(this.LJLJJLL, Math.abs(i) % this.LJLJJLL.size());
            o.LJIIIIZZ(obj, "items[abs(position) % items.size]");
            c76612U4y.LIZIZ((ImageModel) obj);
        } else {
            c76612U4y.LIZ(((Number) ListProtector.get(this.LJLJL, Math.abs(i) % ((ArrayList) this.LJLJL).size())).intValue());
        }
        return c76612U4y;
    }
}
