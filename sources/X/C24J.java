package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import kotlin.jvm.internal.o;

/* renamed from: X.24J, reason: invalid class name */
/* loaded from: classes.dex */
public final class C24J extends AbstractC65781Prl implements InterfaceC65784Pro<Context> {
    public static final C24J LJLIL = new C24J();

    public C24J() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        Object value = C20760rg.LIZLLL.getValue();
        o.LJIIIIZZ(value, "<get-applicationContext>(...)");
        Context context = (Context) value;
        return new ContextThemeWrapper(context, C259710f.LIZ.LJFF(context));
    }
}
