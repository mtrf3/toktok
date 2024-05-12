package com.ss.android.ugc.aweme.shortvideo.sticker;

import X.InterfaceC65349Pkn;
import X.ORY;
import X.X1D;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AudioGraph implements Serializable {

    @InterfaceC65349Pkn("sources")
    public final String[] sources;

    @InterfaceC65349Pkn("use_output")
    public final Boolean useOutput;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioGraph() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AudioGraph copy$default(AudioGraph audioGraph, String[] strArr, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = audioGraph.sources;
        }
        if ((i & 2) != 0) {
            bool = audioGraph.useOutput;
        }
        return audioGraph.copy(strArr, bool);
    }

    public final AudioGraph copy(String[] strArr, Boolean bool) {
        return new AudioGraph(strArr, bool);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AudioGraph(sources=");
        LIZ.append(Arrays.toString(this.sources));
        LIZ.append(", useOutput=");
        LIZ.append(this.useOutput);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean enableMic() {
        String[] strArr = this.sources;
        if (strArr != null && ORY.LJJIJIIJIL("mic", strArr)) {
            return true;
        }
        return false;
    }

    public final boolean enableMusic() {
        String[] strArr = this.sources;
        if (strArr != null && ORY.LJJIJIIJIL("music", strArr)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String[] strArr = this.sources;
        int i2 = 0;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Boolean bool = this.useOutput;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return i3 + i2;
    }

    public final String[] getSources() {
        return this.sources;
    }

    public final Boolean getUseOutput() {
        return this.useOutput;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!o.LJ(AudioGraph.class, cls)) {
            return false;
        }
        if (obj != null) {
            AudioGraph audioGraph = (AudioGraph) obj;
            String[] strArr = this.sources;
            if (strArr != null) {
                String[] strArr2 = audioGraph.sources;
                if (strArr2 == null || !Arrays.equals(strArr, strArr2)) {
                    return false;
                }
            } else if (audioGraph.sources != null) {
                return false;
            }
            if (!(!o.LJ(this.useOutput, audioGraph.useOutput))) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph");
    }

    public AudioGraph(String[] strArr, Boolean bool) {
        this.sources = strArr;
        this.useOutput = bool;
    }

    public /* synthetic */ AudioGraph(String[] strArr, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : strArr, (i & 2) != 0 ? null : bool);
    }
}
