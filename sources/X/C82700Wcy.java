package X;

import Y.ARunnableS33S0200000_14;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.homepage.business.ILiveBubblePopService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wcy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82700Wcy implements InterfaceC82703Wd1 {
    public final /* synthetic */ InterfaceC54197LOv LIZ;
    public final /* synthetic */ InterfaceC82702Wd0 LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;

    @Override // X.InterfaceC82703Wd1
    public final void LIZ(List<? extends FeedItem> list) {
        boolean z;
        TuxIconView LJ;
        Long l;
        User owner;
        InterfaceC54197LOv interfaceC54197LOv = this.LIZ;
        C62822Ol8 c62822Ol8 = C82699Wcx.LJFF;
        int i = 0;
        if (((ILiveBubblePopService) c62822Ol8.getValue()).isShowingAd() || ((ILiveBubblePopService) c62822Ol8.getValue()).isShowingDialog() || ((ILiveBubblePopService) c62822Ol8.getValue()).isShowingInnerPush() || ((ILiveBubblePopService) c62822Ol8.getValue()).isShowingVideoGuide() || !interfaceC54197LOv.LJ() || C82699Wcx.LIZIZ || !(!list.isEmpty())) {
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<? extends FeedItem> it = list.iterator();
        while (it.hasNext()) {
            Room room = it.next().getRoom();
            if (room != null && (owner = room.getOwner()) != null) {
                l = Long.valueOf(owner.getId());
            } else {
                l = null;
            }
            arrayList.add(String.valueOf(l));
        }
        int size = list.size();
        C54193LOr c54193LOr = C82699Wcx.LJ;
        c54193LOr.LIZ = 2;
        c54193LOr.LIZIZ = size;
        c54193LOr.LIZJ = arrayList;
        InterfaceC82702Wd0 interfaceC82702Wd0 = this.LIZIZ;
        if (list.size() > 1) {
            z = true;
        } else {
            z = false;
        }
        interfaceC82702Wd0.LJFF(z);
        for (FeedItem feedItem : list) {
            int i2 = i + 1;
            if (i > 2) {
                break;
            }
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && (LJ = interfaceC82702Wd0.LJ()) != null) {
                        C82699Wcx.LIZIZ(LJ, feedItem);
                    }
                } else {
                    TuxIconView LIZLLL = interfaceC82702Wd0.LIZLLL();
                    if (LIZLLL != null) {
                        C82699Wcx.LIZIZ(LIZLLL, feedItem);
                    }
                }
            } else {
                TuxIconView LIZJ = interfaceC82702Wd0.LIZJ();
                if (LIZJ != null) {
                    C82699Wcx.LIZIZ(LIZJ, feedItem);
                }
            }
            i = i2;
        }
        C82699Wcx.LJI = true;
        ActivityC45651qj activityC45651qj = this.LIZJ;
        InterfaceC82702Wd0 interfaceC82702Wd02 = this.LIZIZ;
        PopupManager.LJIIL(new C85754Xl8(activityC45651qj, interfaceC82702Wd02, new ARunnableS33S0200000_14(activityC45651qj, interfaceC82702Wd02, 0)));
    }

    public C82700Wcy(ActivityC45651qj activityC45651qj, C82691Wcp c82691Wcp, InterfaceC54197LOv interfaceC54197LOv) {
        this.LIZ = interfaceC54197LOv;
        this.LIZIZ = c82691Wcp;
        this.LIZJ = activityC45651qj;
    }
}
