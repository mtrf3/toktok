package X;

import android.text.TextUtils;

/* renamed from: X.0Zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC09750Zv implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;
    public final /* synthetic */ Object LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        DialogC111064Xm dialogC111064Xm;
        DialogC111064Xm dialogC111064Xm2;
        switch (this.LJLIL) {
            case 0:
                ((AbstractC43481nE) this.LJLILLLLZI).LJIIJ((C19090oz) this.LJLJI, (AbstractC19060ow) this.LJLJJI);
                return;
            default:
                C66I c66i = (C66I) this.LJLILLLLZI;
                C153075zb c153075zb = (C153075zb) this.LJLJI;
                String str = (String) this.LJLJJI;
                C66T c66t = c66i.LIZ.LLILLIZIL;
                if (c66t != null && (dialogC111064Xm = c66t.LJIIIZ) != null && dialogC111064Xm.isShowing() && (dialogC111064Xm2 = c66t.LJIIIZ) != null) {
                    dialogC111064Xm2.dismiss();
                }
                if (c153075zb != null && !TextUtils.isEmpty(str)) {
                    c153075zb.LJLJI.setPin(true);
                }
                C1548265u c1548265u = c66i.LIZ.LJLJI;
                if (c1548265u != null) {
                    c1548265u.LJLJLJ.LJIILJJIL(c153075zb);
                }
                C66F c66f = c66i.LIZ.LLIIZ;
                if (c66f != null) {
                    c66f.LIZJ();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC09750Zv(int i, Object obj, Object obj2, Object obj3) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
        this.LJLJJI = obj3;
    }
}
