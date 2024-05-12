package com.ss.android.ugc.aweme.discover.model;

import X.F9E;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class CorrectHighlightPositions extends F9E implements Serializable {
    public final List<CorrectPosition> positions;

    /* JADX WARN: Multi-variable type inference failed */
    public CorrectHighlightPositions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CorrectHighlightPositions copy$default(CorrectHighlightPositions correctHighlightPositions, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = correctHighlightPositions.positions;
        }
        return correctHighlightPositions.copy(list);
    }

    public final CorrectHighlightPositions copy(List<CorrectPosition> positions) {
        o.LJIIIZ(positions, "positions");
        return new CorrectHighlightPositions(positions);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.positions};
    }

    public final boolean hasHighlightPosition() {
        return !this.positions.isEmpty();
    }

    public final List<CorrectPosition> getPositions() {
        return this.positions;
    }

    public CorrectHighlightPositions(List<CorrectPosition> positions) {
        o.LJIIIZ(positions, "positions");
        this.positions = positions;
    }

    public /* synthetic */ CorrectHighlightPositions(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list);
    }
}
