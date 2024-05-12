package com.ss.android.ugc.aweme.stickerstore.fragment;

import X.AV1;
import X.ActivityC45651qj;
import X.C10A;
import X.C113644d6;
import X.C117244iu;
import X.C141335gf;
import X.C16880lQ;
import X.C17N;
import X.C1BC;
import X.C29S;
import X.C3C5;
import X.C42625Go9;
import X.C73305Spp;
import X.C73306Spq;
import X.C74053T4n;
import X.C76800UCe;
import X.C77123UOp;
import X.C77339UWx;
import X.C87223ba;
import X.C90903hW;
import X.EnumC87003bE;
import X.EnumC87203bY;
import X.InterfaceC36571c5;
import X.InterfaceC74055T4p;
import X.InterfaceC87073YFh;
import X.KEI;
import X.OGG;
import X.OKG;
import X.Q8U;
import X.QD3;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.profile.MiniUser;
import com.ss.android.ugc.aweme.profile.model.StickerTab;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.stickerstore.fragment.StickerStoreProfileListFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public final class StickerStoreProfileListFragment extends ProfileListFragment implements InterfaceC87073YFh {
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public C73305Spp LJLJLLL;
    public User LJLL;
    public ViewPager LJLLI;
    public C117244iu LJLLILLLL;
    public C74053T4n LJLLJ;
    public StickerTab LJLLL;
    public final Map<Integer, View> LJLZ = new LinkedHashMap();
    public final List<Fragment> LJLLLL = new ArrayList();
    public final List<Integer> LJLLLLLL = new ArrayList();

    @Override // X.C8Z7
    public final boolean LJJ() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void LL() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Oi() {
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    @Override // X.InterfaceC87073YFh
    public final void m4(MiniUser miniUser) {
    }

    @Override // X.InterfaceC87073YFh
    public final void onScrollEnd() {
    }

    public final void Il() {
        KEI LJI;
        String str;
        long j;
        Integer videoStickerCount;
        C74053T4n c74053T4n = this.LJLLJ;
        if (c74053T4n != null && (LJI = c74053T4n.LJI(0)) != null) {
            StringBuilder LIZ = X1D.LIZ();
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.rol);
            } else {
                str = null;
            }
            LIZ.append(str);
            LIZ.append(' ');
            StickerTab stickerTab = this.LJLLL;
            if (stickerTab != null && (videoStickerCount = stickerTab.getVideoStickerCount()) != null) {
                j = videoStickerCount.intValue();
            } else {
                j = 0;
            }
            LIZ.append(C77123UOp.LJJIIJ(j));
            LJI.LIZIZ(X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC87073YFh
    public final void LJ() {
        Iterator<Fragment> it = this.LJLLLL.iterator();
        while (it.hasNext()) {
            IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LIZJ(it.next());
        }
    }

    @Override // X.OGG
    public final View LJIJJ() {
        InterfaceC36571c5 interfaceC36571c5;
        OGG ogg;
        if (((ArrayList) this.LJLLLL).isEmpty()) {
            return null;
        }
        ViewPager viewPager = this.LJLLI;
        if (viewPager != null) {
            int currentItem = viewPager.getCurrentItem();
            C117244iu c117244iu = this.LJLLILLLL;
            if (c117244iu != null) {
                interfaceC36571c5 = c117244iu.LJJIII(currentItem);
                if (!(interfaceC36571c5 instanceof OGG) && (ogg = (OGG) interfaceC36571c5) != null) {
                    return ogg.LJIJJ();
                }
            }
        }
        interfaceC36571c5 = null;
        return !(interfaceC36571c5 instanceof OGG) ? null : null;
    }

    @Override // X.C8Z7
    public final void LJJJJ() {
        String str;
        String str2;
        String str3;
        String LIZLLL;
        if (!isViewValid()) {
            return;
        }
        if (this.LJLJL || this.LJLJJI || this.LJLJJL || this.LJLJJLL || this.LJLJLJ) {
            Context context = getContext();
            if (context != null) {
                C73305Spp c73305Spp = this.LJLJLLL;
                if (c73305Spp != null) {
                    c73305Spp.setVisibility(0);
                }
                C73305Spp c73305Spp2 = this.LJLJLLL;
                if (c73305Spp2 != null) {
                    boolean z = this.LJLJL;
                    boolean z2 = this.LJLJJLL;
                    boolean z3 = this.LJLJJI;
                    boolean z4 = this.LJLJLJ;
                    boolean z5 = this.LJLJJL;
                    C73306Spq c73306Spq = new C73306Spq();
                    String str4 = "";
                    if (z) {
                        str = context.getString(R.string.a7z);
                        str2 = OKG.LIZIZ(str, "context.getString(R.string.abnormal_user_state)", context, R.string.a7t, "context.getString(R.stri…bnormal_no_account_found)");
                    } else if (!z2) {
                        str = "";
                        str2 = "";
                    } else {
                        str = context.getString(R.string.a7g);
                        String LIZIZ = OKG.LIZIZ(str, "context.getString(R.string.abnormal_banned_title)", context, R.string.a7f, "context.getString(R.string.abnormal_banned_desc)");
                        Object[] objArr = new Object[1];
                        User user = this.LJLL;
                        if (user == null || (str3 = AV1.LIZLLL(user)) == null) {
                            str3 = "";
                        }
                        objArr[0] = str3;
                        str2 = Q8U.LIZIZ(objArr, 1, LIZIZ, "format(format, *args)");
                    }
                    if (z4) {
                        str = context.getString(R.string.b5i);
                        str2 = OKG.LIZIZ(str, "context.getString(R.stri…_restriction_error_title)", context, R.string.b5h, "context.getString(R.stri…k_restriction_error_desc)");
                    } else if (z3) {
                        String string = context.getString(R.string.a7m);
                        str2 = OKG.LIZIZ(string, "context.getString(R.string.abnormal_blocked_title)", context, R.string.a7l, "context.getString(R.string.abnormal_blocked_desc)");
                        Object[] objArr2 = new Object[1];
                        User user2 = this.LJLL;
                        if (user2 != null && (LIZLLL = AV1.LIZLLL(user2)) != null) {
                            str4 = LIZLLL;
                        }
                        objArr2[0] = str4;
                        str = Q8U.LIZIZ(objArr2, 1, string, "format(format, *args)");
                    } else if (z5) {
                        str = context.getString(R.string.a7z);
                        str2 = OKG.LIZIZ(str, "context.getString(R.string.abnormal_user_state)", context, R.string.a7t, "context.getString(R.stri…bnormal_no_account_found)");
                    }
                    c73306Spq.LJFF = str;
                    c73306Spq.LJI = str2;
                    c73305Spp2.setStatus(c73306Spq);
                }
            }
            ViewPager viewPager = this.LJLLI;
            if (viewPager == null) {
                return;
            }
            viewPager.setVisibility(8);
            return;
        }
        C73305Spp c73305Spp3 = this.LJLJLLL;
        if (c73305Spp3 != null) {
            c73305Spp3.setVisibility(8);
        }
        ViewPager viewPager2 = this.LJLLI;
        if (viewPager2 == null) {
            return;
        }
        viewPager2.setVisibility(0);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C42625Go9.LIZJ(this);
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLZ).clear();
    }

    @Override // X.InterfaceC87073YFh
    public final void E5(String feedId) {
        o.LJIIIZ(feedId, "feedId");
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void H5(boolean z) {
        this.LJLJJI = z;
    }

    public final String Hl(int i) {
        Integer stickerSetCount;
        Integer videoStickerCount;
        long j = 0;
        String str = null;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            StringBuilder LIZ = X1D.LIZ();
            Context context = getContext();
            if (context != null) {
                str = context.getString(R.string.rol);
            }
            LIZ.append(str);
            LIZ.append(' ');
            StickerTab stickerTab = this.LJLLL;
            if (stickerTab != null && (videoStickerCount = stickerTab.getVideoStickerCount()) != null) {
                j = videoStickerCount.intValue();
            }
            LIZ.append(C77123UOp.LJJIIJ(j));
            return X1D.LIZIZ(LIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        Context context2 = getContext();
        if (context2 != null) {
            str = context2.getString(R.string.roh);
        }
        LIZ2.append(str);
        LIZ2.append(' ');
        StickerTab stickerTab2 = this.LJLLL;
        if (stickerTab2 != null && (stickerSetCount = stickerTab2.getStickerSetCount()) != null) {
            j = stickerSetCount.intValue();
        }
        LIZ2.append(C77123UOp.LJJIIJ(j));
        return X1D.LIZIZ(LIZ2);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Kh(boolean z) {
        this.LJLJJL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Pf(boolean z) {
        this.LJLJL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Sj(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Yk(boolean z) {
        this.LJLJLJ = z;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C42625Go9.LIZIZ(this);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void updateStickerTabCount(C87223ba event) {
        o.LJIIIZ(event, "event");
        Integer num = event.LJLILLLLZI;
        StickerTab stickerTab = null;
        StickerTab stickerTab2 = null;
        Integer num2 = null;
        StickerTab stickerTab3 = null;
        Integer num3 = null;
        if (num != null) {
            int intValue = num.intValue();
            StickerTab stickerTab4 = this.LJLLL;
            if (stickerTab4 != null) {
                stickerTab2 = StickerTab.copy$default(stickerTab4, null, null, null, null, Integer.valueOf(intValue), 15, null);
            }
            this.LJLLL = stickerTab2;
            Il();
            return;
        }
        int i = event.LJLIL;
        if (i == EnumC87203bY.ADD.getType()) {
            StickerTab stickerTab5 = this.LJLLL;
            if (stickerTab5 != null) {
                Integer videoStickerCount = stickerTab5.getVideoStickerCount();
                if (videoStickerCount != null) {
                    num2 = C77339UWx.LIZIZ(videoStickerCount, 1);
                }
                stickerTab3 = StickerTab.copy$default(stickerTab5, null, null, null, null, num2, 15, null);
            }
            this.LJLLL = stickerTab3;
            Il();
            return;
        }
        if (i != EnumC87203bY.REMOVE.getType()) {
            return;
        }
        StickerTab stickerTab6 = this.LJLLL;
        if (stickerTab6 != null) {
            Integer videoStickerCount2 = stickerTab6.getVideoStickerCount();
            if (videoStickerCount2 != null) {
                num3 = C77339UWx.LIZIZ(videoStickerCount2, -1);
            }
            stickerTab = StickerTab.copy$default(stickerTab6, null, null, null, null, num3, 15, null);
        }
        this.LJLLL = stickerTab;
        Il();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.4iu, androidx.viewpager.widget.PagerAdapter] */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Integer num;
        int type;
        StickerTab stickerTab;
        C74053T4n c74053T4n;
        StickerTab stickerTab2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        this.LJLJLLL = (C73305Spp) view.findViewById(R.id.i_2);
        Bundle arguments = getArguments();
        Integer num2 = null;
        if (arguments != null) {
            str = arguments.getString("enter_from");
        } else {
            str = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            str2 = arguments2.getString("uid");
        } else {
            str2 = null;
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            str3 = arguments3.getString("sec_userid");
        } else {
            str3 = null;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            bool = Boolean.valueOf(arguments4.getBoolean("is_self"));
        } else {
            bool = null;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            bool2 = Boolean.valueOf(arguments5.getBoolean("key_show_sticker_set_sticker"));
        } else {
            bool2 = null;
        }
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            bool3 = Boolean.valueOf(arguments6.getBoolean("key_show_video_sticker"));
        } else {
            bool3 = null;
        }
        Bundle arguments7 = getArguments();
        if (arguments7 != null) {
            num = Integer.valueOf(arguments7.getInt("key_sticker_set_count"));
        } else {
            num = null;
        }
        Bundle arguments8 = getArguments();
        if (arguments8 != null) {
            num2 = Integer.valueOf(arguments8.getInt("key_video_sticker_count"));
        }
        this.LJLLL = new StickerTab(null, bool2, bool3, num, num2, 1, null);
        IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJI();
        if (o.LJ(str, "sticker_set_details_page") || o.LJ(str, "video_sticker_rank_list")) {
            if (o.LJ(bool, Boolean.TRUE)) {
                type = EnumC87003bE.PERSONAL_PROFILE_FROM_STICKER_STORE.getType();
            } else {
                type = EnumC87003bE.OTHERS_PROFILE_FROM_STICKER_STORE.getType();
            }
        } else if (o.LJ(bool, Boolean.TRUE)) {
            type = EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType();
        } else {
            type = EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType();
        }
        ((ArrayList) this.LJLLLL).clear();
        if (C113644d6.LIZIZ() && (stickerTab2 = this.LJLLL) != null && o.LJ(stickerTab2.getShowVideoSticker(), Boolean.TRUE)) {
            ((ArrayList) this.LJLLLL).add(IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LJIIJJI(type, str3));
            ((ArrayList) this.LJLLLLLL).add(1);
        }
        StickerTab stickerTab3 = this.LJLLL;
        if (stickerTab3 != null && o.LJ(stickerTab3.getShowStickerSetSticker(), Boolean.TRUE)) {
            ((ArrayList) this.LJLLLL).add(IMService.createIIMServicebyMonsterPlugin(false).getImStickerStoreService().LIZIZ(type, str2));
            ((ArrayList) this.LJLLLLLL).add(0);
        }
        final FragmentManager childFragmentManager = getChildFragmentManager();
        ?? r2 = new C1BC(childFragmentManager) { // from class: X.4iu
            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return ((ArrayList) StickerStoreProfileListFragment.this.LJLLLL).size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIILIIL(int i) {
                StickerStoreProfileListFragment stickerStoreProfileListFragment = StickerStoreProfileListFragment.this;
                return stickerStoreProfileListFragment.Hl(((Number) ListProtector.get(stickerStoreProfileListFragment.LJLLLLLL, i)).intValue());
            }

            @Override // X.C1BC
            public final Fragment LJJIII(int i) {
                return (Fragment) ListProtector.get(StickerStoreProfileListFragment.this.LJLLLL, i);
            }
        };
        this.LJLLILLLL = r2;
        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.i_4);
        this.LJLLI = viewPager;
        C74053T4n c74053T4n2 = (C74053T4n) view.findViewById(R.id.i_5);
        c74053T4n2.getTabSelectedIndicator().getBounds().set(0, 0, 0, 0);
        this.LJLLJ = c74053T4n2;
        viewPager.setAdapter(r2);
        StickerTab stickerTab4 = this.LJLLL;
        if (stickerTab4 != null && o.LJ(stickerTab4.getShowStickerSetSticker(), Boolean.TRUE) && (stickerTab = this.LJLLL) != null && o.LJ(stickerTab.getShowVideoSticker(), Boolean.TRUE)) {
            C74053T4n c74053T4n3 = this.LJLLJ;
            if (c74053T4n3 != null) {
                C17N.LJJLIIIJJI(c74053T4n3);
            }
            Iterator it = ((ArrayList) this.LJLLLLLL).iterator();
            while (it.hasNext()) {
                String Hl = Hl(((Number) it.next()).intValue());
                if (Hl != null && (c74053T4n = this.LJLLJ) != null) {
                    KEI LJII = c74053T4n.LJII();
                    LJII.LIZIZ(Hl);
                    C74053T4n.LIZJ(c74053T4n, LJII, 0, false, 6);
                }
            }
            C74053T4n c74053T4n4 = this.LJLLJ;
            if (c74053T4n4 != null) {
                C74053T4n.LJIILJJIL(c74053T4n4, viewPager);
                c74053T4n4.LIZ(new InterfaceC74055T4p() { // from class: X.4iv
                    @Override // X.InterfaceC74055T4p
                    public final void LIZIZ(KEI kei) {
                    }

                    @Override // X.InterfaceC74055T4p
                    public final void LIZJ(KEI tab) {
                        o.LJIIIZ(tab, "tab");
                    }

                    @Override // X.InterfaceC74055T4p
                    public final void LIZ(KEI tab) {
                        o.LJIIIZ(tab, "tab");
                        ViewPager.this.setCurrentItem(tab.LIZLLL, true);
                    }
                });
            }
            if (o.LJ(str, "sticker_set_details_page")) {
                viewPager.setCurrentItem(1, false);
            }
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c4x, viewGroup, false);
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
