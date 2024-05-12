package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C76800UCe;
import X.InterfaceC42234Ghq;
import X.InterfaceC65784Pro;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes8.dex */
public class AqS9S0401000_7 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS9S0401000_7 aqS9S0401000_7) {
        InterfaceC42234Ghq interfaceC42234Ghq = (InterfaceC42234Ghq) aqS9S0401000_7.l0;
        Field field = (Field) aqS9S0401000_7.l1;
        Object[] objArr = (Object[]) aqS9S0401000_7.l2;
        o.LJII(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }>");
        int i = aqS9S0401000_7.i4;
        Annotation annotation = (Annotation) aqS9S0401000_7.l3;
        o.LJI(annotation);
        interfaceC42234Ghq.LIZIZ(field, (String[]) objArr, i, annotation);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS9S0401000_7 aqS9S0401000_7) {
        InterfaceC42234Ghq interfaceC42234Ghq = (InterfaceC42234Ghq) aqS9S0401000_7.l0;
        Field field = (Field) aqS9S0401000_7.l1;
        List<String> list = (List) aqS9S0401000_7.l2;
        o.LJII(list, "null cannot be cast to non-null type java.util.List<kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }>");
        int i = aqS9S0401000_7.i4;
        Annotation annotation = (Annotation) aqS9S0401000_7.l3;
        o.LJI(annotation);
        interfaceC42234Ghq.LIZJ(field, list, i, annotation);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS9S0401000_7(InterfaceC42234Ghq interfaceC42234Ghq, InterfaceC42234Ghq<R> interfaceC42234Ghq2, Field field, List<?> list, int i, R r) {
        super(0);
        this.$t = r;
        this.l0 = interfaceC42234Ghq;
        this.l1 = interfaceC42234Ghq2;
        this.l2 = field;
        this.i4 = list;
        this.l3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS9S0401000_7(InterfaceC42234Ghq interfaceC42234Ghq, InterfaceC42234Ghq<R> interfaceC42234Ghq2, Field field, Object[] objArr, int i, R r) {
        super(0);
        this.$t = r;
        this.l0 = interfaceC42234Ghq;
        this.l1 = interfaceC42234Ghq2;
        this.l2 = field;
        this.i4 = objArr;
        this.l3 = i;
    }
}
