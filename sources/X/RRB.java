package X;

import com.bytedance.im.core.proto.PropertyItem;
import com.bytedance.im.core.proto.PropertyItemList;
import com.squareup.wire.Message;
import java.util.List;

/* loaded from: classes13.dex */
public final class RRB extends Message.Builder<PropertyItemList, RRB> {
    public List<PropertyItem> LIZLLL = C63685Oz3.LJIIIIZZ();

    @Override // com.squareup.wire.Message.Builder
    /* renamed from: LIZIZ, reason: merged with bridge method [inline-methods] */
    public final PropertyItemList build() {
        return new PropertyItemList(this.LIZLLL, buildUnknownFields());
    }
}
