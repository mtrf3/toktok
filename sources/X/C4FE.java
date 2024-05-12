package X;

import com.ss.android.ugc.aweme.emoji.emojichoose.model.NaviStatusCode;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import fjb.a;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.emoji.systembigemoji.StickerResourceManager$loadAndFetchResources$1", f = "StickerResourceManager.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.4FE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4FE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4FE(String str, String str2, boolean z, InterfaceC67352kd<? super C4FE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4FE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<Resources> LJJIIJZLJL;
        NaviStatusCode naviStatusCode;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C4FD c4fd = C4FD.LJLIL;
                String str = this.LJLILLLLZI;
                this.LJLIL = 1;
                obj = c4fd.LJFF(str, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            ResourcesResponse resourcesResponse = (ResourcesResponse) obj;
            List<Resources> list = C61878OQg.INSTANCE;
            if (resourcesResponse != null && resourcesResponse.status_code == 0) {
                if (!C71922s0.LIZ().enable) {
                    List<Resources> resources = resourcesResponse.getResources();
                    if (resources != null) {
                        String str2 = this.LJLILLLLZI;
                        Iterator<Resources> it = resources.iterator();
                        while (it.hasNext()) {
                            it.next().setType(str2);
                        }
                        list = resources;
                    }
                    C45804HyK.LJJJLL(this.LJLILLLLZI, list);
                    if (!list.isEmpty()) {
                        C4FD.LIZLLL(this.LJLILLLLZI, list);
                    }
                }
                LJJIIJZLJL = resourcesResponse.getNaviStickers();
                if (LJJIIJZLJL != null) {
                    String str3 = this.LJLJI;
                    Iterator<Resources> it2 = LJJIIJZLJL.iterator();
                    while (it2.hasNext()) {
                        it2.next().setType(str3);
                    }
                } else {
                    LJJIIJZLJL = C61878OQg.INSTANCE;
                }
                C45804HyK.LJJJLL(this.LJLJI, LJJIIJZLJL);
                if (true ^ LJJIIJZLJL.isEmpty()) {
                    C4FD.LIZLLL(this.LJLILLLLZI, LJJIIJZLJL);
                }
            } else {
                if (!C71922s0.LIZ().enable) {
                    list = C45804HyK.LJJIIJZLJL(this.LJLILLLLZI);
                }
                LJJIIJZLJL = C45804HyK.LJJIIJZLJL(this.LJLJI);
            }
            if (resourcesResponse == null) {
                naviStatusCode = null;
            } else {
                naviStatusCode = resourcesResponse.getNaviStickerStatus();
            }
            XKX.LIZLLL(C4FD.LJLJI, null, null, new C4FG(ORZ.LLIIIZ(list, LJJIIJZLJL), naviStatusCode, this.LJLJJI, null), 3);
        } catch (Exception e) {
            C34B.LJFF(e);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
