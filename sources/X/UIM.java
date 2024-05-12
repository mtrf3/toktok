package X;

import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UIM extends Exception {
    public static final UIL Companion = new UIL();
    public Integer LJLIL;
    public Integer LJLILLLLZI;
    public String LJLJI;

    public final Integer getDetailCode() {
        return this.LJLILLLLZI;
    }

    public final Integer getErrorCode() {
        return this.LJLIL;
    }

    public final String getErrorMsg() {
        return this.LJLJI;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UIM(String errorMsg) {
        this(-1, -1, errorMsg);
        o.LJIIIZ(errorMsg, "errorMsg");
    }

    public final void setDetailCode(Integer num) {
        this.LJLILLLLZI = num;
    }

    public final void setErrorCode(Integer num) {
        this.LJLIL = num;
    }

    public final void setErrorMsg(String str) {
        this.LJLJI = str;
    }

    public UIM(Integer num, String str) {
        this(num, -1, str);
    }

    public UIM(Integer num, Integer num2, String str) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
        this.LJLJI = str;
    }
}
