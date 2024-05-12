package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class CorrectPosition extends F9E implements Serializable {
    public final int begin;
    public final int end;

    public static /* synthetic */ CorrectPosition copy$default(CorrectPosition correctPosition, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = correctPosition.begin;
        }
        if ((i3 & 2) != 0) {
            i2 = correctPosition.end;
        }
        return correctPosition.copy(i, i2);
    }

    public final CorrectPosition copy(int i, int i2) {
        return new CorrectPosition(i, i2);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.begin), Integer.valueOf(this.end)};
    }

    public final boolean isValid() {
        if (this.end >= this.begin) {
            return true;
        }
        return false;
    }

    public final int getBegin() {
        return this.begin;
    }

    public final int getEnd() {
        return this.end;
    }

    public CorrectPosition(int i, int i2) {
        this.begin = i;
        this.end = i2;
    }
}
