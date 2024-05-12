package X;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: X.VeO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80240VeO {
    public float LIZJ;
    public WeakReference<InterfaceC80242VeQ> LJ;
    public C80229VeD LJFF;
    public final TextPaint LIZ = new TextPaint(1);
    public final C80241VeP LIZIZ = new C80241VeP(this);
    public boolean LIZLLL = true;

    public C80240VeO(InterfaceC80242VeQ interfaceC80242VeQ) {
        this.LJ = new WeakReference<>(null);
        this.LJ = new WeakReference<>(interfaceC80242VeQ);
    }

    public final float LIZ(String str) {
        float measureText;
        if (!this.LIZLLL) {
            return this.LIZJ;
        }
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = this.LIZ.measureText((CharSequence) str, 0, str.length());
        }
        this.LIZJ = measureText;
        this.LIZLLL = false;
        return measureText;
    }

    public final void LIZIZ(C80229VeD c80229VeD, Context context) {
        if (this.LJFF != c80229VeD) {
            this.LJFF = c80229VeD;
            if (c80229VeD != null) {
                TextPaint textPaint = this.LIZ;
                C80241VeP c80241VeP = this.LIZIZ;
                c80229VeD.LIZ();
                c80229VeD.LIZLLL(textPaint, c80229VeD.LJIILIIL);
                c80229VeD.LIZIZ(context, new C80231VeF(c80229VeD, textPaint, c80241VeP));
                InterfaceC80242VeQ interfaceC80242VeQ = this.LJ.get();
                if (interfaceC80242VeQ != null) {
                    this.LIZ.drawableState = interfaceC80242VeQ.getState();
                }
                c80229VeD.LIZJ(context, this.LIZ, this.LIZIZ);
                this.LIZLLL = true;
            }
            InterfaceC80242VeQ interfaceC80242VeQ2 = this.LJ.get();
            if (interfaceC80242VeQ2 != null) {
                interfaceC80242VeQ2.LIZ();
                interfaceC80242VeQ2.onStateChange(interfaceC80242VeQ2.getState());
            }
        }
    }
}
