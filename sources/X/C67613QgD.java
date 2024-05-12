package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import com.bytedance.tux.input.TuxTextView;
import defpackage.e1;
import java.util.HashMap;

/* renamed from: X.QgD, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67613QgD {
    public static Context LIZ;
    public static final HashMap<AttributeSet, TuxTextView> LIZIZ = new HashMap<>();
    public static final int LIZJ = 64;
    public static final C73318Sq2 LIZLLL = new C73318Sq2();

    public static void LIZ(LayoutInflater layoutInflater) {
        if (e1.LIZ(31744, "tiktok_tux_text_view_opt", true, false) && layoutInflater != null && layoutInflater.getFactory() == null && layoutInflater.getFactory2() == null) {
            try {
                layoutInflater.setFactory(new LayoutInflaterFactoryC67612QgC());
            } catch (Exception unused) {
            }
        }
    }
}
