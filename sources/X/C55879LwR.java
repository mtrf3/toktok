package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.LwR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55879LwR {
    public static Bundle LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static WeakReference<ViewOnClickListenerC226978vV> LIZLLL;
    public static boolean LJ;
    public static int LJFF;
    public static int LJI;

    public static String LIZIZ(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "comments" : "mentions" : "likes" : "followers";
    }

    static {
        try {
            C2YJ c2yj = C2YJ.LIZIZ;
            Integer closeCountLimit = c2yj.LIZ.getPushGuideInfo().getCloseCountLimit();
            o.LJI(closeCountLimit);
            LIZIZ = closeCountLimit.intValue();
            Integer showupInterval = c2yj.LIZ.getPushGuideInfo().getShowupInterval();
            o.LJI(showupInterval);
            LIZJ = showupInterval.intValue();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            LIZIZ = 3;
            LIZJ = 15;
        }
    }

    public static View LIZ(Context context, Bundle bundle) {
        View LLLZIIL;
        if (C90193gN.LIZIZ(context)) {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.u5, C16880lQ.LLZIL(context), null);
        } else {
            LLLZIIL = C16880lQ.LLLZIIL(R.layout.u4, C16880lQ.LLZIL(context), null);
        }
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.mfo);
        TextView textView2 = (TextView) LLLZIIL.findViewById(R.id.mfn);
        C62846OlW c62846OlW = (C62846OlW) LLLZIIL.findViewById(R.id.f8v);
        textView.setText(bundle.getString("username"));
        textView2.setText(bundle.getString("content"));
        try {
            Serializable serializable = bundle.getSerializable("avatar_thumb");
            o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.model.UrlModel");
            C78765Uvh.LJFF(c62846OlW, (UrlModel) serializable);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return LLLZIIL;
    }

    public static void LIZJ(int i, Bundle bundle) {
        if (bundle == null) {
            LIZ = null;
        }
        if (LJ && i <= LJFF + LJI) {
            try {
                if (new AnonymousClass078(EF7.LIZIZ()).LIZIZ()) {
                    return;
                }
            } catch (Exception unused) {
            }
            LIZ = bundle;
        }
    }
}
