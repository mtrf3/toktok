package com.ss.android.ugc.aweme.notification.module;

import X.C221018lt;
import X.C221108m2;
import X.C61878OQg;
import X.C62822Ol8;
import X.C72507Scx;
import X.C72508Scy;
import X.C72509Scz;
import X.C72514Sd4;
import X.C72521SdB;
import X.C72522SdC;
import X.C72523SdD;
import X.C72524SdE;
import X.EnumC71848SHs;
import X.EnumC72512Sd2;
import X.InterfaceC117044ia;
import X.MQ0;
import X.SF5;
import X.SIS;
import X.X1D;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import defpackage.b1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class NotificationChunkVM extends BaseNotificationVM implements InterfaceC117044ia {
    public final SIS LJLL;
    public final SF5 LJLLI;
    public final NextLiveData<EnumC71848SHs> LJLLILLLL;
    public EnumC72512Sd2 LJLLJ;
    public volatile C72514Sd4 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;

    public final NextLiveData<MQ0> jv0() {
        return (NextLiveData) this.LJLZ.getValue();
    }

    public final String kv0() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://notice/detail?title=");
        LIZ.append(this.LJLL.LIZJ);
        LIZ.append("&from_where=");
        LIZ.append(this.LJLL.LIZ);
        LIZ.append("&ec_merged_tiktok_shop=");
        LIZ.append(this.LJLL.LJ);
        return X1D.LIZIZ(LIZ);
    }

    public static void iv0(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ListIterator listIterator = list.listIterator();
        int i = 1;
        while (listIterator.hasNext()) {
            MusNotice musNotice = (MusNotice) listIterator.next();
            if (musNotice.templateNotice == null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Only support template type:");
                LIZ.append(musNotice.nid);
                LIZ.append(", ");
                LIZ.append(musNotice.type);
                C221018lt.LIZIZ("NotificationChunkVM", X1D.LIZIZ(LIZ));
                listIterator.remove();
            }
            if (linkedHashMap.get(Long.valueOf(musNotice.getUniqueId())) != null) {
                musNotice.hackUniqueId(musNotice.getUniqueId() + i);
                i = (i * 31) + 1;
            }
            linkedHashMap.put(Long.valueOf(musNotice.getUniqueId()), musNotice);
        }
    }

    public final String hv0(String str) {
        StringBuilder LIZJ = b1.LIZJ(str, ", style:");
        LIZJ.append(this.LJLLJ);
        LIZJ.append(", data:");
        LIZJ.append(this.LJLLL);
        return X1D.LIZIZ(LIZJ);
    }

    public final void mv0(EnumC72512Sd2 enumC72512Sd2) {
        List<C72523SdD> list;
        this.LJLLJ = enumC72512Sd2;
        LiveData liveData = (LiveData) this.LJLLLL.getValue();
        if (enumC72512Sd2 == EnumC72512Sd2.COLLAPSE) {
            list = this.LJLLL.LIZIZ;
        } else {
            list = this.LJLLL.LIZ;
        }
        liveData.setValue(list);
    }

    public final synchronized void lv0(NoticeListsResponse noticeListsResponse, boolean z) {
        NoticeItems noticeItems;
        boolean z2;
        C72521SdB c72521SdB;
        List list;
        List<NoticeItems> notices = noticeListsResponse.getNotices();
        int i = 1;
        if (notices != null) {
            Iterator<NoticeItems> it = notices.iterator();
            while (true) {
                if (it.hasNext()) {
                    noticeItems = it.next();
                    if (noticeItems.getGroup() == this.LJLL.LIZ) {
                        break;
                    }
                } else {
                    noticeItems = null;
                    break;
                }
            }
            NoticeItems noticeItems2 = noticeItems;
            if (noticeItems2 != null) {
                C72514Sd4 c72514Sd4 = new C72514Sd4(0);
                c72514Sd4.LIZLLL = noticeItems2.getHasMore();
                c72514Sd4.LJ = noticeItems2.getMaxTime();
                c72514Sd4.LJFF = noticeItems2.getMinTime();
                if (!z) {
                    c72514Sd4.LIZJ.addAll(this.LJLLL.LIZJ);
                }
                List<MusNotice> list2 = c72514Sd4.LIZJ;
                List<MusNotice> items = noticeItems2.getItems();
                if (items == null) {
                    items = C61878OQg.INSTANCE;
                }
                list2.addAll(items);
                iv0(c72514Sd4.LIZJ);
                if (c72514Sd4.LIZJ.isEmpty()) {
                    this.LJLLL = c72514Sd4;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("processResp empty, isRefresh:");
                    LIZ.append(z);
                    C221018lt.LIZIZ("NotificationChunkVM", hv0(X1D.LIZIZ(LIZ)));
                    return;
                }
                if (c72514Sd4.LIZJ.size() > 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                List<C72523SdD> list3 = c72514Sd4.LIZIZ;
                if (z2) {
                    SIS sis = this.LJLL;
                    c72521SdB = new C72521SdB(sis.LIZJ, sis.LIZLLL, kv0());
                } else {
                    c72521SdB = new C72521SdB(this.LJLL.LIZJ, null, null);
                }
                list3.add(c72521SdB);
                c72514Sd4.LIZ.add(new C72521SdB(this.LJLL.LIZJ, null, null));
                ArrayList arrayList = new ArrayList();
                Iterator<MusNotice> it2 = c72514Sd4.LIZJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new C72522SdC(it2.next(), this.LJLL.LIZIZ, i));
                    i++;
                }
                List<C72523SdD> list4 = c72514Sd4.LIZIZ;
                if (z2) {
                    list = arrayList.subList(0, 2);
                } else {
                    list = arrayList;
                }
                list4.addAll(list);
                c72514Sd4.LIZ.addAll(arrayList);
                if (c72514Sd4.LIZLLL) {
                    c72514Sd4.LIZ.add(new C72524SdE(i));
                }
                this.LJLLL = c72514Sd4;
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("processResp invalid, isRefresh:");
        LIZ2.append(z);
        C221018lt.LIZIZ("NotificationChunkVM", hv0(X1D.LIZIZ(LIZ2)));
    }

    public NotificationChunkVM(SIS args, SF5 renderMode, NextLiveData<EnumC71848SHs> chunkDataState) {
        o.LJIIIZ(args, "args");
        o.LJIIIZ(renderMode, "renderMode");
        o.LJIIIZ(chunkDataState, "chunkDataState");
        this.LJLL = args;
        this.LJLLI = renderMode;
        this.LJLLILLLL = chunkDataState;
        this.LJLLJ = EnumC72512Sd2.UNKNOWN;
        this.LJLLL = new C72514Sd4(0);
        this.LJLLLL = C221108m2.LIZIZ(C72509Scz.LJLIL);
        this.LJLLLLLL = C221108m2.LIZIZ(C72507Scx.LJLIL);
        this.LJLZ = C221108m2.LIZIZ(C72508Scy.LJLIL);
    }
}
