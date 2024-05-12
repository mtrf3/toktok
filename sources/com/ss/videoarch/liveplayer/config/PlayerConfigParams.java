package com.ss.videoarch.liveplayer.config;

import X.VLH;

/* loaded from: classes15.dex */
public class PlayerConfigParams {

    /* loaded from: classes15.dex */
    public static class NNSRParams {
        public VLH<Integer> Enabled = new VLH<>(0);
        public VLH<Integer> VBitrateLowerBoundInKbps = new VLH<>(0);
        public VLH<Integer> LongerSideUpperBound = new VLH<>(0);
        public VLH<Integer> ShorterSideUpperBound = new VLH<>(0);
        public VLH<Integer> FrameRateUpperBound = new VLH<>(0);
        public VLH<Integer> SRAlgType = new VLH<>(0);
        public VLH<Integer> EnableBMFSR = new VLH<>(0);
        public VLH<Integer> BMFSRScaleType = new VLH<>(0);
        public VLH<Integer> BMFSRBackEnd = new VLH<>(0);
        public VLH<Integer> BMFSRPoolSize = new VLH<>(0);
        public VLH<Integer> EnableDynamicSR = new VLH<>(0);
        public VLH<Integer> EnableUseSRAfterInit = new VLH<>(0);
        public VLH<String> SRModuleName = new VLH<>("");
    }
}
