package X;

import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.7Nd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C184817Nd implements InterfaceC57784Mm4 {
    public final TopicRawInfo LJLIL;
    public final List<Position> LJLILLLLZI;
    public final C188727au LJLJI;
    public final Boolean LJLJJI;
    public final String LJLJJL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        List<Position> list = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        C188727au c188727au = this.LJLJI;
        int hashCode3 = (hashCode2 + (c188727au == null ? 0 : c188727au.hashCode())) * 31;
        Boolean bool = this.LJLJJI;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.LJLJJL;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TopicInfoItem(topicRawInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", highlight=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", eventMapBuilder=");
        LIZ.append(this.LJLJI);
        LIZ.append(", isKeyWordsEmpty=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", viewModelID=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return equals(interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return equals(interfaceC57784Mm4);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C184817Nd)) {
            return false;
        }
        C184817Nd c184817Nd = (C184817Nd) obj;
        if (!o.LJ(this.LJLIL.type, c184817Nd.LJLIL.type) || !o.LJ(this.LJLIL.id, c184817Nd.LJLIL.id)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C184817Nd(TopicRawInfo topicRawInfo, List<? extends Position> list, C188727au c188727au, Boolean bool, String str) {
        this.LJLIL = topicRawInfo;
        this.LJLILLLLZI = list;
        this.LJLJI = c188727au;
        this.LJLJJI = bool;
        this.LJLJJL = str;
    }

    public /* synthetic */ C184817Nd(TopicRawInfo topicRawInfo, List list, C188727au c188727au, Boolean bool, String str, int i) {
        this(topicRawInfo, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : c188727au, (i & 8) != 0 ? null : bool, (i & 16) == 0 ? str : null);
    }
}
