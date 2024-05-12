package X;

import Y.ACListenerS39S0200000_4;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.PaidVideoItem;
import com.ss.android.ugc.aweme.paidcontent.assem.PaidContentCollectionDetailDescriptionAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.A2r, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25593A2r implements InterfaceC70769Rq1 {
    public final /* synthetic */ PaidContentCollectionDetailDescriptionAssem LJLIL;
    public final /* synthetic */ PaidVideoItem LJLILLLLZI;
    public final /* synthetic */ CollectionDetailModel LJLJI;

    @Override // X.InterfaceC70769Rq1
    public final void D1(android.net.Uri uri, C2047581v c2047581v) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LJLLLLLL(android.net.Uri uri) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void LLZZJLIL(android.net.Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
    }

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C25593A2r(CollectionDetailModel collectionDetailModel, PaidVideoItem paidVideoItem, PaidContentCollectionDetailDescriptionAssem paidContentCollectionDetailDescriptionAssem) {
        this.LJLIL = paidContentCollectionDetailDescriptionAssem;
        this.LJLILLLLZI = paidVideoItem;
        this.LJLJI = collectionDetailModel;
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        Object value = this.LJLIL.LLIIII.getValue();
        o.LJIIIIZZ(value, "<get-coverVideoPlayButton>(...)");
        ((View) value).setVisibility(0);
        C16880lQ.LJJIJLIJ(this.LJLIL.v3(), new ACListenerS39S0200000_4(this.LJLIL, this.LJLILLLLZI, 47));
        this.LJLIL.LJLJI.LIZ(new C25600A2y(XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C25592A2q(this.LJLIL, this.LJLILLLLZI, this.LJLJI, null), 3)));
    }
}
