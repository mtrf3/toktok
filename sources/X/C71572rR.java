package X;

import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetListResponse;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.IMStickerMeta;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.2rR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71572rR extends AbstractC71812rp<List<StickerSetInfo>, StickerSetListResponse, String, InterfaceC71602rU> {
    public static final C71572rR LJII = new C71572rR();

    @Override // X.AbstractC71812rp
    public final String LJIIIIZZ() {
        return "added_sticker_set";
    }

    @Override // X.AbstractC71812rp
    public final String LJIIIZ(List<? extends String> keys) {
        o.LJIIIZ(keys, "keys");
        return null;
    }

    @Override // X.AbstractC71812rp
    public final void LJIL(List<? extends String> list) {
    }

    @Override // X.AbstractC71812rp
    public final void LJIILL() {
        List<StickerSetInfo> LLILLL;
        Long setId;
        Iterable iterable = (Iterable) this.LIZ.get(LJJI());
        if (iterable != null && (LLILLL = ORZ.LLILLL(iterable, 10)) != null) {
            ArrayList arrayList = new ArrayList();
            for (StickerSetInfo stickerSetInfo : LLILLL) {
                if (stickerSetInfo != null && (setId = stickerSetInfo.getSetId()) != null) {
                    arrayList.add(setId);
                }
            }
            C71442rE.LJII.LJIIJ(arrayList, true);
        }
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
        LIZ2.append("/sticker_store_resources/added_sticker_set/");
        LIZ2.append((String) obj);
        LIZ.append(X1D.LIZIZ(LIZ2));
        List LIZJ = C64544PUu.LIZJ(new File(X1D.LIZIZ(LIZ)), StickerSetInfo.class);
        if (LIZJ != null) {
            return ORZ.LLJILJILJ(LIZJ);
        }
        return null;
    }

    public final void LJJ(StickerSetInfo info) {
        List<SetSticker> stickers;
        StickerSetInfo stickerSetInfo;
        o.LJIIIZ(info, "info");
        StickerSetInfo addedInfo = StickerSetInfo.copy$default(info, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.ADDED.getStatus()), null, null, null, null, 7935, null);
        ConcurrentHashMap<KEY, DATA> concurrentHashMap = this.LIZ;
        String LJJI = LJJI();
        List<StickerSetInfo> list = (List) this.LIZ.get(LJJI());
        if (list == null) {
            list = new ArrayList<>();
        }
        ListProtector.add(list, 0, addedInfo);
        LJII.LJIJJ(LJJI(), list);
        concurrentHashMap.put(LJJI, list);
        Iterator it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            ((InterfaceC71602rU) it.next()).Cs0(addedInfo);
        }
        C71442rE c71442rE = C71442rE.LJII;
        c71442rE.getClass();
        o.LJIIIZ(addedInfo, "addedInfo");
        Long setId = addedInfo.getSetId();
        if (setId != null) {
            long longValue = setId.longValue();
            StickerSet stickerSet = (StickerSet) c71442rE.LIZ.get(Long.valueOf(longValue));
            if (stickerSet != null) {
                ConcurrentHashMap<KEY, DATA> concurrentHashMap2 = c71442rE.LIZ;
                Long valueOf = Long.valueOf(longValue);
                StickerSetInfo info2 = stickerSet.getInfo();
                if (info2 != null) {
                    stickerSetInfo = StickerSetInfo.copy$default(info2, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.ADDED.getStatus()), null, null, null, null, 7935, null);
                } else {
                    stickerSetInfo = null;
                }
                StickerSet copy$default = StickerSet.copy$default(stickerSet, stickerSetInfo, null, 2, null);
                c71442rE.LJJI(longValue, copy$default);
                concurrentHashMap2.put(valueOf, copy$default);
            }
        }
        Long setId2 = info.getSetId();
        if (setId2 != null) {
            setId2.longValue();
            StickerSet stickerSet2 = c71442rE.LJIIL(setId2).LIZ;
            if (stickerSet2 != null && (stickers = stickerSet2.getStickers()) != null) {
                for (SetSticker setSticker : stickers) {
                    String name = setSticker.getName();
                    if (name != null) {
                        String upperCase = name.toUpperCase(Locale.ROOT);
                        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                        Long stickerId = setSticker.getStickerId();
                        if (stickerId != null) {
                            OSZ osz = new OSZ(setId2, Long.valueOf(stickerId.longValue()));
                            ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) C71582rS.LIZJ;
                            List list2 = (List) concurrentHashMap3.get(upperCase);
                            if (list2 == null) {
                                list2 = new ArrayList();
                            }
                            if (!list2.contains(osz)) {
                                list2.add(osz);
                            }
                            concurrentHashMap3.put(upperCase, list2);
                        }
                    }
                }
            }
        }
    }

    @Override // X.AbstractC71812rp
    public final InterfaceC71482rI LJI(List keyList, final C84654XKg c84654XKg) {
        o.LJIIIZ(keyList, "keyList");
        return new InterfaceC71602rU() { // from class: X.2rT
            @Override // X.InterfaceC71602rU
            public final void Cs0(StickerSetInfo info) {
                o.LJIIIZ(info, "info");
            }

            @Override // X.InterfaceC71602rU
            public final void hi(List<StickerSetInfo> list) {
            }

            @Override // X.InterfaceC71602rU
            public final void kI(StickerSetInfo stickerSetInfo) {
            }

            @Override // X.InterfaceC71602rU
            public final void Ge() {
                InterfaceC67352kd<C76800UCe> interfaceC67352kd = c84654XKg;
                C76800UCe c76800UCe = C76800UCe.LIZ;
                C3C5.m7constructorimpl(c76800UCe);
                interfaceC67352kd.resumeWith(c76800UCe);
                C71572rR.LJII.LJIJ(this);
            }
        };
    }

    @Override // X.AbstractC71812rp
    public final Object LJII(StickerSetListResponse stickerSetListResponse, InterfaceC67352kd<? super List<? extends OSZ<? extends String, ? extends List<StickerSetInfo>>>> interfaceC67352kd) {
        Object arrayList;
        Object arrayList2;
        IMStickerMeta iMStickerMeta;
        StickerSetListResponse stickerSetListResponse2 = stickerSetListResponse;
        if (C88963eO.LJFF()) {
            String LJJI = LJJI();
            List<StickerSetInfo> stickerSetInfoList = stickerSetListResponse2.getStickerSetInfoList();
            if (stickerSetInfoList != null) {
                ArrayList arrayList3 = new ArrayList(C32I.LJJL(stickerSetInfoList, 10));
                int i = 0;
                for (StickerSetInfo stickerSetInfo : stickerSetInfoList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        StickerSetInfo stickerSetInfo2 = stickerSetInfo;
                        Integer num = new Integer(EnumC71912rz.ADDED.getStatus());
                        List<IMStickerMeta> stickerMeta = stickerSetListResponse2.getStickerMeta();
                        if (stickerMeta != null) {
                            iMStickerMeta = (IMStickerMeta) ORZ.LJLLLLLL(i, stickerMeta);
                        } else {
                            iMStickerMeta = null;
                        }
                        arrayList3.add(StickerSetInfo.copy$default(stickerSetInfo2, null, null, null, null, null, null, null, null, num, null, null, null, iMStickerMeta, 3839, null));
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                arrayList2 = ORZ.LLJILJILJ(arrayList3);
            } else {
                arrayList2 = new ArrayList();
            }
            return C47261Igj.LJJIJ(new OSZ(LJJI, arrayList2));
        }
        String LJJI2 = LJJI();
        List<StickerSetInfo> stickerSetInfoList2 = stickerSetListResponse2.getStickerSetInfoList();
        if (stickerSetInfoList2 != null) {
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(stickerSetInfoList2, 10));
            Iterator<StickerSetInfo> it = stickerSetInfoList2.iterator();
            while (it.hasNext()) {
                arrayList4.add(StickerSetInfo.copy$default(it.next(), null, null, null, null, null, null, null, null, new Integer(EnumC71912rz.ADDED.getStatus()), null, null, null, null, 7935, null));
            }
            arrayList = ORZ.LLJILJILJ(arrayList4);
        } else {
            arrayList = new ArrayList();
        }
        return C47261Igj.LJJIJ(new OSZ(LJJI2, arrayList));
    }

    @Override // X.AbstractC71812rp
    public final void LJIILJJIL(List<? extends String> keys, InterfaceC71602rU interfaceC71602rU) {
        o.LJIIIZ(keys, "keys");
        interfaceC71602rU.Ge();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // X.AbstractC71812rp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(java.util.List<? extends java.lang.String> r13, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetListResponse> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C71492rJ
            if (r0 == 0) goto L1f
            r11 = r14
            X.2rJ r11 = (X.C71492rJ) r11
            int r2 = r11.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r11.LJLJI = r2
        L12:
            java.lang.Object r1 = r11.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r11.LJLJI
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L25
            goto L4d
        L1f:
            X.2rJ r11 = new X.2rJ
            r11.<init>(r12, r14)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r1)
            int r1 = r12.LJ
            r0 = 3
            if (r1 <= r0) goto L36
            return r5
        L36:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerStoreApi r4 = X.C74722wW.LIZ()     // Catch: java.lang.Exception -> L54
            r6 = 0
            r8 = 100
            X.2rZ r0 = X.EnumC71652rZ.ADDED_LIST     // Catch: java.lang.Exception -> L54
            int r10 = r0.getScene()     // Catch: java.lang.Exception -> L54
            r11.LJLJI = r2     // Catch: java.lang.Exception -> L54
            java.lang.Object r1 = r4.getStickerSetList(r5, r6, r8, r10, r11)     // Catch: java.lang.Exception -> L54
            if (r1 != r3) goto L50
            return r3
        L4d:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L54
        L50:
            com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetListResponse r1 = (com.ss.android.ugc.aweme.emoji.stickerstore.api.StickerSetListResponse) r1     // Catch: java.lang.Exception -> L54
            r5 = r1
            goto L5a
        L54:
            r1 = move-exception
            java.lang.String r0 = "AddedStickerSetListManager"
            X.C34B.LJ(r0, r1)
        L5a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71572rR.LJIILLIIL(java.util.List, X.2kd):java.lang.Object");
    }

    @Override // X.AbstractC71812rp
    public final void LJIJJLI(String key, List<StickerSetInfo> result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        this.LIZ.put(key, result);
    }

    @Override // X.AbstractC71812rp
    /* renamed from: LJJIFFI, reason: merged with bridge method [inline-methods] */
    public final void LJIJJ(String key, List<StickerSetInfo> result) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(result, "result");
        XKX.LIZLLL(this.LIZJ, null, null, new C71372r7(key, result, null), 3);
    }

    public final void LJJII(StickerSetInfo stickerSetInfo, boolean z) {
        Object obj;
        int i;
        CopyOnWriteArrayList<OBSERVER> copyOnWriteArrayList = this.LIZLLL;
        ListIterator listIterator = copyOnWriteArrayList.listIterator(copyOnWriteArrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                Object obj2 = (InterfaceC71602rU) obj;
                if ((obj2 instanceof AbstractC105384Bq) && ((AbstractC105384Bq) obj2).LJLILLLLZI == 1) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC71602rU interfaceC71602rU = (InterfaceC71602rU) obj;
        if (interfaceC71602rU != null) {
            interfaceC71602rU.kI(stickerSetInfo);
        } else {
            C2U8.LIZ(new C71432rD(stickerSetInfo));
        }
        CopyOnWriteArrayList<OBSERVER> copyOnWriteArrayList2 = this.LIZLLL;
        ListIterator listIterator2 = copyOnWriteArrayList2.listIterator(copyOnWriteArrayList2.size());
        while (true) {
            if (listIterator2.hasPrevious()) {
                if (listIterator2.previous() instanceof Fragment) {
                    i = listIterator2.nextIndex();
                    if (i != -1) {
                        ((InterfaceC71602rU) this.LIZLLL.get(i)).kI(stickerSetInfo);
                    }
                }
            } else {
                i = -1;
                break;
            }
        }
        if (z) {
            for (int i2 = i - 1; -1 < i2; i2--) {
                if (this.LIZLLL.get(i2) instanceof Fragment) {
                    ((InterfaceC71602rU) this.LIZLLL.get(i2)).kI(stickerSetInfo);
                    return;
                }
            }
        }
    }
}
