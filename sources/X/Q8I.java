package X;

import android.content.Intent;
import android.util.Pair;
import androidx.activity.ComponentActivity;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q8I extends AbstractC18470nz<Intent, Pair<Integer, Intent>> {
    @Override // X.AbstractC18470nz
    public final Intent LIZ(ComponentActivity componentActivity, Object obj) {
        return (Intent) obj;
    }

    @Override // X.AbstractC18470nz
    public final Pair<Integer, Intent> LIZIZ(int i, Intent intent) {
        Pair<Integer, Intent> create = Pair.create(Integer.valueOf(i), intent);
        o.LJIIIIZZ(create, "create(resultCode, intent)");
        return create;
    }
}
