package X;

import Y.ACallableS112S0100000_9;
import Y.AfS58S0200000_9;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import com.ss.android.ugc.aweme.notification.perf.ActivitiesPerfCacheManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MPh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56757MPh {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(MQD.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C56786MQk.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56785MQj.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C56784MQi.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(MQ4.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(MR3.LJLIL);
    public final C62822Ol8 LJI = C221108m2.LIZIZ(C56783MQh.LJLIL);
    public final MP1 LJII;
    public int LJIIIIZZ;

    public final NextLiveData<OSZ<MusNotice, MQ2>> LIZLLL() {
        return (NextLiveData) this.LJ.getValue();
    }

    public final C73318Sq2 LJ() {
        return (C73318Sq2) this.LJFF.getValue();
    }

    public final NextLiveData<Boolean> LJFF() {
        return (NextLiveData) this.LIZLLL.getValue();
    }

    public final NextLiveData<List<MusNotice>> LJI() {
        return (NextLiveData) this.LIZ.getValue();
    }

    public final NextLiveData<MQ0> LJII() {
        return (NextLiveData) this.LIZJ.getValue();
    }

    public final NextLiveData<MQ0> LJIIIIZZ() {
        return (NextLiveData) this.LIZIZ.getValue();
    }

    public boolean LJIIJJI() {
        return LJIIJ(new AqS159S0100000_9(this, 932));
    }

    public final boolean LJIIIZ() {
        MQ0 value = LJIIIIZZ().getValue();
        MQ0 mq0 = MQ0.LOADING;
        if (value == mq0 || LJII().getValue() == mq0) {
            return true;
        }
        return false;
    }

    public C56757MPh(int i) {
        this.LJII = new MP1(i);
    }

    public final void LIZ(List<? extends MusNotice> data) {
        List<MusNotice> value;
        o.LJIIIZ(data, "data");
        if (!((Boolean) C52750Kn4.LIZ.getValue()).booleanValue() || (value = LJI().getValue()) == null || value.isEmpty()) {
            return;
        }
        int size = data.size();
        List<MusNotice> value2 = LJI().getValue();
        o.LJI(value2);
        if (size != value2.size() || !(ORZ.LLFII(data) instanceof MPM)) {
            return;
        }
        int i = this.LJIIIIZZ + 1;
        this.LJIIIIZZ = i;
        if (i > 5) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("autoLoadMore: ");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", ");
        LIZ.append(data.size());
        C221018lt.LIZIZ("NotificationModel", X1D.LIZIZ(LIZ));
        C10K.LIZIZ(new ACallableS112S0100000_9(this, 29), C10K.LJIIIIZZ, null);
    }

    public void LIZIZ(MusNotice notice) {
        NoticeListsResponse noticeListsResponse;
        NoticeCombineResponse noticeCombineResponse;
        NoticeCombineDatas data;
        o.LJIIIZ(notice, "notice");
        if (notice.isMock()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot delete a mock notice:");
            LIZ.append(notice.type);
            LIZ.append(", ");
            LIZ.append(notice.nid);
            C221018lt.LIZIZ("NotificationModel", X1D.LIZIZ(LIZ));
            return;
        }
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("deleteData start:");
            LIZ2.append(notice.type);
            LIZ2.append(", ");
            LIZ2.append(notice.nid);
            C221018lt.LJFF("NotificationModel", X1D.LIZIZ(LIZ2));
            List<MusNotice> value = LJI().getValue();
            if (value != null) {
                ArrayList arrayList = new ArrayList();
                for (MusNotice musNotice : value) {
                    MusNotice musNotice2 = musNotice;
                    if (!o.LJ(notice.nid, musNotice2.nid)) {
                        if ((musNotice2 instanceof MPH) && notice.timeLineType == musNotice2.timeLineType) {
                            MPH mph = (MPH) musNotice2;
                            int i = mph.LIZ - 1;
                            mph.LIZ = i;
                            if (i <= 0) {
                            }
                        }
                        arrayList.add(musNotice);
                    }
                    ((CopyOnWriteArraySet) this.LJI.getValue()).add(musNotice2.nid);
                }
                LJI().setValue(arrayList);
            }
            String str = notice.nid;
            o.LJIIIIZZ(str, "notice.nid");
            C2U8.LIZ(new MR4(str));
            C56681MMj LIZ3 = ActivitiesPerfCacheManager.LIZ();
            if (LIZ3 != null) {
                synchronized (LIZ3) {
                    ActivitiesPerfCacheManager.JanusData janusData = LIZ3.LIZJ;
                    if (janusData == null || (noticeCombineResponse = janusData.resp) == null || (data = noticeCombineResponse.getData()) == null || (!C56681MMj.LIZ(data.getReportNotice(), notice) && !C56681MMj.LIZ(data.getShopNotice(), notice))) {
                        ActivitiesPerfCacheManager.NoticeData noticeData = LIZ3.LIZLLL;
                        if (noticeData != null && (noticeListsResponse = noticeData.resp) != null) {
                            C56681MMj.LIZ(noticeListsResponse.getNotices(), notice);
                        }
                    }
                }
            }
            if (notice.type == 225) {
                C56760MPk.LJ(notice);
            }
            C78999UzT.LJFF(NotificationApi.LIZ().deleteNotice(notice.nid).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS58S0200000_9(this, notice, 17), new AfS58S0200000_9(this, notice, 18)), LJ());
            return;
        }
        C221018lt.LIZIZ("NotificationModel", "deleteData net unavailable");
        LIZLLL().setValue(new OSZ<>(notice, MQ2.NET_ERR));
    }

    public final void LIZJ(List list) {
        boolean z;
        ListIterator listIterator = ((ArrayList) list).listIterator();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int nextInt = V0Q.Default.nextInt(1, Integer.MAX_VALUE);
        while (listIterator.hasNext()) {
            MusNotice musNotice = (MusNotice) listIterator.next();
            if (((CopyOnWriteArraySet) this.LJI.getValue()).contains(musNotice.nid)) {
                listIterator.remove();
            } else {
                BaseNotice baseNotice = (BaseNotice) linkedHashMap.get(Long.valueOf(musNotice.getUniqueId()));
                if (baseNotice != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("filterData find: ");
                    LIZ.append(musNotice.getUniqueId());
                    LIZ.append(", [");
                    LIZ.append(musNotice.type);
                    LIZ.append(", ");
                    LIZ.append(baseNotice.type);
                    LIZ.append("], [");
                    LIZ.append(o.LJ(musNotice, baseNotice));
                    LIZ.append(", ");
                    if (musNotice == baseNotice) {
                        z = true;
                    } else {
                        z = false;
                    }
                    LIZ.append(z);
                    LIZ.append(']');
                    C221018lt.LIZIZ("NotificationModel", X1D.LIZIZ(LIZ));
                    if (o.LJ(musNotice, baseNotice)) {
                        listIterator.remove();
                    } else {
                        musNotice.hackUniqueId(musNotice.getUniqueId() + nextInt);
                        nextInt = (nextInt * 31) + 1;
                        if (linkedHashMap.get(Long.valueOf(musNotice.getUniqueId())) != null) {
                            C221018lt.LIZIZ("NotificationModel", "filterData conflict again, drop to avoid crash");
                            listIterator.remove();
                        }
                    }
                }
                linkedHashMap.put(Long.valueOf(musNotice.getUniqueId()), musNotice);
            }
        }
    }

    public final boolean LJIIJ(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        if (C1DH.LJIJJLI()) {
            C221018lt.LIZIZ("NotificationModel", "load but children mode");
            V1B.LJLJJI(LJI(), C61878OQg.INSTANCE);
            return false;
        }
        return interfaceC65784Pro.invoke().booleanValue();
    }

    public boolean LJIIL(MLW reason) {
        o.LJIIIZ(reason, "reason");
        return LJIIJ(new AqS159S0100000_9(this, 933));
    }
}
