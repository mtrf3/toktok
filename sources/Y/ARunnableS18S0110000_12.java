package Y;

import X.C16530kr;
import X.C72207SVn;
import X.S09;
import X.S0D;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class ARunnableS18S0110000_12 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        boolean z;
        TuxTextView privilegeTextView$ecommerce_video_release;
        TuxTextView privilegeTextView$ecommerce_video_release2;
        int i;
        int i2;
        View anchor_privilege_div = ((S09) this.l0).LIZ(R.id.a3l);
        o.LJIIIIZZ(anchor_privilege_div, "anchor_privilege_div");
        if (anchor_privilege_div.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (privilegeTextView$ecommerce_video_release2 = ((S0D) ((S09) this.l0).LIZ(R.id.a3n)).getPrivilegeTextView$ecommerce_video_release()) != null) {
            S09 s09 = (S09) this.l0;
            int maxWidth = privilegeTextView$ecommerce_video_release2.getMaxWidth();
            int measuredWidth = s09.LIZ(R.id.a3l).getMeasuredWidth() + s09.LIZ(R.id.a3m).getMeasuredWidth();
            View anchor_privilege_div2 = s09.LIZ(R.id.a3l);
            o.LJIIIIZZ(anchor_privilege_div2, "anchor_privilege_div");
            ViewGroup.LayoutParams layoutParams = anchor_privilege_div2.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
            } else {
                i = 0;
            }
            int i3 = measuredWidth + i;
            View anchor_privilege_second = s09.LIZ(R.id.a3n);
            o.LJIIIIZZ(anchor_privilege_second, "anchor_privilege_second");
            ViewGroup.LayoutParams layoutParams2 = anchor_privilege_second.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                i2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams2);
            } else {
                i2 = 0;
            }
            privilegeTextView$ecommerce_video_release2.setMaxWidth(maxWidth - (i3 + i2));
        }
        View anchor_buy_button = ((S09) this.l0).LIZ(R.id.a1y);
        o.LJIIIIZZ(anchor_buy_button, "anchor_buy_button");
        if ((anchor_buy_button.getVisibility() == 0 || this.z1) && (privilegeTextView$ecommerce_video_release = ((S0D) ((S09) this.l0).LIZ(R.id.a3n)).getPrivilegeTextView$ecommerce_video_release()) != null) {
            privilegeTextView$ecommerce_video_release.setMaxWidth(privilegeTextView$ecommerce_video_release.getMaxWidth() - ((S09) this.l0).LJLJI);
        }
        TuxTextView privilegeTextView$ecommerce_video_release3 = ((S0D) ((S09) this.l0).LIZ(R.id.a3n)).getPrivilegeTextView$ecommerce_video_release();
        if (privilegeTextView$ecommerce_video_release3 == null) {
            return;
        }
        privilegeTextView$ecommerce_video_release3.setEllipsize(TextUtils.TruncateAt.END);
    }

    public static final void run$0(ARunnableS18S0110000_12 aRunnableS18S0110000_12) {
        boolean LIZ;
        try {
            ((C72207SVn) aRunnableS18S0110000_12.l0).LJ(aRunnableS18S0110000_12.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS18S0110000_12 aRunnableS18S0110000_12) {
        boolean LIZ;
        try {
            ((C72207SVn) aRunnableS18S0110000_12.l0).LJ(aRunnableS18S0110000_12.z1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS18S0110000_12 aRunnableS18S0110000_12) {
        boolean LIZ;
        try {
            aRunnableS18S0110000_12.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS18S0110000_12(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
