package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* renamed from: X.Vpl, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80945Vpl extends FrameLayout {
    public static final /* synthetic */ int LJLJI = 0;
    public final ViewGroup LJLIL;
    public boolean LJLILLLLZI;

    public C80945Vpl(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.LJLIL = viewGroup;
        viewGroup.setTag(R.id.ds0, this);
        ((ViewGroupOverlay) new C0XW(viewGroup).LIZ).add(this);
        this.LJLILLLLZI = true;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        if (this.LJLILLLLZI) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.LJLIL.setTag(R.id.ds0, null);
            ((ViewGroupOverlay) new C0XW(this.LJLIL).LIZ).remove(this);
            this.LJLILLLLZI = false;
        }
    }

    public static void LIZ(ArrayList arrayList, View view) {
        Object parent = view.getParent();
        if (parent instanceof ViewGroup) {
            LIZ(arrayList, (View) parent);
        }
        arrayList.add(view);
    }
}
