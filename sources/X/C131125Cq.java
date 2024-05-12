package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.ugc.android.editor.track.control.VideoCoverHelper$loadVideoCover$1$1", f = "VideoCoverHelper.kt", l = {46}, m = "invokeSuspend")
/* renamed from: X.5Cq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C131125Cq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Bitmap>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C131125Cq(String str, InterfaceC67352kd<? super C131125Cq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C131125Cq(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C5CV c5cv = new C5CV();
            c5cv.LIZ = Integer.valueOf(C1300758p.LIZJ);
            c5cv.LIZIZ = Integer.valueOf(C1300758p.LIZLLL);
            c5cv.LIZ(ImageView.ScaleType.CENTER_CROP);
            C5CW c5cw = new C5CW(c5cv);
            C5CG c5cg = C5CG.LIZ;
            Context LIZ = C125444w8.LIZ().LIZ();
            String str = this.LJLILLLLZI;
            this.LJLIL = 1;
            obj = c5cg.LIZIZ(LIZ, str, c5cw, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Bitmap> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
