package X;

import android.content.Context;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.99d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2321399d extends AbstractC65781Prl implements InterfaceC88472Yns<Context, View> {
    public static final C2321399d LJLIL = new C2321399d();

    public C2321399d() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(Context context) {
        Context context2 = context;
        o.LJIIIZ(context2, "context");
        return new SmartImageView(context2);
    }
}
