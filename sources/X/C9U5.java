package X;

import com.ss.android.ugc.aweme.relation.auth.model.RegisteredContactUser;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.9U5, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9U5 extends F9E implements Serializable {
    public final List<EMX> LJLIL;
    public final List<RegisteredContactUser> LJLILLLLZI;
    public final java.util.Map<String, EMX> LJLJI;

    public C9U5() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C9U5 copy$default(C9U5 c9u5, List list, List list2, java.util.Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c9u5.LJLIL;
        }
        if ((i & 2) != 0) {
            list2 = c9u5.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            map = c9u5.LJLJI;
        }
        return c9u5.copy(list, list2, map);
    }

    public final C9U5 copy(List<EMX> unregisterItemList, List<RegisteredContactUser> registerItemList, java.util.Map<String, EMX> hashNationalNumberMap) {
        o.LJIIIZ(unregisterItemList, "unregisterItemList");
        o.LJIIIZ(registerItemList, "registerItemList");
        o.LJIIIZ(hashNationalNumberMap, "hashNationalNumberMap");
        return new C9U5(unregisterItemList, registerItemList, hashNationalNumberMap);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    public final java.util.Map<String, EMX> getHashNationalNumberMap() {
        return this.LJLJI;
    }

    public final List<RegisteredContactUser> getRegisterItemList() {
        return this.LJLILLLLZI;
    }

    public final List<EMX> getUnregisterItemList() {
        return this.LJLIL;
    }

    public C9U5(List<EMX> unregisterItemList, List<RegisteredContactUser> registerItemList, java.util.Map<String, EMX> hashNationalNumberMap) {
        o.LJIIIZ(unregisterItemList, "unregisterItemList");
        o.LJIIIZ(registerItemList, "registerItemList");
        o.LJIIIZ(hashNationalNumberMap, "hashNationalNumberMap");
        this.LJLIL = unregisterItemList;
        this.LJLILLLLZI = registerItemList;
        this.LJLJI = hashNationalNumberMap;
    }

    public C9U5(List list, List list2, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list, (i & 2) != 0 ? C61878OQg.INSTANCE : list2, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}
