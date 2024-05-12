package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C68517Qun;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC68422QtG;
import X.InterfaceC88472Yns;
import X.R41;
import X.R5Q;

/* loaded from: classes12.dex */
public class AqS18S2100000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public final void invoke$0(String token) {
        o.LJIIIZ(token, "token");
        C68517Qun c68517Qun = C68517Qun.LIZ;
        final String str = this.s0;
        final String str2 = this.s1;
        InterfaceC68422QtG interfaceC68422QtG = new InterfaceC68422QtG() { // from class: com.ss.android.ugc.aweme.services.CloudTokenLoginService$enableCloudTokenForOneClickLogin$1$1
            @Override // X.InterfaceC68422QtG
            public final void onSave(boolean z, Integer num) {
                R5Q.LJI(str, str2, z, Boolean.TRUE, num);
            }
        };
        synchronized (c68517Qun) {
            String currentUid = R41.LIZLLL();
            o.LJIIIIZZ(currentUid, "currentUid");
            c68517Qun.LIZLLL(currentUid, token, interfaceC68422QtG);
        }
        ((InterfaceC65784Pro) this.l2).invoke();
    }

    public final void invoke$1(int i) {
        R5Q.LJI(this.s0, this.s1, false, Boolean.TRUE, Integer.valueOf(i));
        ((InterfaceC88472Yns) this.l2).invoke(Integer.valueOf(i));
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS18S2100000_11 aqS18S2100000_11, Object obj) {
        aqS18S2100000_11.invoke$0((String) obj);
        return C76800UCe.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AqS18S2100000_11 aqS18S2100000_11, Object obj) {
        aqS18S2100000_11.invoke$1(((Number) obj).intValue());
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS18S2100000_11(InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = interfaceC65784Pro;
        this.s0 = interfaceC65784Pro2;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS18S2100000_11(String str, String str2, String str3, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        super(1);
        this.$t = interfaceC88472Yns;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = str3;
    }
}
