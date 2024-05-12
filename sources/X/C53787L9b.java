package X;

import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.LinkedList;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.L9b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53787L9b extends L9Y {
    public final WM7 LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C53787L9b(com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene r3) {
        /*
            r2 = this;
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            android.app.Activity r1 = r3.requireActivity()
            java.lang.String r0 = "scene.requireActivity()"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r2.LJ = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53787L9b.<init>(com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene):void");
    }

    @Override // X.L9Y, X.InterfaceC51123K4p
    public final View LIZ(int i) {
        Context requireSceneContext = this.LJ.requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "scene.requireSceneContext()");
        if (C53791L9f.LIZ()) {
            LinkedList<View> linkedList = this.LIZIZ.get(Integer.valueOf(i));
            if (linkedList != null) {
                synchronized (linkedList) {
                    View poll = linkedList.poll();
                    if (poll != null) {
                        return poll;
                    }
                    this.LIZIZ.remove(Integer.valueOf(i));
                }
            }
            View LIZ = C16950lX.LIZ(requireSceneContext, i, new FrameLayout(requireSceneContext), false, -1);
            o.LJIIIIZZ(LIZ, "{\n                val vi…xt), false)\n            }");
            return LIZ;
        }
        if (((Boolean) C53791L9f.LIZIZ.getValue()).booleanValue()) {
            View LIZ2 = C16950lX.LIZ(requireSceneContext, i, new FrameLayout(requireSceneContext), false, -1);
            o.LJIIIIZZ(LIZ2, "getView(\n               …     false,\n            )");
            return LIZ2;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(requireSceneContext), i, new FrameLayout(requireSceneContext), false);
        o.LJIIIIZZ(LLLLIILL, "from(context).inflate(la…meLayout(context), false)");
        return LLLLIILL;
    }

    @Override // X.L9Y, X.AbstractC51620KNs
    public final void LIZJ(C208108Es target, long j) {
        o.LJIIIZ(target, "target");
        if (!C53791L9f.LIZ()) {
            return;
        }
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(this, target, 110);
        if (j > 0) {
            C37190Eig.LIZ.postDelayed(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 213), j);
        } else {
            C37190Eig.LIZ.post(new ARunnableS45S0100000_9((Object) aqS156S0200000_9, 213));
        }
    }
}
