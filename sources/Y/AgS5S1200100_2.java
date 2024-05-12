package Y;

import X.C10I;
import X.C10K;
import X.C159316Nb;
import X.C42299Git;
import X.C44687HgJ;
import X.C6NX;
import X.C76800UCe;
import X.InterfaceC88475Ynv;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class AgS5S1200100_2 implements C10I {
    public final int $t;
    public long j3;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS5S1200100_2 agS5S1200100_2, C10K c10k) {
        Bitmap bitmap = (Bitmap) c10k.LJIIJJI();
        if (bitmap == null) {
            C159316Nb.LIZ(System.currentTimeMillis() - agS5S1200100_2.j3, ((StickerModel) agS5S1200100_2.l2).getStickerType().name(), "null bitmap", false);
        } else {
            C6NX c6nx = (C6NX) agS5S1200100_2.l1;
            String stickerPath = agS5S1200100_2.s0;
            c6nx.getClass();
            o.LJIIIZ(stickerPath, "stickerPath");
            C44687HgJ.LJFF(stickerPath, true);
            C42299Git.LJFF(bitmap, new File(stickerPath), 100, Bitmap.CompressFormat.PNG);
            C42299Git.LJ(bitmap);
            C159316Nb.LIZ(System.currentTimeMillis() - agS5S1200100_2.j3, ((C6NX) agS5S1200100_2.l1).LIZLLL().name(), "", true);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS5S1200100_2 agS5S1200100_2, C10K c10k) {
        Bitmap bitmap;
        Bitmap bitmap2 = (Bitmap) c10k.LJIIJJI();
        if (bitmap2 == null) {
            C159316Nb.LIZ(System.currentTimeMillis() - agS5S1200100_2.j3, ((StickerModel) agS5S1200100_2.l2).getStickerType().name(), "null bitmap", false);
        } else {
            int intValue = ((C6NX) agS5S1200100_2.l1).LIZIZ.LIZIZ.getFirst().intValue();
            int intValue2 = ((C6NX) agS5S1200100_2.l1).LIZIZ.LIZIZ.getSecond().intValue();
            int i = ((C6NX) agS5S1200100_2.l1).LIZIZ.LJ;
            if (i > 0 && Math.min(intValue, intValue2) < i) {
                if (intValue > intValue2) {
                    intValue = (intValue * i) / intValue2;
                    intValue2 = i;
                } else {
                    intValue2 = (intValue2 * i) / intValue;
                    intValue = i;
                }
            }
            InterfaceC88475Ynv<Bitmap, Integer, Integer, Integer, Integer, Bitmap> interfaceC88475Ynv = ((C6NX) agS5S1200100_2.l1).LIZIZ.LIZJ;
            if (interfaceC88475Ynv == null || (bitmap = interfaceC88475Ynv.invoke(bitmap2, Integer.valueOf(intValue), Integer.valueOf(intValue2), Integer.valueOf(((StickerModel) agS5S1200100_2.l2).getBaseSticker().getMediaWidth()), Integer.valueOf(((StickerModel) agS5S1200100_2.l2).getBaseSticker().getMediaHeight()))) == null) {
                bitmap = bitmap2;
            }
            C6NX c6nx = (C6NX) agS5S1200100_2.l1;
            String stickerPath = agS5S1200100_2.s0;
            c6nx.getClass();
            o.LJIIIZ(stickerPath, "stickerPath");
            C44687HgJ.LJFF(stickerPath, true);
            C42299Git.LJFF(bitmap, new File(stickerPath), 100, Bitmap.CompressFormat.PNG);
            C42299Git.LJ(bitmap);
            C42299Git.LJ(bitmap2);
            C159316Nb.LIZ(System.currentTimeMillis() - agS5S1200100_2.j3, ((C6NX) agS5S1200100_2.l1).LIZLLL().name(), "", true);
        }
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AgS5S1200100_2(long r2, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel r4, X.C6NX r5, java.lang.String r6, int r7) {
        /*
            r1 = this;
            r1.$t = r7
            switch(r7) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r5
            r0.l2 = r4
            r0.s0 = r6
            r0.j3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l1 = r5
            r0.s0 = r6
            r0.j3 = r2
            r0.l2 = r4
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS5S1200100_2.<init>(long, com.ss.android.ugc.aweme.tools.sticker.core.StickerModel, X.6NX, java.lang.String, int):void");
    }
}
