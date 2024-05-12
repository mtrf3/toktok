package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokDialogImpl;

/* renamed from: X.ais, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94554ais extends AbstractC65781Prl implements InterfaceC88472Yns<Bitmap, C76800UCe> {
    public final /* synthetic */ C68322mC<Drawable> LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ TiktokDialogImpl LJLJI;
    public final /* synthetic */ Rect LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ InterfaceC93473aRR LJLJLJ;
    public final /* synthetic */ String LJLJLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94554ais(Context context, Rect rect, InterfaceC93473aRR interfaceC93473aRR, TiktokDialogImpl tiktokDialogImpl, String str, String str2, String str3, String str4, C68322mC c68322mC) {
        super(1);
        this.LJLIL = c68322mC;
        this.LJLILLLLZI = context;
        this.LJLJI = tiktokDialogImpl;
        this.LJLJJI = rect;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
        this.LJLJL = str3;
        this.LJLJLJ = interfaceC93473aRR;
        this.LJLJLLL = str4;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, android.graphics.drawable.BitmapDrawable] */
    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            this.LJLIL.element = new BitmapDrawable(this.LJLILLLLZI.getResources(), bitmap2);
        }
        TiktokDialogImpl tiktokDialogImpl = this.LJLJI;
        Context context = this.LJLILLLLZI;
        C68322mC<Drawable> c68322mC = this.LJLIL;
        C6QQ.LIZ(new C94561aiz(context, this.LJLJJI, this.LJLJLJ, tiktokDialogImpl, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLLL, c68322mC));
        return C76800UCe.LIZ;
    }
}
