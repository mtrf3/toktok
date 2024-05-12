package com.bytedance.android.live.effect.panel;

import X.C0K4;
import X.C0K5;
import X.C0TY;
import X.C10A;
import X.C12890ez;
import X.C15380j0;
import X.C16880lQ;
import X.C1CZ;
import X.C1KS;
import X.C1VF;
import X.C1VK;
import X.C1VL;
import X.C1VM;
import X.C24280xM;
import X.C24290xN;
import X.C259910h;
import X.C28507BGt;
import X.C29306Beo;
import X.C29602Bja;
import X.C2GN;
import X.C30686C2o;
import X.C32011Nl;
import X.C32021Nm;
import X.C35701ag;
import X.C35711ah;
import X.C37301dG;
import X.C43361n2;
import X.C43961o0;
import X.C44171oL;
import X.C47121t6;
import X.C54152Ap;
import X.C76923UGx;
import X.C78880UxY;
import X.C78983UzD;
import X.C80261Vej;
import X.C94433nD;
import X.CCJ;
import X.CN1;
import X.EnumC29596BjU;
import X.EnumC29609Bjh;
import X.InterfaceC24270xL;
import X.InterfaceC30442Bx8;
import X.SJC;
import X.UH2;
import X.XKX;
import Y.IDCListenerS135S0100000;
import Y.IDTListenerS110S0100000;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.OnFilterSelectedByClickEvent;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.api.EffectRedDotStatusChangeEvent;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.live.effect.panel.LiveEffectNewDialogFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveComposerFilterSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveShowEffectDebugViewSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectDowngradeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import ujb.o;

/* loaded from: classes.dex */
public final class LiveEffectNewDialogFragment extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public InterfaceC24270xL<?> LJLIL;
    public C24290xN LJLILLLLZI;
    public C24280xM LJLJI;
    public ComposerFilterViewModel LJLJJI;
    public LiveSmallItemBeautyViewModel LJLJJL;
    public String LJLJJLL;
    public String LJLJL;
    public C43961o0 LJLJLJ;
    public GestureDetector LJLJLLL;
    public int LJLL;
    public long LJLLI;
    public VelocityTracker LJLLILLLL;
    public final float LJLLJ;
    public boolean LJLLL;
    public final Map<Integer, View> LJLLLL = new LinkedHashMap();

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public LiveEffectNewDialogFragment() {
        int LJIIL;
        if (C15380j0.LJIIZILJ()) {
            LJIIL = -C15380j0.LJIIL();
        } else {
            LJIIL = C15380j0.LJIIL();
        }
        this.LJLLJ = LJIIL;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.cy6);
        C78983UzD.LJIILIIL(c28507BGt);
        return c28507BGt;
    }

    public final void vl() {
        boolean z = false;
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment() || LiveEffectDowngradeSetting.INSTANCE.remove()) {
            ((ImageView) _$_findCachedViewById(R.id.iyh)).setVisibility(8);
            _$_findCachedViewById(R.id.iyh).setEnabled(false);
            return;
        }
        String str = this.LJLJL;
        if (str != null && o.LJJJLIIL(str, "beauty", false) && C78880UxY.LJJIIZ() == 0) {
            _$_findCachedViewById(R.id.iyh).setEnabled(false);
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.iyh);
        List<LiveEffect> LIZ = C12890ez.LIZ().LIZ(C0TY.LIZLLL);
        ArrayList LIZIZ = s1.LIZIZ(LIZ, "LiveComposerManagerProvi….SMALL_ITEM_BEAUTY_PANEL)");
        for (LiveEffect liveEffect : LIZ) {
            if (kotlin.jvm.internal.o.LJ(liveEffect.effectPanelName, this.LJLJJLL)) {
                LIZIZ.add(liveEffect);
            }
        }
        if (!LIZIZ.isEmpty()) {
            Iterator it = LIZIZ.iterator();
            while (it.hasNext()) {
                LiveEffect liveEffect2 = (LiveEffect) it.next();
                if (liveEffect2.isExclusive || C12890ez.LIZ().LJIIL(liveEffect2)) {
                    z = true;
                    break;
                }
            }
        }
        _$_findCachedViewById.setEnabled(z);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        C78983UzD.LJJLIIIJJIZ(this);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_BEAUTY_FILTER;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.o.LJIIIZ(dialog, "dialog");
        C12890ez.LIZ().LJJIFFI();
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            C1VL.LJIIL = false;
        }
        InterfaceC24270xL<?> interfaceC24270xL = this.LJLIL;
        if (interfaceC24270xL != null) {
            interfaceC24270xL.release();
            VelocityTracker velocityTracker = this.LJLLILLLL;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
            VelocityTracker velocityTracker2 = this.LJLLILLLL;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
            }
            this.LJLLILLLL = null;
            super.onDismiss(dialog);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.cc0);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.removeOnLayoutChangeListener(this);
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(false, 0, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
            DataChannel dataChannel2 = this.dataChannel;
            InterfaceC30442Bx8.A.LIZ(Boolean.FALSE);
            if (dataChannel2 != null) {
                dataChannel2.pv0(EffectRedDotStatusChangeEvent.class);
            }
            C32011Nl c32011Nl = C32011Nl.LIZ;
            c32011Nl.LIZLLL(false);
            C32011Nl.LJIIIZ(SystemClock.uptimeMillis() - this.LJLLI, this.dataChannel);
            C32011Nl.LJIIJJI();
            c32011Nl.LJFF(this.dataChannel, false);
            c32011Nl.LIZ(this.dataChannel, false);
            c32011Nl.LIZJ(this.dataChannel);
            C32011Nl.LJIIIIZZ(this.dataChannel);
            c32011Nl.LJ();
            C32021Nm c32021Nm = C32021Nm.LIZ;
            c32021Nm.LIZJ("LiveBeautyFilterDialogFragment#onDismiss", false);
            C32021Nm.LJIIIZ();
            c32021Nm.LJI(this.dataChannel, "LiveBeautyFilterDialogFragment#onDismiss", false, this.LJLLL);
            C32021Nm.LJFF(this.dataChannel, "LiveBeautyFilterDialogFragment#onDismiss", false, this.LJLLL);
            C32021Nm.LJIIIIZZ(this.dataChannel, "LiveBeautyFilterDialogFragment#onDismiss");
            C32021Nm.LJ(this.dataChannel);
            C32021Nm.LIZ("LiveBeautyFilterDialogFragment#onDismiss");
            return;
        }
        kotlin.jvm.internal.o.LJIJI("filterHandler");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        InterfaceC24270xL<?> c35711ah;
        kotlin.jvm.internal.o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        C0TY.LJFF = C15380j0.LJIILJJIL(R.string.mgx);
        if (mo49getActivity() != null) {
            C37301dG c37301dG = new C37301dG(new C44171oL(0));
            C30686C2o c30686C2o = C30686C2o.LJLIL;
            this.LJLJJL = (LiveSmallItemBeautyViewModel) new ViewModelProvider(c30686C2o, c37301dG).get(LiveSmallItemBeautyViewModel.class);
            this.LJLJJI = (ComposerFilterViewModel) new ViewModelProvider(c30686C2o, new C1VM(new C1VF(), new C43361n2())).get(ComposerFilterViewModel.class);
        }
        this.LJLLI = SystemClock.uptimeMillis();
        _$_findCachedViewById(R.id.cc0).addOnLayoutChangeListener(this);
        _$_findCachedViewById(R.id.cst).getBackground().setAlpha(255);
        FragmentManager childFragmentManager = getChildFragmentManager();
        kotlin.jvm.internal.o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        this.LJLJLJ = new C43961o0(childFragmentManager);
        ((ViewPager) _$_findCachedViewById(R.id.cso)).setAdapter(this.LJLJLJ);
        ((ViewPager) _$_findCachedViewById(R.id.cso)).addOnPageChangeListener(new C1CZ() { // from class: X.1o2
            @Override // X.C1CZ, X.C0C3
            public final void onPageSelected(int i) {
                CharSequence charSequence;
                String str;
                LiveEffectNewDialogFragment liveEffectNewDialogFragment = LiveEffectNewDialogFragment.this;
                C43961o0 c43961o0 = liveEffectNewDialogFragment.LJLJLJ;
                if (c43961o0 != null) {
                    charSequence = c43961o0.LJIILIIL(i);
                } else {
                    charSequence = null;
                }
                liveEffectNewDialogFragment.LJLJJLL = String.valueOf(charSequence);
                LiveEffectNewDialogFragment liveEffectNewDialogFragment2 = LiveEffectNewDialogFragment.this;
                C43961o0 c43961o02 = liveEffectNewDialogFragment2.LJLJLJ;
                if (c43961o02 != null) {
                    if (i == ((ArrayList) c43961o02.LJLJLJ).size()) {
                        str = "livefilter";
                    } else {
                        str = (String) ListProtector.get(c43961o02.LJLJLLL, i);
                    }
                } else {
                    str = null;
                }
                liveEffectNewDialogFragment2.LJLJL = str;
                if (kotlin.jvm.internal.o.LJ(LiveEffectNewDialogFragment.this.LJLJJLL, C0TY.LJFF)) {
                    InterfaceC24270xL<?> interfaceC24270xL = LiveEffectNewDialogFragment.this.LJLIL;
                    if (interfaceC24270xL != null) {
                        interfaceC24270xL.LIZIZ();
                        C1KS.LIZ(LiveEffectNewDialogFragment.this.dataChannel);
                        C29306Beo.LJI(LiveEffectNewDialogFragment.this._$_findCachedViewById(R.id.iyh));
                    } else {
                        kotlin.jvm.internal.o.LJIJI("filterHandler");
                        throw null;
                    }
                } else {
                    if (LiveBeautyReverseExperiment.INSTANCE.notInExperiment()) {
                        LiveEffectNewDialogFragment liveEffectNewDialogFragment3 = LiveEffectNewDialogFragment.this;
                        C24290xN c24290xN = liveEffectNewDialogFragment3.LJLILLLLZI;
                        if (c24290xN != null) {
                            c24290xN.LIZLLL(liveEffectNewDialogFragment3.LJLJJLL);
                            C29306Beo.LJJLJLI(LiveEffectNewDialogFragment.this._$_findCachedViewById(R.id.iyh));
                        } else {
                            kotlin.jvm.internal.o.LJIJI("smallItemBeautyHandler");
                            throw null;
                        }
                    }
                    String str2 = LiveEffectNewDialogFragment.this.LJLJL;
                    if (str2 != null && o.LJJJLIIL(str2, "beauty", false) && C78880UxY.LJJIIZ() == 0) {
                        LiveEffectNewDialogFragment.this._$_findCachedViewById(R.id.iyh).setEnabled(false);
                    }
                }
                LiveEffectNewDialogFragment.this.vl();
            }
        });
        C80261Vej effect_tab = (C80261Vej) _$_findCachedViewById(R.id.csv);
        kotlin.jvm.internal.o.LJIIIIZZ(effect_tab, "effect_tab");
        C94433nD effect_panel_view_pager = (C94433nD) _$_findCachedViewById(R.id.cso);
        kotlin.jvm.internal.o.LJIIIIZZ(effect_panel_view_pager, "effect_panel_view_pager");
        this.LJLJI = new C24280xM(effect_tab, effect_panel_view_pager, this.dataChannel);
        C16880lQ.LJIILLIIL((ImageView) _$_findCachedViewById(R.id.iyh), new IDCListenerS135S0100000(this, 83));
        ((C0K5) _$_findCachedViewById(R.id.cst)).setErrorClickListener(new C0K4() { // from class: X.1al
            @Override // X.C0K4
            public final void LIZIZ() {
                LiveEffectNewDialogFragment liveEffectNewDialogFragment = LiveEffectNewDialogFragment.this;
                liveEffectNewDialogFragment.getClass();
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveEffectNewDialogFragment), null, null, new C2GL(liveEffectNewDialogFragment, null), 3);
                } else {
                    C15750jb.LIZ.LJIIL(liveEffectNewDialogFragment.dataChannel);
                }
                C0TX.LIZ.LIZJ("LiveBeautyFilterDialogFragment");
                C0TX.LIZLLL = "fetchEffectData";
                C0TX.LIZIZ("try to fetch beauty effect in beauty panel");
                XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(liveEffectNewDialogFragment), null, null, new C2GM(liveEffectNewDialogFragment, null), 3);
            }
        });
        ((C0K5) _$_findCachedViewById(R.id.cst)).LJFF();
        C35701ag c35701ag = null;
        Object[] objArr = 0;
        XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C2GN(this, null), 3);
        if (CCJ.LIZ(getContext())) {
            _$_findCachedViewById(R.id.k5p).setScaleX(-1.0f);
        }
        C76923UGx c76923UGx = (C76923UGx) _$_findCachedViewById(R.id.k5p);
        int LIZIZ = C259910h.LIZIZ(R.attr.eb, getContext());
        int LIZIZ2 = C259910h.LIZIZ(R.attr.dm, getContext());
        int LIZIZ3 = C259910h.LIZIZ(R.attr.cl, getContext());
        c76923UGx.LJLJL = LIZIZ;
        c76923UGx.LJLJLJ = LIZIZ2;
        c76923UGx.LLIILZL = LIZIZ3;
        c76923UGx.setUpUiColor(false);
        ((C76923UGx) _$_findCachedViewById(R.id.k5p)).setOnLevelChangeListener(new UH2() { // from class: X.1o1
            @Override // X.UH1
            public final void LIZ(int i) {
                if (kotlin.jvm.internal.o.LJ(LiveEffectNewDialogFragment.this.LJLJJLL, C0TY.LJFF)) {
                    InterfaceC24270xL<?> interfaceC24270xL = LiveEffectNewDialogFragment.this.LJLIL;
                    if (interfaceC24270xL != null) {
                        interfaceC24270xL.LIZ(i);
                        return;
                    } else {
                        kotlin.jvm.internal.o.LJIJI("filterHandler");
                        throw null;
                    }
                }
                C24290xN c24290xN = LiveEffectNewDialogFragment.this.LJLILLLLZI;
                if (c24290xN != null) {
                    c24290xN.LJ(i);
                    LiveEffectNewDialogFragment.this.vl();
                } else {
                    kotlin.jvm.internal.o.LJIJI("smallItemBeautyHandler");
                    throw null;
                }
            }

            @Override // X.UH2, X.UH1
            public final void LIZIZ(int i) {
                if (!kotlin.jvm.internal.o.LJ(LiveEffectNewDialogFragment.this.LJLJJLL, C0TY.LJFF)) {
                    C24290xN c24290xN = LiveEffectNewDialogFragment.this.LJLILLLLZI;
                    if (c24290xN != null) {
                        c24290xN.LJII(false);
                    } else {
                        kotlin.jvm.internal.o.LJIJI("smallItemBeautyHandler");
                        throw null;
                    }
                }
            }
        });
        this.LJLJLLL = new GestureDetector(getContext(), new SJC() { // from class: X.1ak
            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
                    C1VL.LIZ.LIZIZ(LiveEffectNewDialogFragment.this.dataChannel, true);
                    C1VL.LJIIL = true;
                }
                return super.onDown(motionEvent);
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                LiveEffectNewDialogFragment.this.dismiss();
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                boolean z;
                int i;
                if (motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                float x = motionEvent2.getX() - motionEvent.getX();
                if (Math.abs(motionEvent.getRawX() - motionEvent2.getRawX()) > Math.abs(motionEvent.getRawY() - motionEvent2.getRawY())) {
                    z = true;
                } else {
                    z = false;
                }
                LiveComposerFilterSetting liveComposerFilterSetting = LiveComposerFilterSetting.INSTANCE;
                if (!liveComposerFilterSetting.isComposerSupported() && !C29306Beo.LJJI() && Math.abs(x) > 200.0f && Math.abs(f) > 100.0f) {
                    C73943T0h LIZ = C73943T0h.LIZ();
                    if (x > 0.0f) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    LIZ.LIZIZ(new C11040c0(i));
                    return true;
                }
                if (!liveComposerFilterSetting.isComposerSupported() || !z) {
                    return false;
                }
                C1VL.LIZ.LJII(null);
                return true;
            }

            @Override // X.SJC, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                float abs;
                boolean z;
                if (!LiveComposerFilterSetting.INSTANCE.isComposerSupported() || motionEvent2 == null || motionEvent == null) {
                    return false;
                }
                float rawX = motionEvent.getRawX();
                C1VL c1vl = C1VL.LIZ;
                if (C1VL.LJ) {
                    if (motionEvent2.getRawX() - rawX > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1VL.LJFF = z;
                    c1vl.LIZIZ(LiveEffectNewDialogFragment.this.dataChannel, false);
                    c1vl.LJIIIIZZ();
                }
                if (C1VL.LJFF) {
                    abs = Math.abs(Math.max(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / LiveEffectNewDialogFragment.this.LJLLJ);
                } else {
                    abs = 1 - Math.abs(Math.min(motionEvent2.getRawX() - motionEvent.getRawX(), 0.0f) / LiveEffectNewDialogFragment.this.LJLLJ);
                }
                c1vl.LIZLLL(abs);
                return true;
            }
        });
        _$_findCachedViewById(R.id.cc0).setOnTouchListener(new IDTListenerS110S0100000(this, 8));
        if (LiveComposerFilterSetting.INSTANCE.isComposerSupported()) {
            ComposerFilterViewModel composerFilterViewModel = this.LJLJJI;
            if (composerFilterViewModel != null) {
                DataChannel dataChannel = this.dataChannel;
                C76923UGx small_item_beauty_seek_bar = (C76923UGx) _$_findCachedViewById(R.id.k5p);
                kotlin.jvm.internal.o.LJIIIIZZ(small_item_beauty_seek_bar, "small_item_beauty_seek_bar");
                c35711ah = new C1VK(composerFilterViewModel, dataChannel, this, small_item_beauty_seek_bar, new IDqS420S0100000(this, 55));
            } else {
                kotlin.jvm.internal.o.LJIJI("filterViewModel");
                throw null;
            }
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            C76923UGx small_item_beauty_seek_bar2 = (C76923UGx) _$_findCachedViewById(R.id.k5p);
            kotlin.jvm.internal.o.LJIIIIZZ(small_item_beauty_seek_bar2, "small_item_beauty_seek_bar");
            c35711ah = new C35711ah(dataChannel2, this, small_item_beauty_seek_bar2, new IDqS420S0100000(this, 56));
        }
        this.LJLIL = c35711ah;
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LJLJJL;
        if (liveSmallItemBeautyViewModel != null) {
            DataChannel dataChannel3 = this.dataChannel;
            C43961o0 c43961o0 = this.LJLJLJ;
            C76923UGx small_item_beauty_seek_bar3 = (C76923UGx) _$_findCachedViewById(R.id.k5p);
            kotlin.jvm.internal.o.LJIIIIZZ(small_item_beauty_seek_bar3, "small_item_beauty_seek_bar");
            ImageView reset_view = (ImageView) _$_findCachedViewById(R.id.iyh);
            kotlin.jvm.internal.o.LJIIIIZZ(reset_view, "reset_view");
            C47121t6 debug_view = (C47121t6) _$_findCachedViewById(R.id.c4a);
            kotlin.jvm.internal.o.LJIIIIZZ(debug_view, "debug_view");
            this.LJLILLLLZI = new C24290xN(liveSmallItemBeautyViewModel, dataChannel3, this, c43961o0, c35701ag, objArr == true ? 1 : 0, small_item_beauty_seek_bar3, reset_view, debug_view);
            DataChannel dataChannel4 = this.dataChannel;
            if (dataChannel4 != null) {
                dataChannel4.lv0(this, OnLiveEffectSelectedEvent.class, new IDqS416S0100000(this, 75));
                dataChannel4.lv0(this, OnFilterSelectedByClickEvent.class, new IDqS416S0100000(this, 76));
            }
            if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest() && LiveShowEffectDebugViewSetting.INSTANCE.enable()) {
                C29306Beo.LJJLJLI(_$_findCachedViewById(R.id.c4a));
            } else {
                C29306Beo.LJI(_$_findCachedViewById(R.id.c4a));
            }
            XKX.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C54152Ap(this, null), 3);
            if (LiveEffectDowngradeSetting.INSTANCE.remove() || LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
                C1KS.LIZ(this.dataChannel);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.LJIJI("beautyViewModel");
        throw null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        View view2 = getView();
        if (view2 != null && this.LJLL != (height = view2.getHeight() - _$_findCachedViewById(R.id.cc0).getHeight())) {
            this.LJLL = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.rv0(LiveDialogStatusChannel.class, new C29602Bja(true, height, hashCode(), EnumC29596BjU.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
