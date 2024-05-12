package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1CN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1CN implements AnonymousClass106 {
    public final java.util.Set<String> LIZ;

    @Override // X.AnonymousClass106
    public final Bundle saveState() {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.LIZ));
        return bundle;
    }

    public C1CN(AnonymousClass107 registry) {
        o.LJIIIZ(registry, "registry");
        this.LIZ = new LinkedHashSet();
        registry.LIZJ("androidx.savedstate.Restarter", this);
    }
}
