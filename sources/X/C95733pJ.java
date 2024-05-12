package X;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.3pJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95733pJ extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C43I<? extends Pair<Integer, String>>, C76800UCe> {
    public static final C95733pJ LJLIL = new C95733pJ();

    public C95733pJ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, C43I<? extends Pair<Integer, String>> c43i) {
        Pair pair;
        CharSequence charSequence;
        Context context;
        Activity LJIJJ;
        UIAssem selectSubscribe = uIAssem;
        C43I<? extends Pair<Integer, String>> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (pair = (Pair) c43i2.LIZ) != null && (charSequence = (CharSequence) pair.second) != null && charSequence.length() != 0 && (context = selectSubscribe.getContext()) != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null) {
            C26045AKb c26045AKb = new C26045AKb(LJIJJ);
            c26045AKb.LJIIIZ((CharSequence) pair.second);
            Object obj = pair.first;
            o.LJIIIIZZ(obj, "pair.first");
            c26045AKb.LJFF(((Number) obj).intValue());
            c26045AKb.LJIIJ();
        }
        return C76800UCe.LIZ;
    }
}
