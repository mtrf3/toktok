package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Vxi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81438Vxi {
    public final ViewOnTouchListenerC81419VxP LIZ;
    public final C119344mI LIZIZ;
    public final C45989I3d LIZJ;
    public InterfaceC82683Wch LIZLLL;
    public C81366VwY LJ;
    public final java.util.Set<String> LJFF;
    public final C81435Vxf LJI;
    public final java.util.Map<Integer, View> LJII;

    public final int LIZIZ(String tag) {
        o.LJIIIZ(tag, "tag");
        if (this.LIZIZ.getChildCount() <= 0) {
            return -1;
        }
        int childCount = this.LIZIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (o.LJ(tag, this.LIZIZ.getChildAt(i).getTag())) {
                return i;
            }
        }
        return 0;
    }

    public C81438Vxi(ShortVideoContext shortVideoContext, ViewOnTouchListenerC81419VxP viewOnTouchListenerC81419VxP) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = viewOnTouchListenerC81419VxP;
        this.LIZIZ = (C119344mI) viewOnTouchListenerC81419VxP.findViewById(R.id.bs8);
        this.LIZJ = new C45989I3d();
        this.LJFF = new LinkedHashSet();
        this.LJI = new C81435Vxf();
        this.LJII = new LinkedHashMap();
    }

    public final void LIZ(int i, String text, String tag, boolean z) {
        o.LJIIIZ(text, "text");
        o.LJIIIZ(tag, "tag");
        C81366VwY c81366VwY = new C81366VwY(this.LIZIZ.getContext(), 0);
        c81366VwY.setText(text);
        if (C46029I4r.LIZ()) {
            TextView textView = c81366VwY.getTextView();
            o.LJII(textView, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
            ((TuxTextView) textView).LJJJ(16.0f);
        }
        c81366VwY.setEnabled(z);
        c81366VwY.setTag(tag);
        if (C52286Kfa.LIZ()) {
            c81366VwY.LJJLJLI();
        }
        this.LJFF.add(tag);
        this.LIZIZ.addView(c81366VwY, i);
        if (o.LJ(c81366VwY.getTag(), C78688UuS.LJJJI(R.string.pwa))) {
            this.LJ = c81366VwY;
            c81366VwY.post(new ARunnableS49S0100000_13(this, 95));
        }
    }
}
