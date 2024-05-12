package com.ss.android.ugc.aweme.commercialize.live.promote.settings;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class PromoteCommonEntrySchemaSetting {
    public static final PromoteCommonEntrySchema LIZ = new PromoteCommonEntrySchema(null, null);

    /* loaded from: classes10.dex */
    public static final class PromoteCommonEntrySchema {

        @InterfaceC65349Pkn("normal")
        public final String normal;

        @InterfaceC65349Pkn("popup")
        public final String popup;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoteCommonEntrySchema)) {
                return false;
            }
            PromoteCommonEntrySchema promoteCommonEntrySchema = (PromoteCommonEntrySchema) obj;
            return o.LJ(this.normal, promoteCommonEntrySchema.normal) && o.LJ(this.popup, promoteCommonEntrySchema.popup);
        }

        public final int hashCode() {
            String str = this.normal;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.popup;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PromoteCommonEntrySchema(normal=");
            LIZ.append(this.normal);
            LIZ.append(", popup=");
            return q.LIZIZ(LIZ, this.popup, ')', LIZ);
        }

        public PromoteCommonEntrySchema(String str, String str2) {
            this.normal = str;
            this.popup = str2;
        }
    }
}
