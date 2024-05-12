package Y;

import X.C188727au;
import X.C55693LtR;
import X.C62562cu;
import X.C76732zl;
import X.C78996UzQ;
import X.FMX;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.LB1;
import X.W5U;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public class IDuS3S1200000_9 implements InterfaceC86003Zc {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<Boolean> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS3S1200000_9 iDuS3S1200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        for (Object obj : (List) iDuS3S1200000_9.l1) {
            if (interfaceC73573Su9.isDisposed()) {
                break;
            }
            ((C76732zl) iDuS3S1200000_9.l2).element++;
            if (obj instanceof LB1) {
                LB1 lb1 = (LB1) obj;
                UrlModel avatarThumb = lb1.LJLILLLLZI.getAvatarThumb();
                if (avatarThumb != null || (avatarThumb = lb1.LJLILLLLZI.getAvatarMedium()) != null) {
                    List<String> urlList = avatarThumb.getUrlList();
                    if (urlList != null) {
                        W5U.LJIIIZ(new C62562cu(urlList)).LJIIJ();
                    }
                }
            }
        }
        String str = iDuS3S1200000_9.s0;
        int i = ((C76732zl) iDuS3S1200000_9.l2).element;
        int size = ((List) iDuS3S1200000_9.l1).size();
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LIZLLL(i, "preload_size");
        c188727au.LIZLLL(size, "total_size");
        FMX.LJIIL("avatar_preload", c188727au.LIZ);
    }

    public static final void subscribe$1(IDuS3S1200000_9 iDuS3S1200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C55693LtR c55693LtR = (C55693LtR) iDuS3S1200000_9.l1;
        String str = iDuS3S1200000_9.s0;
        Aweme aweme = (Aweme) iDuS3S1200000_9.l2;
        FeedItemList LJIIL = c55693LtR.LJIIL(str);
        if (LJIIL != null && LJIIL.getItems() != null) {
            C78996UzQ.LJIIIIZZ(LJIIL.getItems(), aweme, null);
            c55693LtR.LJIIJJI(LJIIL, str);
        }
    }

    public static final void subscribe$2(IDuS3S1200000_9 iDuS3S1200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        ((C55693LtR) iDuS3S1200000_9.l1).LJIIJJI((FeedItemList) iDuS3S1200000_9.l2, iDuS3S1200000_9.s0);
    }

    public static final void subscribe$3(IDuS3S1200000_9 iDuS3S1200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C55693LtR c55693LtR = (C55693LtR) iDuS3S1200000_9.l1;
        String str = iDuS3S1200000_9.s0;
        Aweme aweme = (Aweme) iDuS3S1200000_9.l2;
        FeedItemList LJIIL = c55693LtR.LJIIL(str);
        if (LJIIL == null) {
            LJIIL = new FeedItemList();
        }
        if (LJIIL.getItems() == null) {
            LJIIL.items = new ArrayList(1);
        }
        ListProtector.add(LJIIL.getItems(), 0, aweme);
        c55693LtR.LJIIJJI(LJIIL, str);
    }

    public static final void subscribe$4(IDuS3S1200000_9 iDuS3S1200000_9, InterfaceC73573Su9 interfaceC73573Su9) {
        C55693LtR c55693LtR = (C55693LtR) iDuS3S1200000_9.l1;
        String str = iDuS3S1200000_9.s0;
        Collection collection = (Collection) iDuS3S1200000_9.l2;
        FeedItemList LJIIL = c55693LtR.LJIIL(str);
        if (LJIIL != null && LJIIL.getItems() != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                C78996UzQ.LJIIIIZZ(LJIIL.getItems(), (Aweme) it.next(), null);
            }
            c55693LtR.LJIIJJI(LJIIL, str);
        }
    }

    public IDuS3S1200000_9(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
