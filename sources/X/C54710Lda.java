package X;

import android.animation.AnimatorSet;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.inbox.IInboxLiveService;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveDoubleRVCell;
import com.ss.android.ugc.aweme.inbox.adapter.InboxLiveRVCell;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Lda, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54710Lda implements IInboxLiveService {
    public static final C54710Lda LIZIZ = C54719Ldj.LIZ;
    public C53882LCs LIZ;

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final Class<? extends PowerCell<? extends AbstractC54715Ldf>>[] getLiveCells() {
        return new Class[]{InboxLiveRVCell.class, InboxLiveDoubleRVCell.class};
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void endSyncController() {
        AnimatorSet animatorSet;
        C53882LCs c53882LCs = this.LIZ;
        if (c53882LCs != null && (animatorSet = c53882LCs.LJIIIIZZ) != null) {
            animatorSet.cancel();
            c53882LCs.LJII = false;
            c53882LCs.LIZLLL = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final C53882LCs getSyncController() {
        if (this.LIZ == null) {
            initSyncController();
        }
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void initSyncController() {
        if (this.LIZ == null) {
            C53882LCs c53882LCs = new C53882LCs(EnumC53722L6o.SKYLIGHT);
            this.LIZ = c53882LCs;
            c53882LCs.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void pauseSyncController() {
        C53882LCs c53882LCs = this.LIZ;
        if (c53882LCs != null) {
            c53882LCs.LIZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void resumeSyncController() {
        C53882LCs c53882LCs = this.LIZ;
        if (c53882LCs != null) {
            c53882LCs.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void callPauseAnimation(RecyclerView.ViewHolder vh) {
        o.LJIIIZ(vh, "vh");
        if (vh instanceof InboxLiveRVCell) {
            InboxLiveRVCell inboxLiveRVCell = (InboxLiveRVCell) vh;
            if (inboxLiveRVCell.LJLLJ) {
                if (inboxLiveRVCell.V()) {
                    C53884LCu c53884LCu = inboxLiveRVCell.LJLJL;
                    if (c53884LCu != null) {
                        c53884LCu.LJ();
                    }
                } else {
                    C53887LCx c53887LCx = inboxLiveRVCell.LJLJJLL;
                    if (c53887LCx != null) {
                        c53887LCx.LJ();
                    }
                }
            }
        }
        if (vh instanceof InboxLiveDoubleRVCell) {
            InboxLiveDoubleRVCell inboxLiveDoubleRVCell = (InboxLiveDoubleRVCell) vh;
            if (inboxLiveDoubleRVCell.LJLZ) {
                if (inboxLiveDoubleRVCell.V()) {
                    C53884LCu c53884LCu2 = inboxLiveDoubleRVCell.LJLLL;
                    if (c53884LCu2 != null) {
                        c53884LCu2.LJ();
                    }
                    C53884LCu c53884LCu3 = inboxLiveDoubleRVCell.LJLLLL;
                    if (c53884LCu3 != null) {
                        c53884LCu3.LJ();
                        return;
                    }
                    return;
                }
                C53887LCx c53887LCx2 = inboxLiveDoubleRVCell.LJLLILLLL;
                if (c53887LCx2 != null) {
                    c53887LCx2.LJ();
                }
                C53887LCx c53887LCx3 = inboxLiveDoubleRVCell.LJLLJ;
                if (c53887LCx3 == null) {
                    return;
                }
                c53887LCx3.LJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void callResumeAnimation(RecyclerView.ViewHolder vh) {
        o.LJIIIZ(vh, "vh");
        if (vh instanceof InboxLiveRVCell) {
            InboxLiveRVCell inboxLiveRVCell = (InboxLiveRVCell) vh;
            if (inboxLiveRVCell.LJLLJ) {
                if (inboxLiveRVCell.V()) {
                    C53884LCu c53884LCu = inboxLiveRVCell.LJLJL;
                    if (c53884LCu != null) {
                        c53884LCu.LJI();
                    }
                } else {
                    C53887LCx c53887LCx = inboxLiveRVCell.LJLJJLL;
                    if (c53887LCx != null) {
                        c53887LCx.LJI();
                    }
                }
            }
        }
        if (vh instanceof InboxLiveDoubleRVCell) {
            InboxLiveDoubleRVCell inboxLiveDoubleRVCell = (InboxLiveDoubleRVCell) vh;
            if (inboxLiveDoubleRVCell.LJLZ) {
                if (inboxLiveDoubleRVCell.V()) {
                    C53884LCu c53884LCu2 = inboxLiveDoubleRVCell.LJLLL;
                    if (c53884LCu2 != null) {
                        c53884LCu2.LJI();
                    }
                    C53884LCu c53884LCu3 = inboxLiveDoubleRVCell.LJLLLL;
                    if (c53884LCu3 != null) {
                        c53884LCu3.LJI();
                        return;
                    }
                    return;
                }
                C53887LCx c53887LCx2 = inboxLiveDoubleRVCell.LJLLILLLL;
                if (c53887LCx2 != null) {
                    c53887LCx2.LJI();
                }
                C53887LCx c53887LCx3 = inboxLiveDoubleRVCell.LJLLJ;
                if (c53887LCx3 == null) {
                    return;
                }
                c53887LCx3.LJI();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void recordRoomInfoList(List<InboxLiveNotice> list) {
        o.LJIIIZ(list, "list");
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        for (InboxLiveNotice inboxLiveNotice : list) {
            InboxLiveNotice inboxLiveNotice2 = inboxLiveNotice;
            if (inboxLiveNotice2.getRoomInfo() != null && inboxLiveNotice2.getUser() != null) {
                arrayList2.add(inboxLiveNotice);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            SlimRoom roomInfo = ((InboxLiveNotice) it.next()).getRoomInfo();
            o.LJI(roomInfo);
            arrayList3.add(Long.valueOf(roomInfo.getId()));
        }
        arrayList.addAll(arrayList3);
        C31998Ch8.LIZ = arrayList;
        ArrayList arrayList4 = new ArrayList();
        for (InboxLiveNotice inboxLiveNotice3 : list) {
            InboxLiveNotice inboxLiveNotice4 = inboxLiveNotice3;
            if (inboxLiveNotice4.getRoomInfo() != null && inboxLiveNotice4.getUser() != null) {
                arrayList4.add(inboxLiveNotice3);
            }
        }
        ArrayList arrayList5 = new ArrayList(C32I.LJJL(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            InboxLiveNotice inboxLiveNotice5 = (InboxLiveNotice) it2.next();
            SlimRoom roomInfo2 = inboxLiveNotice5.getRoomInfo();
            o.LJI(roomInfo2);
            long id = roomInfo2.getId();
            User user = inboxLiveNotice5.getUser();
            o.LJI(user);
            String uid = user.getUid();
            uid.toString();
            arrayList5.add(new RoomInfo(id, uid));
        }
        String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, arrayList5);
        o.LJIIIIZZ(json, "list\n            .filter…Helper.get().toJson(it) }");
        C31998Ch8.LIZIZ = json;
        if (((Boolean) C52555Kjv.LIZ.getValue()).booleanValue()) {
            ArrayList arrayList6 = new ArrayList();
            for (InboxLiveNotice inboxLiveNotice6 : list) {
                InboxLiveNotice inboxLiveNotice7 = inboxLiveNotice6;
                if (inboxLiveNotice7.getRoomInfo() != null && inboxLiveNotice7.getUser() != null) {
                    arrayList6.add(inboxLiveNotice6);
                }
            }
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("message", "live_cover", ((InboxLiveNotice) it3.next()).getRoomInfo()));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void setInboxSkyLightUseBiggerAvatar(boolean z) {
        C54714Lde.LIZ = Boolean.valueOf(z);
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final AbstractC54715Ldf mapLiveItem(InboxLiveNotice notice, boolean z, int i) {
        AbstractC54715Ldf c54712Ldc;
        SlimRoom.LinkMic linkMic;
        List<com.bytedance.android.live.base.model.user.User> list;
        o.LJIIIZ(notice, "notice");
        SlimRoom roomInfo = notice.getRoomInfo();
        if (roomInfo != null && (linkMic = roomInfo.getLinkMic()) != null && (list = linkMic.followedList) != null && list.size() >= 2) {
            c54712Ldc = new C54711Ldb(notice, z);
        } else {
            c54712Ldc = new C54712Ldc(notice, z);
        }
        c54712Ldc.LJLIL = i;
        return c54712Ldc;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final List<AbstractC54715Ldf> mapLiveItems(List<InboxLiveNotice> noticeList, boolean z, boolean z2) {
        o.LJIIIZ(noticeList, "noticeList");
        if (z2) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(noticeList, 10));
            Iterator<InboxLiveNotice> it = noticeList.iterator();
            while (it.hasNext()) {
                arrayList.add(new C54713Ldd(it.next(), z));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(noticeList, 10));
        int i = 0;
        for (InboxLiveNotice inboxLiveNotice : noticeList) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList2.add(mapLiveItem(inboxLiveNotice, z, i));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return arrayList2;
    }

    @Override // com.ss.android.ugc.aweme.inbox.IInboxLiveService
    public final void watchLive(Context context, InboxLiveNotice inboxLiveNotice, int i, String anchorId) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(anchorId, "anchorId");
        C31998Ch8.LIZ(context, inboxLiveNotice, i, anchorId);
    }
}
