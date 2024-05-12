package X;

import Y.AObserverS70S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.effect.FilterEffectTabFragment;
import com.ss.android.ugc.aweme.effect.TimeEffectTabFragment;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.editeffect.model.EditEffectAnchorInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.streamedit.DefaultStreamEditSubPanelHelper;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.6cp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164436cp extends AbstractC29891Fh<InterfaceC145485nM> implements InterfaceC145485nM, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final C5H3 LJLJJL;
    public C169736lN LJLJJLL;
    public final C40871j1<Integer> LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final C29901Fi<C76800UCe> LJLJLLL;
    public final C29901Fi<Integer> LJLL;

    static {
        TBT tbt = new TBT(C164436cp.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt};
    }

    public InterfaceC145485nM LJJLIIIIJ() {
        return this;
    }

    @Override // X.InterfaceC145485nM
    public void bg0() {
    }

    private final void LJJLIIIJJIZ() {
        LJJLIIIJJI().Kh().observe(this, new AObserverS70S0100000_2(this, 55));
    }

    @Override // X.InterfaceC145485nM
    public void C5() {
        this.LJLJLJ.LJII(C76800UCe.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    public final ArrayList<EffectPointModel> LJJLI() {
        String string;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = LJJLIIIJILLIZJL().getEffectList();
        if (C164446cq.LIZ) {
            T t = 0;
            Bundle bundle = ((WM7) getDiContainer().LJ(AbstractC42651GoZ.class, null)).mArguments;
            if (bundle != null && (string = bundle.getString("extra_edit_effect_uid")) != null) {
                EditEffectAnchorManager data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string);
                if (data != null) {
                    ArrayList<EffectPointModel> effectList = LJJLIIIJILLIZJL().getEffectList();
                    o.LJIIIIZZ(effectList, "editModel.effectList");
                    ArrayList arrayList = new ArrayList();
                    Iterator<EffectPointModel> it = effectList.iterator();
                    while (it.hasNext()) {
                        EffectPointModel next = it.next();
                        EffectPointModel effectPointModel = next;
                        List<EditEffectAnchorInfo> data2 = data.getData();
                        if (!(data2 instanceof Collection) || !data2.isEmpty()) {
                            Iterator<EditEffectAnchorInfo> it2 = data2.iterator();
                            while (it2.hasNext()) {
                                if (o.LJ(it2.next().getEffectId(), effectPointModel.getKey())) {
                                    break;
                                }
                            }
                        }
                        arrayList.add(next);
                    }
                    t = C125694wX.LIZ(arrayList);
                }
                c68322mC.element = t;
            }
        }
        return (ArrayList) c68322mC.element;
    }

    public final VideoPublishEditModel LJJLIIIJILLIZJL() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LJLLI[0]);
    }

    public final InterfaceC143655kP LJJLIIIJJI() {
        return (InterfaceC143655kP) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC145485nM
    public void LLIL() {
        if (this.LJLJJLL == null && LJJLIIIJILLIZJL().mIsFromDraft) {
            LJJLIIIJJI().Sj0().setValue(C5RV.LJI());
            LJJLIIIJILLIZJL().setTimeEffect(null);
            InterfaceC153045zY value = LJJLIIIJJI().Kh().getValue();
            if (value instanceof C133765Mu) {
                C5LU LIZLLL = ((C133765Mu) value).LJI().LIZLLL();
                LIZLLL.LJIILJJIL(false);
                LIZLLL.LJJI();
                return;
            }
            return;
        }
        LJJLIIIIJ();
        C5();
    }

    @Override // X.InterfaceC145485nM
    public void Q9() {
        this.LJLJLLL.LJII(C76800UCe.LIZ);
    }

    @Override // X.InterfaceC145485nM
    public void hide() {
        C169736lN c169736lN = this.LJLJJLL;
        if (c169736lN != null) {
            ((DefaultStreamEditSubPanelHelper) c169736lN.LJLJJI.getValue()).LIZIZ();
            C169776lR LLJILJILJ = c169736lN.LLJILJILJ();
            LLJILJILJ.LJJJLIIL.mv0().setValue(Boolean.FALSE);
            if (((Boolean) C170306mI.LIZ.getValue()).booleanValue()) {
                LLJILJILJ.LIZLLL.removeObserver(LLJILJILJ.LJJL);
            }
        }
    }

    @Override // X.InterfaceC145485nM
    public void show() {
        NLEModel nLEModel;
        boolean z;
        int i;
        InterfaceC153045zY value;
        if (this.LJLJJLL == null) {
            C169736lN c169736lN = new C169736lN(getDiContainer());
            Activity activity = this.LJLILLLLZI.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            C135625Ty c135625Ty = new C135625Ty((ActivityC45651qj) activity, this);
            C169776lR LLJILJILJ = c169736lN.LLJILJILJ();
            LLJILJILJ.LJJJLL = c135625Ty;
            EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJFF(c135625Ty.LIZLLL()).get(EditEffectVideoModel.class);
            LLJILJILJ.LJJJLIIL = editEffectVideoModel;
            InterfaceC169856lZ interfaceC169856lZ = LLJILJILJ.LJJJLL;
            editEffectVideoModel.getClass();
            o.LJIIIZ(interfaceC169856lZ, "<set-?>");
            editEffectVideoModel.LJLJJLL = interfaceC169856lZ;
            this.LJLILLLLZI.add(this.LJLJI, c169736lN, "EditEffectScene");
            this.LJLJJLL = c169736lN;
        }
        if (LJJLIIIJILLIZJL().isMultiVideoEdit() && (value = LJJLIIIJJI().Kh().getValue()) != null) {
            LJJLIIIJ(value.getDuration());
        }
        C169736lN c169736lN2 = this.LJLJJLL;
        if (c169736lN2 != null) {
            ((DefaultStreamEditSubPanelHelper) c169736lN2.LJLJJI.getValue()).LIZJ();
            C169776lR LLJILJILJ2 = c169736lN2.LLJILJILJ();
            boolean z2 = !((InterfaceC139655dx) c169736lN2.LJLJI.getValue()).LJLIL();
            LLJILJILJ2.LJII();
            if (((Boolean) C170306mI.LIZ.getValue()).booleanValue()) {
                if (LLJILJILJ2.LIZLLL == null) {
                    LLJILJILJ2.LIZLLL = LLJILJILJ2.LJJJLL.LJIIIIZZ();
                }
                LLJILJILJ2.LIZLLL.observe(LLJILJILJ2.LJIIIIZZ, LLJILJILJ2.LJJL);
            }
            LLJILJILJ2.LJJJLIIL.mv0().setValue(Boolean.TRUE);
            LLJILJILJ2.LJJJLIIL.LJLJL = z2;
            VideoPublishEditModel videoPublishEditModel = LLJILJILJ2.LIZ;
            InterfaceC153045zY interfaceC153045zY = LLJILJILJ2.LJJIIJZLJL;
            C164456cr c164456cr = null;
            if (interfaceC153045zY instanceof C133765Mu) {
                nLEModel = ((C133765Mu) interfaceC153045zY).LJI().LJIIJ.LJ();
            } else {
                nLEModel = null;
            }
            boolean LJ = C5OL.LJ(nLEModel, videoPublishEditModel);
            LLJILJILJ2.LJJLIIIJL = LJ;
            C164916db c164916db = LLJILJILJ2.LJJJI;
            if (c164916db != null) {
                if (c164916db.getCurrentPage() != null && LLJILJILJ2.LJJJI.getCurrentPage().LJII()) {
                    z = true;
                } else {
                    z = false;
                }
                LLJILJILJ2.LJJJI.LJLI(LLJILJILJ2.LJJLIIIJL);
            } else {
                Fragment fragment = LLJILJILJ2.LJJIJLIJ.LJLL;
                if (fragment != null && (fragment instanceof TimeEffectTabFragment)) {
                    z = true;
                    if (LJ) {
                        ((TimeEffectTabFragment) fragment).vl(z2, true);
                    } else {
                        LLJILJILJ2.LJJ.setCurrentItem(0);
                    }
                } else {
                    z = false;
                }
                List<EffectCategoryResponse> list = LLJILJILJ2.LJJIJLIJ.LJLJLJ;
                if (list != null && !list.isEmpty()) {
                    boolean equals = ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) DIX.LIZJ(list, 1, list)).getKey().equals("time");
                    if (!LLJILJILJ2.LJJLIIIJL) {
                        if (equals) {
                            LLJILJILJ2.LJJIJLIJ.LJLLL = true;
                            C80698Vlm c80698Vlm = LLJILJILJ2.LJJI;
                            int tabCount = c80698Vlm.getTabCount() - 1;
                            C164456cr c164456cr2 = c80698Vlm.LJLILLLLZI;
                            if (c164456cr2 != null) {
                                i = c164456cr2.LIZJ;
                            } else {
                                i = 0;
                            }
                            c80698Vlm.LJIILL(tabCount);
                            C164456cr c164456cr3 = (C164456cr) ListProtector.remove(c80698Vlm.LJLIL, tabCount);
                            if (c164456cr3 != null) {
                                c164456cr3.LJFF = null;
                                c164456cr3.LJI = null;
                                c164456cr3.LIZ = null;
                                c164456cr3.LIZIZ = null;
                                c164456cr3.LIZJ = -1;
                                c164456cr3.LIZLLL = null;
                                C80695Vlj.LLIIJI.LIZ(c164456cr3);
                            }
                            int size = c80698Vlm.LJLIL.size();
                            for (int i2 = tabCount; i2 < size; i2++) {
                                ((C164456cr) ListProtector.get(c80698Vlm.LJLIL, i2)).LIZJ = i2;
                            }
                            if (i == tabCount) {
                                if (!c80698Vlm.LJLIL.isEmpty()) {
                                    c164456cr = (C164456cr) ListProtector.get(c80698Vlm.LJLIL, Math.max(0, tabCount - 1));
                                }
                                c80698Vlm.LJIILLIIL(c164456cr);
                            }
                            C170216m9 c170216m9 = LLJILJILJ2.LJJIJLIJ;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= c170216m9.LJLJLJ.size()) {
                                    break;
                                }
                                if (ListProtector.get(c170216m9.LJLJLJ, i3) != null && ((com.ss.ugc.effectplatform.model.EffectCategoryResponse) ListProtector.get(c170216m9.LJLJLJ, i3)).getKey().equals("time")) {
                                    if (i3 != -1) {
                                        ListProtector.remove(c170216m9.LJLJLJ, i3);
                                        c170216m9.notifyDataSetChanged();
                                    }
                                } else {
                                    i3++;
                                }
                            }
                        }
                    } else if (!equals) {
                        LLJILJILJ2.LJJIJLIJ.LJLLL = false;
                        LLJILJILJ2.LIZIZ(list);
                        LLJILJILJ2.LJJIJLIJ.setData(list);
                        LLJILJILJ2.LIZ(list);
                    }
                }
                LLJILJILJ2.LJJLIIIJLJLI = !C5OL.LIZ(LLJILJILJ2.LIZ);
                List<EffectCategoryResponse> list2 = LLJILJILJ2.LJJIJLIJ.LJLJLJ;
                if (list2 != null && !list2.isEmpty() && !LLJILJILJ2.LJJLIIIJLJLI) {
                    C169776lR.LJIILLIIL("sticker", list2);
                    LLJILJILJ2.LJJIJLIJ.setData(list2);
                    LLJILJILJ2.LIZ(list2);
                }
                Fragment fragment2 = LLJILJILJ2.LJJIJLIJ.LJLL;
                if (fragment2 != null && (fragment2 instanceof FilterEffectTabFragment)) {
                    ((LiveData) ((FilterEffectTabFragment) fragment2).LL.getValue()).setValue(Boolean.valueOf(!r1.Il()));
                }
            }
            if (LLJILJILJ2.LIZ.isMultiVideoEdit() && z) {
                LLJILJILJ2.LJIILIIL();
            }
            if (c169736lN2.LJLJL) {
                C74216TAu c74216TAu = C74216TAu.LIZIZ;
                if (c74216TAu.LIZIZ() && !c74216TAu.LJIIIZ()) {
                    c169736lN2.LJLJL = false;
                    C78596Usy.LJJJLIIL(c169736lN2.requireApplicationContext(), true);
                }
            }
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        LJJLIIIJJIZ();
    }

    @Override // X.InterfaceC145485nM
    public void pl() {
        LJJLIIIJILLIZJL().getEffectList().clear();
        ArrayList<EffectPointModel> J7 = LJJLIIIJJI().J7();
        if (!J7.isEmpty()) {
            int size = J7.size();
            int[] iArr = new int[size];
            String[] strArr = new String[J7.size()];
            for (int i = 0; i < size; i++) {
                iArr[i] = ((EffectPointModel) ListProtector.get(J7, i)).getIndex();
                strArr[i] = ((EffectPointModel) ListProtector.get(J7, i)).getUuid();
            }
            ReplayLiveData<C5RT> pJ = LJJLIIIJJI().pJ();
            C5RT c5rt = new C5RT();
            c5rt.LJI = 3;
            c5rt.LIZ = iArr;
            c5rt.LIZIZ = strArr;
            pJ.setValue(c5rt);
        }
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<Integer> MC() {
        return this.LJLL;
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<C76800UCe> Ut() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145485nM getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC145485nM
    public LiveEvent<C76800UCe> mb() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC145485nM
    public C0IB<Integer> ti() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC145485nM
    public void LJJLIIIJ(int i) {
        this.LJLJL.LJI(Integer.valueOf(i));
    }

    @Override // X.InterfaceC145485nM
    public void l0(int i) {
        this.LJLL.LJII(Integer.valueOf(i));
    }

    public C164436cp(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJL = new C40871j1<>(null);
        this.LJLJLJ = new C29901Fi<>();
        this.LJLJLLL = new C29901Fi<>();
        this.LJLL = new C29901Fi<>();
    }
}
