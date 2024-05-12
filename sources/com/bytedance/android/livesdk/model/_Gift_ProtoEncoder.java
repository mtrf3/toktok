package com.bytedance.android.livesdk.model;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.livesdk.gift.model.GiftColorInfo;
import com.bytedance.android.livesdk.gift.model._GiftColorInfo_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class _Gift_ProtoEncoder implements InterfaceC64604PXc<Gift> {
    public static void LIZIZ(CD6 cd6, Gift gift) {
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, gift.image);
        C30957CCz.LIZLLL(cd6, 2, gift.describe);
        long j = gift.duration;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j);
        long j2 = gift.id;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j2);
        boolean z = gift.forLinkMic;
        cd6.LIZLLL(7, 0);
        cd6.LJ(z ? 1 : 0);
        boolean z2 = gift.combo;
        cd6.LIZLLL(10, 0);
        cd6.LJ(z2 ? 1 : 0);
        int i = gift.type;
        cd6.LIZLLL(11, 0);
        cd6.LIZJ(i);
        int i2 = gift.diamondCount;
        cd6.LIZLLL(12, 0);
        cd6.LIZJ(i2);
        boolean z3 = gift.isDisplayedOnPanel;
        cd6.LIZLLL(13, 0);
        cd6.LJ(z3 ? 1 : 0);
        long j3 = gift.primaryEffectId;
        cd6.LIZLLL(14, 0);
        cd6.LJFF(j3);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 15, gift.leftLogo);
        C30957CCz.LIZLLL(cd6, 16, gift.name);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 21, gift.icon);
        C30957CCz.LIZLLL(cd6, 24, gift.liveUserPngInfo);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 47, gift.previewImage);
        GiftPanelBanner giftPanelBanner = gift.giftPanelBanner;
        if (giftPanelBanner != null) {
            cd6.LIZLLL(48, 2);
            cd6.LJ(_GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner));
            _GiftPanelBanner_ProtoEncoder.LIZIZ(cd6, giftPanelBanner);
        }
        boolean z4 = gift.isBroadcastGift;
        cd6.LIZLLL(49, 0);
        cd6.LJ(z4 ? 1 : 0);
        boolean z5 = gift.isEffectBEFView;
        cd6.LIZLLL(50, 0);
        cd6.LJ(z5 ? 1 : 0);
        boolean z6 = gift.isRandomGift;
        cd6.LIZLLL(51, 0);
        cd6.LJ(z6 ? 1 : 0);
        boolean z7 = gift.isBoxGift;
        cd6.LIZLLL(52, 0);
        cd6.LJ(z7 ? 1 : 0);
        boolean z8 = gift.canPutInGiftBox;
        cd6.LIZLLL(53, 0);
        cd6.LJ(z8 ? 1 : 0);
        GiftBoxInfo giftBoxInfo = gift.giftBoxInfo;
        if (giftBoxInfo != null) {
            cd6.LIZLLL(54, 2);
            cd6.LJ(_GiftBoxInfo_ProtoEncoder.LIZIZ(giftBoxInfo));
            long j4 = giftBoxInfo.capacity;
            cd6.LIZLLL(1, 0);
            cd6.LJFF(j4);
            boolean z9 = giftBoxInfo.isPrimaryBox;
            cd6.LIZLLL(2, 0);
            cd6.LJ(z9 ? 1 : 0);
            C30957CCz.LIZLLL(cd6, 3, giftBoxInfo.schemeUrl);
        }
        Map<String, String> map = gift.trackerParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : gift.trackerParams.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    cd6.LIZLLL(100, 2);
                    cd6.LJ(C30957CCz.LJIIL(2, entry.getValue()) + C30957CCz.LJIIL(1, entry.getKey()));
                    C30957CCz.LIZLLL(cd6, 1, entry.getKey());
                    C30957CCz.LIZLLL(cd6, 2, entry.getValue());
                }
            }
        }
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo != null) {
            cd6.LIZLLL(101, 2);
            cd6.LJ(_GiftLockInfo_ProtoEncoder.LIZJ(giftLockInfo));
            _GiftLockInfo_ProtoEncoder.LIZIZ(cd6, giftLockInfo);
        }
        List<GiftColorInfo> list = gift.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i3 = 0; i3 < gift.colorInfos.size(); i3++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(gift.colorInfos, i3);
                if (giftColorInfo != null) {
                    cd6.LIZLLL(102, 2);
                    cd6.LJ(_GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo));
                    _GiftColorInfo_ProtoEncoder.LIZIZ(cd6, giftColorInfo);
                }
            }
        }
        C30957CCz.LIZLLL(cd6, 103, gift.recommendInfo);
        GiftRandomEffectInfo giftRandomEffectInfo = gift.randomEffectInfo;
        if (giftRandomEffectInfo != null) {
            cd6.LIZLLL(104, 2);
            cd6.LJ(_GiftRandomEffectInfo_ProtoEncoder.LIZJ(giftRandomEffectInfo));
            _GiftRandomEffectInfo_ProtoEncoder.LIZIZ(cd6, giftRandomEffectInfo);
        }
        int i4 = gift.giftSubType;
        cd6.LIZLLL(105, 0);
        cd6.LIZJ(i4);
        List<Integer> list2 = gift.giftVerticalScenarios;
        if (list2 != null && !list2.isEmpty()) {
            for (int i5 = 0; i5 < gift.giftVerticalScenarios.size(); i5++) {
                C30957CCz.LIZIZ(cd6, 106, (Integer) ListProtector.get(gift.giftVerticalScenarios, i5));
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, Gift gift) {
        LIZIZ(cd6, gift);
    }

    public static void LIZJ(CD6 cd6, int i, Gift gift) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZ4;
        int LIZ5;
        if (gift == null) {
            return;
        }
        cd6.LIZLLL(i, 2);
        int LJ = _ImageModel_ProtoEncoder.LJ(47, gift.previewImage) + C30957CCz.LJIIL(24, gift.liveUserPngInfo) + _ImageModel_ProtoEncoder.LJ(21, gift.icon) + C30957CCz.LJIIL(16, gift.name) + _ImageModel_ProtoEncoder.LJ(15, gift.leftLogo) + C30957CCz.LJIIIZ(14, gift.primaryEffectId) + C30957CCz.LJ(13) + C30957CCz.LJI(12, gift.diamondCount) + C30957CCz.LJI(11, gift.type) + C30957CCz.LJ(10) + C30957CCz.LJ(7) + C30957CCz.LJIIIZ(5, gift.id) + C30957CCz.LJIIIZ(4, gift.duration) + C30957CCz.LJIIL(2, gift.describe) + _ImageModel_ProtoEncoder.LJ(1, gift.image);
        GiftPanelBanner giftPanelBanner = gift.giftPanelBanner;
        if (giftPanelBanner == null) {
            LIZ = 0;
        } else {
            int LIZJ = _GiftPanelBanner_ProtoEncoder.LIZJ(giftPanelBanner);
            LIZ = CD6.LIZ(48) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int LJ2 = C30957CCz.LJ(53) + C30957CCz.LJ(52) + C30957CCz.LJ(51) + C30957CCz.LJ(50) + C30957CCz.LJ(49) + LJ + LIZ;
        GiftBoxInfo giftBoxInfo = gift.giftBoxInfo;
        if (giftBoxInfo == null) {
            LIZ2 = 0;
        } else {
            int LIZIZ = _GiftBoxInfo_ProtoEncoder.LIZIZ(giftBoxInfo);
            LIZ2 = CD6.LIZ(54) + CD6.LIZIZ(LIZIZ) + LIZIZ;
        }
        int i2 = LJ2 + LIZ2;
        Map<String, String> map = gift.trackerParams;
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : gift.trackerParams.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    int LJIIL = C30957CCz.LJIIL(2, entry.getValue()) + C30957CCz.LJIIL(1, entry.getKey());
                    i2 += CD6.LIZ(100) + CD6.LIZIZ(LJIIL) + LJIIL;
                }
            }
        }
        GiftLockInfo giftLockInfo = gift.giftSubInfo;
        if (giftLockInfo == null) {
            LIZ3 = 0;
        } else {
            int LIZJ2 = _GiftLockInfo_ProtoEncoder.LIZJ(giftLockInfo);
            LIZ3 = CD6.LIZ(101) + CD6.LIZIZ(LIZJ2) + LIZJ2;
        }
        int i3 = i2 + LIZ3;
        List<GiftColorInfo> list = gift.colorInfos;
        if (list != null && !list.isEmpty()) {
            for (int i4 = 0; i4 < gift.colorInfos.size(); i4++) {
                GiftColorInfo giftColorInfo = (GiftColorInfo) ListProtector.get(gift.colorInfos, i4);
                if (giftColorInfo == null) {
                    LIZ5 = 0;
                } else {
                    int LIZJ3 = _GiftColorInfo_ProtoEncoder.LIZJ(giftColorInfo);
                    LIZ5 = CD6.LIZ(102) + CD6.LIZIZ(LIZJ3) + LIZJ3;
                }
                i3 += LIZ5;
            }
        }
        int LJIIL2 = C30957CCz.LJIIL(103, gift.recommendInfo) + i3;
        GiftRandomEffectInfo giftRandomEffectInfo = gift.randomEffectInfo;
        if (giftRandomEffectInfo == null) {
            LIZ4 = 0;
        } else {
            int LIZJ4 = _GiftRandomEffectInfo_ProtoEncoder.LIZJ(giftRandomEffectInfo);
            LIZ4 = CD6.LIZ(104) + CD6.LIZIZ(LIZJ4) + LIZJ4;
        }
        int LJI = C30957CCz.LJI(105, gift.giftSubType) + LJIIL2 + LIZ4;
        List<Integer> list2 = gift.giftVerticalScenarios;
        if (list2 != null && !list2.isEmpty()) {
            for (int i5 = 0; i5 < gift.giftVerticalScenarios.size(); i5++) {
                LJI += C30957CCz.LJII(106, (Integer) ListProtector.get(gift.giftVerticalScenarios, i5));
            }
        }
        cd6.LJ(LJI);
        LIZIZ(cd6, gift);
    }
}
