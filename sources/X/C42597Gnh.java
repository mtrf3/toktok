package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.Gnh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42597Gnh extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public final /* synthetic */ C42594Gne LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C43170Gww LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42597Gnh(C42594Gne c42594Gne, Aweme aweme, String str, C43170Gww c43170Gww, String str2, String str3) {
        super(1);
        this.LJLIL = c42594Gne;
        this.LJLILLLLZI = aweme;
        this.LJLJI = str;
        this.LJLJJI = c43170Gww;
        this.LJLJJL = str2;
        this.LJLJJLL = str3;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View it) {
        o.LJIIIZ(it, "it");
        C42594Gne c42594Gne = this.LJLIL;
        Aweme aweme = this.LJLILLLLZI;
        String str = this.LJLJI;
        c42594Gne.getClass();
        C42594Gne.LIZJ(str, aweme, "save_image");
        this.LJLIL.LIZ(this.LJLJJI, this.LJLILLLLZI, this.LJLJJL, this.LJLJI, this.LJLJJLL);
        return C76800UCe.LIZ;
    }
}
