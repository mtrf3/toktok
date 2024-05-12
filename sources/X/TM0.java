package X;

import Y.ACListenerS32S0100000_12;
import Y.AfS59S0100000_7;
import Y.AfS64S0100000_12;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryState;
import com.ss.android.ugc.aweme.shortvideo.library.model.LibraryCategoryViewModel;
import com.ss.android.ugc.aweme.shortvideo.model.CreativeFlowData;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TM0 extends WM7 {
    public final CreativeFlowData LJLIL;
    public final boolean LJLILLLLZI;
    public final InterfaceC74506TLy LJLJI;
    public final InterfaceC46114I7y LJLJJI;
    public final String LJLJJL;
    public final boolean LJLJJLL;
    public final InterfaceC46115I7z LJLJL;
    public final C74577TOr LJLJLJ;
    public boolean LJLJLLL;
    public final C73318Sq2 LJLL;
    public final InterfaceC84498XEg LJLLI;
    public ViewGroup LJLLILLLL;
    public Context LJLLJ;
    public C74496TLo LJLLL;
    public TM8 LJLLLL;
    public C71506S4o LJLLLLLL;
    public View LJLZ;
    public View LJZ;
    public View LJZI;
    public String LJZL;
    public boolean LL;
    public String LLD;
    public long LLF;
    public ChooseMediaViewModel LLFF;
    public LibraryCategoryViewModel LLFFF;
    public C45800HyG LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final C62822Ol8 LLIFFJFJJ;
    public final C62822Ol8 LLII;
    public final C62822Ol8 LLIIII;

    public final TLK<ProviderEffect> LLJILJILJ() {
        return (TLK) this.LLII.getValue();
    }

    public final void LLJJIII() {
        TM8 tm8 = this.LJLLLL;
        if (tm8 != null) {
            tm8.LIZJ();
            View view = this.LJZI;
            if (view != null) {
                view.clearFocus();
                return;
            } else {
                o.LJIJI("searchContent");
                throw null;
            }
        }
        o.LJIJI("searchEntranceView");
        throw null;
    }

    public final String LLJILJIL() {
        Object obj;
        LiveData<Object> extraData;
        LiveData<Object> extraData2;
        TLK<ProviderEffect> LLJILJILJ = LLJILJILJ();
        Object obj2 = null;
        if (LLJILJILJ != null && (extraData2 = LLJILJILJ.getExtraData()) != null) {
            obj = extraData2.getValue();
        } else {
            obj = null;
        }
        if (obj instanceof ProviderEffectModel) {
            TLK<ProviderEffect> LLJILJILJ2 = LLJILJILJ();
            if (LLJILJILJ2 != null && (extraData = LLJILJILJ2.getExtraData()) != null) {
                obj2 = extraData.getValue();
            }
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel");
            return ((com.ss.ugc.effectplatform.model.ProviderEffectModel) obj2).getImpression_id();
        }
        return "";
    }

    public final String LLJJIJI() {
        Object obj;
        LiveData<Object> extraData;
        LiveData<Object> extraData2;
        TLK<ProviderEffect> LLJILJILJ = LLJILJILJ();
        Object obj2 = null;
        if (LLJILJILJ != null && (extraData2 = LLJILJILJ.getExtraData()) != null) {
            obj = extraData2.getValue();
        } else {
            obj = null;
        }
        if (obj instanceof ProviderEffectModel) {
            TLK<ProviderEffect> LLJILJILJ2 = LLJILJILJ();
            if (LLJILJILJ2 != null && (extraData = LLJILJILJ2.getExtraData()) != null) {
                obj2 = extraData.getValue();
            }
            o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel");
            List<com.ss.ugc.effectplatform.model.ProviderEffect> library_list = ((com.ss.ugc.effectplatform.model.ProviderEffectModel) obj2).getLibrary_list();
            if (library_list != null && !library_list.isEmpty()) {
                return CardStruct.IStatusCode.DEFAULT;
            }
        }
        return "1";
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJLJ.getClass();
        this.LJLL.LIZLLL();
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x004d, code lost:
    
        if (r1.LJFF == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LLJJIJIIJIL(boolean r15) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TM0.LLJJIJIIJIL(boolean):boolean");
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C74496TLo c74496TLo = this.LJLLL;
        if (c74496TLo != null) {
            c74496TLo.loadData();
        } else {
            o.LJIJI("libraryListView");
            throw null;
        }
    }

    public final void LLJJ(int i, MyMediaModel myMediaModel) {
        Integer LIZ;
        if (myMediaModel == null) {
            return;
        }
        InterfaceC74506TLy interfaceC74506TLy = this.LJLJI;
        if (interfaceC74506TLy != null && interfaceC74506TLy.LIZIZ()) {
            String string = getString(R.string.s_5);
            o.LJIIIIZZ(string, "getString(R.string.tikto…orpro_toast_itemsellimit)");
            Activity requireActivity = requireActivity();
            o.LJIIIIZZ(requireActivity, "requireActivity()");
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(string);
            C78915Uy7.LJJIIZI(requireActivity, 3028, creativeToastBuilder);
            return;
        }
        InterfaceC74506TLy interfaceC74506TLy2 = this.LJLJI;
        if (interfaceC74506TLy2 != null && (LIZ = interfaceC74506TLy2.LIZ(myMediaModel, true)) != null) {
            myMediaModel.selectIndex = LIZ.intValue();
            C45800HyG c45800HyG = this.LLFII;
            if (c45800HyG != null) {
                List<MyMediaModel> list = c45800HyG.LJLJJI.LJJJJLI;
                if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        if (o.LJ(((MediaModel) it.next()).id, myMediaModel.id)) {
                            break;
                        }
                    }
                }
                ((ArrayList) c45800HyG.LJLJJI.LJJJJLI).add(myMediaModel);
                if (i >= 0) {
                    c45800HyG.notifyItemChanged(i, new Object());
                } else {
                    c45800HyG.notifyItemChanged(myMediaModel.mediaIndex, new Object());
                }
                if (c45800HyG.LJLJI == 0) {
                    c45800HyG.LJZL();
                }
            }
            ChooseMediaViewModel chooseMediaViewModel = this.LLFF;
            if (chooseMediaViewModel != null) {
                chooseMediaViewModel.Nv0(myMediaModel);
            }
        }
    }

    public final void LLJJI(int i, MyMediaModel myMediaModel) {
        o.LJIIIZ(myMediaModel, "myMediaModel");
        C45800HyG c45800HyG = this.LLFII;
        if (c45800HyG != null) {
            int i2 = myMediaModel.selectIndex;
            Iterator it = ((ArrayList) c45800HyG.LJLJJI.LJJJJLI).iterator();
            MyMediaModel myMediaModel2 = null;
            while (it.hasNext()) {
                MyMediaModel myMediaModel3 = (MyMediaModel) it.next();
                if (o.LJ(myMediaModel.id, myMediaModel3.id)) {
                    myMediaModel3.selectIndex = -1;
                    myMediaModel2 = myMediaModel3;
                }
                int i3 = myMediaModel3.selectIndex;
                if (i3 > i2) {
                    myMediaModel3.selectIndex = i3 - 1;
                }
            }
            if (i >= 0) {
                if (c45800HyG.LJLJI == 0) {
                    if (myMediaModel2 != null) {
                        ((ArrayList) c45800HyG.LJLJJI.LJJJJLI).remove(myMediaModel2);
                    }
                    c45800HyG.notifyItemChanged(i, new Object());
                    c45800HyG.LJZL();
                } else {
                    c45800HyG.LJZI();
                    if (myMediaModel2 != null) {
                        ((ArrayList) c45800HyG.LJLJJI.LJJJJLI).remove(myMediaModel2);
                    }
                }
            } else {
                c45800HyG.LJZI();
                if (myMediaModel2 != null) {
                    ((ArrayList) c45800HyG.LJLJJI.LJJJJLI).remove(myMediaModel2);
                }
            }
        }
        InterfaceC74506TLy interfaceC74506TLy = this.LJLJI;
        if (interfaceC74506TLy != null) {
            interfaceC74506TLy.LIZ(myMediaModel, false);
        }
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        int i2;
        Drawable LIZ;
        C45800HyG c45800HyG;
        LiveData<Object> extraData;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLILLLLZI) {
            this.LLFF = (ChooseMediaViewModel) C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChooseMediaViewModel.class);
        }
        if (C71507S4p.LIZ()) {
            this.LLFFF = (LibraryCategoryViewModel) C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(LibraryCategoryViewModel.class);
        }
        C74577TOr c74577TOr = this.LJLJLJ;
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        c74577TOr.getClass();
        c74577TOr.LJ = uuid;
        ViewGroup viewGroup = this.LJLLILLLL;
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.fqh);
            o.LJIIIIZZ(findViewById, "mRootView.findViewById(R…d.library_list_container)");
            FrameLayout frameLayout = (FrameLayout) findViewById;
            ViewGroup viewGroup2 = this.LJLLILLLL;
            if (viewGroup2 != null) {
                View findViewById2 = viewGroup2.findViewById(R.id.fqm);
                o.LJIIIIZZ(findViewById2, "mRootView.findViewById(R…library_search_container)");
                ViewGroup viewGroup3 = (ViewGroup) findViewById2;
                ViewGroup viewGroup4 = this.LJLLILLLL;
                if (viewGroup4 != null) {
                    View findViewById3 = viewGroup4.findViewById(R.id.fqa);
                    o.LJIIIIZZ(findViewById3, "mRootView.findViewById(R…brary_category_container)");
                    ViewGroup viewGroup5 = (ViewGroup) findViewById3;
                    ViewGroup viewGroup6 = this.LJLLILLLL;
                    if (viewGroup6 != null) {
                        View findViewById4 = viewGroup6.findViewById(R.id.dyl);
                        o.LJIIIIZZ(findViewById4, "mRootView.findViewById(R…rid_view_title_container)");
                        this.LJLZ = findViewById4;
                        if (o.LJ(C43712HDo.LIZJ(this.LJLJJL, false), "toptiktok")) {
                            i = R.string.hr6;
                        } else {
                            i = R.string.hrb;
                        }
                        TextView textView = (TextView) findViewById(R.id.dyk);
                        if (textView != null) {
                            textView.setText(i);
                        }
                        Context context = this.LJLLJ;
                        if (context != null) {
                            TLK<ProviderEffect> LLJILJILJ = LLJILJILJ();
                            TLD tld = (TLD) this.LLIIII.getValue();
                            ViewGroup viewGroup7 = this.LJLLILLLL;
                            if (viewGroup7 != null) {
                                if (C00F.LIZ(31744, 0, "studio_add_tiktok_videos_to_library", true) == 1 || H7X.LIZ()) {
                                    i2 = 3;
                                } else {
                                    i2 = 2;
                                }
                                C74496TLo c74496TLo = new C74496TLo(context, this, LLJILJILJ, tld, viewGroup7, i2, H7X.LIZ(), this.LJLILLLLZI, this.LJLJI, TLF.LJLIL);
                                c74496TLo.LJIILIIL();
                                this.LJLLL = c74496TLo;
                                AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(this, 1202);
                                Context context2 = this.LJLLJ;
                                if (context2 != null) {
                                    TM8 tm8 = new TM8(viewGroup3, aqS162S0100000_12, frameLayout, C45804HyK.LJIJJ(context2), getString(R.string.hr_), false, C58B.LIZ());
                                    tm8.LJ(true);
                                    this.LJLLLL = tm8;
                                    C16880lQ.LJIILJJIL(frameLayout, new ACListenerS32S0100000_12(this, 184));
                                    TM8 tm82 = this.LJLLLL;
                                    if (tm82 != null) {
                                        View view2 = tm82.LJIIIIZZ;
                                        if (view2 != null) {
                                            Context context3 = this.LJLLJ;
                                            if (context3 != null) {
                                                C26338AVi.LJ(view2, 0, Integer.valueOf((int) KL2.LIZJ(context3, -3.0f)), 0, 0, false);
                                                Context context4 = this.LJLLJ;
                                                if (context4 != null) {
                                                    ((C170736mz) view2.findViewById(R.id.f_e)).setBackground(C20110qd.LIZ(context4, R.drawable.b3q));
                                                    view2.findViewById(R.id.avg).setBackground(C20110qd.LIZ(context4, R.drawable.b3p));
                                                    ((TextView) view2.findViewById(R.id.mip)).setHintTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context4));
                                                    ((TextView) view2.findViewById(R.id.mip)).setTextColor(C04330Ez.LIZIZ(context4, R.color.ck));
                                                    View findViewById5 = view2.findViewById(R.id.j5r);
                                                    if (C58B.LIZ()) {
                                                        C110614Vt c110614Vt = new C110614Vt();
                                                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.cj);
                                                        c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                                                        LIZ = C06460Ne.LIZ(view2, "context", c110614Vt);
                                                    } else {
                                                        LIZ = C20110qd.LIZ(context4, R.drawable.av0);
                                                    }
                                                    findViewById5.setBackground(LIZ);
                                                    this.LJZI = view2;
                                                    C74496TLo c74496TLo2 = this.LJLLL;
                                                    if (c74496TLo2 != null) {
                                                        View LJFF = c74496TLo2.LJFF();
                                                        LJFF.findViewById(R.id.kie).setVerticalFadingEdgeEnabled(false);
                                                        frameLayout.addView(LJFF);
                                                        this.LJZ = LJFF;
                                                        this.LJLLLLLL = new C71506S4o(viewGroup5, new AqS162S0100000_12(this, 1203), SceneExtensionsKt.LIZLLL(this));
                                                        if (LLJJIJIIJIL(true)) {
                                                            this.LJLJL.LJ();
                                                        }
                                                        C74496TLo c74496TLo3 = this.LJLLL;
                                                        if (c74496TLo3 != null) {
                                                            AbstractC45801HyH<C157166Eu> abstractC45801HyH = c74496TLo3.LJ;
                                                            if (abstractC45801HyH != null) {
                                                                if (abstractC45801HyH instanceof C45800HyG) {
                                                                    c45800HyG = (C45800HyG) abstractC45801HyH;
                                                                } else {
                                                                    c45800HyG = null;
                                                                }
                                                                this.LLFII = c45800HyG;
                                                                InterfaceC46114I7y interfaceC46114I7y = this.LJLJJI;
                                                                if (interfaceC46114I7y != null) {
                                                                    ViewGroup viewGroup8 = this.LJLLILLLL;
                                                                    if (viewGroup8 != null) {
                                                                        interfaceC46114I7y.LJ(viewGroup8);
                                                                    } else {
                                                                        o.LJIJI("mRootView");
                                                                        throw null;
                                                                    }
                                                                }
                                                                C73318Sq2 c73318Sq2 = this.LJLL;
                                                                C74496TLo c74496TLo4 = this.LJLLL;
                                                                if (c74496TLo4 != null) {
                                                                    C73893SzJ c73893SzJ = c74496TLo4.LJJJJIZL;
                                                                    C73426Srm LIZ2 = IA2.LIZ(c73893SzJ, c73893SzJ);
                                                                    AfS59S0100000_7 afS59S0100000_7 = new AfS59S0100000_7(this, 66);
                                                                    C73982T1u c73982T1u = C73982T1u.LJLIL;
                                                                    c73318Sq2.LIZ(LIZ2.LJJJLIIL(afS59S0100000_7, c73982T1u));
                                                                    if (this.LJLILLLLZI) {
                                                                        C73318Sq2 c73318Sq22 = this.LJLL;
                                                                        C74496TLo c74496TLo5 = this.LJLLL;
                                                                        if (c74496TLo5 != null) {
                                                                            C73893SzJ c73893SzJ2 = c74496TLo5.LJJJJJ;
                                                                            c73318Sq22.LIZ(IA2.LIZ(c73893SzJ2, c73893SzJ2).LJJJLIIL(new AfS59S0100000_7(this, 67), c73982T1u));
                                                                            ChooseMediaViewModel chooseMediaViewModel = this.LLFF;
                                                                            if (chooseMediaViewModel != null) {
                                                                                BaseJediViewModel.Jv0(chooseMediaViewModel, this, new TBT() { // from class: X.Huu
                                                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                                                    public final Object get(Object obj) {
                                                                                        return ((ChooseMediaState) obj).getLibraryDownloadEvent();
                                                                                    }
                                                                                }, new AqS173S0100000_7(this, 364));
                                                                            }
                                                                        } else {
                                                                            o.LJIJI("libraryListView");
                                                                            throw null;
                                                                        }
                                                                    }
                                                                    C73318Sq2 c73318Sq23 = this.LJLL;
                                                                    C74496TLo c74496TLo6 = this.LJLLL;
                                                                    if (c74496TLo6 != null) {
                                                                        c73318Sq23.LIZ(c74496TLo6.LJIIZILJ().LJJJLIIL(new AfS59S0100000_7(this, 68), c73982T1u));
                                                                        C73318Sq2 c73318Sq24 = this.LJLL;
                                                                        C74496TLo c74496TLo7 = this.LJLLL;
                                                                        if (c74496TLo7 != null) {
                                                                            C73893SzJ c73893SzJ3 = c74496TLo7.LJIIJ;
                                                                            c73318Sq24.LIZ(IA2.LIZ(c73893SzJ3, c73893SzJ3).LJJJLIIL(new AfS64S0100000_12(this, 135), c73982T1u));
                                                                            C73318Sq2 c73318Sq25 = this.LJLL;
                                                                            C74496TLo c74496TLo8 = this.LJLLL;
                                                                            if (c74496TLo8 != null) {
                                                                                C73893SzJ c73893SzJ4 = c74496TLo8.LJIIL;
                                                                                c73318Sq25.LIZ(IA2.LIZ(c73893SzJ4, c73893SzJ4).LJJJLIIL(new AfS59S0100000_7(this, 70), c73982T1u));
                                                                                C73318Sq2 c73318Sq26 = this.LJLL;
                                                                                TM8 tm83 = this.LJLLLL;
                                                                                if (tm83 != null) {
                                                                                    C73893SzJ<C35794E3a<String>> c73893SzJ5 = tm83.LJFF;
                                                                                    c73318Sq26.LIZ(IA2.LIZ(c73893SzJ5, c73893SzJ5).LJJJLIIL(new AfS64S0100000_12(this, 132), c73982T1u));
                                                                                    C73318Sq2 c73318Sq27 = this.LJLL;
                                                                                    C74496TLo c74496TLo9 = this.LJLLL;
                                                                                    if (c74496TLo9 != null) {
                                                                                        C73893SzJ c73893SzJ6 = c74496TLo9.LJIILL;
                                                                                        c73318Sq27.LIZ(IA2.LIZ(c73893SzJ6, c73893SzJ6).LJJJLIIL(new AfS64S0100000_12(this, 133), c73982T1u));
                                                                                        C73318Sq2 c73318Sq28 = this.LJLL;
                                                                                        C74496TLo c74496TLo10 = this.LJLLL;
                                                                                        if (c74496TLo10 != null) {
                                                                                            C73893SzJ c73893SzJ7 = c74496TLo10.LJIILLIIL;
                                                                                            c73318Sq28.LIZ(IA2.LIZ(c73893SzJ7, c73893SzJ7).LJJJLIIL(new AfS64S0100000_12(this, 134), c73982T1u));
                                                                                            LibraryCategoryViewModel libraryCategoryViewModel = this.LLFFF;
                                                                                            if (libraryCategoryViewModel != null) {
                                                                                                BaseJediViewModel.Jv0(libraryCategoryViewModel, this, new TBT() { // from class: X.RbJ
                                                                                                    @Override // X.TBT, X.TBZ, X.TBW
                                                                                                    public final Object get(Object obj) {
                                                                                                        return ((LibraryCategoryState) obj).getCurrentCategory();
                                                                                                    }
                                                                                                }, new AqS178S0100000_12(this, 677));
                                                                                            }
                                                                                            TLK<ProviderEffect> LLJILJILJ2 = LLJILJILJ();
                                                                                            if (LLJILJILJ2 != null && (extraData = LLJILJILJ2.getExtraData()) != null) {
                                                                                                extraData.observe(this, new Observer() { // from class: X.95d
                                                                                                    @Override // androidx.lifecycle.Observer
                                                                                                    public final void onChanged(Object obj) {
                                                                                                    }
                                                                                                });
                                                                                                return;
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        o.LJIJI("libraryListView");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("libraryListView");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("searchEntranceView");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("libraryListView");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("libraryListView");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("libraryListView");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("libraryListView");
                                                                throw null;
                                                            }
                                                            o.LJIJI("dataAdapter");
                                                            throw null;
                                                        }
                                                        o.LJIJI("libraryListView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("libraryListView");
                                                    throw null;
                                                }
                                                o.LJIJI("mContext");
                                                throw null;
                                            }
                                            o.LJIJI("mContext");
                                            throw null;
                                        }
                                        o.LJIJI("content");
                                        throw null;
                                    }
                                    o.LJIJI("searchEntranceView");
                                    throw null;
                                }
                                o.LJIJI("mContext");
                                throw null;
                            }
                            o.LJIJI("mRootView");
                            throw null;
                        }
                        o.LJIJI("mContext");
                        throw null;
                    }
                    o.LJIJI("mRootView");
                    throw null;
                }
                o.LJIJI("mRootView");
                throw null;
            }
            o.LJIJI("mRootView");
            throw null;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdi, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        this.LJLLILLLL = viewGroup2;
        Context context = viewGroup2.getContext();
        o.LJIIIIZZ(context, "mRootView.context");
        this.LJLLJ = context;
        ViewGroup viewGroup3 = this.LJLLILLLL;
        if (viewGroup3 != null) {
            return viewGroup3;
        }
        o.LJIJI("mRootView");
        throw null;
    }

    public TM0(CreativeFlowData creativeFlowData, String str, String str2, boolean z, C45483Ht9 c45483Ht9, InterfaceC46114I7y interfaceC46114I7y, String launchLibraryFrom, boolean z2, InterfaceC46115I7z interfaceC46115I7z, int i) {
        C74577TOr creativexMobHelper;
        InterfaceC84498XEg LIZ;
        String str3;
        C45483Ht9 c45483Ht92 = c45483Ht9;
        String str4 = str;
        InterfaceC46115I7z mobHelper = interfaceC46115I7z;
        String str5 = str2;
        boolean z3 = z;
        InterfaceC46114I7y interfaceC46114I7y2 = interfaceC46114I7y;
        CreativeFlowData creativeFlowData2 = (i & 1) != 0 ? null : creativeFlowData;
        str4 = (i & 2) != 0 ? null : str4;
        str5 = (i & 4) != 0 ? null : str5;
        z3 = (i & 8) != 0 ? false : z3;
        c45483Ht92 = (i & 16) != 0 ? null : c45483Ht92;
        interfaceC46114I7y2 = (i & 32) != 0 ? null : interfaceC46114I7y2;
        boolean z4 = (i & 128) == 0 ? z2 : false;
        if ((i & 256) != 0) {
            if (o.LJ(launchLibraryFrom, "Record_Page")) {
                str3 = "video_shoot_page";
            } else {
                str3 = "video_edit_page";
            }
            mobHelper = new C43713HDp(str3, str4, str5, creativeFlowData2, z3);
        }
        if ((i & 512) != 0) {
            creativexMobHelper = new C74577TOr(str5, str4);
        } else {
            creativexMobHelper = null;
        }
        o.LJIIIZ(launchLibraryFrom, "launchLibraryFrom");
        o.LJIIIZ(mobHelper, "mobHelper");
        o.LJIIIZ(creativexMobHelper, "creativexMobHelper");
        this.LJLIL = creativeFlowData2;
        this.LJLILLLLZI = z3;
        this.LJLJI = c45483Ht92;
        this.LJLJJI = interfaceC46114I7y2;
        this.LJLJJL = launchLibraryFrom;
        this.LJLJJLL = z4;
        this.LJLJL = mobHelper;
        this.LJLJLJ = creativexMobHelper;
        this.LJLL = new C73318Sq2();
        if (!z3) {
            Application application = C60903NvH.LJ;
            o.LJIIIIZZ(application, "getApplication()");
            LIZ = C84488XDw.LIZ(application, null);
        } else {
            Application application2 = C60903NvH.LJ;
            o.LJIIIIZZ(application2, "getApplication()");
            LIZ = C84488XDw.LIZ(application2, C43948HMq.LJLIL);
        }
        this.LJLLI = LIZ;
        this.LLFZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1207));
        this.LLI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1212));
        this.LLIFFJFJJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1208));
        this.LLII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1204));
        this.LLIIII = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1205));
    }
}
