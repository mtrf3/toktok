package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57414Mg6 {
    public static final /* synthetic */ int LIZ = 0;

    public static TuxSheet LIZ(Context context) {
        o.LJIIIZ(context, "context");
        View inflate = View.inflate(context, R.layout.qq, null);
        C60193Njp c60193Njp = (C60193Njp) inflate.findViewById(R.id.b0v);
        C223338pd c223338pd = (C223338pd) inflate.findViewById(R.id.g7r);
        c60193Njp.LIZLLL(C57415Mg7.LIZ().LJIILIIL());
        c223338pd.LIZIZ();
        c60193Njp.t(C38956FQq.LIZIZ("aweme://lynxview/?channel=fe_tns_content_safety_lynx&bundle=comment-panel/template.js&dynamic=1"), new Bundle(), new C57416Mg8(c223338pd));
        ASL asl = new ASL();
        asl.LIZ.LJLLI = inflate;
        asl.LJI(2);
        return asl.LIZ;
    }
}
