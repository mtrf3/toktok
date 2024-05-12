package X;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* renamed from: X.Pna, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65522Pna<T, R> extends C40633Fx7 implements GenericDeclaration {
    @Override // X.C40633Fx7, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) super.getDeclaringClass();
    }

    public <M extends AccessibleObject & Member> AbstractC65522Pna(M m) {
        super(m);
    }
}
