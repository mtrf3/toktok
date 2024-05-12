package X;

import com.bytedance.android.livesdk.usermanage.UserManageService;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BK8 extends AbstractC65781Prl implements InterfaceC88472Yns<SparkContext, C76800UCe> {
    public final /* synthetic */ UserManageService LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C28555BIp LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BK8(UserManageService userManageService, String str, C28555BIp c28555BIp) {
        super(1);
        this.LJLIL = userManageService;
        this.LJLILLLLZI = str;
        this.LJLJI = c28555BIp;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(SparkContext sparkContext) {
        SparkContext sparkContext2 = sparkContext;
        o.LJIIIZ(sparkContext2, "sparkContext");
        sparkContext2.LJJI(new BK9(this.LJLIL, this.LJLILLLLZI, this.LJLJI));
        return C76800UCe.LIZ;
    }
}
