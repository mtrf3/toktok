package X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ZXx, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class HandlerC90105ZXx extends Handler {
    public final ArrayList<C90103ZXv> LIZ = new ArrayList<>();
    public final List<ZY4> LIZIZ = new ArrayList();
    public final /* synthetic */ C90605ZhB LIZJ;

    public HandlerC90105ZXx(C90605ZhB c90605ZhB) {
        this.LIZJ = c90605ZhB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd A[Catch: all -> 0x010c, TryCatch #0 {all -> 0x010c, blocks: (B:12:0x00c1, B:13:0x00c9, B:15:0x00cd, B:22:0x00df, B:18:0x00e7, B:25:0x00ef, B:27:0x00f8), top: B:11:0x00c1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef A[SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleMessage(android.os.Message r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC90105ZXx.handleMessage(android.os.Message):void");
    }

    public final void LIZIZ(int i, Object obj) {
        obtainMessage(i, obj).sendToTarget();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(C90103ZXv c90103ZXv, int i, Object obj, int i2) {
        ZY4 zy4;
        ZY4 zy42;
        C90605ZhB c90605ZhB;
        C90509Zfd c90509Zfd;
        ZY5 zy5 = c90103ZXv.LIZ;
        AbstractC90102ZXu abstractC90102ZXu = c90103ZXv.LIZIZ;
        int i3 = 65280 & i;
        if (i3 != 256) {
            if (i3 != 512) {
                return;
            }
            switch (i) {
                case 513:
                    abstractC90102ZXu.LIZ(zy5);
                    return;
                case 514:
                    abstractC90102ZXu.LIZJ(zy5);
                    return;
                case 515:
                    abstractC90102ZXu.LIZIZ(zy5);
                    return;
                default:
                    return;
            }
        }
        if (i == 264 || i == 262) {
            zy4 = (ZY4) ((C15070iV) obj).LIZIZ;
        } else {
            zy4 = (ZY4) obj;
        }
        if (i == 264 || i == 262) {
            zy42 = (ZY4) ((C15070iV) obj).LIZ;
        } else {
            zy42 = null;
        }
        if (zy4 == null) {
            return;
        }
        if ((c90103ZXv.LIZLLL & 2) == 0 && !zy4.LJII(c90103ZXv.LIZJ) && ((c90605ZhB = ZY5.LIZJ) == null || (c90509Zfd = c90605ZhB.LJIILIIL) == null || !c90509Zfd.LIZIZ || !zy4.LIZLLL() || i != 262 || i2 != 3 || zy42 == null || !(true ^ zy42.LIZLLL()))) {
            return;
        }
        switch (i) {
            case 257:
                abstractC90102ZXu.LIZLLL(zy5, zy4);
                return;
            case 258:
                abstractC90102ZXu.LJI(zy5, zy4);
                return;
            case 259:
                abstractC90102ZXu.LJ(zy5, zy4);
                return;
            case 260:
                abstractC90102ZXu.LJIIL(zy4);
                return;
            case 261:
                abstractC90102ZXu.LJFF();
                return;
            case 262:
                abstractC90102ZXu.LJIIIZ(zy5, zy4, i2);
                return;
            case 263:
                abstractC90102ZXu.LJIIJJI(zy5, zy4, i2);
                return;
            case 264:
                abstractC90102ZXu.LJIIIZ(zy5, zy4, i2);
                return;
            default:
                return;
        }
    }
}
