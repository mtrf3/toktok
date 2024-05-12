package X;

import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.lynx.tasm.behavior.ui.view.UIComponent;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.VUo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79826VUo implements VV1 {
    public final VNL LIZ;
    public final Handler LIZIZ;
    public RunnableC79825VUn LIZJ;
    public LinkedList<C79827VUp> LIZLLL;
    public LinkedList<C79827VUp> LJ;
    public boolean LJFF;

    @Override // X.VV1
    public final void LIZIZ() {
    }

    public final void LJFF() {
        if (this.LIZJ != null) {
            return;
        }
        RunnableC79825VUn runnableC79825VUn = new RunnableC79825VUn(this);
        this.LIZJ = runnableC79825VUn;
        this.LIZIZ.postDelayed(runnableC79825VUn, 50);
    }

    public C79826VUo(VNL vnl) {
        this.LIZ = vnl;
        Handler handler = new Handler(C16880lQ.LLJJJJ());
        this.LIZIZ = handler;
        this.LJ = new LinkedList<>();
        this.LIZLLL = new LinkedList<>();
        RunnableC79825VUn runnableC79825VUn = new RunnableC79825VUn(this);
        this.LIZJ = runnableC79825VUn;
        handler.postDelayed(runnableC79825VUn, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
    }

    @Override // X.VV1
    public final void LIZ(C79831VUt c79831VUt) {
        this.LJ.push(new C79827VUp(c79831VUt, "nodedisappear"));
        LJFF();
    }

    @Override // X.VV1
    public final void LIZJ(C79831VUt c79831VUt) {
        UIComponent uIComponent;
        Iterator<C79827VUp> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            C79827VUp next = it.next();
            if (next.LIZ == c79831VUt && (uIComponent = c79831VUt.LJLIL.LJLILLLLZI) != null) {
                next.LIZLLL = uIComponent.LJLIL;
            }
        }
        Iterator<C79827VUp> it2 = this.LJ.iterator();
        while (it2.hasNext()) {
            C79827VUp next2 = it2.next();
            if (next2.LIZ == c79831VUt) {
                next2.LIZLLL = c79831VUt.LJLIL.LJLILLLLZI.LJLIL;
            }
        }
    }

    @Override // X.VV1
    public final void LIZLLL(C79831VUt c79831VUt) {
        this.LJ.push(new C79827VUp(c79831VUt, "nodeappear"));
        LJFF();
    }

    public final boolean LJI(C79827VUp c79827VUp) {
        if (c79827VUp == null) {
            return false;
        }
        if (c79827VUp.LIZ.LJLIL.LJLILLLLZI == null) {
            if (!this.LJFF) {
                return false;
            }
            return "nodedisappear".equals(c79827VUp.LIZIZ);
        }
        if (c79827VUp.LIZIZ == null) {
            return false;
        }
        return true;
    }

    public final boolean LJ(C79827VUp c79827VUp, C79827VUp c79827VUp2) {
        if (this.LJFF && !TextUtils.isEmpty(c79827VUp.LIZIZ) && !c79827VUp.LIZIZ.equals(c79827VUp2.LIZIZ)) {
            return false;
        }
        String str = c79827VUp.LIZLLL;
        if (str != null || c79827VUp2.LIZLLL != null) {
            return TextUtils.equals(str, c79827VUp2.LIZLLL);
        }
        if (c79827VUp.LIZJ != c79827VUp2.LIZJ) {
            return false;
        }
        return true;
    }
}
