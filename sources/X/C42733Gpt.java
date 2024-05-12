package X;

import android.content.Context;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42733Gpt implements InterfaceC42736Gpw {
    @Override // X.InterfaceC42736Gpw
    public final C42734Gpu LIZ(ViewGroup viewGroup) {
        o.LJI(viewGroup);
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "parent!!.context");
        return new C42734Gpu(new C80888Voq(context));
    }
}
