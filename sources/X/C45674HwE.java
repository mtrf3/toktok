package X;

import Y.AObjectS43S0101000_7;
import Y.ARunnableS11S0101000_7;
import Y.AUListenerS69S0101000_7;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaExtensionKt;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.OpeningChooseMediaPageState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.ss.android.ugc.aweme.widgetcompat.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HwE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45674HwE extends AbstractC45602Hv4 implements InterfaceC45689HwT {
    public static final int LJLZ;
    public static final int LJZ;
    public RecyclerView LJLJI;
    public ViewOnClickListenerC45676HwG LJLJJI;
    public C45685HwP LJLJJL;
    public ViewGroup LJLJJLL;
    public C45463Hsp LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public int LJLILLLLZI = 30;
    public final C45675HwF LJLLLL = new InterfaceC44146HUg() { // from class: X.HwF
        @Override // X.InterfaceC44146HUg
        public final void LIZ(boolean z, int i, List list, AbstractC45692HwW abstractC45692HwW) {
            String str;
            C45674HwE c45674HwE = C45674HwE.this;
            c45674HwE.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onMediaPageLoadedCallback, success = ");
            LIZ.append(z);
            LIZ.append(" loadType = ");
            LIZ.append(i);
            LIZ.append(" hasMoreImage = ");
            LIZ.append(c45674HwE.LJLJLJ);
            LIZ.append(" hasMoreVideo = ");
            LIZ.append(c45674HwE.LJLJLLL);
            H78.LIZIZ("MvChooseAlbumFragment", X1D.LIZIZ(LIZ));
            if (i == 4) {
                if (!c45674HwE.LJLJLLL || !z || list == null) {
                    c45674HwE.LJLJLLL = false;
                    H78.LIZIZ("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreVideo = false and return");
                    return;
                } else if (list.size() == 0 && abstractC45692HwW != C45693HwX.LIZ) {
                    c45674HwE.LJLJLLL = false;
                }
            } else if (!c45674HwE.LJLJLJ || !z || list == null) {
                c45674HwE.LJLJLJ = false;
                H78.LIZIZ("MvChooseAlbumFragment", "onMediaPageLoadedCallback, set hasMoreImage = false and return");
                return;
            } else if (list.size() == 0 && abstractC45692HwW != C45693HwX.LIZ) {
                c45674HwE.LJLJLJ = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                MediaModel mediaModel = (MediaModel) it.next();
                if (mediaModel != null && (str = mediaModel.fileLocalUriPath) != null && !TextUtils.isEmpty(str)) {
                    MyMediaModel.Companion.getClass();
                    arrayList.add(C43966HNi.LIZIZ(mediaModel));
                }
            }
            ViewOnClickListenerC45676HwG viewOnClickListenerC45676HwG = c45674HwE.LJLJJI;
            viewOnClickListenerC45676HwG.getClass();
            if (i != 4 && i != 3 && i != 1) {
                return;
            }
            if (abstractC45692HwW == C45691HwV.LIZ) {
                Iterator<C45678HwI> it2 = viewOnClickListenerC45676HwG.LJLIL.iterator();
                while (it2.hasNext()) {
                    C45678HwI next = it2.next();
                    if (i == 4) {
                        ((ArrayList) next.LIZJ).clear();
                    } else if (i == 3) {
                        ((ArrayList) next.LIZIZ).clear();
                    } else if (i == 1) {
                        ((ArrayList) next.LIZIZ).clear();
                    }
                    if (((ArrayList) next.LIZJ).size() + ((ArrayList) next.LIZIZ).size() == 0 && !TextUtils.equals(next.LIZ, viewOnClickListenerC45676HwG.LJLL)) {
                        it2.remove();
                        viewOnClickListenerC45676HwG.LJLILLLLZI.remove(next.LIZ);
                    }
                }
            }
            viewOnClickListenerC45676HwG.LJLLILLLL = true;
            C45678HwI c45678HwI = (C45678HwI) ListProtector.get(viewOnClickListenerC45676HwG.LJLIL, 0);
            HashSet<C45678HwI> hashSet = new HashSet<>();
            if (C45695HwZ.LIZ()) {
                if (!C78886Uxe.LJJIJ(arrayList)) {
                    if (i == 4) {
                        ((ArrayList) c45678HwI.LIZJ).addAll(arrayList);
                    } else if (i == 3) {
                        ((ArrayList) c45678HwI.LIZIZ).addAll(arrayList);
                    } else if (i == 1) {
                        ((ArrayList) c45678HwI.LIZIZ).addAll(arrayList);
                    }
                }
            } else {
                viewOnClickListenerC45676HwG.LJLZ(arrayList, c45678HwI, hashSet, i, abstractC45692HwW);
            }
            viewOnClickListenerC45676HwG.LJLJJI |= 1 << i;
            InterfaceC45689HwT interfaceC45689HwT = viewOnClickListenerC45676HwG.LJLJL;
            if (interfaceC45689HwT != null) {
                C45678HwI c45678HwI2 = viewOnClickListenerC45676HwG.LJLJLJ;
                if (c45678HwI2 == null) {
                    interfaceC45689HwT.LJIIZILJ(viewOnClickListenerC45676HwG.LJZ(), false, viewOnClickListenerC45676HwG.LJLJJI, true);
                    viewOnClickListenerC45676HwG.LJLJLJ = viewOnClickListenerC45676HwG.LJZ();
                } else if (hashSet.contains(c45678HwI2) || viewOnClickListenerC45676HwG.LJLJLJ == viewOnClickListenerC45676HwG.LJZ()) {
                    viewOnClickListenerC45676HwG.LJLJL.LJIIZILJ(viewOnClickListenerC45676HwG.LJLJLJ, false, viewOnClickListenerC45676HwG.LJLJJI, false);
                }
            }
            C64691PaB c64691PaB = viewOnClickListenerC45676HwG.LJLJLLL;
            if (c64691PaB == null) {
                return;
            }
            C45674HwE c45674HwE2 = (C45674HwE) c64691PaB.LJLIL;
            c45674HwE2.getClass();
            if (i == 4) {
                if (!c45674HwE2.LJLJLLL) {
                    return;
                }
                if (abstractC45692HwW == C45693HwX.LIZ) {
                    if (ChooseMediaExtensionKt.LIZ(c45674HwE2) != OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                        return;
                    }
                    C45685HwP c45685HwP = c45674HwE2.LJLJJL;
                    int i2 = C45674HwE.LJLZ;
                    int i3 = c45674HwE2.LJLLI;
                    C45675HwF c45675HwF = c45674HwE2.LJLLLL;
                    C45691HwV c45691HwV = C45691HwV.LIZ;
                    c45685HwP.getClass();
                    C45685HwP.LIZLLL(i, i2, i3, c45675HwF, c45691HwV);
                    return;
                }
                C45685HwP c45685HwP2 = c45674HwE2.LJLJJL;
                int i4 = C45674HwE.LJLZ;
                int i5 = c45674HwE2.LJLLI + 1;
                c45674HwE2.LJLLI = i5;
                c45685HwP2.LIZJ(i, i4, i5, c45674HwE2.LJLLLL);
                return;
            }
            if ((i != 3 && i != 1) || !c45674HwE2.LJLJLJ) {
                return;
            }
            if (abstractC45692HwW == C45693HwX.LIZ) {
                if (ChooseMediaExtensionKt.LIZ(c45674HwE2) != OpeningChooseMediaPageState.NoSceneAnimation.INSTANCE) {
                    return;
                }
                C45685HwP c45685HwP3 = c45674HwE2.LJLJJL;
                int i6 = C45674HwE.LJZ;
                int i7 = c45674HwE2.LJLL;
                C45675HwF c45675HwF2 = c45674HwE2.LJLLLL;
                C45691HwV c45691HwV2 = C45691HwV.LIZ;
                c45685HwP3.getClass();
                C45685HwP.LIZLLL(i, i6, i7, c45675HwF2, c45691HwV2);
                return;
            }
            C45685HwP c45685HwP4 = c45674HwE2.LJLJJL;
            int i8 = C45674HwE.LJZ;
            int i9 = c45674HwE2.LJLL + 1;
            c45674HwE2.LJLL = i9;
            c45685HwP4.LIZJ(i, i8, i9, c45674HwE2.LJLLLL);
        }
    };
    public final C64691PaB LJLLLLLL = new C64691PaB(this);

    static {
        int i;
        C44947HkV c44947HkV = InterfaceC44948HkW.LJI;
        int i2 = 300;
        if (c44947HkV.getOpenAlbumOptiGroup() == 0) {
            i = 300;
        } else {
            i = 600;
        }
        LJLZ = i;
        if (c44947HkV.getOpenAlbumOptiGroup() != 0) {
            i2 = 600;
        }
        LJZ = i2;
    }

    @Override // X.AbstractC45656Hvw, X.WM7
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void LLJILJIL(boolean z) {
        int i;
        ViewOnClickListenerC45676HwG viewOnClickListenerC45676HwG;
        this.LJLLILLLL = z;
        int i2 = -1;
        if (z) {
            i = 0;
        } else {
            i2 = 0;
            i = -1;
        }
        int LIZLLL = C81184Vtc.LIZLLL(C60903NvH.LJ);
        ValueAnimator duration = ValueAnimator.ofFloat(i2, i).setDuration(500L);
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        duration.addUpdateListener(new AUListenerS69S0101000_7(this, LIZLLL, 1));
        duration.start();
        if (z && (viewOnClickListenerC45676HwG = this.LJLJJI) != null) {
            viewOnClickListenerC45676HwG.getClass();
            if (!C45695HwZ.LIZ() || !viewOnClickListenerC45676HwG.LJLLILLLL) {
                return;
            }
            viewOnClickListenerC45676HwG.LJLLILLLL = false;
            C45678HwI c45678HwI = (C45678HwI) ListProtector.get(viewOnClickListenerC45676HwG.LJLIL, 0);
            ArrayList arrayList = new ArrayList(c45678HwI.LIZIZ);
            C45694HwY c45694HwY = C45694HwY.LIZ;
            viewOnClickListenerC45676HwG.LJLZ(arrayList, null, null, 3, c45694HwY);
            viewOnClickListenerC45676HwG.LJLZ(new ArrayList(c45678HwI.LIZJ), null, null, 4, c45694HwY);
        }
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AObjectS43S0101000_7 aObjectS43S0101000_7 = new AObjectS43S0101000_7(2, this, 1);
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChooseMediaViewModel.class);
        o.LJIIIIZZ(LIZ, "of(this).get(ChooseMediaViewModel::class.java)");
        ((BaseJediViewModel) LIZ).Iv0(this, new TBT() { // from class: X.HwN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ChooseMediaState) obj).getOpeningChooseMediaPageState();
            }
        }, new C73165SnZ(), new AqS173S0100000_7(aObjectS43S0101000_7, 278));
    }

    @Override // X.AbstractC45656Hvw, com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        InterfaceC36571c5 currentScene = C60903NvH.LJIIJJI().LJIL().getCurrentScene(requireActivity());
        if (C42617Go1.LIZ() && (currentScene instanceof InterfaceC45601Hv3)) {
            this.LJLJJLL = (ViewGroup) C45526Htq.LIZ((InterfaceC45601Hv3) currentScene, R.layout.bl8, this);
        } else {
            this.LJLJJLL = (ViewGroup) C16880lQ.LLLLIILL(layoutInflater, R.layout.bl8, viewGroup, false);
        }
        Bundle bundle2 = this.mArguments;
        int i = -1;
        if (bundle2 != null) {
            i = bundle2.getInt("key_support_flag", -1);
            this.LJLLJ = bundle2.getBoolean("extra_show_gif", false);
            this.LJLLL = bundle2.getBoolean("extra_from_ugc_template", false);
            if (bundle2.getBoolean("is_slide_scene", false)) {
                this.LJLILLLLZI = 18;
            }
        }
        RecyclerView recyclerView = (RecyclerView) this.LJLJJLL.findViewById(R.id.egm);
        this.LJLJI = recyclerView;
        recyclerView.setLayoutManager(new WrapLinearLayoutManager());
        ViewOnClickListenerC45676HwG viewOnClickListenerC45676HwG = new ViewOnClickListenerC45676HwG(this.mActivity, this, this.LJLLL);
        this.LJLJJI = viewOnClickListenerC45676HwG;
        viewOnClickListenerC45676HwG.LJLJLLL = this.LJLLLLLL;
        if (C45685HwP.LJFF == null) {
            C45685HwP.LIZIZ(C60903NvH.LJ);
        }
        this.LJLJJL = C45685HwP.LJFF;
        this.LJLJI.setAdapter(this.LJLJJI);
        this.LJLJJLL.post(new ARunnableS11S0101000_7(3, this, 17));
        if (this.LJLJJL != null) {
            G8G.LIZ.step(OpenAlbumPanelPerformanceMonitor.INSTANCE, "loadMediaModels");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loadData, supportFlag = ");
            LIZ.append(i);
            H78.LIZIZ("MvChooseAlbumFragment", X1D.LIZIZ(LIZ));
            if ((i & 1) != 0 || (i & 2) != 0) {
                this.LJLJLJ = true;
                this.LJLL = 0;
                if (this.LJLLJ) {
                    C45685HwP c45685HwP = this.LJLJJL;
                    int i2 = this.LJLILLLLZI;
                    C45675HwF c45675HwF = this.LJLLLL;
                    C45693HwX c45693HwX = C45693HwX.LIZ;
                    c45685HwP.getClass();
                    C45685HwP.LIZLLL(1, i2, 0, c45675HwF, c45693HwX);
                } else {
                    C45685HwP c45685HwP2 = this.LJLJJL;
                    int i3 = this.LJLILLLLZI;
                    C45675HwF c45675HwF2 = this.LJLLLL;
                    C45693HwX c45693HwX2 = C45693HwX.LIZ;
                    c45685HwP2.getClass();
                    C45685HwP.LIZLLL(3, i3, 0, c45675HwF2, c45693HwX2);
                }
            }
            if ((i & 4) != 0) {
                this.LJLJLLL = true;
                this.LJLLI = 0;
                C45685HwP c45685HwP3 = this.LJLJJL;
                int i4 = this.LJLILLLLZI;
                C45675HwF c45675HwF3 = this.LJLLLL;
                C45693HwX c45693HwX3 = C45693HwX.LIZ;
                c45685HwP3.getClass();
                C45685HwP.LIZLLL(4, i4, 0, c45675HwF3, c45693HwX3);
            }
        } else {
            H78.LIZIZ("MvChooseAlbumFragment", "loadData, mMediaManager is null");
        }
        this.LJLJJLL.setOutlineProvider(new C45679HwJ());
        ViewGroup viewGroup2 = this.LJLJJLL;
        Activity requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        viewGroup2.setElevation(C74275TDb.LIZIZ(requireActivity, 17.0f));
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC45689HwT
    public final void LJIIZILJ(C45678HwI c45678HwI, boolean z, int i, boolean z2) {
        C45463Hsp c45463Hsp = this.LJLJL;
        if (c45463Hsp != null) {
            c45463Hsp.LJIIZILJ(c45678HwI, z, i, z2);
        }
    }
}
