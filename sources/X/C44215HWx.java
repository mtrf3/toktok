package X;

import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.HWx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44215HWx extends AbstractC72439Sbr {
    public final /* synthetic */ HO7 LJLIL;

    @Override // X.InterfaceC70769Rq1
    public final void s2(android.net.Uri uri, View view, Throwable th) {
    }

    public C44215HWx(C45470Hsw c45470Hsw) {
        this.LJLIL = c45470Hsw;
    }

    @Override // X.AbstractC72439Sbr, X.InterfaceC70769Rq1
    public final void T1(android.net.Uri uri, SmartImageView smartImageView) {
        o.LJIIIZ(uri, "uri");
        super.T1(uri, smartImageView);
        C45470Hsw c45470Hsw = (C45470Hsw) this.LJLIL;
        c45470Hsw.getClass();
        c45470Hsw.LIZ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC70769Rq1
    public final void U0(android.net.Uri uri, View view, C2047581v c2047581v, Animatable animatable) {
        o.LJIIIZ(uri, "uri");
        ((C45470Hsw) this.LJLIL).LIZ();
    }
}
