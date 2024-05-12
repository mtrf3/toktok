package X;

import com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtr;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import java.util.Map;

/* renamed from: X.4oI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120584oI implements Map.Entry<String, NLENode> {
    public MapStrNLENodeSPtr.Iterator LJLIL;
    public final /* synthetic */ MapStrNLENodeSPtr LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        MapStrNLENodeSPtr.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final NLENode getValue() {
        return this.LJLIL.LIZ();
    }

    public C120584oI(MapStrNLENodeSPtr mapStrNLENodeSPtr) {
        this.LJLILLLLZI = mapStrNLENodeSPtr;
    }

    @Override // java.util.Map.Entry
    public final NLENode setValue(NLENode nLENode) {
        NLENode nLENode2 = nLENode;
        NLENode LIZ = this.LJLIL.LIZ();
        MapStrNLENodeSPtr.Iterator iterator = this.LJLIL;
        NLEEditorJniJNI.MapStrNLENodeSPtr_Iterator_setValue(iterator.LIZ, iterator, NLENode.getCPtr(nLENode2), nLENode2);
        return LIZ;
    }
}
