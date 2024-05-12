package com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard;

import X.C012403c;
import X.C07670Rv;
import X.C0NB;
import X.C16880lQ;
import X.C29306Beo;
import X.C30725C4b;
import X.C73098SmU;
import X.C75989Ts1;
import X.C76439TzH;
import X.C76449TzR;
import X.C76451TzT;
import X.C86881Y7x;
import X.EnumC76178Tv4;
import X.InterfaceC75871Tq7;
import X.InterfaceC76347Txn;
import X.InterfaceC76348Txo;
import X.V10;
import X.X1D;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.BattleItem4FEModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.EffectingCard;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes14.dex */
public final class MatchFeedItemViewModel extends ViewModel {
    public long LJLIL;
    public DataChannel LJLILLLLZI;
    public C76439TzH LJLJI = new C76439TzH(0);
    public final MutableLiveData<C76439TzH> LJLJJI = new MutableLiveData<>();
    public EnumC76178Tv4 LJLJJL = EnumC76178Tv4.NORMAL;
    public InterfaceC76348Txo LJLJJLL;

    public final C76439TzH iv0() {
        C76439TzH value = this.LJLJJI.getValue();
        if (value == null) {
            return this.LJLJI;
        }
        return value;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C0NB.LJ("MatchFeedItemViewModel", "onClear");
        DataChannel dataChannel = this.LJLILLLLZI;
        if (dataChannel != null) {
            dataChannel.jv0(this);
        }
        this.LJLILLLLZI = null;
        C29306Beo.LJIL(null);
        super.onCleared();
    }

    public final void Rh0(int i) {
        if (i <= 0) {
            return;
        }
        C012403c.LJ("remove Rival card by type = ", i, "MatchFeedItemViewModel");
        if (i != 1) {
            if (i != 2) {
                return;
            }
            jv0(C76439TzH.M(this.LJLJI, null, null, null, new BattleItem4FEModel(), new C76449TzR(i, false), 7));
            return;
        }
        jv0(C76439TzH.M(this.LJLJI, null, null, new BattleItem4FEModel(), null, new C76449TzR(i, false), 11));
    }

    public final void Ym0(BattleInfoResponse battleInfoResponse) {
        Map<Long, EffectingCard> map;
        Long l;
        Long l2;
        long j;
        long j2;
        EffectingCard effectingCard;
        List<ItemInfo4FE> list;
        List<ItemInfo4FE> list2;
        EffectingCard effectingCard2;
        boolean z;
        boolean z2;
        long j3;
        List<ItemInfo4FE> list3;
        GiftModeMeta giftModeMeta;
        String str;
        String str2;
        GiftModeMeta giftModeMeta2;
        GiftModeMeta giftModeMeta3;
        GiftModeMeta giftModeMeta4;
        boolean z3;
        long j4;
        String str3;
        List<ItemInfo4FE> list4;
        GiftModeMeta giftModeMeta5;
        String str4;
        String str5;
        GiftModeMeta giftModeMeta6;
        GiftModeMeta giftModeMeta7;
        GiftModeMeta giftModeMeta8;
        InterfaceC76347Txn LIZ;
        InterfaceC75871Tq7 LIZIZ;
        C75989Ts1 LJ;
        InterfaceC76347Txn LIZ2;
        InterfaceC75871Tq7 LIZIZ2;
        C75989Ts1 LJFF;
        if (battleInfoResponse == null || (map = battleInfoResponse.battleItemCards) == null || map.isEmpty()) {
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("battleInfo sync ");
        if (battleInfoResponse != null) {
            l = battleInfoResponse.battleId;
        } else {
            l = null;
        }
        C07670Rv.LJ(LIZ3, l, LIZ3, "MatchFeedItemViewModel");
        if (battleInfoResponse != null && (l2 = battleInfoResponse.battleId) != null) {
            l2.longValue();
            InterfaceC76348Txo interfaceC76348Txo = this.LJLJJLL;
            long j5 = 0;
            if (interfaceC76348Txo != null && (LIZ2 = interfaceC76348Txo.LIZ()) != null && (LIZIZ2 = LIZ2.LIZIZ()) != null && (LJFF = LIZIZ2.LJFF()) != null) {
                j = LJFF.LIZIZ;
            } else {
                j = 0;
            }
            InterfaceC76348Txo interfaceC76348Txo2 = this.LJLJJLL;
            if (interfaceC76348Txo2 != null && (LIZ = interfaceC76348Txo2.LIZ()) != null && (LIZIZ = LIZ.LIZIZ()) != null && (LJ = LIZIZ.LJ()) != null) {
                j2 = LJ.LIZIZ;
            } else {
                j2 = 0;
            }
            StringBuilder LIZJ = V10.LIZJ("SyncWen Enter room, currentAnchorId=", j, " currentRivalId=");
            LIZJ.append(j2);
            C0NB.LJIIIZ("MatchFeedItemViewModel", X1D.LIZIZ(LIZJ));
            BattleItem4FEModel battleItem4FEModel = new BattleItem4FEModel();
            BattleItem4FEModel battleItem4FEModel2 = new BattleItem4FEModel();
            BattleItem4FEModel battleItem4FEModel3 = new BattleItem4FEModel();
            BattleItem4FEModel battleItem4FEModel4 = new BattleItem4FEModel();
            Map<Long, EffectingCard> map2 = battleInfoResponse.battleItemCards;
            if (map2 != null && (effectingCard2 = map2.get(Long.valueOf(this.LJLIL))) != null) {
                List<CriticalStrikeCardInfo> list5 = effectingCard2.criticalStrikeCards;
                if (list5 == null || list5.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                String str6 = "";
                if (!z) {
                    battleItem4FEModel.isSelfTeam = true;
                    battleItem4FEModel.itemType = 1;
                    battleItem4FEModel.itemList = new ArrayList();
                    BattleSetting battleSetting = battleInfoResponse.setting;
                    if (battleSetting != null && (giftModeMeta8 = battleSetting.giftModeMeta) != null && giftModeMeta8.giftId == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    battleItem4FEModel.isGiftOnlyMatch = !z3;
                    if (battleSetting != null && (giftModeMeta7 = battleSetting.giftModeMeta) != null) {
                        j4 = giftModeMeta7.giftId;
                    } else {
                        j4 = 0;
                    }
                    battleItem4FEModel.giftOnlyId = j4;
                    if (battleSetting == null || (giftModeMeta5 = battleSetting.giftModeMeta) == null || (str4 = giftModeMeta5.giftNameKey) == null || str4.length() == 0) {
                        str3 = "";
                    } else {
                        C86881Y7x LIZIZ3 = C86881Y7x.LIZIZ();
                        BattleSetting battleSetting2 = battleInfoResponse.setting;
                        if (battleSetting2 != null && (giftModeMeta6 = battleSetting2.giftModeMeta) != null) {
                            str5 = giftModeMeta6.giftNameKey;
                        } else {
                            str5 = null;
                        }
                        str3 = LIZIZ3.LIZ(str5);
                    }
                    battleItem4FEModel.giftOnlyName = str3;
                    List<CriticalStrikeCardInfo> list6 = effectingCard2.criticalStrikeCards;
                    if (list6 != null) {
                        for (CriticalStrikeCardInfo criticalStrikeCardInfo : list6) {
                            if (criticalStrikeCardInfo != null) {
                                long j6 = criticalStrikeCardInfo.effectTimeSec;
                                if (j6 > j5 && j6 + criticalStrikeCardInfo.effectLastDuration >= (C30725C4b.LIZ() / 1000) + 2 && (list4 = battleItem4FEModel.itemList) != null) {
                                    list4.add(hv0(this, criticalStrikeCardInfo));
                                }
                            }
                            j5 = 0;
                        }
                    }
                }
                List<SmokeCardInfo> list7 = effectingCard2.smokeCards;
                if (list7 != null && !list7.isEmpty()) {
                    battleItem4FEModel2.isSelfTeam = true;
                    battleItem4FEModel2.itemType = 2;
                    battleItem4FEModel2.itemList = new ArrayList();
                    BattleSetting battleSetting3 = battleInfoResponse.setting;
                    if (battleSetting3 != null && (giftModeMeta4 = battleSetting3.giftModeMeta) != null && giftModeMeta4.giftId == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    battleItem4FEModel2.isGiftOnlyMatch = !z2;
                    if (battleSetting3 != null && (giftModeMeta3 = battleSetting3.giftModeMeta) != null) {
                        j3 = giftModeMeta3.giftId;
                    } else {
                        j3 = 0;
                    }
                    battleItem4FEModel2.giftOnlyId = j3;
                    if (battleSetting3 != null && (giftModeMeta = battleSetting3.giftModeMeta) != null && (str = giftModeMeta.giftNameKey) != null && str.length() != 0) {
                        C86881Y7x LIZIZ4 = C86881Y7x.LIZIZ();
                        BattleSetting battleSetting4 = battleInfoResponse.setting;
                        if (battleSetting4 != null && (giftModeMeta2 = battleSetting4.giftModeMeta) != null) {
                            str2 = giftModeMeta2.giftNameKey;
                        } else {
                            str2 = null;
                        }
                        str6 = LIZIZ4.LIZ(str2);
                    }
                    battleItem4FEModel2.giftOnlyName = str6;
                    List<SmokeCardInfo> list8 = effectingCard2.smokeCards;
                    if (list8 != null) {
                        for (SmokeCardInfo smokeCardInfo : list8) {
                            if (smokeCardInfo != null) {
                                long j7 = smokeCardInfo.effectTimeSec;
                                if (j7 > 0 && j7 + smokeCardInfo.effectLastDuration >= (C30725C4b.LIZ() / 1000) + 2 && (list3 = battleItem4FEModel2.itemList) != null) {
                                    list3.add(gv0(smokeCardInfo));
                                }
                            }
                        }
                    }
                }
            }
            Map<Long, EffectingCard> map3 = battleInfoResponse.battleItemCards;
            if (map3 != null && (effectingCard = map3.get(Long.valueOf(j2))) != null) {
                List<CriticalStrikeCardInfo> list9 = effectingCard.criticalStrikeCards;
                if (list9 != null && !list9.isEmpty()) {
                    battleItem4FEModel3.isSelfTeam = false;
                    battleItem4FEModel3.itemType = 1;
                    battleItem4FEModel3.itemList = new ArrayList();
                    List<CriticalStrikeCardInfo> list10 = effectingCard.criticalStrikeCards;
                    if (list10 != null) {
                        for (CriticalStrikeCardInfo criticalStrikeCardInfo2 : list10) {
                            if (criticalStrikeCardInfo2 != null && (list2 = battleItem4FEModel3.itemList) != null) {
                                list2.add(hv0(this, criticalStrikeCardInfo2));
                            }
                        }
                    }
                }
                List<SmokeCardInfo> list11 = effectingCard.smokeCards;
                if (list11 != null && !list11.isEmpty()) {
                    battleItem4FEModel4.isSelfTeam = false;
                    battleItem4FEModel4.itemType = 2;
                    battleItem4FEModel4.itemList = new ArrayList();
                    List<SmokeCardInfo> list12 = effectingCard.smokeCards;
                    if (list12 != null) {
                        for (SmokeCardInfo smokeCardInfo2 : list12) {
                            if (smokeCardInfo2 != null && (list = battleItem4FEModel4.itemList) != null) {
                                list.add(gv0(smokeCardInfo2));
                            }
                        }
                    }
                }
            }
            C76439TzH c76439TzH = this.LJLJI;
            C76451TzT c76451TzT = C76451TzT.LIZ;
            c76439TzH.getClass();
            jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel3, battleItem4FEModel4, c76451TzT));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b9, code lost:
    
        if (r2 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE gv0(com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo r8) {
        /*
            r7 = this;
            com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE r6 = new com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE
            r6.<init>()
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r1 = r8.sendUser
            r3 = 0
            if (r1 == 0) goto Lc0
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r1.user
            if (r0 == 0) goto Lc0
            com.bytedance.android.live.base.model.ImageModel r0 = r0.avatarThumb
        L10:
            r6.avatarThumb = r0
            java.lang.String r2 = ""
            if (r1 == 0) goto L2d
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r1.user
            if (r0 == 0) goto L2d
            com.bytedance.android.live.base.model.ImageModel r0 = r0.avatarThumb
            if (r0 == 0) goto L2d
            java.util.List r1 = r0.getUrls()
            if (r1 == 0) goto L2d
            r0 = 0
            java.lang.Object r0 = X.ORZ.LJLLLLLL(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L2e
        L2d:
            r0 = r2
        L2e:
            r6.senderUserAvatar = r0
            r0 = 2
            r6.itemType = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r6.itemId = r0
            com.bytedance.android.live.base.model.ImageModel r0 = r8.cardImage
            if (r0 == 0) goto Lbe
            java.lang.String r0 = r0.getUri()
        L45:
            r6.itemImage = r0
            X.Y7x r1 = X.C86881Y7x.LIZIZ()
            java.lang.String r0 = r8.cardNameKey
            java.lang.String r0 = r1.LIZ(r0)
            r6.itemName = r0
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r0 = r8.sendUser
            if (r0 == 0) goto L65
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r0.user
            if (r0 == 0) goto L65
            java.lang.Long r0 = r0.userId
            if (r0 == 0) goto L65
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto Lbc
        L65:
            r6.senderUid = r2
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo r2 = r8.sendUser
            if (r2 == 0) goto Lb8
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r2.user
            if (r0 == 0) goto Lb8
            java.lang.String r1 = r0.displayId
        L71:
            com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo r0 = r2.user
            if (r0 == 0) goto L77
            java.lang.String r3 = r0.nickName
        L77:
            java.lang.String r0 = X.C05170If.LIZIZ(r1, r3)
            r6.senderUserName = r0
            long r0 = r8.sendTimeSec
            r6.sendTimeSec = r0
            long r0 = r8.effectLastDuration
            r6.effectLastDuration = r0
            long r0 = r8.effectTimeSec
            r6.effectStartTimeSec = r0
            X.Tws r2 = X.C76316TxI.LIZ
            long r0 = r2.LIZ()
            r6.battleId = r0
            com.bytedance.android.livesdk.model.message.battle.BattleSetting r0 = r2.LIZLLL
            if (r0 == 0) goto Lb1
            long r0 = r0.channelId
        L97:
            r6.channelId = r0
            long r0 = r7.LJLIL
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.currentAnchorId = r0
            long r0 = r8.effectTimeSec
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            long r2 = r8.effectLastDuration
            long r2 = r2 * r4
            long r2 = r2 + r0
            long r0 = X.C31012CFc.LIZIZ
            long r2 = r2 - r0
            long r2 = r2 / r4
            r6.endAt = r2
            return r6
        Lb1:
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = X.B5G.LIZIZ()
            long r0 = r0.LJFF
            goto L97
        Lb8:
            r1 = r3
            if (r2 == 0) goto L77
            goto L71
        Lbc:
            r2 = r0
            goto L65
        Lbe:
            r0 = r3
            goto L45
        Lc0:
            r0 = r3
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel.gv0(com.bytedance.android.livesdkapi.depend.model.live.match.SmokeCardInfo):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    public final void jv0(C76439TzH c76439TzH) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("newstate = ");
        LIZ.append(c76439TzH);
        LIZ.append(' ');
        C0NB.LIZIZ("MatchFeedItemViewModel", X1D.LIZIZ(LIZ));
        if (C73098SmU.LJFF(C16880lQ.LLLLIIIILLL())) {
            this.LJLJJI.setValue(c76439TzH);
            this.LJLJI = c76439TzH;
        } else {
            this.LJLJJI.postValue(c76439TzH);
            this.LJLJI = c76439TzH;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c8, code lost:
    
        if (r2 != null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE hv0(com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel r7, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo r8) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel.hv0(com.bytedance.android.live.liveinteract.multihost.biz.feed.match.itemcard.MatchFeedItemViewModel, com.bytedance.android.livesdkapi.depend.model.live.match.CriticalStrikeCardInfo):com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE");
    }

    public final void al0(int i, boolean z) {
        List<ItemInfo4FE> list;
        BattleItem4FEModel battleItem4FEModel;
        BattleItem4FEModel battleItem4FEModel2;
        BattleItem4FEModel battleItem4FEModel3;
        BattleItem4FEModel battleItem4FEModel4;
        List<ItemInfo4FE> list2;
        List<ItemInfo4FE> list3;
        if (z && i == 1 && ((list3 = iv0().LJLIL.itemList) == null || list3.isEmpty())) {
            return;
        }
        if (z) {
            if (i == 2 && ((list2 = iv0().LJLILLLLZI.itemList) == null || list2.isEmpty())) {
                return;
            }
        } else if (i == 2) {
            List<ItemInfo4FE> list4 = iv0().LJLJJI.itemList;
            if (list4 == null || list4.isEmpty()) {
                return;
            }
        } else if (i == 1 && ((list = iv0().LJLJI.itemList) == null || list.isEmpty())) {
            return;
        }
        C76439TzH c76439TzH = this.LJLJI;
        C76449TzR c76449TzR = new C76449TzR(i, z);
        if (z && i == 1) {
            battleItem4FEModel = new BattleItem4FEModel();
        } else {
            battleItem4FEModel = this.LJLJI.LJLIL;
            if (z && i == 2) {
                battleItem4FEModel2 = new BattleItem4FEModel();
                battleItem4FEModel3 = this.LJLJI.LJLJJI;
                if (!z && i == 1) {
                    battleItem4FEModel4 = new BattleItem4FEModel();
                    c76439TzH.getClass();
                    jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR));
                }
                battleItem4FEModel4 = this.LJLJI.LJLJI;
                c76439TzH.getClass();
                jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR));
            }
        }
        battleItem4FEModel2 = this.LJLJI.LJLILLLLZI;
        if (!z && i == 2) {
            battleItem4FEModel3 = new BattleItem4FEModel();
            battleItem4FEModel4 = this.LJLJI.LJLJI;
            c76439TzH.getClass();
            jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR));
        }
        battleItem4FEModel3 = this.LJLJI.LJLJJI;
        if (!z) {
            battleItem4FEModel4 = new BattleItem4FEModel();
            c76439TzH.getClass();
            jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR));
        }
        battleItem4FEModel4 = this.LJLJI.LJLJI;
        c76439TzH.getClass();
        jv0(C76439TzH.L(battleItem4FEModel, battleItem4FEModel2, battleItem4FEModel4, battleItem4FEModel3, c76449TzR));
    }
}
