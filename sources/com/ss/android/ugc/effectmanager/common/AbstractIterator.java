package com.ss.android.ugc.effectmanager.common;

import X.V0N;
import com.ss.android.ugc.effectmanager.common.utils.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes16.dex */
public abstract class AbstractIterator<T> implements Iterator<T> {
    public T next;
    public State state = State.NOT_READY;

    public abstract T computeNext();

    /* renamed from: com.ss.android.ugc.effectmanager.common.AbstractIterator$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State = iArr;
            try {
                iArr[State.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State[State.READY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private boolean tryToComputeNext() {
        this.state = State.FAILED;
        this.next = computeNext();
        if (this.state != State.DONE) {
            this.state = State.READY;
            return true;
        }
        return false;
    }

    public final T endOfData() {
        this.state = State.DONE;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z;
        if (this.state != State.FAILED) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        int i = AnonymousClass1.$SwitchMap$com$ss$android$ugc$effectmanager$common$AbstractIterator$State[this.state.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        return tryToComputeNext();
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            this.state = State.NOT_READY;
            T t = this.next;
            this.next = null;
            return t;
        }
        throw new NoSuchElementException();
    }

    public final T peek() {
        if (hasNext()) {
            return this.next;
        }
        throw new NoSuchElementException();
    }

    /* loaded from: classes16.dex */
    public enum State {
        READY,
        NOT_READY,
        DONE,
        FAILED;

        public static State valueOf(String str) {
            return (State) V0N.LJJJ(State.class, str);
        }
    }
}
