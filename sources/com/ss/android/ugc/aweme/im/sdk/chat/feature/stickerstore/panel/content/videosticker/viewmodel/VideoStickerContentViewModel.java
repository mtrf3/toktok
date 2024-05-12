package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel;

import X.A2F;
import X.A2G;
import X.C32I;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C65672hv;
import X.C65952iN;
import X.C76800UCe;
import X.C78613UtF;
import X.C84683Ua;
import X.C84753Uh;
import X.C87013bF;
import X.C87083bM;
import X.C87113bP;
import X.C87123bQ;
import X.C87483c0;
import X.C88033ct;
import X.C88873eF;
import X.C8HZ;
import X.EnumC87133bR;
import X.EnumC87143bS;
import X.InterfaceC57784Mm4;
import X.InterfaceC65784Pro;
import X.InterfaceC67352kd;
import X.ORZ;
import X.XKX;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.common.util.NetworkUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VideoStickerContentViewModel extends AssemListViewModel<C87483c0, C87123bQ, Long> {
    public static final /* synthetic */ int LJLJL = 0;
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C88033ct.class, "sticker_store_video_sticker_content_config"), true);
    public boolean LJLILLLLZI = true;
    public final HashSet<String> LJLJI = new HashSet<>();
    public final HashSet<String> LJLJJI = new HashSet<>();
    public int LJLJJL;
    public boolean LJLJJLL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87483c0(0);
    }

    public final void gv0() {
        if (this.LJLJJI.isEmpty()) {
            return;
        }
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C65952iN(this, null), 2);
    }

    public final C88033ct lv0() {
        return (C88033ct) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C87123bQ> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 94));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Integer num;
        String str;
        C88033ct lv0 = lv0();
        if (lv0 != null) {
            num = new Integer(lv0.LJLIL);
        } else {
            num = null;
        }
        EnumC87143bS enumC87143bS = EnumC87143bS.TOP;
        int type = enumC87143bS.getType();
        if (num == null || num.intValue() != type) {
            EnumC87143bS enumC87143bS2 = EnumC87143bS.TRENDING_VIDEOS;
            int type2 = enumC87143bS2.getType();
            if (num == null || num.intValue() != type2) {
                EnumC87143bS enumC87143bS3 = EnumC87143bS.NEW;
                int type3 = enumC87143bS3.getType();
                if (num == null || num.intValue() != type3) {
                    int type4 = EnumC87143bS.SET_PROFILE.getType();
                    if (num == null || num.intValue() != type4) {
                        return A2F.LIZIZ(A2G.LIZ);
                    }
                    C88033ct lv02 = lv0();
                    if (lv02 == null || (str = lv02.LJLJI) == null) {
                        str = "";
                    }
                    return jv0(str, 24L, 0L, interfaceC67352kd);
                }
                C84683Ua.LJFF.LIZIZ(new C84753Uh(new Integer(enumC87143bS3.getType())), true);
                if (C87013bF.LIZ()) {
                    return kv0(EnumC87133bR.NEW_VIDEOS.getScene(), 24L, 0L, interfaceC67352kd);
                }
                return hv0(EnumC87133bR.NEW_VIDEOS.getScene(), 24L, 0L, false, interfaceC67352kd);
            }
            C84683Ua.LJFF.LIZIZ(new C84753Uh(new Integer(enumC87143bS2.getType())), true);
            if (C87013bF.LIZ()) {
                return kv0(EnumC87133bR.TRENDING.getScene(), 24L, 0L, interfaceC67352kd);
            }
            return hv0(EnumC87133bR.TRENDING.getScene(), 24L, 0L, false, interfaceC67352kd);
        }
        C84683Ua.LJFF.LIZIZ(new C84753Uh(new Integer(enumC87143bS.getType())), true);
        if (C87013bF.LIZ()) {
            return kv0(EnumC87133bR.TOP.getScene(), 24L, 0L, interfaceC67352kd);
        }
        return hv0(EnumC87133bR.TOP.getScene(), 24L, 0L, false, interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Integer num;
        String str;
        long longValue = l.longValue();
        C88033ct lv0 = lv0();
        if (lv0 != null) {
            num = new Integer(lv0.LJLIL);
        } else {
            num = null;
        }
        int type = EnumC87143bS.TOP.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC87143bS.TRENDING_VIDEOS.getType();
            if (num == null || num.intValue() != type2) {
                int type3 = EnumC87143bS.NEW.getType();
                if (num == null || num.intValue() != type3) {
                    int type4 = EnumC87143bS.SET_PROFILE.getType();
                    if (num == null || num.intValue() != type4) {
                        return A2F.LIZIZ(A2G.LIZ);
                    }
                    C88033ct lv02 = lv0();
                    if (lv02 == null || (str = lv02.LJLJI) == null) {
                        str = "";
                    }
                    return jv0(str, 15L, longValue, interfaceC67352kd);
                }
                if (C87013bF.LIZ()) {
                    return kv0(EnumC87133bR.NEW_VIDEOS.getScene(), 15L, longValue, interfaceC67352kd);
                }
                return hv0(EnumC87133bR.NEW_VIDEOS.getScene(), 15L, longValue, false, interfaceC67352kd);
            }
            if (C87013bF.LIZ()) {
                return kv0(EnumC87133bR.TRENDING.getScene(), 15L, longValue, interfaceC67352kd);
            }
            return hv0(EnumC87133bR.TRENDING.getScene(), 15L, longValue, false, interfaceC67352kd);
        }
        if (C87013bF.LIZ()) {
            return kv0(EnumC87133bR.TOP.getScene(), 15L, longValue, interfaceC67352kd);
        }
        return hv0(EnumC87133bR.TOP.getScene(), 15L, longValue, false, interfaceC67352kd);
    }

    public final void mv0(long j, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        XKX.LIZLLL(ViewModelKt.getViewModelScope(this), C78613UtF.LIZJ, null, new C65672hv(j, i, interfaceC65784Pro, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:12:0x00ec, B:13:0x00ef, B:19:0x006a, B:20:0x006d, B:22:0x0073, B:24:0x0082, B:26:0x0089, B:27:0x0098, B:29:0x009e, B:31:0x00ac, B:33:0x00b0, B:37:0x00c0, B:39:0x00cf, B:41:0x00da, B:45:0x00be, B:47:0x003e, B:49:0x004b, B:51:0x004f, B:52:0x0052, B:53:0x0057), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082 A[Catch: Exception -> 0x00fa, TryCatch #0 {Exception -> 0x00fa, blocks: (B:12:0x00ec, B:13:0x00ef, B:19:0x006a, B:20:0x006d, B:22:0x0073, B:24:0x0082, B:26:0x0089, B:27:0x0098, B:29:0x009e, B:31:0x00ac, B:33:0x00b0, B:37:0x00c0, B:39:0x00cf, B:41:0x00da, B:45:0x00be, B:47:0x003e, B:49:0x004b, B:51:0x004f, B:52:0x0052, B:53:0x0057), top: B:7:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(java.lang.String r14, long r15, long r17, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel.jv0(java.lang.String, long, long, X.2kd):java.lang.Object");
    }

    public final Object kv0(int i, long j, long j2, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        Map<Integer, C87113bP> map = C87083bM.LIZ;
        C87113bP c87113bP = (C87113bP) ((LinkedHashMap) map).get(new Integer(i));
        if (c87113bP == null) {
            return hv0(i, j, j2, true, interfaceC67352kd);
        }
        if (C88873eF.LIZIZ(c87113bP.LJLIL, NetworkUtils.getServerTimeMills()) >= 1) {
            map.remove(Integer.valueOf(i));
            return hv0(i, j, j2, true, interfaceC67352kd);
        }
        if ((!c87113bP.LJLJJI.isEmpty()) && j2 < c87113bP.LJLJJI.size()) {
            List<C87123bQ> list = c87113bP.LJLJJI;
            ArrayList arrayList = new ArrayList();
            for (C87123bQ c87123bQ : list) {
                if (!ORZ.LJLJJI(c87123bQ.LJLIL.getVideoStickerId(), C87083bM.LIZIZ)) {
                    arrayList.add(c87123bQ);
                }
            }
            HashSet<String> hashSet = this.LJLJJI;
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                String str = null;
                if (!it.hasNext()) {
                    break;
                }
                Long originVideoId = ((C87123bQ) it.next()).LJLIL.getOriginVideoId();
                if (originVideoId != null) {
                    str = originVideoId.toString();
                }
                arrayList2.add(str);
            }
            hashSet.addAll(arrayList2);
            gv0();
            this.LJLILLLLZI = true;
            if (c87113bP.LJLJI) {
                return A2F.LJ(A2G.LIZ, null, new Long(c87113bP.LJLILLLLZI), arrayList, 1);
            }
            A2G.LIZ.getClass();
            return A2F.LIZ(arrayList);
        }
        return hv0(i, j, j2, true, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0074 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:11:0x006b, B:12:0x006e, B:14:0x0074, B:17:0x0083, B:19:0x008a, B:20:0x0099, B:22:0x009f, B:24:0x00ad, B:26:0x00b1, B:30:0x00c1, B:32:0x00ca, B:33:0x00ce, B:35:0x00d6, B:37:0x00dc, B:38:0x00e0, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x0102, B:47:0x0109, B:49:0x0118, B:51:0x0125, B:54:0x00bf), top: B:10:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:11:0x006b, B:12:0x006e, B:14:0x0074, B:17:0x0083, B:19:0x008a, B:20:0x0099, B:22:0x009f, B:24:0x00ad, B:26:0x00b1, B:30:0x00c1, B:32:0x00ca, B:33:0x00ce, B:35:0x00d6, B:37:0x00dc, B:38:0x00e0, B:40:0x00e5, B:42:0x00f1, B:44:0x00f7, B:46:0x0102, B:47:0x0109, B:49:0x0118, B:51:0x0125, B:54:0x00bf), top: B:10:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(int r18, long r19, long r21, boolean r23, X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r24) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel.hv0(int, long, long, boolean, X.2kd):java.lang.Object");
    }
}
