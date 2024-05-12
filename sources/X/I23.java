package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS1S0410000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I23 implements InterfaceC45854Hz8 {
    public static int LIZIZ(ViewGroup viewGroup) {
        int generateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(generateViewId);
        viewGroup.addView(frameLayout);
        return generateViewId;
    }

    @Override // X.InterfaceC45854Hz8
    public final void LIZ(WMH wmh) {
        boolean z;
        o.LJIIIZ(wmh, "<this>");
        AbstractC42651GoZ LJIJ = C86793Y4n.LJIJ(wmh);
        C45848Hz2 c45848Hz2 = (C45848Hz2) wmh;
        C78685UuP.LJIIJJI(wmh, C89474Z9q.LJLIL);
        if (GX0.LIZ() && C41669GWz.LIZ()) {
            ShortVideoContext shortVideoContext = c45848Hz2.LJLJJLL;
            o.LJIIIIZZ(shortVideoContext, "shortVideoContext");
            if (!C77123UOp.LJJ(shortVideoContext)) {
                z = true;
                C44384HbQ.LJIIIZ(wmh, new AqS1S0410000_14(wmh, this, wmh, z, C78688UuS.LJIIIZ(wmh, true, new AqS1S0410000_14(c45848Hz2, wmh, this, z, LJIJ, 2)), 1));
                C44384HbQ.LJJJI(wmh);
                C60903NvH.LJIIJJI().LJIJJLI();
            }
        }
        z = false;
        C44384HbQ.LJIIIZ(wmh, new AqS1S0410000_14(wmh, this, wmh, z, C78688UuS.LJIIIZ(wmh, true, new AqS1S0410000_14(c45848Hz2, wmh, this, z, LJIJ, 2)), 1));
        C44384HbQ.LJJJI(wmh);
        C60903NvH.LJIIJJI().LJIJJLI();
    }
}
