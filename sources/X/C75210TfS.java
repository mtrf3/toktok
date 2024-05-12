package X;

import android.view.View;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TfS, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75210TfS {
    public static void LIZ(C78856UxA c78856UxA) {
        View findViewById;
        C47121t6 c47121t6;
        o.LJIIIZ(c78856UxA, "<this>");
        View view = c78856UxA.LJFF;
        if (view != null && (c47121t6 = (C47121t6) view.findViewById(R.id.kyz)) != null) {
            c47121t6.setAlpha(1.0f);
            c47121t6.setTextSize(1, 17.0f);
            C23010vJ.LJ(600, c47121t6);
        }
        View view2 = c78856UxA.LJFF;
        if (view2 != null && (findViewById = view2.findViewById(R.id.kym)) != null) {
            C29306Beo.LJJLJLI(findViewById);
        }
    }

    public static void LIZIZ(C78856UxA c78856UxA) {
        View findViewById;
        C47121t6 c47121t6;
        o.LJIIIZ(c78856UxA, "<this>");
        View view = c78856UxA.LJFF;
        if (view != null && (c47121t6 = (C47121t6) view.findViewById(R.id.kyz)) != null) {
            c47121t6.setAlpha(0.5f);
            c47121t6.setTextSize(1, 15.0f);
            C23010vJ.LJ(LiveChatShowDelayForHotLiveSetting.DEFAULT, c47121t6);
        }
        View view2 = c78856UxA.LJFF;
        if (view2 != null && (findViewById = view2.findViewById(R.id.kym)) != null) {
            C29306Beo.LJI(findViewById);
        }
    }
}
