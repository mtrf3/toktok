package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AuthorizedScope implements Serializable {
    public Boolean LJLIL;

    @InterfaceC65349Pkn("scope_desc")
    public final String scopeDesc;

    @InterfaceC65349Pkn("scope_name")
    public final String scopeName;

    @InterfaceC65349Pkn("is_scope_required")
    public final Boolean scopeRequired;

    public static /* synthetic */ AuthorizedScope copy$default(AuthorizedScope authorizedScope, String str, String str2, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authorizedScope.scopeName;
        }
        if ((i & 2) != 0) {
            str2 = authorizedScope.scopeDesc;
        }
        if ((i & 4) != 0) {
            bool = authorizedScope.scopeRequired;
        }
        if ((i & 8) != 0) {
            bool2 = authorizedScope.LJLIL;
        }
        return authorizedScope.copy(str, str2, bool, bool2);
    }

    public final AuthorizedScope copy(String scopeName, String str, Boolean bool, Boolean bool2) {
        o.LJIIIZ(scopeName, "scopeName");
        return new AuthorizedScope(scopeName, str, bool, bool2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthorizedScope)) {
            return false;
        }
        AuthorizedScope authorizedScope = (AuthorizedScope) obj;
        return o.LJ(this.scopeName, authorizedScope.scopeName) && o.LJ(this.scopeDesc, authorizedScope.scopeDesc) && o.LJ(this.scopeRequired, authorizedScope.scopeRequired) && o.LJ(this.LJLIL, authorizedScope.LJLIL);
    }

    public int hashCode() {
        int hashCode = this.scopeName.hashCode() * 31;
        String str = this.scopeDesc;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.scopeRequired;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LJLIL;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AuthorizedScope(scopeName=");
        LIZ.append(this.scopeName);
        LIZ.append(", scopeDesc=");
        LIZ.append(this.scopeDesc);
        LIZ.append(", scopeRequired=");
        LIZ.append(this.scopeRequired);
        LIZ.append(", isEnabled=");
        return C78920UyC.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getScopeDesc() {
        return this.scopeDesc;
    }

    public final String getScopeName() {
        return this.scopeName;
    }

    public final Boolean getScopeRequired() {
        return this.scopeRequired;
    }

    public final Boolean isEnabled() {
        return this.LJLIL;
    }

    public final void setEnabled(Boolean bool) {
        this.LJLIL = bool;
    }

    public AuthorizedScope(String scopeName, String str, Boolean bool, Boolean bool2) {
        o.LJIIIZ(scopeName, "scopeName");
        this.scopeName = scopeName;
        this.scopeDesc = str;
        this.scopeRequired = bool;
        this.LJLIL = bool2;
    }
}
