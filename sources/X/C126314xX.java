package X;

import com.ss.android.ugc.aweme.services.audio.IAudioParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.4xX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126314xX implements IAudioParams {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC153045zY LIZIZ;
    public final C5MG LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126314xX)) {
            return false;
        }
        C126314xX c126314xX = (C126314xX) obj;
        return o.LJ(this.LIZ, c126314xX.LIZ) && o.LJ(this.LIZIZ, c126314xX.LIZIZ) && o.LJ(this.LIZJ, c126314xX.LIZJ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        InterfaceC153045zY interfaceC153045zY = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC153045zY == null ? 0 : interfaceC153045zY.hashCode())) * 31;
        C5MG c5mg = this.LIZJ;
        return hashCode2 + (c5mg != null ? c5mg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioEnhanceParams(model=");
        LIZ.append(this.LIZ);
        LIZ.append(", veEditor=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", veVideoEditor=");
        LIZ.append(this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C126314xX(VideoPublishEditModel model, InterfaceC153045zY interfaceC153045zY, C5MG c5mg) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZIZ = interfaceC153045zY;
        this.LIZJ = c5mg;
    }
}
