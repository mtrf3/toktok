package com.ss.android.ugc.aweme.relation.fragment.muflist;

import X.C06490Nh;
import X.C119354mJ;
import X.C188727au;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C4FY;
import X.C57792MmC;
import X.C57794MmE;
import X.C57795MmF;
import X.C57796MmG;
import X.C57797MmH;
import X.C57798MmI;
import X.C57799MmJ;
import X.C57800MmK;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C67632l5;
import X.C77339UWx;
import X.C7MY;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC57793MmD;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.O6R;
import Y.ARunnableS0S0104000_3;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.profile.model.LatestUnreadVideoInfo;
import com.ss.android.ugc.aweme.relation.muflist.MufPageTrackInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MufUserCell extends PowerCell<C57792MmC> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 544));
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 558));
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 560));
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 559));
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 545));
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 547));
    public C119354mJ LJLJL;
    public LiveData<ActivityStatus> LJLJLJ;
    public final C214298b3 LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;
    public C4FY LJLLILLLL;
    public final C62822Ol8 LJLLJ;

    public final TuxTextView L() {
        return (TuxTextView) this.LJLJJI.getValue();
    }

    public final TuxTextView M() {
        return (TuxTextView) this.LJLJI.getValue();
    }

    public MufUserCell() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(MufListPageViewModel.class);
        AqS159S0100000_9 aqS159S0100000_9 = new AqS159S0100000_9(LIZ, 553);
        C57797MmH c57797MmH = C57797MmH.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57795MmF.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 554), new AqS159S0100000_9((InterfaceC93923mO) this, 555), C57799MmJ.INSTANCE, c57797MmH, new AqS159S0100000_9((InterfaceC93923mO) this, 556), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57796MmG.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 557), new AqS159S0100000_9((InterfaceC93923mO) this, 548), C57798MmI.INSTANCE, c57797MmH, new AqS159S0100000_9((InterfaceC93923mO) this, 549), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS159S0100000_9, C57794MmE.INSTANCE, new AqS159S0100000_9((InterfaceC93923mO) this, 550), new AqS159S0100000_9((InterfaceC93923mO) this, 551), new AqS159S0100000_9((InterfaceC93923mO) this, 552), c57797MmH, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLJLLL = c214298b3;
        this.LJLLILLLL = C4FY.NO_STATUS;
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 546));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (C67632l5.LIZ()) {
            TuxTextView tvNewVideo = L();
            o.LJIIIIZZ(tvNewVideo, "tvNewVideo");
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(12));
            int LIZIZ = C7MY.LIZIZ(20);
            Object parent = tvNewVideo.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            ((View) parent).post(new ARunnableS0S0104000_3(tvNewVideo, LJJIIZ, LIZIZ, 2));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        String previousPage;
        super.onViewAttachedToWindow();
        C57792MmC item = getItem();
        if (item != null) {
            String uid = item.LJLIL.getUid();
            o.LJIIIIZZ(uid, "uid");
            ArrayList arrayList = (ArrayList) C57800MmK.LIZ;
            if (!arrayList.contains(uid)) {
                C188727au c188727au = new C188727au();
                MufPageTrackInfo mufPageTrackInfo = item.LJLJI;
                String str = null;
                if (mufPageTrackInfo != null) {
                    str = mufPageTrackInfo.getEnterFrom();
                }
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                c188727au.LJIIIZ("enter_from", str);
                MufPageTrackInfo mufPageTrackInfo2 = item.LJLJI;
                if (mufPageTrackInfo2 != null && (previousPage = mufPageTrackInfo2.getPreviousPage()) != null) {
                    str2 = previousPage;
                }
                c188727au.LJIIIZ("previous_page", str2);
                c188727au.LIZLLL(getPosition(), "impr_order");
                c188727au.LIZLLL(this.LJLLI ? 1 : 0, "is_online");
                c188727au.LIZLLL(this.LJLL ? 1 : 0, "has_new_videos_link");
                LatestUnreadVideoInfo latestUnreadVideoInfo = item.LJLIL.getLatestUnreadVideoInfo();
                if (latestUnreadVideoInfo != null) {
                    Integer valueOf = Integer.valueOf(latestUnreadVideoInfo.getTotalUnread());
                    if (valueOf.intValue() > 0) {
                        c188727au.LIZLLL(valueOf.intValue(), "new_videos_cnt");
                    }
                }
                FMX.LJIIL("show_mutual_friend_cell", c188727au.LIZ);
                arrayList.add(uid);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x015c, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L49;
     */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C57792MmC r22) {
        /*
            Method dump skipped, instructions count: 1047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.fragment.muflist.MufUserCell.onBindItemView(X.Mm4):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View view;
        View LIZIZ = C06490Nh.LIZIZ(viewGroup, "parent", R.layout.ayb, viewGroup, false);
        ViewStub viewStub = (ViewStub) LIZIZ.findViewById(R.id.goo);
        C119354mJ c119354mJ = null;
        if (viewStub != null) {
            view = viewStub.inflate();
        } else {
            view = null;
        }
        if (view instanceof C119354mJ) {
            c119354mJ = (C119354mJ) view;
        }
        this.LJLJL = c119354mJ;
        if (c119354mJ != null) {
            c119354mJ.bringToFront();
        }
        C119354mJ c119354mJ2 = this.LJLJL;
        if (c119354mJ2 != null) {
            c119354mJ2.LIZ(R.attr.cr);
        }
        return LIZIZ;
    }

    public final void N(C57792MmC c57792MmC, EnumC57793MmD enumC57793MmD) {
        String previousPage;
        C188727au c188727au = new C188727au();
        MufPageTrackInfo mufPageTrackInfo = c57792MmC.LJLJI;
        String str = null;
        if (mufPageTrackInfo != null) {
            str = mufPageTrackInfo.getEnterFrom();
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c188727au.LJIIIZ("enter_from", str);
        MufPageTrackInfo mufPageTrackInfo2 = c57792MmC.LJLJI;
        if (mufPageTrackInfo2 != null && (previousPage = mufPageTrackInfo2.getPreviousPage()) != null) {
            str2 = previousPage;
        }
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LIZLLL(getPosition(), "impr_order");
        c188727au.LIZLLL(this.LJLLI ? 1 : 0, "is_online");
        c188727au.LIZLLL(this.LJLL ? 1 : 0, "has_new_videos_link");
        c188727au.LJIIIZ("click_what", enumC57793MmD.getValue());
        LatestUnreadVideoInfo latestUnreadVideoInfo = c57792MmC.LJLIL.getLatestUnreadVideoInfo();
        if (latestUnreadVideoInfo != null) {
            Integer valueOf = Integer.valueOf(latestUnreadVideoInfo.getTotalUnread());
            if (valueOf.intValue() > 0) {
                c188727au.LIZLLL(valueOf.intValue(), "new_videos_cnt");
            }
        }
        FMX.LJIIL("click_mutual_friend_cell", c188727au.LIZ);
    }
}
