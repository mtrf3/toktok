package com.ss.android.ugc.feed.platform.cell;

import X.C0IF;
import X.C2055284u;
import X.C211668Sk;
import X.C212428Vi;
import X.C214348b8;
import X.C218518hr;
import X.C221108m2;
import X.C2K0;
import X.C2L4;
import X.C51029K0z;
import X.C55096Ljo;
import X.C5H3;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C76965UIn;
import X.C8MQ;
import X.C8NX;
import X.C8OG;
import X.C8OJ;
import X.C8OK;
import X.C8OL;
import X.C8OM;
import X.C8T5;
import X.C8VR;
import X.C8W0;
import X.InterfaceC55102Lju;
import X.InterfaceC55235Lm3;
import Y.IDLListenerS191S0100000_3;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractCommonLogicAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractRightAreaAttachAbility;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.InteractBottomBarAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0001000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class RootCellComponent extends BaseCellContentComponent implements RootCellCommonAbility, InterfaceC55102Lju, C2L4 {
    public final C8NX LL;
    public final C5H3 LLD;
    public final C5H3 LLF;
    public final LinkedHashMap<String, View> LLFF;
    public final C62822Ol8 LLFFF;

    @Override // X.InterfaceC55102Lju
    public final C2K0 provideAbility(String str) {
        if (str.hashCode() != -647875625) {
            return null;
        }
        return this;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(RootCellScope.class);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void E1() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).E1();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJJJ() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJJJ();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LLIILZL() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LLIILZL();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final Integer o4() {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility == null) {
            return null;
        }
        return iVideoCellAbility.o4();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void onDestroyView() {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).onDestroyView();
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8W0
    public final void onParentSet() {
        super.onParentSet();
        C55096Ljo.LIZJ(this);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final int vC() {
        return getContainerView().getHeight();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.C8W0
    public final void onCreate() {
        super.onCreate();
    }

    public RootCellComponent(C8NX c8nx) {
        new LinkedHashMap();
        this.LL = c8nx;
        this.LLD = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoPlayViewModel.class), C8OK.INSTANCE);
        this.LLF = C214348b8.LIZIZ(this, C65352Pkq.LIZ(VideoShareViewModel.class), C8OG.INSTANCE);
        this.LLFF = new LinkedHashMap<>();
        this.LLFFF = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1236));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Cf0(ViewGroup viewGroup) {
        C8OJ.LIZIZ(viewGroup, (ViewGroup) getContainerView(), C55096Ljo.LJIIZILJ(this));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Eb0(ViewGroup viewGroup) {
        String str;
        Resources resources;
        InteractCommonLogicAbility interactCommonLogicAbility;
        C218518hr c218518hr;
        C218518hr c218518hr2;
        InteractCommonLogicAbility interactCommonLogicAbility2;
        Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(this)).getAweme();
        o.LJIIIIZZ(aweme, "item.aweme");
        ViewGroup viewGroup2 = (ViewGroup) getContainerView();
        InterfaceC55235Lm3 LJIIZILJ = C55096Ljo.LJIIZILJ(this);
        if (viewGroup == null) {
            return;
        }
        if (aweme.isScheduleVideo()) {
            if (aweme.isScheduleVideo()) {
                TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.min);
                if (tuxTextView != null) {
                    Context context = viewGroup.getContext();
                    if (context != null && (resources = context.getResources()) != null) {
                        str = resources.getString(R.string.qa3, C8OJ.LIZ.format(Long.valueOf(aweme.getScheduleTime() * 1000)));
                    } else {
                        str = null;
                    }
                    tuxTextView.setText(str);
                }
                C2055284u.LIZJ(tuxTextView, null);
            }
            viewGroup.setVisibility(0);
            View LIZIZ = C0IF.LIZIZ(viewGroup2, null, R.id.mio, R.id.nfz);
            if (LIZIZ != null) {
                LIZIZ.setVisibility(0);
            }
            View findViewById = viewGroup2.findViewById(R.id.mio);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            C8OJ.LIZ(viewGroup2, false);
            if (LJIIZILJ != null && (interactCommonLogicAbility2 = (InteractCommonLogicAbility) C55096Ljo.LIZ(LJIIZILJ, InteractCommonLogicAbility.class, null)) != null) {
                interactCommonLogicAbility2.yi(false);
            }
            View findViewById2 = viewGroup2.findViewById(R.id.c_v);
            if ((findViewById2 instanceof C218518hr) && (c218518hr2 = (C218518hr) findViewById2) != null) {
                c218518hr2.setHintTextRes(R.string.qa8);
            }
            View findViewById3 = viewGroup2.findViewById(R.id.bkv);
            if ((findViewById3 instanceof C218518hr) && (c218518hr = (C218518hr) findViewById3) != null) {
                c218518hr.setHintTextRes(R.string.qa6);
            }
            if (LJIIZILJ == null || (interactCommonLogicAbility = (InteractCommonLogicAbility) C55096Ljo.LIZ(LJIIZILJ, InteractCommonLogicAbility.class, null)) == null) {
                return;
            }
            interactCommonLogicAbility.hz();
            return;
        }
        C8OJ.LIZIZ(viewGroup, viewGroup2, LJIIZILJ);
    }

    @Override // X.C8XO
    /* renamed from: F0 */
    public final void q4(VideoItemParams item) {
        o.LJIIIZ(item, "item");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIII(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIII(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void LJJIJIIJIL(int i) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).LJJIJIIJIL(i);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void Ux(int i) {
        LJJIJIIJIL(i);
    }

    public final void b4(String str) {
        InteractBottomBarAbility interactBottomBarAbility = (InteractBottomBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractBottomBarAbility.class, null);
        if (interactBottomBarAbility != null) {
            interactBottomBarAbility.YB(str);
        }
        InteractBottomBarAbility interactBottomBarAbility2 = (InteractBottomBarAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractBottomBarAbility.class, null);
        if (interactBottomBarAbility2 != null) {
            interactBottomBarAbility2.xs0();
        }
    }

    public final void c4(C8OM state) {
        o.LJIIIZ(state, "state");
        int i = C8OL.LIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((VideoPlayViewModel) this.LLD.getValue()).jv0();
                return;
            } else {
                AssemViewModel assemViewModel = (AssemViewModel) this.LLD.getValue();
                assemViewModel.getClass();
                assemViewModel.setState(new AqS28S0001000_3(4, 23));
                ((VideoShareViewModel) this.LLF.getValue()).mv0();
                return;
            }
        }
        ((VideoPlayViewModel) this.LLD.getValue()).iv0(false);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void et0(int i) {
        LJJIII(i);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void o7(IDLListenerS191S0100000_3 iDLListenerS191S0100000_3) {
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null) {
            iVideoCellAbility.o7(iDLListenerS191S0100000_3);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8VR.LIZ(this, new AqS169S0100000_3(this, 543));
        CellConfigurationProtocol cellConfigurationProtocol = (CellConfigurationProtocol) this.LLFFF.getValue();
        if (cellConfigurationProtocol != null) {
            cellConfigurationProtocol.LJJLIIIJ(this, this.LL.LJLIL);
        } else {
            "No configuration matching the CellScene!".toString();
            throw new IllegalArgumentException("No configuration matching the CellScene!");
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void u0(ViewTreeObserver.OnGlobalLayoutListener l) {
        o.LJIIIZ(l, "l");
        IVideoCellAbility iVideoCellAbility = (IVideoCellAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), IVideoCellAbility.class, null);
        if (iVideoCellAbility != null) {
            iVideoCellAbility.u0(l);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void B2(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).B2(i, aweme);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final View V8(String tag, boolean z) {
        View c218518hr;
        o.LJIIIZ(tag, "tag");
        if (!TextUtils.isEmpty(tag)) {
            if (this.LLFF.containsKey(tag)) {
                c218518hr = this.LLFF.get(tag);
            } else {
                Context context = getContainerView().getContext();
                o.LJIIIIZZ(context, "containerView.context");
                c218518hr = new C218518hr(context, null);
                c218518hr.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                c218518hr.setId(R.id.bpt);
                c218518hr.setVisibility(8);
                this.LLFF.put(tag, c218518hr);
            }
            if (z && c218518hr != null) {
                c218518hr.setVisibility(0);
            }
            return c218518hr;
        }
        throw new IllegalStateException("BaseCellPlaceHolderComponent slotView's tag must not be null. ");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.C8MQ
    public final void v0(int i, Aweme aweme) {
        CopyOnWriteArrayList<C8W0> copyOnWriteArrayList;
        AssemSupervisor LIZJ = C212428Vi.LIZJ(this);
        if (LIZJ != null && (copyOnWriteArrayList = LIZJ.LJLLI) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C8W0> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C8W0 next = it.next();
                if (next instanceof C8MQ) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((C8MQ) it2.next()).v0(i, aweme);
            }
        }
    }

    public final void AU(float f, int i, boolean z) {
        InteractRightAreaAttachAbility interactRightAreaAttachAbility = (InteractRightAreaAttachAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractRightAreaAttachAbility.class, null);
        if (interactRightAreaAttachAbility != null) {
            interactRightAreaAttachAbility.AU(f, i, z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility
    public final void D3(C8T5 category, boolean z, C211668Sk c211668Sk) {
        o.LJIIIZ(category, "category");
        InteractAreaCommonAbility interactAreaCommonAbility = (InteractAreaCommonAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(this), InteractAreaCommonAbility.class, null);
        if (interactAreaCommonAbility != null) {
            interactAreaCommonAbility.D3(category, z, c211668Sk);
        }
    }
}
