package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class BPU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public final /* synthetic */ Fragment LJLIL;
    public final /* synthetic */ String LJLILLLLZI = "is_self";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BPU(Fragment fragment) {
        super(0);
        this.LJLIL = fragment;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r1.getBoolean(r2.LJLILLLLZI) == true) goto L6;
     */
    @Override // X.InterfaceC65784Pro
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke() {
        /*
            r2 = this;
            androidx.fragment.app.Fragment r0 = r2.LJLIL
            android.os.Bundle r1 = r0.getArguments()
            if (r1 == 0) goto L16
            java.lang.String r0 = r2.LJLILLLLZI
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != r0) goto L16
        L11:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L16:
            r0 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPU.invoke():java.lang.Object");
    }
}
