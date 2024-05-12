package X;

import Y.ACListenerS22S0100000_2;
import Y.AObserverS70S0100000_2;
import Y.ARunnableS38S0100000_2;
import Y.IDiS266S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectCategoryResponseTemplate;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS27S1000000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6db, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164916db extends ConstraintLayout {
    public static final /* synthetic */ int LJLZ = 0;
    public final VideoPublishEditModel LJLIL;
    public final WM7 LJLILLLLZI;
    public final C164926dc LJLJI;
    public final InterfaceC165006dk LJLJJI;
    public final InterfaceC153045zY LJLJJL;
    public final HQ7 LJLJJLL;
    public C73305Spp LJLJL;
    public FrameLayout LJLJLJ;
    public View LJLJLLL;
    public C80700Vlo LJLL;
    public ViewPager LJLLI;
    public C164986di LJLLILLLL;
    public final C170206m8 LJLLJ;
    public final EditEffectVideoModel LJLLL;
    public List<EffectCategoryResponse> LJLLLL;
    public final Keva LJLLLLLL;

    public final void LJJLJLI() {
        int i;
        boolean z;
        C80700Vlo c80700Vlo = this.LJLL;
        if (c80700Vlo != null) {
            c80700Vlo.LJIILJJIL();
            C80700Vlo c80700Vlo2 = this.LJLL;
            if (c80700Vlo2 != null) {
                C78897Uxp.LJJJJZ(c80700Vlo2, this.LJLLLL.size());
                C80700Vlo c80700Vlo3 = this.LJLL;
                if (c80700Vlo3 != null) {
                    c80700Vlo3.setSupportCustomIndicator(false);
                    C80700Vlo c80700Vlo4 = this.LJLL;
                    if (c80700Vlo4 != null) {
                        c80700Vlo4.LLIIJLIL = new InterfaceC80707Vlv() { // from class: X.6de
                            @Override // X.InterfaceC80707Vlv
                            public final void LIZ(C164456cr c164456cr) {
                            }

                            @Override // X.InterfaceC80707Vlv
                            public final void LIZIZ(C164456cr c164456cr) {
                            }

                            @Override // X.InterfaceC80707Vlv
                            public final void LIZJ(C164456cr c164456cr, boolean z2) {
                                if (c164456cr != null) {
                                    int i2 = c164456cr.LIZJ;
                                    C164916db c164916db = C164916db.this;
                                    if (!z2) {
                                        ViewPager viewPager = c164916db.LJLLI;
                                        if (viewPager != null) {
                                            viewPager.setCurrentItem(i2, true);
                                            View view = c164456cr.LIZLLL;
                                            o.LJII(view, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.style.StyleTabItemView");
                                            ((THN) view).LIZ(false);
                                            return;
                                        }
                                        o.LJIJI("viewPager");
                                        throw null;
                                    }
                                }
                            }
                        };
                        if (!this.LJLLLL.isEmpty()) {
                            Iterator<EffectCategoryResponse> it = this.LJLLLL.iterator();
                            int i2 = 0;
                            loop0: while (true) {
                                if (it.hasNext()) {
                                    List<Effect> totalEffects = it.next().getTotalEffects();
                                    if (!(totalEffects instanceof Collection) || !totalEffects.isEmpty()) {
                                        Iterator<Effect> it2 = totalEffects.iterator();
                                        while (it2.hasNext()) {
                                            if (o.LJ(it2.next().getEffectId(), this.LJLLL.iv0().getValue())) {
                                                break loop0;
                                            }
                                        }
                                    }
                                    i2++;
                                } else {
                                    i2 = -1;
                                    break;
                                }
                            }
                            i = Math.max(0, i2);
                        } else {
                            i = 0;
                        }
                        int i3 = 0;
                        for (EffectCategoryResponse effectCategoryResponse : this.LJLLLL) {
                            int i4 = i3 + 1;
                            if (i3 >= 0) {
                                EffectCategoryResponse effectCategoryResponse2 = effectCategoryResponse;
                                String name = effectCategoryResponse2.getName();
                                Context context = getContext();
                                o.LJIIIIZZ(context, "context");
                                THN LIZ = C163486bI.LIZ(context);
                                LIZ.setTextVisibility(false);
                                LIZ.setText(name);
                                if (o.LJ(effectCategoryResponse2.getKey(), "trick_effects") && C164966dg.LIZ && C164956df.LIZ && this.LJLLLLLL.getBoolean("SHOW_FIRST_TIME", true)) {
                                    LIZ.LIZ(true);
                                    this.LJLLLLLL.storeBoolean("SHOW_FIRST_TIME", false);
                                }
                                C80700Vlo c80700Vlo5 = this.LJLL;
                                if (c80700Vlo5 != null) {
                                    C164456cr LJIIL = c80700Vlo5.LJIIL();
                                    LJIIL.LJ = false;
                                    LJIIL.LIZLLL = LIZ;
                                    LJIIL.LIZIZ();
                                    C80700Vlo c80700Vlo6 = this.LJLL;
                                    if (c80700Vlo6 != null) {
                                        if (i3 == i) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c80700Vlo6.LIZLLL(LJIIL, z);
                                        i3 = i4;
                                    } else {
                                        o.LJIJI("tablayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("tablayout");
                                    throw null;
                                }
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                        if (i < this.LJLLLL.size()) {
                            this.LJLLL.nv0().setValue(new C5M2(i, (EffectCategoryResponse) ListProtector.get(this.LJLLLL, i), null));
                            InterfaceC165006dk interfaceC165006dk = this.LJLJJI;
                            if (interfaceC165006dk != null) {
                                interfaceC165006dk.LJIIIZ(new C5M2(i, (EffectCategoryResponse) ListProtector.get(this.LJLLLL, i), null));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    o.LJIJI("tablayout");
                    throw null;
                }
                o.LJIJI("tablayout");
                throw null;
            }
            o.LJIJI("tablayout");
            throw null;
        }
        o.LJIJI("tablayout");
        throw null;
    }

    public final void LJJLL() {
        ViewPager viewPager = this.LJLLI;
        if (viewPager != null) {
            viewPager.removeAllViews();
            ViewPager viewPager2 = this.LJLLI;
            if (viewPager2 != null) {
                C80700Vlo c80700Vlo = this.LJLL;
                if (c80700Vlo != null) {
                    viewPager2.addOnPageChangeListener(new C80697Vll(c80700Vlo));
                    ViewPager viewPager3 = this.LJLLI;
                    if (viewPager3 != null) {
                        viewPager3.addOnPageChangeListener(new IDiS266S0100000_2(this, 6));
                        ViewPager viewPager4 = this.LJLLI;
                        if (viewPager4 != null) {
                            viewPager4.setOffscreenPageLimit(this.LJLJI.LJIJJ);
                            ViewPager viewPager5 = this.LJLLI;
                            if (viewPager5 != null) {
                                viewPager5.setAdapter(this.LJLLILLLL);
                                C164986di c164986di = this.LJLLILLLL;
                                if (c164986di != null) {
                                    List<EffectCategoryResponse> data = this.LJLLLL;
                                    o.LJIIIZ(data, "data");
                                    ((ArrayList) c164986di.LJLJLLL).clear();
                                    c164986di.LJLJLLL = ORZ.LLJILJILJ(data);
                                    ((ArrayList) c164986di.LJLJLJ).clear();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it = ((ArrayList) c164986di.LJLJLLL).iterator();
                                    while (it.hasNext()) {
                                        arrayList.addAll(((EffectCategoryResponseTemplate) it.next()).getTotalEffects());
                                    }
                                    int i = c164986di.LJLJI.LJIJJLI;
                                    if (i >= 0) {
                                        for (int i2 = 0; i2 < i && i2 < arrayList.size(); i2++) {
                                            Effect effect = (Effect) ListProtector.get(arrayList, i2);
                                            c164986di.LJLLI.getValue().getClass();
                                            if (!C84507XEp.LJ(effect)) {
                                                ((ArrayList) c164986di.LJLJLJ).add(effect);
                                            }
                                        }
                                    }
                                    ((C84507XEp) c164986di.LJLLI.getValue()).LJIIIIZZ(c164986di.LJLJLJ);
                                    c164986di.notifyDataSetChanged();
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("viewPager");
                            throw null;
                        }
                        o.LJIJI("viewPager");
                        throw null;
                    }
                    o.LJIJI("viewPager");
                    throw null;
                }
                o.LJIJI("tablayout");
                throw null;
            }
            o.LJIJI("viewPager");
            throw null;
        }
        o.LJIJI("viewPager");
        throw null;
    }

    public final void LJJZ() {
        boolean z;
        if (((ArrayList) this.LJLLLL).isEmpty()) {
            return;
        }
        List<EffectCategoryResponse> data = this.LJLLLL;
        C164926dc config = this.LJLJI;
        VideoPublishEditModel mModel = this.LJLIL;
        WM7 scene = this.LJLILLLLZI;
        o.LJIIIZ(data, "data");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(mModel, "mModel");
        o.LJIIIZ(scene, "scene");
        if (C5OL.LIZ(mModel)) {
            ORS.LJJLIL(new AqS27S1000000_2("sticker", 5), data);
        }
        if (!config.LJIIL) {
            ORS.LJJLIL(new AqS27S1000000_2("motion", 5), data);
        }
        boolean LIZ = C138645cK.LIZ();
        if (C138645cK.LIZ() && !mModel.isMvThemeVideoType()) {
            z = true;
        } else {
            z = false;
        }
        C5OL.LIZJ(LIZ, z, config.LJIILJJIL, data);
        if (config.LJIIJJI.invoke().booleanValue()) {
            EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, 1, null);
            String string = C60903NvH.LJ.getString(R.string.s0m);
            o.LJIIIIZZ(string, "getApplication().getString(R.string.tab_time)");
            effectCategoryResponse.setName(string);
            effectCategoryResponse.setKey("time");
            ((ArrayList) data).add(effectCategoryResponse);
        } else {
            ArrayList arrayList = (ArrayList) data;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (o.LJ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) next).getKey(), "time")) {
                    if (next != null) {
                        arrayList.remove(next);
                    }
                }
            }
        }
        LJJLL();
        LJJLJLI();
    }

    public final AbstractC170376mP getCurrentPage() {
        C164986di c164986di = this.LJLLILLLL;
        if (c164986di != null) {
            return c164986di.LJLJL;
        }
        return null;
    }

    public final C164926dc getConfig() {
        return this.LJLJI;
    }

    public final VideoPublishEditModel getEditModel() {
        return this.LJLIL;
    }

    public final InterfaceC165006dk getPanelListener() {
        return this.LJLJJI;
    }

    public final WM7 getRootScene() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC153045zY getVeEditor() {
        return this.LJLJJL;
    }

    public final void LJJZZI(final boolean z) {
        ((LiveData) this.LJLLL.LJLIL.getValue()).setValue(Boolean.TRUE);
        if (this.LJLJI.LIZ != null) {
            MutableLiveData<String> iv0 = this.LJLLL.iv0();
            String str = this.LJLJI.LIZ.LIZIZ;
            if (str == null) {
                str = "";
            }
            iv0.setValue(str);
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<EffectPointModel> effectList = this.LJLIL.getEffectList();
        o.LJIIIIZZ(effectList, "editModel.effectList");
        Iterator<EffectPointModel> it = effectList.iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            o.LJIIIIZZ(key, "it.key");
            linkedHashMap.put(key, "");
        }
        if (!C5OL.LIZIZ().isEmpty()) {
            LJL(C5OL.LIZIZ(), linkedHashMap);
            if (z) {
                post(new ARunnableS38S0100000_2(this, 169));
                return;
            }
            return;
        }
        this.LJLLJ.LIZ(new IFetchEffectChannelListener() { // from class: X.6dd
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener
            public final void onFail(ExceptionResult e) {
                o.LJIIIZ(e, "e");
                C164916db.this.LJL(new ArrayList(), linkedHashMap);
                Activity activity = C164916db.this.getRootScene().mActivity;
                if (activity != null) {
                    C24540xm.LIZ(R.string.rjt, activity, 6001);
                }
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                EffectChannelResponse response = effectChannelResponse;
                o.LJIIIZ(response, "response");
                C164916db.this.LJL(response.getCategoryResponseList(), linkedHashMap);
                if (z) {
                    C164916db c164916db = C164916db.this;
                    c164916db.getClass();
                    c164916db.post(new ARunnableS38S0100000_2(c164916db, 169));
                }
            }
        });
    }

    public final void LJLI(boolean z) {
        if (this.LJLLLL.isEmpty()) {
            return;
        }
        Iterator<EffectCategoryResponse> it = this.LJLLLL.iterator();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (C164996dj.LIZJ(it.next().getKey())) {
                    if (i >= 0) {
                        z2 = true;
                    }
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (!z) {
            if (z2) {
                ListProtector.remove(this.LJLLLL, i);
                LJJLL();
                LJJLJLI();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        LJJZ();
    }

    public final void LJLIIIL(String str) {
        Integer valueOf;
        C170336mL c170336mL;
        int i = -1;
        int i2 = 0;
        if (o.LJ(str, "time")) {
            Iterator it = ((ArrayList) this.LJLLLL).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) it.next()).getKey(), str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            C164986di c164986di = this.LJLLILLLL;
            if (c164986di != null) {
                AbstractC170376mP abstractC170376mP = c164986di.LJLJJLL.get(i);
                if ((abstractC170376mP instanceof C170336mL) && (c170336mL = (C170336mL) abstractC170376mP) != null) {
                    c170336mL.LJIIJ(null);
                    return;
                }
                return;
            }
            return;
        }
        if (str == null) {
            C5M2 value = this.LJLLL.nv0().getValue();
            if (value == null) {
                return;
            } else {
                valueOf = Integer.valueOf(value.LIZ);
            }
        } else {
            Iterator it2 = ((ArrayList) this.LJLLLL).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (o.LJ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) it2.next()).getKey(), str)) {
                    i = i2;
                    break;
                }
                i2++;
            }
            valueOf = Integer.valueOf(i);
        }
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        this.LJLLL.iv0().setValue("");
        C164986di c164986di2 = this.LJLLILLLL;
        if (c164986di2 == null) {
            return;
        }
        c164986di2.LJJIII(intValue);
    }

    public final void setLoadingVisible(boolean z) {
        int i;
        if (this.LJLJI.LIZLLL) {
            if (z) {
                C73305Spp c73305Spp = this.LJLJL;
                if (c73305Spp != null) {
                    c73305Spp.LJFF();
                }
                i = 0;
            } else {
                i = 8;
            }
            C73305Spp c73305Spp2 = this.LJLJL;
            if (c73305Spp2 != null) {
                c73305Spp2.setVisibility(i);
            }
        }
        if (z) {
            View view = this.LJLJLLL;
            if (view != null) {
                view.setVisibility(4);
                return;
            } else {
                o.LJIJI("tabContainer");
                throw null;
            }
        }
        View view2 = this.LJLJLLL;
        if (view2 != null) {
            view2.setVisibility(0);
        } else {
            o.LJIJI("tabContainer");
            throw null;
        }
    }

    public final void LJJZZIII(String effectId, String str) {
        C170336mL c170336mL;
        o.LJIIIZ(effectId, "effectId");
        Iterator it = ((ArrayList) this.LJLLLL).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(((com.ss.ugc.effectplatform.model.EffectCategoryResponse) it.next()).getKey(), str)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        if (o.LJ(str, "time")) {
            C164986di c164986di = this.LJLLILLLL;
            if (c164986di != null) {
                AbstractC170376mP abstractC170376mP = c164986di.LJLJJLL.get(i);
                if ((abstractC170376mP instanceof C170336mL) && (c170336mL = (C170336mL) abstractC170376mP) != null) {
                    c170336mL.LJIIJ(effectId);
                    return;
                }
                return;
            }
            return;
        }
        this.LJLLL.iv0().setValue(effectId);
        C164986di c164986di2 = this.LJLLILLLL;
        if (c164986di2 == null) {
            return;
        }
        c164986di2.LJJIII(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        if (X.C44687HgJ.LIZIZ(X.X1D.LIZIZ(r0)) == false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0223, code lost:
    
        if (X.C53578L1a.LIZ() == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(java.util.List<com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse> r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C164916db.LJL(java.util.List, java.util.Map):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C164916db(VideoPublishEditModel editModel, WM7 rootScene, Context context, C164926dc config, InterfaceC165006dk interfaceC165006dk, InterfaceC153045zY interfaceC153045zY, HQ7 accountService) {
        super(context, null);
        int i;
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(accountService, "accountService");
        new LinkedHashMap();
        this.LJLIL = editModel;
        this.LJLILLLLZI = rootScene;
        this.LJLJI = config;
        this.LJLJJI = interfaceC165006dk;
        this.LJLJJL = interfaceC153045zY;
        this.LJLJJLL = accountService;
        this.LJLLJ = new C170206m8(1);
        EditEffectVideoModel editEffectVideoModel = (EditEffectVideoModel) C165706es.LJIIIIZZ(rootScene, null, null, 6).get(EditEffectVideoModel.class);
        this.LJLLL = editEffectVideoModel;
        this.LJLLLL = new ArrayList();
        this.LJLLLLLL = Keva.getRepo("FIRST_TIME_TRICK_STYLE");
        C16880lQ.LLLZIIL(R.layout.arl, C16880lQ.LLZIL(getContext()), this);
        View findViewById = findViewById(R.id.csm);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.effect_panel_layout)");
        this.LJLJLJ = (FrameLayout) findViewById;
        View findViewById2 = findViewById(R.id.kyc);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.tab_container)");
        this.LJLJLLL = findViewById2;
        findViewById2.getLayoutParams().height = (int) C170576mj.LIZ(getContext(), config.LJFF);
        View findViewById3 = findViewById(R.id.kzb);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.tablayout)");
        this.LJLL = (C80700Vlo) findViewById3;
        View findViewById4 = findViewById(R.id.ncx);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.viewpager)");
        ViewPager viewPager = (ViewPager) findViewById4;
        this.LJLLI = viewPager;
        if (config.LJIIIIZZ) {
            C26338AVi.LJIIIZ(viewPager, null, Integer.valueOf((int) C170576mj.LIZ(viewPager.getContext(), 4.0f)), null, null, 29);
        }
        if (config.LIZ != null) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI = C79045V0n.LJI(R.attr.cb, context2);
            if (LJI != null) {
                int intValue = LJI.intValue();
                View view = this.LJLJLLL;
                if (view != null) {
                    view.setBackgroundColor(intValue);
                } else {
                    o.LJIJI("tabContainer");
                    throw null;
                }
            }
        }
        C80700Vlo c80700Vlo = this.LJLL;
        if (c80700Vlo != null) {
            c80700Vlo.setTabMargin(0);
            View findViewById5 = findViewById(R.id.kyw);
            View findViewById6 = findViewById(R.id.eja);
            TuxIconView tuxIconView = (TuxIconView) findViewById6;
            if (config.LJI) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
            findViewById5.setVisibility(tuxIconView.getVisibility());
            C16880lQ.LJJJ(tuxIconView, new ACListenerS22S0100000_2(this, 137));
            o.LJIIIIZZ(findViewById6, "findViewById<TuxIconView…)\n            }\n        }");
            View findViewById7 = findViewById(R.id.ej5);
            TuxIconView tuxIconView2 = (TuxIconView) findViewById7;
            tuxIconView2.setVisibility(config.LJII ? 0 : 8);
            C16880lQ.LJJJ(tuxIconView2, new ACListenerS22S0100000_2(this, 138));
            o.LJIIIIZZ(findViewById7, "findViewById<TuxIconView…)\n            }\n        }");
            this.LJLJL = (C73305Spp) findViewById(R.id.csi);
            C5SC.LJFF();
            ((LiveData) editEffectVideoModel.LJLIL.getValue()).observe(rootScene, new AObserverS70S0100000_2(this, 285));
            LJJZZI(false);
            return;
        }
        o.LJIJI("tablayout");
        throw null;
    }
}
