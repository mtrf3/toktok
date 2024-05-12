package X;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import kotlin.jvm.internal.o;

/* renamed from: X.IAj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46177IAj {
    public static boolean LIZ(OYP content, Context context) {
        String str;
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        if (content.LIZLLL.length() == 0) {
            return false;
        }
        PrivacyCert.Builder LIZ = C44878HjO.LIZ(PrivacyCert.Builder.Companion, "bpea-qr_code_copy_link", "User can share profile page by copying profile page url and send it in some third party apps.", "clickCopyLinkButtonInShareDialog");
        LIZ.policies(PrivacyPolicyStore.getClipboardPrivacyPolicy());
        PrivacyCert build = LIZ.build();
        C235399Lr c235399Lr = new C235399Lr("share_person");
        C1799074g c1799074g = InterfaceC1798974f.LIZ;
        c235399Lr.LJ("platform", "copy", c1799074g);
        c235399Lr.LJ("enter_from", "personal_homepage", c1799074g);
        c235399Lr.LJ("enter_method", "qr_code_share", c1799074g);
        c235399Lr.LJIILIIL();
        String str2 = content.LIZJ;
        if (str2 == null || str2.length() == 0) {
            str = content.LIZLLL;
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(content.LIZJ);
            LIZ2.append(' ');
            LIZ2.append(content.LIZLLL);
            str = X1D.LIZIZ(LIZ2);
        }
        new C46181IAn((String) null, 7).LIZJ(context, build, str);
        return true;
    }
}
