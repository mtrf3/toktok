package X;

import Y.IDRunnableS86S0100000_24;
import android.os.Message;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes29.dex */
public final class ZY1 {
    public final AbstractC90096ZXo LIZ;
    public final int LIZIZ;
    public final ZY4 LIZJ;
    public final ZY4 LIZLLL;
    public final ZY4 LJ;
    public final List<C90092ZXk> LJFF;
    public final WeakReference<C90605ZhB> LJI;
    public C76L<Void> LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public final void LIZ() {
        if (this.LJIIIIZZ || this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        AbstractC90096ZXo abstractC90096ZXo = this.LIZ;
        if (abstractC90096ZXo == null) {
            return;
        }
        abstractC90096ZXo.LJIIIIZZ(0);
        this.LIZ.LJ();
    }

    public final void LIZIZ() {
        C76L<Void> c76l;
        ZY5.LIZIZ();
        if (this.LJIIIIZZ || this.LJIIIZ) {
            return;
        }
        C90605ZhB c90605ZhB = this.LJI.get();
        if (c90605ZhB == null || c90605ZhB.LJJIFFI != this || ((c76l = this.LJII) != null && c76l.isCancelled())) {
            LIZ();
            return;
        }
        this.LJIIIIZZ = true;
        c90605ZhB.LJJIFFI = null;
        C90605ZhB c90605ZhB2 = this.LJI.get();
        if (c90605ZhB2 != null) {
            ZY4 zy4 = c90605ZhB2.LJIILLIIL;
            ZY4 zy42 = this.LIZJ;
            if (zy4 == zy42) {
                HandlerC90105ZXx handlerC90105ZXx = c90605ZhB2.LJIIJ;
                int i = this.LIZIZ;
                Message obtainMessage = handlerC90105ZXx.obtainMessage(263, zy42);
                obtainMessage.arg1 = i;
                obtainMessage.sendToTarget();
                AbstractC90096ZXo abstractC90096ZXo = c90605ZhB2.LJIIZILJ;
                if (abstractC90096ZXo != null) {
                    abstractC90096ZXo.LJIIIIZZ(this.LIZIZ);
                    c90605ZhB2.LJIIZILJ.LJ();
                }
                if (!((HashMap) c90605ZhB2.LJIJJ).isEmpty()) {
                    for (AbstractC90096ZXo abstractC90096ZXo2 : ((HashMap) c90605ZhB2.LJIJJ).values()) {
                        abstractC90096ZXo2.LJIIIIZZ(this.LIZIZ);
                        abstractC90096ZXo2.LJ();
                    }
                    ((HashMap) c90605ZhB2.LJIJJ).clear();
                }
                c90605ZhB2.LJIIZILJ = null;
            }
        }
        C90605ZhB c90605ZhB3 = this.LJI.get();
        if (c90605ZhB3 == null) {
            return;
        }
        ZY4 zy43 = this.LIZLLL;
        c90605ZhB3.LJIILLIIL = zy43;
        c90605ZhB3.LJIIZILJ = this.LIZ;
        ZY4 zy44 = this.LJ;
        if (zy44 == null) {
            HandlerC90105ZXx handlerC90105ZXx2 = c90605ZhB3.LJIIJ;
            C15070iV c15070iV = new C15070iV(this.LIZJ, zy43);
            int i2 = this.LIZIZ;
            Message obtainMessage2 = handlerC90105ZXx2.obtainMessage(262, c15070iV);
            obtainMessage2.arg1 = i2;
            obtainMessage2.sendToTarget();
        } else {
            HandlerC90105ZXx handlerC90105ZXx3 = c90605ZhB3.LJIIJ;
            C15070iV c15070iV2 = new C15070iV(zy44, zy43);
            int i3 = this.LIZIZ;
            Message obtainMessage3 = handlerC90105ZXx3.obtainMessage(264, c15070iV2);
            obtainMessage3.arg1 = i3;
            obtainMessage3.sendToTarget();
        }
        ((HashMap) c90605ZhB3.LJIJJ).clear();
        c90605ZhB3.LJI();
        c90605ZhB3.LJIIJJI();
        List<C90092ZXk> list = this.LJFF;
        if (list == null) {
            return;
        }
        c90605ZhB3.LJIILLIIL.LJIILIIL(list);
    }

    public ZY1(C90605ZhB c90605ZhB, ZY4 zy4, AbstractC90096ZXo abstractC90096ZXo, int i, ZY4 zy42, Collection<C90092ZXk> collection) {
        ArrayList arrayList;
        this.LJI = new WeakReference<>(c90605ZhB);
        this.LIZLLL = zy4;
        this.LIZ = abstractC90096ZXo;
        this.LIZIZ = i;
        this.LIZJ = c90605ZhB.LJIILLIIL;
        this.LJ = zy42;
        if (collection == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(collection);
        }
        this.LJFF = arrayList;
        c90605ZhB.LJIIJ.postDelayed(new IDRunnableS86S0100000_24(this, 39), LivePlayEnforceIntervalSetting.DEFAULT);
    }
}
