package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.composer.model.CreationConfigModelCompat;
import fjb.a;
import kotlin.jvm.internal.AqS157S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.external.composer.CreationComposerProcessor$start$1$2", f = "CreationComposerProcessor.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.H8q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43584H8q extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;
    public final /* synthetic */ CreationConfigModelCompat LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C43584H8q(Context context, Intent intent, CreationConfigModelCompat creationConfigModelCompat, InterfaceC67352kd<? super C43584H8q> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = context;
        this.LJLILLLLZI = intent;
        this.LJLJI = creationConfigModelCompat;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C43584H8q(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Bundle bundle;
        C141335gf.LIZJ(obj);
        Context context = this.LJLIL;
        Intent intent = this.LJLILLLLZI;
        if (intent != null) {
            bundle = C16880lQ.LLJJIJI(intent);
        } else {
            bundle = null;
        }
        C42662Gok.LJFF(context, bundle);
        C6QQ.LIZ(new AqS157S0100000_7(this.LJLJI, 749));
        return C76800UCe.LIZ;
    }
}
