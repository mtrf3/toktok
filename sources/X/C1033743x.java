package X;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.43x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1033743x {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(UrlModel urlModel, UrlModel urlModel2, C119624mk c119624mk) {
        if (c119624mk == null || c119624mk.getContext() == null) {
            return;
        }
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.drawable.b0p;
        Context context = c119624mk.getContext();
        o.LJIIIIZZ(context, "avatarView.context");
        SY9 LIZ2 = c2068389v.LIZ(context);
        C2068389v c2068389v2 = new C2068389v();
        c2068389v2.LIZ = R.raw.icon_color_default_avatar;
        Context context2 = c119624mk.getContext();
        o.LJIIIIZZ(context2, "avatarView.context");
        C4AS.LJI(c119624mk, urlModel, "ProfileItemView: avatar", c2068389v2.LIZ(context2), LIZ2, null, null, urlModel2, 480);
    }

    public static void LIZIZ(String str, List list, TuxTextView tuxTextView, ViewGroup viewGroup) {
        Integer LJI;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() > 0) {
                TuxTextView tuxTextView2 = new TuxTextView(C39849FkT.LIZ(), null, 6, 0);
                tuxTextView2.setTuxFont(51);
                tuxTextView2.setGravity(17);
                Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                if (LJIIIIZZ != null && (LJI = C79045V0n.LJI(R.attr.gu, LJIIIIZZ)) != null) {
                    tuxTextView2.setTextColor(LJI.intValue());
                }
                tuxTextView2.setText(str2);
                if (viewGroup != null) {
                    viewGroup.addView(tuxTextView2);
                }
            }
        }
    }
}
