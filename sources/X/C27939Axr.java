package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Axr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27939Axr extends PopupWindow {
    public final String LIZ;

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        ((C29701Eo) getContentView().findViewById(R.id.g_w)).pauseAnimation();
    }

    public C27939Axr(Context context, String str) {
        super(context);
        this.LIZ = str;
        setContentView(C16880lQ.LLLZIIL(R.layout.zw, C16880lQ.LLZIL(context), null));
        setWidth(-1);
        setHeight(-1);
        setBackgroundDrawable(new BitmapDrawable());
        View findViewById = getContentView().findViewById(R.id.ghr);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZ = C79045V0n.LJI(R.attr.gy, context);
        c110614Vt.LIZJ = Float.valueOf(C45804HyK.LJJI(12));
        findViewById.setBackground(c110614Vt.LIZ(context));
    }

    @Override // android.widget.PopupWindow
    public final void showAtLocation(View view, int i, int i2, int i3) {
        super.showAtLocation(view, i, i2, i3);
        ((C29701Eo) getContentView().findViewById(R.id.g_w)).setAnimationFromUrl(this.LIZ);
        ((C29701Eo) getContentView().findViewById(R.id.g_w)).playAnimation();
    }
}
