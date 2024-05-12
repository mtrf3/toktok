package com.bytedance.android.live.rank.impl.list;

import X.B4Q;
import X.B9K;
import X.BCW;
import X.BPN;
import X.BY6;
import X.C05630Jz;
import X.C0K2;
import X.C0NB;
import X.C10A;
import X.C15380j0;
import X.C15490jB;
import X.C16880lQ;
import X.C28507BGt;
import X.C29306Beo;
import X.C31515CYl;
import X.C31522CYs;
import X.C31524CYu;
import X.C31526CYw;
import X.C3KP;
import X.C41081jM;
import X.C47261Igj;
import X.C73943T0h;
import X.C77389UYv;
import X.C77932UiG;
import X.C77933UiH;
import X.C77934UiI;
import X.C77936UiK;
import X.C77937UiL;
import X.C77940UiO;
import X.C77942UiQ;
import X.C77987Uj9;
import X.C80655Vl5;
import X.C88207Yjb;
import X.CCJ;
import X.CFX;
import X.CHO;
import X.CN1;
import X.CXJ;
import X.CZ2;
import X.EnumC29609Bjh;
import X.EnumC31059CGx;
import X.InterfaceC29882Bo6;
import X.InterfaceC77939UiN;
import X.OSZ;
import X.U5Z;
import X.W5G;
import X.X1D;
import Y.AObserverS81S0100000_13;
import Y.AfS65S0100000_13;
import Y.IDiS274S0100000_13;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.liveinteract.api.LinkInviteSuccessEvent;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.RankSparkFragment;
import com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.rank.api.RankListDialogVisibilityChannel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.impl.CloseRankDialogEvent;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class RankListDialog extends LiveDialogFragment implements InterfaceC77939UiN {
    public static final /* synthetic */ int LJLLI = 0;
    public boolean LJLIL;
    public boolean LJLJI;
    public C77934UiI LJLJJI;
    public RankRootController LJLJJL;
    public C77987Uj9 LJLJJLL;
    public CZ2 LJLJL;
    public final Map<Integer, View> LJLL = new LinkedHashMap();
    public boolean LJLILLLLZI = true;
    public C31526CYw LJLJLJ = C31526CYw.LJFF;
    public final IDiS274S0100000_13 LJLJLLL = new IDiS274S0100000_13(this, 0);

    static {
        new C77933UiH();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLL;
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
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int LJFF;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.kv0(BCW.class);
        } else {
            bool = null;
        }
        this.LJLJI = C29306Beo.LJJ(bool);
        if (xl().LJFF.style == RankTypeV2.LJII.style && !this.LJLIL) {
            i = R.layout.d07;
        } else {
            i = R.layout.d06;
        }
        C28507BGt c28507BGt = new C28507BGt(i);
        if (this.LJLJI) {
            i2 = R.style.aai;
        } else if (CCJ.LIZ(getContext())) {
            i2 = R.style.aam;
        } else {
            i2 = R.style.aan;
        }
        c28507BGt.LIZJ = i2;
        if (this.LJLJI) {
            i3 = 80;
        } else if (CCJ.LIZ(getContext())) {
            i3 = 3;
        } else {
            i3 = 5;
        }
        c28507BGt.LJII = i3;
        c28507BGt.LJI = 0.0f;
        if (this.LJLJI) {
            LJFF = -1;
        } else {
            LJFF = C15380j0.LJFF(R.dimen.ad9);
        }
        c28507BGt.LJIIIZ = LJFF;
        int LIZ = U5Z.LIZ(this, this.LJLJI);
        int LIZIZ = (int) (B9K.LIZIZ(getContext()) * 0.8f);
        if (LIZ > LIZIZ) {
            LIZ = LIZIZ;
        }
        c28507BGt.LJIIJ = LIZ;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final InterfaceC29882Bo6 genLandscapeDialogProxy() {
        int i;
        if (xl().LJFF.style == RankTypeV2.LJII.style && !this.LJLIL) {
            i = R.layout.d07;
        } else {
            i = R.layout.d06;
        }
        return new BY6(i);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        WeakReference weakReference;
        Runnable runnable;
        super.onDestroy();
        if (this.LJLIL && (weakReference = C3KP.LJLILLLLZI) != null && (runnable = (Runnable) weakReference.get()) != null) {
            runnable.run();
        }
        if (!this.LJLIL) {
            C3KP.LJLILLLLZI = null;
        }
        C77936UiK c77936UiK = new C77936UiK(RankTypeV2.LJIILL, wl().LIZIZ().LJLJJI, wl().LIZIZ().LJLJJL, "", Boolean.valueOf(wl().LIZIZ().LJLJJLL));
        List<RankTabInfo> list = wl().LIZIZ().LJLIL;
        long currentTimeMillis = System.currentTimeMillis();
        for (OSZ<Integer, Integer> osz : C31524CYu.LJIIIIZZ.keySet()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            C05630Jz.LJI(jSONObject, "current_entity_rank_type", BPN.LIZ(osz.getFirst().intValue(), osz.getSecond().intValue()).rankName);
            C05630Jz.LJI(jSONObject, "current_entrance_rank_type", c77936UiK.LIZJ.rankName);
            C05630Jz.LIZ(c77936UiK.LIZIZ.getType(), "group_type", jSONObject);
            C31524CYu.LIZ(jSONObject3, osz.getFirst().intValue(), osz.getSecond().intValue(), list);
            Integer num = C31524CYu.LJIIIIZZ.get(osz);
            if (num == null) {
                num = -1;
            }
            C05630Jz.LIZ(num.intValue(), "current_entity_status", jSONObject);
            HashMap<OSZ<Integer, Integer>, Long> hashMap = C31524CYu.LJ;
            Long l = hashMap.get(osz);
            if (l == null) {
                l = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration", currentTimeMillis - l.longValue());
            Long l2 = hashMap.get(osz);
            if (l2 == null) {
                l2 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration", currentTimeMillis - l2.longValue());
            HashMap<OSZ<Integer, Integer>, Long> hashMap2 = C31524CYu.LIZIZ;
            Long l3 = hashMap2.get(osz);
            if (l3 == null) {
                l3 = 0L;
            }
            C05630Jz.LJFF(jSONObject2, "event_duration_all", currentTimeMillis - l3.longValue());
            Long l4 = hashMap2.get(osz);
            if (l4 == null) {
                l4 = 0L;
            }
            C05630Jz.LJFF(jSONObject3, "event_duration_all", currentTimeMillis - l4.longValue());
            C05630Jz.LIZJ("extra", jSONObject4, jSONObject3);
            C0K2.LJI("ttlive_ranklist_entity_exit", jSONObject, jSONObject2, jSONObject4);
        }
        C31524CYu.LJI();
    }

    public final RankRootController wl() {
        RankRootController rankRootController = this.LJLJJL;
        if (rankRootController != null) {
            return rankRootController;
        }
        o.LJIJI("controller");
        throw null;
    }

    public final C77934UiI xl() {
        C77934UiI c77934UiI = this.LJLJJI;
        if (c77934UiI != null) {
            return c77934UiI;
        }
        o.LJIJI("params");
        throw null;
    }

    @Override // X.InterfaceC77939UiN
    public final Context e8() {
        return getContext();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C88207Yjb.LIZ("rank_list_show");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(RankListDialogVisibilityChannel.class, Boolean.TRUE);
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            ViewTreeLifecycleOwner.set(decorView, this);
            ViewTreeViewModelStoreOwner.set(decorView, this);
            C10A.LIZIZ(decorView, this);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(RankListDialogVisibilityChannel.class, Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC77939UiN
    public final DataChannel Fe() {
        return this.dataChannel;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final EnumC29609Bjh getPanelType() {
        return EnumC29609Bjh.PANEL_HOURLY;
    }

    @Override // X.InterfaceC77939UiN
    public final C77987Uj9 p6() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC77939UiN
    public final void E6(C77942UiQ rankEntranceItem) {
        o.LJIIIZ(rankEntranceItem, "rankEntranceItem");
        RankListV2Response.PathToOtherList pathToOtherList = rankEntranceItem.LIZIZ;
        if (!pathToOtherList.existFlowPath || TextUtils.isEmpty(pathToOtherList.schema)) {
            _$_findCachedViewById(R.id.c_e).setVisibility(8);
            return;
        }
        _$_findCachedViewById(R.id.c_e).setVisibility(0);
        ((TextView) _$_findCachedViewById(R.id.m5a)).setText(CXJ.LJFF(rankEntranceItem.LIZIZ.description, "").toString());
        C15490jB.LJ(_$_findCachedViewById(R.id.f1u), "tiktok_live_revenue_demand_1", "ttlive_bg_dialog_rank_entrance_to_league.png");
        C16880lQ.LJIIJ(new C77937UiL(this, rankEntranceItem), _$_findCachedViewById(R.id.c_e));
        C31522CYs.LJIIIZ(rankEntranceItem.LIZ, this.dataChannel, "daily_rank_list");
    }

    @Override // X.InterfaceC77939UiN
    public final void Id(Uri uri) {
        int LIZ;
        int LJFF;
        boolean z = this.LJLJI;
        View view = getView();
        if (view != null) {
            LIZ = view.getHeight();
        } else {
            LIZ = U5Z.LIZ(this, z);
        }
        Uri LJJIJL = C29306Beo.LJJIJL(uri, "height", String.valueOf((int) C15380j0.LJIJ(LIZ)));
        View view2 = getView();
        if (view2 != null) {
            LJFF = view2.getWidth();
        } else if (z) {
            LJFF = -1;
        } else {
            LJFF = C15380j0.LJFF(R.dimen.ad9);
        }
        String valueOf = String.valueOf((int) C15380j0.LJIJ(LJFF));
        IActionHandlerService iActionHandlerService = (IActionHandlerService) CN1.LIZ(IActionHandlerService.class);
        Context context = getContext();
        Uri.Builder appendQueryParameter = LJJIJL.buildUpon().appendQueryParameter("width", valueOf);
        if (!z) {
            appendQueryParameter.appendQueryParameter("landscape_width", valueOf);
            appendQueryParameter.appendQueryParameter("landscape_transition_animation", "end");
            appendQueryParameter.appendQueryParameter("landscape_gravity", "end");
        }
        if (!z || TextUtils.isEmpty(UriProtector.getQueryParameter(LJJIJL, "height"))) {
            appendQueryParameter.appendQueryParameter("height", String.valueOf((int) C15380j0.LJIJ(U5Z.LIZ(this, z))));
        }
        iActionHandlerService.handle(context, appendQueryParameter.build());
    }

    public void initView(View view) {
        o.LJIIIZ(view, "view");
        boolean z = false;
        if (!this.LJLILLLLZI) {
            ((ImageView) _$_findCachedViewById(R.id.auv)).setVisibility(0);
            C16880lQ.LJJIIZI((C41081jM) _$_findCachedViewById(R.id.auv), new C77940UiO(this));
        } else {
            ((ImageView) _$_findCachedViewById(R.id.auv)).setVisibility(8);
        }
        try {
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.nb6);
            FragmentManager childFragmentManager = getChildFragmentManager();
            o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
            CZ2 cz2 = new CZ2(childFragmentManager);
            this.LJLJL = cz2;
            viewPager.setAdapter(cz2);
        } catch (IllegalStateException unused) {
        }
        ((C80655Vl5) _$_findCachedViewById(R.id.kyt)).LIZIZ(new C77932UiG(this));
        ((ViewPager) _$_findCachedViewById(R.id.nb6)).removeOnPageChangeListener(this.LJLJLLL);
        List<RankTabInfo> list = wl().LJLJI.LIZJ;
        if (list != null) {
            if (list.size() == 1) {
                _$_findCachedViewById(R.id.k13).setVisibility(0);
                _$_findCachedViewById(R.id.kyt).setVisibility(4);
                ((TextView) _$_findCachedViewById(R.id.k13)).setText(CXJ.LJFF(((RankTabInfo) ListProtector.get(list, 0)).title, ((RankTabInfo) ListProtector.get(list, 0)).LJLIL).toString());
                ((ImageView) _$_findCachedViewById(R.id.nii)).setVisibility(0);
                _$_findCachedViewById(R.id.ajo).setVisibility(0);
                if (this.LJLILLLLZI) {
                    int i = C31515CYl.LIZ[wl().LIZIZ().LJLJJI.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ((ImageView) _$_findCachedViewById(R.id.nii)).setVisibility(8);
                                _$_findCachedViewById(R.id.ajo).setVisibility(8);
                            } else {
                                int i2 = ((RankTabInfo) ListProtector.get(list, 0)).rankType;
                                if (i2 == RankTypeV2.LIZJ.type || i2 == RankTypeV2.LJIIJJI.type) {
                                    z = true;
                                }
                                if (z) {
                                    C15490jB.LJ(_$_findCachedViewById(R.id.nii), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_demand_1"), "ttlive_rank_tab_weekly_rookie_rank.png");
                                } else {
                                    C15490jB.LJ(_$_findCachedViewById(R.id.nii), CFX.LIZ("tiktok_live_basic_resource", "tiktok_live_revenue_normal_1"), "ttlive_rank_tab_weekly_rank.png");
                                }
                            }
                        } else {
                            ((W5G) _$_findCachedViewById(R.id.nii)).setImageResource(R.drawable.d_w);
                        }
                    } else {
                        ((W5G) _$_findCachedViewById(R.id.nii)).setImageResource(R.drawable.d_x);
                    }
                } else {
                    ((ImageView) _$_findCachedViewById(R.id.nii)).setVisibility(8);
                    _$_findCachedViewById(R.id.ajo).setVisibility(8);
                }
            } else {
                _$_findCachedViewById(R.id.ajo).setVisibility(0);
                ((ImageView) _$_findCachedViewById(R.id.nii)).setVisibility(8);
                if (list.size() > 2) {
                    ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.kyt).getLayoutParams();
                    o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginStart(C15380j0.LIZ(16.0f));
                    marginLayoutParams.setMarginEnd(C15380j0.LIZ(16.0f));
                    ((C80655Vl5) _$_findCachedViewById(R.id.kyt)).setTabMode(0);
                } else {
                    ViewGroup.LayoutParams layoutParams2 = _$_findCachedViewById(R.id.kyt).getLayoutParams();
                    o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginStart(C15380j0.LIZ(24.0f));
                    marginLayoutParams2.setMarginEnd(C15380j0.LIZ(24.0f));
                    ((C80655Vl5) _$_findCachedViewById(R.id.kyt)).setTabMode(1);
                }
                _$_findCachedViewById(R.id.k13).setVisibility(4);
                C80655Vl5 c80655Vl5 = (C80655Vl5) _$_findCachedViewById(R.id.kyt);
                c80655Vl5.setVisibility(0);
                c80655Vl5.setCustomTabViewResId(R.layout.dcg);
                c80655Vl5.LJLJI.setPadding(0, 0, 0, 0);
                c80655Vl5.setAutoFillWhenScrollable(true);
                ((C80655Vl5) _$_findCachedViewById(R.id.kyt)).setupWithViewPager((ViewPager) _$_findCachedViewById(R.id.nb6));
            }
            CZ2 cz22 = this.LJLJL;
            if (cz22 != null) {
                cz22.LJJIIJZLJL(vl(list), list);
            }
            ((ViewPager) _$_findCachedViewById(R.id.nb6)).setCurrentItem(wl().LIZIZ().LJLJL);
            ((ViewPager) _$_findCachedViewById(R.id.nb6)).addOnPageChangeListener(this.LJLJLLL);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        o.LJIIIZ(context, "context");
        super.onAttach(context);
        if (this.LJLJJI != null) {
            C0NB.LJ("RankListDialog", "onAttach: has mParams");
            return;
        }
        throw new IllegalArgumentException("RankListDialog not initial mParams");
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C31524CYu.LJIIIZ = this.dataChannel;
        C88207Yjb.LJIIL("rank_list_show", new CHO(xl().LJFF.type, ""));
        RankRootController rankRootController = new RankRootController(this, xl());
        getLifecycle().addObserver(rankRootController);
        rankRootController.LIZIZ().LJLILLLLZI = this.LJLJI;
        rankRootController.LIZIZ().LJLJJLL = this.LJLIL;
        this.LJLJJL = rankRootController;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.lv0(this, CloseRankDialogEvent.class, new AqS179S0100000_13(this, 267));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.lv0(this, LinkInviteSuccessEvent.class, new AqS179S0100000_13(this, 268));
        }
        C73943T0h.LIZ().LIZJ(this, B4Q.class).LIZIZ(new AfS65S0100000_13(this, 63));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.live.rank.impl.list.fragment.RankSparkFragment] */
    public final List<Fragment> vl(List<RankTabInfo> list) {
        ?? rankPageFragment;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (RankTabInfo rankTabInfo : list) {
            int i2 = i + 1;
            if (i >= 0) {
                RankTabInfo rankTabInfo2 = rankTabInfo;
                if ((EnumC31059CGx.RANK_PAGE.getScene() & rankTabInfo2.listLynxType) != 0) {
                    RankTypeV2 LIZ = BPN.LIZ(rankTabInfo2.rankType, rankTabInfo2.LJLILLLLZI);
                    rankPageFragment = new RankSparkFragment();
                    rankPageFragment.LJLILLLLZI = LIZ;
                } else {
                    RankTypeV2 LIZ2 = BPN.LIZ(rankTabInfo2.rankType, rankTabInfo2.LJLILLLLZI);
                    RankRootController wl = wl();
                    C77389UYv c77389UYv = new C77389UYv(this);
                    rankPageFragment = new RankPageFragment();
                    rankPageFragment.LJLIL = LIZ2;
                    rankPageFragment.LJLJJI = c77389UYv;
                    rankPageFragment.LJLJI = wl;
                }
                arrayList.add(rankPageFragment);
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (this.LJLJI) {
            _$_findCachedViewById(R.id.af5).setBackgroundResource(R.drawable.cal);
        } else if (CCJ.LIZ(getContext())) {
            _$_findCachedViewById(R.id.af5).setBackgroundResource(R.drawable.can);
        } else {
            _$_findCachedViewById(R.id.af5).setBackgroundResource(R.drawable.cam);
        }
        initView(view);
        RankRootController wl = wl();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onViewCreated(");
        LIZ.append(this);
        LIZ.append(')');
        C0NB.LIZIZ("RankRootController", X1D.LIZIZ(LIZ));
        wl.LJLJJI = this;
        wl.LIZIZ().LJLZ.observe(wl.LJLILLLLZI, new AObserverS81S0100000_13(wl, 14));
    }
}
