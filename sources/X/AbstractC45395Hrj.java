package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* renamed from: X.Hrj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC45395Hrj {
    public String LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final InterfaceC87766YcU LJ;

    public abstract String LIZ();

    public abstract String LIZIZ();

    public AbstractC45395Hrj(Context context, String downloadSuffix, int i, InterfaceC87766YcU interfaceC87766YcU) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(downloadSuffix, "downloadSuffix");
        this.LIZIZ = context;
        this.LIZJ = downloadSuffix;
        this.LIZLLL = i;
        this.LJ = interfaceC87766YcU;
    }
}
