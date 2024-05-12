package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public final class CF2 extends AbstractC65781Prl implements InterfaceC65784Pro<DisplayMetrics> {
    public static final CF2 LJLIL = new CF2();

    public CF2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final DisplayMetrics invoke() {
        Context context;
        Resources resources;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null && (context = iHostAppContext.context()) != null && (resources = context.getResources()) != null) {
            return resources.getDisplayMetrics();
        }
        return null;
    }
}
