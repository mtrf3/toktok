package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.creative.model.CreativeInitialModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.RecordPageOptionalConfig;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WSM extends AbstractC65781Prl implements InterfaceC88472Yns<C83116Wjg, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<C83116Wjg, C76800UCe> LJLIL;
    public final /* synthetic */ C82622Wbi LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<String> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WSM(InterfaceC88472Yns<? super C83116Wjg, C76800UCe> interfaceC88472Yns, C82622Wbi c82622Wbi, boolean z, boolean z2, InterfaceC65784Pro<String> interfaceC65784Pro) {
        super(1);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = c82622Wbi;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C83116Wjg it) {
        CreativeModel creativeModel;
        CreativeInitialModel creativeInitialModel;
        RecordPageOptionalConfig recordPageOptionalConfig;
        Boolean valueOf;
        o.LJIIIZ(it, "it");
        InterfaceC88472Yns interfaceC88472Yns = this.LJLIL;
        if (interfaceC88472Yns == null) {
            C82622Wbi c82622Wbi = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            boolean z2 = this.LJLJJI;
            InterfaceC65784Pro<String> interfaceC65784Pro = this.LJLJJL;
            boolean LIZJ = C1B8.LIZJ();
            boolean LIZ = e1.LIZ(31744, "default_beauty_off", true, false);
            String LIZJ2 = C77339UWx.LIZJ();
            Bundle bundle = null;
            ShortVideoContext shortVideoContext = (ShortVideoContext) c82622Wbi.LJIIIIZZ(null, ShortVideoContext.class);
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (creativeInitialModel = creativeModel.initialModel) != null && (recordPageOptionalConfig = creativeInitialModel.recordPageOptionalConfig) != null && (valueOf = Boolean.valueOf(recordPageOptionalConfig.nopeMemory)) != null) {
                bundle = C01R.LIZ("exterior_record_page_memory", valueOf.booleanValue());
            }
            interfaceC88472Yns = new C83114Wje(LIZJ2, z, z2, LIZ, interfaceC65784Pro.invoke(), LIZJ, bundle, false, 384);
        }
        interfaceC88472Yns.invoke(it);
        return C76800UCe.LIZ;
    }
}
