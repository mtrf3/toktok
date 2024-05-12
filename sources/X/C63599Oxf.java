package X;

import com.bytedance.im.core.proto.Response;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Oxf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63599Oxf extends Exception {
    public static final C63598Oxe Companion = new C63598Oxe();
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final Response LJLJI;

    public final boolean isClientOrNetworkFailure() {
        if (this.LJLJI == null) {
            return true;
        }
        return false;
    }

    public final int getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMessage() {
        return this.LJLILLLLZI;
    }

    public final Response getErrorResponse() {
        return this.LJLJI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63599Oxf(int i, String errorMessage, Response response) {
        super(errorMessage);
        o.LJIIIZ(errorMessage, "errorMessage");
        this.LJLIL = i;
        this.LJLILLLLZI = errorMessage;
        this.LJLJI = response;
    }

    public /* synthetic */ C63599Oxf(int i, String str, Response response, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? null : response);
    }
}
