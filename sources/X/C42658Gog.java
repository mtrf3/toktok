package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Gog, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42658Gog extends C08Z {
    public final /* synthetic */ AbstractC42651GoZ LIZ;

    public C42658Gog(AbstractC42651GoZ abstractC42651GoZ) {
        this.LIZ = abstractC42651GoZ;
    }

    @Override // X.C08Z
    public final void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentViewDestroyed(fm, f);
        ((ArrayList) this.LIZ.LJLILLLLZI).remove(f);
    }

    @Override // X.C08Z
    public final void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        o.LJIIIZ(v, "v");
        super.onFragmentViewCreated(fm, f, v, bundle);
        try {
            if (o.LJ(C78840Uwu.LJIIL(v), this.LIZ) && !((ArrayList) this.LIZ.LJLILLLLZI).contains(f)) {
                ((ArrayList) this.LIZ.LJLILLLLZI).add(f);
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
