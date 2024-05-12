package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.AfQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26796AfQ extends AbstractC65781Prl implements InterfaceC88472Yns<C26798AfS, View> {
    public final /* synthetic */ C119774mz LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26796AfQ(C119774mz c119774mz, float f) {
        super(1);
        this.LJLIL = c119774mz;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(C26798AfS it) {
        o.LJIIIZ(it, "it");
        Context context = this.LJLIL.getContext();
        o.LJIIIIZZ(context, "flow.context");
        View LIZ = C27531ArH.LIZ(R.layout.a41, context, this.LJLIL, false);
        float f = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = LIZ.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
            int i = (int) f;
            layoutParams.width = i;
            layoutParams.height = i;
            LIZ.setLayoutParams(layoutParams);
        }
        return LIZ;
    }
}
