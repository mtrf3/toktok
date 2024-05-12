package com.ss.android.ugc.aweme.ecommerce.anchor.fragment;

import X.ASQ;
import X.ASX;
import X.AbstractC029409q;
import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C235119Kp;
import X.C29S;
import X.C3C5;
import X.C45621qg;
import X.C45631qh;
import X.C55824LvY;
import X.C58655N0h;
import X.C58704N2e;
import X.C68322mC;
import X.C70858RrS;
import X.C71360RzY;
import X.C71361RzZ;
import X.C71363Rzb;
import X.C71370Rzi;
import X.C71372Rzk;
import X.C71379Rzr;
import X.C71388S0a;
import X.C71389S0b;
import X.C71408S0u;
import X.C72818Shy;
import X.C76800UCe;
import X.C78915Uy7;
import X.C78949Uyf;
import X.C7A9;
import X.C90903hW;
import X.InterfaceC219588ja;
import X.InterfaceC44105HSr;
import X.InterfaceC60061Nhh;
import X.L7W;
import X.ORZ;
import X.S0I;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
import X.VWR;
import X.VWY;
import X.ViewOnClickListenerC13880ga;
import Y.ACListenerS46S0200000_12;
import Y.ARunnableS48S0100000_12;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.badge.TuxAlertBadgeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.anchor.adapter.AnchorPanelAdapter;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.anchor.viewmodel.ECommerceAnchorPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.model.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.model.PanelOpenInfo;
import com.ss.android.ugc.aweme.ecommerce.model.ProductListModel;
import com.ss.android.ugc.aweme.ecommerce.model.ShopWindowAnchorModel;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceVideoService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.EcUgPopupService;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.service.IEcUgPopupService;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ECommerceAnchorPanelFragment extends ECBaseSheetFragment implements Observer<List<? extends C71379Rzr>>, InterfaceC219588ja, InterfaceC60061Nhh {
    public static boolean LLIIL;
    public InterfaceC44105HSr LJLJJLL;
    public boolean LJLJLLL;
    public int LJLL;
    public long LJLLI;
    public RecyclerView LJLLL;
    public ViewGroup LJLLLL;
    public C45631qh LJLLLLLL;
    public VWR LJLZ;
    public VWY LJZ;
    public C71372Rzk LJZI;
    public TuxAlertBadgeLayout LLD;
    public TuxIconView LLF;
    public TuxIconView LLFF;
    public long LLFFF;
    public int LLFII;
    public int LLFZ;
    public int LLIFFJFJJ;
    public int LLII;
    public boolean LLIIII;
    public C7A9 LLIIIJ;
    public long LLIIIZ;
    public final Map<Integer, View> LLIIJLIL = new LinkedHashMap();
    public AnchorCommonStruct LJLJL = new AnchorCommonStruct();
    public ProductListModel LJLJLJ = new ProductListModel(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 16777215, 0 == true ? 1 : 0);
    public PanelOpenInfo LJLLILLLL = new PanelOpenInfo(0, null, 0, false, 0, 31, null);
    public final ECommerceAnchorPanelViewModel LJLLJ = new ECommerceAnchorPanelViewModel();
    public final IECommerceAnchorService LJZL = ECommerceAnchorService.LJJJJI();
    public final IECommerceVideoService LL = ECommerceVideoService.LJIIJ();
    public final Handler LLI = new Handler(C16880lQ.LLJJJJ());
    public int LLIIIILZ = 4;
    public final C70858RrS LLIIIL = new C70858RrS();
    public final ARunnableS48S0100000_12 LLIIJI = new ARunnableS48S0100000_12(this, 16);

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Al(TuxSheet sheet, float f) {
        o.LJIIIZ(sheet, "sheet");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Dl(int i, int i2, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Gl() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void Il() {
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIJLIL).clear();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIJLIL;
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

    @Override // X.InterfaceC219588ja
    public final C235119Kp createNavActions() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC37828Esy
    public final String getPageName() {
        return "video_anchor";
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final void wl(C45621qg c45621qg) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment
    public final boolean xl() {
        return true;
    }

    public final void Ll() {
        AbstractC029409q abstractC029409q;
        int i;
        List<Integer> list;
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q;
        if (anchorPanelAdapter != null && (list = anchorPanelAdapter.LLIIIJ) != null) {
            i = ((ArrayList) list).size();
        } else {
            i = 0;
        }
        this.LLFZ = i;
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        AbstractC029409q abstractC029409q;
        ViewTreeObserver viewTreeObserver;
        super.onDestroy();
        C71372Rzk c71372Rzk = this.LJZI;
        if (c71372Rzk != null) {
            EventCenter.LJ().LIZIZ("ec_gyl_back_to_top", c71372Rzk);
            C72818Shy.LJII("ec_gyl_global_state", c71372Rzk);
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = c71372Rzk.LJLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
                sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJFF(true);
            }
        }
        VWR vwr = this.LJLZ;
        if (vwr != null && (viewTreeObserver = vwr.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this.LLIIIJ);
        }
        EventCenter.LJ().LIZIZ("ec_cart_refresh", this);
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q;
        if (anchorPanelAdapter != null) {
            anchorPanelAdapter.LJLLLLLL();
        }
        IEcUgPopupService LJIILJJIL = EcUgPopupService.LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJIIL(mo49getActivity(), this.LJLJLJ.getTrackParams());
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LJLLI = 0L;
        this.LLI.removeCallbacks(this.LLIIJI);
        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "close", this.LJLJLJ.getAwemeRawAd());
        LIZLLL.LIZJ("landing_page", "refer");
        LIZLLL.LJI();
        this.LJLLJ.uv0(this.LLFII, this.LLFZ, System.currentTimeMillis() - this.LLFFF, "return");
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLIIIZ = System.currentTimeMillis() - this.LLFFF;
        this.LLI.postDelayed(this.LLIIJI, 3000L);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        AbstractC029409q abstractC029409q;
        AnchorPanelAdapter anchorPanelAdapter;
        super.onStart();
        RecyclerView recyclerView = this.LJLLL;
        AbstractC029409q abstractC029409q2 = null;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        if ((abstractC029409q instanceof AnchorPanelAdapter) && (anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q) != null) {
            anchorPanelAdapter.LLIFFJFJJ = this.LJLLI;
        }
        this.LLFFF = System.currentTimeMillis();
        RecyclerView recyclerView2 = this.LJLLL;
        if (recyclerView2 != null) {
            abstractC029409q2 = recyclerView2.getAdapter();
        }
        AnchorPanelAdapter anchorPanelAdapter2 = (AnchorPanelAdapter) abstractC029409q2;
        if (anchorPanelAdapter2 != null) {
            ((ArrayList) anchorPanelAdapter2.LLIIIJ).clear();
            ((ArrayList) anchorPanelAdapter2.LLIIIL).clear();
        }
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(true);
        }
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        AbstractC029409q abstractC029409q;
        super.onStop();
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        AnchorPanelAdapter anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q;
        if (anchorPanelAdapter != null) {
            ((ArrayList) anchorPanelAdapter.LLIIIJ).clear();
            ((ArrayList) anchorPanelAdapter.LLIIIL).clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final void Kl(int i) {
        if (i > 0) {
            TuxIconView tuxIconView = this.LLF;
            if (tuxIconView != null) {
                if (tuxIconView.getVisibility() == 0) {
                    TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLD;
                    if (tuxAlertBadgeLayout != null) {
                        tuxAlertBadgeLayout.setCount(i);
                        TuxAlertBadgeLayout tuxAlertBadgeLayout2 = this.LLD;
                        if (tuxAlertBadgeLayout2 != null) {
                            tuxAlertBadgeLayout2.LIZJ();
                            return;
                        } else {
                            o.LJIJI("cartContainerView");
                            throw null;
                        }
                    }
                    o.LJIJI("cartContainerView");
                    throw null;
                }
            } else {
                o.LJIJI("cartIconView");
                throw null;
            }
        }
        TuxAlertBadgeLayout tuxAlertBadgeLayout3 = this.LLD;
        if (tuxAlertBadgeLayout3 != null) {
            tuxAlertBadgeLayout3.LIZIZ();
        } else {
            o.LJIJI("cartContainerView");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS params) {
        o.LJIIIZ(params, "params");
        C78915Uy7.LJJIL(params, new AqS178S0100000_12(this, 109));
        params.LIZJ(this.LLIIIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v57, types: [T, java.lang.String] */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(List<? extends C71379Rzr> list) {
        AbstractC029409q abstractC029409q;
        AbstractC029409q abstractC029409q2;
        String str;
        PanelOpenInfo panelOpenInfo;
        Integer num;
        int i;
        Integer num2;
        Integer num3;
        CartEntry cartEntry;
        String str2;
        Aweme aweme;
        String str3;
        String l;
        CartEntry cartEntry2;
        CartEntry cartEntry3;
        Integer num4;
        AnchorPanelAdapter anchorPanelAdapter;
        List<? extends C71379Rzr> items = list;
        o.LJIIIZ(items, "items");
        RecyclerView recyclerView = this.LJLLL;
        if (recyclerView != null) {
            abstractC029409q = recyclerView.getAdapter();
        } else {
            abstractC029409q = null;
        }
        if ((abstractC029409q instanceof AnchorPanelAdapter) && (anchorPanelAdapter = (AnchorPanelAdapter) abstractC029409q) != 0) {
            anchorPanelAdapter.LLIFFJFJJ(items);
        }
        int i2 = 1;
        this.LLFII = 1;
        C71379Rzr c71379Rzr = (C71379Rzr) ORZ.LJLLLL(items);
        RecyclerView recyclerView2 = this.LJLLL;
        if (recyclerView2 != null) {
            abstractC029409q2 = recyclerView2.getAdapter();
        } else {
            abstractC029409q2 = null;
        }
        if ((abstractC029409q2 instanceof AnchorPanelAdapter) && abstractC029409q2 != null && c71379Rzr != null && (cartEntry3 = c71379Rzr.LJIIIIZZ) != null && (num4 = cartEntry3.itemCount) != null) {
            num4.intValue();
        }
        C68322mC c68322mC = new C68322mC();
        String str4 = "";
        c68322mC.element = "";
        int i3 = 0;
        String str5 = "video_multi_anchor";
        if (!this.LJLLJ.LJLJJL.isEmpty()) {
            if (c71379Rzr == null || (cartEntry2 = c71379Rzr.LJIIIIZZ) == null || (str2 = cartEntry2.link) == null) {
                str2 = "";
            }
            ShopWindowAnchorModel shopWindowAnchorModel = (ShopWindowAnchorModel) ListProtector.get(this.LJLLJ.LJLJJL, 0);
            Long l2 = ((ShopWindowAnchorModel) ListProtector.get(this.LJLLJ.LJLJJL, 0)).LIZ.productId;
            if (l2 != null && (l = l2.toString()) != null) {
                str4 = l;
            }
            ProductListModel productListModel = this.LJLJLJ;
            if (productListModel != null) {
                aweme = productListModel.getAweme();
            } else {
                aweme = null;
            }
            ProductListModel productListModel2 = this.LJLLJ.LJLILLLLZI;
            if (productListModel2 != null) {
                str3 = productListModel2.getEventType();
            } else {
                str3 = null;
            }
            String LJIIIZ = C71360RzY.LJIIIZ(this.LJLLJ.LJLILLLLZI, true);
            if (LJIIIZ == null) {
                LJIIIZ = "video_multi_anchor";
            }
            c68322mC.element = C71360RzY.LJII(str2, shopWindowAnchorModel, str4, aweme, str3, LJIIIZ, true);
        }
        if (c71379Rzr != null && (cartEntry = c71379Rzr.LJIIIIZZ) != null) {
            str = cartEntry.link;
        } else {
            str = null;
        }
        if (str != null) {
            C78915Uy7.LJJIL(this.LLIIIL, new AqS178S0100000_12(c68322mC, (C68322mC<String>) 8));
            TuxIconView tuxIconView = this.LLF;
            if (tuxIconView != null) {
                tuxIconView.setVisibility(0);
                if (!c71379Rzr.LJIIZILJ) {
                    CartEntry cartEntry4 = c71379Rzr.LJIIIIZZ;
                    if (cartEntry4 != null && (num3 = cartEntry4.itemCount) != null) {
                        i = num3.intValue();
                    } else {
                        i = 0;
                    }
                    Kl(i);
                    CartEntry cartEntry5 = c71379Rzr.LJIIIIZZ;
                    if (cartEntry5 != null) {
                        num2 = cartEntry5.itemCount;
                    } else {
                        num2 = null;
                    }
                    C71370Rzi.LIZ(num2);
                } else {
                    Kl(C71370Rzi.LJIIIZ);
                }
                CartEntry cartEntry6 = c71379Rzr.LJIIIIZZ;
                if (cartEntry6 != null && (num = cartEntry6.itemCount) != null) {
                    i3 = num.intValue();
                }
                C71363Rzb.LJIIIIZZ(i3, this.LJLLJ.LJLILLLLZI);
                TuxAlertBadgeLayout tuxAlertBadgeLayout = this.LLD;
                if (tuxAlertBadgeLayout != null) {
                    tuxAlertBadgeLayout.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS46S0200000_12(this, c68322mC, 0)));
                } else {
                    o.LJIJI("cartContainerView");
                    throw null;
                }
            } else {
                o.LJIJI("cartIconView");
                throw null;
            }
        } else {
            TuxIconView tuxIconView2 = this.LLF;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            } else {
                o.LJIJI("cartIconView");
                throw null;
            }
        }
        C78915Uy7.LJJIL(this.LLIIIL, new AqS178S0100000_12(c71379Rzr, 7));
        C58655N0h LIZLLL = C58704N2e.LIZLLL("landing_ad", "detail_show_success", this.LJLJLJ.getAwemeRawAd());
        LIZLLL.LIZJ("landing_page", "refer");
        LIZLLL.LIZIZ("other", "entryPoint");
        LIZLLL.LIZIZ("native", "platform");
        LIZLLL.LJI();
        ECommerceAnchorPanelViewModel eCommerceAnchorPanelViewModel = this.LJLLJ;
        boolean isResumed = isResumed();
        eCommerceAnchorPanelViewModel.getClass();
        ProductListModel productListModel3 = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        String LJIIIZ2 = C71360RzY.LJIIIZ(productListModel3, true);
        if (LJIIIZ2 != null) {
            str5 = LJIIIZ2;
        }
        List<ShopWindowAnchorModel> list2 = eCommerceAnchorPanelViewModel.LJLJJL;
        boolean z = !isResumed;
        C71361RzZ.LIZ.getClass();
        L7W LJJIL = C71361RzZ.LJJIL(list2);
        ProductListModel productListModel4 = eCommerceAnchorPanelViewModel.LJLILLLLZI;
        if (productListModel4 != null && (panelOpenInfo = productListModel4.getPanelOpenInfo()) != null) {
            i2 = panelOpenInfo.getPanelStyle();
        }
        C71363Rzb.LJIJ(productListModel3, str5, list2, z, 0L, LJJIL, i2);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        Serializable serializable2;
        boolean z;
        int i;
        long j;
        ProductListModel productListModel;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        Serializable serializable3 = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("anchorStruct");
        } else {
            serializable = null;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) serializable;
        if (anchorCommonStruct == null) {
            anchorCommonStruct = this.LJLJL;
        }
        this.LJLJL = anchorCommonStruct;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            serializable2 = arguments2.getSerializable("productListModel");
        } else {
            serializable2 = null;
        }
        ProductListModel productListModel2 = (ProductListModel) serializable2;
        if (productListModel2 == null) {
            productListModel2 = this.LJLJLJ;
        }
        this.LJLJLJ = productListModel2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("useBubbleIcon");
        } else {
            z = this.LJLJLLL;
        }
        this.LJLJLLL = z;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            i = arguments4.getInt("anchorCount");
        } else {
            i = this.LJLL;
        }
        this.LJLL = i;
        Bundle arguments5 = getArguments();
        if (arguments5 != null) {
            j = arguments5.getLong("clickTime");
        } else {
            j = this.LJLLI;
        }
        this.LJLLI = j;
        this.LJLLJ.qv0(this.LJLJL, this.LJLJJLL, this.LJLJLLL, this.LJLL, this.LJLJLJ);
        ProductListModel productListModel3 = this.LJLLJ.LJLILLLLZI;
        if (productListModel3 == null) {
            productListModel3 = this.LJLJLJ;
        }
        this.LJLJLJ = productListModel3;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            serializable3 = arguments6.getSerializable("panelOpenInfo");
        }
        PanelOpenInfo panelOpenInfo = (PanelOpenInfo) serializable3;
        if (panelOpenInfo == null && ((productListModel = this.LJLJLJ) == null || (panelOpenInfo = productListModel.getPanelOpenInfo()) == null)) {
            panelOpenInfo = this.LJLLILLLL;
        }
        this.LJLLILLLL = panelOpenInfo;
        EventCenter.LJ().LIZJ("ec_cart_refresh", this);
        IEcUgPopupService LJIILJJIL = EcUgPopupService.LJIILJJIL();
        if (LJIILJJIL != null) {
            LJIILJJIL.LJIIJJI(mo49getActivity(), this.LJLJLJ.getTrackParams());
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Aweme aweme;
        LLIIL = false;
        IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
        InterfaceC44105HSr interfaceC44105HSr = this.LJLJJLL;
        if (interfaceC44105HSr != null) {
            aweme = interfaceC44105HSr.LJJLL();
        } else {
            aweme = null;
        }
        LJJJJI.LJJIJIIJIL(aweme, Integer.valueOf(this.LJLJLJ.getPanelOpenInfo().getPanelStyle()), this.LJLJLJ.getEntranceForm());
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(false);
        }
    }

    public final void Jl(VWR vwr, boolean z) {
        if (vwr == null) {
            return;
        }
        this.LLIIIJ = new C7A9(vwr);
        vwr.getViewTreeObserver().addOnGlobalLayoutListener(this.LLIIIJ);
        if (!z) {
            C45631qh c45631qh = this.LJLLLLLL;
            if (c45631qh != null) {
                c45631qh.setOnScrollChangeListener(new C71389S0b(this));
            }
            VWY vwy = this.LJZ;
            if (vwy != null) {
                vwy.setStopScrollAction(new AqS162S0100000_12(this, 5));
                return;
            }
            return;
        }
        vwr.LIZ(new C71388S0a(this));
        VWY vwy2 = this.LJZ;
        if (vwy2 == null) {
            return;
        }
        vwy2.setActionDownCallBack(new AqS162S0100000_12(this, 6));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, X.InterfaceC25830ABu
    public final void Pg(TuxSheet sheet, int i) {
        o.LJIIIZ(sheet, "sheet");
        this.LLIIIILZ = i;
        super.Pg(sheet, i);
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        int i;
        IECommerceVideoService iECommerceVideoService;
        Integer num;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_cart_refresh")) {
            S0I s0i = new S0I(this);
            try {
                CartRefreshEvent LIZ = C55824LvY.LIZ(str);
                RecyclerView recyclerView = this.LJLLL;
                AbstractC029409q abstractC029409q = null;
                if (recyclerView != null) {
                    abstractC029409q = recyclerView.getAdapter();
                }
                if ((abstractC029409q instanceof AnchorPanelAdapter) && abstractC029409q != null && (num = LIZ.count) != null) {
                    num.intValue();
                }
                Integer num2 = LIZ.count;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 0;
                }
                Kl(i);
                C71370Rzi.LIZ(LIZ.count);
                RecyclerView recyclerView2 = this.LJLLL;
                if (recyclerView2 != null && (iECommerceVideoService = this.LL) != null) {
                    iECommerceVideoService.LJ(recyclerView2, C78949Uyf.LJIILL(getContext()), s0i, LIZ.toast, C71408S0u.LJLIL);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:70|(1:72)|73|(1:75)|76|(1:247)(1:80)|81|(1:83)|84|(1:86)|87|(1:89)|90|(3:92|(4:95|(3:97|98|99)(1:101)|100|93)|102)|103|(2:104|105)|(11:(1:108)|242|112|113|(5:(1:116)|236|121|(20:123|(2:126|124)|127|(1:129)(1:157)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(1:144)|145|(3:147|(1:150)|149)|151|(1:153)|154|(1:156))|158)(1:237)|117|(1:119)|236|121|(0)|158)(1:243)|109|(10:111|112|113|(0)(0)|117|(0)|236|121|(0)|158)|242|112|113|(0)(0)|117|(0)|236|121|(0)|158) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x038e, code lost:
    
        if (r1 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04ee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x04ef, code lost:
    
        throw r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038c A[Catch: all -> 0x0390, CancellationException -> 0x04ee, TryCatch #6 {CancellationException -> 0x04ee, all -> 0x0390, blocks: (B:113:0x0374, B:117:0x0388, B:119:0x038c), top: B:112:0x0374 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021d  */
    @Override // com.ss.android.ugc.aweme.ecommerce.common.ECBaseSheetFragment, com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r49, android.os.Bundle r50) {
        /*
            Method dump skipped, instructions count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.anchor.fragment.ECommerceAnchorPanelFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.a0l, viewGroup, false);
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
