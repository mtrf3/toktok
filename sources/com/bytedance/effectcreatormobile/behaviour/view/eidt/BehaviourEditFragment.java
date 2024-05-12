package com.bytedance.effectcreatormobile.behaviour.view.eidt;

import X.AbstractC03490Bt;
import X.AbstractC94370afu;
import X.AbstractC94372afw;
import X.AbstractC94512aiC;
import X.ActivityC45651qj;
import X.C0CM;
import X.C162476Zf;
import X.C16880lQ;
import X.C32I;
import X.C47261Igj;
import X.C51029K0z;
import X.C62822Ol8;
import X.C93405aQL;
import X.C93440aQu;
import X.C93472aRQ;
import X.C93474aRS;
import X.C93669aUb;
import X.C93670aUc;
import X.C93687aUt;
import X.C93693aUz;
import X.C93696aV2;
import X.C93720aVQ;
import X.C93721aVR;
import X.C93729aVZ;
import X.C93742aVm;
import X.C93745aVp;
import X.C93747aVr;
import X.C93748aVs;
import X.C93764aW8;
import X.C93829aXB;
import X.C93940aYy;
import X.C93989aZl;
import X.C93991aZn;
import X.C94010aa6;
import X.C94034aaU;
import X.C94191ad1;
import X.C94200adA;
import X.C94218adS;
import X.C94219adT;
import X.C94245adt;
import X.C94246adu;
import X.C94463ahP;
import X.C94526aiQ;
import X.C94666akg;
import X.C94751am3;
import X.EnumC93441aQv;
import X.EnumC93446aR0;
import X.EnumC93994aZq;
import X.InterfaceC06750Oh;
import X.InterfaceC93955aZD;
import X.InterfaceC93966aZO;
import X.ORZ;
import X.OSZ;
import X.X1D;
import Y.IDCListenerS262S0100000_42;
import Y.IDObserverS227S0100000_42;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.effectcreatormobile.behaviour.base.BehaviourContentFragment;
import com.bytedance.effectcreatormobile.behaviour.viewmodel.EditViewModel;
import com.bytedance.effectcreatormobile.ckeapi.api.IEditorContext;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.dialog.IDialog;
import com.bytedance.effectcreatormobile.ckeapi.api.foundation.statistic.StatisticReporter;
import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.ies.effectcreator.swig.EffectCreatorJniJNI;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import com.ugc.effectcreator.foundation.viewmodel.StateViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS196S0200000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.IDqS457S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class BehaviourEditFragment extends BehaviourContentFragment<C94191ad1> implements InterfaceC93966aZO {
    public static final /* synthetic */ int LJLL = 0;
    public final C62822Ol8 LJLJJI = C93745aVp.LIZJ(this, EditViewModel.class);
    public final C93748aVs LJLJJL = new C93748aVs(100);
    public WeakReference<View> LJLJJLL;
    public ObjectAnimator LJLJL;
    public C94463ahP LJLJLJ;
    public boolean LJLJLLL;

    public final EditViewModel Ll() {
        return (EditViewModel) this.LJLJJI.getValue();
    }

    public final void Il() {
        IStore iStore;
        IEditorContext LIZ;
        Context context;
        AbstractC94370afu value;
        if (this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        AbstractC94370afu value2 = Ll().LJLILLLLZI.LIZ.getValue();
        if (value2 != null && value2.LJII().LJIIIZ()) {
            List<AbstractC94372afw> LJI = value2.LJI();
            if (!(LJI instanceof Collection) || !LJI.isEmpty()) {
                Iterator<AbstractC94372afw> it = LJI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC94372afw next = it.next();
                    if ((!next.LJ().isEmpty()) && !next.LIZLLL().LJII()) {
                        C94666akg LJII = value2.LJII();
                        String kEventTriggerActionEffectStart = EffectCreatorJniJNI.kEventTriggerActionEffectStart();
                        o.LJIIIIZZ(kEventTriggerActionEffectStart, "EffectCreatorJni.kEventTriggerActionEffectStart()");
                        LJII.LJIIL(kEventTriggerActionEffectStart);
                        break;
                    }
                }
            }
        }
        C93829aXB c93829aXB = CKEffectEditorContext.LJIILL;
        if (c93829aXB != null) {
            c93829aXB.LIZIZ();
        }
        if (Kl() == EnumC93446aR0.CANVAS && (value = Ll().LJLILLLLZI.LIZ.getValue()) != null && (!C93989aZl.LIZIZ(value))) {
            C93991aZn.LIZ().removeCommand(C93991aZn.LIZ().getCommandList().indexOf(value));
            return;
        }
        AbstractC94370afu value3 = Ll().LJLILLLLZI.LIZ.getValue();
        if (value3 == null) {
            return;
        }
        C93669aUb c93669aUb = new C93669aUb(value3);
        List<AbstractC94512aiC> LJFF = value3.LJFF();
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJFF, 10));
        Iterator<AbstractC94512aiC> it2 = LJFF.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C93474aRS(it2.next().LIZJ()));
        }
        List LLJI = ORZ.LLJI(arrayList);
        if (!(!LLJI.isEmpty()) || (iStore = c93669aUb.LIZ) == null || !iStore.shouldShowVisibilityDialog() || (LIZ = C93940aYy.LIZ()) == null || (context = LIZ.getContext()) == null) {
            return;
        }
        StatisticReporter LIZ2 = C93670aUc.LIZ();
        if (LIZ2 != null) {
            LIZ2.onEvent("interaction_hideobject_checkpop_show");
        }
        IDialog LIZ3 = C93405aQL.LIZ();
        String string = context.getString(R.string.hb);
        o.LJIIIIZZ(string, "context.getString(Langua…t_tool_hideobject_header)");
        String string2 = context.getString(R.string.ha);
        o.LJIIIIZZ(string2, "context.getString(Langua…ect_tool_hideobject_body)");
        String string3 = context.getString(R.string.hd);
        o.LJIIIIZZ(string3, "context.getString(Langua…fect_tool_hideobject_yes)");
        C93472aRQ.LIZ(LIZ3, context, string, string2, string3, context.getString(R.string.hc), new C94200adA(c93669aUb, LJFF), null, ((C93474aRS) ListProtector.get(LLJI, 0)).LIZ, null, null, 1856);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Jl() {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.effectcreatormobile.behaviour.view.eidt.BehaviourEditFragment.Jl():boolean");
    }

    public final EnumC93446aR0 Kl() {
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getLong("cke_behaviour_command_object_id_key", -1L) != -1) {
            return EnumC93446aR0.CANVAS;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && arguments2.getInt("cke_behaviour_command_key", -1) != -1) {
            return EnumC93446aR0.BEHAVIOUR_PREVIEW;
        }
        return EnumC93446aR0.UNKNOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93966aZO
    public final boolean LJIIJ() {
        C94526aiQ c94526aiQ;
        ActivityC45651qj requireActivity = requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (requireActivity.findViewById(R.id.nm9) != null) {
            return true;
        }
        C93747aVr.LIZ(2000L, true);
        C94191ad1 c94191ad1 = (C94191ad1) Al();
        if (c94191ad1 != null && (c94526aiQ = c94191ad1.LJLILLLLZI) != null) {
            c94526aiQ.clearFocus();
        }
        if (this.LJLJL != null) {
            return true;
        }
        Il();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && fragmentManager.LJJJJIZL() > 1) {
            if (!Jl()) {
                return false;
            }
            FragmentManager fragmentManager2 = getFragmentManager();
            if (fragmentManager2 != null) {
                fragmentManager2.LJJLIIIJJI();
            }
        } else {
            C93747aVr.LIZ(-1L, false);
            InterfaceC93955aZD interfaceC93955aZD = this.LJLIL;
            if (interfaceC93955aZD != null) {
                interfaceC93955aZD.dismiss();
            }
        }
        Ll().lv0(-1, EnumC93441aQv.VIEW_TYPE_MORE, false);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ml() {
        int i;
        int i2;
        LinearLayout linearLayout;
        C94751am3 c94751am3;
        C94526aiQ c94526aiQ;
        LinearLayout linearLayout2;
        C94191ad1 c94191ad1 = (C94191ad1) Al();
        if (c94191ad1 != null && (linearLayout2 = c94191ad1.LJLJJL) != null && linearLayout2.getHeight() == 0) {
            return;
        }
        C94191ad1 c94191ad12 = (C94191ad1) Al();
        int i3 = 0;
        if (c94191ad12 != null && (c94526aiQ = c94191ad12.LJLILLLLZI) != null) {
            i = c94526aiQ.getBottom();
        } else {
            i = 0;
        }
        C94191ad1 c94191ad13 = (C94191ad1) Al();
        if (c94191ad13 != null && (c94751am3 = c94191ad13.LJLJL) != null) {
            i2 = c94751am3.getScrollY();
        } else {
            i2 = 0;
        }
        int i4 = i - i2;
        C94191ad1 c94191ad14 = (C94191ad1) Al();
        if (c94191ad14 != null && (linearLayout = c94191ad14.LJLJJL) != null) {
            i3 = linearLayout.getTop();
        }
        View view = null;
        if (i4 > i3) {
            C94191ad1 c94191ad15 = (C94191ad1) Al();
            if (c94191ad15 != null) {
                view = c94191ad15.LJLJJLL;
            }
            C93729aVZ.LJI(view);
            return;
        }
        C94191ad1 c94191ad16 = (C94191ad1) Al();
        if (c94191ad16 != null) {
            view = c94191ad16.LJLJJLL;
        }
        C93729aVZ.LIZLLL(view);
    }

    public final void Nl() {
        if (getView() == null) {
            return;
        }
        Ll().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 0));
        Ll().LJLJJL.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 1));
        Ml();
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourContentFragment, com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment, com.ugc.effectcreator.foundation.bottomdrawerviewpager.BottomDrawerFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Il();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ol(boolean z) {
        C94191ad1 c94191ad1;
        C94526aiQ c94526aiQ;
        View view;
        View extraContainer;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        int i;
        int i2;
        int i3;
        C94751am3 c94751am3;
        C94751am3 c94751am32;
        C94751am3 c94751am33;
        C94751am3 c94751am34;
        C94751am3 c94751am35;
        C94751am3 c94751am36;
        C94751am3 c94751am37;
        Integer value = Ll().LJLJJI.LIZ.getValue();
        if (value != null) {
            int intValue = value.intValue();
            EnumC93441aQv value2 = Ll().LJLJI.LIZ.getValue();
            if (value2 != null && (c94191ad1 = (C94191ad1) Al()) != null && (c94526aiQ = c94191ad1.LJLILLLLZI) != null) {
                switch (C93687aUt.LIZJ[value2.ordinal()]) {
                    case 1:
                        RecyclerView.ViewHolder LJJIZ = c94526aiQ.LJJIZ(c94526aiQ.LJLJJL(C93721aVR.class));
                        if (LJJIZ != null) {
                            extraContainer = LJJIZ.itemView;
                            break;
                        } else {
                            return;
                        }
                    case 2:
                        RecyclerView.ViewHolder LJJIZ2 = c94526aiQ.LJJIZ(c94526aiQ.LJLJJL(C94219adT.class));
                        if (LJJIZ2 != null) {
                            view7 = LJJIZ2.itemView;
                        } else {
                            view7 = null;
                        }
                        if (!(view7 instanceof C93693aUz)) {
                            view7 = null;
                        }
                        C93693aUz c93693aUz = (C93693aUz) view7;
                        if (c93693aUz != null) {
                            extraContainer = c93693aUz.getElementContainer();
                            break;
                        } else {
                            return;
                        }
                    case 3:
                        RecyclerView.ViewHolder LJJIZ3 = c94526aiQ.LJJIZ(c94526aiQ.LJLJJL(C94219adT.class));
                        if (LJJIZ3 != null) {
                            view6 = LJJIZ3.itemView;
                        } else {
                            view6 = null;
                        }
                        if (!(view6 instanceof C93693aUz)) {
                            view6 = null;
                        }
                        C93693aUz c93693aUz2 = (C93693aUz) view6;
                        if (c93693aUz2 != null) {
                            extraContainer = c93693aUz2.getExtraContainer();
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        int LJLJJL = c94526aiQ.LJLJJL(C94218adS.class);
                        if (LJLJJL >= 0) {
                            RecyclerView.ViewHolder LJJIZ4 = c94526aiQ.LJJIZ(LJLJJL + intValue);
                            if (LJJIZ4 != null) {
                                view5 = LJJIZ4.itemView;
                            } else {
                                view5 = null;
                            }
                            if (!(view5 instanceof C93696aV2)) {
                                view5 = null;
                            }
                            C93696aV2 c93696aV2 = (C93696aV2) view5;
                            if (c93696aV2 != null) {
                                extraContainer = c93696aV2.getObjectContainer();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 5:
                        int LJLJJL2 = c94526aiQ.LJLJJL(C94218adS.class);
                        if (LJLJJL2 >= 0) {
                            RecyclerView.ViewHolder LJJIZ5 = c94526aiQ.LJJIZ(LJLJJL2 + intValue);
                            if (LJJIZ5 != null) {
                                view4 = LJJIZ5.itemView;
                            } else {
                                view4 = null;
                            }
                            if (!(view4 instanceof C93696aV2)) {
                                view4 = null;
                            }
                            C93696aV2 c93696aV22 = (C93696aV2) view4;
                            if (c93696aV22 != null) {
                                extraContainer = c93696aV22.getActionContainer();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 6:
                        int LJLJJL3 = c94526aiQ.LJLJJL(C94218adS.class);
                        if (LJLJJL3 >= 0) {
                            RecyclerView.ViewHolder LJJIZ6 = c94526aiQ.LJJIZ(LJLJJL3 + intValue);
                            if (LJJIZ6 != null) {
                                view3 = LJJIZ6.itemView;
                            } else {
                                view3 = null;
                            }
                            if (!(view3 instanceof C93696aV2)) {
                                view3 = null;
                            }
                            C93696aV2 c93696aV23 = (C93696aV2) view3;
                            if (c93696aV23 != null) {
                                extraContainer = c93696aV23.getDeleteIcon();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 7:
                        int LJLJJL4 = c94526aiQ.LJLJJL(C94218adS.class);
                        if (LJLJJL4 >= 0) {
                            RecyclerView.ViewHolder LJJIZ7 = c94526aiQ.LJJIZ(LJLJJL4 + intValue);
                            if (LJJIZ7 != null) {
                                view2 = LJJIZ7.itemView;
                            } else {
                                view2 = null;
                            }
                            if (!(view2 instanceof C93696aV2)) {
                                view2 = null;
                            }
                            C93696aV2 c93696aV24 = (C93696aV2) view2;
                            if (c93696aV24 != null) {
                                extraContainer = c93696aV24.getExtraContainer();
                                break;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    case 8:
                        RecyclerView.ViewHolder LJJIZ8 = c94526aiQ.LJJIZ(c94526aiQ.LJLJJL(C93720aVQ.class));
                        if (LJJIZ8 != null) {
                            view = LJJIZ8.itemView;
                        } else {
                            view = null;
                        }
                        if (!(view instanceof C93693aUz)) {
                            view = null;
                        }
                        C93693aUz c93693aUz3 = (C93693aUz) view;
                        if (c93693aUz3 != null) {
                            extraContainer = c93693aUz3.getExtraContainer();
                            break;
                        } else {
                            return;
                        }
                    default:
                        throw new C162476Zf();
                }
                if (extraContainer != null) {
                    int i4 = C93729aVZ.LIZ(extraContainer).top;
                    C94191ad1 c94191ad12 = (C94191ad1) Al();
                    if (c94191ad12 != null && (c94751am37 = c94191ad12.LJLJL) != null) {
                        i = C93729aVZ.LIZ(c94751am37).top;
                    } else {
                        i = 0;
                    }
                    int LIZIZ = (i4 - i) - C93742aVm.LIZIZ(68);
                    if (LIZIZ != 0) {
                        if (z) {
                            C94191ad1 c94191ad13 = (C94191ad1) Al();
                            if (c94191ad13 != null && (c94751am36 = c94191ad13.LJLJL) != null) {
                                c94751am36.LJIILLIIL(0, LIZIZ, false);
                            }
                        } else {
                            C94191ad1 c94191ad14 = (C94191ad1) Al();
                            if (c94191ad14 != null && (c94751am35 = c94191ad14.LJLJL) != null) {
                                c94751am35.scrollBy(0, LIZIZ);
                            }
                        }
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("scroll by: ");
                        LIZ.append(LIZIZ);
                        C94034aaU.LIZ("BehaviourEditFragment", X1D.LIZIZ(LIZ));
                        return;
                    }
                    int i5 = C93729aVZ.LIZ(extraContainer).bottom;
                    C94191ad1 c94191ad15 = (C94191ad1) Al();
                    if (c94191ad15 != null && (c94751am34 = c94191ad15.LJLJL) != null) {
                        i2 = C93729aVZ.LIZ(c94751am34).top;
                    } else {
                        i2 = 0;
                    }
                    int i6 = i5 - i2;
                    C94191ad1 c94191ad16 = (C94191ad1) Al();
                    if (c94191ad16 != null && (c94751am33 = c94191ad16.LJLJL) != null) {
                        i3 = c94751am33.getHeight();
                    } else {
                        i3 = 0;
                    }
                    int i7 = i6 - i3;
                    if (i7 <= 0) {
                        return;
                    }
                    if (z) {
                        C94191ad1 c94191ad17 = (C94191ad1) Al();
                        if (c94191ad17 != null && (c94751am32 = c94191ad17.LJLJL) != null) {
                            c94751am32.LJIILLIIL(0, i7, false);
                        }
                    } else {
                        C94191ad1 c94191ad18 = (C94191ad1) Al();
                        if (c94191ad18 != null && (c94751am3 = c94191ad18.LJLJL) != null) {
                            c94751am3.scrollBy(0, i7);
                        }
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("scroll by: ");
                    LIZ2.append(i7);
                    C94034aaU.LIZ("BehaviourEditFragment", X1D.LIZIZ(LIZ2));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Ql(AbstractC94370afu abstractC94370afu) {
        C94526aiQ c94526aiQ;
        C94526aiQ c94526aiQ2;
        C94526aiQ c94526aiQ3;
        C94191ad1 c94191ad1 = (C94191ad1) Al();
        if (c94191ad1 != null && (c94526aiQ3 = c94191ad1.LJLILLLLZI) != null) {
            c94526aiQ3.LLLIIII = new IDqS457S0100000_42(this, 0);
        }
        C94191ad1 c94191ad12 = (C94191ad1) Al();
        if (c94191ad12 != null && (c94526aiQ2 = c94191ad12.LJLILLLLZI) != null) {
            c94526aiQ2.LLLII = new IDqS196S0200000_42(this, abstractC94370afu, 0);
        }
        C94191ad1 c94191ad13 = (C94191ad1) Al();
        if (c94191ad13 != null && (c94526aiQ = c94191ad13.LJLILLLLZI) != null) {
            Integer value = Ll().LJLJJI.LIZ.getValue();
            if (value == null) {
                value = -1;
            }
            o.LJIIIIZZ(value, "model.activeOperatorIndex.data.value ?: -1");
            int intValue = value.intValue();
            EnumC93441aQv value2 = Ll().LJLJI.LIZ.getValue();
            if (value2 == null) {
                value2 = EnumC93441aQv.VIEW_TYPE_MORE;
            }
            o.LJIIIIZZ(value2, "model.activeType.data.va…sponseType.VIEW_TYPE_MORE");
            c94526aiQ.LJLJL(abstractC94370afu, false, false, intValue, value2, false, new IDqS196S0200000_42(this, abstractC94370afu, 1));
        }
    }

    public static void Rl(BehaviourEditFragment behaviourEditFragment, AbstractC03490Bt abstractC03490Bt) {
        PathInterpolator LIZ = C94010aa6.LIZ();
        abstractC03490Bt.LJJIII(350L);
        abstractC03490Bt.LJJIIJZLJL(LIZ);
    }

    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final InterfaceC06750Oh Dl(LayoutInflater inflater, ViewGroup viewGroup) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.dv0, viewGroup, false);
        int i = R.id.nmv;
        C94526aiQ c94526aiQ = (C94526aiQ) LLLLIILL.findViewById(R.id.nmv);
        if (c94526aiQ != null) {
            i = R.id.cd9;
            View findViewById = LLLLIILL.findViewById(R.id.cd9);
            if (findViewById != null) {
                i = R.id.hfh;
                C0CM c0cm = (C0CM) LLLLIILL.findViewById(R.id.hfh);
                if (c0cm != null) {
                    i = R.id.noe;
                    LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.noe);
                    if (linearLayout != null) {
                        i = R.id.np5;
                        View findViewById2 = LLLLIILL.findViewById(R.id.np5);
                        if (findViewById2 != null) {
                            i = R.id.np9;
                            C94751am3 c94751am3 = (C94751am3) LLLLIILL.findViewById(R.id.np9);
                            if (c94751am3 != null) {
                                return new C94191ad1((LinearLayout) LLLLIILL, c94526aiQ, findViewById, c0cm, linearLayout, findViewById2, c94751am3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.effectcreatormobile.behaviour.base.BehaviourBaseFragment
    public final void xl(View view, Bundle bundle) {
        C94526aiQ c94526aiQ;
        C94751am3 c94751am3;
        C94526aiQ c94526aiQ2;
        C94751am3 c94751am32;
        View view2;
        C0CM c0cm;
        C0CM c0cm2;
        o.LJIIIZ(view, "view");
        int i = C93764aW8.LIZIZ[Kl().ordinal()];
        int i2 = -1;
        if (i != 1) {
            if (i != 2) {
                LJIIJ();
            } else {
                Bundle arguments = getArguments();
                long j = -1;
                if (arguments != null && arguments.getLong("cke_behaviour_command_object_id_key", -1L) >= 0) {
                    EditViewModel Ll = Ll();
                    Bundle arguments2 = getArguments();
                    if (arguments2 != null) {
                        j = arguments2.getLong("cke_behaviour_command_object_id_key", -1L);
                    }
                    Ll.getClass();
                    StatisticReporter LIZ = C93670aUc.LIZ();
                    if (LIZ != null) {
                        LIZ.onEvent("add_command", C51029K0z.LJJIIZI(new OSZ("add_from", "canvas_toolbar")));
                    }
                    AbstractC94370afu createAndInsertCommand = C93991aZn.LIZ().createAndInsertCommand("canvas_tool_bar");
                    if (createAndInsertCommand != null) {
                        StateViewModel.hv0(Ll.LJLILLLLZI, createAndInsertCommand);
                        List<AbstractC94372afw> LJI = createAndInsertCommand.LJI();
                        AbstractC94512aiC findObjectById = C93991aZn.LIZ().findObjectById(j);
                        if (!LJI.isEmpty()) {
                            if (findObjectById != null) {
                                ((AbstractC94372afw) ListProtector.get(LJI, 0)).LJII(C47261Igj.LJJIJ(findObjectById));
                            }
                            Ll.lv0(0, EnumC93441aQv.VIEW_TYPE_ACTION, true);
                        }
                    }
                    Bundle arguments3 = getArguments();
                    if (arguments3 != null) {
                        arguments3.putInt("cke_behaviour_command_key", 0);
                    }
                } else {
                    EditViewModel Ll2 = Ll();
                    Bundle arguments4 = getArguments();
                    if (arguments4 != null) {
                        i2 = arguments4.getInt("cke_behaviour_command_key", -1);
                    }
                    if (!Ll2.iv0(i2)) {
                        requireActivity().finish();
                    }
                }
            }
        } else {
            EditViewModel Ll3 = Ll();
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                i2 = arguments5.getInt("cke_behaviour_command_key", -1);
            }
            if (!Ll3.iv0(i2)) {
                requireActivity().finish();
            }
        }
        Object obj = null;
        this.LJLJL = null;
        C94191ad1 c94191ad1 = (C94191ad1) Al();
        if (c94191ad1 != null && (c0cm2 = c94191ad1.LJLJJI) != null) {
            c0cm2.setUserInputEnabled(false);
            C94463ahP c94463ahP = new C94463ahP(this, c0cm2);
            this.LJLJLJ = c94463ahP;
            c0cm2.setAdapter(c94463ahP);
        }
        TextView zh = zh();
        if (zh != null) {
            C93729aVZ.LIZJ(zh);
        }
        TextView f8 = f8();
        if (f8 != null) {
            C93729aVZ.LJI(f8);
        }
        TextView f82 = f8();
        if (f82 != null) {
            BehaviourContentFragment.Gl(this, f82, new IDqS419S0100000_42(this, 67));
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null && arguments6.getBoolean("cke_behaviour_command_init_show_keyboard", false)) {
            C94191ad1 c94191ad12 = (C94191ad1) Al();
            if (c94191ad12 != null && (c0cm = c94191ad12.LJLJJI) != null) {
                view2 = c0cm.getChildAt(0);
            } else {
                view2 = null;
            }
            C93729aVZ.LIZLLL(view2);
        }
        C94191ad1 c94191ad13 = (C94191ad1) Al();
        if (c94191ad13 != null && (c94751am32 = c94191ad13.LJLJL) != null) {
            c94751am32.setOnScrollChangeListener(new C94245adt(this));
        }
        C94191ad1 c94191ad14 = (C94191ad1) Al();
        if (c94191ad14 != null && (c94526aiQ2 = c94191ad14.LJLILLLLZI) != null) {
            c94526aiQ2.setItemAnimator(null);
        }
        TextView zg = zg();
        if (zg != null) {
            zg.setText(requireContext().getString(R.string.he));
        }
        C94191ad1 c94191ad15 = (C94191ad1) Al();
        if (c94191ad15 != null && (c94751am3 = c94191ad15.LJLJL) != null) {
            ((ArrayList) c94751am3.LLIFFJFJJ).add(new C94246adu(this));
        }
        C94191ad1 c94191ad16 = (C94191ad1) Al();
        if (c94191ad16 != null && (c94526aiQ = c94191ad16.LJLILLLLZI) != null) {
            c94526aiQ.addOnLayoutChangeListener(new IDCListenerS262S0100000_42(this, 2));
        }
        postponeEnterTransition();
        Object sharedElementEnterTransition = getSharedElementEnterTransition();
        if (sharedElementEnterTransition instanceof AbstractC03490Bt) {
            obj = sharedElementEnterTransition;
        }
        AbstractC03490Bt abstractC03490Bt = (AbstractC03490Bt) obj;
        if (abstractC03490Bt != null) {
            abstractC03490Bt.LIZ(new BehaviourEditFragment$initAction$1(this));
        } else {
            Nl();
        }
        Ll().LJLILLLLZI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 13));
        Ll().LJLJI.LIZ.observe(getViewLifecycleOwner(), new IDObserverS227S0100000_42(this, 14));
        wl(new IDqS423S0100000_42(this, 119));
        this.LJLJLLL = false;
    }

    public final void Pl(View view, EnumC93441aQv enumC93441aQv, int i) {
        List<C93440aQu> LJJIJIIJI;
        View view2;
        WeakReference<View> weakReference = this.LJLJJLL;
        if (weakReference != null && (view2 = weakReference.get()) != null) {
            view2.setSelected(false);
        }
        view.setSelected(true);
        this.LJLJJLL = new WeakReference<>(view);
        AbstractC94370afu value = Ll().LJLILLLLZI.LIZ.getValue();
        if (value != null) {
            C93440aQu c93440aQu = new C93440aQu(i, enumC93441aQv);
            C94463ahP c94463ahP = this.LJLJLJ;
            if (c94463ahP != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C93440aQu(-1, EnumC93441aQv.VIEW_TYPE_TRIGGER));
                if (value.LJII().LJII() == EnumC93994aZq.TypeFeature) {
                    arrayList.add(new C93440aQu(-1, EnumC93441aQv.VIEW_TYPE_TRIGGER_EXTRA));
                }
                Iterator<AbstractC94372afw> it = value.LJI().iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        arrayList.add(new C93440aQu(i2, EnumC93441aQv.VIEW_TYPE_OBJECT));
                        arrayList.add(new C93440aQu(i2, EnumC93441aQv.VIEW_TYPE_ACTION));
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (o.LJ(c94463ahP.LJLLILLLL, c93440aQu)) {
                    return;
                }
                int indexOf = arrayList.indexOf(c94463ahP.LJLLILLLL);
                int indexOf2 = arrayList.indexOf(c93440aQu);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("switch from ");
                LIZ.append(indexOf);
                LIZ.append(" to ");
                LIZ.append(indexOf2);
                C94034aaU.LIZ("PagerAdapter", X1D.LIZIZ(LIZ));
                if (indexOf == -1) {
                    LJJIJIIJI = C47261Igj.LJJIJ(c93440aQu);
                } else if (indexOf < indexOf2) {
                    LJJIJIIJI = C47261Igj.LJJIJIIJI(c94463ahP.LJLLILLLL, c93440aQu);
                } else {
                    LJJIJIIJI = C47261Igj.LJJIJIIJI(c93440aQu, c94463ahP.LJLLILLLL);
                }
                c94463ahP.LJLL = LJJIJIIJI;
                ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJJIJIIJI, 10));
                Iterator<C93440aQu> it2 = LJJIJIIJI.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(it2.next().hashCode()));
                }
                c94463ahP.LJLLI = arrayList2;
                c94463ahP.notifyDataSetChanged();
                C93440aQu c93440aQu2 = c94463ahP.LJLLILLLL;
                if (c94463ahP.LJLL.size() > 1) {
                    c94463ahP.LJLLJ.LIZLLL(c94463ahP.LJLL.indexOf(c93440aQu2), false);
                    c94463ahP.LJLLJ.LIZLLL(c94463ahP.LJLL.indexOf(c93440aQu), true);
                }
                c94463ahP.LJLLILLLL = c93440aQu;
                return;
            }
            o.LJIJI("pagerAdapter");
            throw null;
        }
    }
}
