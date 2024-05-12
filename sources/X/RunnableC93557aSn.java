package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokDialogImpl;

/* renamed from: X.aSn, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class RunnableC93557aSn implements Runnable {
    public final /* synthetic */ TiktokDialogImpl LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ C68322mC<Drawable> LJLJI;
    public final /* synthetic */ Context LJLJJI;
    public final /* synthetic */ Rect LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ InterfaceC93473aRR LJLJLLL;
    public final /* synthetic */ String LJLL;

    public RunnableC93557aSn(TiktokDialogImpl tiktokDialogImpl, String str, C68322mC<Drawable> c68322mC, Context context, Rect rect, String str2, String str3, String str4, InterfaceC93473aRR interfaceC93473aRR, String str5) {
        this.LJLIL = tiktokDialogImpl;
        this.LJLILLLLZI = str;
        this.LJLJI = c68322mC;
        this.LJLJJI = context;
        this.LJLJJL = rect;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = str4;
        this.LJLJLLL = interfaceC93473aRR;
        this.LJLL = str5;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, android.graphics.drawable.BitmapDrawable] */
    public final void LIZ() {
        Bitmap decodeBitmap = this.LJLIL.decodeBitmap(this.LJLILLLLZI, O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(48)));
        if (decodeBitmap != null) {
            this.LJLJI.element = new BitmapDrawable(this.LJLJJI.getResources(), decodeBitmap);
        }
        TiktokDialogImpl tiktokDialogImpl = this.LJLIL;
        Context context = this.LJLJJI;
        C68322mC<Drawable> c68322mC = this.LJLJI;
        C6QQ.LIZ(new C94555ait(context, this.LJLJJL, this.LJLJLLL, tiktokDialogImpl, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLL, c68322mC));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
