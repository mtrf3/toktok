package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.emoji.systembigemoji.PreloadBigEmojiTask;
import fjb.a;
import java.util.LinkedHashMap;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.StickerResourceManager$loadAndFetchResourcesComplete$1$2", f = "StickerResourceManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4FH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ NaviStatusCode LJLIL;
    public final /* synthetic */ LinkedHashMap<Resources, List<Emoji>> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4FH(NaviStatusCode naviStatusCode, LinkedHashMap<Resources, List<Emoji>> linkedHashMap, boolean z, InterfaceC67352kd<? super C4FH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = naviStatusCode;
        this.LJLILLLLZI = linkedHashMap;
        this.LJLJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FH(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        NaviStatusCode naviStatusCode = this.LJLIL;
        LinkedHashMap<Resources, List<Emoji>> linkedHashMap = this.LJLILLLLZI;
        C105734Cz c105734Cz = new C105734Cz(naviStatusCode, linkedHashMap);
        if (linkedHashMap.size() == 0 && this.LJLIL == NaviStatusCode.SUCCESS) {
            z = true;
        } else {
            z = false;
        }
        C4FD.LJLILLLLZI = Boolean.valueOf(z);
        C4FD.LJLIL.LIZJ(c105734Cz);
        if (this.LJLJI) {
            C36093EEn.LIZ.getClass();
            C36089EEj LJIIIZ = C36093EEn.LJIIIZ();
            LJIIIZ.LIZIZ(new PreloadBigEmojiTask(c105734Cz), true);
            LJIIIZ.LIZJ();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
