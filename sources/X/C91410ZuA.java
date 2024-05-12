package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.ZuA, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91410ZuA implements LLE {
    public final /* synthetic */ C68322mC<C26231ARf> LJLIL;

    public C91410ZuA(C68322mC<C26231ARf> c68322mC) {
        this.LJLIL = c68322mC;
    }

    @Override // X.LLE
    public final void LJLJJLL(String str, String str2, boolean z, boolean z2, Bundle bundle, String str3) {
        C26231ARf c26231ARf;
        if (!o.LJ(str, "MUSIC_DSP") && (c26231ARf = this.LJLIL.element) != null) {
            c26231ARf.LIZIZ("tab_change");
        }
    }
}
