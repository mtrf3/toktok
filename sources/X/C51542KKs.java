package X;

import android.text.TextUtils;
import kotlin.jvm.internal.AqS61S1100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.KKs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51542KKs extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C51541KKr LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51542KKs(String str, String str2, C51541KKr c51541KKr, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = c51541KKr;
        this.LJLJJI = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        String str = "";
        if (!TextUtils.isEmpty(this.LJLIL)) {
            String str2 = this.LJLIL;
            if (str2 == null) {
                str2 = "";
            }
            actionGroup.LJII(str2, new AqS61S1100000_8(this.LJLJI, this.LJLJJI, 7));
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            String str3 = this.LJLILLLLZI;
            if (str3 != null) {
                str = str3;
            }
            actionGroup.LJIIIZ(str, new AqS61S1100000_8(this.LJLJI, this.LJLJJI, 8));
        }
        return C76800UCe.LIZ;
    }
}
