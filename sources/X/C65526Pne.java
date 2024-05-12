package X;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* renamed from: X.Pne, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public enum C65526Pne extends EnumC65527Pnf {
    public C65526Pne() {
        super("IGNORE_TYPE_VARIABLE_OR_WILDCARD", 0);
    }

    @Override // X.InterfaceC65503PnH
    public final boolean apply(AbstractC65516PnU<?> abstractC65516PnU) {
        Type type = abstractC65516PnU.runtimeType;
        if (!(type instanceof TypeVariable) && !(type instanceof WildcardType)) {
            return true;
        }
        return false;
    }
}
