package com.bytedance.ies.ugc.aweme.commwecialize.ba.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class BAProductLinkSchemaSettings {
    public static final BAProductLinkSchemaSettings LIZ = new BAProductLinkSchemaSettings();
    public static final ProductLinkSchema LIZIZ = new ProductLinkSchema(null, null);

    /* loaded from: classes7.dex */
    public static final class ProductLinkSchema {

        @InterfaceC65349Pkn("attach_link")
        public final String addLink;

        @InterfaceC65349Pkn("create_link")
        public final String createLink;

        /* JADX WARN: Multi-variable type inference failed */
        public ProductLinkSchema() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductLinkSchema)) {
                return false;
            }
            ProductLinkSchema productLinkSchema = (ProductLinkSchema) obj;
            return o.LJ(this.addLink, productLinkSchema.addLink) && o.LJ(this.createLink, productLinkSchema.createLink);
        }

        public final int hashCode() {
            String str = this.addLink;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.createLink;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ProductLinkSchema(addLink=");
            LIZ.append(this.addLink);
            LIZ.append(", createLink=");
            return q.LIZIZ(LIZ, this.createLink, ')', LIZ);
        }

        public ProductLinkSchema(String str, String str2) {
            this.addLink = str;
            this.createLink = str2;
        }

        public /* synthetic */ ProductLinkSchema(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }
}
