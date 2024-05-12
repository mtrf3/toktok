package com.bytedance.android.monitorV2.hybridSetting.entity;

import X.C79004UzY;
import android.text.TextUtils;
import android.util.Base64;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class HybridSettingInitConfig {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public IThirdConfig LJIIJ;
    public List<String> LJIIJJI;
    public List<String> LJIIL;

    /* loaded from: classes7.dex */
    public static abstract class IThirdConfig {
        public boolean isThirdPartyUrl(String str) {
            return false;
        }
    }

    public final List<String> LIZ() {
        if (C79004UzY.LJJIFFI(this.LJIIJJI)) {
            if (TextUtils.equals(this.LIZIZ, "https://mon-va.byteoversea.com")) {
                this.LJIIJJI = Collections.singletonList(new String(Base64.decode("aHR0cHM6Ly9tb24uaXNuc3Nkay5jb20vbW9uaXRvci9hcHBtb25pdG9yL3YyL3NldHRpbmdz", 0)));
            } else {
                this.LJIIJJI = Collections.singletonList(new String(Base64.decode("aHR0cHM6Ly9tb24uc25zc2RrLmNvbS9tb25pdG9yL2FwcG1vbml0b3IvdjIvc2V0dGluZ3M=", 0)));
            }
        }
        return this.LJIIJJI;
    }

    public final List<String> LIZIZ() {
        if (C79004UzY.LJJIFFI(this.LJIIL)) {
            if (TextUtils.equals(this.LIZIZ, "https://mon-va.byteoversea.com")) {
                this.LJIIL = Collections.singletonList(new String(Base64.decode("aHR0cHM6Ly9tb24uaXNuc3Nkay5jb20vbW9uaXRvci9jb2xsZWN0Lw==", 0)));
            } else {
                this.LJIIL = Collections.singletonList(new String(Base64.decode("aHR0cHM6Ly9tb24uc25zc2RrLmNvbS9tb25pdG9yL2NvbGxlY3Qv", 0)));
            }
        }
        return this.LJIIL;
    }
}
