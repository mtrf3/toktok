package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.5uR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149875uR extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C149865uQ LJLIL;
    public final /* synthetic */ ShortVideoContext LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C149875uR(C149865uQ c149865uQ, ShortVideoContext shortVideoContext, String str, String str2) {
        super(1);
        this.LJLIL = c149865uQ;
        this.LJLILLLLZI = shortVideoContext;
        this.LJLJI = str;
        this.LJLJJI = str2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        C149865uQ c149865uQ = this.LJLIL;
        ShortVideoContext shortVideoContext = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = this.LJLJJI;
        if (str4 != null) {
            str3 = str4;
        }
        c149865uQ.getClass();
        C149865uQ.LIZJ(shortVideoContext, it, str2, str3);
        return C76800UCe.LIZ;
    }
}
