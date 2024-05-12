package com.ss.android.ugc.aweme.notification;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.ActivityC86117Xqz;
import X.C10K;
import X.C116644hw;
import X.C199797sl;
import X.C199807sm;
import X.C2058786d;
import X.C221108m2;
import X.C223318pb;
import X.C235119Kp;
import X.C252709vu;
import X.C2NU;
import X.C2U8;
import X.C3U3;
import X.C54362LVe;
import X.C56649MLd;
import X.C56741MOr;
import X.C56742MOs;
import X.C56947MWp;
import X.C56953MWv;
import X.C57050MaE;
import X.C57051MaF;
import X.C57053MaH;
import X.C62822Ol8;
import X.C65803Ps7;
import X.C73305Spp;
import X.C73306Spq;
import X.C73312Spw;
import X.C73379Sr1;
import X.C77266UUc;
import X.C78840Uwu;
import X.C80896Voy;
import X.E1X;
import X.IIJ;
import X.InterfaceC191547fS;
import X.InterfaceC56753MPd;
import X.InterfaceC74170T9a;
import X.KL2;
import X.MGN;
import X.MX4;
import X.MXK;
import X.MXL;
import X.MXP;
import X.ORZ;
import X.QD3;
import Y.AObserverS77S0100000_9;
import Y.AgS126S0100000_9;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ActivityAgent;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.notification.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes10.dex */
public final class MusFollowRequestDetailActivity extends ActivityC86117Xqz implements InterfaceC74170T9a, InterfaceC191547fS, InterfaceC56753MPd, MX4 {
    public static final /* synthetic */ int LJLJJL = 0;
    public C56953MWv LJLIL;
    public final Map<Integer, View> LJLJJI = new LinkedHashMap();
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 335));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 336));

    @Override // X.InterfaceC74170T9a
    public final void LJ() {
        boolean z;
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused) {
            z = false;
        }
        if (z || MGN.LJLILLLLZI.isStandardUIEnable()) {
            C56953MWv c56953MWv = this.LJLIL;
            if (c56953MWv != null) {
                if (c56953MWv.getItemCount() == 0) {
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                }
                C56742MOs LLFII = LLFII();
                C56741MOr c56741MOr = (C56741MOr) LLFII.LJLIL;
                if (c56741MOr != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    c56741MOr.LJLILLLLZI = false;
                    c56741MOr.LJLIL = false;
                    c56741MOr.LJIIIZ(20, currentTimeMillis);
                }
                LLFII.LJII();
                C57050MaE c57050MaE = C57050MaE.LJLIL;
                C57051MaF c57051MaF = C57053MaH.LIZ;
                if (c57051MaF != null) {
                    c57050MaE.invoke(c57051MaF);
                    return;
                }
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        C56953MWv c56953MWv2 = this.LJLIL;
        if (c56953MWv2 != null) {
            if (c56953MWv2.getItemCount() == 0) {
                C10K.LJII(100L).LJ(new AgS126S0100000_9(this, 4), C10K.LJIIIIZZ, null);
            }
            C57053MaH.LIZ = null;
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJJI).clear();
    }

    @Override // X.ActivityC86117Xqz, X.KMV
    public final View _$_findCachedViewById(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onPause() {
        C65803Ps7.LIZJ(this);
        super.onPause();
    }

    @Override // X.ActivityC86117Xqz, X.ActivityC45651qj, android.app.Activity
    public final void onResume() {
        C65803Ps7.LIZLLL(this);
        super.onResume();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStart() {
        C65803Ps7.LJ(this);
        super.onStart();
    }

    @Override // X.ActivityC86117Xqz, android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // X.InterfaceC56753MPd
    public final void zg0(int i, List list) {
    }

    public final C56742MOs LLFII() {
        return (C56742MOs) this.LJLILLLLZI.getValue();
    }

    @Override // X.InterfaceC56753MPd, X.MX4
    public final void f4() {
        C56953MWv c56953MWv = this.LJLIL;
        if (c56953MWv != null) {
            c56953MWv.clearData();
            C56953MWv c56953MWv2 = this.LJLIL;
            if (c56953MWv2 != null) {
                if (c56953MWv2.mShowFooter) {
                    c56953MWv2.setShowFooter(false);
                    C56953MWv c56953MWv3 = this.LJLIL;
                    if (c56953MWv3 != null) {
                        c56953MWv3.notifyDataSetChanged();
                        showLoadMoreEmpty();
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
                ((C80896Voy) _$_findCachedViewById(R.id.kwq)).setRefreshing(false);
                C56953MWv c56953MWv4 = this.LJLIL;
                if (c56953MWv4 != null) {
                    if (c56953MWv4.getItemCount() == 0) {
                        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        C73306Spq c73306Spq = new C73306Spq();
                        String string = getString(R.string.n6);
                        o.LJIIIIZZ(string, "getString(R.string.Follow_requests)");
                        c73306Spq.LJFF = string;
                        String string2 = getString(R.string.pay);
                        o.LJIIIIZZ(string2, "getString(R.string.priva…follow_request_empty_des)");
                        c73306Spq.LJI = string2;
                        c73305Spp.setStatus(c73306Spq);
                        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    }
                    C57053MaH.LIZJ((BaseResponse) LLFII().LJLIL.getData());
                    C57053MaH.LIZ(0);
                    return;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    public final void showLoadMoreEmpty() {
        C56953MWv c56953MWv = this.LJLIL;
        if (c56953MWv != null) {
            c56953MWv.showLoadMoreEmpty();
            C56953MWv c56953MWv2 = this.LJLIL;
            if (c56953MWv2 != null) {
                c56953MWv2.setShowFooter(false);
                return;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC191547fS
    public final void LJIIJJI() {
        long currentTimeMillis;
        C56742MOs LLFII = LLFII();
        C56741MOr c56741MOr = (C56741MOr) LLFII.LJLIL;
        if (c56741MOr != null) {
            FollowRequestResponse data = c56741MOr.getData();
            if (data != null) {
                currentTimeMillis = data.minTime;
            } else {
                currentTimeMillis = System.currentTimeMillis() / 1000;
            }
            c56741MOr.LJLILLLLZI = false;
            c56741MOr.LJLIL = true;
            c56741MOr.LJIIIZ(20, currentTimeMillis);
        }
        LLFII.LJII();
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onDestroy() {
        C65803Ps7.LIZIZ(this);
        super.onDestroy();
        LLFII().LIZIZ();
        EventBus.LIZJ().LJIJ(this);
    }

    @Override // X.ActivityC86117Xqz, X.C29S, X.ActivityC45651qj, android.app.Activity
    public final void onStop() {
        C65803Ps7.LJFF(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        try {
            getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
        } catch (Throwable unused2) {
        }
    }

    @Override // X.InterfaceC56753MPd
    public final void Er0(boolean z) {
        if (z) {
            C56953MWv c56953MWv = this.LJLIL;
            if (c56953MWv != null) {
                c56953MWv.showLoadMoreLoading();
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
    }

    @Override // X.ActivityC86117Xqz, X.KMV, X.ActivityC45651qj, androidx.activity.ComponentActivity, X.C1AU, android.app.Activity
    public final void onCreate(Bundle bundle) {
        C65803Ps7.LIZ(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", true);
        activityConfiguration(MXL.LJLIL);
        super.onCreate(bundle);
        C57053MaH.LIZIZ(MXP.DETAIL_TYPE_FOLLOW_REQUEST, 0, "");
        setContentView(R.layout.rj);
        AbstractC030109x itemAnimator = ((RecyclerView) _$_findCachedViewById(R.id.isn)).getItemAnimator();
        o.LJII(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((AbstractC28931Bp) itemAnimator).LJI = false;
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).setLayoutManager(new WrapLinearLayoutManager());
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).LJII(new C116644hw(1, (int) KL2.LIZJ(this, 1.0f), 0), -1);
        ((RecyclerView) _$_findCachedViewById(R.id.isn)).LJIIJJI(new C73379Sr1(this));
        C56649MLd.LIZ((RecyclerView) _$_findCachedViewById(R.id.isn), (C223318pb) _$_findCachedViewById(R.id.kwq));
        ((C80896Voy) _$_findCachedViewById(R.id.kwq)).setOnRefreshListener(this);
        C252709vu c252709vu = (C252709vu) _$_findCachedViewById(R.id.l_2);
        C235119Kp c235119Kp = new C235119Kp();
        String string = getString(R.string.n6);
        o.LJIIIIZZ(string, "getString(R.string.Follow_requests)");
        C78840Uwu.LJJIZ(c235119Kp, string, new AqS159S0100000_9(this, 1026));
        c252709vu.setNavActions(c235119Kp);
        C56953MWv c56953MWv = new C56953MWv(this);
        this.LJLIL = c56953MWv;
        c56953MWv.setLoadEmptyText(R.string.h7m);
        if (this.LJLIL != null) {
            ((Number) this.LJLJI.getValue()).intValue();
            C56953MWv c56953MWv2 = this.LJLIL;
            if (c56953MWv2 != null) {
                c56953MWv2.setLoadMoreListener(this);
                C56953MWv c56953MWv3 = this.LJLIL;
                if (c56953MWv3 != null) {
                    c56953MWv3.setShowFooter(true);
                    C56953MWv c56953MWv4 = this.LJLIL;
                    if (c56953MWv4 != null) {
                        c56953MWv4.showLoadMoreEmpty();
                        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.isn);
                        C56953MWv c56953MWv5 = this.LJLIL;
                        if (c56953MWv5 != null) {
                            recyclerView.setAdapter(c56953MWv5);
                            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).LJFF();
                            ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                            LJ();
                            if (E1X.LIZ()) {
                                C77266UUc.LIZIZ.getRelationService().LJFF().subscribe(this, new AObserverS77S0100000_9(this, 133));
                            }
                            EventBus.LIZJ().LJIILJJIL(this);
                            ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.MusFollowRequestDetailActivity", "onCreate", false);
                            return;
                        }
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                    o.LJIJI("mAdapter");
                    throw null;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onRefreshMessageButton(C3U3 event) {
        o.LJIIIZ(event, "event");
        C56953MWv c56953MWv = this.LJLIL;
        if (c56953MWv != null) {
            c56953MWv.notifyDataSetChanged();
        } else {
            o.LJIJI("mAdapter");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @QD3(threadMode = ThreadMode.MAIN)
    public final void onUserPageHandleRequest(IIJ followRequestResEvent) {
        Integer valueOf;
        o.LJIIIZ(followRequestResEvent, "followRequestResEvent");
        if (followRequestResEvent.LJLILLLLZI == -101) {
            C56953MWv c56953MWv = this.LJLIL;
            if (c56953MWv != null) {
                String uid = followRequestResEvent.LJLIL;
                o.LJIIIZ(uid, "uid");
                List<User> data = c56953MWv.getData();
                if (data != null) {
                    C199807sm LLJJI = ORZ.LLJJI(data);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = LLJJI.iterator();
                    while (true) {
                        C199797sl c199797sl = (C199797sl) it;
                        if (!c199797sl.hasNext()) {
                            break;
                        }
                        Object next = c199797sl.next();
                        if (o.LJ(((User) ((C2058786d) next).LIZIZ).getUid(), uid)) {
                            arrayList.add(next);
                        }
                    }
                    C2058786d c2058786d = (C2058786d) ORZ.LJLLLL(arrayList);
                    if (c2058786d != null && (valueOf = Integer.valueOf(c2058786d.LIZ)) != null) {
                        c56953MWv.onRemove(valueOf.intValue());
                    }
                }
                C2U8.LIZ(new C56947MWp());
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        C56953MWv c56953MWv2 = this.LJLIL;
        if (c56953MWv2 != null) {
            List<User> data2 = c56953MWv2.getData();
            if (data2 != null) {
                C199807sm LLJJI2 = ORZ.LLJJI(data2);
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = LLJJI2.iterator();
                while (true) {
                    C199797sl c199797sl2 = (C199797sl) it2;
                    if (!c199797sl2.hasNext()) {
                        break;
                    }
                    Object next2 = c199797sl2.next();
                    if (o.LJ(((User) ((C2058786d) next2).LIZIZ).getUid(), followRequestResEvent.LJLIL)) {
                        arrayList2.add(next2);
                    }
                }
                C2058786d c2058786d2 = (C2058786d) ORZ.LJLLLL(arrayList2);
                if (c2058786d2 != null) {
                    int i = followRequestResEvent.LJLILLLLZI;
                    if (i != -100) {
                        if (i != 4) {
                            if (i != 0) {
                                if (i != 1) {
                                    if (i == 2) {
                                        ((User) c2058786d2.LIZIZ).setFollowStatus(2);
                                    }
                                } else {
                                    ((User) c2058786d2.LIZIZ).setFollowStatus(1);
                                }
                            } else {
                                ((User) c2058786d2.LIZIZ).setFollowStatus(0);
                            }
                        } else {
                            ((User) c2058786d2.LIZIZ).setFollowStatus(4);
                        }
                    } else {
                        ((User) c2058786d2.LIZIZ).setFollowerStatus(1);
                        C2U8.LIZ(new C56947MWp());
                    }
                    C56953MWv c56953MWv3 = this.LJLIL;
                    if (c56953MWv3 != null) {
                        c56953MWv3.notifyItemChanged(c2058786d2.LIZ);
                        return;
                    } else {
                        o.LJIJI("mAdapter");
                        throw null;
                    }
                }
                return;
            }
            return;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC56753MPd
    public final void xB(Exception exc, boolean z) {
        if (z) {
            C56953MWv c56953MWv = this.LJLIL;
            if (c56953MWv != null) {
                c56953MWv.showPullUpLoadMore();
                return;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        C56953MWv c56953MWv2 = this.LJLIL;
        if (c56953MWv2 != null) {
            if (c56953MWv2.mShowFooter) {
                c56953MWv2.setShowFooter(false);
                C56953MWv c56953MWv3 = this.LJLIL;
                if (c56953MWv3 != null) {
                    c56953MWv3.notifyDataSetChanged();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((C80896Voy) _$_findCachedViewById(R.id.kwq)).setRefreshing(false);
            C56953MWv c56953MWv4 = this.LJLIL;
            if (c56953MWv4 != null) {
                if (c56953MWv4.getItemCount() == 0) {
                    MGN mgn = MGN.LJLILLLLZI;
                    if (mgn.isStandardUIEnable()) {
                        C73305Spp status_view = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        o.LJIIIIZZ(status_view, "status_view");
                        mgn.setStatusView(status_view, "inbox_follow_request", new MXK(this), exc);
                        mgn.triggerNetworkTips(this, "inbox_follow_request", exc, (C73305Spp) _$_findCachedViewById(R.id.kf_));
                        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    } else {
                        C73305Spp c73305Spp = (C73305Spp) _$_findCachedViewById(R.id.kf_);
                        C73306Spq c73306Spq = new C73306Spq();
                        C73312Spw.LJI(c73306Spq, new AqS159S0100000_9(this, 337));
                        c73305Spp.setStatus(c73306Spq);
                        ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(0);
                    }
                }
                C57053MaH.LIZJ((BaseResponse) LLFII().LJLIL.getData());
                C57053MaH.LIZ(0);
                return;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }

    @Override // X.InterfaceC56753MPd
    public final void mA(List<User> list, boolean z, boolean z2) {
        if (z) {
            if (list.isEmpty() || !z2) {
                showLoadMoreEmpty();
            } else {
                C56953MWv c56953MWv = this.LJLIL;
                if (c56953MWv != null) {
                    c56953MWv.resetLoadMoreState();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            C56953MWv c56953MWv2 = this.LJLIL;
            if (c56953MWv2 != null) {
                c56953MWv2.setDataAfterLoadMore(list);
                return;
            } else {
                o.LJIJI("mAdapter");
                throw null;
            }
        }
        C56953MWv c56953MWv3 = this.LJLIL;
        if (c56953MWv3 != null) {
            c56953MWv3.setShowFooter(true);
            if (!z2) {
                showLoadMoreEmpty();
            } else {
                C56953MWv c56953MWv4 = this.LJLIL;
                if (c56953MWv4 != null) {
                    c56953MWv4.resetLoadMoreState();
                } else {
                    o.LJIJI("mAdapter");
                    throw null;
                }
            }
            ((C80896Voy) _$_findCachedViewById(R.id.kwq)).setRefreshing(false);
            if (this.LJLIL != null) {
                C54362LVe.LJIILJJIL(12);
                C56953MWv c56953MWv5 = this.LJLIL;
                if (c56953MWv5 != null) {
                    c56953MWv5.setData(list);
                    ((C73305Spp) _$_findCachedViewById(R.id.kf_)).setVisibility(8);
                    C57053MaH.LIZJ((BaseResponse) LLFII().LJLIL.getData());
                    C57053MaH.LIZ(list.size());
                    return;
                }
                o.LJIJI("mAdapter");
                throw null;
            }
            o.LJIJI("mAdapter");
            throw null;
        }
        o.LJIJI("mAdapter");
        throw null;
    }
}
