package com.ss.android.ugc.aweme.music.highlight;

import X.A2F;
import X.A2G;
import X.C198537qj;
import X.C1DJ;
import X.C240269bq;
import X.C240479cB;
import X.C240499cD;
import X.C240639cR;
import X.C240719cZ;
import X.C2U5;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C68322mC;
import X.C8HZ;
import X.InterfaceC214228aw;
import X.InterfaceC240489cC;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.ORZ;
import Y.IDComparatorS32S0000000_4;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class HighlightSelectListViewModel extends AssemListViewModel<C240499cD, InterfaceC57784Mm4, Integer> {
    public final InterfaceC214228aw<InterfaceC240489cC> LJLIL;
    public String LJLILLLLZI;
    public List<? extends Music> LJLJI;
    public List<MusicGroup> LJLJJI;
    public final C55749LuL LJLJJL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C240499cD(0);
    }

    public HighlightSelectListViewModel(InterfaceC214228aw<InterfaceC240489cC> repo) {
        o.LJIIIZ(repo, "repo");
        this.LJLIL = repo;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLJI = c61878OQg;
        this.LJLJJI = c61878OQg;
        this.LJLJJL = new C55749LuL(C47704Ins.LJFF(this, C198537qj.class, null), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C240459c9
            if (r0 == 0) goto L20
            r4 = r9
            X.9c9 r4 = (X.C240459c9) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r1 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L26
            com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel r2 = r4.LJLIL
            goto L5e
        L20:
            X.9c9 r4 = new X.9c9
            r4.<init>(r8, r9)
            goto L12
        L26:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2e:
            X.C141335gf.LIZJ(r1)
            X.8aw<X.9cC> r0 = r8.LJLIL     // Catch: java.lang.Exception -> L94
            X.3e4 r1 = r0.getOperator()     // Catch: java.lang.Exception -> L94
            X.9cC r1 = (X.InterfaceC240489cC) r1     // Catch: java.lang.Exception -> L94
            java.lang.Class<X.9eQ> r0 = X.InterfaceC241869eQ.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)     // Catch: java.lang.Exception -> L94
            X.7ql r0 = X.C8VC.LJIIIZ(r8, r0)     // Catch: java.lang.Exception -> L94
            X.9c0 r0 = (X.C240369c0) r0     // Catch: java.lang.Exception -> L94
            if (r0 == 0) goto L4b
            java.lang.String r0 = r0.LIZIZ     // Catch: java.lang.Exception -> L94
            if (r0 != 0) goto L4d
        L4b:
            java.lang.String r0 = ""
        L4d:
            X.Svk r0 = r1.LJJJLL(r0)     // Catch: java.lang.Exception -> L94
            r4.LJLIL = r8     // Catch: java.lang.Exception -> L94
            r4.LJLJJI = r2     // Catch: java.lang.Exception -> L94
            java.lang.Object r1 = X.C77318UWc.LIZIZ(r0, r4)     // Catch: java.lang.Exception -> L94
            if (r1 != r3) goto L5c
            return r3
        L5c:
            r2 = r8
            goto L61
        L5e:
            X.C141335gf.LIZJ(r1)     // Catch: java.lang.Exception -> L94
        L61:
            com.ss.android.ugc.aweme.music.model.NewReleasedList r1 = (com.ss.android.ugc.aweme.music.model.NewReleasedList) r1     // Catch: java.lang.Exception -> L94
            java.util.List r0 = r1.getNewReleasedMusicList()
            r2.LJLJI = r0
            java.util.List r0 = r1.getNewReleasedMusicGroups()
            r2.LJLJJI = r0
            java.lang.Class<X.9eQ> r0 = X.InterfaceC241869eQ.class
            X.Prg r0 = X.C65352Pkq.LIZ(r0)
            X.7ql r0 = X.C8VC.LJIIIZ(r2, r0)
            X.9c0 r0 = (X.C240369c0) r0
            if (r0 == 0) goto L92
            java.lang.String r3 = r0.LJIIIIZZ
        L7f:
            X.A2F r1 = X.A2G.LIZ
            r4 = 0
            r7 = 14
            r5 = r4
            r6 = r4
            java.util.List r0 = gv0(r2, r3, r4, r5, r6, r7)
            r1.getClass()
            X.A2H r0 = X.A2F.LIZ(r0)
            return r0
        L92:
            r3 = 0
            goto L7f
        L94:
            r1 = move-exception
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2I r0 = X.A2F.LIZJ(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.highlight.HighlightSelectListViewModel.hv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 439));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return hv0(interfaceC67352kd);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        num.intValue();
        return A2F.LIZIZ(A2G.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.String] */
    public static List gv0(HighlightSelectListViewModel highlightSelectListViewModel, String str, String str2, String str3, String str4, int i) {
        boolean z;
        long j;
        boolean z2;
        long j2;
        MusicReleaseInfo musicReleaseInfo;
        String str5 = str;
        String str6 = str4;
        if ((i & 1) != 0) {
            str5 = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str6 = null;
        }
        highlightSelectListViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = ((C240499cD) highlightSelectListViewModel.getState()).LJLIL;
        if (str5 != null) {
            T t = str5;
            if (C240269bq.LIZ()) {
                MusicGroup LJIIJJI = C1DJ.LJIIJJI(str5, highlightSelectListViewModel.LJLJJI);
                if (LJIIJJI != null) {
                    t = LJIIJJI.getSourceMusicId();
                } else {
                    t = 0;
                }
            }
            c68322mC.element = t;
        } else if (str2 != null) {
            c68322mC.element = null;
        } else if (str3 != null) {
            highlightSelectListViewModel.LJLILLLLZI = null;
        } else if (str6 != null) {
            highlightSelectListViewModel.LJLILLLLZI = str6;
        }
        if (C240269bq.LIZ()) {
            List LLILII = ORZ.LLILII(new IDComparatorS32S0000000_4(11), highlightSelectListViewModel.LJLJJI);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : LLILII) {
                Music sourceMusic = ((MusicGroup) obj).getSourceMusic();
                if (sourceMusic != null && (musicReleaseInfo = sourceMusic.getMusicReleaseInfo()) != null) {
                    j2 = musicReleaseInfo.getGroupReleaseDate();
                } else {
                    j2 = 0;
                }
                String format = new SimpleDateFormat("MMM dd").format(new Date(1000 * (j2 + 2592000)));
                Object obj2 = linkedHashMap.get(format);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(format, obj2);
                }
                ((List) obj2).add(obj);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String date = (String) entry.getKey();
                List<MusicGroup> list = (List) entry.getValue();
                o.LJIIIIZZ(date, "date");
                arrayList.add(new C240479cB(date));
                for (MusicGroup musicGroup : list) {
                    Boolean valueOf = Boolean.valueOf(C1DJ.LJII(musicGroup, highlightSelectListViewModel.LJLILLLLZI));
                    T t2 = c68322mC.element;
                    if (t2 != 0 && C1DJ.LJII(musicGroup, (String) t2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C240719cZ LJJIJLIJ = C1DJ.LJJIJLIJ(musicGroup, null, null, valueOf, Boolean.valueOf(z2), 3);
                    if (LJJIJLIJ != null) {
                        arrayList.add(LJJIJLIJ);
                    }
                    if (C1DJ.LJII(musicGroup, highlightSelectListViewModel.LJLILLLLZI)) {
                        arrayList.addAll(C1DJ.LJJIJL(musicGroup, null));
                    }
                }
            }
        } else {
            List LLILII2 = ORZ.LLILII(new IDComparatorS32S0000000_4(12), highlightSelectListViewModel.LJLJI);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : LLILII2) {
                MusicReleaseInfo musicReleaseInfo2 = ((Music) obj3).getMusicReleaseInfo();
                if (musicReleaseInfo2 != null) {
                    j = musicReleaseInfo2.getGroupReleaseDate();
                } else {
                    j = 0;
                }
                String format2 = new SimpleDateFormat("MMM dd").format(new Date((j + 2592000) * 1000));
                Object obj4 = linkedHashMap2.get(format2);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(format2, obj4);
                }
                ((List) obj4).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                String date2 = (String) entry2.getKey();
                List list2 = (List) entry2.getValue();
                o.LJIIIIZZ(date2, "date");
                arrayList.add(new C240479cB(date2));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    MusicModel musicModel = ((Music) it.next()).convertToMusicModel();
                    o.LJIIIIZZ(musicModel, "musicModel");
                    if (c68322mC.element != 0 && o.LJ(musicModel.getMusicId(), c68322mC.element)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new C240719cZ(musicModel, new C240639cR(null, false, false, 0, false, false, false, z, false, 383)));
                }
            }
        }
        if (!o.LJ(c68322mC.element, ((C240499cD) highlightSelectListViewModel.getState()).LJLIL)) {
            highlightSelectListViewModel.setState(new AqS170S0100000_4(c68322mC, (C68322mC<List<Object>>) 1421));
        }
        if (!arrayList.isEmpty()) {
            ListProtector.add(arrayList, 0, new C2U5());
        }
        return arrayList;
    }
}
