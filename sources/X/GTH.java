package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.List;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TR; */
/* loaded from: classes8.dex */
public final class GTH extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC42234Ghq<R> LJLIL;
    public final /* synthetic */ Field LJLILLLLZI;
    public final /* synthetic */ java.util.Set<?> LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Annotation LJLJJL;
    public final /* synthetic */ List<OSZ<String, String>> LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Ghq<TR;>;Ljava/lang/reflect/Field;Ljava/util/Set<*>;Ljava/lang/Object;TR;Ljava/util/List<LX/OSZ<Ljava/lang/String;Ljava/lang/String;>;>;)V */
    public GTH(InterfaceC42234Ghq interfaceC42234Ghq, Field field, java.util.Set set, Object obj, Annotation annotation, List list) {
        super(0);
        this.LJLIL = interfaceC42234Ghq;
        this.LJLILLLLZI = field;
        this.LJLJI = set;
        this.LJLJJI = obj;
        this.LJLJJL = annotation;
        this.LJLJJLL = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC42234Ghq<R> interfaceC42234Ghq = this.LJLIL;
        Field field = this.LJLILLLLZI;
        java.util.Set<?> set = this.LJLJI;
        o.LJII(set, "null cannot be cast to non-null type java.util.Set<kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }>");
        Object obj = this.LJLJJI;
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }");
        String str = (String) obj;
        Annotation annotation = this.LJLJJL;
        if (annotation != null) {
            interfaceC42234Ghq.LIZ(field, set, str, annotation, this.LJLJJLL);
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
