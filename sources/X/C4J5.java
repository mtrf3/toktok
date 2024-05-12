package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.AqS169S0100000_3;

/* renamed from: X.4J5, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4J5 implements InterfaceC92953kp {
    public final /* synthetic */ InterfaceC92963kq LJLIL = null;
    public final /* synthetic */ InterfaceC88472Yns<CharSequence, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ User LJLJI;
    public final /* synthetic */ Aweme LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ boolean LJLJL;

    @Override // X.InterfaceC92953kp
    public final void ne() {
    }

    @Override // X.InterfaceC92953kp
    public final void n2(CharSequence charSequence, boolean z) {
        InterfaceC92963kq interfaceC92963kq;
        String str;
        if (charSequence != null) {
            InterfaceC88472Yns<CharSequence, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
            User user = this.LJLJI;
            Aweme aweme = this.LJLJJI;
            String str2 = this.LJLJJL;
            String str3 = this.LJLJJLL;
            boolean z2 = this.LJLJL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(charSequence);
            }
            String charSequence2 = charSequence.toString();
            if (z) {
                str = "story_float_emoji";
            } else {
                str = "story_message_input_box";
            }
            C107274Ix.LJII(charSequence2, user, aweme, str2, str, str3, Boolean.valueOf(z2), new C4J3() { // from class: X.4J6
                @Override // X.C4J3
                public final void LIZIZ() {
                }
            });
        }
        if (z && charSequence != null && (interfaceC92963kq = this.LJLIL) != null) {
            interfaceC92963kq.LIZ(charSequence);
        }
    }

    public C4J5(AqS169S0100000_3 aqS169S0100000_3, User user, Aweme aweme, String str, String str2, boolean z) {
        this.LJLILLLLZI = aqS169S0100000_3;
        this.LJLJI = user;
        this.LJLJJI = aweme;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = z;
    }
}
