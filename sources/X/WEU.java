package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.concurrent.Callable;

/* loaded from: classes15.dex */
public abstract class WEU {
    public final C81947WEd LIZ;
    public final Context LIZIZ;

    public WEU(C81947WEd c81947WEd) {
        this.LIZ = c81947WEd;
        this.LIZIZ = c81947WEd.getContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (r5 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.WET LIZ(android.widget.ImageView r8) {
        /*
            r7 = this;
            X.WEd r0 = r7.LIZ
            X.WEf r5 = r0.getTransConfig()
            r1 = 2
            int[] r6 = new int[r1]
            r6 = {x008c: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            if (r5 == 0) goto L19
            boolean r0 = r5.LJIILLIIL
            if (r0 != 0) goto L19
            if (r8 == 0) goto L19
            int[] r6 = new int[r1]
            r8.getLocationInWindow(r6)
        L19:
            X.WET r4 = new X.WET
            android.content.Context r0 = r7.LIZIZ
            r3 = 0
            r4.<init>(r0, r3)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_CENTER
            r4.setScaleType(r0)
            r1 = 1
            if (r5 == 0) goto L58
            boolean r0 = r5.LJIILLIIL
            if (r0 == 0) goto L58
            r2 = r6[r3]
            r1 = r6[r1]
            android.content.Context r0 = r7.LIZIZ
            int r0 = X.C63081OpJ.LJJJJLI(r0)
            int r1 = r1 - r0
            r4.LLILZLL = r2
            r4.LLIZ = r1
            r4.LLILZ = r3
            r4.LLILZIL = r3
        L40:
            long r0 = r5.LIZLLL
            r4.setDuration(r0)
        L45:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r1.<init>(r0, r0)
            r4.setLayoutParams(r1)
            X.WEd r0 = r7.LIZ
            X.WEY r0 = r0.getTransListener()
            r4.setOnTransferListener(r0)
            return r4
        L58:
            if (r8 == 0) goto L78
            r3 = r6[r3]
            r2 = r6[r1]
            android.content.Context r0 = r7.LIZIZ
            int r0 = X.C63081OpJ.LJJJJLI(r0)
            int r2 = r2 - r0
            int r1 = r8.getWidth()
            int r0 = r8.getHeight()
            r4.LLILZLL = r3
            r4.LLIZ = r2
            r4.LLILZ = r1
            r4.LLILZIL = r0
        L75:
            if (r5 == 0) goto L45
            goto L40
        L78:
            r2 = r6[r3]
            r1 = r6[r1]
            android.content.Context r0 = r7.LIZIZ
            int r0 = X.C63081OpJ.LJJJJLI(r0)
            int r1 = r1 - r0
            r4.LLILZLL = r2
            r4.LLIZ = r1
            r4.LLILZ = r3
            r4.LLILZIL = r3
            goto L75
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEU.LIZ(android.widget.ImageView):X.WET");
    }

    public final void LIZIZ(final String str, final WET wet, final boolean z) {
        final C81949WEf transConfig = this.LIZ.getTransConfig();
        if (transConfig == null) {
            return;
        }
        final WER LIZ = transConfig.LIZ();
        final WEN wen = (WEN) this;
        C10K.LIZ(new Callable() { // from class: X.WEV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WEU weu = wen;
                WER wer = LIZ;
                String str2 = str;
                WET wet2 = wet;
                boolean z2 = z;
                C81949WEf c81949WEf = transConfig;
                weu.getClass();
                wer.getClass();
                if (C78765Uvh.LJIILIIL(UriProtector.parse(str2))) {
                    C81949WEf transConfig2 = weu.LIZ.getTransConfig();
                    if (transConfig2 == null) {
                        return null;
                    }
                    Drawable LIZ2 = ((C62875Olz) transConfig2.LIZ()).LIZ(str2);
                    if (LIZ2 == null) {
                        wet2.setImageDrawable(transConfig2.LIZIZ(weu.LIZIZ));
                    } else {
                        wet2.setImageDrawable(LIZ2);
                    }
                    if (z2) {
                        wet2.LLILLJJLI = 100;
                        wet2.LLILLIZIL = 1;
                        wet2.LLJ = true;
                        wet2.invalidate();
                        return null;
                    }
                    wet2.LLILLJJLI = 100;
                    wet2.LLILLIZIL = 2;
                    wet2.LLJ = true;
                    wet2.invalidate();
                    return null;
                }
                wet2.setImageDrawable(c81949WEf.LIZIZ(weu.LIZIZ));
                if (z2) {
                    wet2.LLILLJJLI = 100;
                    wet2.LLILLIZIL = 1;
                    wet2.LLJ = true;
                    wet2.invalidate();
                    return null;
                }
                wet2.LLILLJJLI = 100;
                wet2.LLILLIZIL = 2;
                wet2.LLJ = true;
                wet2.invalidate();
                return null;
            }
        });
    }
}
