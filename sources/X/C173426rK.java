package X;

import Y.ACListenerS22S0100000_2;
import Y.ARunnableS21S0200000_2;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6rK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173426rK extends AbstractC29891Fh<InterfaceC145875nz> implements InterfaceC145875nz, InterfaceC135635Tz {
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public final C5H3 LJLJJI;
    public final C29901Fi<C76800UCe> LJLJJL;
    public final LiveEvent<C76800UCe> LJLJJLL;

    public InterfaceC145875nz LJJLI() {
        return this;
    }

    private final C173416rJ LJJLIIIIJ() {
        return (C173416rJ) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC145875nz
    public void LLD() {
        final C173416rJ LJJLIIIIJ = LJJLIIIIJ();
        WMH wmh = (WMH) LJJLIIIIJ.mParentScene;
        if (wmh != null) {
            wmh.show(LJJLIIIIJ);
        }
        LJJLIIIIJ.LJLLILLLL = ((InterfaceC143655kP) LJJLIIIIJ.LJLLLLLL.getValue()).Kh().getValue();
        FrameLayout frameLayout = LJJLIIIIJ.LJLLJ;
        FrameLayout frameLayout2 = null;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            Activity activity = LJJLIIIIJ.mActivity;
            o.LJII(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            FrameLayout frameLayout3 = LJJLIIIIJ.LJLLJ;
            if (frameLayout3 != null) {
                if (LJJLIIIIJ.LJLILLLLZI == null) {
                    View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(activity), R.layout.l0, frameLayout3, false);
                    LJJLIIIIJ.LJLILLLLZI = LLLLIILL;
                    if (LLLLIILL != null) {
                        LLLLIILL.findViewById(R.id.m63);
                    }
                    View view = LJJLIIIIJ.LJLILLLLZI;
                    if (view != null) {
                        frameLayout2 = (FrameLayout) view.findViewById(R.id.fkp);
                    }
                    LJJLIIIIJ.LJLLI = new C81589W0j(frameLayout2);
                    View view2 = LJJLIIIIJ.LJLILLLLZI;
                    o.LJI(view2);
                    LJJLIIIIJ.LJLJI = view2.findViewById(R.id.ndi);
                    View view3 = LJJLIIIIJ.LJLILLLLZI;
                    o.LJI(view3);
                    C16880lQ.LJIIJ(new ACListenerS22S0100000_2(LJJLIIIIJ, 109), view3.findViewById(R.id.ndy));
                    View view4 = LJJLIIIIJ.LJLILLLLZI;
                    o.LJI(view4);
                    LJJLIIIIJ.LJLJJI = (RecyclerView) view4.findViewById(R.id.ndr);
                    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0, false);
                    LJJLIIIIJ.LJLJLJ = linearLayoutManager;
                    RecyclerView recyclerView = LJJLIIIIJ.LJLJJI;
                    if (recyclerView != null) {
                        recyclerView.setLayoutManager(linearLayoutManager);
                    }
                    C173396rH c173396rH = new C173396rH(C86793Y4n.LJJIJIIJIL(LJJLIIIIJ), LJJLIIIIJ.LJLLILLLL, LJJLIIIIJ.LLJILJIL(), LJJLIIIIJ.LLJILJIL().veAudioEffectParam, (InterfaceC143655kP) LJJLIIIIJ.LJLLLLLL.getValue());
                    LJJLIIIIJ.LJLJL = c173396rH;
                    c173396rH.LJLLILLLL = LJJLIIIIJ;
                    RecyclerView recyclerView2 = LJJLIIIIJ.LJLJJI;
                    if (recyclerView2 != null) {
                        recyclerView2.setAdapter(c173396rH);
                    }
                    LJJLIIIIJ.LLJJ(C149905uU.LIZ(), false);
                    C166696gT.LIZ().LIZIZ(new InterfaceC169456kv() { // from class: X.6rN
                        @Override // X.InterfaceC169456kv
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZ(CategoryPageModel categoryPageModel) {
                            boolean z;
                            CategoryEffectModel categoryEffects;
                            List<Effect> effects;
                            C173416rJ c173416rJ = C173416rJ.this;
                            RecyclerView recyclerView3 = c173416rJ.LJLJJI;
                            if (recyclerView3 != null) {
                                recyclerView3.post(new ARunnableS21S0200000_2(categoryPageModel, c173416rJ, 52));
                            }
                            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                WPY.LIZIZ(true, "changer_voice", null, 12);
                            } else {
                                WPY.LIZIZ(false, "changer_voice", null, 12);
                            }
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZIZ(int i, String str) {
                            WPY.LIZIZ(false, "changer_voice", null, 12);
                        }
                    });
                    View view5 = LJJLIIIIJ.LJLILLLLZI;
                    o.LJI(view5);
                    View view6 = LJJLIIIIJ.LJLJI;
                    o.LJI(view6);
                    C82946Wgw c82946Wgw = new C82946Wgw(frameLayout3, view5, view6);
                    LJJLIIIIJ.LJLJJL = c82946Wgw;
                    c82946Wgw.LJLIL = new C82604WbQ() { // from class: X.6rR
                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LIZLLL() {
                            C173416rJ.this.getClass();
                        }

                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LJII() {
                            C173416rJ.this.getClass();
                            C173476rP c173476rP = C173416rJ.this.LJLJJLL;
                            if (c173476rP != null) {
                                c173476rP.LJII();
                            }
                        }

                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LJ() {
                        }

                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LJFF() {
                        }

                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LIZ(float f, int i, int i2) {
                        }

                        @Override // X.C82604WbQ, X.InterfaceC82947Wgx
                        public final void LJIIIIZZ(float f, int i, int i2) {
                        }
                    };
                } else {
                    LJJLIIIIJ.LLJJ(C149905uU.LIZ(), false);
                    C166696gT.LIZ().LIZIZ(new InterfaceC169456kv() { // from class: X.6rN
                        @Override // X.InterfaceC169456kv
                        public final void LIZJ() {
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZ(CategoryPageModel categoryPageModel) {
                            boolean z;
                            CategoryEffectModel categoryEffects;
                            List<Effect> effects;
                            C173416rJ c173416rJ = C173416rJ.this;
                            RecyclerView recyclerView3 = c173416rJ.LJLJJI;
                            if (recyclerView3 != null) {
                                recyclerView3.post(new ARunnableS21S0200000_2(categoryPageModel, c173416rJ, 52));
                            }
                            if (categoryPageModel != null && (categoryEffects = categoryPageModel.getCategoryEffects()) != null && (effects = categoryEffects.getEffects()) != null && !effects.isEmpty()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                WPY.LIZIZ(true, "changer_voice", null, 12);
                            } else {
                                WPY.LIZIZ(false, "changer_voice", null, 12);
                            }
                        }

                        @Override // X.InterfaceC169456kv
                        public final void LIZIZ(int i, String str) {
                            WPY.LIZIZ(false, "changer_voice", null, 12);
                        }
                    });
                }
                View view7 = LJJLIIIIJ.LJLILLLLZI;
                if (view7 != null) {
                    view7.setVisibility(4);
                }
                C82946Wgw c82946Wgw2 = LJJLIIIIJ.LJLJJL;
                if (c82946Wgw2 != null) {
                    c82946Wgw2.LIZIZ(new C30461Hm() { // from class: X.6rO
                        @Override // X.C30461Hm, X.InterfaceC82947Wgx
                        public final void LIZLLL() {
                            View view8 = C173416rJ.this.LJLILLLLZI;
                            if (view8 != null) {
                                view8.setVisibility(0);
                            }
                            C173416rJ c173416rJ = C173416rJ.this;
                            LinearLayoutManager linearLayoutManager2 = c173416rJ.LJLJLJ;
                            if (linearLayoutManager2 != null) {
                                linearLayoutManager2.LJFF(c173416rJ.LJLJLLL, c173416rJ.LJLL);
                            }
                        }
                    });
                    return;
                }
                return;
            }
            o.LJIJI("parentLayout");
            throw null;
        }
        o.LJIJI("parentLayout");
        throw null;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC145875nz getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC145875nz
    public LiveEvent<C76800UCe> j50() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC145875nz
    public void LLIIL(InterfaceC143655kP editPreviewApi, VideoPublishEditModel videoPublishEditModel) {
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        editPreviewApi.MK(C135285Sq.LIZIZ());
        C149905uU.LIZLLL(videoPublishEditModel);
        this.LJLJJL.LJII(C76800UCe.LIZ);
    }

    public C173426rK(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 761));
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJJL = c29901Fi;
        this.LJLJJLL = c29901Fi;
    }
}
