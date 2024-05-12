package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;

/* loaded from: classes7.dex */
public final class FTG extends FTH {
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d5, code lost:
    
        if (X.C3C5.m10exceptionOrNullimpl(r0) != null) goto L19;
     */
    @Override // X.AbstractC37594EpC
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r13, X.C37356ElM r14, X.EnumC37844EtE r15) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTG.LJI(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, X.ElM, X.EtE):void");
    }

    public final OSZ<Boolean, String> LJII(Context context, String str, int i, EnumC37844EtE enumC37844EtE) {
        Object LIZ;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.putExtra("pns.sandbox.dataflow_id", i);
        String LJ = LJ(enumC37844EtE);
        if (LJ != null) {
            intent.putExtra("jsb_referer_url", LJ);
        }
        try {
            intent.setData(UriProtector.parse(str));
            C16880lQ.LIZJ(context, intent);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            C78983UzD.LJIIZILJ(m10exceptionOrNullimpl);
            return new OSZ<>(Boolean.FALSE, i0.LJFF("No match link. schema: ", str));
        }
        return new OSZ<>(Boolean.TRUE, "");
    }
}
