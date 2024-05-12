package X;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50438Jqs extends F9E implements Serializable {
    public final C50321Joz LJLIL;
    public final C50431Jql LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public C50438Jqs() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C50438Jqs copy$default(C50438Jqs c50438Jqs, C50321Joz c50321Joz, C50431Jql c50431Jql, int i, Object obj) {
        if ((i & 1) != 0) {
            c50321Joz = c50438Jqs.LJLIL;
        }
        if ((i & 2) != 0) {
            c50431Jql = c50438Jqs.LJLILLLLZI;
        }
        return c50438Jqs.copy(c50321Joz, c50431Jql);
    }

    public final C50438Jqs copy(C50321Joz fragmentData, C50431Jql globalData) {
        o.LJIIIZ(fragmentData, "fragmentData");
        o.LJIIIZ(globalData, "globalData");
        return new C50438Jqs(fragmentData, globalData);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public final C50321Joz getFragmentData() {
        return this.LJLIL;
    }

    public final C50431Jql getGlobalData() {
        return this.LJLILLLLZI;
    }

    public final C50438Jqs refreshFragmentData(C50321Joz searchFragmentData) {
        o.LJIIIZ(searchFragmentData, "searchFragmentData");
        return copy$default(this, searchFragmentData, null, 2, null);
    }

    public C50438Jqs(C50321Joz fragmentData, C50431Jql globalData) {
        o.LJIIIZ(fragmentData, "fragmentData");
        o.LJIIIZ(globalData, "globalData");
        this.LJLIL = fragmentData;
        this.LJLILLLLZI = globalData;
    }

    public /* synthetic */ C50438Jqs(C50321Joz c50321Joz, C50431Jql c50431Jql, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C50321Joz(0, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null) : c50321Joz, (i & 2) != 0 ? new C50431Jql(0, 0, null, null, null, null, null, 127, null) : c50431Jql);
    }
}
