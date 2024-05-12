package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC72800Shg;
import X.ActivityC45651qj;
import X.C0A2;
import X.C16880lQ;
import X.C51029K0z;
import X.C73318Sq2;
import X.C73426Srm;
import X.C73849Syb;
import X.C73893SzJ;
import X.C73969T1h;
import X.C74272TCy;
import X.C74275TDb;
import X.C74314TEo;
import X.C76800UCe;
import X.C83547Wqd;
import X.IA2;
import X.InterfaceC65784Pro;
import X.OSZ;
import X.TE0;
import X.TEF;
import X.TEN;
import X.TEW;
import X.TEZ;
import X.TF1;
import X.TF2;
import X.TF4;
import X.TF5;
import X.TF6;
import X.TFJ;
import X.TFK;
import X.TGD;
import X.TGV;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS32S0100000_12;
import Y.AObserverS72S0100000_4;
import Y.AObserverS80S0100000_12;
import Y.ARunnableS48S0100000_12;
import Y.AfS64S0100000_12;
import Y.IDObjectS183S0100000_12;
import Y.IDcS39S0100000_12;
import Y.IDrS50S0100000_12;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SearchStickerViewContainer implements GenericLifecycleObserver, TGV, TextView.OnEditorActionListener {
    public View LJLIL;
    public RelativeLayout LJLILLLLZI;
    public View LJLJI;
    public EditText LJLJJI;
    public TextView LJLJJL;
    public TextView LJLJJLL;
    public RecyclerView LJLJL;
    public LinearLayout LJLJLJ;
    public LinearLayout LJLJLLL;
    public C74272TCy LJLL;
    public TEW LJLLI;
    public RecyclerView LJLLILLLL;
    public TextView LJLLJ;
    public C74272TCy LJLLL;
    public LinearLayout LJLLLL;
    public final TEZ LJLLLLLL;
    public final C73893SzJ<TF6> LJLZ;
    public final C73893SzJ<TFK> LJZ;
    public final MutableLiveData<AbstractC72800Shg> LJZI;
    public final MutableLiveData<Boolean> LJZL;
    public long LL;
    public final AqS162S0100000_12 LLD;
    public int LLF;
    public SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1 LLFF;
    public final C73849Syb<String> LLFFF;
    public String LLFII;
    public final C73318Sq2 LLFZ;
    public final IDcS39S0100000_12 LLI;
    public final ARunnableS48S0100000_12 LLIFFJFJJ;
    public final ActivityC45651qj LLII;
    public final View LLIIII;
    public final TF5 LLIIIILZ;
    public final TF1 LLIIIJ;
    public final int LLIIIL;
    public final int LLIIIZ;
    public final InterfaceC65784Pro<C76800UCe> LLIIJI;
    public final LifecycleOwner LLIIJLIL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestory();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private final void onDestory() {
        this.LLFZ.LIZLLL();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private final void onStop() {
        EditText editText = this.LJLJJI;
        if (editText != null) {
            editText.setText((CharSequence) null);
            LJFF(false);
        } else {
            o.LJIJI("etSearchInput");
            throw null;
        }
    }

    @Override // X.TGV
    public final C73426Srm LIZ() {
        C73893SzJ<TFK> c73893SzJ = this.LJZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final View LJ() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("rootViewInternal");
        throw null;
    }

    public final boolean LJI() {
        Boolean value = this.LJZL.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    public final C73426Srm LJII() {
        C73893SzJ<TF6> c73893SzJ = this.LJLZ;
        return IA2.LIZ(c73893SzJ, c73893SzJ);
    }

    public final void LJIIIIZZ() {
        RecyclerView recyclerView = this.LJLJL;
        if (recyclerView != null) {
            if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
                RecyclerView recyclerView2 = this.LJLJL;
                if (recyclerView2 != null) {
                    C0A2 layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null) {
                        ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(this.LLI);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
                }
                o.LJIJI("rvStickerContent");
                throw null;
            }
            return;
        }
        o.LJIJI("rvStickerContent");
        throw null;
    }

    public final void LJIIJJI() {
        EditText editText = this.LJLJJI;
        if (editText != null) {
            editText.postDelayed(new ARunnableS48S0100000_12(this, 113), 100L);
            TEW tew = this.LJLLI;
            if (tew != null) {
                tew.setState(TEN.NONE);
                LinearLayout linearLayout = this.LJLJLLL;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                    if (o.LJ(this.LLIIIJ.lP(), C74314TEo.LIZ)) {
                        LJIIJ(false, false);
                    }
                    if (this.LLIIIZ == 2) {
                        RecyclerView recyclerView = this.LJLJL;
                        if (recyclerView != null) {
                            recyclerView.LJLI(0);
                        } else {
                            o.LJIJI("rvStickerContent");
                            throw null;
                        }
                    }
                    if (this.LLF <= 0) {
                        View view = this.LJLIL;
                        if (view != null) {
                            view.postDelayed(this.LLIFFJFJJ, 100L);
                            return;
                        } else {
                            o.LJIJI("rootViewInternal");
                            throw null;
                        }
                    }
                    this.LJLZ.onNext(new TF6(true, true, false, ((int) C74275TDb.LIZIZ(this.LLII, 300.0f)) + this.LLF));
                    return;
                }
                o.LJIJI("llStickerContainer");
                throw null;
            }
            o.LJIJI("statusView");
            throw null;
        }
        o.LJIJI("etSearchInput");
        throw null;
    }

    public final boolean LJIIL() {
        C74272TCy c74272TCy = this.LJLL;
        if (c74272TCy != null) {
            if (!c74272TCy.LJLLI) {
                C74272TCy c74272TCy2 = this.LJLLL;
                if (c74272TCy2 != null) {
                    if (!c74272TCy2.LJLLI) {
                        return false;
                    }
                } else {
                    o.LJIJI("recommendAdapter");
                    throw null;
                }
            }
            return true;
        }
        o.LJIJI("stickerAdapter");
        throw null;
    }

    public final boolean LJIILIIL() {
        if (this.LLIIIL == 1) {
            return true;
        }
        return false;
    }

    @Override // X.TGV
    public final void LLZLI() {
        EditText editText = this.LJLJJI;
        if (editText != null) {
            KeyboardUtils.LIZ(this.LLII, editText);
        } else {
            o.LJIJI("etSearchInput");
            throw null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private final void onPause() {
        if (LJI()) {
            EditText editText = this.LJLJJI;
            if (editText != null) {
                KeyboardUtils.LIZ(this.LLII, editText);
            } else {
                o.LJIJI("etSearchInput");
                throw null;
            }
        }
    }

    @Override // X.TGV
    public final MutableLiveData LIZIZ() {
        return this.LJZI;
    }

    public static final /* synthetic */ EditText LIZJ(SearchStickerViewContainer searchStickerViewContainer) {
        EditText editText = searchStickerViewContainer.LJLJJI;
        if (editText != null) {
            return editText;
        }
        o.LJIJI("etSearchInput");
        throw null;
    }

    public final boolean LIZLLL(Effect effect) {
        if (effect == null) {
            effect = this.LJLLLLLL.LLJJIJIIJIL();
        }
        if (effect != null) {
            C74272TCy c74272TCy = this.LJLL;
            if (c74272TCy != null) {
                Iterator it = c74272TCy.LJLILLLLZI.iterator();
                while (it.hasNext()) {
                    if (o.LJ(((com.ss.ugc.effectplatform.model.Effect) it.next()).getId(), effect.getId())) {
                        RecyclerView recyclerView = this.LJLJL;
                        if (recyclerView != null) {
                            if (recyclerView.getVisibility() != 0) {
                                return false;
                            }
                            return true;
                        }
                        o.LJIJI("rvStickerContent");
                        throw null;
                    }
                }
                C74272TCy c74272TCy2 = this.LJLLL;
                if (c74272TCy2 != null) {
                    Iterator it2 = c74272TCy2.LJLILLLLZI.iterator();
                    while (it2.hasNext()) {
                        if (o.LJ(((com.ss.ugc.effectplatform.model.Effect) it2.next()).getId(), effect.getId())) {
                            RecyclerView recyclerView2 = this.LJLLILLLL;
                            if (recyclerView2 != null) {
                                if (recyclerView2.getVisibility() != 0) {
                                    return false;
                                }
                                return true;
                            }
                            o.LJIJI("recommendContent");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("recommendAdapter");
                    throw null;
                }
            } else {
                o.LJIJI("stickerAdapter");
                throw null;
            }
        }
        return false;
    }

    public final void LJFF(boolean z) {
        EditText editText = this.LJLJJI;
        if (editText != null) {
            KeyboardUtils.LIZ(this.LLII, editText);
            this.LJLZ.onNext(new TF6(false, LIZLLL(null), z, ((int) C74275TDb.LIZIZ(this.LLII, 300.0f)) + this.LLF));
            if (z) {
                this.LJZ.onNext(TFJ.LIZ);
                return;
            }
            return;
        }
        o.LJIJI("etSearchInput");
        throw null;
    }

    public final void LJIIIZ(boolean z) {
        EditText editText = this.LJLJJI;
        if (editText != null) {
            String obj = editText.getText().toString();
            if (TextUtils.isEmpty(obj)) {
                return;
            }
            if (z) {
                RecyclerView recyclerView = this.LJLJL;
                if (recyclerView != null) {
                    if (recyclerView.getVisibility() == 0) {
                        EditText editText2 = this.LJLJJI;
                        if (editText2 != null) {
                            KeyboardUtils.LIZ(this.LLII, editText2);
                        } else {
                            o.LJIJI("etSearchInput");
                            throw null;
                        }
                    }
                } else {
                    o.LJIJI("rvStickerContent");
                    throw null;
                }
            }
            System.currentTimeMillis();
            this.LLFFF.onNext(obj);
            return;
        }
        o.LJIJI("etSearchInput");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(boolean r5, boolean r6) {
        /*
            r4 = this;
            if (r5 == 0) goto L7
            X.TF1 r0 = r4.LLIIIJ
            r0.sl()
        L7:
            java.lang.String r3 = "recommendText"
            r2 = 0
            if (r6 == 0) goto L39
            android.widget.EditText r0 = r4.LJLJJI
            if (r0 == 0) goto L5a
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L39
            android.widget.TextView r1 = r4.LJLLJ
            if (r1 == 0) goto L56
            r0 = 2131829787(0x7f11241b, float:1.9292553E38)
            r1.setText(r0)
        L20:
            android.widget.LinearLayout r1 = r4.LJLLLL
            if (r1 == 0) goto L50
            r0 = 0
            r1.setVisibility(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r4.LJLJL
            if (r0 == 0) goto L4a
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r4.LJLJJLL
            if (r0 == 0) goto L44
            r0.setVisibility(r1)
            return
        L39:
            android.widget.TextView r1 = r4.LJLLJ
            if (r1 == 0) goto L60
            r0 = 2131829786(0x7f11241a, float:1.929255E38)
            r1.setText(r0)
            goto L20
        L44:
            java.lang.String r0 = "tvSearchNullResult"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        L4a:
            java.lang.String r0 = "rvStickerContent"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        L50:
            java.lang.String r0 = "recommendViewContainer"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        L56:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        L5a:
            java.lang.String r0 = "etSearchInput"
            kotlin.jvm.internal.o.LJIJI(r0)
            throw r2
        L60:
            kotlin.jvm.internal.o.LJIJI(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer.LJIIJ(boolean, boolean):void");
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        LJIIIZ(true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1, X.0A2] */
    public SearchStickerViewContainer(ActivityC45651qj activity, View contentView, TF5 requiredDependency, TF1 searchListViewModel, int i, int i2, TGD stickerViewConfigure, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, LifecycleOwner lifecycleOwner) {
        View inflate;
        Throwable th;
        LinearLayout linearLayout;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(contentView, "contentView");
        o.LJIIIZ(requiredDependency, "requiredDependency");
        o.LJIIIZ(searchListViewModel, "searchListViewModel");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LLII = activity;
        this.LLIIII = contentView;
        this.LLIIIILZ = requiredDependency;
        this.LLIIIJ = searchListViewModel;
        this.LLIIIL = i;
        this.LLIIIZ = i2;
        this.LLIIJI = interfaceC65784Pro;
        this.LLIIJLIL = lifecycleOwner;
        TEZ tez = requiredDependency.LIZ;
        this.LJLLLLLL = tez;
        this.LJLZ = new C73893SzJ<>();
        this.LJZ = new C73893SzJ<>();
        MutableLiveData<AbstractC72800Shg> mutableLiveData = new MutableLiveData<>();
        this.LJZI = mutableLiveData;
        new MutableLiveData();
        this.LJZL = new MutableLiveData<>();
        this.LLD = new AqS162S0100000_12(this, 918);
        C73849Syb<String> c73849Syb = new C73849Syb<>();
        this.LLFFF = c73849Syb;
        this.LLFII = "";
        C73318Sq2 c73318Sq2 = new C73318Sq2();
        this.LLFZ = c73318Sq2;
        this.LLI = new IDcS39S0100000_12(this, 1);
        this.LLIFFJFJJ = new ARunnableS48S0100000_12(this, 52);
        C74275TDb.LIZIZ(activity, 12);
        if (LJIILIIL()) {
            inflate = contentView;
        } else {
            View findViewById = contentView.findViewById(R.id.kmu);
            if (findViewById != null) {
                inflate = ((ViewStub) findViewById).inflate();
                o.LJIIIIZZ(inflate, "(contentView.findViewByI…r) as ViewStub).inflate()");
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
            }
        }
        this.LJLIL = inflate;
        View findViewById2 = LJ().findViewById(R.id.j5r);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.rl_search_container)");
        this.LJLILLLLZI = (RelativeLayout) findViewById2;
        o.LJIIIIZZ(LJ().findViewById(R.id.jeu), "rootView.findViewById(R.id.search_container_bg)");
        View findViewById3 = LJ().findViewById(R.id.avk);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.btn_clear_search_text)");
        this.LJLJI = findViewById3;
        View findViewById4 = LJ().findViewById(R.id.czw);
        o.LJIIIIZZ(findViewById4, "rootView.findViewById(R.id.et_search_input)");
        this.LJLJJI = (EditText) findViewById4;
        View findViewById5 = LJ().findViewById(R.id.mit);
        o.LJIIIIZZ(findViewById5, "rootView.findViewById(R.id.tv_search_cancel)");
        this.LJLJJL = (TextView) findViewById5;
        View findViewById6 = LJ().findViewById(R.id.mj0);
        o.LJIIIIZZ(findViewById6, "rootView.findViewById(R.id.tv_search_null_result)");
        this.LJLJJLL = (TextView) findViewById6;
        View findViewById7 = LJ().findViewById(R.id.kie);
        o.LJIIIIZZ(findViewById7, "rootView.findViewById(R.id.sticker_list)");
        this.LJLJL = (RecyclerView) findViewById7;
        View findViewById8 = LJ().findViewById(R.id.jg4);
        o.LJIIIIZZ(findViewById8, "rootView.findViewById(R.id.search_info_result_ll)");
        this.LJLJLLL = (LinearLayout) findViewById8;
        View findViewById9 = LJ().findViewById(R.id.kig);
        o.LJIIIIZZ(findViewById9, "rootView.findViewById(R.id.sticker_list_content)");
        this.LJLJLJ = (LinearLayout) findViewById9;
        View findViewById10 = LJ().findViewById(R.id.jfw);
        o.LJIIIIZZ(findViewById10, "rootView.findViewById(R.id.search_guess_container)");
        this.LJLLLL = (LinearLayout) findViewById10;
        View findViewById11 = LJ().findViewById(R.id.j_4);
        o.LJIIIIZZ(findViewById11, "rootView.findViewById(R.id.rv_guess_tag)");
        this.LJLLILLLL = (RecyclerView) findViewById11;
        View findViewById12 = LJ().findViewById(R.id.mix);
        o.LJIIIIZZ(findViewById12, "rootView.findViewById(R.id.tv_search_guess)");
        this.LJLLJ = (TextView) findViewById12;
        View findViewById13 = LJ().findViewById(R.id.jg3);
        o.LJIIIIZZ(findViewById13, "rootView.findViewById(R.…arch_info_result_content)");
        ViewGroup viewGroup = (ViewGroup) findViewById13;
        Map LJJIIZI = C51029K0z.LJJIIZI(new OSZ(TEN.LOADING, new AqS178S0100000_12(this, 694)));
        Context context = viewGroup.getContext();
        o.LJIIIIZZ(context, "root.context");
        TEW tew = new TEW(context, LJJIIZI, TEN.NONE);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C74275TDb.LIZIZ(activity, 100.0f));
        layoutParams.gravity = 48;
        tew.setLayoutParams(layoutParams);
        viewGroup.addView(tew);
        this.LJLLI = tew;
        if (stickerViewConfigure.LJLLI.LJLLILLLL && (linearLayout = (LinearLayout) contentView.findViewById(R.id.crr)) != null) {
            linearLayout.setVisibility(0);
            C16880lQ.LJIIZILJ(linearLayout, new ACListenerS32S0100000_12(this, 187));
        }
        EditText editText = this.LJLJJI;
        if (editText != null) {
            editText.setHint(R.string.g14);
            TextView textView = this.LJLJJL;
            if (textView != null) {
                textView.setText(R.string.cg_);
                TextView textView2 = this.LJLJJLL;
                if (textView2 != null) {
                    textView2.setText(R.string.g10);
                    TextView textView3 = this.LJLLJ;
                    if (textView3 != null) {
                        textView3.setText(R.string.g10);
                        ?? r4 = new LinearLayoutManager() { // from class: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$getLayoutManager$stickerLayoutManager$1
                            @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                            public final boolean LJIL() {
                                return true;
                            }
                        };
                        RecyclerView recyclerView = this.LJLJL;
                        if (recyclerView != 0) {
                            recyclerView.setLayoutManager(r4);
                            RecyclerView recyclerView2 = this.LJLJL;
                            if (recyclerView2 != null) {
                                recyclerView2.setItemViewCacheSize(5);
                                TEF tef = requiredDependency.LJ;
                                TE0 te0 = requiredDependency.LJFF;
                                RecyclerView recyclerView3 = this.LJLJL;
                                if (recyclerView3 != null) {
                                    C74272TCy c74272TCy = new C74272TCy(activity, tez, tef, searchListViewModel, te0, mutableLiveData, recyclerView3.getLayoutManager(), stickerViewConfigure.LJLLI.LJLL, new AqS162S0100000_12(this, 1221));
                                    this.LJLL = c74272TCy;
                                    RecyclerView recyclerView4 = this.LJLJL;
                                    if (recyclerView4 != null) {
                                        recyclerView4.setAdapter(c74272TCy);
                                        this.LLFF = r4;
                                        RecyclerView recyclerView5 = this.LJLJL;
                                        if (recyclerView5 != null) {
                                            recyclerView5.LJIIJJI(new IDrS50S0100000_12(this, 19));
                                            GridLayoutManager gridLayoutManager = new GridLayoutManager() { // from class: com.ss.android.ugc.aweme.sticker.view.internal.search.SearchStickerViewContainer$initRecyclerView$recommendLayoutManager$1
                                                @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
                                                public final boolean LJIL() {
                                                    return ((Boolean) SearchStickerViewContainer.this.LLD.invoke()).booleanValue();
                                                }

                                                {
                                                    super(5, 1, false);
                                                }
                                            };
                                            RecyclerView recyclerView6 = this.LJLLILLLL;
                                            if (recyclerView6 != null) {
                                                recyclerView6.setLayoutManager(gridLayoutManager);
                                                RecyclerView recyclerView7 = this.LJLLILLLL;
                                                if (recyclerView7 != null) {
                                                    recyclerView7.setItemViewCacheSize(5);
                                                    C74272TCy c74272TCy2 = new C74272TCy(activity, tez, requiredDependency.LJ, searchListViewModel, requiredDependency.LJFF, mutableLiveData, this.LLFF, 3, new AqS162S0100000_12(this, 1222));
                                                    this.LJLLL = c74272TCy2;
                                                    RecyclerView recyclerView8 = this.LJLLILLLL;
                                                    if (recyclerView8 != null) {
                                                        recyclerView8.setAdapter(c74272TCy2);
                                                        C16880lQ.LJIIJ(TF4.LJLIL, LJ());
                                                        TextView textView4 = this.LJLJJL;
                                                        if (textView4 != null) {
                                                            C16880lQ.LJIJI(textView4, new ACListenerS32S0100000_12(this, 189));
                                                            EditText editText2 = this.LJLJJI;
                                                            if (editText2 != null) {
                                                                editText2.setOnEditorActionListener(this);
                                                                EditText editText3 = this.LJLJJI;
                                                                if (editText3 != null) {
                                                                    editText3.addTextChangedListener(new IDObjectS183S0100000_12(this, 9));
                                                                    EditText editText4 = this.LJLJJI;
                                                                    if (editText4 != null) {
                                                                        editText4.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS32S0100000_12(this, 190)));
                                                                        View view = this.LJLJI;
                                                                        if (view != null) {
                                                                            C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 186), view);
                                                                            if (!LJIILIIL()) {
                                                                                new C83547Wqd(activity, null).LIZIZ(new TF2(this));
                                                                            }
                                                                            tez.LJIIIIZZ().LIZ().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 129));
                                                                            LinearLayout linearLayout2 = this.LJLLLL;
                                                                            if (linearLayout2 != null) {
                                                                                linearLayout2.setVisibility(0);
                                                                                LinearLayout linearLayout3 = this.LJLLLL;
                                                                                if (linearLayout3 != null) {
                                                                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                                                                                    layoutParams2.leftMargin = 0;
                                                                                    layoutParams2.rightMargin = 0;
                                                                                    linearLayout3.setLayoutParams(layoutParams2);
                                                                                    TextView textView5 = this.LJLLJ;
                                                                                    if (textView5 != null) {
                                                                                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                                                                                        layoutParams3.gravity = 17;
                                                                                        textView5.setLayoutParams(layoutParams3);
                                                                                        TextView textView6 = this.LJLLJ;
                                                                                        if (textView6 != null) {
                                                                                            textView6.setTextSize(14.0f);
                                                                                            TextView textView7 = this.LJLLJ;
                                                                                            if (textView7 != null) {
                                                                                                Context context2 = LJ().getContext();
                                                                                                o.LJIIIIZZ(context2, "rootView.context");
                                                                                                textView7.setTextColor(context2.getResources().getColor(R.color.gf));
                                                                                                RecyclerView recyclerView9 = this.LJLLILLLL;
                                                                                                if (recyclerView9 != null) {
                                                                                                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                                                                                                    Context context3 = LJ().getContext();
                                                                                                    o.LJIIIIZZ(context3, "rootView.context");
                                                                                                    layoutParams4.topMargin = (int) C74275TDb.LIZIZ(context3, 8.0f);
                                                                                                    recyclerView9.setLayoutParams(layoutParams4);
                                                                                                    searchListViewModel.r30().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 130));
                                                                                                    searchListViewModel.HP().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 131));
                                                                                                    searchListViewModel.getPageState().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 132));
                                                                                                    if (!LJIILIIL()) {
                                                                                                        searchListViewModel.WB().observe(lifecycleOwner, new AObserverS80S0100000_12(this, 133));
                                                                                                    }
                                                                                                    searchListViewModel.getKeyword().observe(lifecycleOwner, new AObserverS72S0100000_4(this, 47));
                                                                                                    lifecycleOwner.getLifecycle().addObserver(this);
                                                                                                    c73318Sq2.LIZ(c73849Syb.LJIIL(500L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS64S0100000_12(this, 137)));
                                                                                                    if (LJIILIIL()) {
                                                                                                        LJ().setBackground(null);
                                                                                                        LJ().setVisibility(0);
                                                                                                        TextView textView8 = this.LJLJJL;
                                                                                                        if (textView8 != null) {
                                                                                                            textView8.setVisibility(8);
                                                                                                            RelativeLayout relativeLayout = this.LJLILLLLZI;
                                                                                                            if (relativeLayout != null) {
                                                                                                                ViewGroup.LayoutParams layoutParams5 = relativeLayout.getLayoutParams();
                                                                                                                if (layoutParams5 != null) {
                                                                                                                    LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) layoutParams5;
                                                                                                                    layoutParams6.leftMargin = (int) C74275TDb.LIZIZ(activity, (float) 8.5d);
                                                                                                                    relativeLayout.setLayoutParams(layoutParams6);
                                                                                                                    RecyclerView recyclerView10 = this.LJLJL;
                                                                                                                    if (recyclerView10 != null) {
                                                                                                                        ViewGroup.LayoutParams layoutParams7 = recyclerView10.getLayoutParams();
                                                                                                                        if (layoutParams7 != null) {
                                                                                                                            LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) layoutParams7;
                                                                                                                            layoutParams8.leftMargin = 0;
                                                                                                                            layoutParams8.rightMargin = 0;
                                                                                                                            recyclerView10.setLayoutParams(layoutParams8);
                                                                                                                            EditText editText5 = this.LJLJJI;
                                                                                                                            if (editText5 != null) {
                                                                                                                                editText5.setFocusableInTouchMode(false);
                                                                                                                                th = null;
                                                                                                                            } else {
                                                                                                                                o.LJIJI("etSearchInput");
                                                                                                                                throw null;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        o.LJIJI("rvStickerContent");
                                                                                                                        throw null;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                                                                                                                }
                                                                                                            } else {
                                                                                                                o.LJIJI("rlSearchContainer");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("tvSearchCancel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    } else {
                                                                                                        th = null;
                                                                                                        LJ().setVisibility(8);
                                                                                                        TextView textView9 = this.LJLJJL;
                                                                                                        if (textView9 != null) {
                                                                                                            textView9.setVisibility(0);
                                                                                                            EditText editText6 = this.LJLJJI;
                                                                                                            if (editText6 != null) {
                                                                                                                editText6.setFocusableInTouchMode(true);
                                                                                                            } else {
                                                                                                                o.LJIJI("etSearchInput");
                                                                                                                throw null;
                                                                                                            }
                                                                                                        } else {
                                                                                                            o.LJIJI("tvSearchCancel");
                                                                                                            throw null;
                                                                                                        }
                                                                                                    }
                                                                                                    if (stickerViewConfigure.LJLJJL <= 0) {
                                                                                                        return;
                                                                                                    }
                                                                                                    Context context4 = LJ().getContext();
                                                                                                    o.LJIIIIZZ(context4, "rootView.context");
                                                                                                    int LIZIZ = (int) C74275TDb.LIZIZ(context4, stickerViewConfigure.LJLJJL);
                                                                                                    LinearLayout linearLayout4 = this.LJLJLJ;
                                                                                                    if (linearLayout4 != null) {
                                                                                                        ViewGroup.LayoutParams layoutParams9 = linearLayout4.getLayoutParams();
                                                                                                        if (i2 == 2) {
                                                                                                            Context context5 = LJ().getContext();
                                                                                                            o.LJIIIIZZ(context5, "rootView.context");
                                                                                                            layoutParams9.height = LIZIZ - ((int) C74275TDb.LIZIZ(context5, 24));
                                                                                                        } else {
                                                                                                            Context context6 = LJ().getContext();
                                                                                                            o.LJIIIIZZ(context6, "rootView.context");
                                                                                                            layoutParams9.height = LIZIZ - ((int) C74275TDb.LIZIZ(context6, 68));
                                                                                                        }
                                                                                                        layoutParams9.height = -1;
                                                                                                        LinearLayout linearLayout5 = this.LJLJLJ;
                                                                                                        if (linearLayout5 != null) {
                                                                                                            linearLayout5.setLayoutParams(layoutParams9);
                                                                                                            return;
                                                                                                        } else {
                                                                                                            o.LJIJI("stickerContentRoot");
                                                                                                            throw th;
                                                                                                        }
                                                                                                    }
                                                                                                    o.LJIJI("stickerContentRoot");
                                                                                                    throw th;
                                                                                                }
                                                                                                o.LJIJI("recommendContent");
                                                                                                throw null;
                                                                                            }
                                                                                            o.LJIJI("recommendText");
                                                                                            throw null;
                                                                                        }
                                                                                        o.LJIJI("recommendText");
                                                                                        throw null;
                                                                                    }
                                                                                    o.LJIJI("recommendText");
                                                                                    throw null;
                                                                                }
                                                                                o.LJIJI("recommendViewContainer");
                                                                                throw null;
                                                                            }
                                                                            o.LJIJI("recommendViewContainer");
                                                                            throw null;
                                                                        }
                                                                        o.LJIJI("btnClearSearchText");
                                                                        throw null;
                                                                    }
                                                                    o.LJIJI("etSearchInput");
                                                                    throw null;
                                                                }
                                                                o.LJIJI("etSearchInput");
                                                                throw null;
                                                            }
                                                            o.LJIJI("etSearchInput");
                                                            throw null;
                                                        }
                                                        o.LJIJI("tvSearchCancel");
                                                        throw null;
                                                    }
                                                    o.LJIJI("recommendContent");
                                                    throw null;
                                                }
                                                o.LJIJI("recommendContent");
                                                throw null;
                                            }
                                            o.LJIJI("recommendContent");
                                            throw null;
                                        }
                                        o.LJIJI("rvStickerContent");
                                        throw null;
                                    }
                                    o.LJIJI("rvStickerContent");
                                    throw null;
                                }
                                o.LJIJI("rvStickerContent");
                                throw null;
                            }
                            o.LJIJI("rvStickerContent");
                            throw null;
                        }
                        o.LJIJI("rvStickerContent");
                        throw null;
                    }
                    o.LJIJI("recommendText");
                    throw null;
                }
                o.LJIJI("tvSearchNullResult");
                throw null;
            }
            o.LJIJI("tvSearchCancel");
            throw null;
        }
        o.LJIJI("etSearchInput");
        throw null;
    }
}
