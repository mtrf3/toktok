package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.FavStickerStruct;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.VideoSticker;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71512rL extends AbstractC71812rp<List<FavStickerStruct>, FavStickerListResponse, String, InterfaceC71562rQ> {
    public static boolean LJIIIIZZ;
    public static final C71512rL LJII = new C71512rL();
    public static EnumC71552rP LJIIIZ = EnumC71552rP.REFRESH;

    @Override // X.AbstractC71812rp
    public final String LJIIIIZZ() {
        return "fav_sticker";
    }

    @Override // X.AbstractC71812rp
    public final String LJIIIZ(List<? extends String> keys) {
        o.LJIIIZ(keys, "keys");
        return null;
    }

    public static final String LJJI() {
        String curUserId = HG3.LJIILL().getCurUserId();
        o.LJIIIIZZ(curUserId, "userService().curUserId");
        return curUserId;
    }

    @Override // X.AbstractC71812rp
    public final /* bridge */ /* synthetic */ String LJ() {
        return LJJI();
    }

    @Override // X.AbstractC71812rp
    public final List<String> LJFF() {
        return C47261Igj.LJJIJ(HG3.LJIILL().getCurUserId());
    }

    @Override // X.AbstractC71812rp
    public final Object LJIIZILJ(Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath());
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("/sticker_store_resources/fav_sticker/");
        LIZ2.append((String) obj);
        LIZ.append(X1D.LIZIZ(LIZ2));
        List LIZJ = C64544PUu.LIZJ(new File(X1D.LIZIZ(LIZ)), FavStickerStruct.class);
        if (LIZJ != null) {
            return ORZ.LLJILJILJ(LIZJ);
        }
        return null;
    }

    @Override // X.AbstractC71812rp
    public final void LJIL(List<? extends String> list) {
        C71582rS.LIZIZ();
    }

    public final void LJJ(FavStickerStruct favStickerStruct) {
        String name;
        if (favStickerStruct == null) {
            return;
        }
        ConcurrentHashMap<KEY, DATA> concurrentHashMap = this.LIZ;
        String LJJI = LJJI();
        List<FavStickerStruct> list = (List) this.LIZ.get(LJJI());
        if (list == null) {
            list = new ArrayList<>();
        }
        ListProtector.add(list, 0, favStickerStruct);
        LJII.LJIJJ(LJJI(), list);
        concurrentHashMap.put(LJJI, list);
        Iterator it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            ((InterfaceC71562rQ) it.next()).JS(favStickerStruct);
        }
        SetSticker setSticker = favStickerStruct.getSetSticker();
        if (setSticker != null && (name = setSticker.getName()) != null) {
            String upperCase = name.toUpperCase(Locale.ROOT);
            o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            Long stickerId = favStickerStruct.getSetSticker().getStickerId();
            if (stickerId != null) {
                long longValue = stickerId.longValue();
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) C71582rS.LIZIZ;
                List list2 = (List) concurrentHashMap2.get(upperCase);
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                if (!list2.contains(Long.valueOf(longValue))) {
                    list2.add(Long.valueOf(longValue));
                }
                concurrentHashMap2.put(upperCase, list2);
            }
        }
    }

    public final Object LJJIFFI(FavStickerListResponse favStickerListResponse) {
        long j;
        boolean z;
        List list;
        List arrayList;
        Long l;
        Long videoStickerId;
        Long cursor = favStickerListResponse.getCursor();
        if (cursor != null) {
            j = cursor.longValue();
        } else {
            j = 0;
        }
        this.LJFF = j;
        Boolean hasMore = favStickerListResponse.getHasMore();
        if (hasMore != null) {
            z = hasMore.booleanValue();
        } else {
            z = false;
        }
        this.LJI = z;
        if (LJIIIZ == EnumC71552rP.REFRESH && (list = (List) this.LIZ.get(LJJI())) != null && !list.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            List<FavStickerStruct> favStickerList = favStickerListResponse.getFavStickerList();
            if (favStickerList != null) {
                Iterator<FavStickerStruct> it = favStickerList.iterator();
                while (it.hasNext()) {
                    VideoSticker videoSticker = it.next().getVideoSticker();
                    if (videoSticker != null && (videoStickerId = videoSticker.getVideoStickerId()) != null) {
                        linkedHashSet.add(new Long(videoStickerId.longValue()));
                    }
                }
            }
            ConcurrentHashMap<KEY, DATA> concurrentHashMap = this.LIZ;
            String LJJI = LJJI();
            List list2 = (List) this.LIZ.get(LJJI());
            if (list2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    VideoSticker videoSticker2 = ((FavStickerStruct) obj).getVideoSticker();
                    if (videoSticker2 != null) {
                        l = videoSticker2.getVideoStickerId();
                    } else {
                        l = null;
                    }
                    if (!ORZ.LJLJJI(l, linkedHashSet)) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = ORZ.LLJILJILJ(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            concurrentHashMap.put(LJJI, arrayList);
        }
        ConcurrentHashMap<KEY, DATA> concurrentHashMap2 = this.LIZ;
        String LJJI2 = LJJI();
        List list3 = (List) this.LIZ.get(LJJI());
        if (list3 == null) {
            list3 = new ArrayList();
        }
        List<FavStickerStruct> favStickerList2 = favStickerListResponse.getFavStickerList();
        if (favStickerList2 == null) {
            favStickerList2 = new ArrayList<>();
        }
        list3.addAll(favStickerList2);
        concurrentHashMap2.put(LJJI2, list3);
        String LJJI3 = LJJI();
        Object obj2 = this.LIZ.get(LJJI());
        if (obj2 == null) {
            obj2 = new ArrayList();
        }
        return C47261Igj.LJJIJ(new OSZ(LJJI3, obj2));
    }

    public final void LJJIII(Long l) {
        Long l2;
        if (l != null) {
            l.longValue();
            List list = (List) this.LIZ.get(LJJI());
            if (list != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    Long l3 = null;
                    if (it.hasNext()) {
                        FavStickerStruct favStickerStruct = (FavStickerStruct) it.next();
                        SetSticker setSticker = favStickerStruct.getSetSticker();
                        if (setSticker != null) {
                            l2 = setSticker.getStickerId();
                        } else {
                            l2 = null;
                        }
                        if (o.LJ(l2, l)) {
                            break;
                        }
                        VideoSticker videoSticker = favStickerStruct.getVideoSticker();
                        if (videoSticker != null) {
                            l3 = videoSticker.getVideoStickerId();
                        }
                        if (o.LJ(l3, l)) {
                            break;
                        } else {
                            i++;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                Integer valueOf = Integer.valueOf(i);
                if (valueOf.intValue() >= 0) {
                    int intValue = valueOf.intValue();
                    List list2 = (List) LJII.LIZ.get(LJJI());
                    if (list2 != null) {
                        ListProtector.remove(list2, intValue);
                    }
                }
            }
            List<FavStickerStruct> list3 = (List) this.LIZ.get(LJJI());
            if (list3 != null) {
                LJII.LJIJJ(LJJI(), list3);
            }
            Iterator it2 = this.LIZLLL.iterator();
            while (it2.hasNext()) {
                ((InterfaceC71562rQ) it2.next()).BO(l.longValue());
            }
            C71582rS.LIZIZ();
        }
    }

    @Override // X.AbstractC71812rp
    public final InterfaceC71482rI LJI(List keyList, final C84654XKg c84654XKg) {
        o.LJIIIZ(keyList, "keyList");
        return new InterfaceC71562rQ() { // from class: X.2rO
            @Override // X.InterfaceC71562rQ
            public final void BO(long j) {
            }

            @Override // X.InterfaceC71562rQ
            public final void JS(FavStickerStruct sticker) {
                o.LJIIIZ(sticker, "sticker");
            }

            @Override // X.InterfaceC71562rQ
            public final void ih0() {
                InterfaceC67352kd<C76800UCe> interfaceC67352kd = c84654XKg;
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                interfaceC67352kd.resumeWith(c76800UCe);
                C71512rL.LJII.LJIJ(this);
            }
        };
    }

    @Override // X.AbstractC71812rp
    public final /* bridge */ /* synthetic */ Object LJII(FavStickerListResponse favStickerListResponse, InterfaceC67352kd<? super List<? extends OSZ<? extends String, ? extends List<FavStickerStruct>>>> interfaceC67352kd) {
        return LJJIFFI(favStickerListResponse);
    }

    @Override // X.AbstractC71812rp
    public final void LJIILJJIL(List<? extends String> keys, InterfaceC71562rQ interfaceC71562rQ) {
        o.LJIIIZ(keys, "keys");
        interfaceC71562rQ.ih0();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.AbstractC71812rp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.util.List<? extends java.lang.String> r12, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.C71502rK
            if (r0 == 0) goto L1f
            r10 = r13
            X.2rK r10 = (X.C71502rK) r10
            int r2 = r10.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r10.LJLJI = r2
        L12:
            java.lang.Object r1 = r10.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r10.LJLJI
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L25
            goto L4b
        L1f:
            X.2rK r10 = new X.2rK
            r10.<init>(r11, r13)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            int r1 = r11.LJ
            r0 = 3
            if (r1 <= r0) goto L36
            return r3
        L36:
            X.2rP r0 = X.EnumC71552rP.REFRESH     // Catch: java.lang.Exception -> L52
            X.C71512rL.LJIIIZ = r0     // Catch: java.lang.Exception -> L52
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r5 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> L52
            r10.LJLJI = r2     // Catch: java.lang.Exception -> L52
            r6 = 0
            r8 = 100
            java.lang.Object r1 = r5.getFavStickerList(r6, r8, r10)     // Catch: java.lang.Exception -> L52
            if (r1 != r4) goto L4e
            return r4
        L4b:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L52
        L4e:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse r1 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse) r1     // Catch: java.lang.Exception -> L52
            r3 = r1
            goto L58
        L52:
            r1 = move-exception
            java.lang.String r0 = "FavStickerListManager"
            X.C34B.LJ(r0, r1)
        L58:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71512rL.LJIILLIIL(java.util.List, X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC71812rp
    public final void LJIJJLI(String key, List<FavStickerStruct> result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        this.LIZ.put(key, result);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(5:18|19|(2:21|(1:23))|13|14))(2:24|25))(3:33|34|(2:36|37))|26|27|(2:29|(1:31))|19|(0)|13|14))|40|6|7|(0)(0)|26|27|(0)|19|(0)|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0055, code lost:
    
        r2 = X.C141335gf.LIZ(r0);
        X.C3C5.m7constructorimpl(r2);
        r14 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r14v6, types: [X.2hx] */
    /* JADX WARN: Type inference failed for: r14v8, types: [X.2hx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.C72452sr r14, X.InterfaceC67352kd r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof X.C71532rN
            if (r0 == 0) goto L9f
            r12 = r15
            X.2rN r12 = (X.C71532rN) r12
            int r2 = r12.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r12.LJLJJL = r2
        L12:
            java.lang.Object r2 = r12.LJLJI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r12.LJLJJL
            r5 = 3
            r6 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L2f
            if (r0 == r1) goto L2a
            if (r0 == r6) goto L7b
            if (r0 != r5) goto La6
            X.C141335gf.LIZJ(r2)
        L27:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            java.lang.Object r14 = r12.LJLIL
            X.2hx r14 = (X.InterfaceC65692hx) r14
            goto L4b
        L2f:
            X.C141335gf.LIZJ(r2)
            X.2rP r0 = X.EnumC71552rP.LOAD_MORE     // Catch: java.lang.Throwable -> L54
            X.C71512rL.LJIIIZ = r0     // Catch: java.lang.Throwable -> L54
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r7 = X.C74722wW.LIZ()     // Catch: java.lang.Throwable -> L54
            X.2rL r0 = X.C71512rL.LJII     // Catch: java.lang.Throwable -> L54
            long r8 = r0.LJFF     // Catch: java.lang.Throwable -> L54
            r12.LJLIL = r14     // Catch: java.lang.Throwable -> L54
            r12.LJLJJL = r1     // Catch: java.lang.Throwable -> L54
            r10 = 100
            java.lang.Object r2 = r7.getFavStickerList(r8, r10, r12)     // Catch: java.lang.Throwable -> L54
            if (r2 != r4) goto L4e
            goto Lae
        L4b:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L54
        L4e:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse r2 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse) r2     // Catch: java.lang.Throwable -> L54
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L54
            goto L5c
        L54:
            r0 = move-exception
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L5c:
            r7 = r2
            boolean r0 = X.C3C5.m13isSuccessimpl(r2)
            if (r0 == 0) goto L84
            r2 = r7
            com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse r2 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.FavStickerListResponse) r2
            X.UtN r1 = X.C36636EZk.LIZ
            X.2rM r0 = new X.2rM
            r0.<init>(r2, r14, r3)
            r12.LJLIL = r14
            r12.LJLILLLLZI = r7
            r12.LJLJJL = r6
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r12)
            if (r0 != r4) goto L84
            return r4
        L7b:
            java.lang.Object r7 = r12.LJLILLLLZI
            java.lang.Object r14 = r12.LJLIL
            X.2hx r14 = (X.InterfaceC65692hx) r14
            X.C141335gf.LIZJ(r2)
        L84:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r7)
            if (r2 == 0) goto L27
        L8b:
            X.UtN r1 = X.C36636EZk.LIZ
            X.2hw r0 = new X.2hw
            r0.<init>(r2, r14, r3)
            r12.LJLIL = r7
            r12.LJLILLLLZI = r3
            r12.LJLJJL = r5
            java.lang.Object r0 = X.XKX.LJI(r1, r0, r12)
            if (r0 != r4) goto L27
            return r4
        L9f:
            X.2rN r12 = new X.2rN
            r12.<init>(r13, r15)
            goto L12
        La6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lae:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71512rL.LJJII(X.2sr, X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC71812rp
    /* renamed from: LJJIIJ, reason: merged with bridge method [inline-methods] */
    public final void LJIJJ(String key, List<FavStickerStruct> result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        XKX.LIZLLL(this.LIZJ, null, null, new C71362r6(key, result, null), 3);
    }
}
