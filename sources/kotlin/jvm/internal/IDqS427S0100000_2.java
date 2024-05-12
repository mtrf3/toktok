package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass523;
import X.C124574uj;
import X.C126784yI;
import X.C127594zb;
import X.C1293955z;
import X.C132005Ga;
import X.C134855Qz;
import X.C135125Sa;
import X.C223338pd;
import X.C26045AKb;
import X.C50Q;
import X.C51W;
import X.C55953Lxd;
import X.C5FJ;
import X.C5TK;
import X.C6ZI;
import X.C6ZT;
import X.C71897SJp;
import X.C76800UCe;
import X.C78966Uyw;
import X.C79057V0z;
import X.C84654XKg;
import X.EnumC123864ta;
import X.FFL;
import X.H7C;
import X.InterfaceC67352kd;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.OSJ;
import X.X1D;
import Y.ALAdapterS1S0100000_2;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLESegmentTextSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AudioBeatsPanelFragment;
import com.ss.android.ugc.gamora.editorpro.datastore.EditModelProvider;
import com.ss.ugc.android.editor.bottom.functionbar.HorizontalFuncBarFragment;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class IDqS427S0100000_2 extends AbstractC65781Prl implements InterfaceC88473Ynt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case 9:
                return invoke$9(this, obj, obj2, obj3);
            case 10:
                return invoke$10(this, obj, obj2, obj3);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(C51W c51w, int i) {
        super(3);
        this.$t = i;
        this.l0 = c51w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(C1293955z c1293955z, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1293955z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(C5TK c5tk, int i) {
        super(3);
        this.$t = i;
        this.l0 = c5tk;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(C84654XKg c84654XKg, int i) {
        super(3);
        this.$t = i;
        this.l0 = c84654XKg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS427S0100000_2(InterfaceC88473Ynt interfaceC88473Ynt, InterfaceC88473Ynt<? super Integer, ? super Exception, ? super String, C76800UCe> interfaceC88473Ynt2) {
        super(3);
        this.$t = interfaceC88473Ynt2;
        this.l0 = interfaceC88473Ynt;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IDqS427S0100000_2(InterfaceC88474Ynu interfaceC88474Ynu, InterfaceC88474Ynu<? super List<? extends Effect>, ? super Boolean, ? super Integer, ? super String, C76800UCe> interfaceC88474Ynu2) {
        super(3);
        this.$t = interfaceC88474Ynu2;
        this.l0 = interfaceC88474Ynu;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(AudioBeatsPanelFragment audioBeatsPanelFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = audioBeatsPanelFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(HorizontalFuncBarFragment horizontalFuncBarFragment, int i) {
        super(3);
        this.$t = i;
        this.l0 = horizontalFuncBarFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDqS427S0100000_2(IDqS427S0100000_2 iDqS427S0100000_2, int i) {
        super(3);
        this.$t = i;
        this.l0 = iDqS427S0100000_2;
    }

    public static final Object invoke$0(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        C78966Uyw.LJJL(null, (InterfaceC67352kd) iDqS427S0100000_2.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        C5FJ scrollState = (C5FJ) obj3;
        o.LJIIIZ(scrollState, "scrollState");
        C5TK c5tk = (C5TK) iDqS427S0100000_2.l0;
        c5tk.LJLLILLLL = scrollState;
        c5tk.getUiActions().LJLJL.invoke(scrollState);
        if (scrollState == C5FJ.IDLE) {
            float f = intValue;
            if (((C5TK) iDqS427S0100000_2.l0).LJLJL != null) {
                ((C5TK) iDqS427S0100000_2.l0).LJLJI.LJIIJJI.LIZ(f / r0.getMaxScrollWidth(), true);
                ((C5TK) iDqS427S0100000_2.l0).LJLJI.LIZ();
            } else {
                o.LJIJI("audioRecordWaveGroup");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$10(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        String str;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        List<Integer> result = (List) obj3;
        o.LJIIIZ(result, "result");
        if (((AudioBeatsPanelFragment) iDqS427S0100000_2.l0).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            AudioBeatsPanelFragment audioBeatsPanelFragment = (AudioBeatsPanelFragment) iDqS427S0100000_2.l0;
            audioBeatsPanelFragment.LLIIIJ = false;
            audioBeatsPanelFragment._$_findCachedViewById(R.id.aum).setVisibility(0);
            audioBeatsPanelFragment._$_findCachedViewById(R.id.gqk).setVisibility(4);
            ((C223338pd) audioBeatsPanelFragment._$_findCachedViewById(R.id.gqj)).setVisibility(4);
            ((C223338pd) audioBeatsPanelFragment._$_findCachedViewById(R.id.gqj)).LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("generateAutoBeats finish isSuccess:");
            LIZ.append(booleanValue);
            H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
            if (booleanValue) {
                ((C71897SJp) ((AudioBeatsPanelFragment) iDqS427S0100000_2.l0)._$_findCachedViewById(R.id.b7c)).setChecked(true);
                AudioBeatsPanelFragment audioBeatsPanelFragment2 = (AudioBeatsPanelFragment) iDqS427S0100000_2.l0;
                audioBeatsPanelFragment2.LLIIII = result;
                audioBeatsPanelFragment2.sm();
            } else {
                if (!booleanValue2) {
                    ActivityC45651qj requireActivity = ((AudioBeatsPanelFragment) iDqS427S0100000_2.l0).requireActivity();
                    o.LJIIIIZZ(requireActivity, "requireActivity()");
                    C26045AKb c26045AKb = new C26045AKb(requireActivity);
                    ActivityC45651qj mo49getActivity = ((AudioBeatsPanelFragment) iDqS427S0100000_2.l0).mo49getActivity();
                    if (mo49getActivity == null || (str = mo49getActivity.getString(R.string.rh2)) == null) {
                        str = "";
                    }
                    c26045AKb.LJIIIZ(str);
                    c26045AKb.LJIIJ();
                }
                ((C71897SJp) ((AudioBeatsPanelFragment) iDqS427S0100000_2.l0)._$_findCachedViewById(R.id.b7c)).setChecked(false);
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$11(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        View mainMenu = (View) obj;
        View subMenu = (View) obj2;
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        o.LJIIIZ(mainMenu, "mainMenu");
        o.LJIIIZ(subMenu, "subMenu");
        C1293955z c1293955z = (C1293955z) iDqS427S0100000_2.l0;
        c1293955z.getClass();
        mainMenu.setVisibility(0);
        subMenu.setVisibility(0);
        if (booleanValue) {
            mainMenu.setTranslationY(0.0f);
            subMenu.setTranslationY(C134855Qz.LIZ(82.0f));
            ViewPropertyAnimator viewPropertyAnimator = c1293955z.LIZIZ;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            ViewPropertyAnimator animate = mainMenu.animate();
            animate.setInterpolator(C55953Lxd.LJ());
            animate.translationYBy(C134855Qz.LIZ(82.0f));
            animate.alpha(0.0f);
            animate.setDuration(200L);
            animate.setListener(new ALAdapterS1S0100000_2(c1293955z, 47));
            animate.start();
            c1293955z.LIZIZ = animate;
            ViewPropertyAnimator viewPropertyAnimator2 = c1293955z.LIZLLL;
            if (viewPropertyAnimator2 != null) {
                viewPropertyAnimator2.cancel();
            }
            ViewPropertyAnimator animate2 = subMenu.animate();
            animate2.setInterpolator(C55953Lxd.LJ());
            animate2.translationYBy(C134855Qz.LIZ(-82.0f));
            animate2.alpha(1.0f);
            animate2.setDuration(200L);
            animate2.setListener(new ALAdapterS1S0100000_2(c1293955z, 50));
            animate2.start();
            c1293955z.LIZLLL = animate2;
        } else {
            mainMenu.setTranslationY(C134855Qz.LIZ(82.0f));
            subMenu.setTranslationY(0.0f);
            ViewPropertyAnimator viewPropertyAnimator3 = c1293955z.LIZJ;
            if (viewPropertyAnimator3 != null) {
                viewPropertyAnimator3.cancel();
            }
            ViewPropertyAnimator animate3 = mainMenu.animate();
            animate3.setInterpolator(C55953Lxd.LJ());
            animate3.translationYBy(C134855Qz.LIZ(-82.0f));
            animate3.alpha(1.0f);
            animate3.setDuration(200L);
            animate3.setListener(new ALAdapterS1S0100000_2(c1293955z, 48));
            animate3.start();
            c1293955z.LIZJ = animate3;
            ViewPropertyAnimator viewPropertyAnimator4 = c1293955z.LJ;
            if (viewPropertyAnimator4 != null) {
                viewPropertyAnimator4.cancel();
            }
            ViewPropertyAnimator animate4 = subMenu.animate();
            animate4.setInterpolator(C55953Lxd.LJ());
            animate4.translationYBy(C134855Qz.LIZ(82.0f));
            animate4.alpha(0.0f);
            animate4.setDuration(200L);
            animate4.setListener(new ALAdapterS1S0100000_2(c1293955z, 49));
            animate4.start();
            c1293955z.LJ = animate4;
        }
        EditorProContext editorProContext = (EditorProContext) c1293955z.LJIIL.getValue();
        Boolean bool = Boolean.FALSE;
        boolean booleanValue2 = ((Boolean) C79057V0z.LJJIII(editorProContext, "is_showing_bottom_menu_anim_guide", bool)).booleanValue();
        EditModelProvider.Companion.getClass();
        boolean isFromEPAnchor = C126784yI.LIZ().isFromEPAnchor();
        if (booleanValue2 && !((Boolean) C79057V0z.LJJIII((EditorProContext) c1293955z.LJIIL.getValue(), "event_user_guide_intercepted", bool)).booleanValue() && !isFromEPAnchor) {
            C135125Sa.LIZ().storeBoolean("func_bar_transition_anim_show", true);
            C79057V0z.LJJJJL((EditorProContext) c1293955z.LJIIL.getValue(), "has_shown_bottom_menu_anim_guide", Boolean.TRUE);
            C79057V0z.LJJJJL((EditorProContext) c1293955z.LJIIL.getValue(), "is_showing_bottom_menu_anim_guide", bool);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        boolean z;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        View view = (View) obj2;
        MotionEvent event = (MotionEvent) obj3;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(event, "event");
        boolean z2 = true;
        if (nLETrackSlot != null) {
            C51W c51w = (C51W) iDqS427S0100000_2.l0;
            if (!c51w.Ps()) {
                if (NLESegmentTextSticker.LJFF(nLETrackSlot.LJI()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && C6ZT.LIZIZ(view, 200L)) {
                    VecNLETrackSPtr tracks = C79057V0z.LJJI(c51w.LJJLIIIJJI()).getTracks();
                    if (tracks != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<NLETrack> it = tracks.iterator();
                        while (it.hasNext()) {
                            NLETrack next = it.next();
                            if (next.LJIIZILJ() == EnumC123864ta.STICKER) {
                                arrayList.add(next);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            NLETrack nLETrack = (NLETrack) it2.next();
                            Iterator<NLETrackSlot> it3 = nLETrack.LJIILL().iterator();
                            while (it3.hasNext()) {
                                if (o.LJ(it3.next().getUUID(), nLETrackSlot.getUUID())) {
                                    C79057V0z.LJJJJL(c51w.LJJLIIIJJI(), "select_slot_event", new C127594zb(nLETrackSlot, null, 14));
                                    C132005Ga textMaterial = c51w.LJLIL.getTextMaterial();
                                    if (textMaterial != null) {
                                        textMaterial.LJIL(nLETrack, nLETrackSlot, event);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    new Object() { // from class: X.51T
                    }.getClass();
                    FFL.LJIIIZ().getClass();
                    if (FFL.LJ(31744, "studio_editor_pro_double_tap_sound_track_to_open_the_adjust_panel", true, false) && C124574uj.LJJIL(C79057V0z.LJJI(c51w.LJJLIIIJJI()).getTrackBySlot(nLETrackSlot)) && C6ZT.LIZIZ(view, 200L)) {
                        C79057V0z.LJJJJL(c51w.LJJLIIIJJI(), "select_slot_event", new C127594zb(nLETrackSlot, null, 14));
                        C50Q c50q = c51w.LJLL;
                        if (c50q != null) {
                            c50q.LIZIZ();
                        }
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }

    public static final Object invoke$3(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object msg) {
        int intValue = ((Number) obj).intValue();
        o.LJIIIZ(msg, "msg");
        InterfaceC88473Ynt interfaceC88473Ynt = (InterfaceC88473Ynt) iDqS427S0100000_2.l0;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(Integer.valueOf(intValue), obj2, msg);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        List<AnonymousClass523> funcItemList = (List) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(funcItemList, "funcItemList");
        HorizontalFuncBarFragment horizontalFuncBarFragment = (HorizontalFuncBarFragment) iDqS427S0100000_2.l0;
        horizontalFuncBarFragment.vl(horizontalFuncBarFragment.LJLILLLLZI, viewHolder, funcItemList, intValue, Boolean.FALSE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
        List<AnonymousClass523> funcItemList = (List) obj2;
        int intValue = ((Number) obj3).intValue();
        o.LJIIIZ(viewHolder, "viewHolder");
        o.LJIIIZ(funcItemList, "funcItemList");
        HorizontalFuncBarFragment horizontalFuncBarFragment = (HorizontalFuncBarFragment) iDqS427S0100000_2.l0;
        horizontalFuncBarFragment.vl(horizontalFuncBarFragment.LJLJI, viewHolder, funcItemList, intValue, Boolean.TRUE);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        ((Number) obj).intValue();
        o.LJIIIZ(obj3, "<anonymous parameter 2>");
        ((InterfaceC88473Ynt) iDqS427S0100000_2.l0).invoke(Boolean.FALSE, null, new C6ZI(5000, null, 6));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        C78966Uyw.LJJL(new OSJ(Boolean.valueOf(booleanValue), obj2, obj3), (InterfaceC67352kd) iDqS427S0100000_2.l0);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        ((InterfaceC88474Ynu) iDqS427S0100000_2.l0).invoke(obj, Boolean.TRUE, obj2, obj3);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(IDqS427S0100000_2 iDqS427S0100000_2, Object obj, Object obj2, Object obj3) {
        ((InterfaceC88474Ynu) iDqS427S0100000_2.l0).invoke(obj, Boolean.FALSE, obj2, obj3);
        return C76800UCe.LIZ;
    }
}
