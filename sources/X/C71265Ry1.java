package X;

import Y.ALAdapterS1S0101000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.model.ShortTouchItem;
import com.bytedance.android.livesdk.model.ShortTouchPreviewSetting;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.Ry1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71265Ry1 implements UOY {
    public final C71884SJc LIZ;

    @Override // X.UOY
    public final void LIZIZ() {
    }

    @Override // X.UOY
    public final void LLLLZLL() {
    }

    @Override // X.UOY
    public final View LIZJ() {
        return this.LIZ;
    }

    @Override // X.UOY
    public final UOV LIZ(ViewGroup viewGroup) {
        int i;
        ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(viewGroup);
        if (LJFF != null) {
            i = LJFF.getMarginStart();
        } else {
            i = 0;
        }
        this.LIZ.addAnimatorListener(new ALAdapterS1S0101000_12(i, viewGroup, 1));
        return new C71283RyJ(this);
    }

    public C71265Ry1(C71188Rwm c71188Rwm, ShortTouchItem shortTouchItem) {
        N27 n27;
        int i;
        int i2;
        Object content;
        Context context = c71188Rwm.LJLJJLL;
        String str = shortTouchItem.name;
        o.LJIIIIZZ(str, "shortTouchItem.name");
        ShortTouchPreviewSetting shortTouchPreviewSetting = shortTouchItem.previewSetting;
        o.LJIIIIZZ(shortTouchPreviewSetting, "shortTouchItem.previewSetting");
        if (o.LJ(str, "shortTouchEcommerceLuckyBag")) {
            n27 = N27.LOTTIE;
        } else {
            n27 = N27.DEFAULT;
        }
        N27 n272 = N27.LOTTIE;
        if (n27 == n272) {
            i = 100;
        } else {
            i = 70;
        }
        if (n27 == n272) {
            i2 = 80;
        } else {
            i2 = 70;
        }
        if (n27 == n272) {
            content = shortTouchPreviewSetting.previewImage;
        } else {
            content = UriProtector.parse(shortTouchPreviewSetting.previewSchema);
        }
        o.LJIIIIZZ(content, "content");
        this.LIZ = new C71884SJc(context, new C62847OlX(str, i, i2, n27, content));
    }
}
