package com.ss.android.socialbase.downloader.service;

import X.EnumC84263X5f;
import X.X5N;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;

/* loaded from: classes16.dex */
public interface IDownloadNetTrafficManagerService {
    void addBandwidth(long j, long j2);

    EnumC84263X5f getCurrentNetworkQuality();

    double getDownloadKBitsPerSecond();

    EnumC84263X5f register(X5N x5n);

    void remove(X5N x5n);

    void reset();

    /* loaded from: classes16.dex */
    public static class DefaultDownloadNetTrafficManagerService implements IDownloadNetTrafficManagerService {
        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void addBandwidth(long j, long j2) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public double getDownloadKBitsPerSecond() {
            return LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void remove(X5N x5n) {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public void reset() {
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public EnumC84263X5f getCurrentNetworkQuality() {
            return EnumC84263X5f.UNKNOWN;
        }

        @Override // com.ss.android.socialbase.downloader.service.IDownloadNetTrafficManagerService
        public EnumC84263X5f register(X5N x5n) {
            return EnumC84263X5f.UNKNOWN;
        }
    }
}
