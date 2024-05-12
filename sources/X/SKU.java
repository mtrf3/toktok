package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SKU implements InterfaceC71908SKa {
    @Override // X.InterfaceC71908SKa
    public final SKV LIZ(Context context, ViewGroup parent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(parent, "parent");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ahf, parent, false);
        int LIZ = C226388uY.LIZ(R.raw.icon_camera_share_1, R.raw.icon_camera_plus);
        int LIZJ = C226388uY.LIZJ(R.string.bct, R.string.be5);
        ((TuxIconView) LLLLIILL.findViewById(R.id.wj)).setIconRes(LIZ);
        ((TextView) LLLLIILL.findViewById(R.id.wk)).setText(LIZJ);
        return new SKV(LLLLIILL);
    }
}
