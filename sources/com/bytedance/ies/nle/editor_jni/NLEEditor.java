package com.bytedance.ies.nle.editor_jni;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class NLEEditor {
    public transient long LIZ;
    public transient boolean LIZIZ;
    public final List<NLEEditorListener> LIZJ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEEditorJniJNI.delete_NLEEditor(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public final boolean LIZ() {
        return NLEEditorJniJNI.NLEEditor_canUndo(this.LIZ, this);
    }

    public boolean LIZIZ() {
        return NLEEditorJniJNI.NLEEditor_commit(this.LIZ, this);
    }

    public final boolean LIZJ() {
        return NLEEditorJniJNI.NLEEditor_done__SWIG_1(this.LIZ, this);
    }

    public final NLEBranch LIZLLL() {
        long NLEEditor_getBranch = NLEEditorJniJNI.NLEEditor_getBranch(this.LIZ, this);
        if (NLEEditor_getBranch == 0) {
            return null;
        }
        return new NLEBranch(NLEEditor_getBranch);
    }

    public final NLEModel LJ() {
        long NLEEditor_getModel = NLEEditorJniJNI.NLEEditor_getModel(this.LIZ, this);
        if (NLEEditor_getModel == 0) {
            return null;
        }
        return new NLEModel(NLEEditor_getModel, true);
    }

    public final boolean LJFF() {
        return NLEEditorJniJNI.NLEEditor_resetHead(this.LIZ, this);
    }

    public final String LJIIIIZZ() {
        return NLEEditorJniJNI.NLEEditor_store(this.LIZ, this);
    }

    public NLEEditor() {
        long new_NLEEditor = NLEEditorJniJNI.new_NLEEditor();
        this.LIZJ = new ArrayList();
        this.LIZIZ = true;
        this.LIZ = new_NLEEditor;
    }

    public final NLEError LJI(String str) {
        return NLEError.swigToEnum(NLEEditorJniJNI.NLEEditor_restore(this.LIZ, this, str));
    }

    public final void LJII(NLEModel nLEModel) {
        NLEEditorJniJNI.NLEEditor_setModel(this.LIZ, this, NLEModel.getCPtr(nLEModel), nLEModel);
    }

    public void addConsumer(NLEEditorListener nLEEditorListener) {
        ((ArrayList) this.LIZJ).add(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_addConsumer(this.LIZ, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public void removeConsumer(NLEEditorListener nLEEditorListener) {
        ((ArrayList) this.LIZJ).remove(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_removeConsumer(this.LIZ, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public void setListener(NLEEditorListener nLEEditorListener) {
        ((ArrayList) this.LIZJ).add(nLEEditorListener);
        NLEEditorJniJNI.NLEEditor_setListener(this.LIZ, this, NLEEditorListener.getCPtr(nLEEditorListener), nLEEditorListener);
    }

    public final void LJIIIZ(long j, long j2) {
        NLEEditorJniJNI.NLEEditor_trim(this.LIZ, this, j, j2);
    }
}
