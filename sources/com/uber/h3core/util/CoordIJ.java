package com.uber.h3core.util;

import X.C16880lQ;
import java.util.Objects;

/* loaded from: classes24.dex */
public class CoordIJ {
    public final int i;
    public final int j;

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.i), Integer.valueOf(this.j));
    }

    public String toString() {
        return C16880lQ.LLLZ("CoordIJ{i=%d, j=%d}", new Object[]{Integer.valueOf(this.i), Integer.valueOf(this.j)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoordIJ coordIJ = (CoordIJ) obj;
        if (coordIJ.i == this.i && coordIJ.j == this.j) {
            return true;
        }
        return false;
    }

    public CoordIJ(int i, int i2) {
        this.i = i;
        this.j = i2;
    }
}
