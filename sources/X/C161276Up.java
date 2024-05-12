package X;

import Y.AObjectS42S0101000_5;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Up */
/* loaded from: classes3.dex */
public final class C161276Up {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final VideoPublishEditModel model, final ActivityC45651qj activity, final ViewStub viewStub, final FrameLayout frameLayout, final FrameLayout.LayoutParams surfaceParams, final float f, final InterfaceC88472Yns interfaceC88472Yns, final InterfaceC65784Pro interfaceC65784Pro, final InterfaceC65784Pro interfaceC65784Pro2, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(surfaceParams, "surfaceParams");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        if (!C6H4.LJI(model.creativeModel.stickerModel)) {
            return;
        }
        new SafeHandler(lifecycleOwner).post(new Runnable() { // from class: X.6Un
            public final void LIZ() {
                ViewStub viewStub2 = viewStub;
                FrameLayout frameLayout2 = frameLayout;
                if (viewStub2 != null) {
                    viewStub2.setLayoutResource(R.layout.cnr);
                    View inflate = viewStub2.inflate();
                    o.LJII(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
                    frameLayout2 = (FrameLayout) inflate;
                    if (frameLayout2 == null) {
                        return;
                    }
                } else if (frameLayout2 == null) {
                    return;
                } else {
                    frameLayout2.setVisibility(0);
                }
                FrameLayout.LayoutParams layoutParams = surfaceParams;
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
                FrameLayout.LayoutParams layoutParams3 = surfaceParams;
                layoutParams2.topMargin = layoutParams3.topMargin;
                layoutParams2.leftMargin = layoutParams3.leftMargin;
                layoutParams2.rightMargin = layoutParams3.rightMargin;
                layoutParams2.bottomMargin = layoutParams3.bottomMargin;
                layoutParams2.setMarginStart(layoutParams3.getMarginStart());
                C6U9 container = StickerContainerService.LIZ().getContainer();
                frameLayout2.setLayoutParams(layoutParams2);
                EnumC161246Um enumC161246Um = EnumC161246Um.PREVIEW;
                FrameLayout.LayoutParams layoutParams4 = surfaceParams;
                C6UD c6ud = new C6UD(layoutParams4.width, layoutParams4.height, 0, 0, f);
                C6U3 c6u3 = new C6U3(C226388uY.LIZIZ());
                C161296Ur c161296Ur = new C161296Ur(null, new AqS152S0100000_2(model, 973), new AqS152S0100000_2(model, 974), new AqS152S0100000_2(model, 975), 1);
                ActivityC45651qj activityC45651qj = activity;
                container.LIZIZ(new C6UA(enumC161246Um, frameLayout2, c6ud, activityC45651qj, c161296Ur, interfaceC65784Pro, interfaceC65784Pro2, c6u3, new AqS168S0100000_2(activityC45651qj, 618), 32));
                List<StickerModel> LJ = C6H4.LJ(model.creativeModel.stickerModel);
                ArrayList arrayList = new ArrayList(C32I.LJJL(LJ, 10));
                Iterator it = ((ArrayList) LJ).iterator();
                while (it.hasNext()) {
                    arrayList.add(((StickerModel) it.next()).getInteractStickerStruct());
                }
                C161316Ut.LIZ(container, arrayList, C6H4.LJ(model.creativeModel.stickerModel), 12);
                InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                if (interfaceC88472Yns2 != null) {
                    interfaceC88472Yns2.invoke(frameLayout2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    public static /* synthetic */ void LIZIZ(VideoPublishEditModel videoPublishEditModel, ActivityC45651qj activityC45651qj, ViewStub viewStub, FrameLayout frameLayout, FrameLayout.LayoutParams layoutParams, float f, AObjectS42S0101000_5 aObjectS42S0101000_5, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2, int i) {
        FrameLayout frameLayout2 = frameLayout;
        ViewStub viewStub2 = viewStub;
        float f2 = f;
        AObjectS42S0101000_5 aObjectS42S0101000_52 = aObjectS42S0101000_5;
        ActivityC45651qj activityC45651qj2 = null;
        if ((i & 4) != 0) {
            viewStub2 = null;
        }
        if ((i & 8) != 0) {
            frameLayout2 = null;
        }
        if ((i & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i & 64) != 0) {
            aObjectS42S0101000_52 = null;
        }
        if ((i & 512) != 0) {
            activityC45651qj2 = activityC45651qj;
        }
        LIZ(videoPublishEditModel, activityC45651qj, viewStub2, frameLayout2, layoutParams, f2, aObjectS42S0101000_52, interfaceC65784Pro, interfaceC65784Pro2, activityC45651qj2);
    }
}
