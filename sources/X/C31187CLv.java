package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePlayerMuteSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CLv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31187CLv extends AbstractC31188CLw {
    public boolean LJLJJL;
    public boolean LJLJJLL = true;

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        SparkContext sparkContext;
        o.LJIIIZ(type, "type");
        String str = null;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) ED5.LIZJ(InterfaceC31191CLz.class, null);
        boolean isMute = ((InterfaceC31189CLx) xBaseParamModel).isMute();
        if (GameLivePlayerMuteSetting.INSTANCE.getEnable()) {
            C73943T0h.LIZ().LIZIZ(new B89(isMute));
            this.LJLJJL = isMute;
        }
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            C39359FcZ c39359FcZ = SparkContext.Companion;
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null) {
                str = interfaceC38263Ezz.LIZIZ();
            }
            c39359FcZ.getClass();
            C60737Nsb LIZIZ = C39359FcZ.LIZIZ(str);
            if ((LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) LIZIZ) != null) {
                sparkContext.LJJIJIIJIL(new CLX(this));
            }
        }
        c37356ElM.onSuccess(xBaseResultModel, "");
    }
}
