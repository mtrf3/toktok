package X;

import defpackage.q;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ler, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54789Ler<SUBSCRIBE_DATA, OUTPUT_DATA> {
    public final List<TBW<SUBSCRIBE_DATA, ?>> LIZ;
    public final SUBSCRIBE_DATA LIZIZ;
    public final OUTPUT_DATA LIZJ;
    public final TBW<SUBSCRIBE_DATA, ?>[] LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C54789Ler)) {
            return false;
        }
        C54789Ler c54789Ler = (C54789Ler) obj;
        return o.LJ(this.LIZ, c54789Ler.LIZ) && o.LJ(this.LIZIZ, c54789Ler.LIZIZ) && o.LJ(this.LIZJ, c54789Ler.LIZJ) && o.LJ(this.LIZLLL, c54789Ler.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        SUBSCRIBE_DATA subscribe_data = this.LIZIZ;
        int hashCode2 = (hashCode + (subscribe_data == null ? 0 : subscribe_data.hashCode())) * 31;
        OUTPUT_DATA output_data = this.LIZJ;
        int hashCode3 = (hashCode2 + (output_data == null ? 0 : output_data.hashCode())) * 31;
        TBW<SUBSCRIBE_DATA, ?>[] tbwArr = this.LIZLLL;
        return hashCode3 + (tbwArr != null ? Arrays.hashCode(tbwArr) : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("StorySubscribeData(changedProperties=");
        LIZ.append(this.LIZ);
        LIZ.append(", updatedData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", outputData=");
        LIZ.append(this.LIZJ);
        LIZ.append(", filterProperties=");
        return q.LIZIZ(LIZ, Arrays.toString(this.LIZLLL), ')', LIZ);
    }

    public static C54789Ler LIZ(C54789Ler c54789Ler, TBW[] tbwArr) {
        List<TBW<SUBSCRIBE_DATA, ?>> changedProperties = c54789Ler.LIZ;
        SUBSCRIBE_DATA subscribe_data = c54789Ler.LIZIZ;
        OUTPUT_DATA output_data = c54789Ler.LIZJ;
        c54789Ler.getClass();
        o.LJIIIZ(changedProperties, "changedProperties");
        return new C54789Ler(changedProperties, subscribe_data, output_data, tbwArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C54789Ler(List<? extends TBW<SUBSCRIBE_DATA, ?>> changedProperties, SUBSCRIBE_DATA subscribe_data, OUTPUT_DATA output_data, TBW<SUBSCRIBE_DATA, ?>[] tbwArr) {
        o.LJIIIZ(changedProperties, "changedProperties");
        this.LIZ = changedProperties;
        this.LIZIZ = subscribe_data;
        this.LIZJ = output_data;
        this.LIZLLL = tbwArr;
    }
}
