package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.2Nt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57572Nt extends AbstractC65781Prl implements InterfaceC88472Yns<Context, View> {
    public static final C57572Nt LJLIL = new C57572Nt();

    public C57572Nt() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        return new TuxTextView(context2, null, 6, 0);
    }
}
