package com.bytedance.ies.nle.editor_jni;

import X.EnumC123834tX;
import X.EnumC123874tb;

/* loaded from: classes3.dex */
public class NLEResourceNode extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEResourceNode(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    public final long LIZIZ() {
        return NLEEditorJniJNI.NLEResourceNode_getHeight(this.LIZ, this);
    }

    public final String LIZJ() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceFile(this.LIZ, this);
    }

    public final String LIZLLL() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceId(this.LIZ, this);
    }

    public final String LJ() {
        return NLEEditorJniJNI.NLEResourceNode_getResourceName(this.LIZ, this);
    }

    public final EnumC123874tb LJFF() {
        return EnumC123874tb.swigToEnum(NLEEditorJniJNI.NLEResourceNode_getResourceType(this.LIZ, this));
    }

    public final long LJI() {
        return NLEEditorJniJNI.NLEResourceNode_getWidth(this.LIZ, this);
    }

    public final boolean LJII() {
        return NLEEditorJniJNI.NLEResourceNode_hasResourceFile(this.LIZ, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public NLENode mo70clone() {
        long NLEResourceNode_clone = NLEEditorJniJNI.NLEResourceNode_clone(this.LIZ, this);
        if (NLEResourceNode_clone == 0) {
            return null;
        }
        return new NLENode(NLEResourceNode_clone, true);
    }

    public final long getDuration() {
        return NLEEditorJniJNI.NLEResourceNode_getDuration(this.LIZ, this);
    }

    public NLEResourceNode() {
        this(NLEEditorJniJNI.new_NLEResourceNode());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEResourceNode(long j) {
        super(NLEEditorJniJNI.NLEResourceNode_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEResourceNode nLEResourceNode) {
        if (nLEResourceNode == null) {
            return 0L;
        }
        return nLEResourceNode.LIZ;
    }

    public final void LJIIIIZZ(long j) {
        NLEEditorJniJNI.NLEResourceNode_setHeight(this.LIZ, this, j);
    }

    public final void LJIIIZ(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceFile(this.LIZ, this, str);
    }

    public final void LJIIJ(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceId(this.LIZ, this, str);
    }

    public final void LJIIJJI(String str) {
        NLEEditorJniJNI.NLEResourceNode_setResourceName(this.LIZ, this, str);
    }

    public final void LJIIL(EnumC123834tX enumC123834tX) {
        NLEEditorJniJNI.NLEResourceNode_setResourceTag(this.LIZ, this, enumC123834tX.swigValue());
    }

    public final void LJIILIIL(EnumC123874tb enumC123874tb) {
        NLEEditorJniJNI.NLEResourceNode_setResourceType(this.LIZ, this, enumC123874tb.swigValue());
    }

    public final void LJIILJJIL(long j) {
        NLEEditorJniJNI.NLEResourceNode_setWidth(this.LIZ, this, j);
    }

    public final void setDuration(long j) {
        NLEEditorJniJNI.NLEResourceNode_setDuration(this.LIZ, this, j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
