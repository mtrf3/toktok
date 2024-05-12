package X;

import Y.IDxS311S0100000_13;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class UZN extends AbstractC77394UZa {
    public final SmartImageView LJLLLL;
    public final SmartImageView LJLLLLLL;

    public void LJII(W5F w5f) {
    }

    @Override // X.UZX
    public void LIZ(UZR uzr) {
        UrlModel urlModel = uzr.LIZLLL;
        UrlModel urlModel2 = uzr.LJ;
        if (urlModel == null || urlModel2 == null) {
            return;
        }
        C73618Sus LJIIIIZZ = LJIIIIZZ(this.LJLLLL, urlModel);
        C73618Sus LJIIIIZZ2 = LJIIIIZZ(this.LJLLLLLL, urlModel2);
        if (LJIIIIZZ == null || LJIIIIZZ2 == null) {
            return;
        }
        AbstractC73672Svk.LJJLL(LJIIIIZZ, LJIIIIZZ2, UFF.LJLIL).LIZ(new IDxS311S0100000_13(this, 1));
        this.LJLLLL.getDrawable().setVisible(true, false);
        this.LJLLLLLL.getDrawable().setVisible(true, false);
    }

    public final C73618Sus LJIIIIZZ(final SmartImageView smartImageView, UrlModel urlModel) {
        final com.ss.android.ugc.aweme.base.model.UrlModel urlModel2 = new com.ss.android.ugc.aweme.base.model.UrlModel();
        try {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(urlModel.getUrlList());
            return AbstractC73672Svk.LJIIJ(new InterfaceC86003Zc() { // from class: X.9WP
                @Override // X.InterfaceC86003Zc
                public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
                    W5F LJII = W5U.LJII(C78939UyV.LJ(com.ss.android.ugc.aweme.base.model.UrlModel.this));
                    this.LJII(LJII);
                    LJII.LJJIIJ = smartImageView;
                    LJII.LIZIZ("NewPendant");
                    final C73433Srt c73433Srt = (C73433Srt) interfaceC73573Su9;
                    LJII.LIZLLL(new AbstractC72439Sbr() { // from class: X.9WO
                        @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
                        public final void T1(android.net.Uri uri, SmartImageView smartImageView2) {
                            o.LJIIIZ(uri, "uri");
                        }

                        @Override // X.InterfaceC70769Rq1
                        public final void s2(android.net.Uri uri, View view, Throwable th) {
                            o.LJIIIZ(uri, "uri");
                            if (!c73433Srt.isDisposed()) {
                                InterfaceC73573Su9<String> interfaceC73573Su92 = c73433Srt;
                                o.LJI(th);
                                interfaceC73573Su92.onError(th);
                            }
                        }

                        @Override // X.InterfaceC70769Rq1
                        public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
                            if (!c73433Srt.isDisposed()) {
                                c73433Srt.onNext("");
                            }
                        }
                    });
                }
            }).LJJJJJ(3L);
        } catch (C158056If unused) {
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UZN(Context context, View view, SmartImageView smartImageView, SmartImageView smartImageView2, View view2, View view3, C77395UZb c77395UZb) {
        super(context, view, smartImageView, smartImageView2, view2, view3, c77395UZb);
        o.LJIIIZ(context, "context");
        this.LJLLLL = smartImageView;
        this.LJLLLLLL = smartImageView2;
    }
}
