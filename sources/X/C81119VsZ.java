package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.VsZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81119VsZ extends C81116VsW {
    public final /* synthetic */ C81120Vsa LJFF;

    @Override // X.C81116VsW, android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return this.LJFF.LIZ;
        }
        return super.getSystemService(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81119VsZ(C81120Vsa c81120Vsa, Context context, Resources.Theme theme) {
        super(context, theme);
        this.LJFF = c81120Vsa;
    }
}
