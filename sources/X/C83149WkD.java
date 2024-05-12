package X;

import com.google.gson.internal.c;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUesTabInfo;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifyUsedInfo;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import fjb.a;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.beauty.manager.BeautySource$getUsedBeautyInfo$1", f = "BeautySource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.WkD, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83149WkD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C83146WkA LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83149WkD(C83146WkA c83146WkA, InterfaceC88472Yns interfaceC88472Yns, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c83146WkA;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C83149WkD(this.LJLIL, this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        synchronized (this.LJLIL.LJIJI.getValue()) {
            this.LJLIL.LJIIJ().info.clear();
            for (BeautyCategory beautyCategory : this.LJLIL.LIZJ) {
                if (this.LJLIL.LJFF(beautyCategory.getCategoryResponse().getId(), false)) {
                    BeautifyUesTabInfo LJ = c.LJ(beautyCategory.getBeautyList(), beautyCategory.getCategoryResponse().getName());
                    if (!LJ.parentNameList.isEmpty()) {
                        this.LJLIL.LJIIJ().info.add(LJ);
                    }
                }
            }
            ((ArrayList) this.LJLIL.LJIIZILJ).clear();
            C83146WkA c83146WkA = this.LJLIL;
            ((ArrayList) c83146WkA.LJIIZILJ).addAll(c83146WkA.LJIIJ().info);
            C83146WkA c83146WkA2 = this.LJLIL;
            C68249QqT c68249QqT = c83146WkA2.LJIIL;
            if (c68249QqT != null) {
                BeautifyUsedInfo info = c83146WkA2.LJIIJ();
                o.LJIIIZ(info, "info");
                InterfaceC83246Wlm interfaceC83246Wlm = (InterfaceC83246Wlm) c68249QqT.LIZ;
                if (interfaceC83246Wlm != null) {
                    interfaceC83246Wlm.LJI(info);
                }
            }
            InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
            if (interfaceC88472Yns != null) {
            }
        }
        return C76800UCe.LIZ;
    }
}
