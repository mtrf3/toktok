package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel;

import X.A2F;
import X.A2G;
import X.AbstractC71812rp;
import X.C32I;
import X.C33Q;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C67372kf;
import X.C67382kg;
import X.C67392kh;
import X.C67402ki;
import X.C71572rR;
import X.C71882rw;
import X.C72412sn;
import X.C78613UtF;
import X.C86793at;
import X.C86803au;
import X.C86903b4;
import X.C86913b5;
import X.C87013bF;
import X.C87503c2;
import X.C88033ct;
import X.C88873eF;
import X.C8HZ;
import X.EnumC71652rZ;
import X.EnumC71912rz;
import X.EnumC87003bE;
import X.EnumC87143bS;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC71602rU;
import X.InterfaceC86893b3;
import X.SY4;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetContentViewModel extends AssemListViewModel<C87503c2, C72412sn, Long> implements InterfaceC71602rU {
    public boolean LJLILLLLZI;
    public final boolean LJLIL = false;
    public final List<StickerSetInfo> LJLJI = new ArrayList();
    public final C55749LuL LJLJJI = new C55749LuL(C47704Ins.LJFF(this, C88033ct.class, "sticker_store_sticker_set_content_config"), true);

    /* JADX WARN: Multi-variable type inference failed */
    public final void iv0() {
        qv0(false);
        if (this.LJLIL) {
            InterfaceC86893b3 interfaceC86893b3 = ((C87503c2) getState()).LJLILLLLZI;
            C86913b5 c86913b5 = C86913b5.LIZ;
            if (o.LJ(interfaceC86893b3, c86913b5)) {
                rv0(C86903b4.LIZ);
                return;
            } else {
                if (!o.LJ(interfaceC86893b3, C86903b4.LIZ)) {
                    return;
                }
                rv0(c86913b5);
                return;
            }
        }
        InterfaceC86893b3 interfaceC86893b32 = ((C87503c2) getState()).LJLILLLLZI;
        if (interfaceC86893b32 instanceof C86913b5) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C67382kg(this, null), 3);
        } else {
            if (!(interfaceC86893b32 instanceof C86903b4)) {
                return;
            }
            XKX.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C67392kh(this, null), 3);
        }
    }

    @Override // X.InterfaceC71602rU
    public final void kI(StickerSetInfo stickerSetInfo) {
    }

    public static List nv0() {
        C71882rw LJIIL;
        LJIIL = r0.LJIIL(C71572rR.LJII.LJ());
        List list = (List) LJIIL.LIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C72412sn((StickerSetInfo) it.next()));
            }
            return arrayList;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87503c2(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C71572rR.LJII.LIZ(this);
    }

    public final C88033ct pv0() {
        return (C88033ct) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC71602rU
    public final void Ge() {
        C88033ct pv0 = pv0();
        if (pv0 != null && pv0.LJLIL == EnumC87143bS.ADDED.getType()) {
            withState(new AqS132S0200000_1(nv0(), (List<C72412sn>) this, (StickerSetContentViewModel) 15));
        }
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        qv0(true);
        C71572rR.LJII.LJIJ(this);
    }

    public final String ov0() {
        Integer num;
        C88033ct pv0 = pv0();
        if (pv0 != null) {
            num = Integer.valueOf(pv0.LJLILLLLZI);
        } else {
            num = null;
        }
        int type = EnumC87003bE.STICKER_STORE.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC87003bE.PERSONAL_PROFILE_NOT_FROM_STICKER_STORE.getType();
            if (num == null || num.intValue() != type2) {
                int type3 = EnumC87003bE.PERSONAL_PROFILE_FROM_STICKER_STORE.getType();
                if (num == null || num.intValue() != type3) {
                    int type4 = EnumC87003bE.OTHERS_PROFILE_NOT_FROM_STICKER_STORE.getType();
                    if (num == null || num.intValue() != type4) {
                        int type5 = EnumC87003bE.OTHERS_PROFILE_FROM_STICKER_STORE.getType();
                        if (num == null || num.intValue() != type5) {
                            return null;
                        }
                    }
                    return "others_homepage";
                }
            }
            return "personal_homepage";
        }
        return "store_sticker_set_page";
    }

    @Override // X.InterfaceC71602rU
    public final void Cs0(StickerSetInfo info) {
        o.LJIIIZ(info, "info");
        Long setId = info.getSetId();
        if (setId != null) {
            long longValue = setId.longValue();
            if (C87013bF.LIZ()) {
                C86793at.LIZ(EnumC71652rZ.STORE.getScene(), Long.valueOf(longValue));
            }
            C88033ct pv0 = pv0();
            int i = 0;
            if (pv0 != null && pv0.LJLIL == EnumC87143bS.ADDED.getType()) {
                listAddItemAt(0, (int) new C72412sn(info));
                return;
            }
            List<ITEM> listGetAll = listGetAll();
            if (listGetAll == 0) {
                return;
            }
            for (Object obj : listGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    Long setId2 = ((C72412sn) obj).LJLIL.getSetId();
                    if (setId2 == null || setId2.longValue() != longValue) {
                        i = i2;
                    } else {
                        listSetItemAt(i, (int) C72412sn.L(info));
                        return;
                    }
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC71602rU
    public final void hi(List<StickerSetInfo> list) {
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<StickerSetInfo> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getSetId());
        }
        C88033ct pv0 = pv0();
        int i = 0;
        if (pv0 != null && pv0.LJLIL == EnumC87143bS.ADDED.getType()) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<StickerSetInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new C72412sn(it2.next()));
            }
            listSetItems(arrayList2);
            return;
        }
        List<ITEM> listGetAll = listGetAll();
        if (listGetAll != 0) {
            for (Object obj : listGetAll) {
                int i2 = i + 1;
                if (i >= 0) {
                    C72412sn c72412sn = (C72412sn) obj;
                    if (!arrayList.contains(c72412sn.LJLIL.getSetId())) {
                        Integer setStatus = c72412sn.LJLIL.getSetStatus();
                        int status = EnumC71912rz.ADDED.getStatus();
                        if (setStatus != null && setStatus.intValue() == status) {
                            listSetItemAt(i, (int) C72412sn.L(StickerSetInfo.copy$default(c72412sn.LJLIL, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.IN_STORE.getStatus()), null, null, null, null, 7935, null)));
                        }
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C72272sZ
            if (r0 == 0) goto L45
            r5 = r7
            X.2sZ r5 = (X.C72272sZ) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4b
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.3b5 r0 = X.C86913b5.LIZ
            r1.rv0(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            X.C141335gf.LIZJ(r4)
            X.3b0 r1 = new X.3b0
            r0 = 0
            r1.<init>(r0)
            r6.rv0(r1)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r3) goto L43
            return r3
        L43:
            r1 = r6
            goto L22
        L45:
            X.2sZ r5 = new X.2sZ
            r5.<init>(r6, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel.hv0(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(X.InterfaceC67352kd<? super X.C76800UCe> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C72282sa
            if (r0 == 0) goto L45
            r5 = r7
            X.2sa r5 = (X.C72282sa) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 != r2) goto L4b
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel r1 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            X.3b4 r0 = X.C86903b4.LIZ
            r1.rv0(r0)
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L2a:
            X.C141335gf.LIZJ(r4)
            X.3b1 r1 = new X.3b1
            r0 = 0
            r1.<init>(r0)
            r6.rv0(r1)
            r5.LJLIL = r6
            r5.LJLJJI = r2
            r0 = 300(0x12c, double:1.48E-321)
            java.lang.Object r0 = X.C1JD.LIZJ(r0, r5)
            if (r0 != r3) goto L43
            return r3
        L43:
            r1 = r6
            goto L22
        L45:
            X.2sa r5 = new X.2sa
            r5.<init>(r6, r7)
            goto L12
        L4b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel.jv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C72412sn> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 91));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Integer num;
        String str;
        C88033ct pv0 = pv0();
        Long l = null;
        if (pv0 != null) {
            num = new Integer(pv0.LJLIL);
        } else {
            num = null;
        }
        int type = EnumC87143bS.ADDED.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC87143bS.ALL.getType();
            if (num == null || num.intValue() != type2) {
                int type3 = EnumC87143bS.SET_PROFILE.getType();
                if (num == null || num.intValue() != type3) {
                    return A2F.LIZIZ(A2G.LIZ);
                }
                C88033ct pv02 = pv0();
                if (pv02 != null && (str = pv02.LJLJI) != null) {
                    l = new Long(CastLongProtector.parseLong(str));
                }
                return kv0(l, 0L, 15L, EnumC71652rZ.PROFILE_TAB.getScene(), false, interfaceC67352kd);
            }
            if (C87013bF.LIZ()) {
                return mv0(0L, EnumC71652rZ.STORE.getScene(), interfaceC67352kd);
            }
            return kv0(null, 0L, 15L, EnumC71652rZ.STORE.getScene(), false, interfaceC67352kd);
        }
        List nv0 = nv0();
        if (nv0 == null) {
            AbstractC71812rp.LJIIJJI(C71572rR.LJII, null, false, 3);
        }
        A2F a2f = A2G.LIZ;
        if (nv0 == null) {
            nv0 = C61878OQg.INSTANCE;
        }
        a2f.getClass();
        return A2F.LIZ(nv0);
    }

    public final void qv0(boolean z) {
        InterfaceC70422pa assemVMScope;
        if (this.LJLILLLLZI) {
            this.LJLILLLLZI = false;
            if (z) {
                assemVMScope = C71572rR.LJII.LIZJ;
            } else {
                assemVMScope = getAssemVMScope();
            }
            List<ITEM> listGetAll = listGetAll();
            if (listGetAll != 0) {
                ArrayList arrayList = new ArrayList(C32I.LJJL(listGetAll, 10));
                Iterator it = listGetAll.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C72412sn) it.next()).LJLIL);
                }
                XKX.LIZLLL(assemVMScope, C78613UtF.LIZJ, null, new C67372kf(this, arrayList, null), 2);
            }
        }
    }

    public final void rv0(InterfaceC86893b3 interfaceC86893b3) {
        setStateImmediate(new AqS167S0100000_1(interfaceC86893b3, 92));
    }

    public final void gv0(Long l, SY4 sy4) {
        if (l != null) {
            l.longValue();
            List<ITEM> listGetAll = listGetAll();
            if (listGetAll != 0) {
                int i = 0;
                for (Object obj : listGetAll) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        C72412sn c72412sn = (C72412sn) obj;
                        if (o.LJ(c72412sn.LJLIL.getSetId(), l)) {
                            listSetItemAt(i, (int) C72412sn.L(StickerSetInfo.copy$default(c72412sn.LJLIL, null, null, null, null, null, null, null, null, Integer.valueOf(EnumC71912rz.LOADING.getStatus()), null, null, null, null, 7935, null)));
                            XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new C67402ki(l, c72412sn, sy4, this, i, null), 2);
                            return;
                        }
                        i = i2;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Integer num;
        String str;
        long longValue = l.longValue();
        C88033ct pv0 = pv0();
        Long l2 = null;
        if (pv0 != null) {
            num = new Integer(pv0.LJLIL);
        } else {
            num = null;
        }
        int type = EnumC87143bS.ALL.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC87143bS.SET_PROFILE.getType();
            if (num == null || num.intValue() != type2) {
                return A2F.LIZIZ(A2G.LIZ);
            }
            C88033ct pv02 = pv0();
            if (pv02 != null && (str = pv02.LJLJI) != null) {
                l2 = new Long(CastLongProtector.parseLong(str));
            }
            return kv0(l2, longValue, 15L, EnumC71652rZ.PROFILE_TAB.getScene(), false, interfaceC67352kd);
        }
        if (C87013bF.LIZ()) {
            return mv0(longValue, EnumC71652rZ.STORE.getScene(), interfaceC67352kd);
        }
        return kv0(null, longValue, 15L, EnumC71652rZ.STORE.getScene(), false, interfaceC67352kd);
    }

    public final Object mv0(long j, int i, InterfaceC67352kd interfaceC67352kd) {
        Map<Integer, C86803au> map = C86793at.LIZ;
        C86803au c86803au = (C86803au) ((LinkedHashMap) map).get(new Integer(i));
        if (c86803au == null) {
            return kv0(null, j, 15L, i, true, interfaceC67352kd);
        }
        if (C88873eF.LIZIZ(c86803au.LJLIL, NetworkUtils.getServerTimeMills()) >= 1) {
            map.remove(Integer.valueOf(i));
            return kv0(null, j, 15L, i, true, interfaceC67352kd);
        }
        if ((!c86803au.LJLJJI.isEmpty()) && j <= c86803au.LJLJJI.size()) {
            if (c86803au.LJLJI) {
                return A2F.LJ(A2G.LIZ, null, new Long(c86803au.LJLILLLLZI), c86803au.LJLJJI, 1);
            }
            A2F a2f = A2G.LIZ;
            List<C72412sn> list = c86803au.LJLJJI;
            a2f.getClass();
            return A2F.LIZ(list);
        }
        return kv0(null, j, 15L, i, true, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d A[Catch: Exception -> 0x0186, TryCatch #0 {Exception -> 0x0186, blocks: (B:11:0x0054, B:12:0x0057, B:14:0x005d, B:17:0x006c, B:19:0x0075, B:21:0x007b, B:22:0x0089, B:24:0x008f, B:26:0x0097, B:28:0x00aa, B:30:0x00b0, B:34:0x00d7, B:35:0x00da, B:38:0x013a, B:40:0x0140, B:41:0x0144, B:43:0x014a, B:44:0x014e, B:47:0x0151, B:49:0x015d, B:51:0x016d, B:53:0x00db, B:55:0x00ea, B:57:0x00f0, B:58:0x00fd, B:60:0x0103, B:62:0x0177, B:67:0x003b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[Catch: Exception -> 0x0186, TryCatch #0 {Exception -> 0x0186, blocks: (B:11:0x0054, B:12:0x0057, B:14:0x005d, B:17:0x006c, B:19:0x0075, B:21:0x007b, B:22:0x0089, B:24:0x008f, B:26:0x0097, B:28:0x00aa, B:30:0x00b0, B:34:0x00d7, B:35:0x00da, B:38:0x013a, B:40:0x0140, B:41:0x0144, B:43:0x014a, B:44:0x014e, B:47:0x0151, B:49:0x015d, B:51:0x016d, B:53:0x00db, B:55:0x00ea, B:57:0x00f0, B:58:0x00fd, B:60:0x0103, B:62:0x0177, B:67:0x003b), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kv0(java.lang.Long r28, long r29, long r31, int r33, boolean r34, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r35) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel.kv0(java.lang.Long, long, long, int, boolean, X.2kd):java.lang.Object");
    }
}
