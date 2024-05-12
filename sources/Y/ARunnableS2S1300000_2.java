package Y;

import X.ActivityC45651qj;
import X.C1551767d;
import X.C16880lQ;
import X.C1M5;
import X.C38891fp;
import X.C5LN;
import X.C68W;
import X.C6QK;
import X.EnumC159956Pn;
import X.H7B;
import X.InterfaceC143655kP;
import X.InterfaceC88472Yns;
import X.OUR;
import X.W5G;
import X.X1D;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS45S1200000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS2S1300000_2 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        int width = ((W5G) this.l1).getWidth();
        Bitmap LJIILIIL = C38891fp.LJIILIIL(width, (int) (width / ((((VideoPublishEditModel) this.l2).videoWidth() * 1.0f) / ((VideoPublishEditModel) this.l2).videoHeight())), this.s0);
        if (LJIILIIL != null) {
            ((W5G) this.l1).setImageDrawable(new C1M5(((ActivityC45651qj) this.l3).getResources(), OUR.LIZJ((VideoPublishEditModel) this.l2, LJIILIIL)));
        }
    }

    public final void LIZ$1() {
        TextStickerTextWrap LIZ = C68W.LIZ((C1551767d) this.l1, new ArrayList());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.s0);
        LIZ2.append(" ->  addToProcessSplitTextTask split text: ");
        String arrays = Arrays.toString(LIZ.getStrArray());
        o.LJIIIIZZ(arrays, "toString(this)");
        LIZ2.append(arrays);
        H7B.LJ(X1D.LIZIZ(LIZ2));
        ((InterfaceC88472Yns) this.l2).invoke(LIZ);
        C16880lQ.LJLLLL((C1551767d) this.l1, ((InterfaceC143655kP) this.l3).Iy());
    }

    public final void LIZ$2() {
        if (((View) this.l1).getParent() != null) {
            int[] iArr = new int[2];
            ((View) this.l1).getLocationOnScreen(iArr);
            ((C6QK) this.l2).LJ.setText(this.s0);
            ((C6QK) this.l2).LJ.setMaxWidth(((View) this.l1).getWidth());
            ((C6QK) this.l2).LJ.setMaxLines(10);
            if (((C6QK) this.l2).LJ.getParent() == null) {
                C6QK c6qk = (C6QK) this.l2;
                c6qk.LIZIZ.addView(c6qk.LJ);
            }
            C6QK c6qk2 = (C6QK) this.l2;
            c6qk2.LJ.post(new ARunnableS6S0400000_2((EnumC159956Pn) this.l3, iArr, (View) this.l1, c6qk2, 9));
        }
    }

    public static final void run$0(ARunnableS2S1300000_2 aRunnableS2S1300000_2) {
        boolean LIZ;
        try {
            aRunnableS2S1300000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S1300000_2 aRunnableS2S1300000_2) {
        boolean LIZ;
        try {
            ((C5LN) aRunnableS2S1300000_2.l1).LJJZZI(new AqS45S1200000_2((List) aRunnableS2S1300000_2.l2, (List<? extends NLETrackSlot>) aRunnableS2S1300000_2.l3, (EffectModel) aRunnableS2S1300000_2.s0, (String) 1));
            C5LN.LLLLLJIL((C5LN) aRunnableS2S1300000_2.l1, true, false, false, null, 14, null);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S1300000_2 aRunnableS2S1300000_2) {
        boolean LIZ;
        try {
            aRunnableS2S1300000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S1300000_2 aRunnableS2S1300000_2) {
        boolean LIZ;
        try {
            aRunnableS2S1300000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S1300000_2(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj2;
        this.l2 = obj3;
        this.s0 = str;
        this.l3 = obj;
    }
}
