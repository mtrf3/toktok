package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes17.dex */
public final class TemplateConfig extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLETemplateJNI.delete_TemplateConfig(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long TemplateConfig_clone = NLETemplateJNI.TemplateConfig_clone(this.LIZ, this);
        if (TemplateConfig_clone == 0) {
            return null;
        }
        return new NLENode(TemplateConfig_clone, true);
    }

    public TemplateConfig() {
        this(NLETemplateJNI.new_TemplateConfig());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public TemplateConfig(long j) {
        super(NLETemplateJNI.TemplateConfig_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
