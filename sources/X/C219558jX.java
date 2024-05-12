package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.holders.AddYoursTopicViewHolder$configureInviteWidgets$1$1", f = "AddYoursTopicViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219558jX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C219568jY LJLIL;
    public final /* synthetic */ Bitmap LJLILLLLZI;
    public final /* synthetic */ MCR LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219558jX(C219568jY c219568jY, Bitmap bitmap, MCR mcr, InterfaceC67352kd<? super C219558jX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c219568jY;
        this.LJLILLLLZI = bitmap;
        this.LJLJI = mcr;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219558jX(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Object value = this.LJLIL.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarList>(...)");
        ImageView imageView = (ImageView) value;
        Bitmap bitmap = this.LJLILLLLZI;
        if (bitmap == null) {
            bitmap = this.LJLJI.LIZ();
        }
        imageView.setImageBitmap(bitmap);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
