package X;

import com.bytedance.ies.nle.editor_jni.MapStrNLENodeSPtrConst;
import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.NLENode;
import java.util.Map;

/* renamed from: X.4oJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C120594oJ implements Map.Entry<String, NLENode> {
    public MapStrNLENodeSPtrConst.Iterator LJLIL;
    public final /* synthetic */ MapStrNLENodeSPtrConst LJLILLLLZI;

    @Override // java.util.Map.Entry
    public final String getKey() {
        MapStrNLENodeSPtrConst.Iterator iterator = this.LJLIL;
        return NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_getKey(iterator.LIZ, iterator);
    }

    @Override // java.util.Map.Entry
    public final NLENode getValue() {
        return this.LJLIL.LIZ();
    }

    public C120594oJ(MapStrNLENodeSPtrConst mapStrNLENodeSPtrConst) {
        this.LJLILLLLZI = mapStrNLENodeSPtrConst;
    }

    @Override // java.util.Map.Entry
    public final NLENode setValue(NLENode nLENode) {
        NLENode nLENode2 = nLENode;
        NLENode LIZ = this.LJLIL.LIZ();
        MapStrNLENodeSPtrConst.Iterator iterator = this.LJLIL;
        NLEEditorJniJNI.MapStrNLENodeSPtrConst_Iterator_setValue(iterator.LIZ, iterator, NLENode.getCPtr(nLENode2), nLENode2);
        return LIZ;
    }
}
