package X;

import Y.IDhS102S0100000_9;
import Y.IDuS320S0100000_9;
import Y.IDuS79S0200000_9;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MultiNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.api.NotificationApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MP1 implements InterfaceC56756MPg<MPQ, List<? extends MusNotice>> {
    public final int LIZ;
    public LogPbBean LJI;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public volatile boolean LJIILIIL;
    public volatile boolean LJIILJJIL;
    public volatile boolean LJIILL;
    public boolean LJIILLIIL;
    public final Object LIZIZ = new Object();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C56787MQl.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C56788MQm.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C56789MQn.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(MQO.LJLIL);
    public MPD LJII = new MPD(0);
    public final C62822Ol8 LJIIL = C221108m2.LIZIZ(MQR.LJLIL);
    public int LJIIZILJ = LiveLayoutPreloadThreadPriority.DEFAULT;

    public final void LIZLLL() {
        synchronized (this.LIZIZ) {
            this.LJIILLIIL = false;
            this.LJIILIIL = false;
        }
        LIZIZ();
    }

    public final List<MusNotice> LJ() {
        return (List) this.LIZLLL.getValue();
    }

    public final java.util.Map<Integer, NoticeItems> LJFF() {
        return (java.util.Map) this.LJFF.getValue();
    }

    public final List<MusNotice> LJI() {
        return (List) this.LJ.getValue();
    }

    public final int LJII() {
        return ((Number) this.LJIIL.getValue()).intValue();
    }

    public final List<MusNotice> LJIIIIZZ() {
        return (List) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC56756MPg
    /* renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public final List<MusNotice> LIZIZ() {
        List<MusNotice> LJIIIIZZ;
        List<MusNotice> LLJI;
        synchronized (this.LIZIZ) {
            if (this.LJIILIIL) {
                LJIIIIZZ = LJ();
            } else {
                LJIIIIZZ = LJIIIIZZ();
            }
            LLJI = ORZ.LLJI(LJIIIIZZ);
        }
        return LLJI;
    }

    @Override // X.InterfaceC56756MPg
    public final boolean hasMore() {
        return this.LJIIIIZZ;
    }

    public MP1(int i) {
        this.LIZ = i;
    }

    public final void LJIIIZ(NoticeListsResponse resp) {
        o.LJIIIZ(resp, "resp");
        synchronized (this.LIZIZ) {
            List<NoticeItems> notices = resp.getNotices();
            if (notices != null) {
                ArrayList arrayList = new ArrayList();
                for (NoticeItems noticeItems : notices) {
                    if (noticeItems.getGroup() != this.LIZ) {
                        arrayList.add(noticeItems);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    NoticeItems noticeItems2 = (NoticeItems) it.next();
                    if (!C54316LTk.LIZ || noticeItems2.getGroup() != 210) {
                        LJFF().put(Integer.valueOf(noticeItems2.getGroup()), noticeItems2);
                    }
                }
            }
        }
        LJIILJJIL(resp, true);
    }

    public final void LJIIJ(List items) {
        MP4 mp4;
        long j;
        MusNotice musNotice;
        o.LJIIIZ(items, "items");
        if (this.LJIILJJIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot call insertExtra when refreshing:");
            LIZ.append(items.size());
            C221018lt.LIZIZ("MiddleDataSource", X1D.LIZIZ(LIZ));
            LIZIZ();
            return;
        }
        if (items.isEmpty()) {
            C221018lt.LJFF("MiddleDataSource", "insertExtraListByJanus item empty");
            LIZIZ();
            return;
        }
        synchronized (this.LIZIZ) {
            Iterator it = items.iterator();
            boolean z = false;
            while (it.hasNext()) {
                NoticeItems noticeItems = (NoticeItems) it.next();
                LJFF().put(Integer.valueOf(noticeItems.getGroup()), noticeItems);
                if (C52489Kir.LIZ) {
                    List<MusNotice> items2 = noticeItems.getItems();
                    if (items2 != null && (musNotice = (MusNotice) ORZ.LJLLLL(items2)) != null) {
                        j = musNotice.createTime;
                    } else {
                        j = 0;
                    }
                    if (j > this.LJII.LIZ) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("insertExtraListByJanus, timeRange: ");
                        LIZ2.append(this.LJII);
                        LIZ2.append(", createTime: ");
                        LIZ2.append(j);
                        LIZ2.append(", hasNewExtra");
                        C221018lt.LJFF("MiddleDataSource", X1D.LIZIZ(LIZ2));
                        z = true;
                    }
                }
            }
            mp4 = new MP4(LJI(), C113554cx.LJJLIIIJLLLLLLLZ(LJFF()), C61878OQg.INSTANCE, this.LJI, this.LJIIJ, false, this.LJIIIZ, this.LJII, this.LJIIIIZZ, this.LJIILLIIL, z, 260096);
            for (MusNotice musNotice2 : LJIIIIZZ()) {
                int i = musNotice2.type;
                if (i != 1001 && i != 999 && !musNotice2.isMock()) {
                    mp4.LIZIZ(musNotice2, mp4.LJIILLIIL);
                }
            }
        }
        MP3.LIZ(mp4);
        LJIIZILJ(mp4);
        LIZIZ();
    }

    public final void LJIIJJI(List lives) {
        o.LJIIIZ(lives, "lives");
        if (this.LJIILJJIL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot call insertLive when refreshing:");
            LIZ.append(lives.size());
            C221018lt.LIZIZ("MiddleDataSource", X1D.LIZIZ(LIZ));
            LIZIZ();
            return;
        }
        synchronized (this.LIZIZ) {
            if (LJI().isEmpty() && lives.isEmpty()) {
                LIZIZ();
                return;
            }
            LJI().clear();
            LJI().addAll(lives);
            MP3.LIZIZ(LJI(), LJIIIIZZ());
            if (!LJ().isEmpty()) {
                MP3.LIZIZ(LJI(), LJ());
            }
            LIZIZ();
        }
    }

    public final AbstractC73672Svk LJIIL(MRU mru) {
        String str;
        if (!this.LJIILIIL) {
            long j = 0;
            if (this.LJII.LIZ > 0 && !this.LJIILJJIL && !this.LJIILL) {
                this.LJIILL = true;
                C188727au c188727au = new C188727au();
                if (INB.LIZIZ()) {
                    str = "new_activities";
                } else {
                    str = "inbox_first_page";
                }
                c188727au.LJIIIZ("position", str);
                FMX.LJIIL("notice_load_more", c188727au.LIZ);
                int i = this.LIZ;
                MPD mpd = this.LJII;
                long j2 = mpd.LIZ;
                long j3 = mpd.LIZIZ;
                if (((Boolean) C34031DXf.LIZIZ.getValue()).booleanValue()) {
                    j = this.LJIIJJI;
                }
                String experiments = LIZJ(this, i, j2, j3, 0, j, 8);
                C56707MNj c56707MNj = C56707MNj.LJI;
                c56707MNj.LIZLLL();
                if (c56707MNj.LJFF()) {
                    C56707MNj.LJIIIIZZ = false;
                    C56707MNj.LJIIIZ = true;
                }
                int LJII = LJII();
                o.LJIIIZ(experiments, "experiments");
                if (c56707MNj.LJI()) {
                    c56707MNj.LJ = "new_activities";
                    C56707MNj.LJIIJJI = experiments;
                    C56707MNj.LJII = LJII;
                }
                return AbstractC73672Svk.LJIIJ(new MP7(experiments, this));
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadMore blocked by:");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", ");
        LIZ.append(this.LJII);
        LIZ.append(", ");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", ");
        LIZ.append(this.LJIILL);
        C221018lt.LIZIZ("MiddleDataSource", X1D.LIZIZ(LIZ));
        return AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 9));
    }

    @Override // X.InterfaceC56756MPg
    /* renamed from: LJIILL, reason: merged with bridge method [inline-methods] */
    public final C73390SrC LIZ(MPQ mpq) {
        int i;
        if (this.LJIILJJIL || this.LJIILL) {
            C221018lt.LIZIZ("MiddleDataSource", "refresh blocked by loading now ");
            return AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 10));
        }
        this.LJIILJJIL = true;
        this.LJIIJJI = 0L;
        if (mpq != null && !mpq.LIZ) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i ^ 1;
        ArrayList arrayList = new ArrayList();
        int i3 = this.LIZ;
        if (i3 == 37) {
            if (C53363Kwx.LIZJ() && !((Boolean) INB.LIZIZ.getValue()).booleanValue()) {
                if (C54316LTk.LIZ) {
                    i3 = -1;
                } else {
                    i3 = 210;
                }
            } else {
                i3 = 37;
            }
        }
        if (this.LIZ != 37 || i3 != -1) {
            String experiments = LIZJ(this, i3, 0L, 0L, i2, 0L, 22);
            arrayList.add(NotificationApi.LIZ().fetchGroupNotice(experiments, LJII()).LJJL(T16.LIZ()).LJJIJL(new IDhS102S0100000_9(this, 19)));
            C56707MNj c56707MNj = C56707MNj.LJI;
            int LJII = LJII();
            c56707MNj.getClass();
            o.LJIIIZ(experiments, "experiments");
            if (c56707MNj.LJI()) {
                c56707MNj.LJ = "new_activities";
                C56707MNj.LJIIJJI = experiments;
                C56707MNj.LJII = LJII;
            }
        }
        int i4 = this.LIZ;
        if (i4 == 37) {
            arrayList.add(NotificationApi.LIZ().fetchReportInboxNotice().LJJL(T16.LIZ()).LJJIJL(U4A.LJLIL).LJJJJ(MPE.LJLJL));
        } else if (i4 == 599) {
            arrayList.add(NotificationApi.LIZ().fetchShopInboxNotice().LJJL(T16.LIZ()).LJJIJL(C78937UyT.LJLILLLLZI).LJJJJ(C78894Uxm.LJLJL));
        }
        return AbstractC73672Svk.LJIIJ(new IDuS79S0200000_9(arrayList, this, 3));
    }

    public final void LJIIZILJ(MP4 mp4) {
        boolean z;
        synchronized (this.LIZIZ) {
            LJIIIIZZ().clear();
            LJIIIIZZ().addAll(mp4.LJIILLIIL);
            LJ().clear();
            LJ().addAll(mp4.LJIIZILJ);
            if (!mp4.LJIIZILJ.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            this.LJIILIIL = z;
            this.LJI = mp4.LIZLLL;
            this.LJIIJ = mp4.LJ;
            this.LJIIIZ = mp4.LJI;
            this.LJII = mp4.LJII;
            this.LJIIIIZZ = mp4.LJIIIIZZ;
        }
    }

    public final C56769MPt LJIILIIL(Object obj, Throwable th) {
        return new C56769MPt(this, obj, th);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0078, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:28:0x0097, B:30:0x009d, B:31:0x00a9, B:33:0x00af, B:36:0x00c4, B:37:0x00c8, B:39:0x00dc, B:40:0x00de, B:42:0x0105, B:43:0x010d, B:45:0x0113, B:51:0x0123, B:54:0x0129, B:92:0x00b6), top: B:27:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105 A[Catch: all -> 0x0189, TryCatch #0 {, blocks: (B:28:0x0097, B:30:0x009d, B:31:0x00a9, B:33:0x00af, B:36:0x00c4, B:37:0x00c8, B:39:0x00dc, B:40:0x00de, B:42:0x0105, B:43:0x010d, B:45:0x0113, B:51:0x0123, B:54:0x0129, B:92:0x00b6), top: B:27:0x0097 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MP1.LJIILJJIL(com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse, boolean):void");
    }

    public static String LIZJ(MP1 mp1, int i, long j, long j2, int i2, long j3, int i3) {
        long j4 = j3;
        int i4 = i2;
        long j5 = j;
        long j6 = j2;
        if ((i3 & 2) != 0) {
            j5 = 0;
        }
        if ((i3 & 4) != 0) {
            j6 = 0;
        }
        if ((i3 & 8) != 0) {
            i4 = 1;
        }
        if ((i3 & 16) != 0) {
            j4 = 0;
        }
        mp1.getClass();
        MultiNotice multiNotice = new MultiNotice(i, j5, j6, 0, i4, 8, null);
        if (j4 != 0) {
            multiNotice.setFirstReadTime(j4);
        }
        if (mp1.LJIIZILJ != Integer.MIN_VALUE) {
            multiNotice.getAbSettingExtra().put("collapsed_list_type", Integer.valueOf(mp1.LJIIZILJ));
        }
        return multiNotice.toReqStr();
    }
}
