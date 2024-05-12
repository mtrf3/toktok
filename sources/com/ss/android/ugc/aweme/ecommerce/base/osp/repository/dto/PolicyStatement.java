package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PolicyStatement {

    @InterfaceC65349Pkn("icons")
    public final List<Icon> icons;

    @InterfaceC65349Pkn("module_name")
    public final String moduleName;

    @InterfaceC65349Pkn("policy_statement")
    public final LinkRichText statementText;

    @InterfaceC65349Pkn("title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PolicyStatement copy$default(PolicyStatement policyStatement, LinkRichText linkRichText, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            linkRichText = policyStatement.statementText;
        }
        if ((i & 2) != 0) {
            str = policyStatement.title;
        }
        if ((i & 4) != 0) {
            list = policyStatement.icons;
        }
        if ((i & 8) != 0) {
            str2 = policyStatement.moduleName;
        }
        return policyStatement.copy(linkRichText, str, list, str2);
    }

    public final PolicyStatement copy(LinkRichText linkRichText, String str, List<Icon> list, String str2) {
        return new PolicyStatement(linkRichText, str, list, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolicyStatement)) {
            return false;
        }
        PolicyStatement policyStatement = (PolicyStatement) obj;
        return o.LJ(this.statementText, policyStatement.statementText) && o.LJ(this.title, policyStatement.title) && o.LJ(this.icons, policyStatement.icons) && o.LJ(this.moduleName, policyStatement.moduleName);
    }

    public int hashCode() {
        LinkRichText linkRichText = this.statementText;
        int hashCode = (linkRichText == null ? 0 : linkRichText.hashCode()) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<Icon> list = this.icons;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.moduleName;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PolicyStatement(statementText=");
        LIZ.append(this.statementText);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", icons=");
        LIZ.append(this.icons);
        LIZ.append(", moduleName=");
        return q.LIZIZ(LIZ, this.moduleName, ')', LIZ);
    }

    public final List<Icon> getIcons() {
        return this.icons;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final LinkRichText getStatementText() {
        return this.statementText;
    }

    public final String getTitle() {
        return this.title;
    }

    public PolicyStatement(LinkRichText linkRichText, String str, List<Icon> list, String str2) {
        this.statementText = linkRichText;
        this.title = str;
        this.icons = list;
        this.moduleName = str2;
    }
}
