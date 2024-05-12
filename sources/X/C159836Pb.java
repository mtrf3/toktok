package X;

import Y.ARunnableS6S0400000_2;
import android.graphics.RectF;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Pb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159836Pb {
    public final /* synthetic */ C6PV LIZ;

    public final C6CZ LIZIZ() {
        return (C6CZ) this.LIZ.LJIILL.getValue();
    }

    public final C160316Qx LIZJ() {
        return this.LIZ.LJIIL().LIZIZ();
    }

    public final C6QL LIZLLL() {
        return (C6QL) this.LIZ.LJIIL().LJJ.getValue();
    }

    public final boolean LJ() {
        this.LIZ.LJIIL().LIZLLL().LJJII();
        this.LIZ.LJIIL().LIZJ().LJJIFFI();
        C6QA LIZ = this.LIZ.LJIIL().LIZ();
        if (LIZ.LJI().LJ.LJLILLLLZI) {
            LIZ.LJI().LJ(new AqS7S0010000_2(52));
            return true;
        }
        return false;
    }

    public C159836Pb(C6PV c6pv) {
        this.LIZ = c6pv;
    }

    public final void LIZ(int i, int i2) {
        C6QO c6qo;
        C6QO c6qo2;
        C160046Pw c160046Pw = (C160046Pw) this.LIZ.LJIIL().LJJI.getValue();
        Iterator<C6QO> it = c160046Pw.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                c6qo = it.next();
                if (c6qo.LJJLIIIJLJLI() == i) {
                    break;
                }
            } else {
                c6qo = null;
                break;
            }
        }
        c160046Pw.LIZLLL = c6qo;
        Iterator<C6QO> it2 = c160046Pw.LIZJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                c6qo2 = it2.next();
                if (c6qo2.LJJLIIIJLJLI() == i2) {
                    break;
                }
            } else {
                c6qo2 = null;
                break;
            }
        }
        c160046Pw.LJ = c6qo2;
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C159856Pd(c160046Pw, null), 3);
    }

    public final void LJFF(boolean z, String guideText, int i, EnumC159956Pn pos, Integer num, Integer num2, Integer num3) {
        o.LJIIIZ(guideText, "guideText");
        o.LJIIIZ(pos, "pos");
        Iterator it = ((ArrayList) this.LIZ.LJIIJJI).iterator();
        while (it.hasNext()) {
            C6QO c6qo = (C6QO) it.next();
            if (c6qo.LJJLIIIJLJLI() == i) {
                if (c6qo.LJIJJ().getWidth() != 0) {
                    LJI(z, this.LIZ, guideText, c6qo, pos, num, num2, num3);
                    return;
                } else {
                    XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C159826Pa(c6qo, z, this.LIZ, guideText, pos, num, num2, num3, null), 3);
                    return;
                }
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final void LJI(boolean z, C6PV c6pv, String text, C6QO c6qo, EnumC159956Pn pos, Integer num, Integer num2, Integer num3) {
        int i;
        int i2;
        if (z) {
            C6QK LIZJ = c6pv.LJIIL().LIZJ();
            BaseStickerModel model = c6qo.LJIJJ();
            LIZJ.getClass();
            o.LJIIIZ(text, "text");
            o.LJIIIZ(model, "model");
            o.LJIIIZ(pos, "pos");
            RectF stickerBoundingRect = model.getStickerBoundingRect();
            TuxTextView tuxTextView = LIZJ.LJ;
            tuxTextView.setText(text);
            if (num != null) {
                i = num.intValue();
            } else {
                i = 82;
            }
            tuxTextView.setTuxFont(i);
            if (num2 != null) {
                i2 = num2.intValue();
            } else {
                i2 = R.attr.dj;
            }
            tuxTextView.setTextColorRes(i2);
            tuxTextView.setMaxWidth(LIZJ.LIZ.getWidth() - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) * 2));
            tuxTextView.setMaxLines(10);
            if (LIZJ.LJ.getParent() == null) {
                LIZJ.LIZ.addView(LIZJ.LJ);
            }
            LIZJ.LJ.post(new ARunnableS6S0400000_2(pos, stickerBoundingRect, LIZJ, num3, 8));
            return;
        }
        c6pv.LJIIL().LIZJ().LJJIFFI();
    }
}
