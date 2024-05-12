package X;

import com.ss.android.vesdk.runtime.VERuntime;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class P6I {
    public static final P6I LJLILLLLZI;
    public static final /* synthetic */ P6I[] LJLJI;
    public final VERuntime LJLIL = new VERuntime();

    static {
        P6I p6i = new P6I();
        LJLILLLLZI = p6i;
        LJLJI = new P6I[]{p6i};
    }

    public static P6I[] values() {
        return (P6I[]) LJLJI.clone();
    }

    public static P6I valueOf(String str) {
        return (P6I) V0N.LJJJ(P6I.class, str);
    }
}
