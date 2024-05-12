package X;

import Y.ARunnableS15S0300000_4;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.base.ui.TagLayout;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.9wR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C253039wR {
    public static final /* synthetic */ int LIZ = 0;

    public static C110574Vp LIZ(TagLayout tagLayout) {
        return OJ4.LJJJJLL(ORZ.LJLIIIL(C78842Uww.LJJ(0, tagLayout.getChildCount())), new AqS170S0100000_4(tagLayout, 154));
    }

    public static final void LIZIZ(TagLayout tagLayout) {
        int i;
        Long l;
        if (tagLayout == null) {
            return;
        }
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJIZL(LIZ(tagLayout)));
        while (true) {
            i = 0;
            if (!c115524g8.hasNext()) {
                break;
            }
            View view = (View) c115524g8.next();
            Object tag = view.getTag(R.id.u_);
            if ((tag instanceof Long) && (l = (Long) tag) != null && l.longValue() > 0) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        C110564Vo c110564Vo = new C110564Vo(LIZ(tagLayout));
        while (true) {
            if (c110564Vo.hasNext()) {
                if (((View) c110564Vo.next()).getVisibility() == 0) {
                    break;
                }
            } else {
                i = 8;
                break;
            }
        }
        tagLayout.setVisibility(i);
    }

    public static final void LIZJ(View view, AwemeTextLabelModel awemeTextLabelModel) {
        if (view == null) {
            return;
        }
        view.setTag(R.id.u_, Long.valueOf(O6R.LJJIJ(awemeTextLabelModel.getShowSeconds() * 1000)));
    }

    public static final void LJ(ViewGroup viewGroup, TagLayout tagLayout) {
        Long l;
        if (tagLayout == null) {
            return;
        }
        C115524g8 c115524g8 = new C115524g8(OJ4.LJJJJIZL(LIZ(tagLayout)));
        while (c115524g8.hasNext()) {
            View view = (View) c115524g8.next();
            Object tag = view.getTag(R.id.u_);
            if ((tag instanceof Long) && (l = (Long) tag) != null) {
                long longValue = l.longValue();
                if (longValue > 0) {
                    view.postDelayed(new ARunnableS15S0300000_4(viewGroup, tagLayout, view, 0), longValue);
                }
            }
            LIZLLL(viewGroup, tagLayout, view);
        }
    }

    public static void LIZLLL(ViewGroup viewGroup, View tagLayout, View child) {
        Long l;
        long j;
        o.LJIIIZ(tagLayout, "tagLayout");
        o.LJIIIZ(child, "child");
        if (child.getVisibility() == 0) {
            return;
        }
        Object tag = child.getTag(R.id.u_);
        if (tag instanceof Long) {
            l = (Long) tag;
        } else {
            l = null;
        }
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        child.setVisibility(0);
        if (j > 0 && tagLayout.getVisibility() == 0) {
            child.setAlpha(0.0f);
            child.animate().alpha(1.0f).setDuration(200L).start();
            return;
        }
        child.setAlpha(1.0f);
        C1CR c1cr = new C1CR();
        if (viewGroup != null) {
            try {
                C03510Bv.LIZ(viewGroup, c1cr);
            } catch (NullPointerException unused) {
            }
        }
        tagLayout.setVisibility(0);
    }
}
