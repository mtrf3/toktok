package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Llg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55212Llg extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C55212Llg LJLIL = new C55212Llg();

    public C55212Llg() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC it = fvc;
        o.LJIIIZ(it, "it");
        final Context context = it.LIZIZ;
        return new FrameLayout(context) { // from class: X.2Np
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context, null, 0);
                a1.LJFF(context, "context");
                C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.apk, this, true);
            }
        };
    }
}
