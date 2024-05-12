package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.bullet.OpenAlertMethod;
import kotlin.jvm.internal.AqS61S1100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.K1v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51051K1v extends AbstractC65781Prl implements InterfaceC88472Yns<ARI, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ OpenAlertMethod LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51051K1v(String str, String str2, String str3, OpenAlertMethod openAlertMethod, String str4) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = str3;
        this.LJLJJI = openAlertMethod;
        this.LJLJJL = str4;
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
            actionGroup.LJII(str2, new AqS61S1100000_8(this.LJLJJI, this.LJLJJL, 2));
        }
        if (!TextUtils.isEmpty(this.LJLILLLLZI)) {
            actionGroup.LJI = true;
            String str3 = this.LJLILLLLZI;
            if (str3 == null) {
                str3 = "";
            }
            actionGroup.LJII(str3, new AqS61S1100000_8(this.LJLJJI, this.LJLJJL, 3));
        }
        if (!TextUtils.isEmpty(this.LJLJI)) {
            String str4 = this.LJLJI;
            if (str4 != null) {
                str = str4;
            }
            actionGroup.LJIIIZ(str, new AqS61S1100000_8(this.LJLJJI, this.LJLJJL, 4));
        }
        return C76800UCe.LIZ;
    }
}
