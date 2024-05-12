package X;

import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: X.8OJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8OJ {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd h:mm a", Locale.getDefault());

    public static void LIZ(ViewGroup viewGroup, boolean z) {
        C218518hr c218518hr;
        C218518hr c218518hr2;
        View findViewById = viewGroup.findViewById(R.id.c_v);
        if ((findViewById instanceof C218518hr) && (c218518hr2 = (C218518hr) findViewById) != null) {
            c218518hr2.setGroupClickable(z);
        }
        View findViewById2 = viewGroup.findViewById(R.id.bkv);
        if ((findViewById2 instanceof C218518hr) && (c218518hr = (C218518hr) findViewById2) != null) {
            c218518hr.setGroupClickable(z);
        }
    }

    public static void LIZIZ(ViewGroup viewGroup, ViewGroup viewGroup2, InterfaceC55235Lm3 interfaceC55235Lm3) {
        InteractCommonLogicAbility interactCommonLogicAbility;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View findViewById = viewGroup2.findViewById(R.id.mio);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        LIZ(viewGroup2, true);
        if (interfaceC55235Lm3 != null && (interactCommonLogicAbility = (InteractCommonLogicAbility) C55096Ljo.LIZ(interfaceC55235Lm3, InteractCommonLogicAbility.class, null)) != null) {
            interactCommonLogicAbility.yi(true);
        }
    }
}
