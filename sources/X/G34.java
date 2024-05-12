package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class G34 {
    public static G35 LIZ(ViewGroup parent, String str, String str2) {
        View LIZ;
        o.LJIIIZ(parent, "parent");
        if (C38874FNm.LIZ() && (parent.getContext() instanceof Activity)) {
            Context context = parent.getContext();
            o.LJII(context, "null cannot be cast to non-null type android.app.Activity");
            LIZ = C16970lZ.LIZJ(R.layout.bev, (Activity) context, parent, false);
        } else {
            LIZ = C28289B8j.LIZ(parent, R.layout.bev, parent, false);
        }
        ((TuxTextView) LIZ.findViewById(R.id.e4n)).LJJJ(38.0f);
        return new G35(LIZ, str, str2);
    }
}
