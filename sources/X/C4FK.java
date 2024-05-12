package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.EmojiModel$onDownloadResourcesComplete$1$1", f = "EmojiModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4FK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Resources LJLIL;
    public final /* synthetic */ List<Emoji> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C4FK(Resources resources, List<? extends Emoji> list, InterfaceC67352kd<? super C4FK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = resources;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FK(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        Iterator it = ((ArrayList) C4FF.LJLJL).iterator();
        while (it.hasNext()) {
            ((C4FT) it.next()).LIZIZ(this.LJLIL, this.LJLILLLLZI);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
