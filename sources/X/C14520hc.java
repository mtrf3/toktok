package X;

import Y.IDRunnableS29S0200000;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFlyMicGiftContainerColorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14520hc {
    public final DataChannel LIZ;
    public ViewGroup LIZIZ;
    public Context LIZJ;
    public final List<AnimatorSet> LIZLLL;
    public final C73318Sq2 LJ;
    public C42951mN<C2A4> LJFF;
    public boolean LJI;
    public Animator LJII;
    public long LJIIIIZZ;

    public C14520hc(DataChannel dataChannel) {
        o.LJIIIZ(dataChannel, "dataChannel");
        this.LIZ = dataChannel;
        this.LIZLLL = new ArrayList();
        this.LJ = new C73318Sq2();
        this.LJIIIIZZ = -1L;
    }

    public final void LIZIZ(C2A4 c2a4) {
        ViewGroup viewGroup = this.LIZIZ;
        if (viewGroup != null) {
            viewGroup.post(new IDRunnableS29S0200000(this, c2a4, 30));
        }
    }

    public final C2A4 LIZ(int i, C33611Tp c33611Tp) {
        C2A4 c2a4 = new C2A4(this.LIZJ);
        c2a4.setId(R.id.k5m);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        c2a4.setLayoutParams(layoutParams);
        int i2 = i / 2;
        float f = c33611Tp.LJLILLLLZI.getFirst().x - i2;
        float f2 = c33611Tp.LJLILLLLZI.getFirst().y - i2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("raw startX is ");
        LIZ.append(c33611Tp.LJLILLLLZI.getFirst().x);
        LIZ.append(", raw startY is ");
        C15890jp.LIZIZ(LIZ, c33611Tp.LJLILLLLZI.getFirst().y, ",containerSize is ", i, ", realStartX is ");
        LIZ.append(f);
        LIZ.append(", realStartY is");
        LIZ.append(f2);
        C0NB.LIZIZ("LiveLinkMicGiftFlyAnimationHelper", X1D.LIZIZ(LIZ));
        c2a4.setX(f);
        c2a4.setY(f2);
        if (MultiGuestFlyMicGiftContainerColorSetting.INSTANCE.isEnable()) {
            c2a4.setBackgroundColor(ColorProtector.parseColor("#FF0000"));
        }
        return c2a4;
    }
}
