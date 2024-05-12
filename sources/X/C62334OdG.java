package X;

import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.base.model.ShareContentType;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.OdG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62334OdG extends AbstractC65781Prl implements InterfaceC88472Yns<AbstractC62625Ohx, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ BaseSharePackage LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ InterfaceC62225ObV LJLJJLL;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62334OdG(boolean z, BaseSharePackage baseSharePackage, Context context, String str, InterfaceC62225ObV interfaceC62225ObV, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = baseSharePackage;
        this.LJLJJI = context;
        this.LJLJJL = str;
        this.LJLJJLL = interfaceC62225ObV;
        this.LJLJL = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AbstractC62625Ohx abstractC62625Ohx) {
        String str;
        String str2;
        AbstractC62625Ohx shortLink = abstractC62625Ohx;
        o.LJIIIZ(shortLink, "shortLink");
        String str3 = ((OYP) shortLink).LIZLLL;
        String str4 = "";
        if (!this.LJLIL) {
            str = "";
        } else {
            str = this.LJLILLLLZI.description;
        }
        if (!this.LJLJI) {
            str2 = "";
        } else {
            str2 = this.LJLILLLLZI.title;
        }
        android.net.Uri LIZ = C40681Fxt.LIZ(this.LJLJJI, new File(this.LJLJJL));
        o.LJIIIIZZ(LIZ, "getFileProviderUri(context, File(outPath))");
        C62313Ocv c62313Ocv = new C62313Ocv(LIZ, this.LJLJJL, str, str2, str3, null, false, 200);
        String str5 = c62313Ocv.LJFF;
        if (str5 == null) {
            str5 = "";
        }
        ((BaseBundle) c62313Ocv.LIZ).putString("content_url", str5);
        ((BaseBundle) c62313Ocv.LIZ).putString("media_type", "image/png");
        this.LJLJJLL.LJII(c62313Ocv, this.LJLJJI, null);
        Bundle bundle = this.LJLILLLLZI.extras;
        String str6 = C62337OdJ.LIZ.get(ShareContentType.LINK_PLUS_PHOTO);
        if (str6 != null) {
            str4 = str6;
        }
        bundle.putString("share_form", str4);
        this.LJLJL.invoke(Boolean.TRUE);
        return C76800UCe.LIZ;
    }
}
