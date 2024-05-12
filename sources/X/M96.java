package X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M96 extends M95 {
    public final List<InterfaceC55235Lm3> LIZJ;

    @Override // X.M95
    public final <T> T LIZ(Class<T> cls) {
        T t;
        T t2 = (T) super.LIZ(cls);
        if (t2 == null) {
            List<InterfaceC55235Lm3> list = this.LIZJ;
            if (!InterfaceC80653En.class.isAssignableFrom(cls) || list == null) {
                return null;
            }
            Iterator<InterfaceC55235Lm3> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(it.next(), cls, null);
                if (LIZLLL != null && (t = (T) LIZLLL.getSource()) != null) {
                    return t;
                }
            }
            throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
        }
        return t2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M96(List<? extends InterfaceC55235Lm3> vScopes, L71... paramProviders) {
        super((L71[]) Arrays.copyOf(paramProviders, paramProviders.length));
        o.LJIIIZ(vScopes, "vScopes");
        o.LJIIIZ(paramProviders, "paramProviders");
        this.LIZJ = vScopes;
    }
}
