package X;

import Y.ARunnableS32S0200000_13;
import android.os.Handler;
import com.bytedance.android.live.PortraitShortTouchPreviewEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOJ {
    public static int LJIIIIZZ;
    public boolean LIZ;
    public List<UOX> LIZIZ;
    public List<UOW> LIZJ;
    public InterfaceC77110UOc LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public DataChannel LJI;
    public final Handler LJII = new Handler(C16880lQ.LLJJJJ());

    public final void LIZLLL() {
        this.LIZ = false;
        LIZJ();
    }

    public final void LIZJ() {
        List<UOW> list;
        UOW uow;
        if (this.LIZJ == null || !(!r0.isEmpty()) || this.LIZLLL == null || !this.LJ || !this.LJFF || this.LIZ || (list = this.LIZJ) == null || !(!list.isEmpty())) {
            return;
        }
        this.LIZ = true;
        List<UOW> list2 = this.LIZJ;
        if (list2 == null || (uow = (UOW) ListProtector.remove(list2, 0)) == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Short touch presenter] Next, id = ");
        LIZ.append(uow.LJLILLLLZI);
        LIZ.append(", operation = ");
        LIZ.append(uow.LJLIL);
        C0NB.LIZIZ("TikTok Live Short Touch", X1D.LIZIZ(LIZ));
        this.LJII.post(new ARunnableS32S0200000_13(this, uow, 75));
    }

    public final void LIZ(UOX uox) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Short touch presenter] Add item, id = ");
        LIZ.append(uox.LIZJ);
        LIZ.append(", name = ");
        C31811Ce7.LJ(LIZ, uox.LIZLLL, LIZ, "TikTok Live Short Touch");
        uox.LIZ.LIZIZ();
        UOY uoy = uox.LIZIZ;
        if (uoy != null) {
            uoy.LIZIZ();
        }
        List<UOX> list = this.LIZIZ;
        if (list != null) {
            ((ArrayList) list).add(uox);
        }
        List<UOW> list2 = this.LIZJ;
        if (list2 != null) {
            ((ArrayList) list2).add(new UOW(UOQ.Add, uox.LIZJ));
        }
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            dataChannel.pv0(PortraitShortTouchPreviewEvent.class);
        }
        LIZJ();
    }

    public final UOX LIZIZ(UOS identify, String value) {
        List<UOX> list;
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        int i = UOR.LIZ[identify.ordinal()];
        UOX uox = null;
        if (i != 1) {
            if (i != 2 || (list = this.LIZIZ) == null) {
                return null;
            }
            Iterator<UOX> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                UOX next = it.next();
                if (o.LJ(next.LIZLLL, value)) {
                    uox = next;
                    break;
                }
            }
            return uox;
        }
        List<UOX> list2 = this.LIZIZ;
        if (list2 == null) {
            return null;
        }
        Iterator<UOX> it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            UOX next2 = it2.next();
            if (o.LJ(next2.LIZJ, value)) {
                uox = next2;
                break;
            }
        }
        return uox;
    }

    public final void LJ(UOS identify, String value) {
        Iterator it;
        o.LJIIIZ(identify, "identify");
        o.LJIIIZ(value, "value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Short touch presenter] Remove item, identify = ");
        LIZ.append(identify);
        LIZ.append(", value = ");
        LIZ.append(value);
        C0NB.LIZIZ("TikTok Live Short Touch", X1D.LIZIZ(LIZ));
        UOX LIZIZ = LIZIZ(identify, value);
        if (LIZIZ == null) {
            return;
        }
        List<UOW> list = this.LIZJ;
        if (list != null && (it = ((ArrayList) list).iterator()) != null) {
            while (it.hasNext()) {
                UOW uow = (UOW) it.next();
                if (uow.LJLIL == UOQ.Add && o.LJ(uow.LJLILLLLZI, LIZIZ.LIZJ)) {
                    it.remove();
                    LIZIZ.LIZ.LLLLZLL();
                    UOY uoy = LIZIZ.LIZIZ;
                    if (uoy != null) {
                        uoy.LLLLZLL();
                    }
                    List<UOX> list2 = this.LIZIZ;
                    if (list2 != null) {
                        ((ArrayList) list2).remove(LIZIZ);
                        return;
                    }
                    return;
                }
            }
        }
        List<UOW> list3 = this.LIZJ;
        if (list3 != null) {
            ((ArrayList) list3).add(new UOW(UOQ.Remove, LIZIZ.LIZJ));
        }
        DataChannel dataChannel = this.LJI;
        if (dataChannel != null) {
            dataChannel.pv0(PortraitShortTouchPreviewEvent.class);
        }
        LIZJ();
    }
}
