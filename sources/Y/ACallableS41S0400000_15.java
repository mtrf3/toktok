package Y;

import X.C06460Ne;
import X.C162476Zf;
import X.C26045AKb;
import X.C2KB;
import X.C32I;
import X.C48263Iwt;
import X.C55063LjH;
import X.C55683LtH;
import X.C76800UCe;
import X.C78983UzD;
import X.C87126YHi;
import X.C87127YHj;
import X.C87129YHl;
import X.EF7;
import X.InterfaceC87131YHn;
import X.InterfaceC87132YHo;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.YHK;
import X.YHN;
import X.YHP;
import X.YHQ;
import X.YHT;
import X.YHV;
import X.YHY;
import X.YHZ;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.model.RankData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ACallableS41S0400000_15 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS41S0400000_15 aCallableS41S0400000_15) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            YHN yhn = (YHN) aCallableS41S0400000_15.l0;
            YHQ yhq = new YHQ((YHZ) aCallableS41S0400000_15.l2, currentTimeMillis, (YHK) aCallableS41S0400000_15.l3, (InterfaceC87131YHn) aCallableS41S0400000_15.l1);
            if (!yhn.LIZJ.isEmpty()) {
                YHP yhp = (YHP) ListProtector.get(yhn.LIZJ, 0);
                yhp.getClass();
                if (yhn.LIZ.LJII) {
                    yhq.LIZ(-1, "This task was canceled.", yhn);
                } else {
                    yhp.LIZ(yhn, yhq);
                }
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            InterfaceC87131YHn interfaceC87131YHn = (InterfaceC87131YHn) aCallableS41S0400000_15.l1;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC87131YHn.onFailed(message);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS41S0400000_15 aCallableS41S0400000_15) {
        OSZ osz;
        String LIZIZ;
        Fragment fragment;
        int i;
        Aweme aweme;
        String str;
        int i2;
        Aweme aweme2;
        RankData rankData;
        YHT yht = (YHT) aCallableS41S0400000_15.l0;
        C55063LjH c55063LjH = yht.LIZIZ;
        YHY yhy = yht.LIZ.LJ;
        List list = (List) aCallableS41S0400000_15.l1;
        List list2 = (List) aCallableS41S0400000_15.l2;
        List list3 = (List) aCallableS41S0400000_15.l3;
        if (c55063LjH != null && yhy != null) {
            if (c55063LjH.LIZ() != yhy.LJLJI) {
                YHT.LIZJ(yht, yht.LIZ, false, list, "user swiped", null, 16);
            } else {
                int size = yhy.LJLIL - yht.LIZLLL.size();
                int LIZ = c55063LjH.LIZ() + yht.LIZJ;
                int i3 = yhy.LJLIL - 1;
                if (LIZ > i3) {
                    osz = new OSZ(Boolean.FALSE, C48263Iwt.LIZLLL("index not valid begin ", LIZ, " end ", i3));
                } else {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            InterfaceC87132YHo interfaceC87132YHo = (InterfaceC87132YHo) it.next();
                            if (!interfaceC87132YHo.LIZ(LIZ - size, i3 - size)) {
                                if (interfaceC87132YHo instanceof C87129YHl) {
                                    LIZIZ = String.valueOf(((C87129YHl) interfaceC87132YHo).LIZ);
                                } else if (interfaceC87132YHo instanceof C87126YHi) {
                                    LIZIZ = String.valueOf(((C87126YHi) interfaceC87132YHo).LIZ);
                                } else if (interfaceC87132YHo instanceof C87127YHj) {
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("origin ");
                                    C87127YHj c87127YHj = (C87127YHj) interfaceC87132YHo;
                                    LIZ2.append(c87127YHj.LIZ);
                                    LIZ2.append(" new ");
                                    LIZ2.append(c87127YHj.LIZJ);
                                    LIZIZ = X1D.LIZIZ(LIZ2);
                                } else {
                                    throw new C162476Zf();
                                }
                                StringBuilder LIZJ = C06460Ne.LIZJ("index not valid begin ", LIZ, " end ", i3, ", offset ");
                                LIZJ.append(size);
                                LIZJ.append(", ");
                                LIZJ.append(LIZIZ);
                                osz = new OSZ(Boolean.FALSE, X1D.LIZIZ(LIZJ));
                            }
                        } else {
                            osz = new OSZ(Boolean.TRUE, "");
                            break;
                        }
                    }
                }
                if (((Boolean) osz.getFirst()).booleanValue()) {
                    C55683LtH.LIZJ = true;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    StringBuilder sb = new StringBuilder();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list3) {
                        if ((obj instanceof C87129YHl) || (obj instanceof C87127YHj)) {
                            arrayList.add(obj);
                        }
                    }
                    for (InterfaceC87132YHo interfaceC87132YHo2 : ORZ.LLILII(new IDComparatorS43S0000000_15(4), arrayList)) {
                        if (interfaceC87132YHo2 instanceof C87129YHl) {
                            i2 = ((C87129YHl) interfaceC87132YHo2).LIZ;
                        } else {
                            o.LJII(interfaceC87132YHo2, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.diff.ReRankMove");
                            i2 = ((C87127YHj) interfaceC87132YHo2).LIZ;
                        }
                        if (i2 >= 0 && i2 < list2.size()) {
                            String aid = interfaceC87132YHo2.getAid();
                            YHV yhv = yht.LJ.get(aid);
                            if (yhv != null && (rankData = yhv.getRankData()) != null) {
                                aweme2 = rankData.getOriginItem();
                                if (aweme2 != null && aweme2.isAd()) {
                                    linkedHashSet.add(interfaceC87132YHo2);
                                }
                            } else {
                                aweme2 = null;
                            }
                            if (interfaceC87132YHo2 instanceof C87129YHl) {
                                yht.LJ.remove(aid);
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("delete item ");
                                LIZ3.append(interfaceC87132YHo2.getAid());
                                LIZ3.append(", pos ");
                                LIZ3.append(i2 + 1);
                                LIZ3.append('\n');
                                sb.append(X1D.LIZIZ(LIZ3));
                                if (aweme2 != null) {
                                    yht.LJFF.LJIJ(true);
                                    c55063LjH.LIZ.LJJJJZI(i2, aweme2);
                                }
                            } else if (aweme2 != null) {
                                linkedHashMap.put(aid, aweme2);
                                yht.LJFF.LJIJ(true);
                                c55063LjH.LIZ.LJJJJZI(i2, aweme2);
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : list3) {
                        if ((obj2 instanceof C87127YHj) || (obj2 instanceof C87126YHi)) {
                            arrayList2.add(obj2);
                        }
                    }
                    List<InterfaceC87132YHo> LLILII = ORZ.LLILII(new IDComparatorS43S0000000_15(3), arrayList2);
                    yht.LJFF.LJIJ(true);
                    for (InterfaceC87132YHo interfaceC87132YHo3 : LLILII) {
                        if (interfaceC87132YHo3 instanceof C87126YHi) {
                            i = ((C87126YHi) interfaceC87132YHo3).LIZ;
                        } else {
                            o.LJII(interfaceC87132YHo3, "null cannot be cast to non-null type com.bytedance.ies.ugc.aweme.commercialize.intelligence.feed.diff.ReRankMove");
                            i = ((C87127YHj) interfaceC87132YHo3).LIZJ;
                        }
                        int i4 = i + size;
                        String aid2 = interfaceC87132YHo3.getAid();
                        if (interfaceC87132YHo3 instanceof C87126YHi) {
                            StringBuilder LIZ4 = X1D.LIZ();
                            LIZ4.append("insert item ");
                            LIZ4.append(interfaceC87132YHo3.getAid());
                            LIZ4.append(" to ");
                            LIZ4.append(i4 + 1);
                            LIZ4.append('\n');
                            str = X1D.LIZIZ(LIZ4);
                            aweme = yht.LJFF.LJIIL(interfaceC87132YHo3.getAid());
                        } else {
                            aweme = (Aweme) linkedHashMap.get(aid2);
                            if (aweme == null || !aweme.isAd()) {
                                str = "";
                            } else {
                                StringBuilder LIZ5 = X1D.LIZ();
                                LIZ5.append("move item ");
                                LIZ5.append(interfaceC87132YHo3.getAid());
                                LIZ5.append(" from ");
                                LIZ5.append(((C87127YHj) interfaceC87132YHo3).LIZ + size + 1);
                                LIZ5.append(" to ");
                                LIZ5.append(i4 + 1);
                                LIZ5.append('\n');
                                str = X1D.LIZIZ(LIZ5);
                            }
                        }
                        if (aweme != null) {
                            if (aweme.isAd()) {
                                linkedHashSet.add(interfaceC87132YHo3);
                                if (aweme == null) {
                                }
                            }
                            c55063LjH.LIZ.insertItemList(new C2KB<>(i4, "ad_rerank", Collections.singletonList(aweme)));
                        }
                        sb.append(str);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj3 : list3) {
                        if (obj3 instanceof C87126YHi) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(((C87126YHi) it2.next()).LIZIZ);
                    }
                    yht.LJFF.LJIILL(arrayList4);
                    yht.LJFF.LJIJ(false);
                    if (o.LJ("local_test", EF7.LJIILIIL) && (fragment = c55063LjH.LIZ.getFragment()) != null) {
                        C26045AKb c26045AKb = new C26045AKb(fragment);
                        c26045AKb.LJIIIZ(sb.toString());
                        c26045AKb.LJIIJ();
                    }
                    YHT.LIZJ(yht, yht.LIZ, true, list, null, linkedHashSet, 8);
                } else {
                    YHK yhk = yht.LIZ;
                    StringBuilder LIZJ2 = C06460Ne.LIZJ("index not valid, begin ", LIZ, ", end ", i3, ", ");
                    LIZJ2.append((String) osz.getSecond());
                    YHT.LIZJ(yht, yhk, false, list, X1D.LIZIZ(LIZJ2), null, 16);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    public ACallableS41S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
