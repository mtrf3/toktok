package X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.ComponentActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.CodeChallengeParams;
import com.bytedance.pipo.kyc.singpass.network.model.Config;
import fjb.a;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.kyc.singpass.PIPOKYCSingPassCompat$startVerify$1$1", f = "PIPOKYCSingPassCompat.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class QA5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ QAA LJLIL;
    public final /* synthetic */ OSZ LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QA5(QAA qaa, OSZ osz, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = qaa;
        this.LJLILLLLZI = osz;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new QA5(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        String str;
        C141335gf.LIZJ(obj);
        CodeChallengeParams codeChallengeParams = (CodeChallengeParams) this.LJLILLLLZI.getFirst();
        if (codeChallengeParams != null) {
            if (codeChallengeParams.sessionId.length() == 0 || codeChallengeParams.config.clientId.length() == 0 || codeChallengeParams.config.authorizationEndpoint.length() == 0 || codeChallengeParams.config.tokenEndpoint.length() == 0 || codeChallengeParams.config.issuer.length() == 0 || codeChallengeParams.config.purposeId.length() == 0 || codeChallengeParams.codeChallenge.length() == 0 || codeChallengeParams.codeChallengeMethod.length() == 0 || !C36919EeJ.LIZ(codeChallengeParams.config.authorizationEndpoint) || !C36919EeJ.LIZ(codeChallengeParams.config.tokenEndpoint)) {
                this.LJLIL.LJLILLLLZI.LIZJ.LIZ(null, new QAE("illegal auth params", 103, (String) null, 12));
                return C76800UCe.LIZ;
            }
            QA8.LJFF = codeChallengeParams.sessionId;
            QA7 qa7 = this.LJLIL.LJLILLLLZI;
            android.net.Uri parse = UriProtector.parse(codeChallengeParams.config.authorizationEndpoint);
            o.LJIIIIZZ(parse, "Uri.parse(codeChallengeP…ig.authorizationEndpoint)");
            android.net.Uri parse2 = UriProtector.parse(codeChallengeParams.config.tokenEndpoint);
            o.LJIIIIZZ(parse2, "Uri.parse(codeChallengeP…ams.config.tokenEndpoint)");
            Config config = codeChallengeParams.config;
            String str2 = config.clientId;
            String str3 = codeChallengeParams.codeChallenge;
            String str4 = codeChallengeParams.codeChallengeMethod;
            String str5 = config.scope;
            String str6 = config.purposeId;
            qa7.getClass();
            C66549Q9x c66549Q9x = new C66549Q9x(new C66540Q9o(parse, parse2, null), str2, "code", UriProtector.parse(QA8.LJ));
            if (TextUtils.isEmpty(str5)) {
                c66549Q9x.LJII = null;
            } else {
                String[] split = str5.split(" +");
                if (split == null) {
                    split = new String[0];
                }
                c66549Q9x.LJII = C78999UzT.LJIILJJIL(Arrays.asList(split));
            }
            c66549Q9x.LIZIZ(str3, str3, str4);
            c66549Q9x.LJIIIIZZ = null;
            LinkedHashMap LIZ = C0JU.LIZ("purpose_id", str6);
            if (!LIZ.isEmpty()) {
                c66549Q9x.LJIILIIL = C67822lO.LIZ(LIZ, C66544Q9s.LJIILJJIL);
            }
            QA8.LIZIZ = c66549Q9x.LIZ();
            QAA qaa = this.LJLIL;
            QA8.LIZJ = qaa.LJLJJL;
            ComponentActivity componentActivity = qaa.LJLILLLLZI.LIZ;
            Intent intent = new Intent(this.LJLIL.LJLILLLLZI.LIZ, (Class<?>) PipoMiddleActivity.class);
            C78598Ut0.LJIJJ(intent, componentActivity);
            componentActivity.startActivity(intent);
        } else {
            QA7 qa72 = this.LJLIL.LJLILLLLZI;
            QAJ qaj = (QAJ) this.LJLILLLLZI.getSecond();
            if (qaj != null) {
                num = qaj.LJLIL;
            } else {
                num = null;
            }
            QAJ qaj2 = (QAJ) this.LJLILLLLZI.getSecond();
            if (qaj2 != null) {
                str = qaj2.LJLILLLLZI;
            } else {
                str = null;
            }
            qa72.LIZJ.LIZ(null, new QAE(102, "fail to fetch auth params", num, str));
        }
        return C76800UCe.LIZ;
    }
}
