package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* JADX WARN: Incorrect field signature: TR; */
/* renamed from: X.Ghr, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42235Ghr extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ InterfaceC42234Ghq<R> LJLIL;
    public final /* synthetic */ Field LJLILLLLZI;
    public final /* synthetic */ java.util.Map<?, ?> LJLJI;
    public final /* synthetic */ Object LJLJJI;
    public final /* synthetic */ Annotation LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Ghq<TR;>;Ljava/lang/reflect/Field;Ljava/util/Map<**>;Ljava/lang/Object;TR;)V */
    public C42235Ghr(InterfaceC42234Ghq interfaceC42234Ghq, Field field, java.util.Map map, Object obj, Annotation annotation) {
        super(0);
        this.LJLIL = interfaceC42234Ghq;
        this.LJLILLLLZI = field;
        this.LJLJI = map;
        this.LJLJJI = obj;
        this.LJLJJL = annotation;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        InterfaceC42234Ghq<R> interfaceC42234Ghq = this.LJLIL;
        Field field = this.LJLILLLLZI;
        java.util.Map<Object, String> map = this.LJLJI;
        o.LJII(map, "null cannot be cast to non-null type java.util.Map<kotlin.Any, kotlin.String{ com.ss.android.ugc.aweme.creative.file.CreativeFiles.FileDes }>");
        Object key = this.LJLJJI;
        o.LJIIIIZZ(key, "key");
        Annotation annotation = this.LJLJJL;
        o.LJI(annotation);
        interfaceC42234Ghq.LIZLLL(field, map, key, annotation);
        return C76800UCe.LIZ;
    }
}
