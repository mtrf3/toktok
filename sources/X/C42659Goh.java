package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Goh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42659Goh extends C08Z {
    public final /* synthetic */ InterfaceC40967G5z LIZ;

    public C42659Goh(InterfaceC40967G5z interfaceC40967G5z) {
        this.LIZ = interfaceC40967G5z;
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentViewDestroyed(fm, f);
        this.LIZ.LIZ();
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        super.onFragmentViewCreated(fm, f, v, bundle);
        this.LIZ.onViewCreated(v, bundle);
    }
}
