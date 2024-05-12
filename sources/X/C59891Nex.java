package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import kotlin.jvm.internal.o;

/* renamed from: X.Nex, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59891Nex extends C61491OBj {
    public final /* synthetic */ CompletionBlock LJLJLLL;

    public C59891Nex(C37356ElM c37356ElM) {
        this.LJLJLLL = c37356ElM;
    }

    @Override // X.C61491OBj
    public final void LJL(String schema, String biz, C60737Nsb c60737Nsb, C30941Ji c30941Ji) {
        o.LJIIJ(schema, "schema");
        o.LJIIJ(biz, "biz");
        super.LJL(schema, biz, c60737Nsb, c30941Ji);
        CompletionBlock completionBlock = this.LJLJLLL;
        String str = (String) c30941Ji.LJLIL;
        if (str == null) {
            str = "failed";
        }
        C31626Cb8.LIZ(completionBlock, 0, str, 4);
    }
}
