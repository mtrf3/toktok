package X;

import com.bytedance.ies.im.core.api.model.RichTextInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.39a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C792239a {
    public final String LIZ;
    public final Long LIZIZ;
    public final List<RichTextInfo> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C792239a)) {
            return false;
        }
        C792239a c792239a = (C792239a) obj;
        return o.LJ(this.LIZ, c792239a.LIZ) && o.LJ(this.LIZIZ, c792239a.LIZIZ) && o.LJ(this.LIZJ, c792239a.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        List<RichTextInfo> list = this.LIZJ;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MessageDraft(draftContent=");
        LIZ.append(this.LIZ);
        LIZ.append(", quotedMessageId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", richTextInfoList=");
        return C1NE.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C792239a(String str, Long l, List<RichTextInfo> list) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = list;
    }
}
