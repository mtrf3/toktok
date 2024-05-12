package X;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.IDqS192S0200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C167506hm extends AbstractC48231ut<InterfaceC168456jJ, C167536hp, C167576ht, C167636hz> implements InterfaceC168456jJ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public C167536hp LJLLJ;
    public final InterfaceC65784Pro<C167536hp> LJLLL;
    public final InterfaceC65784Pro<C167576ht> LJLLLL;
    public final InterfaceC65784Pro<C167636hz> LJLLLLLL;

    static {
        TBT tbt = new TBT(C167506hm.class, "pageContainerApi", "getPageContainerApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/nontabstyle/AudioEditNonTabStyleUIComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C167506hm.class, "veApiComponent", "getVeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VoiceChangeApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC168456jJ
    public void LLJJJJJIL() {
    }

    private final C168416jF LJLZ() {
        return (C168416jF) this.LJLLI.LIZ(this, LJLZ[0]);
    }

    private final InterfaceC166716gV LJZI() {
        return (InterfaceC166716gV) this.LJLLILLLL.LIZ(this, LJLZ[1]);
    }

    @Override // X.InterfaceC168456jJ
    public void Bg() {
        C167736i9 LJI;
        C167536hp c167536hp = this.LJLLJ;
        if (c167536hp != null) {
            int LIZ = c167536hp.LLJILJILJ().LIZ();
            if (LIZ != -1 && (LJI = c167536hp.LLJILJILJ().LJI(LIZ)) != null && !LJI.LIZJ) {
                c167536hp.LJLJJL = true;
                ((InterfaceC150015uf) c167536hp.LJLLLLLL.getValue()).LIZ(LIZ, LJI);
                return;
            }
            return;
        }
        o.LJIJI("veNonTabScene");
        throw null;
    }

    @Override // X.InterfaceC168456jJ
    public boolean LJJJLZIJ() {
        C167536hp c167536hp = this.LJLLJ;
        if (c167536hp != null) {
            AbstractC167696i5 abstractC167696i5 = c167536hp.LLJILJILJ().LIZIZ;
            if (abstractC167696i5 != null && abstractC167696i5.LJLJL != abstractC167696i5.LJLJJLL) {
                return true;
            }
            return false;
        }
        o.LJIJI("veNonTabScene");
        throw null;
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        C167536hp c167536hp = this.LJLLJ;
        if (c167536hp != null) {
            WMH wmh = (WMH) c167536hp.mParentScene;
            if (wmh != null) {
                wmh.hide(c167536hp);
                return;
            }
            return;
        }
        o.LJIJI("veNonTabScene");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        NLEModel nLEModel;
        FrameLayout frameLayout;
        GradientDrawable.Orientation orientation;
        NLEEditor nLEEditor;
        Effect effect;
        C122034qd LJJI;
        super.show();
        C167536hp c167536hp = this.LJLLJ;
        com.ss.ugc.effectplatform.model.Effect effect2 = null;
        Object[] objArr = 0;
        if (c167536hp != null) {
            InterfaceC153045zY value = c167536hp.getEditPreviewApi().Kh().getValue();
            c167536hp.LJLJL = value;
            if (value != null) {
                nLEModel = C17N.LJJ(value);
            } else {
                nLEModel = null;
            }
            C166636gN.LIZ(nLEModel);
            Activity activity = c167536hp.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FrameLayout frameLayout2 = c167536hp.LJLJLLL;
            if (frameLayout2 != null) {
                int i = 1;
                if (c167536hp.LJLJI) {
                    c167536hp.getUiActions().LIZ.invoke(C149965ua.LIZ(c167536hp.LLJJI(), null));
                    Effect LLJJIJI = c167536hp.LLJJIJI();
                    if (LLJJIJI == null) {
                        c167536hp.LLJILJILJ().LJIIIIZZ();
                    } else {
                        c167536hp.LLJILJILJ().LJIILIIL(LLJJIJI);
                        c167536hp.LLJILJILJ().LJIIJJI();
                    }
                    AbstractC167696i5 abstractC167696i5 = c167536hp.LLJILJILJ().LIZIZ;
                    if (abstractC167696i5 != null) {
                        abstractC167696i5.LJLJL = abstractC167696i5.LJLJJLL;
                    }
                    if (!c167536hp.LJLJJI) {
                        C150145us LIZ = C149965ua.LIZ(c167536hp.LLJJI(), null);
                        Effect LLJJIJI2 = c167536hp.LLJJIJI();
                        C167676i3 LLJILJILJ = c167536hp.LLJILJILJ();
                        IDqS192S0200000_2 iDqS192S0200000_2 = new IDqS192S0200000_2(c167536hp, LIZ, 1);
                        LLJILJILJ.getClass();
                        LLJILJILJ.LJIIL(true, new C150185uw(LLJILJILJ, LIZ, LLJJIJI2, iDqS192S0200000_2));
                    }
                } else {
                    c167536hp.LJLJI = true;
                    frameLayout2.addView(C149975ub.LIZ(c167536hp.LLJILJILJ(), activity, null, 6), -1, -1);
                    WM7 wm7 = c167536hp.mParentScene;
                    if (wm7 != null) {
                        frameLayout = (FrameLayout) wm7.requireViewById(R.id.fnt);
                    } else {
                        frameLayout = null;
                    }
                    c167536hp.LJLJLJ = new C81589W0j(frameLayout);
                    View view = new View(activity);
                    frameLayout2.addView(view, (int) KL2.LIZJ(activity, 16.0f), -1);
                    int[] iArr = {C04330Ez.LIZIZ(activity, R.color.b5), 0};
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(iArr);
                    gradientDrawable.setGradientType(0);
                    if (C173636rf.LIZIZ(activity)) {
                        orientation = GradientDrawable.Orientation.RIGHT_LEFT;
                    } else {
                        orientation = GradientDrawable.Orientation.LEFT_RIGHT;
                    }
                    gradientDrawable.setOrientation(orientation);
                    view.setBackground(gradientDrawable);
                    c167536hp.LLJJ().LIZIZ(activity, new AqS152S0100000_2(c167536hp, 161));
                    c167536hp.LLJILJILJ().LJFF(new C167716i7());
                    c167536hp.LLJILJILJ().LJIIJ((InterfaceC150015uf) c167536hp.LJLLLLLL.getValue());
                    C150145us LIZ2 = C149965ua.LIZ(c167536hp.LLJJI(), null);
                    Effect LLJJIJI3 = c167536hp.LLJJIJI();
                    C167676i3 LLJILJILJ2 = c167536hp.LLJILJILJ();
                    IDqS192S0200000_2 iDqS192S0200000_22 = new IDqS192S0200000_2(c167536hp, LIZ2, 1);
                    LLJILJILJ2.getClass();
                    LLJILJILJ2.LJIIL(true, new C150185uw(LLJILJILJ2, LIZ2, LLJJIJI3, iDqS192S0200000_22));
                }
                NLEModel nleModel = ((NLEEditor) c167536hp.LJLLLL.getValue()).LJ();
                o.LJIIIIZZ(nleModel, "nleModel");
                c167536hp.LJLZ = C122424rG.LIZ(nleModel);
                final ArrayList arrayList = new ArrayList();
                Effect effect3 = new Effect(effect2, i, objArr == true ? 1 : 0);
                Iterator<? extends NLEModel> it = c167536hp.LJLZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C166116fX(null, it.next(), effect3));
                }
                if (C166636gN.LIZIZ()) {
                    c167536hp.LLJJIII().te((C166246fk) C165346eI.LIZ.getValue());
                    c167536hp.LLJJIII().Ur(arrayList, new InterfaceC165816f3() { // from class: X.6hy
                        @Override // X.InterfaceC165816f3
                        public final void onFailed() {
                        }

                        @Override // X.InterfaceC165816f3
                        public final void onStart() {
                        }

                        @Override // X.InterfaceC165816f3
                        public final void onSuccess() {
                        }
                    });
                }
                C5MG WS = c167536hp.getEditPreviewApi().WS();
                if (WS != null && (LJJI = C17N.LJJI(WS.LJIJ())) != null) {
                    nLEEditor = LJJI.LJIIJ;
                } else {
                    nLEEditor = null;
                }
                C167736i9 LJI = c167536hp.LLJILJILJ().LJI(c167536hp.LLJILJILJ().LIZ());
                if (LJI != null) {
                    effect = LJI.LIZ;
                } else {
                    effect = null;
                }
                c167536hp.LJLJJLL = null;
                if (effect != null && !OUP.LJJIIZ(effect) && C78857UxB.LJJJIL(effect.getEffectId())) {
                    c167536hp.LJLJJLL = effect;
                    C141425go.LIZLLL(c167536hp.getEditPreviewApi());
                    if (nLEEditor != null) {
                        nLEEditor.LIZIZ();
                        nLEEditor.LIZJ();
                    }
                    c167536hp.LLJJJ();
                    C141425go.LIZ(effect, c167536hp.getEditPreviewApi(), new AqS184S0100000_2(c167536hp, 17));
                    if (nLEEditor != null) {
                        nLEEditor.LIZIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("parentLayout");
            throw null;
        }
        o.LJIJI("veNonTabScene");
        throw null;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C167576ht> LJJLIIIJJI() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C167636hz> LJJLIIIJJIZ() {
        return this.LJLLLLLL;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C167536hp> LJLJJLL() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    private final void LLF(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 10));
    }

    @Override // X.InterfaceC168456jJ
    public void LLJJLIIIJLLLLLLLZ(InterfaceC65784Pro<C76800UCe> cancelTaskDone) {
        o.LJIIIZ(cancelTaskDone, "cancelTaskDone");
        C167536hp c167536hp = this.LJLLJ;
        if (c167536hp != null) {
            if (c167536hp.LJLJJLL != null) {
                c167536hp.LLJJIJIL();
            }
            cancelTaskDone.invoke();
            return;
        }
        o.LJIJI("veNonTabScene");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r0.length() != 0) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.6gV] */
    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.DefaultConstructorMarker, com.ss.ugc.effectplatform.model.Effect] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.6hp, X.WM7] */
    @Override // X.InterfaceC168456jJ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LLJLLL(X.InterfaceC65784Pro<X.C76800UCe> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "cancelTaskDone"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.6hp r3 = r5.LJLLJ
            r2 = 0
            if (r3 == 0) goto L73
            X.6i3 r0 = r3.LLJILJILJ()
            X.6i5 r1 = r0.LIZIZ
            r0 = -1
            if (r1 == 0) goto L71
            int r1 = r1.LJLJL
        L15:
            r4 = 1
            if (r1 != r0) goto L48
            X.6i3 r0 = r3.LLJILJILJ()
            r0.LJIIIIZZ()
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = new com.ss.android.ugc.effectmanager.effect.model.Effect
            r1.<init>(r2, r4, r2)
        L24:
            r2 = r1
        L25:
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r3.LJLJJLL
            if (r0 != 0) goto L44
            if (r2 == 0) goto L2e
            r2.getEffectId()
        L2e:
            X.6gV r1 = r3.LLJJIII()
            X.5kP r0 = r3.getEditPreviewApi()
            r1.bh0(r0, r2)
            X.GoZ r0 = X.C86793Y4n.LJJIJIIJIL(r3)
            r3.LLJILJIL(r0, r2)
        L40:
            r6.invoke()
            return
        L44:
            r3.LLJJIJIL()
            goto L40
        L48:
            X.6i3 r0 = r3.LLJILJILJ()
            r0.LIZIZ(r1)
            X.6i3 r0 = r3.LLJILJILJ()
            r0.LJIIJJI()
            X.6i3 r0 = r3.LLJILJILJ()
            X.6i9 r0 = r0.LJI(r1)
            if (r0 == 0) goto L25
            com.ss.android.ugc.effectmanager.effect.model.Effect r1 = r0.LIZ
            if (r1 == 0) goto L25
            java.lang.String r0 = r1.getEffectId()
            if (r0 == 0) goto L25
            int r0 = r0.length()
            if (r0 != 0) goto L24
            goto L25
        L71:
            r1 = -1
            goto L15
        L73:
            java.lang.String r0 = "veNonTabScene"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167506hm.LLJLLL(X.Pro):void");
    }

    @Override // X.InterfaceC168456jJ
    public void Qb(C150145us enableModel) {
        o.LJIIIZ(enableModel, "enableModel");
        LJJZZI(new AqS168S0100000_2(enableModel, 101));
    }

    @Override // X.InterfaceC168456jJ
    public void p6(boolean z) {
        LLF(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C167506hm(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C168416jF.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC166716gV.class, null);
        this.LJLLL = new AqS152S0100000_2(this, 163);
        this.LJLLLL = C167596hv.LJLIL;
        this.LJLLLLLL = new AqS152S0100000_2(this, 162);
        LJLZ().LLIIZ(this);
    }
}
