package X;

import java.util.Arrays;

/* loaded from: classes12.dex */
public enum Q5O {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true, true),
    NATIVE_ONLY(true, true, false, false, false, true, true),
    KATANA_ONLY(false, true, false, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true, true),
    DEVICE_AUTH(false, false, false, true, false, false, false);

    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static Q5O[] valuesCustom() {
        return (Q5O[]) Arrays.copyOf(values(), 7);
    }

    public final boolean allowsCustomTabAuth() {
        return this.LJLJJL;
    }

    public final boolean allowsDeviceAuth() {
        return this.LJLJJI;
    }

    public final boolean allowsFacebookLiteAuth() {
        return this.LJLJJLL;
    }

    public final boolean allowsGetTokenAuth() {
        return this.LJLIL;
    }

    public final boolean allowsInstagramAppAuth() {
        return this.LJLJL;
    }

    public final boolean allowsKatanaAuth() {
        return this.LJLILLLLZI;
    }

    public final boolean allowsWebViewAuth() {
        return this.LJLJI;
    }

    Q5O(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = z4;
        this.LJLJJL = z5;
        this.LJLJJLL = z6;
        this.LJLJL = z7;
    }
}
