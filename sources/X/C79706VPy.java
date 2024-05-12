package X;

import android.content.Context;
import com.lynx.tasm.TemplateAssembler;
import com.lynx.tasm.behavior.ui.LynxBaseUI;
import java.lang.ref.WeakReference;

/* renamed from: X.VPy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79706VPy extends C61828OOi {
    public final /* synthetic */ Context LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ V9X LIZJ;

    @Override // X.C61828OOi
    public final void LIZLLL(int i, int i2) {
        WeakReference<LynxBaseUI> weakReference;
        V9X v9x = this.LIZJ;
        v9x.LJLJJL = i;
        v9x.LJLJJLL = i2;
        if (!(this.LIZ instanceof VNU) || (weakReference = v9x.LJLJLLL) == null || weakReference.get() == null) {
            return;
        }
        LynxBaseUI lynxBaseUI = this.LIZJ.LJLJLLL.get();
        if (lynxBaseUI.getEvents() == null || !lynxBaseUI.getEvents().containsKey("bgload")) {
            return;
        }
        C49615Jdb c49615Jdb = new C49615Jdb(lynxBaseUI.getSign(), "bgload");
        c49615Jdb.LIZJ(Integer.valueOf(i2), "height");
        c49615Jdb.LIZJ(Integer.valueOf(i), "width");
        c49615Jdb.LIZJ(this.LIZIZ, "url");
        ((VNU) this.LIZ).LJLJJL.LIZIZ(c49615Jdb);
    }

    public C79706VPy(V9X v9x, VNU vnu, String str) {
        this.LIZJ = v9x;
        this.LIZ = vnu;
        this.LIZIZ = str;
    }

    @Override // X.C61828OOi
    public final void LIZJ(int i, int i2, String str) {
        Context context = this.LIZ;
        if (context instanceof VNU) {
            ((VNU) context).LJIIJ(this.LIZIZ, "image", str);
            WeakReference<LynxBaseUI> weakReference = this.LIZJ.LJLJLLL;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            LynxBaseUI lynxBaseUI = this.LIZJ.LJLJLLL.get();
            if (lynxBaseUI.getEvents() == null || !lynxBaseUI.getEvents().containsKey("bgerror")) {
                return;
            }
            C49615Jdb c49615Jdb = new C49615Jdb(lynxBaseUI.getSign(), "bgerror");
            c49615Jdb.LIZJ(str, "errMsg");
            c49615Jdb.LIZJ(this.LIZIZ, "url");
            c49615Jdb.LIZJ(Integer.valueOf(i), "lynx_categorized_code");
            c49615Jdb.LIZJ(Integer.valueOf(i2), "error_code");
            ((VNU) this.LIZ).LJLJJL.LIZIZ(c49615Jdb);
            VNL vnl = ((VNU) this.LIZ).LJLJJL;
            C61322O4w c61322O4w = new C61322O4w(lynxBaseUI.getSign(), 0);
            TemplateAssembler templateAssembler = vnl.LIZ;
            if (templateAssembler == null) {
                return;
            }
            templateAssembler.LJJIIJ(c61322O4w);
        }
    }
}
