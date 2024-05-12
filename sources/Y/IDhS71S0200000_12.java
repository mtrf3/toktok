package Y;

import X.AbstractC73946T0k;
import X.AbstractC74512TMe;
import X.C26429AYv;
import X.C32I;
import X.C35794E3a;
import X.C61031NxL;
import X.C61878OQg;
import X.C72897SjF;
import X.C72898SjG;
import X.C72899SjH;
import X.C72909SjR;
import X.C73320Sq4;
import X.C73722SwY;
import X.C73723SwZ;
import X.C73919Szj;
import X.C73921Szl;
import X.C73923Szn;
import X.C74579TOt;
import X.CallableC73721SwX;
import X.InterfaceC48038ItG;
import X.InterfaceC88471Ynr;
import X.L61;
import X.L6F;
import X.LB1;
import X.ORZ;
import X.OSZ;
import X.T16;
import X.TPG;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.UploadPhotoV2Method;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.following.model.FollowerItemList;
import com.ss.android.ugc.aweme.following.model.FollowingItemList;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationState;
import com.ss.android.ugc.aweme.following.ui.viewmodel.FollowingRelationViewModel;
import com.ss.android.ugc.aweme.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.effectmanager.effect.model.template.ProviderEffectModelTemplate;
import com.ss.ugc.effectplatform.model.ProviderEffect;
import defpackage.e1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS54S0110000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class IDhS71S0200000_12 implements InterfaceC48038ItG {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC48038ItG
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            case 4:
                return apply$4(this, obj);
            case 5:
                return apply$5(this, obj);
            case 6:
                return apply$6(this, obj);
            case 7:
                return apply$7(this, obj);
            case 8:
                return apply$8(this, obj);
            case 9:
                return apply$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        UploadPhotoV2Method uploadPhotoV2Method = (UploadPhotoV2Method) iDhS71S0200000_12.l0;
        byte[] bArr = (byte[]) iDhS71S0200000_12.l1;
        uploadPhotoV2Method.getClass();
        if (bArr.length <= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            AbstractC73946T0k abstractC73946T0k = T16.LIZIZ;
            C73320Sq4.LIZ(timeUnit, "unit is null");
            C73320Sq4.LIZ(abstractC73946T0k, "scheduler is null");
            new C73723SwZ(Math.max(0L, 500L), timeUnit, abstractC73946T0k);
        }
        C73320Sq4.LIZ(obj, "throwable is null");
        return new C73722SwY(new CallableC73721SwX(obj));
    }

    public static final Object apply$1(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        int i2;
        FollowerItemList resp = (FollowerItemList) obj;
        o.LJIIIZ(resp, "resp");
        FollowerRelationViewModel followerRelationViewModel = (FollowerRelationViewModel) iDhS71S0200000_12.l0;
        followerRelationViewModel.getClass();
        followerRelationViewModel.setState(new AqS178S0100000_12(resp, 448));
        L6F.LIZIZ.LIZLLL(L61.STORY, null, resp.items, C72897SjF.LJLIL);
        List<User> list = resp.items;
        o.LJIIIIZZ(list, "resp.items");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it.hasNext()) {
                break;
            }
            User user2 = (User) it.next();
            user2.setRequestId(resp.extra.logid);
            arrayList2.add(new LB1(1, 0, user2, ""));
        }
        boolean z = resp.hasMore;
        int i3 = resp.offset;
        long j = resp.minTime;
        boolean z2 = resp.recommendHasMore;
        if (!((FollowerRelationViewModel) iDhS71S0200000_12.l0).LJLLJ) {
            i2 = 1 + ((C72909SjR) ((FollowerRelationState) iDhS71S0200000_12.l1).getListState().getPayload()).LJ;
        }
        List<User> list2 = resp.items;
        if (list2 != null) {
            i = list2.size();
        }
        return new OSZ(arrayList2, new C72909SjR(z, i3, j, z2, i2, i, false, 192));
    }

    public static final Object apply$2(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        FollowingItemList resp = (FollowingItemList) obj;
        o.LJIIIZ(resp, "resp");
        FollowingRelationViewModel followingRelationViewModel = (FollowingRelationViewModel) iDhS71S0200000_12.l0;
        followingRelationViewModel.getClass();
        int i2 = 1;
        followingRelationViewModel.setState(new AqS54S0110000_12(resp, true, 10));
        ((FollowingRelationViewModel) iDhS71S0200000_12.l0).Iv0(resp);
        FollowingRelationViewModel followingRelationViewModel2 = (FollowingRelationViewModel) iDhS71S0200000_12.l0;
        followingRelationViewModel2.getClass();
        followingRelationViewModel2.setState(new AqS178S0100000_12(resp, 449));
        L6F.LIZIZ.LIZLLL(L61.STORY, null, resp.items, C72898SjG.LJLIL);
        List<User> list = resp.items;
        o.LJIIIIZZ(list, "resp.items");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            User user2 = (User) it.next();
            user2.setRequestId(resp.extra.logid);
            arrayList2.add(new LB1(0, 0, user2, ""));
        }
        boolean z = resp.hasMore;
        int i3 = resp.offset;
        long j = resp.minTime;
        boolean z2 = resp.recommendHasMore;
        if (!((FollowingRelationViewModel) iDhS71S0200000_12.l0).LJLJL) {
            i2 = 1 + ((C72909SjR) ((FollowingRelationState) iDhS71S0200000_12.l1).getListState().getPayload()).LJ;
        }
        List<User> list2 = resp.items;
        if (list2 != null) {
            i = list2.size();
        }
        return new OSZ(arrayList2, new C72909SjR(z, i3, j, z2, i2, i, false, 192));
    }

    public static final Object apply$3(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        FollowingItemList resp = (FollowingItemList) obj;
        o.LJIIIZ(resp, "resp");
        ((FollowingRelationViewModel) iDhS71S0200000_12.l0).Iv0(resp);
        FollowingRelationViewModel followingRelationViewModel = (FollowingRelationViewModel) iDhS71S0200000_12.l0;
        followingRelationViewModel.getClass();
        int i2 = 0;
        followingRelationViewModel.setState(new AqS54S0110000_12(resp, false, 10));
        FollowingRelationViewModel followingRelationViewModel2 = (FollowingRelationViewModel) iDhS71S0200000_12.l0;
        followingRelationViewModel2.getClass();
        followingRelationViewModel2.setState(new AqS178S0100000_12(resp, 449));
        L6F.LIZIZ.LIZLLL(L61.STORY, null, resp.items, C72899SjH.LJLIL);
        List<User> list = resp.items;
        o.LJIIIIZZ(list, "resp.items");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (User user : list) {
            if (hashSet.add(user.getUid())) {
                arrayList.add(user);
            }
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            User user2 = (User) it.next();
            user2.setRequestId(resp.extra.logid);
            arrayList2.add(new LB1(0, 0, user2, ""));
        }
        boolean z = resp.hasMore;
        int i3 = resp.offset;
        long j = resp.minTime;
        boolean z2 = resp.recommendHasMore;
        if (((FollowingRelationViewModel) iDhS71S0200000_12.l0).LJLJL) {
            i = 1;
        } else {
            i = ((C72909SjR) ((FollowingRelationState) iDhS71S0200000_12.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list2 = resp.items;
        if (list2 != null) {
            i2 = list2.size();
        }
        return new OSZ(arrayList2, new C72909SjR(z, i3, j, z2, i, i2, false, 192));
    }

    public static final Object apply$4(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        int i2;
        int i3;
        FollowingItemList resp = (FollowingItemList) obj;
        o.LJIIIZ(resp, "resp");
        PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0;
        pushSettingNotificationChoiceViewModel.getClass();
        pushSettingNotificationChoiceViewModel.setState(new AqS54S0110000_12(resp, true, 18));
        ((PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0).Hv0(resp);
        boolean z = resp.hasMore;
        int i4 = resp.offset;
        long j = resp.minTime;
        boolean z2 = resp.recommendHasMore;
        if (((PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0).LJLJL) {
            i = 1;
        } else {
            i = ((C72909SjR) ((NotificationChoiceState) iDhS71S0200000_12.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list = resp.items;
        if (list != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        C72909SjR c72909SjR = new C72909SjR(z, i4, j, z2, i, i2, false, 192);
        List<User> list2 = resp.items;
        o.LJIIIIZZ(list2, "resp.items");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
        for (User user : list2) {
            o.LJIIIIZZ(user, "user");
            arrayList.add(new LB1(0, 0, user, ""));
        }
        List LLJILJILJ = ORZ.LLJILJILJ(arrayList);
        ListProtector.add(LLJILJILJ, 0, new C26429AYv(18, 2));
        if (e1.LIZ(31744, "live_revenue_notification_enable", true, false)) {
            ListProtector.add(LLJILJILJ, 1, new C26429AYv(19, 2));
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (true ^ ((ArrayList) LLJILJILJ).isEmpty()) {
            ListProtector.add(LLJILJILJ, i3, new C26429AYv(17, 2));
        }
        return new OSZ(LLJILJILJ, c72909SjR);
    }

    public static final Object apply$5(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        FollowingItemList resp = (FollowingItemList) obj;
        o.LJIIIZ(resp, "resp");
        ((PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0).Hv0(resp);
        PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0;
        pushSettingNotificationChoiceViewModel.getClass();
        int i2 = 0;
        pushSettingNotificationChoiceViewModel.setState(new AqS54S0110000_12(resp, false, 18));
        List<User> list = resp.items;
        o.LJIIIIZZ(list, "resp.items");
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        for (User user : list) {
            o.LJIIIIZZ(user, "user");
            arrayList.add(new LB1(0, 0, user, ""));
        }
        boolean z = resp.hasMore;
        int i3 = resp.offset;
        long j = resp.minTime;
        boolean z2 = resp.recommendHasMore;
        if (((PushSettingNotificationChoiceViewModel) iDhS71S0200000_12.l0).LJLJL) {
            i = 1;
        } else {
            i = ((C72909SjR) ((NotificationChoiceState) iDhS71S0200000_12.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list2 = resp.items;
        if (list2 != null) {
            i2 = list2.size();
        }
        return new OSZ(arrayList, new C72909SjR(z, i3, j, z2, i, i2, false, 192));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0014, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object apply$6(Y.IDhS71S0200000_12 r10, java.lang.Object r11) {
        /*
            com.ss.android.ugc.aweme.following.model.FollowerItemList r11 = (com.ss.android.ugc.aweme.following.model.FollowerItemList) r11
            java.lang.String r0 = "resp"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = X.C53299Kvv.LIZIZ()
            r9 = 0
            if (r0 == 0) goto L16
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L16
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L16
            if (r0 != 0) goto L27
        L16:
            java.lang.Object r2 = r10.l0
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel r2 = (com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel) r2
            r2.getClass()
            kotlin.jvm.internal.AqS178S0100000_12 r1 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 448(0x1c0, float:6.28E-43)
            r1.<init>(r11, r0)
            r2.setState(r1)
        L27:
            X.L6F r4 = X.L6F.LIZIZ
            X.L61 r3 = X.L61.STORY
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r11.items
            X.SjI r1 = X.C72900SjI.LJLIL
            r0 = 0
            r4.LIZLLL(r3, r0, r2, r1)
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r1 = r11.items
            java.lang.String r0 = "resp.items"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L48:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = (com.ss.android.ugc.aweme.profile.model.User) r0
            java.lang.String r0 = r0.getUid()
            boolean r0 = r4.add(r0)
            if (r0 == 0) goto L48
            r3.add(r1)
            goto L48
        L63:
            java.util.ArrayList r1 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r3, r0)
            r1.<init>(r0)
            java.util.Iterator r4 = r3.iterator()
        L72:
            boolean r0 = r4.hasNext()
            r8 = 1
            if (r0 == 0) goto L91
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.profile.model.User r3 = (com.ss.android.ugc.aweme.profile.model.User) r3
            com.ss.android.ugc.aweme.base.api.BaseResponse$ServerTimeExtra r0 = r11.extra
            java.lang.String r0 = r0.logid
            r3.setRequestId(r0)
            X.LB1 r2 = new X.LB1
            java.lang.String r0 = ""
            r2.<init>(r8, r9, r3, r0)
            r1.add(r2)
            goto L72
        L91:
            X.SjR r2 = new X.SjR
            boolean r3 = r11.hasMore
            int r4 = r11.offset
            long r5 = r11.minTime
            boolean r7 = r11.recommendHasMore
            java.lang.Object r0 = r10.l0
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel r0 = (com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel) r0
            boolean r0 = r0.LJLLJ
            if (r0 == 0) goto Lb7
        La3:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r11.items
            if (r0 == 0) goto Lab
            int r9 = r0.size()
        Lab:
            r10 = 0
            r11 = 192(0xc0, float:2.69E-43)
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r11)
            X.OSZ r0 = new X.OSZ
            r0.<init>(r1, r2)
            return r0
        Lb7:
            java.lang.Object r0 = r10.l1
            com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState r0 = (com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationState) r0
            com.bytedance.jedi.arch.ext.list.ListState r0 = r0.getListState()
            X.Rr9 r0 = r0.getPayload()
            X.SjR r0 = (X.C72909SjR) r0
            int r0 = r0.LJ
            int r8 = r8 + r0
            goto La3
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDhS71S0200000_12.apply$6(Y.IDhS71S0200000_12, java.lang.Object):java.lang.Object");
    }

    public static final Object apply$7(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        OSZ result = (OSZ) obj;
        o.LJIIIZ(result, "result");
        synchronized (((AbstractC74512TMe) iDhS71S0200000_12.l0).LIZLLL) {
            AbstractC74512TMe abstractC74512TMe = (AbstractC74512TMe) iDhS71S0200000_12.l0;
            if (abstractC74512TMe.LJIIIIZZ(iDhS71S0200000_12.l1, abstractC74512TMe.LIZJ.get())) {
                ((AbstractC74512TMe) iDhS71S0200000_12.l0).LIZJ.set(result.getFirst());
            }
        }
        return result.getSecond();
    }

    public static final Object apply$8(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        int i;
        C35794E3a it = (C35794E3a) obj;
        o.LJIIIZ(it, "it");
        ProviderEffectModelTemplate providerEffectModelTemplate = (ProviderEffectModelTemplate) it.LIZ();
        if (providerEffectModelTemplate != null) {
            String feed_session_id = providerEffectModelTemplate.getFeed_session_id();
            if (feed_session_id != null) {
                ((C74579TOt) iDhS71S0200000_12.l1).LJII = feed_session_id;
            }
            List<ProviderEffect> library_list = providerEffectModelTemplate.getLibrary_list();
            if (library_list != null) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(library_list, 10));
                Iterator<ProviderEffect> it2 = library_list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new com.ss.android.ugc.effectmanager.effect.model.ProviderEffect(it2.next()));
                }
                providerEffectModelTemplate.setStickerList(arrayList);
            }
        }
        int i2 = 0;
        if (providerEffectModelTemplate == null) {
            return new OSZ(new TPG(((TPG) iDhS71S0200000_12.l0).LJLIL, 0, 0, false), new OSZ(C61878OQg.INSTANCE, null));
        }
        List<com.ss.android.ugc.effectmanager.effect.model.ProviderEffect> stickerList = providerEffectModelTemplate.getStickerList();
        if (stickerList == null || stickerList.isEmpty()) {
            return new OSZ(new TPG(((TPG) iDhS71S0200000_12.l0).LJLIL, 0, 0, false), new OSZ(C61878OQg.INSTANCE, providerEffectModelTemplate));
        }
        int cursor = providerEffectModelTemplate.getCursor();
        Integer last_clip_cursor = providerEffectModelTemplate.getLast_clip_cursor();
        if (last_clip_cursor != null) {
            i = last_clip_cursor.intValue();
        } else {
            i = 0;
        }
        Integer last_gif_cursor = providerEffectModelTemplate.getLast_gif_cursor();
        if (last_gif_cursor != null) {
            i2 = last_gif_cursor.intValue();
        }
        return new OSZ(new TPG(cursor, i, i2, providerEffectModelTemplate.hasMore()), new OSZ(providerEffectModelTemplate.getStickerList(), providerEffectModelTemplate));
    }

    public static final Object apply$9(IDhS71S0200000_12 iDhS71S0200000_12, Object obj) {
        OSZ osz = (OSZ) obj;
        o.LJIIJ(osz, "<name for destructuring parameter 0>");
        Object first = osz.getFirst();
        Object second = osz.getSecond();
        InterfaceC88471Ynr<? super V, ? super V1, ? extends V1> interfaceC88471Ynr = ((C73921Szl) ((C73923Szn) ((IDhS105S0100000_12) iDhS71S0200000_12.l0).l0).LIZIZ).LIZJ;
        Object obj2 = iDhS71S0200000_12.l1;
        Object obj3 = null;
        if (obj2 != null) {
            if (second != null) {
                Object invoke = interfaceC88471Ynr.invoke(obj2, second);
                C73919Szj.LIZLLL.getClass();
                if (!C61031NxL.LIZ(invoke, second)) {
                    obj3 = invoke;
                }
                return new OSZ(first, obj3);
            }
            o.LJIIZILJ();
            throw null;
        }
        o.LJIIZILJ();
        throw null;
    }

    public IDhS71S0200000_12(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
