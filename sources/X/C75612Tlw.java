package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Tlw, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75612Tlw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        String str;
        String str2 = "quick_pair";
        if (i != 5) {
            if (i != 7) {
                str2 = "topic_pair";
                if (i != 13) {
                    if (i != 14) {
                        C75877TqD.LJIILL = LiveGiftNewGifterBadgeSetting.DEFAULT;
                        return;
                    }
                    str = "topic_recommend";
                } else if (!C75650TmY.LIZJ()) {
                    return;
                } else {
                    str = "topic_match";
                }
            } else {
                str = "quick_recommend";
            }
        } else if (!RandomLinkMicManager.LJIIIIZZ()) {
            return;
        } else {
            str = "quick_match";
        }
        o.LJIIIZ(str, "<set-?>");
        C75877TqD.LJIILL = str;
        o.LJIIIZ(str2, "<set-?>");
        C75877TqD.LJIILLIIL = str2;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("setupQuickLinkInviteCommonParams, quickLinkType=");
        LIZ2.append(str);
        LIZ2.append(", firstLinkedType=");
        LIZ2.append(str2);
        C0NB.LJIIIZ("MultiHostSourceTypeHelper", X1D.LIZIZ(LIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r6, int r7) {
        /*
            r0 = 1
            if (r7 == r0) goto L4
            return
        L4:
            java.lang.String r2 = X.C75877TqD.LJIILL
            java.lang.String r4 = X.C75877TqD.LJIILLIIL
            java.lang.String r0 = "setup quick link type, quickLinkType = "
            java.lang.String r3 = "MultiHostSourceTypeHelper"
            X.FP1.LJFF(r0, r2, r3)
            boolean r0 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJIIIZ()
            if (r0 != 0) goto L1f
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = X.B5G.LIZIZ()
            X.Tly r1 = r0.LJIIJ
            X.Tly r0 = X.EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND
            if (r1 != r0) goto L33
        L1f:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C8E.LIZLLL()
            X.Tm4 r0 = r0.LLII()
            boolean r0 = r0.isLinked()
            if (r0 != 0) goto L33
            r0 = 5
            if (r6 == r0) goto Lad
            r0 = 7
            if (r6 == r0) goto Lb6
        L33:
            r5 = 0
        L34:
            X.Tmv r1 = X.C75650TmY.LJI
            X.Tmv r0 = X.EnumC75673Tmv.IDLE
            int r0 = r1.compareTo(r0)
            if (r0 <= 0) goto La2
        L3e:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C8E.LIZLLL()
            X.Tm4 r0 = r0.LLII()
            boolean r0 = r0.isLinked()
            if (r0 != 0) goto L54
            r0 = 13
            if (r6 == r0) goto L88
            r0 = 14
            if (r6 == r0) goto L97
        L54:
            if (r5 == 0) goto L83
        L56:
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            X.C75877TqD.LJIILL = r2
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            X.C75877TqD.LJIILLIIL = r4
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "setupQuickLinkReplyCommonParams, quickLinkType="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", firstLinkedType="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C0NB.LJIIIZ(r3, r0)
        L7d:
            java.lang.String r0 = "setup quick link type finished, quickLinkType = "
            X.FP1.LJFF(r0, r2, r3)
            return
        L83:
            java.lang.String r0 = "none"
            X.C75877TqD.LJIILL = r0
            goto L7d
        L88:
            boolean r0 = X.C75650TmY.LIZJ()
            if (r0 == 0) goto L54
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C75877TqD.LIZ = r0
            java.lang.String r2 = "topic_match"
            goto L9f
        L97:
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C75877TqD.LIZ = r0
            java.lang.String r2 = "topic_recommend"
        L9f:
            java.lang.String r4 = "topic_pair"
            goto L56
        La2:
            com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder r0 = X.B5G.LIZIZ()
            X.Tly r1 = r0.LJIIJ
            X.Tly r0 = X.EnumC75614Tly.TOPIC_RECOMMEND
            if (r1 != r0) goto L54
            goto L3e
        Lad:
            boolean r0 = com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager.LJII()
            if (r0 == 0) goto L33
            java.lang.String r2 = "quick_match"
            goto Lbe
        Lb6:
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C75877TqD.LIZ = r0
            java.lang.String r2 = "quick_recommend"
        Lbe:
            java.lang.String r4 = "quick_pair"
            r5 = 1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75612Tlw.LIZIZ(int, int):void");
    }

    public static void LIZJ(LinkCrossRoomDataHolder linkCrossRoomDataHolder, int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        if (i != 7) {
                            if (i != 23) {
                                if (i != 20) {
                                    if (i != 21) {
                                        switch (i) {
                                            case 9:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.BEST_TEAMMATE_INVITE);
                                                return;
                                            case 10:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RESERVED_INVITE);
                                                return;
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.PAIRING_INVITE);
                                                return;
                                            case 12:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.PAIRING_ON_RESERVE_INVITE);
                                                return;
                                            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.TOPIC_PAIR);
                                                return;
                                            case 14:
                                                if (linkCrossRoomDataHolder == null) {
                                                    return;
                                                }
                                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.TOPIC_RECOMMEND);
                                                return;
                                            default:
                                                switch (i) {
                                                    case 26:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.DAILY_RANK_INVITE);
                                                        return;
                                                    case 27:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.DAILY_RANK_HALL_OF_FAME_INVITE);
                                                        return;
                                                    case 28:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RESERVATION_BUBBLE_INVITE);
                                                        return;
                                                    case 29:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.PAIRING_BUBBLE_INVITE);
                                                        return;
                                                    case 30:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RANK_LEAGUE_PRELIMINARY_INVITE);
                                                        return;
                                                    case 31:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RANK_LEAGUE_SEMIFINAL_INVITE);
                                                        return;
                                                    case 32:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RANK_LEAGUE_FINAL_INVITE);
                                                        return;
                                                    case 33:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.DAILY_ROOKIE_RANK);
                                                        return;
                                                    case 34:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.MAY_KNOW_INVITE);
                                                        return;
                                                    default:
                                                        if (linkCrossRoomDataHolder == null) {
                                                            return;
                                                        }
                                                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.ACTIVITY);
                                                        EnumC75614Tly enumC75614Tly = linkCrossRoomDataHolder.LJIIJ;
                                                        if (enumC75614Tly == null) {
                                                            return;
                                                        }
                                                        enumC75614Tly.setType(i);
                                                        return;
                                                }
                                        }
                                    }
                                    if (linkCrossRoomDataHolder == null) {
                                        return;
                                    }
                                    linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.HOURLY_RANK_INVITE);
                                    return;
                                }
                                if (linkCrossRoomDataHolder == null) {
                                    return;
                                }
                                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.WEEKLY_RANK_INVITE);
                                return;
                            }
                            if (linkCrossRoomDataHolder == null) {
                                return;
                            }
                            linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.WEEKLY_RISING_INVITE);
                            return;
                        }
                        if (linkCrossRoomDataHolder == null) {
                            return;
                        }
                        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RANDOM_LINK_MIC_RECOMMEND);
                        return;
                    }
                    if (linkCrossRoomDataHolder == null) {
                        return;
                    }
                    linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RANDOM_LINK_MIC_INVITE);
                    return;
                }
                if (linkCrossRoomDataHolder == null) {
                    return;
                }
                linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.RECOMMEND_INVITE);
                return;
            }
            if (linkCrossRoomDataHolder == null) {
                return;
            }
            linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.FOLLOW_INVITE);
            return;
        }
        if (linkCrossRoomDataHolder == null) {
            return;
        }
        linkCrossRoomDataHolder.LJIIIZ(EnumC75614Tly.NONE);
    }
}
