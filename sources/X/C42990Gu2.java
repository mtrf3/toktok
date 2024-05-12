package X;

import com.ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import java.util.Objects;

/* renamed from: X.Gu2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42990Gu2 extends RuntimeException {
    public final SynthetiseResult LJLIL;
    public C41359GLb LJLILLLLZI;

    public int getCode() {
        return this.LJLIL.ret;
    }

    public String getVESDKErrorCode() {
        return this.LJLIL.getVESDKErrorCode();
    }

    public C41359GLb getCancelCause() {
        return this.LJLILLLLZI;
    }

    public SynthetiseResult getResult() {
        return this.LJLIL;
    }

    public void setCancelCause(C41359GLb c41359GLb) {
        Objects.requireNonNull(c41359GLb);
        this.LJLILLLLZI = c41359GLb;
    }

    public C42990Gu2(String str, SynthetiseResult synthetiseResult) {
        super(str);
        this.LJLILLLLZI = new C41574GTi().LIZ();
        this.LJLIL = synthetiseResult;
    }

    public C42990Gu2(Throwable th, SynthetiseResult synthetiseResult) {
        super(th);
        this.LJLILLLLZI = new C41574GTi().LIZ();
        this.LJLIL = synthetiseResult;
    }
}
