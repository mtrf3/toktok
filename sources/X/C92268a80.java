package X;

import androidx.navigation.NavBackStackEntry;
import kotlin.jvm.internal.o;

/* renamed from: X.a80, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92268a80 implements InterfaceC24580xq {
    public final /* synthetic */ C92270a82 LIZ;
    public final /* synthetic */ NavBackStackEntry LIZIZ;

    @Override // X.InterfaceC24580xq
    public final void dispose() {
        C92270a82 c92270a82 = this.LIZ;
        NavBackStackEntry entry = this.LIZIZ;
        c92270a82.getClass();
        o.LJIIIZ(entry, "entry");
        c92270a82.LIZIZ().LIZIZ(entry);
    }

    public C92268a80(C92270a82 c92270a82, NavBackStackEntry navBackStackEntry) {
        this.LIZ = c92270a82;
        this.LIZIZ = navBackStackEntry;
    }
}
