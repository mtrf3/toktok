package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.OdF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62333OdF extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC62625Ohx, C76800UCe> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ InterfaceC62225ObV LJLJJL;
    public final /* synthetic */ SharePackage LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C62333OdF(Context context, String str, String str2, String str3, InterfaceC62225ObV interfaceC62225ObV, SharePackage sharePackage, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.LJLIL = context;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = interfaceC62225ObV;
        this.LJLJJLL = sharePackage;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC62625Ohx abstractC62625Ohx) {
        AbstractC62625Ohx shortLink = abstractC62625Ohx;
        o.LJIIIZ(shortLink, "shortLink");
        String str = ((OYP) shortLink).LIZLLL;
        android.net.Uri LIZ = C40681Fxt.LIZ(this.LJLIL, new File(this.LJLILLLLZI));
        o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(outPath))");
        C62313Ocv c62313Ocv = new C62313Ocv(LIZ, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, str, null, false, 200);
        String str2 = c62313Ocv.LJFF;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str2);
        ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
        this.LJLJJL.LJII(c62313Ocv, this.LJLIL, null);
        Bundle bundle = this.LJLJJLL.extras;
        String str4 = C62337OdJ.LIZ.get(ShareContentType.LINK_PLUS_PHOTO);
        if (str4 != null) {
            str3 = str4;
        }
        bundle.putString("share_form", str3);
        this.LJLJL.invoke(Boolean.TRUE);
        return C76800UCe.LIZ;
    }
}
