package X;

import android.graphics.Rect;
import android.util.LruCache;
import android.view.TouchDelegate;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS113S0300000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.Mme, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57820Mme {
    static {
        new LruCache(100);
    }

    public static final void LIZ(int i, View view) {
        View view2;
        o.LJIIIZ(view, "<this>");
        if (i <= 0) {
            return;
        }
        Object parent = view.getParent();
        if (!(parent instanceof View) || (view2 = (View) parent) == null) {
            return;
        }
        C57821Mmf c57821Mmf = new C57821Mmf(i);
        Rect rect = new Rect();
        view.getHitRect(rect);
        if (!rect.isEmpty()) {
            view2.setTouchDelegate((TouchDelegate) c57821Mmf.invoke(rect, view));
        } else {
            C27484AqW.LIZIZ(view, new AqS113S0300000_9(view2, c57821Mmf, view, 9));
        }
    }

    public static final <T extends User> void LIZIZ(T t, TuxTextView tuxTextView) {
        o.LJIIIZ(t, "<this>");
        tuxTextView.setText(t.getNickname());
        AJ9.LJ(tuxTextView.getContext(), t.getCustomVerify(), t.getEnterpriseVerifyReason(), tuxTextView);
    }
}
