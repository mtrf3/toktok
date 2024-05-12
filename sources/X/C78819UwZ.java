package X;

import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel$select$2", f = "OptionCategoryViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.UwZ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78819UwZ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ C78820Uwa LJLILLLLZI;
    public final /* synthetic */ OptionCategoryViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78819UwZ(C78820Uwa c78820Uwa, OptionCategoryViewModel optionCategoryViewModel, InterfaceC67352kd<? super C78819UwZ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c78820Uwa;
        this.LJLJI = optionCategoryViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C78819UwZ c78819UwZ = new C78819UwZ(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
        c78819UwZ.LJLIL = obj;
        return c78819UwZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L26;
     */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.C141335gf.LIZJ(r7)
            X.Uwa r5 = r6.LJLILLLLZI
            X.Uw5 r2 = r5.LJ
            r1 = 0
            if (r2 == 0) goto Lc
            X.UlN r1 = r2.LJIIIZ
        Lc:
            X.UlN r0 = X.EnumC78125UlN.LOCAL
            if (r1 != r0) goto L65
            if (r2 == 0) goto L57
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r4 = r6.LJLJI
            java.lang.String r1 = r5.LIZJ
            java.lang.String r0 = "Green Screen"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L57
            java.lang.String r1 = r2.LIZJ
            java.lang.String r0 = "plus"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L5a
            r4.getClass()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r0 = "key_support_flag"
            r2 = 1
            r3.putInt(r0, r2)
            java.lang.String r1 = "key_choose_scene"
            r0 = 3
            r3.putInt(r1, r0)
            java.lang.String r0 = "key_photo_select_min_count"
            r3.putInt(r0, r2)
            java.lang.String r0 = "key_photo_select_max_count"
            r3.putInt(r0, r2)
            android.app.Activity r2 = r4.LJLIL
            if (r2 == 0) goto L57
            X.Uwt r0 = X.IDM.LIZ()
            r1 = 10001(0x2711, float:1.4014E-41)
            android.content.Intent r0 = r0.LIZJ(r2, r3, r1)
            X.C16880lQ.LJFF(r2, r1, r0)
        L57:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        L5a:
            X.Uwb r1 = r4.LJLJI
            X.UwT r0 = new X.UwT
            r0.<init>(r4, r5)
            r1.LIZIZ(r5, r0)
            goto L57
        L65:
            if (r2 == 0) goto L8a
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r2.LJFF
            if (r3 == 0) goto L8a
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r2 = r6.LJLJI
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r3.getUnzipPath()
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L92
            X.XEf r1 = r2.LJLILLLLZI
            X.Uwj r0 = new X.Uwj
            r0.<init>(r2, r5)
            r1.LJJIIZI(r3, r0)
        L86:
            X.UCe r0 = X.C76800UCe.LIZ
            if (r0 != 0) goto L57
        L8a:
            com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel r1 = r6.LJLJI
            X.Uwa r0 = r6.LJLILLLLZI
            r1.gv0(r0)
            goto L57
        L92:
            r2.gv0(r5)
            goto L86
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78819UwZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
