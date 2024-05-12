package X;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Wfh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82869Wfh {
    public final Context LIZ;
    public final ComponentName LIZIZ;
    public ServiceConnectionC40639FxD LIZJ;
    public final java.util.Set<String> LIZLLL;
    public final java.util.Map<String, C44976Hky> LJ;
    public final Handler LJFF;
    public C82876Wfo LJI;
    public String LJII;
    public final BinderC82874Wfm LJIIIIZZ;

    public C82869Wfh(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = null;
        this.LIZLLL = new LinkedHashSet();
        this.LJ = new LinkedHashMap();
        this.LJFF = new Handler(C16880lQ.LLJJJJ());
        this.LJII = "";
        this.LJIIIIZZ = new BinderC82874Wfm(this);
    }

    public final void LIZ(InterfaceC40638FxC interfaceC40638FxC) {
        for (String str : this.LIZLLL) {
            this.LJ.put(str, new C44976Hky());
            interfaceC40638FxC.LLLIL(str, this.LJII);
        }
        this.LIZLLL.clear();
    }
}
