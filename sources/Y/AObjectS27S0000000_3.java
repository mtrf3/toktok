package Y;

import X.ARN;
import X.C76800UCe;
import X.C793239k;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.comment.model.Comment;

/* loaded from: classes4.dex */
public class AObjectS27S0000000_3 implements InterfaceC88472Yns {
    public final int $t;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS27S0000000_3(int i) {
        this.$t = i;
    }

    public static final Object invoke$0(AObjectS27S0000000_3 aObjectS27S0000000_3, Object obj) {
        Comment comment = (Comment) obj;
        if (comment != null) {
            return comment.getUser();
        }
        return null;
    }

    public static final Object invoke$1(AObjectS27S0000000_3 aObjectS27S0000000_3, Object obj) {
        C793239k.LIZIZ((ARN) obj, "eventArgs", null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AObjectS27S0000000_3 aObjectS27S0000000_3, Object obj) {
        C793239k.LIZIZ((ARN) obj, "eventArgs", null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AObjectS27S0000000_3 aObjectS27S0000000_3, Object obj) {
        C793239k.LIZIZ((ARN) obj, "eventArgs", null);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AObjectS27S0000000_3 aObjectS27S0000000_3, Object obj) {
        C793239k.LIZIZ((ARN) obj, "eventArgs", null);
        return C76800UCe.LIZ;
    }
}
