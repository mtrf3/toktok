package X;

import Y.ARunnableS49S0100000_13;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalStrikeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.jvm.internal.o;

/* renamed from: X.TzX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76455TzX extends AbstractC65781Prl implements InterfaceC88476Ynw<UIAssem, AbstractC76441TzJ, BattleItem4FEModel, BattleItem4FEModel, BattleItem4FEModel, BattleItem4FEModel, C76800UCe> {
    public final /* synthetic */ MatchItemAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76455TzX(MatchItemAssem matchItemAssem) {
        super(6);
        this.LJLIL = matchItemAssem;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [X.Cr6, O] */
    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(UIAssem selectSubscribe, AbstractC76441TzJ abstractC76441TzJ, BattleItem4FEModel battleItem4FEModel, BattleItem4FEModel battleItem4FEModel2, BattleItem4FEModel battleItem4FEModel3, BattleItem4FEModel battleItem4FEModel4) {
        Integer num;
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        List<ItemInfo4FE> list3;
        Integer num2;
        String str;
        Integer num3;
        String str2;
        ItemInfo4FE itemInfo4FE;
        int i;
        List<ItemInfo4FE> list4;
        List<ItemInfo4FE> list5;
        List<ItemInfo4FE> list6;
        boolean z;
        String str3;
        String str4;
        int i2;
        List<ItemInfo4FE> list7;
        List<ItemInfo4FE> list8;
        List<ItemInfo4FE> list9;
        boolean z2;
        String str5;
        String str6;
        List<ItemInfo4FE> list10;
        List<ItemInfo4FE> list11;
        List<ItemInfo4FE> list12;
        Integer num4;
        Integer num5;
        Integer num6;
        Integer num7;
        long LIZIZ;
        Object obj;
        List<ItemInfo4FE> list13;
        long LIZIZ2;
        AbstractC76441TzJ action = abstractC76441TzJ;
        BattleItem4FEModel selfCriticals = battleItem4FEModel;
        BattleItem4FEModel selfSmokes = battleItem4FEModel2;
        BattleItem4FEModel rivalCriticals = battleItem4FEModel3;
        BattleItem4FEModel rivalSmokes = battleItem4FEModel4;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(action, "action");
        o.LJIIIZ(selfCriticals, "selfCriticals");
        o.LJIIIZ(selfSmokes, "selfSmokes");
        o.LJIIIZ(rivalCriticals, "rivalCriticals");
        o.LJIIIZ(rivalSmokes, "rivalSmokes");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observer ====>>>>>");
        LIZ.append(action);
        C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ));
        Integer num8 = null;
        String str7 = null;
        String str8 = null;
        Long l = null;
        Long l2 = null;
        r15 = null;
        Long l3 = null;
        r15 = null;
        Long l4 = null;
        if (o.LJ(action, C76451TzT.LIZ)) {
            List<ItemInfo4FE> list14 = selfCriticals.itemList;
            if ((list14 != null && !list14.isEmpty()) || (((list10 = selfSmokes.itemList) != null && !list10.isEmpty()) || (((list11 = rivalCriticals.itemList) != null && !list11.isEmpty()) || ((list12 = rivalSmokes.itemList) != null && !list12.isEmpty())))) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("initiallize selfCriticals size =");
                List<ItemInfo4FE> list15 = selfCriticals.itemList;
                if (list15 != null) {
                    num4 = Integer.valueOf(list15.size());
                } else {
                    num4 = null;
                }
                LIZ2.append(num4);
                LIZ2.append(" and smoke smokeSize = ");
                List<ItemInfo4FE> list16 = selfSmokes.itemList;
                if (list16 != null) {
                    num5 = Integer.valueOf(list16.size());
                } else {
                    num5 = null;
                }
                LIZ2.append(num5);
                LIZ2.append(" rivalCriticals size ");
                List<ItemInfo4FE> list17 = rivalCriticals.itemList;
                if (list17 != null) {
                    num6 = Integer.valueOf(list17.size());
                } else {
                    num6 = null;
                }
                LIZ2.append(num6);
                LIZ2.append(" rivalSmoke size ");
                List<ItemInfo4FE> list18 = rivalSmokes.itemList;
                if (list18 != null) {
                    num7 = Integer.valueOf(list18.size());
                } else {
                    num7 = null;
                }
                LIZ2.append(num7);
                C0NB.LJIIIZ("MatchItemAssem", X1D.LIZIZ(LIZ2));
                List<ItemInfo4FE> list19 = selfCriticals.itemList;
                if (list19 != null && !list19.isEmpty()) {
                    this.LJLIL.O3(1, selfCriticals);
                    this.LJLIL.LJLZ = selfCriticals;
                    List<ItemInfo4FE> list20 = selfCriticals.itemList;
                    if (list20 != null && !list20.isEmpty()) {
                        DataChannel dataChannel = this.LJLIL.LJLLI;
                        if (dataChannel != null) {
                            dataChannel.rv0(BattleCriticalStrikeCardEffectChannel.class, EnumC76461Tzd.EFFECTING);
                        }
                        List<ItemInfo4FE> list21 = selfCriticals.itemList;
                        if (list21 != null) {
                            MatchItemAssem matchItemAssem = this.LJLIL;
                            int i3 = 0;
                            for (ItemInfo4FE itemInfo4FE2 : list21) {
                                int i4 = i3 + 1;
                                if (i3 >= 0) {
                                    matchItemAssem.K3(1, itemInfo4FE2, true);
                                    i3 = i4;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                    }
                    this.LJLIL.H3(1, selfCriticals);
                }
                List<ItemInfo4FE> list22 = selfSmokes.itemList;
                if (list22 != null && !list22.isEmpty()) {
                    this.LJLIL.O3(2, selfSmokes);
                    this.LJLIL.LJZ = selfSmokes;
                    List<ItemInfo4FE> list23 = selfSmokes.itemList;
                    if (list23 != null && !list23.isEmpty()) {
                        DataChannel dataChannel2 = this.LJLIL.LJLLI;
                        if (dataChannel2 != null) {
                            dataChannel2.rv0(BattleSmokeCardEffectChannel.class, EnumC76461Tzd.EFFECTING);
                        }
                        this.LJLIL.M3(true);
                        List<ItemInfo4FE> list24 = selfSmokes.itemList;
                        if (list24 != null) {
                            MatchItemAssem matchItemAssem2 = this.LJLIL;
                            int i5 = 0;
                            for (ItemInfo4FE itemInfo4FE3 : list24) {
                                int i6 = i5 + 1;
                                if (i5 >= 0) {
                                    matchItemAssem2.K3(2, itemInfo4FE3, true);
                                    i5 = i6;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                        }
                    }
                    this.LJLIL.H3(2, selfSmokes);
                }
                List<ItemInfo4FE> list25 = rivalCriticals.itemList;
                if (list25 != null && !list25.isEmpty() && (list13 = rivalCriticals.itemList) != null) {
                    MatchItemAssem matchItemAssem3 = this.LJLIL;
                    int i7 = 0;
                    for (ItemInfo4FE itemInfo4FE4 : list13) {
                        int i8 = i7 + 1;
                        if (i7 >= 0) {
                            ItemInfo4FE itemInfo4FE5 = itemInfo4FE4;
                            if (itemInfo4FE5.effectStartTimeSec * 1000 >= C30725C4b.LIZIZ()) {
                                LIZIZ2 = itemInfo4FE5.effectLastDuration;
                            } else {
                                LIZIZ2 = itemInfo4FE5.effectLastDuration - ((C30725C4b.LIZIZ() - (itemInfo4FE5.effectStartTimeSec * 1000)) / 1000);
                            }
                            if (LIZIZ2 > 1) {
                                matchItemAssem3.I3(1, LIZIZ2, itemInfo4FE5);
                            }
                            i7 = i8;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                }
                List<ItemInfo4FE> list26 = rivalSmokes.itemList;
                if (list26 != null && !list26.isEmpty()) {
                    List<ItemInfo4FE> list27 = rivalSmokes.itemList;
                    if (list27 != null) {
                        MatchItemAssem matchItemAssem4 = this.LJLIL;
                        int i9 = 0;
                        for (ItemInfo4FE itemInfo4FE6 : list27) {
                            int i10 = i9 + 1;
                            if (i9 >= 0) {
                                ItemInfo4FE itemInfo4FE7 = itemInfo4FE6;
                                if (itemInfo4FE7.effectStartTimeSec * 1000 >= C30725C4b.LIZIZ()) {
                                    LIZIZ = itemInfo4FE7.effectLastDuration;
                                } else {
                                    LIZIZ = itemInfo4FE7.effectLastDuration - ((C30725C4b.LIZIZ() - (itemInfo4FE7.effectStartTimeSec * 1000)) / 1000);
                                }
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("rival smoke size = ");
                                List<ItemInfo4FE> list28 = rivalSmokes.itemList;
                                if (list28 != null) {
                                    obj = Integer.valueOf(list28.size());
                                } else {
                                    obj = null;
                                }
                                LIZ3.append(obj);
                                LIZ3.append(" and countDown = ");
                                LIZ3.append(LIZIZ);
                                C0NB.LIZIZ("MatchItemAssem", X1D.LIZIZ(LIZ3));
                                matchItemAssem4.I3(2, LIZIZ, itemInfo4FE7);
                                i9 = i10;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    DataChannel dataChannel3 = this.LJLIL.LJLLI;
                    if (dataChannel3 != null) {
                        dataChannel3.rv0(BattleSmokeDebuffChannel.class, EnumC76461Tzd.EFFECTING);
                    }
                    this.LJLIL.N3(true);
                }
            }
        } else {
            long j = 0;
            if (action instanceof C76443TzL) {
                C76443TzL c76443TzL = (C76443TzL) action;
                int i11 = c76443TzL.LIZ;
                boolean z3 = c76443TzL.LIZIZ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("recieve use Card cardType = ");
                LIZ4.append(i11);
                LIZ4.append(" and isSelf = ");
                LIZ4.append(z3);
                C0NB.LJIIIZ("MatchItemAssem", X1D.LIZIZ(LIZ4));
                if (z3) {
                    String str9 = "";
                    if (i11 != 1) {
                        if (i11 == 2 && c76443TzL.LIZJ != null) {
                            MatchItemAssem matchItemAssem5 = this.LJLIL;
                            if (matchItemAssem5.LJZ == null) {
                                BattleItem4FEModel battleItem4FEModel5 = new BattleItem4FEModel();
                                battleItem4FEModel5.isSelfTeam = true;
                                battleItem4FEModel5.itemType = 2;
                                battleItem4FEModel5.itemList = new ArrayList();
                                C76280Twi c76280Twi = C76265TwT.LIZ;
                                GiftModeMeta giftModeMeta = c76280Twi.LJIILLIIL;
                                if (giftModeMeta != null && giftModeMeta.giftId == 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                battleItem4FEModel5.isGiftOnlyMatch = !z2;
                                if (giftModeMeta != null) {
                                    j = giftModeMeta.giftId;
                                }
                                battleItem4FEModel5.giftOnlyId = j;
                                if (giftModeMeta != null && (str5 = giftModeMeta.giftNameKey) != null && str5.length() != 0) {
                                    C86881Y7x LIZIZ3 = C86881Y7x.LIZIZ();
                                    GiftModeMeta giftModeMeta2 = c76280Twi.LJIILLIIL;
                                    if (giftModeMeta2 != null) {
                                        str6 = giftModeMeta2.giftNameKey;
                                    } else {
                                        str6 = null;
                                    }
                                    str9 = LIZIZ3.LIZ(str6);
                                }
                                battleItem4FEModel5.giftOnlyName = str9;
                                matchItemAssem5.LJZ = battleItem4FEModel5;
                            }
                            ItemInfo4FE itemInfo4FE8 = c76443TzL.LIZJ;
                            if (itemInfo4FE8 != null) {
                                if (itemInfo4FE8.effectStartTimeSec * 1000 <= C30725C4b.LIZIZ()) {
                                    ConcurrentLinkedDeque<ItemInfo4FE> concurrentLinkedDeque = this.LJLIL.LLFII;
                                    ItemInfo4FE itemInfo4FE9 = c76443TzL.LIZJ;
                                    if (itemInfo4FE9 != null) {
                                        concurrentLinkedDeque.offerFirst(itemInfo4FE9);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    ConcurrentLinkedDeque<ItemInfo4FE> concurrentLinkedDeque2 = this.LJLIL.LLFII;
                                    ItemInfo4FE itemInfo4FE10 = c76443TzL.LIZJ;
                                    if (itemInfo4FE10 != null) {
                                        concurrentLinkedDeque2.offerLast(itemInfo4FE10);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                BattleItem4FEModel battleItem4FEModel6 = this.LJLIL.LJZ;
                                if (battleItem4FEModel6 != null && (list9 = battleItem4FEModel6.itemList) != null) {
                                    ORS.LJJLIL(C76463Tzf.LJLIL, list9);
                                }
                                BattleItem4FEModel battleItem4FEModel7 = this.LJLIL.LJZ;
                                if (battleItem4FEModel7 == null || (list7 = battleItem4FEModel7.itemList) == null || list7.isEmpty()) {
                                    BattleItem4FEModel battleItem4FEModel8 = this.LJLIL.LJZ;
                                    if (battleItem4FEModel8 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        ItemInfo4FE itemInfo4FE11 = c76443TzL.LIZJ;
                                        if (itemInfo4FE11 != null) {
                                            arrayList.add(itemInfo4FE11);
                                            battleItem4FEModel8.itemList = arrayList;
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    MatchItemAssem matchItemAssem6 = this.LJLIL;
                                    BattleItem4FEModel battleItem4FEModel9 = matchItemAssem6.LJZ;
                                    if (battleItem4FEModel9 != null) {
                                        matchItemAssem6.O3(2, battleItem4FEModel9);
                                        if (this.LJLIL.LJLLILLLL) {
                                            ItemInfo4FE itemInfo4FE12 = c76443TzL.LIZJ;
                                            if (itemInfo4FE12 != null) {
                                                C1JD.LJIILLIIL(2, itemInfo4FE12.senderUid, itemInfo4FE12, false, "assem self critical", 8);
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        }
                                        ItemInfo4FE itemInfo4FE13 = c76443TzL.LIZJ;
                                        if (itemInfo4FE13 != null) {
                                            str7 = itemInfo4FE13.senderUid;
                                        }
                                        i2 = 2;
                                        C76272Twa.LJJIL(2, str7, this.LJLIL.LJLLILLLL, false);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    BattleItem4FEModel battleItem4FEModel10 = this.LJLIL.LJZ;
                                    if (battleItem4FEModel10 != null && (list8 = battleItem4FEModel10.itemList) != null) {
                                        ItemInfo4FE itemInfo4FE14 = c76443TzL.LIZJ;
                                        if (itemInfo4FE14 != null) {
                                            list8.add(itemInfo4FE14);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    MatchItemAssem matchItemAssem7 = this.LJLIL;
                                    BattleItem4FEModel battleItem4FEModel11 = matchItemAssem7.LJZ;
                                    if (battleItem4FEModel11 != null) {
                                        i2 = 2;
                                        matchItemAssem7.W3(2, battleItem4FEModel11);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                this.LJLIL.U3("Use Smoke card");
                                this.LJLIL.H3(i2, selfSmokes);
                                MatchItemAssem matchItemAssem8 = this.LJLIL;
                                ItemInfo4FE itemInfo4FE15 = c76443TzL.LIZJ;
                                if (itemInfo4FE15 != null) {
                                    matchItemAssem8.K3(i2, itemInfo4FE15, false);
                                    UCK uck = UCK.SMOKE_CARD;
                                    String value = uck.getValue();
                                    ItemInfo4FE itemInfo4FE16 = c76443TzL.LIZJ;
                                    if (itemInfo4FE16 != null) {
                                        C76457TzZ.LJFF(itemInfo4FE16.sendTimeSec, value, this.LJLIL.LJLLILLLL);
                                        C76457TzZ.LIZIZ(uck.getValue(), this.LJLIL.LJLLILLLL);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    } else if (c76443TzL.LIZJ != null) {
                        MatchItemAssem matchItemAssem9 = this.LJLIL;
                        if (matchItemAssem9.LJLZ == null) {
                            BattleItem4FEModel battleItem4FEModel12 = new BattleItem4FEModel();
                            battleItem4FEModel12.isSelfTeam = true;
                            battleItem4FEModel12.itemType = 1;
                            battleItem4FEModel12.itemList = new ArrayList();
                            C76280Twi c76280Twi2 = C76265TwT.LIZ;
                            GiftModeMeta giftModeMeta3 = c76280Twi2.LJIILLIIL;
                            if (giftModeMeta3 != null && giftModeMeta3.giftId == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            battleItem4FEModel12.isGiftOnlyMatch = !z;
                            if (giftModeMeta3 != null) {
                                j = giftModeMeta3.giftId;
                            }
                            battleItem4FEModel12.giftOnlyId = j;
                            if (giftModeMeta3 != null && (str3 = giftModeMeta3.giftNameKey) != null && str3.length() != 0) {
                                C86881Y7x LIZIZ4 = C86881Y7x.LIZIZ();
                                GiftModeMeta giftModeMeta4 = c76280Twi2.LJIILLIIL;
                                if (giftModeMeta4 != null) {
                                    str4 = giftModeMeta4.giftNameKey;
                                } else {
                                    str4 = null;
                                }
                                str9 = LIZIZ4.LIZ(str4);
                            }
                            battleItem4FEModel12.giftOnlyName = str9;
                            matchItemAssem9.LJLZ = battleItem4FEModel12;
                        }
                        UCK uck2 = UCK.STRIKE_CARD;
                        String value2 = uck2.getValue();
                        ItemInfo4FE itemInfo4FE17 = c76443TzL.LIZJ;
                        if (itemInfo4FE17 != null) {
                            C76457TzZ.LJFF(itemInfo4FE17.sendTimeSec, value2, this.LJLIL.LJLLILLLL);
                            C76457TzZ.LIZIZ(uck2.getValue(), this.LJLIL.LJLLILLLL);
                            ItemInfo4FE itemInfo4FE18 = c76443TzL.LIZJ;
                            if (itemInfo4FE18 != null) {
                                if (itemInfo4FE18.effectStartTimeSec * 1000 <= C30725C4b.LIZIZ()) {
                                    ConcurrentLinkedDeque<ItemInfo4FE> concurrentLinkedDeque3 = this.LJLIL.LLFII;
                                    ItemInfo4FE itemInfo4FE19 = c76443TzL.LIZJ;
                                    if (itemInfo4FE19 != null) {
                                        concurrentLinkedDeque3.offerFirst(itemInfo4FE19);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    ConcurrentLinkedDeque<ItemInfo4FE> concurrentLinkedDeque4 = this.LJLIL.LLFII;
                                    ItemInfo4FE itemInfo4FE20 = c76443TzL.LIZJ;
                                    if (itemInfo4FE20 != null) {
                                        concurrentLinkedDeque4.offerLast(itemInfo4FE20);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                BattleItem4FEModel battleItem4FEModel13 = this.LJLIL.LJLZ;
                                if (battleItem4FEModel13 != null && (list6 = battleItem4FEModel13.itemList) != null) {
                                    ORS.LJJLIL(C76462Tze.LJLIL, list6);
                                }
                                BattleItem4FEModel battleItem4FEModel14 = this.LJLIL.LJLZ;
                                if (battleItem4FEModel14 == null || (list4 = battleItem4FEModel14.itemList) == null || list4.isEmpty()) {
                                    BattleItem4FEModel battleItem4FEModel15 = this.LJLIL.LJLZ;
                                    if (battleItem4FEModel15 != null) {
                                        ArrayList arrayList2 = new ArrayList();
                                        ItemInfo4FE itemInfo4FE21 = c76443TzL.LIZJ;
                                        if (itemInfo4FE21 != null) {
                                            arrayList2.add(itemInfo4FE21);
                                            battleItem4FEModel15.itemList = arrayList2;
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    MatchItemAssem matchItemAssem10 = this.LJLIL;
                                    BattleItem4FEModel battleItem4FEModel16 = matchItemAssem10.LJLZ;
                                    if (battleItem4FEModel16 != null) {
                                        matchItemAssem10.O3(1, battleItem4FEModel16);
                                        if (this.LJLIL.LJLLILLLL) {
                                            ItemInfo4FE itemInfo4FE22 = c76443TzL.LIZJ;
                                            if (itemInfo4FE22 != null) {
                                                C1JD.LJIILLIIL(1, itemInfo4FE22.senderUid, itemInfo4FE22, false, "assem self critical", 8);
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        }
                                        ItemInfo4FE itemInfo4FE23 = c76443TzL.LIZJ;
                                        if (itemInfo4FE23 != null) {
                                            str8 = itemInfo4FE23.senderUid;
                                        }
                                        i = 1;
                                        C76272Twa.LJJIL(1, str8, this.LJLIL.LJLLILLLL, false);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    BattleItem4FEModel battleItem4FEModel17 = this.LJLIL.LJLZ;
                                    if (battleItem4FEModel17 != null && (list5 = battleItem4FEModel17.itemList) != null) {
                                        ItemInfo4FE itemInfo4FE24 = c76443TzL.LIZJ;
                                        if (itemInfo4FE24 != null) {
                                            list5.add(itemInfo4FE24);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    MatchItemAssem matchItemAssem11 = this.LJLIL;
                                    BattleItem4FEModel battleItem4FEModel18 = matchItemAssem11.LJLZ;
                                    if (battleItem4FEModel18 != null) {
                                        i = 1;
                                        matchItemAssem11.W3(1, battleItem4FEModel18);
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                }
                                this.LJLIL.U3("use Critical Card");
                                this.LJLIL.H3(i, selfCriticals);
                                MatchItemAssem matchItemAssem12 = this.LJLIL;
                                ItemInfo4FE itemInfo4FE25 = c76443TzL.LIZJ;
                                if (itemInfo4FE25 != null) {
                                    matchItemAssem12.K3(i, itemInfo4FE25, false);
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            } else {
                                "Required value was null.".toString();
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                } else {
                    long j2 = 30;
                    if (i11 != 1) {
                        if (i11 == 2 && (itemInfo4FE = c76443TzL.LIZJ) != null && itemInfo4FE.sendTimeSec > 0) {
                            StringBuilder LIZ5 = X1D.LIZ();
                            LIZ5.append("rival used  SMOKE_CARD debuff -effectStartTimeSec = -->>>");
                            ItemInfo4FE itemInfo4FE26 = c76443TzL.LIZJ;
                            if (itemInfo4FE26 != null) {
                                l = Long.valueOf(itemInfo4FE26.effectStartTimeSec);
                            }
                            LIZ5.append(l);
                            C0NB.LJIIIZ("MatchItemAssem", X1D.LIZIZ(LIZ5));
                            ItemInfo4FE itemInfo4FE27 = c76443TzL.LIZJ;
                            if (itemInfo4FE27 != null && itemInfo4FE27.effectStartTimeSec > 0) {
                                DataChannel dataChannel4 = this.LJLIL.LJLLI;
                                if (dataChannel4 != null) {
                                    dataChannel4.rv0(BattleSmokeDebuffChannel.class, EnumC76461Tzd.EFFECTING);
                                }
                                this.LJLIL.N3(true);
                                ItemInfo4FE itemInfo4FE28 = c76443TzL.LIZJ;
                                if (itemInfo4FE28 != null) {
                                    if (itemInfo4FE28.effectStartTimeSec * 1000 >= C30725C4b.LIZIZ()) {
                                        ItemInfo4FE itemInfo4FE29 = c76443TzL.LIZJ;
                                        if (itemInfo4FE29 != null) {
                                            j2 = itemInfo4FE29.effectLastDuration;
                                        }
                                    } else {
                                        ItemInfo4FE itemInfo4FE30 = c76443TzL.LIZJ;
                                        if (itemInfo4FE30 != null) {
                                            long j3 = itemInfo4FE30.effectLastDuration;
                                            long LIZIZ5 = C30725C4b.LIZIZ();
                                            ItemInfo4FE itemInfo4FE31 = c76443TzL.LIZJ;
                                            if (itemInfo4FE31 != null) {
                                                j2 = j3 - ((LIZIZ5 - (itemInfo4FE31.effectStartTimeSec * 1000)) / 1000);
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    C44878HjO.LIZJ("rival used  SMOKE_CARD debuff --->>>", j2, "MatchItemAssem");
                                    UCK uck3 = UCK.SMOKE_CARD;
                                    String value3 = uck3.getValue();
                                    ItemInfo4FE itemInfo4FE32 = c76443TzL.LIZJ;
                                    if (itemInfo4FE32 != null) {
                                        C76457TzZ.LJFF(itemInfo4FE32.sendTimeSec, value3, this.LJLIL.LJLLILLLL);
                                        C76457TzZ.LIZIZ(uck3.getValue(), this.LJLIL.LJLLILLLL);
                                        MatchItemAssem matchItemAssem13 = this.LJLIL;
                                        ItemInfo4FE itemInfo4FE33 = c76443TzL.LIZJ;
                                        if (itemInfo4FE33 != null) {
                                            matchItemAssem13.I3(2, j2, itemInfo4FE33);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        }
                    } else {
                        ItemInfo4FE itemInfo4FE34 = c76443TzL.LIZJ;
                        if (itemInfo4FE34 != null && itemInfo4FE34.sendTimeSec > 0) {
                            StringBuilder LIZ6 = X1D.LIZ();
                            LIZ6.append("rival used  CRITICAL_STRIKE_CARD debuff --effectStartTimeSec = ->>>");
                            ItemInfo4FE itemInfo4FE35 = c76443TzL.LIZJ;
                            if (itemInfo4FE35 != null) {
                                l2 = Long.valueOf(itemInfo4FE35.effectStartTimeSec);
                            }
                            LIZ6.append(l2);
                            C0NB.LJIIIZ("MatchItemAssem", X1D.LIZIZ(LIZ6));
                            ItemInfo4FE itemInfo4FE36 = c76443TzL.LIZJ;
                            if (itemInfo4FE36 != null && itemInfo4FE36.effectStartTimeSec > 0) {
                                if (itemInfo4FE36 != null) {
                                    if (itemInfo4FE36.effectStartTimeSec * 1000 >= C30725C4b.LIZIZ()) {
                                        ItemInfo4FE itemInfo4FE37 = c76443TzL.LIZJ;
                                        if (itemInfo4FE37 != null) {
                                            j2 = itemInfo4FE37.effectLastDuration;
                                        }
                                    } else {
                                        ItemInfo4FE itemInfo4FE38 = c76443TzL.LIZJ;
                                        if (itemInfo4FE38 != null) {
                                            long j4 = itemInfo4FE38.effectLastDuration;
                                            long LIZIZ6 = C30725C4b.LIZIZ();
                                            ItemInfo4FE itemInfo4FE39 = c76443TzL.LIZJ;
                                            if (itemInfo4FE39 != null) {
                                                j2 = j4 - ((LIZIZ6 - (itemInfo4FE39.effectStartTimeSec * 1000)) / 1000);
                                            } else {
                                                "Required value was null.".toString();
                                                throw new IllegalArgumentException("Required value was null.");
                                            }
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                    C44878HjO.LIZJ("rival used  CRITICAL_STRIKE_CARD debuff --->>>", j2, "MatchItemAssem");
                                    UCK uck4 = UCK.STRIKE_CARD;
                                    String value4 = uck4.getValue();
                                    ItemInfo4FE itemInfo4FE40 = c76443TzL.LIZJ;
                                    if (itemInfo4FE40 != null) {
                                        C76457TzZ.LJFF(itemInfo4FE40.sendTimeSec, value4, this.LJLIL.LJLLILLLL);
                                        C76457TzZ.LIZIZ(uck4.getValue(), this.LJLIL.LJLLILLLL);
                                        MatchItemAssem matchItemAssem14 = this.LJLIL;
                                        ItemInfo4FE itemInfo4FE41 = c76443TzL.LIZJ;
                                        if (itemInfo4FE41 != null) {
                                            matchItemAssem14.I3(1, j2, itemInfo4FE41);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    } else {
                                        "Required value was null.".toString();
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                } else {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                            }
                        }
                    }
                }
            } else if (action instanceof C76442TzK) {
                StringBuilder LIZ7 = X1D.LIZ();
                LIZ7.append("award ItemCard cardType = ");
                C76442TzK c76442TzK = (C76442TzK) action;
                LIZ7.append(c76442TzK.LIZ);
                C0NB.LJ("MatchItemAssem", X1D.LIZIZ(LIZ7));
                if (c76442TzK.LIZLLL != null) {
                    this.LJLIL.P3(c76442TzK);
                    C73943T0h LIZ8 = C73943T0h.LIZ();
                    Room room = this.LJLIL.LJLLJ;
                    if (room != null) {
                        j = room.getId();
                    }
                    LIZ8.LIZIZ(new C32346Cmk(j, this.LJLIL.LJLLLLLL));
                    C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLILIL;
                    if ((!c48459J0d.LIZJ().booleanValue() && c76442TzK.LIZ == 1) || (!InterfaceC30442Bx8.LLILL.LIZJ().booleanValue() && c76442TzK.LIZ == 2)) {
                        MatchItemAssem matchItemAssem15 = this.LJLIL;
                        EnumC62172cH.AWARD_CARD.getSource();
                        ItemInfo4FE itemInfo4FE42 = c76442TzK.LIZLLL;
                        if (itemInfo4FE42 != null) {
                            matchItemAssem15.Q3(itemInfo4FE42, c76442TzK.LIZIZ, c76442TzK.LIZJ);
                            DataChannel dataChannel5 = this.LJLIL.LJLLI;
                            if (dataChannel5 != null) {
                                ItemInfo4FE itemInfo4FE43 = c76442TzK.LIZLLL;
                                if (itemInfo4FE43 != null) {
                                    num3 = Integer.valueOf(itemInfo4FE43.itemType);
                                } else {
                                    num3 = null;
                                }
                                ItemInfo4FE itemInfo4FE44 = c76442TzK.LIZLLL;
                                if (itemInfo4FE44 != null && (str2 = itemInfo4FE44.itemId) != null) {
                                    l3 = C38350F3i.LJJIZ(str2);
                                }
                                ((C32537Cpp) dataChannel5.gv0(C32648Crc.class)).LIZ = new C32616Cr6(num3, l3, System.currentTimeMillis(), EnumC124204u8.DETAIL_PAGE);
                            }
                            if (c76442TzK.LIZ == 1) {
                                c48459J0d.LIZ(Boolean.TRUE);
                            }
                            if (c76442TzK.LIZ == 2) {
                                InterfaceC30442Bx8.LLILL.LIZ(Boolean.TRUE);
                            }
                            C1JD.LJIJI(c76442TzK.LIZ, c76442TzK.LIZIZ, c76442TzK.LIZJ);
                            C76272Twa.LJJIFFI(c76442TzK.LIZ);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    } else {
                        MatchItemAssem matchItemAssem16 = this.LJLIL;
                        ItemInfo4FE itemInfo4FE45 = c76442TzK.LIZLLL;
                        if (itemInfo4FE45 != null) {
                            num2 = Integer.valueOf(itemInfo4FE45.itemType);
                        } else {
                            num2 = null;
                        }
                        ItemInfo4FE itemInfo4FE46 = c76442TzK.LIZLLL;
                        if (itemInfo4FE46 != null && (str = itemInfo4FE46.itemId) != null) {
                            l4 = C38350F3i.LJJIZ(str);
                        }
                        matchItemAssem16.getClass();
                        MatchItemAssem.L3(num2, l4);
                    }
                }
            } else if (o.LJ(action, C76452TzU.LIZ)) {
                C15610jN.LIZJ(new ARunnableS49S0100000_13(this.LJLIL, 139), 2000L);
            } else if (action instanceof C76449TzR) {
                C76449TzR c76449TzR = (C76449TzR) action;
                boolean z4 = c76449TzR.LIZIZ;
                int i12 = c76449TzR.LIZ;
                StringBuilder LIZ9 = X1D.LIZ();
                LIZ9.append("receive----->>>>REMOVE ==>>>");
                List<ItemInfo4FE> list29 = rivalSmokes.itemList;
                if (list29 != null) {
                    num = Integer.valueOf(list29.size());
                } else {
                    num = null;
                }
                LIZ9.append(num);
                LIZ9.append(" isSelft = ");
                LIZ9.append(z4);
                C0NB.LIZIZ("MatchItemAssem", X1D.LIZIZ(LIZ9));
                if (z4) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            DataChannel dataChannel6 = this.LJLIL.LJLLI;
                            if (dataChannel6 != null) {
                                dataChannel6.rv0(BattleSmokeCardEffectChannel.class, EnumC76461Tzd.NORMAL);
                            }
                            BattleItem4FEModel battleItem4FEModel19 = this.LJLIL.LJZ;
                            if (battleItem4FEModel19 != null && (list3 = battleItem4FEModel19.itemList) != null) {
                                list3.clear();
                            }
                            this.LJLIL.M3(false);
                            this.LJLIL.LLIFFJFJJ = -1L;
                        }
                    } else {
                        DataChannel dataChannel7 = this.LJLIL.LJLLI;
                        if (dataChannel7 != null) {
                            dataChannel7.rv0(BattleCriticalStrikeCardEffectChannel.class, EnumC76461Tzd.NORMAL);
                        }
                        BattleItem4FEModel battleItem4FEModel20 = this.LJLIL.LJLZ;
                        if (battleItem4FEModel20 != null && (list2 = battleItem4FEModel20.itemList) != null) {
                            list2.clear();
                        }
                        this.LJLIL.LLII = -1L;
                        UCK uck5 = UCK.STRIKE_CARD;
                        C76457TzZ.LJFF(0L, uck5.getValue(), this.LJLIL.LJLLILLLL);
                        C76457TzZ.LIZLLL(uck5.getValue(), this.LJLIL.LJLLILLLL);
                    }
                } else {
                    StringBuilder LIZ10 = X1D.LIZ();
                    LIZ10.append("receive----->>>>REMOVE ==>>>");
                    List<ItemInfo4FE> list30 = rivalSmokes.itemList;
                    if (list30 != null) {
                        num8 = Integer.valueOf(list30.size());
                    }
                    QZY.LIZJ(LIZ10, num8, LIZ10, "MatchItemAssem");
                    if (i12 == 2) {
                        List<ItemInfo4FE> list31 = rivalSmokes.itemList;
                        if (list31 == null || list31.isEmpty()) {
                            DataChannel dataChannel8 = this.LJLIL.LJLLI;
                            if (dataChannel8 != null) {
                                dataChannel8.rv0(BattleSmokeDebuffChannel.class, EnumC76461Tzd.NORMAL);
                            }
                            this.LJLIL.N3(false);
                            C01R.LIZIZ(System.currentTimeMillis(), new C78528Urs(C65232Piu.LIZJ("item_type", "2")), "EVENT_MATCH_ITEM_FOG_ALL_END");
                            this.LJLIL.LLFZ = -1L;
                        }
                    } else if (i12 == 1 && ((list = rivalCriticals.itemList) == null || list.isEmpty())) {
                        DataChannel dataChannel9 = this.LJLIL.LJLLI;
                        if (dataChannel9 != null) {
                            dataChannel9.rv0(BattleCriticalDebuffChannel.class, EnumC76461Tzd.NORMAL);
                        }
                        this.LJLIL.LLI = -1L;
                        UCK uck6 = UCK.STRIKE_CARD;
                        C76457TzZ.LJFF(0L, uck6.getValue(), this.LJLIL.LJLLILLLL);
                        C76457TzZ.LIZLLL(uck6.getValue(), this.LJLIL.LJLLILLLL);
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
