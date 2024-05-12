package X;

import Y.ACallableS82S0101000_11;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.brdatagift.BemobiGiftServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedAppLogParams;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.panel.RecommendFeedFragmentPanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Lhw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54980Lhw extends C51031K1b<C55017LiX> {
    public boolean LJLJJL;
    public InterfaceC51032K1c LJLJJLL;
    public boolean LJLJLJ;
    public final Fragment LJLL;
    public String LJLLI;
    public int LJLLILLLL;
    public final FVH LJLLJ;
    public RecommendFeedFragmentPanel LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public String LJLJLLL = "";
    public boolean LJZ = true;
    public final C8RO LJZI = new C8RO("FeedFetchPresenter");
    public volatile boolean LJZL = false;
    public boolean LJLJL = false;

    public final FeedAppLogParams LJJIIZI() {
        FeedItemList feedItemList = (FeedItemList) this.LJLIL.getData();
        T t = this.LJLIL;
        return new FeedAppLogParams(feedItemList, ((C55017LiX) t).LJLJJL, ((AbstractC51036K1g) t).getItems());
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x03af, code lost:
    
        if (((X.C55017LiX) r9.LJLIL).LJLLILLLL != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03f3, code lost:
    
        r2 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03fd, code lost:
    
        if (r9.LJLIL.getData() == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0409, code lost:
    
        if (((com.ss.android.ugc.aweme.feed.model.FeedItemList) r9.LJLIL.getData()).extra == null) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x040b, code lost:
    
        r2 = ((com.ss.android.ugc.aweme.feed.model.FeedItemList) r9.LJLIL.getData()).extra.now;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0417, code lost:
    
        r7 = com.ss.android.ugc.aweme.live.LiveOuterService.LJJJLL().LJJIFFI();
        r0 = ((X.AbstractC51036K1g) r9.LJLIL).getItems();
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x042a, code lost:
    
        if (r0 == null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x042c, code lost:
    
        r8 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0434, code lost:
    
        if (r8.hasNext() == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0436, code lost:
    
        r1 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0440, code lost:
    
        if (r1.isLive() == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0442, code lost:
    
        r0 = r1.getNewLiveRoomData();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0446, code lost:
    
        if (r0 == null) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0448, code lost:
    
        r7.LIZ().add(java.lang.String.valueOf(r0.id));
        r7.LIZIZ = r2 / 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03f0, code lost:
    
        if (r1 == 1) goto L146;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C51031K1b, X.C8BR, X.C8BT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            Method dump skipped, instructions count: 1309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54980Lhw.onSuccess():void");
    }

    public C54980Lhw(Fragment fragment) {
        this.LJLL = fragment;
        this.LJLLJ = new FVH(fragment);
    }

    public static void LJJIJIIJI(int i) {
        if (C39082FVm.LIZ()) {
            HashMap LIZJ = C03660Ck.LIZJ("monitor_scene", "scene_feed_data");
            LIZJ.put("vv_code", Integer.valueOf(i));
            C39082FVm.LIZJ(LIZJ);
        }
    }

    @Override // X.C8BR
    public final boolean LJIILL(Object... objArr) {
        String str;
        ((Integer) objArr[0]).intValue();
        int intValue = ((Integer) objArr[0]).intValue();
        String str2 = "";
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 4) {
                    str = "";
                } else {
                    str = "load_more";
                }
            } else {
                str = "load_latest";
            }
        } else {
            str = "refresh";
        }
        this.LJLJLLL = str;
        LYH.LIZLLL(MG5.RECOMMEND_FEED, this.LJLL.mo49getActivity());
        if (5 == this.LJLLLL) {
            this.LJLJLLL = "press_back";
        }
        int intValue2 = ((Integer) objArr[1]).intValue();
        if (intValue2 != 0) {
            if (intValue2 != 1) {
                if (intValue2 == 2) {
                    str2 = "homepage_fresh";
                }
            } else {
                str2 = "homepage_follow";
            }
        } else {
            str2 = "homepage_hot";
        }
        this.LJLLI = str2;
        this.LJLLILLLL = ((Integer) objArr[2]).intValue();
        this.LJLLJ.LIZJ(this.LJLJLLL);
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        if (interfaceC51032K1c != null) {
            interfaceC51032K1c.c0(this.LJLJLJ);
        }
        BemobiGiftServiceImpl.LIZIZ().LIZ("feed");
        this.LJLJL = super.LJIILL(objArr);
        C8RO c8ro = this.LJZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[sendRequest] ");
        LIZ.append(this.LJLLI);
        LIZ.append(",");
        LIZ.append(this.LJLJLLL);
        c8ro.LJIIIIZZ(X1D.LIZIZ(LIZ));
        return this.LJLJL;
    }

    public final void LJJIIZ(String str) {
        if (!TextUtils.isEmpty(str) && ((AbstractC51036K1g) this.LJLIL).getItems() != null) {
            for (int size = ((AbstractC51036K1g) this.LJLIL).getItems().size() - 1; size >= 0; size--) {
                Aweme aweme = (Aweme) ListProtector.get(((AbstractC51036K1g) this.LJLIL).getItems(), size);
                if (aweme != null && TextUtils.equals(str, aweme.getAuthorUid())) {
                    ListProtector.remove(((AbstractC51036K1g) this.LJLIL).getItems(), size);
                }
            }
        }
    }

    public final void LJJIJ(Aweme aweme) {
        List items = ((AbstractC51036K1g) this.LJLIL).getItems();
        if (C79004UzY.LJJIFFI(items)) {
            items = new ArrayList();
        }
        if (items.size() < 0) {
            return;
        }
        ListProtector.add(items, 0, aweme);
        ((AbstractC51036K1g) this.LJLIL).setItems(items);
        if (this.LJLILLLLZI != 0) {
            if (((AbstractC51036K1g) this.LJLIL).isDataEmpty()) {
                ((InterfaceC223218pR) this.LJLILLLLZI).Ne();
            } else {
                onItemInserted(items, 0);
            }
        }
    }

    @Override // X.C51031K1b, X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        C54919Lgx.LIZ.LIZLLL(null);
        LYH.LIZJ(MG5.RECOMMEND_FEED);
        this.LJLLJ.LIZIZ(0, this.LJLJLLL, null);
        this.LJLLJ.LIZ(0, this.LJLJLLL, null, exc);
        boolean z = true;
        if (exc != null && !TextUtils.isEmpty(exc.getMessage())) {
            C10K.LIZIZ(new ACallableS82S0101000_11(1, exc, 1), FMX.LIZIZ(), null);
            AbstractC39351FcR LIZ = C38986FRu.LIZ();
            try {
                if (LIZ.LJI == -1) {
                    LIZ.LJI = C64920Pds.LIZIZ(exc, null);
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (this.LJLJJL) {
            this.LJLJJL = false;
            ((C55017LiX) this.LJLIL).LJLJJI = false;
        }
        C2U8.LIZ(new C54409LWz());
        InterfaceC51032K1c interfaceC51032K1c = this.LJLJJLL;
        if (interfaceC51032K1c != null) {
            if (this.LJLJL && !this.LJLJLJ) {
                z = false;
            }
            interfaceC51032K1c.c0(z);
        }
        this.LJLJL = false;
        this.LJLJLJ = false;
        C46364IHo.LIZIZ = false;
        super.onFailed(exc);
        C36093EEn.LIZ.getClass();
        C36093EEn.LIZJ();
        C8RO c8ro = this.LJZI;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("[onFailed] ");
        LIZ2.append(this.LJLJLLL);
        LIZ2.append(",");
        LIZ2.append(this.LJLLI);
        c8ro.LJIILJJIL(X1D.LIZIZ(LIZ2), exc);
    }

    @Override // X.C51031K1b, X.InterfaceC51034K1e
    public final boolean onItemInsertedNew(C2KF c2kf) {
        InterfaceC51033K1d interfaceC51033K1d = this.LJLJJI;
        if (interfaceC51033K1d != null) {
            return interfaceC51033K1d.onItemInsertedNew(c2kf);
        }
        return false;
    }
}
