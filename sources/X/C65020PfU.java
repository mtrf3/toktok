package X;

import Y.ARunnableS11S0101000_7;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: X.PfU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65020PfU<T> implements InterfaceC65016PfQ<TypedInput, T> {
    public static volatile ExecutorService LJI;
    public final Type LIZ;
    public final Annotation[] LIZIZ;
    public final C65019PfT LIZJ;
    public final List<AbstractC65022PfW> LIZLLL;
    public final AbstractC65022PfW LJ;
    public volatile InterfaceC65016PfQ<TypedInput, T> LJFF;

    @Override // X.InterfaceC65016PfQ
    public final Object LIZ(TypedInput typedInput) {
        if (this.LJFF == null) {
            synchronized (this) {
                if (this.LJFF == null) {
                    this.LJFF = LIZIZ(this.LJ, this.LIZ, this.LIZIZ);
                }
            }
        }
        return this.LJFF.LIZ(typedInput);
    }

    public final <T> InterfaceC65016PfQ<TypedInput, T> LIZIZ(AbstractC65022PfW abstractC65022PfW, Type type, Annotation[] annotationArr) {
        if (type != null) {
            if (annotationArr != null) {
                int indexOf = this.LIZLLL.indexOf(abstractC65022PfW) + 1;
                int size = this.LIZLLL.size();
                for (int i = indexOf; i < size; i++) {
                    InterfaceC65016PfQ<TypedInput, T> interfaceC65016PfQ = (InterfaceC65016PfQ<TypedInput, T>) ((AbstractC65022PfW) ListProtector.get(this.LIZLLL, i)).LIZLLL(type, annotationArr, this.LIZJ);
                    if (interfaceC65016PfQ != null) {
                        return interfaceC65016PfQ;
                    }
                }
                StringBuilder sb = new StringBuilder("Could not locate TypeInput converter for ");
                sb.append(type);
                sb.append(".\n");
                if (abstractC65022PfW != null) {
                    sb.append("  Skipped:");
                    for (int i2 = 0; i2 < indexOf; i2++) {
                        sb.append("\n   * ");
                        sb.append(ListProtector.get(this.LIZLLL, i2).getClass().getName());
                    }
                    sb.append('\n');
                }
                sb.append("  Tried:");
                int size2 = this.LIZLLL.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    sb.append("\n   * ");
                    sb.append(ListProtector.get(this.LIZLLL, i3).getClass().getName());
                }
                throw new IllegalArgumentException(sb.toString());
            }
            throw new NullPointerException("annotations == null");
        }
        throw new NullPointerException("type == null");
    }

    public C65020PfU(Type type, Annotation[] annotationArr, C65019PfT c65019PfT, List<AbstractC65022PfW> list, AbstractC65022PfW abstractC65022PfW) {
        this.LIZ = type;
        this.LIZIZ = annotationArr;
        this.LIZJ = c65019PfT;
        this.LIZLLL = list;
        this.LJ = abstractC65022PfW;
        if (LJI == null) {
            synchronized (C65020PfU.class) {
                if (LJI == null) {
                    LJI = C38995FSd.LIZLLL();
                }
            }
        }
        LJI.submit(new ARunnableS11S0101000_7(2, this, 11));
    }
}
