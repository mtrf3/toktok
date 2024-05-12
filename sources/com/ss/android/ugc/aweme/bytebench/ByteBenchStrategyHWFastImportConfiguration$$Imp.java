package com.ss.android.ugc.aweme.bytebench;

import X.C05090Hx;
import X.C44828Hia;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class ByteBenchStrategyHWFastImportConfiguration$$Imp implements ByteBenchStrategyHWFastImportConfiguration {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public final ConcurrentHashMap<String, Object> mStickyStrategy = new ConcurrentHashMap<>();
    public InterfaceC09250Xx mDefaultCreate = new C44828Hia();

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PHighFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_1080p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_1080p_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_1080p_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_1080p_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_1080p_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PHighFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_1080p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_1080p_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_1080p_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_1080p_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_1080p_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PLowFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_1080p_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_1080p_lowfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_1080p_lowfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_1080p_lowfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_1080p_lowfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get1080PLowFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_1080p_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_1080p_lowfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_1080p_lowfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_1080p_lowfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_1080p_lowfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KHighFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_4k_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KHighFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_4k_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KLowFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_lowfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_lowfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_lowfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_4k_lowfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KLowFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_lowfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_lowfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_lowfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_lowfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_4k_lowfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KMidFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_4k_midfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_4k_midfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_4k_midfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_4k_midfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_4k_midfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get4KMidFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_4k_midfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_4k_midfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_4k_midfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_4k_midfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_4k_midfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get720PHighFpsByteVC1FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_720p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_720p_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_720p_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_720p_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_720p_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String get720PHighFpsH264FastImportConfig() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_720p_highfps_fastimport");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_720p_highfps_fastimport")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_720p_highfps_fastimport");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_720p_highfps_fastimport");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_720p_highfps_fastimport", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String getByteVC1HWDecodeThreshold() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_threshold");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc1_hwdecode_threshold")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc1_hwdecode_threshold");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc1_hwdecode_threshold");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc1_hwdecode_threshold", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration
    public String getH264HWDecodeThreshold() {
        String LJ;
        Object obj = this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_threshold");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("bytebench_bytevc0_hwdecode_threshold")) {
                    LJ = (String) this.mStickyStrategy.get("bytebench_bytevc0_hwdecode_threshold");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "bytebench_bytevc0_hwdecode_threshold");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("bytebench_bytevc0_hwdecode_threshold", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyHWFastImportConfiguration, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
