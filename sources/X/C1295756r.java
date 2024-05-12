package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.56r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1295756r extends AbstractC65781Prl implements InterfaceC88472Yns<C122034qd, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ ArrayList LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ AtomicBoolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1295756r(String str, ArrayList arrayList, int i, AtomicBoolean atomicBoolean) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = i;
        this.LJLJJI = atomicBoolean;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C122034qd c122034qd) {
        C122034qd editorPro = c122034qd;
        o.LJIIIZ(editorPro, "editorPro");
        String str = this.LJLIL;
        if (str != null) {
            Object obj = ListProtector.get(this.LJLILLLLZI, this.LJLJI);
            o.LJIIIIZZ(obj, "stack[i]");
            if (o.LJ(str, ((EffectPointModel) obj).getUuid())) {
                editorPro.LIZLLL().LJJIIZ(new String[]{this.LJLIL});
                ListProtector.remove(this.LJLILLLLZI, this.LJLJI);
                this.LJLJJI.set(true);
            }
        }
        return C76800UCe.LIZ;
    }
}
