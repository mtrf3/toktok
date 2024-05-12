package X;

import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8GX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8GX {
    public static C8GW LIZ(ViewGroup parent, String awemeLabel, C8GY clickListener, boolean z) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(awemeLabel, "awemeLabel");
        o.LJIIIZ(clickListener, "clickListener");
        return new C8GW(C1FL.LIZIZ(parent, R.layout.bf4, parent, false, "from(parent.context).inf…weme_view, parent, false)"), awemeLabel, clickListener, z);
    }
}
