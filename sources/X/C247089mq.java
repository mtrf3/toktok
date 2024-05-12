package X;

import Y.IDrS44S0100000_4;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247089mq extends RecyclerView {
    public int LLLF;
    public int LLLFF;
    public List<String> LLLFFI;
    public int LLLFZ;

    public final List<String> getDataSet() {
        return this.LLLFFI;
    }

    public final int getMCurrentPositon() {
        return this.LLLFZ;
    }

    public final int getMItemHeight() {
        return this.LLLF;
    }

    public final int getMWheelSize() {
        return this.LLLFF;
    }

    public static int LJLJJL(float f) {
        if (Math.abs(f) > 2.0f) {
            if (Math.abs(f) < 12.0f) {
                if (f > 0.0f) {
                    return 2;
                }
                return -2;
            }
            f /= 6;
        }
        return (int) f;
    }

    public final void setData(List<String> dataSet) {
        C9YR c9yr;
        o.LJIIIZ(dataSet, "dataSet");
        this.LLLFFI = dataSet;
        AbstractC029409q adapter = getAdapter();
        if ((adapter instanceof C9YR) && (c9yr = (C9YR) adapter) != null) {
            c9yr.LJLIL = dataSet;
            c9yr.notifyDataSetChanged();
        }
        AbstractC029409q adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.notifyDataSetChanged();
        }
    }

    public final void setDataSet(List<String> list) {
        o.LJIIIZ(list, "<set-?>");
        this.LLLFFI = list;
    }

    public final void setMCurrentPositon(int i) {
        this.LLLFZ = i;
    }

    public final void setMItemHeight(int i) {
        this.LLLF = i;
    }

    public final void setMWheelSize(int i) {
        this.LLLFF = i;
    }

    public final void setWheelSize(int i) {
        this.LLLFF = i;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d75, C16880lQ.LLZIL(getContext()), null);
        o.LJIIIIZZ(LLLZIIL, "from(context).inflate(R.…_cyclewheel_custom, null)");
        LLLZIIL.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LLLZIIL.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.LLLF = LLLZIIL.getMeasuredHeight();
        getLayoutParams().height = this.LLLF * this.LLLFF;
        AbstractC029409q adapter = getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C247089mq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        ArrayList arrayList = new ArrayList();
        this.LLLFFI = arrayList;
        setAdapter(new C9YR(arrayList));
        LJIIJJI(new IDrS44S0100000_4(this, 10));
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }
}
