package X;

import android.content.Context;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0vd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23210vd extends ViewGroup {
    public final int LJLIL;
    public final List<C23250vh> LJLILLLLZI;
    public final List<C23250vh> LJLJI;
    public final C23220ve LJLJJI;
    public int LJLJJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public C23210vd(Context context) {
        super(context);
        this.LJLIL = 5;
        ArrayList arrayList = new ArrayList();
        this.LJLILLLLZI = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.LJLJI = arrayList2;
        this.LJLJJI = new C23220ve();
        setClipChildren(false);
        C23250vh c23250vh = new C23250vh(context);
        addView(c23250vh);
        arrayList.add(c23250vh);
        arrayList2.add(c23250vh);
        this.LJLJJL = 1;
        setTag(R.id.e5a, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
