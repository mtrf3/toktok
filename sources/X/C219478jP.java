package X;

import Y.AfS55S0100000_3;
import android.content.Context;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.hub.assem.AddYoursHubItemCellAssem$bindInviteInfoContainer$2$4", f = "AddYoursHubItemCellAssem.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8jP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219478jP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ AddYoursHubItemCellAssem LJLIL;
    public final /* synthetic */ AddYoursTopic LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219478jP(AddYoursHubItemCellAssem addYoursHubItemCellAssem, AddYoursTopic addYoursTopic, InterfaceC67352kd<? super C219478jP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = addYoursHubItemCellAssem;
        this.LJLILLLLZI = addYoursTopic;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219478jP(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r4;
        C73411SrX c73411SrX;
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL.Y3().getContext();
        o.LJIIIIZZ(context, "contentView.context");
        List<AddYoursAvatar> inviterAvatars = this.LJLILLLLZI.getInviterAvatars();
        if (inviterAvatars != null) {
            r4 = new ArrayList();
            Iterator<AddYoursAvatar> it = inviterAvatars.iterator();
            while (it.hasNext()) {
                UrlModel userAvatar = it.next().getUserAvatar();
                if (userAvatar != null) {
                    r4.add(userAvatar);
                }
            }
        } else {
            r4 = C61878OQg.INSTANCE;
        }
        MCR mcr = new MCR(context, new C197267og(r4, 3), new MCQ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(16))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(1))), (Integer) null, 0, 0.0f, 0.0f, 0, 0, (Boolean) null, (EnumC86195XsF) null, true, 1020));
        C73411SrX c73411SrX2 = this.LJLIL.LLFFF;
        if (c73411SrX2 != null && !c73411SrX2.isDisposed() && (c73411SrX = this.LJLIL.LLFFF) != null) {
            c73411SrX.dispose();
        }
        this.LJLIL.LLFFF = (C73411SrX) mcr.LIZIZ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(this.LJLIL, 49));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
