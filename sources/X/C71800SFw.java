package X;

import Y.IDLListenerS198S0100000_12;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.SFw, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71800SFw extends PopupWindow {
    public final Context LIZ;
    public final C62822Ol8 LIZIZ;
    public List<? extends View> LIZJ;

    public C71800SFw(Context context) {
        super(context);
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(C46508INc.LJLIL);
        setContentView(C16880lQ.LLLZIIL(R.layout.zx, C16880lQ.LLZIL(context), null));
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new BitmapDrawable());
        getContentView().getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS198S0100000_12(this, 5));
    }

    public final Rect LIZ(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int right = view.getRight() - view.getLeft();
        int bottom = view.getBottom() - view.getTop();
        int LJJJJLI = C63081OpJ.LJJJJLI(this.LIZ);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2 - LJJJJLI, right + i, (i2 + bottom) - LJJJJLI);
    }

    public final Region LIZIZ(List<? extends View> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        Region region = new Region();
        View contentView = getContentView();
        if (contentView != null) {
            region.op(LIZ(contentView), Region.Op.UNION);
        }
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            region.op(LIZ(it.next()), Region.Op.DIFFERENCE);
        }
        return region;
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        ((C8IC) getContentView().findViewById(R.id.g94)).setVisibility(0);
    }
}
