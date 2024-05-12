package X;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

/* renamed from: X.Fx7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40633Fx7 extends AccessibleObject implements Member {
    public final AccessibleObject LJLIL;
    public final Member LJLILLLLZI;

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        return this.LJLIL.getAnnotations();
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        return this.LJLIL.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
        return this.LJLILLLLZI.getDeclaringClass();
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.LJLILLLLZI.getModifiers();
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.LJLILLLLZI.getName();
    }

    public final int hashCode() {
        return this.LJLILLLLZI.hashCode();
    }

    @Override // java.lang.reflect.AccessibleObject
    public final boolean isAccessible() {
        return this.LJLIL.isAccessible();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.LJLILLLLZI.isSynthetic();
    }

    public String toString() {
        return this.LJLILLLLZI.toString();
    }

    public AbstractC65516PnU<?> LIZ() {
        return AbstractC65516PnU.of((Class) getDeclaringClass());
    }

    public <M extends AccessibleObject & Member> C40633Fx7(M m) {
        m.getClass();
        this.LJLIL = m;
        this.LJLILLLLZI = m;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C40633Fx7)) {
            return false;
        }
        C40633Fx7 c40633Fx7 = (C40633Fx7) obj;
        if (!LIZ().equals(c40633Fx7.LIZ()) || !this.LJLILLLLZI.equals(c40633Fx7.LJLILLLLZI)) {
            return false;
        }
        return true;
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.LJLIL.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.LJLIL.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z) {
        this.LJLIL.setAccessible(z);
    }
}
