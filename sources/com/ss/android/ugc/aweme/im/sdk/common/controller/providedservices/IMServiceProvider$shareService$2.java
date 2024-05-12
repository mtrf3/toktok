package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C107774Kv;
import X.InterfaceC109344Qw;
import X.InterfaceC65784Pro;
import Y.ACListenerS27S0300000_1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.share.fragment.DownloadAndShareFragment;
import com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.LongPressShareWidget;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import djb.IDaS20S0000000_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS141S0200000_10;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;
import ujb.s;

/* loaded from: classes2.dex */
public final class IMServiceProvider$shareService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C107774Kv> {
    public static final IMServiceProvider$shareService$2 INSTANCE = new IMServiceProvider$shareService$2();

    public IMServiceProvider$shareService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.4Kv] */
    @Override // X.InterfaceC65784Pro
    public final C107774Kv invoke() {
        return new InterfaceC109344Qw() { // from class: X.4Kv
            /* JADX WARN: Type inference failed for: r0v0, types: [X.4SY] */
            @Override // X.InterfaceC109344Qw
            public final C4SY LIZLLL() {
                return new InterfaceC62102OYw() { // from class: X.4SY
                    public C113914dX LIZ;

                    @Override // X.InterfaceC62102OYw
                    public final C113914dX LIZJ() {
                        C113914dX c113914dX = this.LIZ;
                        if (c113914dX != null) {
                            return c113914dX;
                        }
                        o.LJIJI("shareChannelBar");
                        throw null;
                    }

                    @Override // X.InterfaceC62102OYw
                    public final void LIZIZ(View view) {
                        o.LJIIIZ(view, "view");
                        C113914dX c113914dX = (C113914dX) view.findViewById(R.id.jsw);
                        o.LJIIIIZZ(c113914dX, "view.share_channel_bar");
                        this.LIZ = c113914dX;
                        View findViewById = view.findViewById(R.id.n4h);
                        C110614Vt c110614Vt = new C110614Vt();
                        c110614Vt.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                        c110614Vt.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                        if (C26338AVi.LIZLLL(view)) {
                            c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(5));
                            c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(16));
                        } else {
                            c110614Vt.LJIIJ = Float.valueOf(C32151Nz.LJIIZILJ(16));
                            c110614Vt.LJIIJJI = Float.valueOf(C32151Nz.LJIIZILJ(5));
                        }
                        c110614Vt.LIZIZ = Integer.valueOf(R.attr.gu);
                        Context context = view.getContext();
                        o.LJIIIIZZ(context, "context");
                        findViewById.setBackground(c110614Vt.LIZ(context));
                        View findViewById2 = view.findViewById(R.id.l3m);
                        C110614Vt c110614Vt2 = new C110614Vt();
                        if (C26338AVi.LIZLLL(view)) {
                            c110614Vt2.LJIIIIZZ = C61328O5c.LIZJ(20);
                            c110614Vt2.LJIIJ = C61328O5c.LIZJ(20);
                            c110614Vt2.LJIIIZ = Float.valueOf(C32151Nz.LJIIZILJ(5));
                        } else {
                            c110614Vt2.LJIIIZ = C61328O5c.LIZJ(20);
                            c110614Vt2.LJIIJJI = C61328O5c.LIZJ(20);
                            c110614Vt2.LJIIIIZZ = Float.valueOf(C32151Nz.LJIIZILJ(5));
                        }
                        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.dj);
                        Context context2 = view.getContext();
                        o.LJIIIIZZ(context2, "context");
                        findViewById2.setBackground(c110614Vt2.LIZ(context2));
                        Context context3 = view.getContext();
                        o.LJIIIIZZ(context3, "context");
                        Integer LJI = C79045V0n.LJI(R.attr.dj, context3);
                        if (LJI != null) {
                            ((ImageView) view.findViewById(R.id.l0u)).setColorFilter(LJI.intValue());
                        }
                        View findViewById3 = view.findViewById(R.id.dai);
                        C110614Vt c110614Vt3 = new C110614Vt();
                        c110614Vt3.LIZIZ = Integer.valueOf(R.attr.gp);
                        c110614Vt3.LIZJ = C61328O5c.LIZJ(1);
                        Context context4 = view.getContext();
                        o.LJIIIIZZ(context4, "context");
                        findViewById3.setBackground(c110614Vt3.LIZ(context4));
                        View findViewById4 = view.findViewById(R.id.jj6);
                        C110614Vt c110614Vt4 = new C110614Vt();
                        c110614Vt4.LIZIZ = Integer.valueOf(R.attr.gp);
                        c110614Vt4.LIZJ = C61328O5c.LIZJ(1);
                        Context context5 = view.getContext();
                        o.LJIIIIZZ(context5, "context");
                        findViewById4.setBackground(c110614Vt4.LIZ(context5));
                        W5F LJII = W5U.LJII(C78939UyV.LJ(HG3.LJIILL().getCurUser().getAvatarThumb()));
                        LJII.LJJIJIIJIL = true;
                        LJII.LJJIIJ = (SmartImageView) view.findViewById(R.id.abh);
                        C16880lQ.LLJJJ(LJII);
                    }

                    @Override // X.InterfaceC62102OYw
                    public final View LIZ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        return C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.b8g, viewGroup, false, "inflater.inflate(R.layou…riends, container, false)");
                    }
                };
            }

            @Override // X.InterfaceC109344Qw
            public final C4L2 LJII() {
                C4L2 c4l2 = C4L2.LJLIL;
                c4l2.getClass();
                return c4l2;
            }

            @Override // X.InterfaceC109344Qw
            public final List<C66342j0> LJIIIIZZ() {
                List<C66342j0> LLIILII;
                C67532kv c67532kv = C67532kv.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("share_video_recent_records");
                LIZ.append(C67532kv.LIZIZ());
                Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
                o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + getCurrentUid())");
                synchronized (c67532kv) {
                    List<C66342j0> list = C67532kv.LIZIZ;
                    if (list == null) {
                        if (C67532kv.LIZJ == null) {
                            String[] stringArray = repo.getStringArray("recent_video_share_targets", new String[0]);
                            o.LJIIIIZZ(stringArray, "repo.getStringArray(KEVA_KEY, arrayOf())");
                            List<String> LJJZZIII = ORY.LJJZZIII(stringArray);
                            ArrayList arrayList = new ArrayList();
                            for (String it : LJJZZIII) {
                                o.LJIIIIZZ(it, "it");
                                C66342j0 LIZJ = C67532kv.LIZJ(it);
                                if (LIZJ != null) {
                                    arrayList.add(LIZJ);
                                }
                            }
                            C67532kv.LIZJ = arrayList;
                        }
                        List<C66342j0> list2 = C67532kv.LIZJ;
                        o.LJI(list2);
                        if (list2.isEmpty()) {
                            return null;
                        }
                        List<C66342j0> list3 = C67532kv.LIZJ;
                        o.LJI(list3);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (C66342j0 c66342j0 : list3) {
                            EnumC66332iz enumC66332iz = c66342j0.LIZ;
                            Object obj = linkedHashMap.get(enumC66332iz);
                            if (obj == null) {
                                obj = new ArrayList();
                                linkedHashMap.put(enumC66332iz, obj);
                            }
                            ((List) obj).add(c66342j0);
                        }
                        List list4 = (List) linkedHashMap.get(EnumC66332iz.INTERNAL);
                        if (list4 == null) {
                            list4 = C61878OQg.INSTANCE;
                        }
                        List list5 = (List) linkedHashMap.get(EnumC66332iz.EXTERNAL);
                        if (list5 == null) {
                            list5 = C61878OQg.INSTANCE;
                        }
                        if (list4.size() >= list5.size()) {
                            if (!list4.isEmpty()) {
                                if (list4.size() >= 3) {
                                    LLIILII = ORZ.LLIILII(list4.subList(list4.size() - 3, list4.size()));
                                } else {
                                    LLIILII = ORZ.LLIILII(list4);
                                }
                                C67532kv.LIZIZ = LLIILII;
                            }
                        } else if (!list5.isEmpty()) {
                            C67532kv.LIZIZ = C47261Igj.LJJIJ(ListProtector.get(list5, list5.size() - 1));
                        }
                        return C67532kv.LIZIZ;
                    }
                    return list;
                }
            }

            @Override // X.InterfaceC109344Qw
            public final boolean LJIILLIIL() {
                C107814Kz.LIZ.getClass();
                return C107814Kz.LIZ();
            }

            @Override // X.InterfaceC109344Qw
            public final boolean LJIILIIL() {
                if (C183317Hj.LIZ() != 0 && !C4LB.LIZ()) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC109344Qw
            public final boolean LJIJ() {
                if (C183317Hj.LIZ() == 3 || C183317Hj.LIZ() == 4) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC109344Qw
            public final boolean LJIJJLI() {
                if (C183317Hj.LIZ() != 0) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC109344Qw
            public final void LJ(SharePackage sharePackage) {
                C4KZ.LJ(C4KZ.LIZ, "click", sharePackage);
            }

            @Override // X.InterfaceC109344Qw
            public final C78842Uww LJFF(C108634Od c108634Od) {
                return new C78842Uww(c108634Od);
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIIJ(SharePackage sharePackage) {
                C4KZ.LJ(C4KZ.LIZ, "show", sharePackage);
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIILL(List<String> list) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("share_video_recent_records");
                LIZ.append(C67532kv.LIZIZ());
                Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
                o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + getCurrentUid())");
                ArrayList arrayList = (ArrayList) list;
                if (arrayList.isEmpty()) {
                    return;
                }
                C67532kv.LIZIZ = null;
                String[] storedList = repo.getStringArray("recent_video_share_targets", new String[0]);
                ArrayList arrayList2 = new ArrayList();
                o.LJIIIIZZ(storedList, "storedList");
                for (String item : storedList) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str = (String) it.next();
                            o.LJIIIIZZ(item, "item");
                            if (s.LJJJLZIJ(item, str, false)) {
                                break;
                            }
                        } else {
                            o.LJIIIIZZ(item, "item");
                            arrayList2.add(item);
                            break;
                        }
                    }
                }
                repo.storeStringArray("recent_video_share_targets", (String[]) arrayList2.toArray(new String[0]));
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    C66342j0 LIZJ = C67532kv.LIZJ((String) it2.next());
                    if (LIZJ != null) {
                        arrayList3.add(LIZJ);
                    }
                }
                C67532kv.LIZJ = arrayList3;
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIIZILJ(String key) {
                o.LJIIIZ(key, "key");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("share_video_recent_records");
                LIZ.append(C67532kv.LIZIZ());
                Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
                o.LJIIIIZZ(repo, "getRepo(KEVA_REPO_PREFIX + getCurrentUid())");
                C64962gm LIZ2 = C48841JEv.LIZ(C78613UtF.LIZJ);
                C67532kv.LIZIZ = null;
                XKX.LIZLLL(LIZ2, null, null, new C66322iy(key, repo, null), 3);
            }

            @Override // X.InterfaceC109344Qw
            public final DownloadAndShareFragment LIZJ(ActivityC45651qj activityC45651qj, SharePackage sharePackage) {
                DownloadAndShareFragment downloadAndShareFragment = new DownloadAndShareFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("SharePackage", sharePackage);
                downloadAndShareFragment.setArguments(bundle);
                return downloadAndShareFragment;
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIIIZ(long j, String str) {
                XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C3OM(j, str, null), 3);
            }

            /* JADX WARN: Type inference failed for: r0v1, types: [X.4Ox] */
            @Override // X.InterfaceC109344Qw
            public final C108834Ox LJIIJJI(final String str, final String str2) {
                if (C4LY.LIZ()) {
                    ((C4Z2) C96423qQ.LIZ()).LIZ(EnumC100693xJ.ENTER_SHARE_PANEL);
                }
                return new InterfaceC62480Ofc(str, str2) { // from class: X.4Ox
                    public final String LJLIL;
                    public final String LJLILLLLZI;
                    public InterfaceC108744Oo LJLJI;
                    public C62387Oe7 LJLJJI;
                    public C4OF LJLJJL;
                    public C108824Ow LJLJJLL;

                    @Override // X.InterfaceC62480Ofc
                    public final boolean LIZLLL() {
                        return true;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final C4SQ getLayoutPriority() {
                        if (C109254Qn.LIZIZ(LIZIZ().LJIIJ)) {
                            String str3 = this.LJLILLLLZI;
                            if (o.LJ(str3, "share_panel")) {
                                return C4SQ.values()[C4P1.LIZ().getPositionInShare()];
                            }
                            if (o.LJ(str3, "long_press")) {
                                return C4SQ.values()[C4P1.LIZ().getPositionInLongPress()];
                            }
                            return C4SQ.values()[C4P1.LIZ().getPosition()];
                        }
                        return C4SQ.TOP;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final EnumC62492Ofo getShowStyle() {
                        if (C109254Qn.LIZIZ(LIZIZ().LJIIJ)) {
                            return C4P2.LIZ(this.LJLILLLLZI);
                        }
                        return EnumC62492Ofo.HORIZONTAL;
                    }

                    public final C62387Oe7 LIZIZ() {
                        C62387Oe7 c62387Oe7 = this.LJLJJI;
                        if (c62387Oe7 != null) {
                            return c62387Oe7;
                        }
                        o.LJIJI("sharePanelConfig");
                        throw null;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final boolean LJFF() {
                        C4OF c4of = this.LJLJJL;
                        if (c4of != null && !c4of.LJLJLJ) {
                            Object parent = c4of.getParent();
                            o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                            if (((View) parent).getVisibility() == 0) {
                                SharePanelImHeadViewModel sharePanelImHeadViewModel = c4of.LJLJI;
                                if (sharePanelImHeadViewModel != null) {
                                    sharePanelImHeadViewModel.LJLZ.LJIIIIZZ().clear();
                                    sharePanelImHeadViewModel.LJLJLLL.setValue(sharePanelImHeadViewModel.LJLZ.LJIIIIZZ());
                                    MutableLiveData<Boolean> mutableLiveData = sharePanelImHeadViewModel.LJLLI;
                                    Boolean bool = Boolean.TRUE;
                                    mutableLiveData.setValue(bool);
                                    if (sharePanelImHeadViewModel.hv0()) {
                                        sharePanelImHeadViewModel.LJLJJLL.setValue(bool);
                                    }
                                    sharePanelImHeadViewModel.kv0();
                                    sharePanelImHeadViewModel.jv0();
                                }
                                C108484No c108484No = c4of.LJLJJL;
                                if (c108484No != null) {
                                    C4O5 LIZIZ = c108484No.LIZIZ();
                                    LIZIZ.LIZIZ().clear();
                                    LIZIZ.LIZ().clear();
                                    LIZIZ.LIZJ().clear();
                                    c108484No.LIZJ();
                                }
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final void LJI() {
                        RecyclerView recyclerView;
                        C108824Ow c108824Ow = this.LJLJJLL;
                        if (c108824Ow != null) {
                            C4P0 c4p0 = c108824Ow.LJLILLLLZI;
                            LinearLayoutManager linearLayoutManager = null;
                            if (c4p0 != null) {
                                if (c4p0.getItemCount() > 0) {
                                    C0A2 layoutManager = ((RecyclerView) c108824Ow.LIZ(R.id.j_j)).getLayoutManager();
                                    if (layoutManager instanceof LinearLayoutManager) {
                                        linearLayoutManager = (LinearLayoutManager) layoutManager;
                                    }
                                    if ((linearLayoutManager != null && linearLayoutManager.LLIL() == 0) || (recyclerView = (RecyclerView) c108824Ow.LIZ(R.id.j_j)) == null) {
                                        return;
                                    }
                                    recyclerView.LJLI(0);
                                    return;
                                }
                                return;
                            }
                            o.LJIJI("avatarAdapter");
                            throw null;
                        }
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final boolean LJII() {
                        if (C4P1.LIZ().getPosition() == C4SQ.TOP.ordinal()) {
                            return true;
                        }
                        return false;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final EnumC110664Vy getWidgetType() {
                        return EnumC110664Vy.IM_HEADER;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final View getWidgetView() {
                        return this.LJLJJLL;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final void LIZJ(C62387Oe7 sharePanelConfig) {
                        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
                        this.LJLJJI = sharePanelConfig;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final void setUpAdditionView(Fragment hostFragment) {
                        o.LJIIIZ(hostFragment, "hostFragment");
                        C4OF c4of = this.LJLJJL;
                        if (c4of != null) {
                            C62387Oe7 LIZIZ = LIZIZ();
                            InterfaceC108744Oo interfaceC108744Oo = this.LJLJI;
                            if (interfaceC108744Oo != null) {
                                c4of.LJ(LIZIZ, hostFragment, interfaceC108744Oo);
                            } else {
                                o.LJIJI("callback");
                                throw null;
                            }
                        }
                    }

                    {
                        this.LJLIL = str;
                        this.LJLILLLLZI = str2;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final View LIZ(C25600zU c25600zU, C62387Oe7 sharePanelConfig, Fragment hostFragment) {
                        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
                        o.LJIIIZ(hostFragment, "hostFragment");
                        if (c25600zU == null) {
                            return null;
                        }
                        C4OF c4of = new C4OF(c25600zU);
                        this.LJLJJL = c4of;
                        InterfaceC108744Oo interfaceC108744Oo = this.LJLJI;
                        if (interfaceC108744Oo != null) {
                            c4of.LJ(sharePanelConfig, hostFragment, interfaceC108744Oo);
                            return this.LJLJJL;
                        }
                        o.LJIJI("callback");
                        throw null;
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final void LJIIIIZZ(C25600zU c25600zU, Fragment hostFragment, C4P8 hostPanelPanelCallback) {
                        InterfaceC108744Oo c4r8;
                        o.LJIIIZ(hostFragment, "hostFragment");
                        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
                        C84683Ua.LJFF.LIZIZ(C108684Oi.LJ, false);
                        BaseSharePackage baseSharePackage = LIZIZ().LJIIJ;
                        if (C4P2.LIZ(this.LJLILLLLZI) == EnumC62492Ofo.VERTICAL && C109254Qn.LIZIZ(baseSharePackage)) {
                            c4r8 = new C4R7(c25600zU, LIZIZ().LJIILJJIL, hostPanelPanelCallback);
                        } else {
                            c4r8 = new C4R8(c25600zU, LIZIZ().LJIILJJIL, hostPanelPanelCallback);
                        }
                        this.LJLJI = c4r8;
                        C108824Ow c108824Ow = this.LJLJJLL;
                        if (c108824Ow != null) {
                            BaseSharePackage baseSharePackage2 = LIZIZ().LJIIJ;
                            o.LJII(baseSharePackage2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
                            SharePackage sharePackage = (SharePackage) baseSharePackage2;
                            List<InterfaceC62225ObV> list = LIZIZ().LIZ;
                            EnumC62492Ofo showStyle = getShowStyle();
                            InterfaceC108744Oo interfaceC108744Oo = this.LJLJI;
                            if (interfaceC108744Oo != null) {
                                String str3 = this.LJLIL;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                c108824Ow.LJIIIZ(sharePackage, list, hostFragment, showStyle, interfaceC108744Oo, hostPanelPanelCallback, str3);
                                C82243Kq.LIZ(c108824Ow, new C4OZ());
                                return;
                            }
                            o.LJIJI("callback");
                            throw null;
                        }
                    }

                    @Override // X.InterfaceC62480Ofc
                    public final View LJ(C25600zU c25600zU, C62387Oe7 sharePanelConfig, C4P8 hostPanelPanelCallback, Fragment hostFragment) {
                        InterfaceC108744Oo c4r8;
                        C108824Ow c108824Ow;
                        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
                        o.LJIIIZ(hostPanelPanelCallback, "hostPanelPanelCallback");
                        o.LJIIIZ(hostFragment, "hostFragment");
                        if (c25600zU == null) {
                            return null;
                        }
                        C84683Ua.LJFF.LIZIZ(C108684Oi.LJ, true);
                        BaseSharePackage baseSharePackage = sharePanelConfig.LJIIJ;
                        if (C4P2.LIZ(this.LJLILLLLZI) == EnumC62492Ofo.VERTICAL && C109254Qn.LIZIZ(baseSharePackage)) {
                            c4r8 = new C4R7(c25600zU, sharePanelConfig.LJIILJJIL, hostPanelPanelCallback);
                        } else {
                            c4r8 = new C4R8(c25600zU, sharePanelConfig.LJIILJJIL, hostPanelPanelCallback);
                        }
                        this.LJLJI = c4r8;
                        BaseSharePackage baseSharePackage2 = sharePanelConfig.LJIIJ;
                        o.LJII(baseSharePackage2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
                        if (o.LJ(baseSharePackage2.itemType, "aigc_avatar")) {
                            c108824Ow = new C4PB(c25600zU);
                        } else {
                            c108824Ow = new C108824Ow(c25600zU);
                        }
                        this.LJLJJLL = c108824Ow;
                        BaseSharePackage baseSharePackage3 = sharePanelConfig.LJIIJ;
                        o.LJII(baseSharePackage3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
                        SharePackage sharePackage = (SharePackage) baseSharePackage3;
                        List<InterfaceC62225ObV> list = sharePanelConfig.LIZ;
                        EnumC62492Ofo showStyle = getShowStyle();
                        InterfaceC108744Oo interfaceC108744Oo = this.LJLJI;
                        if (interfaceC108744Oo != null) {
                            String str3 = this.LJLIL;
                            if (str3 == null) {
                                str3 = "";
                            }
                            c108824Ow.LJIIIZ(sharePackage, list, hostFragment, showStyle, interfaceC108744Oo, hostPanelPanelCallback, str3);
                            C82243Kq.LIZ(c108824Ow, new C4OZ());
                            return this.LJLJJLL;
                        }
                        o.LJIJI("callback");
                        throw null;
                    }
                };
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIILJJIL(final ActivityC45651qj activityC45651qj, final C62846OlW c62846OlW) {
                PopupManager.LJIIL(new AbstractC55363Lo7(activityC45651qj, c62846OlW) { // from class: X.9p4
                    public final ActivityC45651qj LJLIL;
                    public final View LJLILLLLZI;

                    @Override // X.InterfaceC56321M8n
                    public final int getPriority() {
                        return 3000;
                    }

                    @Override // X.M74
                    public final boolean canShow() {
                        return !C4LB.LIZ();
                    }

                    @Override // X.InterfaceC55641Lsb
                    public final C54082LKk getPopupContext() {
                        Context LJIIIIZZ = C84763XOl.LJIIIIZZ();
                        if (LJIIIIZZ == null) {
                            LJIIIIZZ = this.LJLIL;
                        }
                        if (LJIIIIZZ instanceof ActivityC45651qj) {
                            return C54081LKj.LIZ(LJIIIIZZ, (LifecycleOwner) LJIIIIZZ);
                        }
                        return null;
                    }

                    {
                        this.LJLIL = activityC45651qj;
                        this.LJLILLLLZI = c62846OlW;
                    }

                    @Override // X.M72
                    public final void LIZLLL(C54082LKk context, M78 wrapper) {
                        o.LJIIIZ(context, "context");
                        o.LJIIIZ(wrapper, "wrapper");
                        C139825eE c139825eE = new C139825eE(context.LIZ);
                        c139825eE.LIZIZ(this.LJLILLLLZI);
                        c139825eE.LJFF();
                        c139825eE.LJI(WHL.START);
                        c139825eE.LJIIJJI(R.string.er9);
                        C82682Wcg c82682Wcg = c139825eE.LIZ;
                        c82682Wcg.LJII = 3000L;
                        c82682Wcg.LJIJJLI = true;
                        c82682Wcg.LJIL = false;
                        c139825eE.LJ(new AqS154S0100000_4(wrapper, 5));
                        c139825eE.LIZJ().show();
                        C4LB.LIZIZ();
                    }
                });
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x0029, code lost:
            
                if (X.C76800UCe.LIZ == null) goto L8;
             */
            @Override // X.InterfaceC109344Qw
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C4O4 LJIJJ(X.C4OO r4, X.C4RD r5) {
                /*
                    r3 = this;
                    X.3AB r1 = X.C96423qQ.LIZ()
                    X.3xJ r0 = X.EnumC100693xJ.ENTER_SHARE_PANEL
                    X.4Z2 r1 = (X.C4Z2) r1
                    r1.LIZ(r0)
                    X.4O4 r2 = new X.4O4
                    r2.<init>(r4, r5)
                    r5.LIZIZ = r2
                    boolean r0 = X.C80763Ey.LIZLLL()
                    if (r0 == 0) goto L2b
                    com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r4.LIZIZ
                    boolean r0 = X.C3RJ.LIZ(r0)
                    if (r0 != 0) goto L2b
                    com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget r0 = new com.ss.android.ugc.aweme.im.sdk.share.panel.ui.widget.SharePanelWidget
                    r0.<init>(r4, r5)
                    r2.LJLILLLLZI = r0
                    X.UCe r0 = X.C76800UCe.LIZ
                    if (r0 != 0) goto L32
                L2b:
                    android.view.ViewGroup r1 = r4.LIZJ
                    r0 = 8
                    r1.setVisibility(r0)
                L32:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C107774Kv.LJIJJ(X.4OO, X.4RD):X.4O4");
            }

            @Override // X.InterfaceC109344Qw
            public final LongPressShareWidget LJIL(C108654Of c108654Of, C4R9 c4r9) {
                return new LongPressShareWidget(c108654Of, c4r9);
            }

            @Override // X.InterfaceC109344Qw
            public final void LIZIZ(IMContact iMContact, SharePackage sharePackage, C4L0 c4l0) {
                if (sharePackage == null) {
                    return;
                }
                if (TextUtils.equals(sharePackage.itemType, "web")) {
                    C107274Ix.LJ(Collections.singletonList(iMContact), null, sharePackage, null, null, null, C3Y4.LIZ(), null, null);
                } else {
                    C107274Ix.LJ(Collections.singletonList(iMContact), null, sharePackage, null, null, null, null, null, null);
                }
                c4l0.run(Boolean.TRUE);
            }

            @Override // X.InterfaceC109344Qw
            public final OOS LJI(Activity activity, C62387Oe7 c62387Oe7, C4NQ c4nq) {
                BaseSharePackage baseSharePackage = c62387Oe7.LJIIJ;
                o.LJII(baseSharePackage, "null cannot be cast to non-null type com.ss.android.ugc.aweme.sharer.model.SharePackage");
                return C4NK.LIZ(activity, (SharePackage) baseSharePackage, null, null, true, c4nq, false, null, false, c62387Oe7.LJJIJ, false, 3020);
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIIL(Context context, View view, C107794Kx c107794Kx) {
                IMContact iMContact;
                String string;
                ViewGroup viewGroup;
                int i;
                int i2;
                View view2 = view;
                if (context == null || view2 == null || c107794Kx == null) {
                    return;
                }
                List<IMContact> list = c107794Kx.LJLILLLLZI;
                if (list == null || (iMContact = (IMContact) ORZ.LJLLLL(list)) == null) {
                    iMContact = c107794Kx.LJLIL;
                }
                if (c107794Kx.LJLJI) {
                    string = context.getString(R.string.h0o, iMContact.getDisplayName());
                    o.LJIIIIZZ(string, "this.getString(R.string.…ers, contact.displayName)");
                } else if (c107794Kx.LJLJLJ) {
                    string = context.getString(R.string.gvm);
                    o.LJIIIIZZ(string, "this.getString(R.string.group_chat_3_sent_toast)");
                } else {
                    string = context.getString(R.string.h0n, iMContact.getDisplayName());
                    o.LJIIIIZZ(string, "this.getString(R.string.…ser, contact.displayName)");
                }
                if (string.length() == 0) {
                    return;
                }
                ViewGroup viewGroup2 = null;
                do {
                    if (view2 instanceof C45621qg) {
                        viewGroup = (ViewGroup) view2;
                        break;
                    }
                    if (view2 instanceof FrameLayout) {
                        if (view2.getId() == 16908290) {
                            viewGroup = (ViewGroup) view2;
                            break;
                        }
                        viewGroup2 = (ViewGroup) view2;
                    }
                    Object parent = view2.getParent();
                    if (!(parent instanceof View)) {
                        break;
                    } else {
                        view2 = (View) parent;
                    }
                } while (view2 != null);
                viewGroup = viewGroup2;
                if (viewGroup != null) {
                    Context context2 = viewGroup.getContext();
                    LayoutInflater LLZIL = C16880lQ.LLZIL(context2);
                    TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(Snackbar.LJIILLIIL);
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                    obtainStyledAttributes.recycle();
                    if (resourceId != -1 && resourceId2 != -1) {
                        i = R.layout.bu3;
                    } else {
                        i = R.layout.ak6;
                    }
                    C80003VaZ c80003VaZ = (C80003VaZ) C16880lQ.LLLLIILL(LLZIL, i, viewGroup, false);
                    Snackbar snackbar = new Snackbar(context2, viewGroup, c80003VaZ, c80003VaZ);
                    ((C80003VaZ) snackbar.LIZJ.getChildAt(0)).getMessageView().setText("");
                    snackbar.LJ = -2;
                    BaseTransientBottomBar.h hVar = snackbar.LIZJ;
                    o.LJII(hVar, "null cannot be cast to non-null type com.google.android.material.snackbar.Snackbar.SnackbarLayout");
                    C111684Zw c111684Zw = (C111684Zw) hVar;
                    c111684Zw.setPadding(0, 0, 0, 0);
                    c111684Zw.findViewById(R.id.k6c).setVisibility(4);
                    AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1(snackbar, 629);
                    View snackView = C16880lQ.LLLZIIL(R.layout.b_9, C16880lQ.LLZIL(context), c111684Zw);
                    o.LJIIIIZZ(snackView, "snackView");
                    C2068389v c2068389v = new C2068389v();
                    if (C00F.LIZ(31744, 0, "im_icon_redesign", true) == 4) {
                        i2 = R.raw.icon_color_dm_icon_experiment_v1;
                    } else {
                        i2 = R.raw.icon_color_direct_message_circle;
                    }
                    c2068389v.LIZ = i2;
                    ((TuxIconView) snackView.findViewById(R.id.f04)).setTuxIcon(c2068389v);
                    C107234It.LJI("bottom_bar", "show");
                    ((TextView) snackView.findViewById(R.id.mcd)).setText(string);
                    C16880lQ.LJIIJ(new ACListenerS27S0300000_1(context, c107794Kx, aqS151S0100000_1, 2), snackView);
                    XIC xic = C78613UtF.LIZ;
                    XKX.LIZLLL(C48841JEv.LIZ(xic), null, null, new C67262kU(snackbar, c111684Zw, c107794Kx, context, null), 3);
                    XKX.LIZLLL(C48841JEv.LIZ(xic.plus(new IDaS20S0000000_1(CoroutineExceptionHandler.LJJJJIZL, 6))), null, null, new C67252kT(snackbar, null), 3);
                    return;
                }
                throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
            }

            @Override // X.InterfaceC109344Qw
            public final void LIZ(Context context, int[] iArr, AwemeSharePackage awemeSharePackage, AqS151S0100000_1 aqS151S0100000_1, AqS151S0100000_1 aqS151S0100000_12, AqS141S0200000_10 aqS141S0200000_10) {
                boolean z;
                int[] iArr2 = iArr;
                C4L2 c4l2 = C4L2.LJLIL;
                c4l2.getClass();
                if (iArr2 == null) {
                    iArr2 = new int[2];
                    int i = 0;
                    do {
                        iArr2[i] = 0;
                        i++;
                    } while (i < 2);
                }
                C4S6 c4s6 = new C4S6(context, awemeSharePackage, iArr2, new C107784Kw(c4l2), aqS141S0200000_10);
                c4s6.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: X.4L1
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        C4L2.LIZ();
                    }
                });
                C4L2.LJLILLLLZI = c4s6;
                C4L2.LJLJJI = awemeSharePackage;
                C4L2.LJLJJL = aqS151S0100000_1;
                C4L2.LJLJJLL = aqS151S0100000_12;
                if (!C80763Ey.LIZLLL()) {
                    c4l2.ks(C61878OQg.INSTANCE);
                    return;
                }
                SharePackage sharePackage = C4L2.LJLJJI;
                C61878OQg c61878OQg = C61878OQg.INSTANCE;
                EnumC84123Rw enumC84123Rw = EnumC84123Rw.NORMAL;
                C3WF.LIZ.getClass();
                EnumC84133Rx LIZ = C3WF.LIZ();
                if (C3WF.LIZ() != EnumC84133Rx.RECENT_SHARED) {
                    z = true;
                } else {
                    z = false;
                }
                SharePanelViewModel LIZ2 = C3WG.LIZ(sharePackage, c4l2, c61878OQg, enumC84123Rw, 5, LIZ, true, z, false, true, null, C57434MgQ.LIZIZ(context), 5632);
                C4L2.LJLJI = LIZ2;
                LIZ2.LJIILIIL();
            }

            @Override // X.InterfaceC109344Qw
            public final void LJIJI(final String msg, User user, Aweme aweme, String str, boolean z, String str2, final InterfaceC88472Yns<? super CharSequence, C76800UCe> interfaceC88472Yns) {
                String str3;
                o.LJIIIZ(msg, "msg");
                if (z) {
                    str3 = "story_exposed_emoji";
                } else {
                    str3 = "quick_reply_pannel";
                }
                C107274Ix.LJII(msg, user, aweme, str, str3, str2, Boolean.valueOf(z), new C4J3() { // from class: X.4Ky
                    @Override // X.C4J3
                    public final void LIZIZ() {
                        InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(msg);
                        }
                    }
                });
            }
        };
    }
}
