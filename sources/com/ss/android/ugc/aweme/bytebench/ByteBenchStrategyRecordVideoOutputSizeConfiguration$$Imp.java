package com.ss.android.ugc.aweme.bytebench;

import X.C05090Hx;
import X.C44829Hib;
import X.InterfaceC09240Xw;
import X.InterfaceC09250Xx;
import com.google.gson.Gson;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class ByteBenchStrategyRecordVideoOutputSizeConfiguration$$Imp implements ByteBenchStrategyRecordVideoOutputSizeConfiguration {
    public InterfaceC09240Xw mStrategyImp;
    public Gson mGson = new Gson();
    public int mRepoName = 0;
    public final ConcurrentHashMap<String, Object> mStickyStrategy = new ConcurrentHashMap<>();
    public InterfaceC09250Xx mDefaultCreate = new C44829Hib();

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration
    public void updateValue() {
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration
    public String getRecordOutputSize() {
        String LJ;
        Object obj = this.mStickyStrategy.get("t_record_output_size");
        if (obj != null) {
            return (String) obj;
        }
        try {
            synchronized (this) {
                if (this.mStickyStrategy.contains("t_record_output_size")) {
                    LJ = (String) this.mStickyStrategy.get("t_record_output_size");
                } else {
                    LJ = C05090Hx.LIZJ.LJ(this.mRepoName, "t_record_output_size");
                    if (LJ == null) {
                        LJ = "";
                    }
                    this.mStickyStrategy.put("t_record_output_size", LJ);
                }
            }
            return LJ;
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration
    public String getStaticRecordOutputSize() {
        try {
            String LJIIJ = this.mStrategyImp.LJIIJ();
            if (LJIIJ != null) {
                if (LJIIJ.length() > 0) {
                    return LJIIJ;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration, X.InterfaceC09230Xv
    public void setByteBenchStrategy(InterfaceC09240Xw interfaceC09240Xw) {
        this.mRepoName = interfaceC09240Xw.getRepoName();
        this.mStrategyImp = interfaceC09240Xw;
    }
}
