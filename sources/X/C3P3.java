package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ShareAwemeContent;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.AwemeCoverManager$bindAwemeCoverReplyMessage$2", f = "AwemeCoverManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3P3, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3P3 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C109544Rq LJLIL;
    public final /* synthetic */ C62846OlW LJLILLLLZI;
    public final /* synthetic */ ShareAwemeContent LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3P3(C109544Rq c109544Rq, C62846OlW c62846OlW, ShareAwemeContent shareAwemeContent, InterfaceC67352kd interfaceC67352kd, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = c109544Rq;
        this.LJLILLLLZI = c62846OlW;
        this.LJLJI = shareAwemeContent;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3P3(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        final UrlModel coverUrl;
        C78742UvK c78742UvK;
        C141335gf.LIZJ(obj);
        String str = this.LJLIL.getLocalExt().get("feed_video_status_flag");
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        if (!o.LJ(str, CardStruct.IStatusCode.DEFAULT)) {
            C84973Vd c84973Vd = C84973Vd.LIZ;
            C62846OlW c62846OlW = this.LJLILLLLZI;
            c84973Vd.getClass();
            c62846OlW.setBackgroundResource(R.drawable.bkd);
            c62846OlW.setActualImageResource(R.drawable.bkd);
        } else {
            C84973Vd c84973Vd2 = C84973Vd.LIZ;
            C109544Rq c109544Rq = this.LJLIL;
            ShareAwemeContent shareAwemeContent = this.LJLJI;
            c84973Vd2.getClass();
            if (c109544Rq.getLocalExt().get("feed_video_cover_url") != null && c109544Rq.getLocalExt().get("feed_video_cover_uri") != null) {
                coverUrl = new UrlModel();
                coverUrl.setUrlList(C47261Igj.LJJIJ(c109544Rq.getLocalExt().get("feed_video_cover_url")));
                coverUrl.setUri(c109544Rq.getLocalExt().get("feed_video_cover_uri"));
            } else {
                coverUrl = shareAwemeContent.getCoverUrl();
            }
            C4AY c4ay = new C4AY() { // from class: X.3OJ
                @Override // X.C4AY
                public final /* synthetic */ void LIZ() {
                }

                @Override // X.W4Z
                public final /* synthetic */ void LIZIZ(String str2, Throwable th) {
                }

                @Override // X.W4Z
                public final /* synthetic */ void LIZJ(String str2) {
                }

                @Override // X.W4Z
                public final /* bridge */ /* synthetic */ void LIZLLL(Object obj2, String str2) {
                    LIZ();
                }

                @Override // X.W4Z
                public final /* synthetic */ void LJI(Object obj2, String str2) {
                }

                @Override // X.W4Z
                public final void LJ(String str2, Throwable th) {
                    String uri;
                    UrlModel urlModel = UrlModel.this;
                    if (urlModel != null) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Not able to load cover url ");
                        if (C1GE.LJIILIIL(urlModel.getUrlList())) {
                            uri = (String) ListProtector.get(urlModel.getUrlList(), 0);
                        } else {
                            uri = urlModel.getUri();
                        }
                        C48690J9a.LJIIL(LIZ, uri, LIZ, "ReplyMessageLayout");
                    }
                }

                @Override // X.W4Z
                public final /* bridge */ /* synthetic */ void LJFF(String str2, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                }
            };
            Context context = this.LJLILLLLZI.getContext();
            o.LJIIIIZZ(context, "view.context");
            if (this.LJLJJI) {
                c78742UvK = new C78742UvK(context);
            } else {
                c78742UvK = null;
            }
            C4AS.LJIIIIZZ(this.LJLILLLLZI, coverUrl, "AwemeCoverManager:Reply", R.drawable.bjl, R.drawable.bjl, c78742UvK, c4ay, 0, 0, 896);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
