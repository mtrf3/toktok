package X;

import com.bytedance.bdlocation.exception.BDLocationException;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J0X extends BDLocationException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0X(BDLocationException exception) {
        super(exception.getDetailMessage(), exception.getSdkName(), exception.getCode(), exception.getExtra(), exception.getCauses(), exception.getAssembleError());
        o.LJIIIZ(exception, "exception");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0X(List<Throwable> list) {
        super(list);
        o.LJIIIZ(list, "list");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0X(Throwable cause, String sdkName, String code) {
        super(cause, sdkName, code);
        o.LJIIIZ(cause, "cause");
        o.LJIIIZ(sdkName, "sdkName");
        o.LJIIIZ(code, "code");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0X(String str, String str2, String str3) {
        super(str, str2, str3);
        HH1.LIZ(str, "message", str2, "sdkName", str3, "code");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0X(String message, String sdkName, String code, java.util.Map<String, String> extra, List<Throwable> list, int i) {
        super(message, sdkName, code, extra, list, i);
        o.LJIIIZ(message, "message");
        o.LJIIIZ(sdkName, "sdkName");
        o.LJIIIZ(code, "code");
        o.LJIIIZ(extra, "extra");
        o.LJIIIZ(list, "list");
    }
}
