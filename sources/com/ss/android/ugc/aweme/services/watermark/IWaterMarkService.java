package com.ss.android.ugc.aweme.services.watermark;

import X.InterfaceC45930I0w;

/* loaded from: classes8.dex */
public interface IWaterMarkService {
    IExternalWatermarkAbility addEffectWatermark(WaterMarkBuilder waterMarkBuilder);

    void addWaterMarkToImage(InterfaceC45930I0w interfaceC45930I0w, String str, String str2);

    void cancelWaterMark();

    void prepareDataForI18n(WaterMarkBuilder waterMarkBuilder);

    void waterMark(WaterMarkBuilder waterMarkBuilder);

    void watermarkForTikTokNow(WaterMarkBuilder waterMarkBuilder);
}
