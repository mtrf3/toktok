package com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect;

import X.ActivityC45651qj;
import X.BU9;
import X.C0WF;
import X.C10A;
import X.C111134Xt;
import X.C141335gf;
import X.C15380j0;
import X.C16880lQ;
import X.C1B3;
import X.C212608Wa;
import X.C28952BXw;
import X.C29306Beo;
import X.C29S;
import X.C30785C6j;
import X.C3C5;
import X.C42151l5;
import X.C47121t6;
import X.C47261Igj;
import X.C51029K0z;
import X.C5H3;
import X.C65352Pkq;
import X.C74964TbU;
import X.C75208TfQ;
import X.C75209TfR;
import X.C75210TfS;
import X.C75214TfW;
import X.C75215TfX;
import X.C75221Tfd;
import X.C75401TiX;
import X.C75422Tis;
import X.C76800UCe;
import X.C76923UGx;
import X.C77123UOp;
import X.C78856UxA;
import X.C78996UzQ;
import X.C79045V0n;
import X.C80261Vej;
import X.C87277YNd;
import X.C90903hW;
import X.CCJ;
import X.CN1;
import X.InterfaceC06390Mx;
import X.InterfaceC24140x8;
import X.InterfaceC31981Ni;
import X.InterfaceC74236TBo;
import X.InterfaceC74965TbV;
import X.InterfaceC75203TfL;
import X.InterfaceC75220Tfc;
import X.LHW;
import X.TBV;
import Y.ARunnableS32S0200000_13;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.api.MultiGuestPreviewCameraOpenEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class MultiGuestEffectSwitchFragment extends BaseFragment {
    public static final C75209TfR LLI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIFFJFJJ;
    public C76923UGx LJLILLLLZI;
    public C47121t6 LJLJI;
    public C80261Vej LJLJJI;
    public ViewPager LJLJJL;
    public ImageView LJLJJLL;
    public FrameLayout LJLJL;
    public MultiGuestEffectViewModel LJLJLJ;
    public FrameLayout LJLJLLL;
    public FrameLayout LJLL;
    public int LJLLI;
    public DataChannel LJLLILLLL;
    public int LJLLL;
    public Integer LJLLLL;
    public InterfaceC75220Tfc LJLLLLLL;
    public InterfaceC75203TfL LJLZ;
    public C75422Tis LJZ;
    public LiveEffect LJZI;
    public int LJZL;
    public InterfaceC24140x8 LL;
    public boolean LLD;
    public MultiGuestFullPropsPageFragment LLFF;
    public boolean LLFFF;
    public boolean LLFII;
    public final Map<Integer, View> LLFZ = new LinkedHashMap();
    public final C212608Wa LJLIL = new C212608Wa();
    public String LJLLJ = "";
    public final C5H3 LLF = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 35));

    static {
        TBV tbv = new TBV(MultiGuestEffectSwitchFragment.class, "isFromLinkedPreviewPage", "isFromLinkedPreviewPage()Z", 0);
        C65352Pkq.LIZ.getClass();
        LLIFFJFJJ = new InterfaceC74236TBo[]{tbv};
        LLI = new C75209TfR();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r0.pl != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        if (X.C77412UZs.LJJ(r3) != true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Al() {
        /*
            r6 = this;
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r6.LJLJLJ
            java.lang.String r5 = "this.getCurrentSticker(E…ctPanel.STICKER_INTERACT)"
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            X.0WF r3 = r0.gv0()
            if (r3 == 0) goto L2d
            java.lang.String r0 = X.C0TY.LIZJ
            java.util.List r0 = r3.LIZ(r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            java.lang.Object r3 = X.ORZ.LJLLLLLL(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r3 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r3
            boolean r0 = X.C77412UZs.LJIL(r3)
            if (r0 != 0) goto L2b
            if (r3 == 0) goto L2d
            boolean r0 = X.C77412UZs.LJJ(r3)
            if (r0 != r2) goto L2d
        L2b:
            r1 = 1
        L2c:
            return r1
        L2d:
            com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectViewModel r0 = r6.LJLJLJ
            r4 = 0
            if (r0 == 0) goto L52
            X.0WF r3 = r0.gv0()
            if (r3 == 0) goto L52
            java.lang.String r0 = X.C0TY.LIZJ
            java.util.List r0 = r3.LIZ(r0)
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r5)
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r1, r0)
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r0 = (com.bytedance.android.livesdkapi.depend.model.LiveEffect) r0
            if (r0 == 0) goto L52
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$StickerSDKExtra r0 = r0.sdkExtraModel
            if (r0 == 0) goto L52
            com.bytedance.android.livesdkapi.depend.model.LiveEffect$PlDataBean r0 = r0.pl
            if (r0 == 0) goto L52
            goto L2b
        L52:
            android.widget.FrameLayout r0 = r6.LJLJLLL
            if (r0 == 0) goto L8f
            android.view.View r0 = r0.getChildAt(r1)
        L5a:
            boolean r0 = X.C29306Beo.LJJIIJ(r0)
            if (r0 != 0) goto L2b
            android.widget.FrameLayout r0 = r6.LJLJLLL
            if (r0 == 0) goto L8d
            android.view.View r0 = r0.getChildAt(r2)
        L68:
            boolean r0 = X.C29306Beo.LJJIIJ(r0)
            if (r0 != 0) goto L2b
            android.widget.FrameLayout r0 = r6.LJLL
            if (r0 == 0) goto L8b
            android.view.View r0 = r0.getChildAt(r1)
        L76:
            boolean r0 = X.C29306Beo.LJJIIJ(r0)
            if (r0 != 0) goto L2b
            android.widget.FrameLayout r0 = r6.LJLL
            if (r0 == 0) goto L84
            android.view.View r4 = r0.getChildAt(r2)
        L84:
            boolean r0 = X.C29306Beo.LJJIIJ(r4)
            if (r0 == 0) goto L2c
            goto L2b
        L8b:
            r0 = r4
            goto L76
        L8d:
            r0 = r4
            goto L68
        L8f:
            r0 = r4
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.media.guest.effect.MultiGuestEffectSwitchFragment.Al():boolean");
    }

    public final void Dl() {
        MultiGuestFullPropsPageFragment multiGuestFullPropsPageFragment;
        FragmentManager childFragmentManager;
        FragmentManager childFragmentManager2;
        MultiGuestFullPropsPageFragment multiGuestFullPropsPageFragment2 = this.LLFF;
        if (multiGuestFullPropsPageFragment2 == null) {
            FrameLayout frameLayout = this.LJLL;
            C75422Tis c75422Tis = this.LJZ;
            MultiGuestEffectViewModel multiGuestEffectViewModel = this.LJLJLJ;
            int i = this.LJLLI;
            InterfaceC24140x8 interfaceC24140x8 = this.LL;
            MultiGuestFullPropsPageFragment multiGuestFullPropsPageFragment3 = new MultiGuestFullPropsPageFragment();
            multiGuestFullPropsPageFragment3.LJLJI = multiGuestEffectViewModel;
            multiGuestFullPropsPageFragment3.LJLIL = frameLayout;
            multiGuestFullPropsPageFragment3.LJLILLLLZI = c75422Tis;
            multiGuestFullPropsPageFragment3.LJLJJI = i;
            multiGuestFullPropsPageFragment3.LJLJJL = interfaceC24140x8;
            multiGuestFullPropsPageFragment3.LJLJJLL = false;
            this.LLFF = multiGuestFullPropsPageFragment3;
            Integer num = this.LJLLLL;
            if (num != null) {
                int intValue = num.intValue();
                MultiGuestFullPropsPageFragment multiGuestFullPropsPageFragment4 = this.LLFF;
                if (multiGuestFullPropsPageFragment4 != null) {
                    Fragment parentFragment = getParentFragment();
                    if (parentFragment != null && (childFragmentManager2 = parentFragment.getChildFragmentManager()) != null) {
                        C1B3 c1b3 = new C1B3(childFragmentManager2);
                        c1b3.LJIIJ(multiGuestFullPropsPageFragment4, null, intValue);
                        c1b3.LJIILLIIL();
                    }
                    View view = multiGuestFullPropsPageFragment4.getView();
                    if (view != null) {
                        view.setAlpha(0.0f);
                    }
                    View view2 = multiGuestFullPropsPageFragment4.getView();
                    if (view2 != null) {
                        view2.post(new ARunnableS32S0200000_13(this, multiGuestFullPropsPageFragment4, 23));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (!multiGuestFullPropsPageFragment2.isHidden() || (multiGuestFullPropsPageFragment = this.LLFF) == null) {
            return;
        }
        Fragment parentFragment2 = getParentFragment();
        if (parentFragment2 != null && (childFragmentManager = parentFragment2.getChildFragmentManager()) != null) {
            C1B3 c1b32 = new C1B3(childFragmentManager);
            c1b32.LJIIL(multiGuestFullPropsPageFragment);
            c1b32.LJIILLIIL();
        }
        View view3 = multiGuestFullPropsPageFragment.getView();
        if (view3 != null) {
            view3.setAlpha(0.0f);
        }
        View view4 = multiGuestFullPropsPageFragment.getView();
        if (view4 == null) {
            return;
        }
        view4.post(new ARunnableS32S0200000_13(this, multiGuestFullPropsPageFragment, 24));
    }

    public final void Gl() {
        if (!this.LLFFF) {
            Hl();
            this.LLFFF = true;
        }
        if (!isViewValid()) {
            this.LLFII = true;
        }
        if (this.LLFF != null) {
            Dl();
        }
        DataChannel dataChannel = this.LJLLILLLL;
        if (dataChannel != null) {
            dataChannel.qv0(MultiGuestPreviewCameraOpenEvent.class, Boolean.TRUE);
        }
    }

    public final void Hl() {
        TextView textView;
        InterfaceC75220Tfc interfaceC75220Tfc;
        LiveData liveData;
        C80261Vej c80261Vej = this.LJLJJI;
        ViewPager viewPager = this.LJLJJL;
        int i = -1;
        if (c80261Vej != null && viewPager != null) {
            Iterator<C30785C6j> it = vl().iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    C30785C6j next = it.next();
                    C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
                    int i3 = next.LJLIL;
                    c74964TbU.getClass();
                    if (C74964TbU.LIZIZ(i3)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.LJLLL = i2;
            if (i2 < 0) {
                this.LJLLL = 0;
            }
            int i4 = 0;
            for (C30785C6j c30785C6j : vl()) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    C30785C6j c30785C6j2 = c30785C6j;
                    C78856UxA tab = c80261Vej.newTab();
                    if (tab != null) {
                        tab.LIZJ(c30785C6j2.LJLJI);
                        View view = tab.LJFF;
                        if (view != null && (textView = (TextView) view.findViewById(R.id.kyz)) != null) {
                            textView.setText(c30785C6j2.LJLILLLLZI);
                        }
                    }
                    if (i4 == this.LJLLL) {
                        o.LJIIIIZZ(tab, "tab");
                        C75210TfS.LIZ(tab);
                    } else {
                        o.LJIIIIZZ(tab, "tab");
                        C75210TfS.LIZIZ(tab);
                    }
                    c80261Vej.addTab(tab);
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            c80261Vej.addOnTabSelectedListener((LHW) new C75215TfX(viewPager));
            viewPager.addOnPageChangeListener(new C111134Xt(c80261Vej));
            c80261Vej.setSelectedTabIndicatorColor(0);
        }
        C80261Vej c80261Vej2 = this.LJLJJI;
        ViewPager viewPager2 = this.LJLJJL;
        if (c80261Vej2 == null || viewPager2 == null) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
        C75214TfW c75214TfW = new C75214TfW(childFragmentManager);
        viewPager2.setAdapter(c75214TfW);
        C87277YNd.LJJIJ(viewPager2);
        viewPager2.addOnPageChangeListener(new C75208TfQ(this));
        List<C30785C6j> data = vl();
        o.LJIIIZ(data, "data");
        ((List) c75214TfW.LJLJLJ.getValue()).clear();
        ((List) c75214TfW.LJLJLJ.getValue()).addAll(data);
        c75214TfW.notifyDataSetChanged();
        Iterator<C30785C6j> it2 = vl().iterator();
        int i6 = 0;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C30785C6j next2 = it2.next();
            C74964TbU c74964TbU2 = InterfaceC74965TbV.LIZLLL;
            int i7 = next2.LJLIL;
            c74964TbU2.getClass();
            if (C74964TbU.LIZIZ(i7)) {
                i = i6;
                break;
            }
            i6++;
        }
        this.LJLLL = i;
        if (i < 0) {
            this.LJLLL = 0;
        }
        viewPager2.setCurrentItem(this.LJLLL);
        if (!vl().isEmpty()) {
            this.LJZL = ((C30785C6j) ListProtector.get(vl(), this.LJLLL)).LJLIL;
        }
        MultiGuestEffectViewModel multiGuestEffectViewModel = this.LJLJLJ;
        if (multiGuestEffectViewModel != null && (liveData = (LiveData) multiGuestEffectViewModel.LJLLLL.getValue()) != null) {
            liveData.setValue(Integer.valueOf(this.LJZL));
        }
        InterfaceC75203TfL interfaceC75203TfL = this.LJLZ;
        if (interfaceC75203TfL != null) {
            interfaceC75203TfL.LIZLLL(this.LJZL, true);
        }
        C74964TbU c74964TbU3 = InterfaceC74965TbV.LIZLLL;
        int i8 = this.LJZL;
        c74964TbU3.getClass();
        if (i8 != 1) {
            C29306Beo.LJI(this.LJLJL);
        }
        if (!C29306Beo.LJIILLIIL(Boolean.valueOf(C74964TbU.LIZ(this.LJZL))) || (interfaceC75220Tfc = this.LJLLLLLL) == null) {
            return;
        }
        interfaceC75220Tfc.LIZLLL();
    }

    public final List<C30785C6j> vl() {
        return (List) this.LLF.getValue();
    }

    public final boolean xl() {
        C76923UGx c76923UGx = this.LJLILLLLZI;
        if (c76923UGx != null && c76923UGx.getVisibility() == 0) {
            C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
            int i = this.LJZL;
            c74964TbU.getClass();
            if (C74964TbU.LIZ(i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLFFF = false;
        this.LLFII = false;
        this.LLFF = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LLFZ).clear();
    }

    public final boolean wl() {
        if (Al()) {
            C74964TbU c74964TbU = InterfaceC74965TbV.LIZLLL;
            int i = this.LJZL;
            c74964TbU.getClass();
            if (C74964TbU.LIZIZ(i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        MultiGuestEffectViewModel multiGuestEffectViewModel;
        int i;
        int i2;
        C0WF c0wf;
        ImageView imageView;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLLILLLL = C51029K0z.LJIILIIL(this);
        InterfaceC24140x8 interfaceC24140x8 = this.LL;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        o.LJIIIIZZ(viewLifecycleOwner, "this.viewLifecycleOwner");
        DataChannel LJIILIIL = C51029K0z.LJIILIIL(this);
        Object obj = null;
        if (isAdded()) {
            multiGuestEffectViewModel = (MultiGuestEffectViewModel) ViewModelProviders.of(this, new C75401TiX(LJIILIIL, viewLifecycleOwner, interfaceC24140x8)).get(MultiGuestEffectViewModel.class);
        } else {
            multiGuestEffectViewModel = null;
        }
        this.LJLJLJ = multiGuestEffectViewModel;
        if (multiGuestEffectViewModel != null) {
            multiGuestEffectViewModel.LJLLJ = this.LJLZ;
        }
        if (multiGuestEffectViewModel != null) {
            multiGuestEffectViewModel.LJLLL = ((Boolean) this.LJLIL.LIZ(this, LLIFFJFJJ[0])).booleanValue();
        }
        this.LJLJJI = (C80261Vej) view.findViewById(R.id.csv);
        this.LJLJJL = (ViewPager) view.findViewById(R.id.csz);
        this.LJLJJLL = (ImageView) view.findViewById(R.id.iyh);
        this.LJLJI = (C47121t6) view.findViewById(R.id.c4a);
        this.LJLJL = (FrameLayout) view.findViewById(R.id.iyi);
        C76923UGx c76923UGx = this.LJLILLLLZI;
        if (c76923UGx != null) {
            c76923UGx.LIZJ(100, 0, 0, true);
            Context context = getContext();
            if (context != null) {
                Integer LJI = C79045V0n.LJI(R.attr.bn7, context);
                if (LJI != null) {
                    i = LJI.intValue();
                } else {
                    i = -65536;
                }
                int LIZIZ = C15380j0.LIZIZ(R.color.abg);
                Integer LJI2 = C79045V0n.LJI(R.attr.bm_, context);
                if (LJI2 != null) {
                    i2 = LJI2.intValue();
                } else {
                    i2 = -1;
                }
                c76923UGx.LJLJL = i;
                c76923UGx.LJLJLJ = LIZIZ;
                c76923UGx.LLIILZL = i2;
                c76923UGx.setUpUiColor(false);
            }
            if (CCJ.LIZ(getContext())) {
                c76923UGx.setScaleX(-1.0f);
            }
            c76923UGx.setVisibilityListener(new C75221Tfd(this));
        }
        ImageView imageView2 = this.LJLJJLL;
        if (imageView2 != null) {
            C87277YNd.LJJIJ(imageView2);
        }
        if (this.LLFII) {
            this.LLFFF = true;
            Hl();
        }
        if (C29306Beo.LJIILLIIL(Boolean.TRUE) && (imageView = this.LJLJJLL) != null) {
            C87277YNd.LJJIIZ(imageView);
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            BU9.LIZ(this.LJLLJ);
        } else {
            BU9.LJ = new AqS163S0100000_13(this, 298);
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        if (((IEffectService) LIZ).getMultiGuestBeautyLogManager() != null) {
            C42151l5.LJIIL = C77123UOp.LJJIIJZLJL();
            MultiGuestEffectViewModel multiGuestEffectViewModel2 = this.LJLJLJ;
            if (multiGuestEffectViewModel2 != null) {
                InterfaceC24140x8 interfaceC24140x82 = multiGuestEffectViewModel2.LJLJJI;
                if (interfaceC24140x82 != null) {
                    obj = interfaceC24140x82.getAttachedComposerManager();
                }
                if ((obj instanceof InterfaceC31981Ni) && (c0wf = (C0WF) obj) != null) {
                    C42151l5.LJIIJJI = c0wf;
                }
            }
        }
        if (C28952BXw.LIZ()) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).preloadMultiGuestEffects(this.LJLLI);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bq8, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }
}
