package X;

import Y.ARunnableS39S0100000_3;
import Y.IDrS43S0100000_3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.8Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208298Fl extends RecyclerView {
    public final C40141hq LLLF;

    public final View getSnappedView() {
        return this.LLLF.LJFF(getLayoutManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(AbstractC029409q<?> abstractC029409q) {
        super.setAdapter(abstractC029409q);
        if (abstractC029409q != null) {
            post(new ARunnableS39S0100000_3(this, 8));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C208298Fl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        this.LLLF = new C40141hq();
        setLayoutManager(new LinearLayoutManager(0, false));
        LJIIJJI(new IDrS43S0100000_3(this, 8));
        C26338AVi.LJIIIZ(this, C1FJ.LIZIZ(160), 0, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(160))), 0, 16);
    }
}
