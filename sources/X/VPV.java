package X;

import android.graphics.PointF;
import android.os.Handler;
import android.view.MotionEvent;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import com.lynx.tasm.behavior.ui.UIBody;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes15.dex */
public final class VPV {
    public final VOR LIZ;
    public final VPX LIZIZ;
    public VPY LIZJ;
    public VPY LJ;
    public boolean LJI;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public PointF LJIILIIL;
    public PPO LJIILLIIL;
    public EnumC79647VNr LJII = EnumC79647VNr.Undefined;
    public final LinkedList<VPY> LIZLLL = new LinkedList<>();
    public final LinkedList<VPY> LJFF = new LinkedList<>();
    public PointF LJIIIIZZ = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);
    public float LJIIIZ = V9Y.LIZ(50.0f);
    public final HashSet<Integer> LJIILJJIL = new HashSet<>();
    public boolean LJIILL = false;

    public final VNL LIZLLL() {
        return this.LIZ.LIZJ.LJLJJL;
    }

    public final void LJI() {
        Iterator<VPY> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().offResponseChain();
        }
        this.LIZLLL.clear();
        this.LJFF.clear();
        this.LJIILJJIL.clear();
    }

    public VPV(VOR vor) {
        this.LIZ = vor;
        this.LIZIZ = new VPX(vor.LIZJ, new C79682VPa(this), new Handler(C16880lQ.LLJJJJ()));
    }

    public final boolean LIZ(VPY vpy) {
        if (vpy == null) {
            return false;
        }
        HashSet<Integer> hashSet = this.LJIILJJIL;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        Boolean bool = Boolean.TRUE;
        while (true) {
            if (vpy.parent() != vpy) {
                if (this.LJIILJJIL.contains(Integer.valueOf(vpy.getSign()))) {
                    bool = Boolean.FALSE;
                    break;
                }
                vpy = vpy.parent();
                if (vpy == null) {
                    break;
                }
            } else {
                break;
            }
        }
        return bool.booleanValue();
    }

    public final void LIZIZ(int i) {
        if (LIZLLL() == null) {
            return;
        }
        Iterator<VPY> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            VPY next = it.next();
            if (this.LJIILL) {
                LIZLLL().LIZ(next.getSign(), next.getPseudoStatus(), next.getPseudoStatus() & (~i));
            }
            next.onPseudoStatusChanged(next.getPseudoStatus(), next.getPseudoStatus() & (~i));
        }
    }

    public final boolean LJFF(boolean z) {
        UIBody uIBody = this.LIZ.LIZIZ;
        if (uIBody == null || uIBody.mView.getParent() == null) {
            LLog.LIZLLL(4, "LynxTouchEventDispatcher", "requestNativeDisallowIntercept failed, root ui or root ui'parent is null.");
            return false;
        }
        this.LIZ.LIZIZ.mView.getParent().requestDisallowInterceptTouchEvent(z);
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0213, code lost:
    
        if (r11.LJFF.getLast().getEvents() == null) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0225, code lost:
    
        if (r11.LJFF.getLast().getEvents().containsKey("click") != false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022d, code lost:
    
        r1 = r11.LJFF.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0237, code lost:
    
        if (r1.hasNext() == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0239, code lost:
    
        r1.next().onResponseChain();
     */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0066, code lost:
    
        LIZJ(r11.LIZJ, "touchstart", r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0249, code lost:
    
        if (r11.LJFF.isEmpty() == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x024b, code lost:
    
        r11.LJIIL = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024f, code lost:
    
        r11.LJIIL = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0227, code lost:
    
        r11.LJFF.removeLast();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        if (LIZLLL() != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0361, code lost:
    
        if (r7 != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b9, code lost:
    
        r1 = r11.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01bb, code lost:
    
        if (r1 == null) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bd, code lost:
    
        r11.LIZLLL.push(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c6, code lost:
    
        if (r1.enableTouchPseudoPropagation() != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01ee, code lost:
    
        r1 = r1.parent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c8, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cf, code lost:
    
        if (r8 >= r11.LIZLLL.size()) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01d1, code lost:
    
        r7 = r11.LIZLLL.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01db, code lost:
    
        if (r11.LJIILL == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01dd, code lost:
    
        LIZLLL().LIZ(r7.getSign(), 0, 8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01e8, code lost:
    
        r7.onPseudoStatusChanged(0, 8);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f5, code lost:
    
        r11.LJFF.push(r7);
        r7 = r7.parent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f3, code lost:
    
        if (r7 == null) goto L228;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0205, code lost:
    
        if (r11.LJFF.isEmpty() != false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0064, code lost:
    
        if (r7 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(android.view.MotionEvent r12, com.lynx.tasm.behavior.ui.UIGroup r13) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VPV.LJ(android.view.MotionEvent, com.lynx.tasm.behavior.ui.UIGroup):boolean");
    }

    public final void LIZJ(VPY vpy, String str, MotionEvent motionEvent) {
        VPY vpy2 = this.LIZJ;
        PPO ppo = new PPO(motionEvent.getX(), motionEvent.getY());
        if (vpy2 instanceof LynxBaseUI) {
            ppo = ppo.LIZ(this.LIZ.LIZIZ.getBoundingClientRect(), ((LynxBaseUI) vpy2).getBoundingClientRect());
        }
        this.LJIILLIIL = ppo;
        if (vpy.dispatchEvent(new C40154FpO(str, null))) {
            return;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (LIZLLL() != null) {
            VPY vpy3 = this.LIZJ;
            if (vpy3 != null && vpy3.eventThrough()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("do not sendTouchEvent since mActiveUI.eventThrough == true, which sign is: ");
                LIZ.append(this.LIZJ.getSign());
                LLog.LIZLLL(2, "LynxTouchEventDispatcher", X1D.LIZIZ(LIZ));
                return;
            }
            PPO ppo2 = new PPO(x, y);
            LIZLLL().LIZJ(new VNM(vpy.getSign(), str, ppo2, ppo2, this.LJIILLIIL));
            return;
        }
        LLog.LIZLLL(2, "LynxTouchEventDispatcher", "sendTouchEvent: eventEmitter null");
    }
}
