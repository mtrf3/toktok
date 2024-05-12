package com.ss.android.ugc.aweme.inbox.skylight.plat;

import X.AbstractC72932td;
import X.C208708Ha;
import X.C223208pQ;
import X.C40328FsC;
import X.C43I;
import X.C61845OOz;
import X.C76800UCe;
import X.C8HZ;
import X.InterfaceC208718Hb;
import X.InterfaceC57784Mm4;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxSkylightListState implements InterfaceC208718Hb<InboxSkylightListState, InterfaceC57784Mm4> {
    public final C43I<Boolean> isListEmpty;
    public final C43I<InterfaceC57784Mm4> itemDeleteEvent;
    public final C8HZ<InterfaceC57784Mm4> listState;
    public final C43I<C76800UCe> onResumeNotRefreshingEvent;
    public final C43I<Integer> selectedCellPosition;

    public InboxSkylightListState() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InboxSkylightListState copy$default(InboxSkylightListState inboxSkylightListState, C8HZ c8hz, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, int i, Object obj) {
        if ((i & 1) != 0) {
            c8hz = inboxSkylightListState.getListState();
        }
        if ((i & 2) != 0) {
            c43i = inboxSkylightListState.selectedCellPosition;
        }
        if ((i & 4) != 0) {
            c43i2 = inboxSkylightListState.itemDeleteEvent;
        }
        if ((i & 8) != 0) {
            c43i3 = inboxSkylightListState.onResumeNotRefreshingEvent;
        }
        if ((i & 16) != 0) {
            c43i4 = inboxSkylightListState.isListEmpty;
        }
        return inboxSkylightListState.copy(c8hz, c43i, c43i2, c43i3, c43i4);
    }

    public final C8HZ<InterfaceC57784Mm4> component1() {
        return getListState();
    }

    public final InboxSkylightListState copy(C8HZ<InterfaceC57784Mm4> listState, C43I<Integer> selectedCellPosition, C43I<? extends InterfaceC57784Mm4> c43i, C43I<C76800UCe> c43i2, C43I<Boolean> isListEmpty) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        o.LJIIIZ(isListEmpty, "isListEmpty");
        return new InboxSkylightListState(listState, selectedCellPosition, c43i, c43i2, isListEmpty);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InboxSkylightListState)) {
            return false;
        }
        InboxSkylightListState inboxSkylightListState = (InboxSkylightListState) obj;
        return o.LJ(getListState(), inboxSkylightListState.getListState()) && o.LJ(this.selectedCellPosition, inboxSkylightListState.selectedCellPosition) && o.LJ(this.itemDeleteEvent, inboxSkylightListState.itemDeleteEvent) && o.LJ(this.onResumeNotRefreshingEvent, inboxSkylightListState.onResumeNotRefreshingEvent) && o.LJ(this.isListEmpty, inboxSkylightListState.isListEmpty);
    }

    @Override // X.InterfaceC2064888m
    public List<InterfaceC57784Mm4> getListItemState() {
        return C208708Ha.LIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public AbstractC72932td<C223208pQ> getLoadLatestState() {
        return C208708Ha.LIZIZ(this);
    }

    @Override // X.InterfaceC2064888m
    public AbstractC72932td<C223208pQ> getLoadMoreState() {
        return C208708Ha.LIZJ(this);
    }

    @Override // X.InterfaceC2064888m
    public AbstractC72932td<C223208pQ> getRefreshState() {
        return C208708Ha.LIZLLL(this);
    }

    public int hashCode() {
        int hashCode;
        int LIZIZ = C40328FsC.LIZIZ(this.selectedCellPosition, getListState().hashCode() * 31, 31);
        C43I<InterfaceC57784Mm4> c43i = this.itemDeleteEvent;
        int i = 0;
        if (c43i == null) {
            hashCode = 0;
        } else {
            hashCode = c43i.hashCode();
        }
        int i2 = (LIZIZ + hashCode) * 31;
        C43I<C76800UCe> c43i2 = this.onResumeNotRefreshingEvent;
        if (c43i2 != null) {
            i = c43i2.hashCode();
        }
        return this.isListEmpty.hashCode() + ((i2 + i) * 31);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxSkylightListState(listState=");
        LIZ.append(getListState());
        LIZ.append(", selectedCellPosition=");
        LIZ.append(this.selectedCellPosition);
        LIZ.append(", itemDeleteEvent=");
        LIZ.append(this.itemDeleteEvent);
        LIZ.append(", onResumeNotRefreshingEvent=");
        LIZ.append(this.onResumeNotRefreshingEvent);
        LIZ.append(", isListEmpty=");
        return C61845OOz.LIZIZ(LIZ, this.isListEmpty, ')', LIZ);
    }

    public final C43I<InterfaceC57784Mm4> getItemDeleteEvent() {
        return this.itemDeleteEvent;
    }

    @Override // X.InterfaceC2064788l
    public C8HZ<InterfaceC57784Mm4> getListState() {
        return this.listState;
    }

    public final C43I<C76800UCe> getOnResumeNotRefreshingEvent() {
        return this.onResumeNotRefreshingEvent;
    }

    public final C43I<Integer> getSelectedCellPosition() {
        return this.selectedCellPosition;
    }

    public final C43I<Boolean> isListEmpty() {
        return this.isListEmpty;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxSkylightListState(C8HZ<InterfaceC57784Mm4> listState, C43I<Integer> selectedCellPosition, C43I<? extends InterfaceC57784Mm4> c43i, C43I<C76800UCe> c43i2, C43I<Boolean> isListEmpty) {
        o.LJIIIZ(listState, "listState");
        o.LJIIIZ(selectedCellPosition, "selectedCellPosition");
        o.LJIIIZ(isListEmpty, "isListEmpty");
        this.listState = listState;
        this.selectedCellPosition = selectedCellPosition;
        this.itemDeleteEvent = c43i;
        this.onResumeNotRefreshingEvent = c43i2;
        this.isListEmpty = isListEmpty;
    }

    public /* synthetic */ InboxSkylightListState(C8HZ c8hz, C43I c43i, C43I c43i2, C43I c43i3, C43I c43i4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C8HZ(null, null, 15) : c8hz, (i & 2) != 0 ? new C43I(0) : c43i, (i & 4) != 0 ? null : c43i2, (i & 8) == 0 ? c43i3 : null, (i & 16) != 0 ? new C43I(Boolean.FALSE) : c43i4);
    }
}
