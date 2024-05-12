package X;

import android.os.Trace;
import android.util.Printer;

/* loaded from: classes9.dex */
public class ILZ implements Printer {
    public final /* synthetic */ ILX LJLIL;

    public ILZ(ILX ilx) {
        this.LJLIL = ilx;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (this.LJLIL.LJFF) {
            if (str.charAt(0) == '>') {
                if (str.startsWith(">>>>> Dispatching to Handler (com.bytedance.io.prefetcher.doframe.DoFrameController$ProxyFrameHandler)") || str.startsWith(">>>>> Dispatching to Handler (android.view.Choreographer$FrameHandler)")) {
                    this.LJLIL.LJIILJJIL = 0L;
                } else {
                    if (C35810E3q.LJIIIIZZ()) {
                        if (str.length() > 100) {
                            str = str.substring(str.length() - 100);
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("MyPrinter start ");
                        LIZ.append(str);
                        Trace.beginSection(X1D.LIZIZ(LIZ));
                    }
                    this.LJLIL.LJIILJJIL = System.currentTimeMillis();
                }
            } else {
                ILX ilx = this.LJLIL;
                if (ilx.LJIILJJIL > 0) {
                    ilx.LJIILL++;
                    long currentTimeMillis = System.currentTimeMillis();
                    ILX ilx2 = this.LJLIL;
                    long j = currentTimeMillis - ilx2.LJIILJJIL;
                    if (j > 14) {
                        ilx2.LJIILLIIL++;
                    } else if (j > 7) {
                        ilx2.LJIIZILJ++;
                    } else if (j > 2) {
                        ilx2.LJIJ++;
                    }
                    if (C35810E3q.LJIIIIZZ()) {
                        Trace.endSection();
                    }
                }
            }
        }
        Printer printer = this.LJLIL.LJIIIIZZ;
        if (printer != null) {
            printer.println(str);
        }
    }
}
