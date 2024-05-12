package X;

import Y.ACallableS86S0200000_9;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.k;
import com.google.gson.s;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.now.UserNowPost;
import com.ss.android.ugc.aweme.profile.api.AwemeApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.LtR, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55693LtR extends AbstractC200747uI<Aweme, FeedItemList> implements InterfaceC224118qt, InterfaceC55345Lnp {
    public static int LJLLL = -1;
    public int LJLIL;
    public int LJLILLLLZI;
    public String LJLJI;
    public User LJLJJLL;
    public String LJLJJI = "";
    public volatile java.util.Map<Integer, String> LJLJJL = new HashMap();
    public int LJLJL = 0;
    public int LJLJLJ = 0;
    public String LJLJLLL = "";
    public String LJLL = "";
    public String LJLLI = "";
    public final LinkedHashSet<String> LJLLILLLL = new LinkedHashSet<>();
    public C73318Sq2 LJLLJ = null;

    @Override // X.AbstractC51036K1g
    public final boolean isNewDataEmpty() {
        return false;
    }

    public final boolean LJIILIIL() {
        User user = this.LJLJJLL;
        boolean z = false;
        if (user != null && user.getCommerceUserInfo() != null && this.LJLJJLL.getCommerceUserInfo().getAdRevenueRits() != null) {
            for (Integer num : this.LJLJJLL.getCommerceUserInfo().getAdRevenueRits()) {
                if (num != null && num.intValue() == EnumC2323099u.PROFILE_RIT.getTYPE()) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC224118qt
    public final List<Aweme> getAwemeList() {
        if (this.LJLIL == 1) {
            return getItems();
        }
        return getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final List<Aweme> getItems() {
        T t = this.mData;
        if (t == 0) {
            return null;
        }
        return ((FeedItemList) t).getItems();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean hasLocateItem() {
        T t = this.mData;
        if (t != 0 && ((FeedItemList) t).hasLocateItem) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final boolean isHasMore() {
        T t = this.mData;
        if (t != 0 && ((FeedItemList) t).isHasMore()) {
            return true;
        }
        return false;
    }

    public static File LJIIJ(String str) {
        String str2;
        File LLIIIL = C16880lQ.LLIIIL(EF7.LIZIZ());
        if (LLIIIL == null || !LLIIIL.exists()) {
            return null;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LLIIIL.getPath());
        String str3 = File.separator;
        File file = new File(JBR.LJFF(LIZ, str3, "aweme_publish", LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LLIIIL.getPath());
        LIZ2.append(str3);
        LIZ2.append("aweme_popular");
        File file2 = new File(X1D.LIZIZ(LIZ2));
        if (MF8.LIZ() != 0) {
            file = file2;
        }
        try {
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
        } catch (SecurityException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!TextUtils.equals(str, ((RBX) HG3.LJIILL()).getCurUserId()) && C52968Kqa.LIZ()) {
            if (C3IN.LIZ()) {
                C87030YDq c87030YDq = C87030YDq.LIZIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(AwemeApi.LIZ);
                LIZ3.append(str);
                str2 = c87030YDq.hexDigest(X1D.LIZIZ(LIZ3));
            } else {
                str2 = "others page";
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(file.getPath());
            return new File(C025908h.LIZIZ(LIZ4, File.separator, str2, "other", LIZ4));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(File.separator);
        C87030YDq c87030YDq2 = C87030YDq.LIZIZ;
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(AwemeApi.LIZ);
        LIZ5.append(str);
        sb.append(c87030YDq2.hexDigest(X1D.LIZIZ(LIZ5)));
        return new File(sb.toString());
    }

    public static int LJIILLIIL(List<Aweme> list) {
        int i = 0;
        for (Aweme aweme : list) {
            if (!aweme.isTop() && !aweme.isScheduleVideo()) {
                break;
            }
            i++;
        }
        return i;
    }

    public final FeedItemList LJIIL(String str) {
        File LJIIJ;
        if (!AV1.LJIJI(str) && C3IN.LIZ()) {
            LJIIJ = UserProfilePreloadHelper.LJIIIIZZ().LJII(this.LJLJJLL, str);
        } else {
            LJIIJ = LJIIJ(str);
        }
        if (LJIIJ != null && LJIIJ.exists()) {
            String str2 = "";
            synchronized (this) {
                try {
                    C37247Ejb.LIZIZ.getClass();
                    try {
                        str2 = C36871EdX.LIZJ(new FileInputStream(LJIIJ));
                    } catch (FileNotFoundException unused) {
                        str2 = null;
                    }
                } catch (IOException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    return (FeedItemList) GsonProtectorUtils.fromJson(GsonHolder.LIZLLL().LIZ(), str2, FeedItemList.class);
                } catch (k e2) {
                    C16880lQ.LLLLIIL(e2);
                } catch (s e3) {
                    C16880lQ.LLLLIIL(e3);
                } catch (UnsupportedOperationException e4) {
                    C36922EeM.LJFF(e4);
                }
            }
        }
        return null;
    }

    public final C73454SsE LJIIZILJ(final String str) {
        Object obj;
        Context LLLLL = C16880lQ.LLLLL(EF7.LIZIZ());
        if (LLLLL != null && InterfaceC55700LtY.class.isInterface()) {
            if (InterfaceC55702Lta.class.equals(InterfaceC55700LtY.class)) {
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C55698LtW.LIZ;
                obj = concurrentHashMap.get(InterfaceC55700LtY.class);
                if (obj == null || !(obj instanceof C55696LtU)) {
                    obj = new C55696LtU(LLLLL);
                    concurrentHashMap.put(InterfaceC55700LtY.class, obj);
                }
            } else if (InterfaceC55700LtY.class.equals(InterfaceC55700LtY.class)) {
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C55698LtW.LIZ;
                obj = concurrentHashMap2.get(InterfaceC55700LtY.class);
                if (obj == null || !(obj instanceof C55694LtS)) {
                    obj = new C55694LtS(LLLLL);
                    concurrentHashMap2.put(InterfaceC55700LtY.class, obj);
                }
            }
            ((InterfaceC55700LtY) obj).LIZ();
            return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.Lio
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                    FeedItemList LJIIL = C55693LtR.this.LJIIL(str);
                    if (LJIIL == null) {
                        LJIIL = new FeedItemList();
                    }
                    if (LJIIL.getItems() != null) {
                        LJIIL.items = C55723Ltv.LIZIZ.LJIJJ().LIZLLL(LJIIL.getItems());
                    }
                    LJIIL.hasMore = 0;
                    interfaceC73573Su9.onNext(LJIIL);
                }
            }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
        }
        obj = null;
        ((InterfaceC55700LtY) obj).LIZ();
        return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.Lio
            @Override // X.InterfaceC86003Zc
            public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
                FeedItemList LJIIL = C55693LtR.this.LJIIL(str);
                if (LJIIL == null) {
                    LJIIL = new FeedItemList();
                }
                if (LJIIL.getItems() != null) {
                    LJIIL.items = C55723Ltv.LIZIZ.LJIJJ().LIZLLL(LJIIL.getItems());
                }
                LJIIL.hasMore = 0;
                interfaceC73573Su9.onNext(LJIIL);
            }
        }).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            r10 = this;
            if (r11 == 0) goto L8
            java.lang.String r0 = r11.getAid()
            if (r0 != 0) goto L9
        L8:
            return
        L9:
            java.util.List r6 = r10.getItems()
            if (r6 != 0) goto L17
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r10.setItems(r6)
        L17:
            r5 = 0
            r9 = -1
            r7 = 0
        L1a:
            int r0 = r6.size()
            if (r7 >= r0) goto L6b
            java.lang.Object r8 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r7)
            com.ss.android.ugc.aweme.feed.model.Aweme r8 = (com.ss.android.ugc.aweme.feed.model.Aweme) r8
            if (r8 != 0) goto L2b
        L28:
            int r7 = r7 + 1
            goto L1a
        L2b:
            boolean r0 = X.C54838Lfe.LJJI(r11)
            if (r0 == 0) goto L58
            boolean r0 = r8.isTop()
            if (r0 == 0) goto L48
        L37:
            int r9 = r7 + 1
        L39:
            java.lang.String r1 = r11.getAid()
            java.lang.String r0 = r8.getAid()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L28
            return
        L48:
            boolean r0 = r8.isScheduleVideo()
            if (r0 == 0) goto L4f
            goto L37
        L4f:
            X.Z89 r0 = X.Z89.LIZIZ
            boolean r0 = r0.LIZIZ(r8)
            if (r0 == 0) goto L39
            goto L37
        L58:
            boolean r0 = r8.isTop()
            if (r0 != 0) goto L37
            long r3 = r11.getCreateTime()
            long r1 = r8.getCreateTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L39
            goto L37
        L6b:
            if (r9 >= 0) goto L8e
        L6d:
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r6, r5, r11)
            java.util.List<X.8BT> r0 = r10.mNotifyListeners
            java.util.Iterator r2 = r0.iterator()
        L76:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L8
            java.lang.Object r1 = r2.next()
            X.8BT r1 = (X.C8BT) r1
            if (r1 == 0) goto L76
            boolean r0 = r1 instanceof X.InterfaceC51034K1e
            if (r0 == 0) goto L76
            X.K1e r1 = (X.InterfaceC51034K1e) r1
            r1.onItemInserted(r6, r5)
            goto L76
        L8e:
            r5 = r9
            goto L6d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55693LtR.LJIJI(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    @Override // X.C8BS
    public final boolean checkParams(Object... objArr) {
        if (objArr != null && objArr.length >= 5) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC51036K1g
    public final boolean deleteItem(Object obj) {
        ITalentAdRevenueShareService LJIIJJI;
        Aweme aweme = (Aweme) obj;
        boolean LJIIIIZZ = C78996UzQ.LJIIIIZZ(getItems(), aweme, this.mNotifyListeners);
        if (LJIIIIZZ && (LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI()) != null && aweme.getAwemeRawAd() != null) {
            LJIIJJI.LIZLLL(aweme.getAwemeRawAd().getCreativeIdStr());
        }
        return LJIIIIZZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if (r5 == false) goto L14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b4  */
    /* JADX WARN: Type inference failed for: r14v1, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList, T, java.lang.Object] */
    @Override // X.C8BS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55693LtR.handleData(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC51036K1g
    public final void loadMoreList(Object... objArr) {
        int i;
        long j;
        long j2;
        this.LJLILLLLZI = ((Integer) objArr[4]).intValue();
        if (C55703Ltb.LIZJ) {
            i = 18;
        } else {
            i = 10;
        }
        if (objArr.length >= 6) {
            String str = (String) objArr[2];
            int intValue = ((Integer) objArr[3]).intValue();
            T t = this.mData;
            if (t == 0) {
                j2 = 0;
            } else {
                j2 = ((FeedItemList) t).maxCursor;
            }
            LJIILJJIL(false, str, intValue, j2, i, (String) objArr[5], this.LJLJL, this.LJLJLJ, "");
            return;
        }
        String str2 = (String) objArr[2];
        int intValue2 = ((Integer) objArr[3]).intValue();
        T t2 = this.mData;
        if (t2 == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t2).maxCursor;
        }
        LJIILJJIL(false, str2, intValue2, j, i, "", this.LJLJL, this.LJLJLJ, "");
    }

    @Override // X.AbstractC51036K1g
    public final void refreshList(Object... objArr) {
        int i;
        String str;
        this.LJLILLLLZI = ((Integer) objArr[4]).intValue();
        int i2 = this.LJLIL;
        int i3 = 12;
        if (i2 == 4) {
            i = 12;
        } else {
            i = 20;
        }
        if (C55703Ltb.LIZJ && i2 == 0) {
            int i4 = LJLLL;
            if (i4 > 0) {
                i3 = i4;
            }
        } else {
            i3 = i;
        }
        if (objArr.length >= 7) {
            str = (String) objArr[6];
        } else {
            str = "";
        }
        this.LJLLI = str;
        if (objArr.length >= 6) {
            LJIILJJIL(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0L, i3, (String) objArr[5], 0, 0, this.LJLLI);
        } else {
            LJIILJJIL(((Boolean) objArr[1]).booleanValue(), (String) objArr[2], ((Integer) objArr[3]).intValue(), 0L, i3, "", 0, 0, "");
        }
    }

    @Override // X.AbstractC51036K1g, X.C8BS
    public final boolean sendRequest(Object... objArr) {
        if (!checkParams(objArr)) {
            return false;
        }
        this.mIsLoading = true;
        int intValue = ((Integer) objArr[0]).intValue();
        this.mListQueryType = intValue;
        if (intValue != 1) {
            if (intValue != 2) {
                if (intValue != 4) {
                    if (intValue == 6) {
                        this.LJLILLLLZI = ((Integer) objArr[4]).intValue();
                        this.LJLIL = ((Integer) objArr[3]).intValue();
                        this.LJLJI = (String) objArr[2];
                        this.LJLLI = (String) objArr[6];
                        FGR.LIZIZ().LIZ(this.mHandler, new ACallableS86S0200000_9(this, objArr, 4), 0);
                    }
                } else {
                    loadMoreList(objArr);
                }
            } else {
                loadLatestList(objArr);
            }
        } else {
            refreshList(objArr);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.feed.model.FeedItemList, T] */
    @Override // X.AbstractC51036K1g
    public final void setItems(List<Aweme> list) {
        super.setItems(list);
        T t = this.mData;
        if (t == 0) {
            ?? feedItemList = new FeedItemList();
            feedItemList.items = list;
            this.mData = feedItemList;
            return;
        }
        ((FeedItemList) t).items = list;
    }

    public static void LJIJJ(Aweme aweme, List<Aweme> list) {
        UserNowPost userNowPost;
        if (Z89.LIZIZ.LIZIZ(aweme) && (userNowPost = aweme.userNowPost) != null) {
            if (userNowPost.getTotalCount() == null && aweme.userNowPost.getTotalCount().intValue() < 1) {
                return;
            }
            ListProtector.add(list, LJIILLIIL(list), aweme);
        }
    }

    public static List<Aweme> LJIJJLI(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator<Aweme> it = list2.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (TextUtils.equals(aweme.getAid(), it.next().getAid())) {
                        arrayList.remove(aweme);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC55345Lnp
    public final void LIZJ(int i, String str) {
        ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
        if (LJIIJJI != null && LJIIJJI.LJII(i)) {
            LJIJ(i, str, IO4.PROFILE_AD_REQUEST_SOURCE_LOAD_MORE);
        }
    }

    public final void LJIIJJI(FeedItemList feedItemList, String str) {
        synchronized (this) {
            File LJIIJ = LJIIJ(str);
            if (LJIIJ == null) {
                return;
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(LJIIJ));
                outputStreamWriter.write(GsonHolder.LIZLLL().LIZ().LJIILL(feedItemList));
                outputStreamWriter.close();
                if (C3IN.LIZ() && !AV1.LJIJI(str) && LJIIJ.exists()) {
                    UserProfilePreloadHelper.LJIIIIZZ().LJFF(str, LJIIJ.getPath());
                }
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJ(int i, String str, IO4 io4) {
        ITalentAdRevenueShareService LJIIJJI;
        T t = this.mData;
        if (t == 0 || ((FeedItemList) t).getItems() == null || TextUtils.isEmpty(str) || i < 0 || i >= ((FeedItemList) this.mData).getItems().size() || !LJIILIIL() || (LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI()) == null) {
            return;
        }
        int LIZJ = LJIIJJI.LIZJ();
        ArrayList arrayList = new ArrayList();
        List<Aweme> items = ((FeedItemList) this.mData).getItems();
        for (int i2 = i + 1; i2 < items.size(); i2++) {
            Aweme aweme = (Aweme) ListProtector.get(items, i2);
            if (LIZJ > 0) {
                arrayList.add(aweme.getAid());
                LIZJ--;
            }
        }
        LJIIJJI.LJIIJ(str, arrayList, i, io4, new C55699LtX(this));
    }

    public static void LJIL(FeedItemList feedItemList, boolean z, int i, int i2) {
        int isTop;
        if (feedItemList == null || feedItemList.getItems() == null) {
            return;
        }
        int size = feedItemList.getItems().size();
        for (int i3 = 0; i3 < size; i3++) {
            Aweme aweme = (Aweme) ListProtector.get(feedItemList.getItems(), i3);
            if (aweme == null) {
                isTop = -1;
            } else {
                isTop = aweme.getIsTop();
            }
            if (!Z89.LIZIZ.LIZIZ(aweme)) {
                if (aweme != null && (aweme.isSelfSee() || aweme.isProhibited())) {
                    aweme = AwemeService.LIZ().p6(i, aweme);
                } else {
                    aweme = AwemeService.LIZ().R1(aweme);
                }
            }
            if (z && isTop >= 0) {
                aweme.setIsTop(isTop);
            }
            IRequestIdService LJ = RequestIdService.LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(aweme.getAid());
            LIZ.append(i2 + i);
            LJ.LIZJ(i3, X1D.LIZIZ(LIZ), feedItemList.getRequestId());
            ListProtector.set(feedItemList.getItems(), i3, aweme);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC200747uI
    public final void LJIIIZ(String str, List list, long j, boolean z) {
        this.LJLL = str;
        setItems(new ArrayList(list));
        ((FeedItemList) this.mData).cursor = list.size();
        FeedItemList feedItemList = (FeedItemList) this.mData;
        feedItemList.hasMore = z ? 1 : 0;
        feedItemList.cursor = j;
        feedItemList.maxCursor = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        if (r31.LJLJJLL.getUserNowPackStruct().getUserNowStatus() > 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(boolean r32, final java.lang.String r33, final int r34, long r35, int r37, java.lang.String r38, int r39, int r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55693LtR.LJIILJJIL(boolean, java.lang.String, int, long, int, java.lang.String, int, int, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (r5 != null) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.feed.model.FeedItemList LJIILL(boolean r31, java.lang.String r32, int r33, long r34, int r36, java.lang.String r37, int r38, int r39, boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55693LtR.LJIILL(boolean, java.lang.String, int, long, int, java.lang.String, int, int, boolean, java.lang.String):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
