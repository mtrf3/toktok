package X;

import android.app.Dialog;
import android.graphics.Bitmap;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.GOe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41440GOe implements InterfaceC41846Gba, A91 {
    public final /* synthetic */ InterfaceC88472Yns LJLIL;

    public /* synthetic */ C41440GOe(InterfaceC88472Yns interfaceC88472Yns) {
        this.LJLIL = interfaceC88472Yns;
    }

    @Override // X.A91
    public void LIZ(Dialog dialog) {
        o.LJIIIZ(dialog, "dialog");
        this.LJLIL.invoke(dialog);
    }

    @Override // X.InterfaceC41846Gba
    public void accept(Object obj) {
        C6QQ.LIZ(new AqS153S0200000_6(this.LJLIL, (InterfaceC88472Yns<? super Bitmap, C76800UCe>) obj, (Bitmap) 10));
    }
}
