package X;

import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class URP extends F9E {
    public final boolean LJLIL;
    public final EnumC77147UPn LJLILLLLZI;
    public final EnumC77147UPn LJLJI;
    public final List<EnumC77147UPn> LJLJJI;
    public final boolean LJLJJL;
    public final RelationFreqControlData LJLJJLL;
    public final EnumC55722Ltu LJLJL;

    public URP() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Boolean.valueOf(this.LJLJJL), this.LJLJJLL, this.LJLJL};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public URP(int r9) {
        /*
            r8 = this;
            r1 = 0
            X.UPn r2 = X.EnumC77147UPn.CONTACT
            X.OQg r4 = X.C61878OQg.INSTANCE
            com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData r6 = new com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData
            r6.<init>(r1)
            X.Ltu r7 = X.EnumC55722Ltu.BEFORE_AUTH_PIPELINE
            r0 = r8
            r3 = r2
            r5 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.URP.<init>(int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public URP(boolean z, EnumC77147UPn firstShowPlatform, EnumC77147UPn lastShowPlatform, List<? extends EnumC77147UPn> showPlatformList, boolean z2, RelationFreqControlData freqControlData, EnumC55722Ltu authDialogStep) {
        o.LJIIIZ(firstShowPlatform, "firstShowPlatform");
        o.LJIIIZ(lastShowPlatform, "lastShowPlatform");
        o.LJIIIZ(showPlatformList, "showPlatformList");
        o.LJIIIZ(freqControlData, "freqControlData");
        o.LJIIIZ(authDialogStep, "authDialogStep");
        this.LJLIL = z;
        this.LJLILLLLZI = firstShowPlatform;
        this.LJLJI = lastShowPlatform;
        this.LJLJJI = showPlatformList;
        this.LJLJJL = z2;
        this.LJLJJLL = freqControlData;
        this.LJLJL = authDialogStep;
    }

    public static URP L(URP urp, boolean z, EnumC77147UPn enumC77147UPn, EnumC77147UPn enumC77147UPn2, List list, boolean z2, RelationFreqControlData relationFreqControlData, EnumC55722Ltu enumC55722Ltu, int i) {
        EnumC55722Ltu authDialogStep = enumC55722Ltu;
        EnumC77147UPn firstShowPlatform = enumC77147UPn;
        boolean z3 = z;
        EnumC77147UPn lastShowPlatform = enumC77147UPn2;
        List showPlatformList = list;
        boolean z4 = z2;
        RelationFreqControlData freqControlData = relationFreqControlData;
        if ((i & 1) != 0) {
            z3 = urp.LJLIL;
        }
        if ((i & 2) != 0) {
            firstShowPlatform = urp.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            lastShowPlatform = urp.LJLJI;
        }
        if ((i & 8) != 0) {
            showPlatformList = urp.LJLJJI;
        }
        if ((i & 16) != 0) {
            z4 = urp.LJLJJL;
        }
        if ((i & 32) != 0) {
            freqControlData = urp.LJLJJLL;
        }
        if ((i & 64) != 0) {
            authDialogStep = urp.LJLJL;
        }
        urp.getClass();
        o.LJIIIZ(firstShowPlatform, "firstShowPlatform");
        o.LJIIIZ(lastShowPlatform, "lastShowPlatform");
        o.LJIIIZ(showPlatformList, "showPlatformList");
        o.LJIIIZ(freqControlData, "freqControlData");
        o.LJIIIZ(authDialogStep, "authDialogStep");
        return new URP(z3, firstShowPlatform, lastShowPlatform, showPlatformList, z4, freqControlData, authDialogStep);
    }
}
