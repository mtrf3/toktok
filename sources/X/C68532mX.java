package X;

import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.avatar.ChangAvatarActionStage$loadResourceAndPublish$1$infoStickerJob$1", f = "ChangAvatarActionStage.kt", l = {203}, m = "invokeSuspend")
/* renamed from: X.2mX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68532mX extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends OSZ<? extends C121514pn, ? extends StickerItemModel>>>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C137415aL LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68532mX(C137415aL c137415aL, InterfaceC67352kd<? super C68532mX> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c137415aL;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C68532mX c68532mX = new C68532mX(this.LJLJI, interfaceC67352kd);
        c68532mX.LJLILLLLZI = obj;
        return c68532mX;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r8.LJLIL
            r7 = 1
            if (r0 == 0) goto Ld
            if (r0 != r7) goto L58
            X.C141335gf.LIZJ(r9)
        Lc:
            return r9
        Ld:
            X.C141335gf.LIZJ(r9)
            java.lang.Object r5 = r8.LJLILLLLZI
            X.2pa r5 = (X.InterfaceC70422pa) r5
            X.5aL r6 = r8.LJLJI
            r8.LJLIL = r7
            r6.getClass()
            X.XKg r4 = new X.XKg
            X.2kd r0 = X.C78555UsJ.LJJII(r8)
            r4.<init>(r0)
            java.lang.String r2 = "enable_story_avatar_info_sticker"
            r1 = 0
            r0 = 31744(0x7c00, float:4.4483E-41)
            boolean r0 = defpackage.e1.LIZ(r0, r2, r7, r1)
            if (r0 == 0) goto L4f
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r6.LIZIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r1 = r0.creativeModel
            java.lang.String r0 = "editModel.creativeModel"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            com.ss.android.ugc.aweme.creative.model.ChangeAvatarModel r0 = r1.changeAvatarModel
            boolean r0 = r0.isFromAiVatar
            if (r0 != 0) goto L4f
            X.2mZ r2 = new X.2mZ
            r1 = 0
            r2.<init>(r6, r4, r1)
            r0 = 3
            X.XKX.LIZLLL(r5, r1, r1, r2, r0)
        L48:
            java.lang.Object r9 = r4.LIZ()
            if (r9 != r3) goto Lc
            return r3
        L4f:
            X.OQg r0 = X.C61878OQg.INSTANCE
            X.C3C5.m7constructorimpl(r0)
            r4.resumeWith(r0)
            goto L48
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68532mX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends OSZ<? extends C121514pn, ? extends StickerItemModel>>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
