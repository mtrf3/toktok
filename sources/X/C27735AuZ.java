package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsStickerAdapter$onViewAttachedToWindow$1$1$1", f = "MyEffectsStickerAdapter.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.AuZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27735AuZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TD3 LJLIL;
    public final /* synthetic */ C73365Sqn<Effect> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27735AuZ(TD3 td3, C73365Sqn<Effect> c73365Sqn, InterfaceC67352kd<? super C27735AuZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = td3;
        this.LJLILLLLZI = c73365Sqn;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C27735AuZ(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        TD3 td3 = this.LJLIL;
        C73365Sqn<Effect> c73365Sqn = this.LJLILLLLZI;
        td3.getClass();
        Context context = c73365Sqn.itemView.getContext();
        o.LJIIIIZZ(context, "holder.itemView.context");
        C139825eE c139825eE = new C139825eE(context);
        View view = c73365Sqn.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        c139825eE.LIZ.LIZIZ = view;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LJIIJJI(R.string.fyu);
        c139825eE.LIZ.LJII = 5000L;
        c139825eE.LIZJ().show();
        this.LJLIL.LL.storeBoolean("ame_tooltip_seen", true);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
