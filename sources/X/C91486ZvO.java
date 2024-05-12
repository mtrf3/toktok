package X;

import android.content.Context;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZvO, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91486ZvO extends View implements InterfaceC91366ZtS<C91077Zon>, InterfaceC91083Zot {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91486ZvO(Context context) {
        super(context);
        new LinkedHashMap();
    }

    @Override // X.InterfaceC91366ZtS
    public final void LJJZZIII(C91077Zon c91077Zon) {
        c91077Zon.LIZJ = getLayoutParams().height;
    }

    @Override // X.InterfaceC91083Zot
    public void setConfig(C91084Zou config) {
        o.LJIIIZ(config, "config");
        getLayoutParams().height = config.LJIIJJI;
    }
}
