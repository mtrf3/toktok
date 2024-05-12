package com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel;

import X.A2F;
import X.A2G;
import X.C2PV;
import X.C2PW;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C8HZ;
import X.C93570aT0;
import X.C93894aYE;
import X.C94348afY;
import X.C94506ai6;
import X.C94509ai9;
import X.C94952apI;
import X.EnumC58928NAu;
import X.FMX;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.TT2DSPPlatformInfo;
import com.ss.android.ugc.aweme.music.model.AppleMusicToken;
import com.ss.android.ugc.aweme.music.model.DspAuthToken;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.IDqS31S0300000_42;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class MusicDspSheetViewModel extends AssemListViewModel<C94952apI, InterfaceC57784Mm4, C93894aYE> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C94348afY.class, "hierarchy_data_music_dsp_sheet"), true);
    public boolean LJLILLLLZI;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C94952apI(0);
    }

    public final C94348afY gv0() {
        return (C94348afY) this.LJLIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC67352kd<? super X.A2H<X.C93894aYE>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C94568aj6
            if (r0 == 0) goto L69
            r6 = r8
            X.aj6 r6 = (X.C94568aj6) r6
            int r2 = r6.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r6.LJLJJI = r2
        L12:
            java.lang.Object r5 = r6.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r6.LJLJJI
            r3 = 1
            if (r0 == 0) goto L4b
            if (r0 != r3) goto L7c
            java.lang.Object r4 = r6.LJLIL
            com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel r4 = (com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel) r4
            X.C141335gf.LIZJ(r5)
        L24:
            java.util.List r5 = (java.util.List) r5
            kotlin.jvm.internal.IDqS419S0100000_42 r1 = new kotlin.jvm.internal.IDqS419S0100000_42
            r0 = 30
            r1.<init>(r5, r0)
            r4.setState(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r5.iterator()
        L39:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.C94506ai6
            if (r0 == 0) goto L39
            r3.add(r1)
            goto L39
        L4b:
            X.C141335gf.LIZJ(r5)
            X.aj7 r0 = X.C94569aj7.LJLIL
            r7.setState(r0)
            X.UtN r2 = X.C36636EZk.LIZ
            X.an0 r1 = new X.an0
            r0 = 0
            r1.<init>(r7, r0)
            r6.LJLIL = r7
            r6.LJLJJI = r3
            java.lang.Object r5 = X.XKX.LJI(r2, r1, r6)
            if (r5 != r4) goto L67
            return r4
        L67:
            r4 = r7
            goto L24
        L69:
            X.aj6 r6 = new X.aj6
            r6.<init>(r7, r8)
            goto L12
        L6f:
            r4.iv0(r3)
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r5)
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel.hv0(X.2kd):java.lang.Object");
    }

    public final void iv0(List<C94506ai6> list) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C94506ai6 c94506ai6 = (C94506ai6) it.next();
            HashMap hashMap = new HashMap();
            C94348afY gv0 = gv0();
            String str7 = null;
            if (gv0 != null) {
                str = gv0.LJLJJL;
            } else {
                str = null;
            }
            hashMap.put("group_id", str);
            C94348afY gv02 = gv0();
            if (gv02 != null) {
                str2 = gv02.LJLILLLLZI;
            } else {
                str2 = null;
            }
            hashMap.put("enter_from", str2);
            C94348afY gv03 = gv0();
            if (gv03 != null) {
                str3 = gv03.LJLJJLL;
            } else {
                str3 = null;
            }
            hashMap.put("music_id", str3);
            C94348afY gv04 = gv0();
            if (gv04 != null) {
                str4 = gv04.LJLJL;
            } else {
                str4 = null;
            }
            hashMap.put("meta_song_id", str4);
            C94348afY gv05 = gv0();
            if (gv05 != null) {
                str5 = gv05.LJLJLJ;
            } else {
                str5 = null;
            }
            hashMap.put("music_volume", str5);
            hashMap.put("button_name", DspPlatform.Companion.from(Integer.valueOf(c94506ai6.LJLILLLLZI.getDspPlatform())).getEventName());
            C94348afY gv06 = gv0();
            if (gv06 != null) {
                str7 = gv06.LJLJLLL;
            }
            hashMap.put("button_type", str7);
            String str8 = c94506ai6.LJLIL;
            if (str8 == null || str8.length() == 0) {
                str6 = CardStruct.IStatusCode.DEFAULT;
            } else {
                str6 = "1";
            }
            hashMap.put("copyright_status", str6);
            FMX.LJIIL("show_tttodsp_sheet", hashMap);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new IDqS419S0100000_42(newListState, (C8HZ<InterfaceC57784Mm4>) 31));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C93894aYE>> interfaceC67352kd) {
        ArrayList<TT2DSPSongInfo> arrayList;
        int value;
        boolean z;
        String str;
        AppleMusicToken appleMusicToken;
        C94348afY gv0 = gv0();
        if (gv0 != null && gv0.LJLIL) {
            return jv0(new C93894aYE(0), interfaceC67352kd);
        }
        if (C2PV.LIZ() || C2PW.LIZ()) {
            Object hv0 = hv0(interfaceC67352kd);
            if (hv0 == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return hv0;
            }
            return hv0;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C94509ai9(true));
        C94348afY gv02 = gv0();
        if (gv02 == null || (arrayList = gv02.LJLJI) == null) {
            arrayList = new ArrayList<>();
        }
        Iterator<TT2DSPSongInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            TT2DSPSongInfo dspSongInfo = it.next();
            C93570aT0 c93570aT0 = TT2DSPPlatformInfo.Companion;
            o.LJIIIIZZ(dspSongInfo, "dspSongInfo");
            c93570aT0.getClass();
            Integer dspPlatform = dspSongInfo.getDspPlatform();
            if (dspPlatform != null) {
                value = dspPlatform.intValue();
            } else {
                value = DspPlatform.UNKNOWN.getValue();
            }
            Boolean platformSelectedByUser = dspSongInfo.getPlatformSelectedByUser();
            if (platformSelectedByUser != null) {
                z = platformSelectedByUser.booleanValue();
            } else {
                z = false;
            }
            DspAuthToken token = dspSongInfo.getToken();
            if (token != null && (appleMusicToken = token.getAppleMusicToken()) != null) {
                str = appleMusicToken.getDevelopToken();
            } else {
                str = null;
            }
            TT2DSPPlatformInfo tT2DSPPlatformInfo = new TT2DSPPlatformInfo(value, z, str);
            arrayList2.add(new C94506ai6(dspSongInfo.getSongId(), tT2DSPPlatformInfo, new IDqS31S0300000_42(this, tT2DSPPlatformInfo, dspSongInfo, 4)));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof C94506ai6) {
                arrayList3.add(next);
            }
        }
        iv0(arrayList3);
        A2G.LIZ.getClass();
        return A2F.LIZ(arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.aYE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object jv0(X.C93894aYE r14, X.InterfaceC67352kd<? super X.A2G<X.C93894aYE>> r15) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel.jv0(X.aYE, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C93894aYE c93894aYE, InterfaceC67352kd<? super A2G<C93894aYE>> interfaceC67352kd) {
        C93894aYE c93894aYE2 = c93894aYE;
        C94348afY gv0 = gv0();
        if (gv0 != null && gv0.LJLIL) {
            return jv0(c93894aYE2, interfaceC67352kd);
        }
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
