package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60941Nvt implements InterfaceC60871Nul {
    public final SparkPopupSchemaParam LIZ;
    public final View LIZIZ;
    public final C60965NwH LIZJ;

    public final String LIZ() {
        String realTransitionAnimation = this.LIZ.getRealTransitionAnimation(this.LIZIZ.getContext());
        if (o.LJ(realTransitionAnimation, "start")) {
            Context context = this.LIZIZ.getContext();
            o.LJFF(context, "view.context");
            if (C60963NwF.LIZ(context)) {
                return "right";
            }
            return "left";
        }
        if (o.LJ(realTransitionAnimation, "end")) {
            Context context2 = this.LIZIZ.getContext();
            o.LJFF(context2, "view.context");
            if (!C60963NwF.LIZ(context2)) {
                return "right";
            }
            return "left";
        }
        return realTransitionAnimation;
    }

    @Override // X.InterfaceC60871Nul
    public final void invoke() {
        this.LIZ.getRealTransitionAnimation(this.LIZIZ.getContext());
    }

    public C60941Nvt(SparkPopupSchemaParam params, View view, C60965NwH animController) {
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        o.LJIIJ(animController, "animController");
        this.LIZ = params;
        this.LIZIZ = view;
        this.LIZJ = animController;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.AbstractC60931Nvj r8, int r9, X.InterfaceC65784Pro<X.C76800UCe> r10) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60941Nvt.LIZIZ(X.Nvj, int, X.Pro):void");
    }
}
