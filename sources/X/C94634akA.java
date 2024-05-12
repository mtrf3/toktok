package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.akA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94634akA extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public static final C94634akA LJLIL = new C94634akA();

    public C94634akA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View receiver = view;
        o.LJIIIZ(receiver, "$receiver");
        Context context = receiver.getContext();
        o.LJIIIIZZ(context, "context");
        receiver.setBackground(C40681ii.LIZ(context.getResources(), R.drawable.dfm, null));
        return C76800UCe.LIZ;
    }
}
