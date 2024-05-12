package X;

import Y.AfS55S0100000_3;
import android.content.Context;
import com.ss.android.ugc.aweme.nows.feed.ui.guide.NowWeakVersionShareCell;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.ui.guide.NowWeakVersionShareCell$onBindItemView$1", f = "NowWeakVersionShareCell.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7r1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198717r1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NowWeakVersionShareCell LJLIL;
    public final /* synthetic */ C198727r2 LJLILLLLZI;
    public final /* synthetic */ MCQ LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198717r1(NowWeakVersionShareCell nowWeakVersionShareCell, C198727r2 c198727r2, MCQ mcq, InterfaceC67352kd<? super C198717r1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nowWeakVersionShareCell;
        this.LJLILLLLZI = c198727r2;
        this.LJLJI = mcq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C198717r1(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        MCR mcr = new MCR(context, new C197267og(this.LJLILLLLZI.LJLIL, 3), this.LJLJI);
        C73411SrX c73411SrX = this.LJLIL.LJLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        this.LJLIL.LJLIL = (C73411SrX) mcr.LIZIZ().LJJJJZI(new AfS55S0100000_3(this.LJLIL, 75));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
