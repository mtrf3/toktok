package X;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS12S0010000_7;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.AqS7S0111000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hq2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45290Hq2 extends AbstractC48231ut<InterfaceC45213Hon, C45668Hw8, C45296Hq8, C45669Hw9> implements InterfaceC45213Hon, C0IA, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LL;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC65784Pro<C45296Hq8> LJLLILLLL;
    public final InterfaceC65784Pro<C45669Hw9> LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C5H3 LJLLLL;
    public C45205Hof LJLLLLLL;
    public String LJLZ;
    public String LJZ;
    public String LJZI;
    public int LJZL;

    static {
        TBT tbt = new TBT(C45290Hq2.class, "autoCutComponent", "getAutoCutComponent()Lcom/ss/android/ugc/aweme/autocut/AutoCutApi;", 0);
        C65352Pkq.LIZ.getClass();
        LL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC45213Hon
    public void LLLZIL() {
        List LJJIJIIJI = C47261Igj.LJJIJIIJI(this.LJLZ, this.LJZ, this.LJZI);
        this.LJLZ = null;
        this.LJZ = null;
        this.LJZI = null;
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C63212dx(LJJIJIIJI, null), 3);
    }

    private final InterfaceC44718Hgo LLF() {
        return (InterfaceC44718Hgo) this.LJLLL.LIZ(this, LL[0]);
    }

    private final C5HC LLIFFJFJJ() {
        return (C5HC) this.LJLLLL.getValue();
    }

    @Override // X.InterfaceC45213Hon
    public void CG() {
        LJJZZI(C45291Hq3.LJLIL);
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLL);
        if (LIZIZ != null) {
            LIZIZ.unRegisterActivityOnKeyDownListener(LLIFFJFJJ());
        }
    }

    public final void r80() {
        InterfaceC44718Hgo LLF = LLF();
        if (LLF != null) {
            LLF.r80();
        }
    }

    public final void retry() {
        InterfaceC44718Hgo LLF = LLF();
        if (LLF != null) {
            LLF.retry();
        }
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(this.LJLL);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListenerHead(LLIFFJFJJ());
        }
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C45296Hq8> LJJLIIIJJI() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C45669Hw9> LJJLIIIJJIZ() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    private final String LLIIIL(CreativeInfo creativeInfo) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C45087Hml.LJIIIIZZ(creativeInfo));
        LIZ.append("tempCoverDir_");
        LIZ.append(System.currentTimeMillis());
        LIZ.append('_');
        String LIZ2 = C08380Uo.LIZ(LIZ, this.LJZL, ".png", LIZ);
        this.LJZL++;
        return LIZ2;
    }

    private final void LLIILZL(C45205Hof c45205Hof) {
        if (c45205Hof.LIZ.LJII.isEmpty()) {
            return;
        }
        String str = c45205Hof.LIZLLL;
        android.net.Uri LJIIIIZZ = C44694HgQ.LJIIIIZZ(str);
        if (c45205Hof.LIZ.LJII.size() == 1) {
            String str2 = this.LJZ;
            if (str2 != null) {
                android.net.Uri LJIIIIZZ2 = C44694HgQ.LJIIIIZZ(str2);
                Ky(LJIIIIZZ2, LJIIIIZZ2);
                return;
            } else if (C78685UuP.LJJJZ(str) && C44694HgQ.LJIL(str)) {
                Ky(LJIIIIZZ, LJIIIIZZ);
                return;
            } else {
                LLFFF((AutoCutMediaModel) ListProtector.get(c45205Hof.LIZ.LJII, 0), new AqS189S0100000_7(this, 5));
                return;
            }
        }
        String str3 = this.LJZ;
        if (str3 != null) {
            Ky(C44694HgQ.LJIIIIZZ(str3), null);
        } else if (C78685UuP.LJJJZ(str) && C44694HgQ.LJIL(str)) {
            Ky(LJIIIIZZ, null);
        } else {
            LLFFF((AutoCutMediaModel) ListProtector.get(c45205Hof.LIZ.LJII, 0), new AqS189S0100000_7(this, 6));
        }
        String str4 = this.LJZI;
        if (str4 != null) {
            Ky(null, C44694HgQ.LJIIIIZZ(str4));
        } else {
            LLFFF((AutoCutMediaModel) ListProtector.get(c45205Hof.LIZ.LJII, 1), new AqS189S0100000_7(this, 7));
        }
    }

    private final void LLIIZ(C45205Hof c45205Hof) {
        String str = this.LJLZ;
        if (str != null) {
            xr0(C44694HgQ.LJIIIIZZ(str));
            return;
        }
        String str2 = c45205Hof.LIZLLL;
        if (C78685UuP.LJJJZ(str2) && C44694HgQ.LJIL(str2)) {
            xr0(C44694HgQ.LJIIIIZZ(str2));
        } else {
            if (c45205Hof.LIZ.LJII.isEmpty()) {
                return;
            }
            HKU.LIZJ((AutoCutMediaModel) ListProtector.get(c45205Hof.LIZ.LJII, 0), LLIIIL(c45205Hof.LIZ.LJIIL), new AqS173S0100000_7(this, 44));
        }
    }

    public final String LJLZ(int i) {
        Resources resources;
        String string;
        Context sceneContext = this.LJLL.getSceneContext();
        if (sceneContext != null && (resources = sceneContext.getResources()) != null && (string = resources.getString(R.string.e1r)) != null) {
            return Q8U.LIZIZ(new Object[]{Integer.valueOf(i)}, 1, string, "format(format, *args)");
        }
        return null;
    }

    public final String LJZI(EnumC45211Hol enumC45211Hol) {
        Resources resources;
        int LIZ = C45217Hor.LIZ(enumC45211Hol);
        Context sceneContext = this.LJLL.getSceneContext();
        if (sceneContext != null && (resources = sceneContext.getResources()) != null) {
            return resources.getString(LIZ);
        }
        return null;
    }

    @Override // X.InterfaceC45213Hon
    public void Sr0(C45205Hof config) {
        o.LJIIIZ(config, "config");
        this.LJLLLLLL = config;
        show();
        U7(C63081OpJ.LJJJJLI(C5L7.LIZ()));
        LLIIZ(config);
        LLIILZL(config);
    }

    @Override // X.InterfaceC45213Hon
    public void U7(int i) {
        LJJZZI(new AqS31S0001000_7(i, 1));
    }

    @Override // X.InterfaceC45213Hon
    public void gS(EnumC45211Hol status) {
        o.LJIIIZ(status, "status");
        LJJZZI(new AqS138S0200000_7(this, status, 11));
    }

    @Override // X.InterfaceC45213Hon
    public void lm(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 1));
    }

    @Override // X.InterfaceC45213Hon
    public void xJ(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 3));
    }

    @Override // X.InterfaceC45213Hon
    public void xr0(android.net.Uri uri) {
        LJJZZI(new AqS173S0100000_7(uri, 45));
    }

    @Override // X.InterfaceC45213Hon
    public void zI(boolean z) {
        LJJZZI(new AqS12S0010000_7(z, 2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45290Hq2(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = C45294Hq6.LJLIL;
        this.LJLLJ = new AqS157S0100000_7(this, 62);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC44718Hgo.class, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 61));
    }

    private final void LLFFF(AutoCutMediaModel autoCutMediaModel, InterfaceC88471Ynr<? super String, ? super Boolean, C76800UCe> interfaceC88471Ynr) {
        C45205Hof c45205Hof = this.LJLLLLLL;
        if (c45205Hof != null) {
            HKU.LIZIZ(autoCutMediaModel, LLIIIL(c45205Hof.LIZ.LJIIL), interfaceC88471Ynr);
        }
    }

    @Override // X.InterfaceC45213Hon
    public void Ky(android.net.Uri uri, android.net.Uri uri2) {
        LJJZZI(new AqS138S0200000_7(uri, uri2, 10));
    }

    @Override // X.InterfaceC45213Hon
    public void fU(boolean z, int i) {
        LJJZZI(new AqS7S0111000_7(z, this, i, 0));
    }
}
