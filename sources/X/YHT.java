package X;

import Y.ACallableS41S0400000_15;
import Y.ACallableS92S0200000_15;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YHT implements InterfaceC87131YHn {
    public final YHK LIZ;
    public final C55063LjH LIZIZ;
    public final int LIZJ;
    public final List<YHV> LIZLLL;
    public final java.util.Map<String, YHV> LJ;
    public final InterfaceC87123YHf LJFF;

    @Override // X.InterfaceC87131YHn
    public final void onFailed(String errorMsg) {
        o.LJIIIZ(errorMsg, "errorMsg");
    }

    @Override // X.InterfaceC87131YHn
    public final void LIZ(C87125YHh c87125YHh) {
        int i;
        if (c87125YHh.LIZIZ) {
            this.LJFF.LJIIIIZZ();
        }
        if (c87125YHh.LIZ.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = c87125YHh.LIZ.iterator();
        while (it.hasNext()) {
            YHV yhv = this.LJ.get(it.next());
            if (yhv != null) {
                arrayList.add(yhv.getRankData());
            }
        }
        if (C87121YHd.LIZ().rerankNewRecordStrategy) {
            YHS yhs = YHS.LIZ;
            C55063LjH c55063LjH = this.LIZIZ;
            yhs.getClass();
            List LIZ = YHS.LIZ(c55063LjH);
            List<YHV> list = this.LIZLLL;
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String aid = ((YHV) ListProtector.get(list, i2)).getRankData().getAid();
                Object obj = linkedHashMap.get(aid);
                if (obj == null) {
                    obj = new C87128YHk(0);
                    linkedHashMap.put(aid, obj);
                }
                ((C87128YHk) obj).LIZ = i2;
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String aid2 = ((RankData) ListProtector.get(arrayList, i3)).getAid();
                Object obj2 = linkedHashMap.get(aid2);
                if (obj2 == null) {
                    obj2 = new C87128YHk(0);
                    linkedHashMap.put(aid2, obj2);
                }
                ((C87128YHk) obj2).LIZIZ = i3;
            }
            ArrayList arrayList3 = new ArrayList();
            int size3 = list.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size3; i5++) {
                arrayList3.add(Integer.valueOf(i4));
                C87128YHk c87128YHk = (C87128YHk) linkedHashMap.get(((YHV) ListProtector.get(list, i5)).getRankData().getAid());
                if (c87128YHk != null && c87128YHk.LIZIZ == -1) {
                    i4++;
                }
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str = (String) entry.getKey();
                C87128YHk c87128YHk2 = (C87128YHk) entry.getValue();
                int i6 = c87128YHk2.LIZ;
                if (i6 != -1 && c87128YHk2.LIZIZ == -1) {
                    arrayList2.add(new C87129YHl(i6, str));
                }
                int i7 = c87128YHk2.LIZ;
                if (i7 != -1 && c87128YHk2.LIZIZ != -1) {
                    int intValue = i7 - ((Number) ListProtector.get(arrayList3, i7)).intValue();
                    int i8 = c87128YHk2.LIZIZ;
                    if (intValue != i8) {
                        arrayList2.add(new C87127YHj(c87128YHk2.LIZ, str, i8));
                    }
                }
                if (c87128YHk2.LIZ == -1 && (i = c87128YHk2.LIZIZ) != -1) {
                    arrayList2.add(new C87126YHi(i, str));
                }
            }
            if (arrayList2.isEmpty()) {
                YHK yhk = this.LIZ;
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("status", "request_success_no_diff");
                YHS.LIZ.getClass();
                YHS.LIZJ(c188727au, yhk);
                return;
            }
            YHK yhk2 = this.LIZ;
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("status", "start_rerank");
            YHS.LIZ.getClass();
            YHS.LIZJ(c188727au2, yhk2);
            C10K.LIZIZ(new ACallableS41S0400000_15(this, arrayList, LIZ, arrayList2, 1), C10K.LJIIIIZZ, null);
            return;
        }
        C10K.LIZIZ(new ACallableS92S0200000_15(arrayList, this, 8), C10K.LJIIIIZZ, null);
    }

    public static void LIZIZ(StringBuilder sb, C188727au c188727au, String str) {
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            o.LJIIIIZZ(sb, "this.deleteCharAt(index)");
        }
        c188727au.LJI(str, sb.toString());
    }

    public YHT(YHK yhk, C55063LjH c55063LjH, int i, List<YHV> list, java.util.Map<String, YHV> baseRankMap, String sceneName, InterfaceC87123YHf callback) {
        o.LJIIIZ(baseRankMap, "baseRankMap");
        o.LJIIIZ(sceneName, "sceneName");
        o.LJIIIZ(callback, "callback");
        this.LIZ = yhk;
        this.LIZIZ = c55063LjH;
        this.LIZJ = i;
        this.LIZLLL = list;
        this.LJ = baseRankMap;
        this.LJFF = callback;
    }

    public static void LIZJ(YHT yht, YHK yhk, boolean z, List list, String str, java.util.Set set, int i) {
        String str2;
        String str3;
        String str4;
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            set = OQY.INSTANCE;
        }
        if (z) {
            str2 = "rerank_success";
        } else {
            str2 = "rerank_failed";
        }
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((RankData) it.next()).getOriginItem());
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("status", str2);
        YHS.LIZ.getClass();
        c188727au.LJIIIZ("return_item_list", YHS.LIZIZ(arrayList));
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        for (InterfaceC87132YHo interfaceC87132YHo : set) {
            if (interfaceC87132YHo instanceof C87129YHl) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(((C87129YHl) interfaceC87132YHo).LIZ);
                LIZ.append(',');
                sb.append(X1D.LIZIZ(LIZ));
                z2 = true;
            } else if (interfaceC87132YHo instanceof C87127YHj) {
                StringBuilder LIZ2 = X1D.LIZ();
                C87127YHj c87127YHj = (C87127YHj) interfaceC87132YHo;
                LIZ2.append(c87127YHj.LIZ);
                LIZ2.append("->");
                LIZ2.append(c87127YHj.LIZJ);
                LIZ2.append(',');
                sb3.append(X1D.LIZIZ(LIZ2));
                z4 = true;
            } else if (interfaceC87132YHo instanceof C87126YHi) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(((C87126YHi) interfaceC87132YHo).LIZ);
                LIZ3.append(',');
                sb2.append(X1D.LIZIZ(LIZ3));
                z3 = true;
            }
        }
        String str5 = "1";
        if (z2) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("delete", str3);
        if (z3) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("insert", str4);
        if (!z4) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJI("move", str5);
        LIZIZ(sb, c188727au, "delete_detail");
        LIZIZ(sb2, c188727au, "insert_detail");
        LIZIZ(sb3, c188727au, "move_detail");
        if (!z) {
            c188727au.LJI("err_msg", str);
        }
        YHS.LIZ.getClass();
        YHS.LIZJ(c188727au, yhk);
    }
}
