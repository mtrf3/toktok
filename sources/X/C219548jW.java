package X;

import Y.AfS55S0100000_3;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.tiktok.addyours.holders.AddYoursTopicViewHolder$configureInviteWidgets$1", f = "AddYoursTopicViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.8jW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219548jW extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C219568jY LJLIL;
    public final /* synthetic */ AddYoursTopic LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219548jW(C219568jY c219568jY, AddYoursTopic addYoursTopic, InterfaceC67352kd<? super C219548jW> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c219568jY;
        this.LJLILLLLZI = addYoursTopic;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C219548jW(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.ArrayList] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        ?? r3;
        boolean z;
        C141335gf.LIZJ(obj);
        C221018lt.LIZ("AbsAwemeViewHolder", "start assembling avatars");
        Context context = this.LJLIL.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        Collection collection = (Collection) this.LJLIL.LJLZ.getValue();
        List<AddYoursAvatar> suggestInviteeAvatars = this.LJLILLLLZI.getSuggestInviteeAvatars();
        if (suggestInviteeAvatars != null) {
            r3 = new ArrayList();
            Iterator<AddYoursAvatar> it = suggestInviteeAvatars.iterator();
            while (it.hasNext()) {
                UrlModel userAvatar = it.next().getUserAvatar();
                if (userAvatar != null) {
                    r3.add(userAvatar);
                }
            }
        } else {
            r3 = C61878OQg.INSTANCE;
        }
        MCR mcr = new MCR(context, new C197267og(ORZ.LLIIIZ(r3, collection), 3), new MCQ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Integer(20))), O6R.LJJIIZ(C32151Nz.LJIIZILJ(new Double(1.5d))), (Integer) null, 0, 0.85f, 0.0f, 0, 0, Boolean.valueOf(C90193gN.LIZ()), (EnumC86195XsF) null, true, 748));
        Bitmap LIZLLL = mcr.LIZLLL();
        if (LIZLLL == null) {
            z = true;
        } else {
            z = false;
        }
        C219568jY c219568jY = this.LJLIL;
        InterfaceC92693kP interfaceC92693kP = null;
        XKX.LIZLLL(c219568jY.LJZ, null, null, new C219558jX(c219568jY, LIZLLL, mcr, null), 3);
        C219568jY c219568jY2 = this.LJLIL;
        if (z) {
            interfaceC92693kP = mcr.LIZIZ().LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS55S0100000_3(this.LJLIL, 46));
        } else {
            C221018lt.LIZ("AbsAwemeViewHolder", "using cached avatars, skip download");
        }
        c219568jY2.LJLLLL = (C73411SrX) interfaceC92693kP;
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
