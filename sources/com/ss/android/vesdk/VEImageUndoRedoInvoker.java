package com.ss.android.vesdk;

import X.C151325wm;
import X.InterfaceC151865xe;
import com.ss.android.ttve.nativePort.TEImageInterface;
import com.ss.android.ttve.nativePort.TEImageUndoRedoInterface;
import com.ss.android.vesdk.bean.VEUndoRedoBean;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class VEImageUndoRedoInvoker implements InterfaceC151865xe {
    public TEImageUndoRedoInterface mNativeUndoRedoHandler;

    public void enableUndoRedo() {
        this.mNativeUndoRedoHandler.enableUndoRedo();
    }

    public void executeConfirmParams() {
        this.mNativeUndoRedoHandler.executeConfirmParams();
    }

    public VEImageUndoRedoInvoker(C151325wm c151325wm) {
        TEImageInterface tEImageInterface = c151325wm.LJII;
        o.LJI(tEImageInterface);
        this.mNativeUndoRedoHandler = new TEImageUndoRedoInterface(tEImageInterface.getNativeHandler());
    }

    public ArrayList<VEUndoRedoBean> getUndoRedoList(Boolean bool) {
        return this.mNativeUndoRedoHandler.getUndoRedoList(bool.booleanValue(), -1);
    }

    public int getUndoRedoListSize(Boolean bool) {
        return this.mNativeUndoRedoHandler.getUndoRedoListSize(bool.booleanValue());
    }

    public String cacheCurrentFrame(String str, Boolean bool) {
        return this.mNativeUndoRedoHandler.cacheCurrentFrame(str, bool);
    }

    public ArrayList<VEUndoRedoBean> getUndoRedoList(Boolean bool, int i) {
        return this.mNativeUndoRedoHandler.getUndoRedoList(bool.booleanValue(), i);
    }

    public void executeRedoUndo(Boolean bool, int i, Boolean bool2) {
        this.mNativeUndoRedoHandler.executeRedoUndo(bool.booleanValue(), i, bool2.booleanValue());
    }
}
