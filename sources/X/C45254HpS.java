package X;

import Y.IDCListenerS283S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HpS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45254HpS implements InterfaceC45227Hp1 {
    public final Activity LIZ;
    public final C45205Hof LIZIZ;
    public final C44630HfO LIZJ;
    public final C45255HpT LIZLLL;
    public TuxSheet LJ;
    public int LJFF;
    public String LJI;

    @Override // X.InterfaceC45209Hoj
    public final void LIZ(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJ(String str, String str2, int i, int i2, String str3, String str4) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJII() {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIIZZ(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIZ(EnumC45211Hol status) {
        o.LJIIIZ(status, "status");
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJ(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIL(int i, int i2, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILIIL(int i, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIJ(int i) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIJI(int i, String str) {
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJI() {
        if (this.LIZ.isFinishing()) {
            return;
        }
        C45255HpT c45255HpT = this.LIZLLL;
        C45256HpU config = this.LIZIZ.LIZIZ;
        c45255HpT.getClass();
        o.LJIIIZ(config, "config");
        c45255HpT.LJLILLLLZI = (TuxTextView) c45255HpT.LJLIL.findViewById(R.id.i5d);
        c45255HpT.LJLJI = (TuxTextView) c45255HpT.LJLIL.findViewById(R.id.e5v);
        c45255HpT.LJLJJI = (TuxIconView) c45255HpT.LJLIL.findViewById(R.id.d12);
        c45255HpT.LJLJJL = (W5G) c45255HpT.LJLIL.findViewById(R.id.ggl);
        c45255HpT.LJLJJLL = (TuxIconView) c45255HpT.LJLIL.findViewById(R.id.g8l);
        c45255HpT.LJLJL = (TuxTextView) c45255HpT.LJLIL.findViewById(R.id.ib2);
        c45255HpT.LJLJLJ = (TuxIconView) c45255HpT.LJLIL.findViewById(R.id.izm);
        c45255HpT.LJLJLLL = (ImageView) c45255HpT.LJLIL.findViewById(R.id.cover);
        Context context = c45255HpT.getContext();
        o.LJIIIIZZ(context, "context");
        Integer LJI = C79045V0n.LJI(config.LJLILLLLZI, context);
        if (LJI != null) {
            int intValue = LJI.intValue();
            TuxTextView tuxTextView = c45255HpT.LJLILLLLZI;
            if (tuxTextView != null) {
                tuxTextView.setTextColor(intValue);
            }
        }
        Context context2 = c45255HpT.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI2 = C79045V0n.LJI(config.LJLJI, context2);
        if (LJI2 != null) {
            int intValue2 = LJI2.intValue();
            TuxTextView tuxTextView2 = c45255HpT.LJLJI;
            if (tuxTextView2 != null) {
                tuxTextView2.setTextColor(intValue2);
            }
        }
        Context context3 = c45255HpT.getContext();
        o.LJIIIIZZ(context3, "context");
        Integer LJI3 = C79045V0n.LJI(config.LJLJJI, context3);
        if (LJI3 != null) {
            int intValue3 = LJI3.intValue();
            TuxIconView tuxIconView = c45255HpT.LJLJJI;
            if (tuxIconView != null) {
                tuxIconView.setTintColor(intValue3);
            }
        }
        Context context4 = c45255HpT.getContext();
        o.LJIIIIZZ(context4, "context");
        Integer LJI4 = C79045V0n.LJI(config.LJLJJL, context4);
        if (LJI4 != null) {
            int intValue4 = LJI4.intValue();
            TuxIconView tuxIconView2 = c45255HpT.LJLJLJ;
            if (tuxIconView2 != null) {
                tuxIconView2.setTintColor(intValue4);
            }
        }
        c45255HpT.LJLL = config.LJLJJLL;
        c45255HpT.LIZ(true);
        LJIJJ();
        ASL asl = new ASL();
        asl.LIZ(this.LIZLLL);
        asl.LJI(0);
        asl.LIZ.LJLLJ = true;
        Integer LJI5 = C79045V0n.LJI(this.LIZIZ.LIZIZ.LJLIL, this.LIZ);
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLJL = LJI5;
        tuxSheet.LJLJI = false;
        tuxSheet.LL = true;
        tuxSheet.LLD = false;
        tuxSheet.LJLIL = new IDCListenerS283S0100000_7(this, 7);
        this.LJ = tuxSheet;
        Activity activity = this.LIZ;
        o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        C1DG.LJII((ActivityC45651qj) activity, "activity as FragmentActi…y).supportFragmentManager", tuxSheet, "AutoCutLoadingPopView");
        if (this.LIZJ != null) {
            this.LIZLLL.setExitListener(new AqS157S0100000_7(this, 559));
            this.LIZLLL.setRetryListener(new AqS157S0100000_7(this, 560));
        }
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILLIIL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 562));
    }

    public final void LJIJJ() {
        if (C44694HgQ.LJIL(this.LIZIZ.LIZLLL)) {
            String str = this.LIZIZ.LIZLLL;
            if (C78685UuP.LJJJZ(str) && C44687HgJ.LIZIZ(str)) {
                this.LIZLLL.setMediaCover(C44694HgQ.LJIIIIZZ(this.LIZIZ.LIZLLL));
                return;
            }
        }
        String str2 = this.LJI;
        if (C78685UuP.LJJJZ(str2) && C44687HgJ.LIZIZ(str2)) {
            this.LIZLLL.setMediaCover(C44694HgQ.LJIIIIZZ(this.LJI));
            return;
        }
        this.LIZLLL.setMediaCover(null);
        AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) ORZ.LJLLLL(this.LIZIZ.LIZ.LJII);
        if (autoCutMediaModel == null) {
            return;
        }
        CreativeInfo creativeInfo = this.LIZIZ.LIZ.LJIIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C45087Hml.LJIIIIZZ(creativeInfo));
        LIZ.append("tempCoverDir_");
        LIZ.append(System.currentTimeMillis());
        LIZ.append('_');
        String LIZ2 = C08380Uo.LIZ(LIZ, this.LJFF, ".png", LIZ);
        this.LJFF++;
        HKU.LIZIZ(autoCutMediaModel, LIZ2, new AqS189S0100000_7(this, 71));
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJJJLL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 558));
    }

    @Override // X.InterfaceC45227Hp1
    public final void LLLZIL() {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C66612jR(this, null), 3);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm result) {
        o.LJIIIZ(result, "result");
        C6QQ.LIZ(new AqS157S0100000_7(this, 561));
    }

    @Override // X.InterfaceC45209Hoj
    public final void onProgress(int i) {
        if (i == 100) {
            return;
        }
        C6QQ.LIZ(new AqS107S0101000_7(this, i, 9));
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List musicList) {
        o.LJIIIZ(musicList, "musicList");
        o.LJIIIZ(taskId, "taskId");
    }

    public C45254HpS(Activity activity, C45205Hof config, C44630HfO c44630HfO) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(config, "config");
        this.LIZ = activity;
        this.LIZIZ = config;
        this.LIZJ = c44630HfO;
        this.LIZLLL = new C45255HpT(activity);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILL(int i, Integer num, String str, EnumC45211Hol errStatus) {
        o.LJIIIZ(errStatus, "errStatus");
        C6QQ.LIZ(new AqS154S0200000_7(this, errStatus, 108));
    }
}
