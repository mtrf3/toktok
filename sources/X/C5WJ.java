package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.5WJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5WJ extends TBS implements InterfaceC65784Pro<Context> {
    public C5WJ(Object obj) {
        super(0, obj, Fragment.class, "getContext", "getContext()Landroid/content/Context;", 0);
    }

    @Override // X.InterfaceC65784Pro
    public final Context invoke() {
        return ((Fragment) this.receiver).getContext();
    }
}
