package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TDC extends TDE {
    @Override // X.TDE, X.TDG
    public final int LJI() {
        return R.layout.cre;
    }

    @Override // X.TDE, X.TDG
    public final View LJFF(Context context) {
        FrameLayout.LayoutParams layoutParams;
        int imgWidth;
        int imgHeight;
        FrameLayout.LayoutParams layoutParams2;
        o.LJIIIZ(context, "context");
        if (!getEnableSimplifyLayout()) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            View content = C16880lQ.LLLLIILL(C16880lQ.LLZIL(getContext()), R.layout.cre, frameLayout, false);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            o.LJIIIIZZ(content, "content");
            content.setLayoutParams(layoutParams3);
            frameLayout.addView(content);
            View findViewById = content.findViewById(R.id.csp);
            ViewGroup.LayoutParams layoutParams4 = findViewById.getLayoutParams();
            if (LJIIJJI()) {
                imgWidth = getImgLayoutWidth();
            } else {
                imgWidth = getImgWidth();
            }
            if (LJIIJJI()) {
                imgHeight = getImgLayoutHeight();
            } else {
                imgHeight = getImgHeight();
            }
            layoutParams4.width = imgWidth;
            layoutParams4.height = imgHeight;
            findViewById.setLayoutParams(layoutParams4);
            if (LJIIJJI()) {
                layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            } else {
                layoutParams2 = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
            }
            frameLayout.setLayoutParams(layoutParams2);
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new C74259TCl(this));
            return frameLayout;
        }
        View LJIILIIL = LJIILIIL(context);
        if (getEnableExpandBorder()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        } else {
            layoutParams = new FrameLayout.LayoutParams(getImgWidth(), getImgHeight());
        }
        LJIILIIL.setLayoutParams(layoutParams);
        return LJIILIIL;
    }

    @Override // X.TDE, X.TDG
    public final View LJII(Context context) {
        o.LJIIIZ(context, "context");
        TD7 td7 = new TD7(context);
        td7.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        td7.setGravity(1);
        td7.setMaxHeight((int) C74275TDb.LIZ(14.0f));
        td7.setPadding((int) C74275TDb.LIZ(3.0f), 0, (int) C74275TDb.LIZ(3.0f), 0);
        td7.setTextAlignment(4);
        if (this.LLIILII) {
            td7.setSingleLine();
            td7.setEllipsize(TextUtils.TruncateAt.END);
        }
        return td7;
    }

    @Override // X.TDG
    public final void LIZIZ(LinearLayout linearLayout, boolean z) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C74275TDb.LIZ(80.0f), -2);
        layoutParams.gravity = 17;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDC(Context context, boolean z, int i, int i2, int i3, int i4, int i5, int i6, boolean z2, int i7, int i8, int i9, int i10, int i11, int i12, int i13, boolean z3, boolean z4, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        super(context, z, i, i2, i3, i4, i5, i6, z2, i7, i8, i9, i10, i11, i12, i13, z3, z4, i14, i15, i16, i17, i18, i19, i20, z5, z6, false, false, z7, z8, z12, z9, z10, z11, 54, 402653184, 4);
        o.LJIIIZ(context, "context");
        LJIILLIIL();
    }
}
