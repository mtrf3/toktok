package X;

import android.os.Build;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;

/* renamed from: X.FnP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40031FnP {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public HybridSettingInitConfig.IThirdConfig LJIIIIZZ;

    public final HybridSettingInitConfig LIZ() {
        String str = this.LIZIZ;
        if (str != null && !"".equals(str)) {
            HybridSettingInitConfig hybridSettingInitConfig = new HybridSettingInitConfig();
            hybridSettingInitConfig.LIZ = this.LIZ;
            hybridSettingInitConfig.LIZIZ = this.LIZIZ;
            hybridSettingInitConfig.LIZJ = "Android";
            hybridSettingInitConfig.LIZLLL = String.valueOf(Build.VERSION.RELEASE);
            hybridSettingInitConfig.LJ = this.LIZJ;
            hybridSettingInitConfig.LJFF = this.LIZLLL;
            hybridSettingInitConfig.LJI = this.LJ;
            hybridSettingInitConfig.LJII = this.LJFF;
            hybridSettingInitConfig.LJIIIIZZ = this.LJI;
            hybridSettingInitConfig.LJIIIZ = this.LJII;
            hybridSettingInitConfig.LJIIJJI = null;
            hybridSettingInitConfig.LJIIL = null;
            hybridSettingInitConfig.LJIIJ = this.LJIIIIZZ;
            return hybridSettingInitConfig;
        }
        throw new RuntimeException("host is undefined");
    }
}
