package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import java.util.ArrayList;

/* renamed from: X.4Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105034Ah extends AbstractC65781Prl implements InterfaceC88472Yns<Emoji, C76800UCe> {
    public final /* synthetic */ InterfaceC88472Yns<UrlModel, C76800UCe> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C105034Ah(long j, boolean z, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = interfaceC88472Yns;
        this.LJLILLLLZI = z;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Emoji emoji) {
        String animateType;
        String str;
        Emoji emoji2 = emoji;
        if (emoji2 == null) {
            this.LJLIL.invoke(null);
        } else {
            if (this.LJLILLLLZI) {
                animateType = emoji2.getStaticType();
            } else {
                animateType = emoji2.getAnimateType();
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C4FC.LIZIZ());
            if (this.LJLILLLLZI) {
                str = "static/";
            } else {
                str = "animate/";
            }
            LIZ.append(str);
            C62850Ola.LJIIIIZZ(LIZ, this.LJLJI, '.', animateType);
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (C1B6.LIZIZ(LIZIZ)) {
                UrlModel urlModel = new UrlModel();
                ArrayList arrayList = new ArrayList();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("file://");
                LIZ2.append(LIZIZ);
                arrayList.add(X1D.LIZIZ(LIZ2));
                urlModel.setUrlList(arrayList);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("file://");
                LIZ3.append(LIZIZ);
                urlModel.setUri(X1D.LIZIZ(LIZ3));
                this.LJLIL.invoke(urlModel);
            } else {
                this.LJLIL.invoke(null);
            }
        }
        return C76800UCe.LIZ;
    }
}
