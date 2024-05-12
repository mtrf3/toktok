package X;

import android.app.Activity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS137S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ftw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40436Ftw extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ Activity LJLJJI;
    public final /* synthetic */ JJ4 LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40436Ftw(Activity activity, JJ4 jj4, String str, String str2, String str3) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = activity;
        this.LJLJJL = jj4;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(ARI ari) {
        ARI actionGroup = ari;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        actionGroup.LJI = true;
        actionGroup.LJI(R.string.hw9, new C78971Uz1(this.LJLJJI, this.LJLJJL, this.LJLIL, this.LJLILLLLZI, this.LJLJI));
        actionGroup.LJIIIIZZ(R.string.hw_, new AqS137S0200000_6(this.LJLJJI, this.LJLJJL, 24));
        return C76800UCe.LIZ;
    }
}
