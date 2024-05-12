package com.bytedance.android.livesdk.usercard;

import X.AbstractC29482Bhe;
import X.ActivityC45651qj;
import X.B83;
import X.BJM;
import X.C11030bz;
import X.C123654tF;
import X.C20780ri;
import X.C29374Bfu;
import X.C29446Bh4;
import X.C29448Bh6;
import X.C29454BhC;
import X.C29456BhE;
import X.C29475BhX;
import X.C29481Bhd;
import X.C29484Bhg;
import X.C32I;
import X.C40675Fxn;
import X.CN1;
import X.InterfaceC05190Ih;
import X.InterfaceC29489Bhl;
import X.OSZ;
import Y.IDComparatorS29S0000000_1;
import android.content.Context;
import android.util.SparseArray;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.usercard.IUserCardService;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveProfileOptimizeSetting;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileDialog;
import com.bytedance.android.livesdk.usercard.profilev3.TryModeLiveProfileDialog;
import com.bytedance.android.livesdk.usercard.profilev3.UserCardPreloadViewModel;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class UserCardService implements IUserCardService {
    public final SparseArray<InterfaceC29489Bhl<?>> LJLIL = new SparseArray<>();

    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final SparseArray<InterfaceC29489Bhl<?>> wP() {
        return this.LJLIL;
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final void Ls0(ActivityC45651qj activityC45651qj, FollowPair followPair) {
        o.LJIIIZ(followPair, "followPair");
        ((UserCardPreloadViewModel) ViewModelProviders.of(activityC45651qj).get(UserCardPreloadViewModel.class)).hv0(followPair);
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final TryModeLiveProfileDialog Uz(long j, User user) {
        TryModeLiveProfileDialog tryModeLiveProfileDialog = new TryModeLiveProfileDialog();
        tryModeLiveProfileDialog.LJLIL = j;
        tryModeLiveProfileDialog.LJLILLLLZI = user;
        tryModeLiveProfileDialog.vl(null);
        return tryModeLiveProfileDialog;
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final <T> void nw(InterfaceC29489Bhl<T> interfaceC29489Bhl, int i) {
        this.LJLIL.put(i, interfaceC29489Bhl);
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final void x9(ActivityC45651qj activityC45651qj, User user) {
        if (LiveProfileOptimizeSetting.INSTANCE.enablePrePass()) {
            ((UserCardPreloadViewModel) ViewModelProviders.of(activityC45651qj).get(UserCardPreloadViewModel.class)).LJLJJLL = user;
        }
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final C29448Bh6 Ln0(C29484Bhg cellConfig, User user, DataChannel dataChannel) {
        o.LJIIIZ(cellConfig, "cellConfig");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(dataChannel, "dataChannel");
        return new C29448Bh6(cellConfig, user, dataChannel);
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final void uP(BaseFragment fragment, DataChannel dataChannel, boolean z, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(dataChannel, "dataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        new UserProfilePresenter(fragment, dataChannel, z, lifecycleOwner);
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final void Ji0(ActivityC45651qj activityC45651qj, long j, Room room, User user, long j2) {
        ((UserCardPreloadViewModel) ViewModelProviders.of(activityC45651qj).get(UserCardPreloadViewModel.class)).gv0(j, room, user, j2);
    }

    @Override // com.bytedance.android.live.usercard.IUserCardService
    public final LiveProfileDialog k60(Context context, boolean z, long j, Room room, User user, String str, UserProfileEvent event, DataChannel dataChannel) {
        C29484Bhg c29484Bhg;
        OSZ osz;
        AbstractC29482Bhe abstractC29482Bhe;
        User user2 = user;
        o.LJIIIZ(event, "event");
        o.LJIIIZ(dataChannel, "dataChannel");
        if (user2 == null) {
            InterfaceC05190Ih interfaceC05190Ih = ((C29374Bfu) B83.LIZ().LIZIZ()).LIZIZ;
            o.LJII(interfaceC05190Ih, "null cannot be cast to non-null type com.bytedance.android.live.base.model.user.User");
            user2 = (User) interfaceC05190Ih;
        }
        C29475BhX c29475BhX = new C29475BhX(context, z, j, room, user2, str, event, dataChannel);
        if (LiveUltimateInflateSwitchSetting.INSTANCE.getValue()) {
            C20780ri.LIZLLL(R.layout.cya, context);
        }
        LiveProfileDialog liveProfileDialog = new LiveProfileDialog();
        liveProfileDialog.LJLIL = c29475BhX;
        UserProfileEvent userProfileEvent = c29475BhX.LJI;
        User user3 = c29475BhX.LJ;
        long j2 = c29475BhX.LIZJ;
        long ownerUserId = c29475BhX.LIZLLL.getOwnerUserId();
        List<Long> QD = ((IInteractService) CN1.LIZ(IInteractService.class)).QD();
        ArrayList LIZIZ = s1.LIZIZ(QD, "getService(IInteractServ…multiCoHostLinkedUserList");
        for (Long l : QD) {
            Long l2 = l;
            long ownerUserId2 = c29475BhX.LIZLLL.getOwnerUserId();
            if (l2 == null || l2.longValue() != ownerUserId2) {
                LIZIZ.add(l);
            }
        }
        liveProfileDialog.LJLILLLLZI = new C29456BhE(userProfileEvent, user3, j2, ownerUserId, LIZIZ, ((IInteractService) CN1.LIZ(IInteractService.class)).n8());
        C29481Bhd c29481Bhd = liveProfileDialog.LJLJI;
        if (c29481Bhd != null) {
            c29484Bhg = c29481Bhd.LIZJ;
        } else {
            SparseArray<InterfaceC29489Bhl<?>> wP = ((IUserCardService) CN1.LIZ(IUserCardService.class)).wP();
            C29475BhX c29475BhX2 = liveProfileDialog.LJLIL;
            C29446Bh4 c29446Bh4 = null;
            if (c29475BhX2 != null) {
                Context context2 = c29475BhX2.LIZ;
                C29456BhE c29456BhE = liveProfileDialog.LJLILLLLZI;
                if (c29456BhE != null) {
                    boolean z2 = c29475BhX2.LIZIZ;
                    Room room2 = c29475BhX2.LIZLLL;
                    String str2 = c29475BhX2.LJFF;
                    C11030bz c11030bz = new C11030bz(BJM.LJFF());
                    C29475BhX c29475BhX3 = liveProfileDialog.LJLIL;
                    if (c29475BhX3 != null) {
                        c29484Bhg = new C29484Bhg(context2, liveProfileDialog, c29456BhE, liveProfileDialog, z2, room2, str2, c11030bz, c29475BhX3.LJII);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = wP.size();
                        for (int i = 0; i < size; i++) {
                            int keyAt = wP.keyAt(i);
                            InterfaceC29489Bhl<?> valueAt = wP.valueAt(i);
                            IUserCardService.LJIIIZ.getClass();
                            int i2 = keyAt >> 4;
                            if (i2 == 0) {
                                arrayList.add(new OSZ(Integer.valueOf(keyAt), valueAt));
                            } else if (i2 == 4096) {
                                arrayList2.add(new OSZ(Integer.valueOf(keyAt), valueAt));
                            }
                        }
                        if (arrayList.size() > 1) {
                            C40675Fxn.LJJLIIIJ(arrayList, new IDComparatorS29S0000000_1(30));
                        }
                        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList, 10));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((InterfaceC29489Bhl) ((OSZ) it.next()).getSecond()).LIZ(c29484Bhg));
                        }
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (((AbstractC29482Bhe) next).LJFF()) {
                                arrayList4.add(next);
                            }
                        }
                        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList2, 10));
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            OSZ osz2 = (OSZ) it3.next();
                            arrayList5.add(new OSZ(osz2.getFirst(), ((InterfaceC29489Bhl) osz2.getSecond()).LIZ(c29484Bhg)));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it4 = arrayList5.iterator();
                        while (it4.hasNext()) {
                            Object next2 = it4.next();
                            if (((AbstractC29482Bhe) ((OSZ) next2).getSecond()).LJFF()) {
                                arrayList6.add(next2);
                            }
                        }
                        Comparator comparator = C123654tF.LJLIL;
                        Iterator it5 = arrayList6.iterator();
                        if (!it5.hasNext()) {
                            osz = null;
                        } else {
                            osz = (OSZ) it5.next();
                            while (it5.hasNext()) {
                                OSZ osz3 = (OSZ) it5.next();
                                if (comparator.compare(osz, osz3) < 0) {
                                    osz = osz3;
                                }
                            }
                        }
                        if (osz != null) {
                            abstractC29482Bhe = (AbstractC29482Bhe) osz.getSecond();
                        } else {
                            abstractC29482Bhe = null;
                        }
                        liveProfileDialog.LJLJI = new C29481Bhd(arrayList4, abstractC29482Bhe, c29484Bhg);
                        C29475BhX c29475BhX4 = liveProfileDialog.LJLIL;
                        if (c29475BhX4 != null) {
                            if (!c29475BhX4.LIZIZ) {
                                c29446Bh4 = new C29446Bh4(c29484Bhg);
                            }
                            liveProfileDialog.LLFZ = c29446Bh4;
                        } else {
                            o.LJIJI("config");
                            throw null;
                        }
                    } else {
                        o.LJIJI("config");
                        throw null;
                    }
                } else {
                    o.LJIJI("profileRoleInfo");
                    throw null;
                }
            } else {
                o.LJIJI("config");
                throw null;
            }
        }
        liveProfileDialog.LJLLLL = new C29454BhC(c29475BhX, c29484Bhg);
        return liveProfileDialog;
    }
}
