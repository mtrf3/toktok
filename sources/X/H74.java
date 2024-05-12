package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.autocut.util.ImageUtils$getMediaFrame$1", f = "ImageUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class H74 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AutoCutMediaModel LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H74(AutoCutMediaModel autoCutMediaModel, String str, int i, InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC67352kd<? super H74> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = autoCutMediaModel;
        this.LJLILLLLZI = str;
        this.LJLJI = i;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new H74(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        String srcPath = this.LJLIL.filePath;
        String targetPathPrefix = this.LJLILLLLZI;
        int i = this.LJLJI;
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this.LJLJJI, (InterfaceC88472Yns<? super String, C76800UCe>) 323);
        o.LJIIIZ(srcPath, "srcPath");
        o.LJIIIZ(targetPathPrefix, "targetPathPrefix");
        VEUtils.saveVideoFrames(srcPath, new int[]{i}, 360, -1, false, targetPathPrefix, "", 1);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(targetPathPrefix);
        LIZ.append("_0.jpeg");
        aqS173S0100000_7.invoke(X1D.LIZIZ(LIZ));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
