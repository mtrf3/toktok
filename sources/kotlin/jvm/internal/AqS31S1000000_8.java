package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C27943Axv;
import X.C32151Nz;
import X.C49517Jc1;
import X.C49740Jfc;
import X.C49951Jj1;
import X.C56045Lz7;
import X.C71313Ryn;
import X.C76800UCe;
import X.C7MY;
import X.C86977YBp;
import X.C86981YBt;
import X.INT;
import X.InterfaceC88472Yns;
import X.KI0;
import X.O6R;
import X.W5F;
import X.W5U;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.search.common.model.TopHistory;

/* loaded from: classes9.dex */
public class AqS31S1000000_8 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public String s0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            case 10:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(FrameLayout layout) {
        o.LJIIIZ(layout, "layout");
        ViewGroup.LayoutParams layoutParams = layout.getLayoutParams();
        if (layoutParams instanceof C86981YBt) {
            C86981YBt c86981YBt = (C86981YBt) layoutParams;
            Context context = layout.getContext();
            o.LJIIIIZZ(context, "layout.context");
            c86981YBt.LJII = C86977YBp.LIZ(context, "wrap_content", "height2");
            Context context2 = layout.getContext();
            o.LJIIIIZZ(context2, "layout.context");
            c86981YBt.LJI = C86977YBp.LIZ(context2, "wrap_content", "width2");
            layout.setLayoutParams(layoutParams);
            layout.setMinimumHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(56)));
        }
        SmartImageView smartImageView = new SmartImageView(layout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C7MY.LIZIZ(32), C7MY.LIZIZ(32));
        layoutParams2.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
        layoutParams2.gravity = 16;
        smartImageView.setLayoutParams(layoutParams2);
        W5F LJIIIIZZ = W5U.LJIIIIZZ(this.s0);
        LJIIIIZZ.LJJIIJ = smartImageView;
        C16880lQ.LLJJJ(LJIIIIZZ);
        layout.addView(smartImageView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS31S1000000_8(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    public static final Object invoke$0(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        INT it = (INT) obj;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(o.LJ(it.LIZ, aqS31S1000000_8.s0));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        aqS31S1000000_8.invoke$0((FrameLayout) obj);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        KI0 setState = (KI0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return KI0.LIZ(setState, 0, aqS31S1000000_8.s0, null, false, null, null, 61);
    }

    public static final Object invoke$2(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C49951Jj1 it = (C49951Jj1) obj;
        o.LJIIIZ(it, "it");
        String str = aqS31S1000000_8.s0;
        if (str == null) {
            str = "";
        }
        it.LIZJ(2, str);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C27943Axv sendLog = (C27943Axv) obj;
        o.LJIIIZ(sendLog, "$this$sendLog");
        C56045Lz7.LIZ.getClass();
        sendLog.LIZLLL("enter_from", C56045Lz7.LIZIZ());
        sendLog.LIZLLL("page_name", "mall");
        sendLog.LIZLLL("enter_page", aqS31S1000000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C27943Axv c27943Axv = (C27943Axv) obj;
        C71313Ryn.LIZLLL(c27943Axv, "$this$sendLog", "EVENT_ORIGIN_FEATURE", "TEMAI", "enter_from", "mall");
        c27943Axv.LIZLLL("page_name", "mall");
        c27943Axv.LIZLLL("previous_page", aqS31S1000000_8.s0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        String str;
        TopHistory topHistory = (TopHistory) obj;
        if (topHistory != null) {
            str = topHistory.word;
        } else {
            str = null;
        }
        return Boolean.valueOf(o.LJ(str, aqS31S1000000_8.s0));
    }

    public static final Object invoke$6(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C49517Jc1 setState = (C49517Jc1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49517Jc1.LIZIZ(setState, false, null, false, 0, 0L, null, null, null, aqS31S1000000_8.s0, null, 767);
    }

    public static final Object invoke$7(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C49517Jc1 setState = (C49517Jc1) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C49517Jc1.LIZIZ(setState, false, null, false, 0, 0L, null, null, aqS31S1000000_8.s0, null, null, 895);
    }

    public static final Object invoke$8(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        C49740Jfc setState = (C49740Jfc) obj;
        o.LJIIIZ(setState, "$this$setState");
        String substring = aqS31S1000000_8.s0.substring(1);
        o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
        return C49740Jfc.L(setState, false, substring, false, 5);
    }

    public static final Object invoke$9(AqS31S1000000_8 aqS31S1000000_8, Object obj) {
        KI0 setState = (KI0) obj;
        o.LJIIIZ(setState, "$this$setState");
        return KI0.LIZ(setState, 0, null, null, false, null, aqS31S1000000_8.s0, 31);
    }
}
