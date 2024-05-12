package Y;

import X.AnonymousClass642;
import X.C1559169z;
import X.C64I;
import X.C64N;
import X.C67P;
import X.C6H7;
import X.C6RZ;
import X.EnumC157656Gr;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ARunnableS2S0310000_2 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS2S0310000_2.LIZ$0():void");
    }

    public final void LIZ$1() {
        if (this.z3) {
            AnonymousClass642 anonymousClass642 = (AnonymousClass642) this.l0;
            anonymousClass642.LIZJ = true;
            anonymousClass642.LIZ = ((C67P) this.l1).getCenterY();
            ((AnonymousClass642) this.l0).LIZIZ = ((C67P) this.l1).getCenterX();
            C67P c67p = (C67P) this.l1;
            c67p.setCenterY(c67p.LJII(((TextStickerData) this.l2).getEditCenterPoint().x, ((TextStickerData) this.l2).getEditCenterPoint().y).y);
            C67P c67p2 = (C67P) this.l1;
            c67p2.setCenterX(c67p2.LJII(((TextStickerData) this.l2).getEditCenterPoint().x, ((TextStickerData) this.l2).getEditCenterPoint().y).x);
        }
    }

    public final void LIZ$2() {
        ((C64I) this.l0).getMStickerLayer().setVisibility(8);
        FrameLayout frameLayout = ((C64I) this.l0).LJLILLLLZI;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            FrameLayout frameLayout2 = ((C64I) this.l0).LJLILLLLZI;
            if (frameLayout2 != null) {
                frameLayout2.addView((C1559169z) this.l1);
                FrameLayout frameLayout3 = ((C64I) this.l0).LJLILLLLZI;
                if (frameLayout3 != null) {
                    frameLayout3.requestLayout();
                    if (this.z3) {
                        ((C1559169z) this.l1).LIZ(((C64N) this.l2).LIZ());
                        return;
                    } else {
                        ((C1559169z) this.l1).LIZJ(((C64N) this.l2).LIZ());
                        return;
                    }
                }
                o.LJIJI("stickerEditLayer");
                throw null;
            }
            o.LJIJI("stickerEditLayer");
            throw null;
        }
        o.LJIJI("stickerEditLayer");
        throw null;
    }

    public static final void run$0(ARunnableS2S0310000_2 aRunnableS2S0310000_2) {
        boolean LIZ;
        try {
            C6H7 c6h7 = ((C6RZ) aRunnableS2S0310000_2.l0).LLFII;
            if (c6h7 != null) {
                c6h7.Q7((StickerModel) aRunnableS2S0310000_2.l1, (EnumC157656Gr) aRunnableS2S0310000_2.l2, aRunnableS2S0310000_2.z3);
            } else {
                o.LJIJI("stickerService");
                throw null;
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS2S0310000_2 aRunnableS2S0310000_2) {
        boolean LIZ;
        try {
            aRunnableS2S0310000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS2S0310000_2 aRunnableS2S0310000_2) {
        boolean LIZ;
        try {
            aRunnableS2S0310000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS2S0310000_2 aRunnableS2S0310000_2) {
        boolean LIZ;
        try {
            aRunnableS2S0310000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS2S0310000_2(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.z3 = z;
    }
}
