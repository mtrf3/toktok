package X;

import com.ss.android.ugc.aweme.services.watermark.WaterMarkBuilder;
import com.ss.android.ugc.aweme.services.watermark.WaterMarkListener;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hcu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class CallableC44476Hcu<V> implements Callable {
    public final /* synthetic */ C44488Hd6 LJLIL;
    public final /* synthetic */ WaterMarkBuilder LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    public CallableC44476Hcu(C44488Hd6 c44488Hd6, WaterMarkBuilder waterMarkBuilder, boolean z, boolean z2) {
        this.LJLIL = c44488Hd6;
        this.LJLILLLLZI = waterMarkBuilder;
        this.LJLJI = z;
        this.LJLJJI = z2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C44488Hd6 c44488Hd6 = this.LJLIL;
        if (c44488Hd6.LIZJ == null) {
            H78.LIZLLL("WaterMarkComposer", new Throwable("context is null"));
            WaterMarkListener waterMarkListener = this.LJLILLLLZI.listener;
            if (waterMarkListener != null) {
                waterMarkListener.onError(-1);
                return null;
            }
            return null;
        }
        c44488Hd6.LJ = System.currentTimeMillis();
        int width = this.LJLILLLLZI.video.getWidth();
        int height = this.LJLILLLLZI.video.getHeight();
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(width));
        arrayList.add(Integer.valueOf(height));
        InterfaceC43114Gw2 LIZJ = C60903NvH.LJIIJJI().LIZJ();
        WaterMarkBuilder waterMarkBuilder = this.LJLILLLLZI;
        String str = waterMarkBuilder.inputPath;
        InterfaceC45930I0w interfaceC45930I0w = waterMarkBuilder.author;
        o.LJIIIIZZ(interfaceC45930I0w, "markBuilder.author");
        LIZJ.LIZJ(arrayList, str, interfaceC45930I0w, new C44478Hcw(this.LJLIL, this.LJLJI, this.LJLJJI, width, height, this.LJLILLLLZI, arrayList), new AqS173S0100000_7(this.LJLILLLLZI, 318));
        return null;
    }
}
