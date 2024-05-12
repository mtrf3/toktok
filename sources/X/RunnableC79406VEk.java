package X;

import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.PaintingContext;

/* renamed from: X.VEk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC79406VEk implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ ReadableMap LJLJI;
    public final /* synthetic */ ReadableArray LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ PaintingContext LJLJJLL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJLL.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79406VEk(PaintingContext paintingContext, int i, String str, ReadableMap readableMap, ReadableArray readableArray, boolean z) {
        this.LJLJJLL = paintingContext;
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = readableMap;
        this.LJLJJI = readableArray;
        this.LJLJJL = z;
    }
}
