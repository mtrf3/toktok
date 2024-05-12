package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.web.CrossPlatformJsbProxy;
import com.ss.android.ugc.aweme.web.ICrossPlatformJsbProxy;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class F05 extends C31897CfV {
    public final /* synthetic */ F04 LIZ;

    public F05(F04 f04) {
        this.LIZ = f04;
    }

    @Override // X.C31897CfV
    public final C38236EzY LIZ(C60737Nsb hybridContext, String name) {
        Object obj;
        F0A f0a;
        o.LJIIIZ(name, "name");
        o.LJIIIZ(hybridContext, "hybridContext");
        if (!(hybridContext instanceof SparkContext)) {
            return null;
        }
        InterfaceC40155FpP interfaceC40155FpP = (InterfaceC40155FpP) hybridContext.LIZIZ(InterfaceC40155FpP.class);
        if (interfaceC40155FpP != null && interfaceC40155FpP.LIZJ() && (f0a = this.LIZ.LJLIL) != null && !f0a.LIZ(name)) {
            return null;
        }
        ICrossPlatformJsbProxy LIZJ = CrossPlatformJsbProxy.LIZJ();
        if (LIZJ != null) {
            obj = LIZJ.LIZ(this.LIZ.LJLJJL, hybridContext, name);
        } else {
            obj = null;
        }
        if (!(obj instanceof InterfaceC38012Evw)) {
            return null;
        }
        return F01.LJIJI(name, (InterfaceC38012Evw) obj, hybridContext, this.LIZ);
    }
}
