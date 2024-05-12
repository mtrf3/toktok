package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtL, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91359ZtL implements InterfaceC91178ZqQ {
    public static final List<InterfaceC91177ZqP> LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C91392Zts(context));
        arrayList.add(new C91393Ztt(context));
        return arrayList;
    }

    @Override // X.InterfaceC91178ZqQ
    public final <T extends View> T LIZ(LCP iconData) {
        o.LJIIIZ(iconData, "iconData");
        return new C91179ZqR(iconData);
    }
}
