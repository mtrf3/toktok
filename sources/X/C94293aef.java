package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aef, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94293aef implements InterfaceC93649aUH<C94291aed> {
    public final /* synthetic */ C94855anj LIZ;
    public final /* synthetic */ AbstractC94471ahX LIZIZ;
    public final /* synthetic */ View LIZJ;

    @Override // X.InterfaceC93649aUH
    public final void LIZ(int i, C94291aed c94291aed) {
        boolean z;
        C94291aed t = c94291aed;
        o.LJIIIZ(t, "t");
        C94855anj c94855anj = this.LIZ;
        if (t.LIZ == EnumC93710aVG.RENAME) {
            z = true;
        } else {
            z = false;
        }
        c94855anj.LLIIII(false, null, null, false, z);
        InterfaceC93865aXl interfaceC93865aXl = this.LIZ.LJLJLJ;
        if (interfaceC93865aXl != null) {
            AbstractC94471ahX abstractC94471ahX = this.LIZIZ;
            o.LJI(abstractC94471ahX);
            interfaceC93865aXl.q3(t, abstractC94471ahX);
        }
    }

    public C94293aef(C94855anj c94855anj, AbstractC94471ahX abstractC94471ahX, View view) {
        this.LIZ = c94855anj;
        this.LIZIZ = abstractC94471ahX;
        this.LIZJ = view;
    }
}
