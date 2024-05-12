package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.0Y5, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0Y5 {
    public final Context LIZ;
    public DataChannel LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public View LJFF;
    public View LJI;
    public boolean LJII;

    public void LIZ() {
    }

    public abstract View LIZIZ(ViewGroup viewGroup);

    public abstract void LIZJ();

    public void LIZLLL(boolean z) {
    }

    public C0Y5(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
    }
}
