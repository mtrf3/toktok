package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fjb.a;
import java.util.HashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.ui.widget.RecyclerLayoutObserver$observerRecyclerViewLayoutChanged$1", f = "RecyclerLayoutObserver.kt", l = {38}, m = "invokeSuspend")
/* renamed from: X.2gk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C64942gk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C64952gl LJLIL;
    public InterfaceC65784Pro LJLILLLLZI;
    public RecyclerView LJLJI;
    public int LJLJJI;
    public final /* synthetic */ RecyclerView LJLJJL;
    public final /* synthetic */ C64952gl LJLJJLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64942gk(RecyclerView recyclerView, C64952gl c64952gl, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC67352kd<? super C64942gk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = recyclerView;
        this.LJLJJLL = c64952gl;
        this.LJLJL = interfaceC65784Pro;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C64942gk(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        RecyclerView recyclerView;
        C64952gl c64952gl;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                recyclerView = this.LJLJI;
                interfaceC65784Pro = this.LJLILLLLZI;
                c64952gl = this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            recyclerView = this.LJLJJL;
            if (recyclerView != null) {
                c64952gl = this.LJLJJLL;
                interfaceC65784Pro = this.LJLJL;
                HashMap hashMap = new HashMap();
                int childCount = recyclerView.getChildCount();
                boolean z = false;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != null) {
                        float y = recyclerView.LJJJJJL(childAt).itemView.getY();
                        if (((HashMap) c64952gl.LIZ).containsKey(new Integer(i2))) {
                            if (!o.LIZJ((Float) ((HashMap) c64952gl.LIZ).get(new Integer(i2)), y)) {
                                z = true;
                            }
                        }
                        hashMap.put(new Integer(i2), new Float(y));
                    }
                }
                c64952gl.LIZ = hashMap;
                if (z) {
                    this.LJLIL = c64952gl;
                    this.LJLILLLLZI = interfaceC65784Pro;
                    this.LJLJI = recyclerView;
                    this.LJLJJI = 1;
                    if (C1JD.LIZJ(100L, this) == enumC58928NAu) {
                        return enumC58928NAu;
                    }
                } else {
                    c64952gl.LIZIZ = false;
                    XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C64372fp(interfaceC65784Pro, null), 3);
                }
            }
            return C76800UCe.LIZ;
        }
        c64952gl.LIZ(recyclerView, interfaceC65784Pro);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
