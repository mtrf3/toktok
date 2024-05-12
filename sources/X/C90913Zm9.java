package X;

import com.byted.cast.common.api.multiple.IMultipleActiveControl;

/* renamed from: X.Zm9, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90913Zm9 implements IMultipleActiveControl {
    @Override // com.byted.cast.common.api.multiple.IMultipleActiveControl
    public final float getPlayerVolume(String str) {
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void pause(String str) {
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void start(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clientId:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void updateVolume(String str) {
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void seekComplete(String str, int i) {
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void seekStart(String str, int i) {
        throw null;
    }

    @Override // com.byted.cast.common.api.multiple.IMultipleActiveControl
    public final void setPlayerVolume(String str, float f) {
        throw null;
    }

    @Override // com.byted.cast.common.api.IActiveControl
    public final void stop(String str, boolean z) {
        throw null;
    }
}
