package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ad.feed.adexperience.acesurvey.AdFollowUpAceSurveyView$onEvent$1$1", f = "AdFollowUpAceSurveyView.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.NEu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59032NEu extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C56642Ke LJLIL;
    public final /* synthetic */ NFB LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59032NEu(C56642Ke c56642Ke, NFB nfb, InterfaceC67352kd<? super C59032NEu> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c56642Ke;
        this.LJLILLLLZI = nfb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C59032NEu(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (TextUtils.equals("card_rate_feedback_submit", JSONObjectProtectorUtils.getString(this.LJLIL.LJLIL, "eventName"))) {
            C59028NEq LIZ = C59027NEp.LIZ();
            String LJIJJ = C79057V0z.LJIJJ(this.LJLILLLLZI.LJLJL);
            if (LJIJJ == null) {
                LIZ.getClass();
            } else {
                C0M6<String, C59030NEs> c0m6 = LIZ.LIZIZ;
                if (c0m6 != null) {
                    c0m6.LIZJ(LJIJJ, new C59030NEs(0, true, 3));
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
