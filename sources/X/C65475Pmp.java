package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Pmp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65475Pmp extends C65476Pmq {
    public final /* synthetic */ TypeVariable LIZIZ;

    @Override // X.C65476Pmq
    public final TypeVariable<?> LIZIZ(Type[] typeArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
        linkedHashSet.addAll(Arrays.asList(this.LIZIZ.getBounds()));
        if (linkedHashSet.size() > 1) {
            linkedHashSet.remove(Object.class);
        }
        return super.LIZIZ((Type[]) linkedHashSet.toArray(new Type[0]));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C65475Pmp(AtomicInteger atomicInteger, TypeVariable typeVariable) {
        super(atomicInteger);
        this.LIZIZ = typeVariable;
    }
}
