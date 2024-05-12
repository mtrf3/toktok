package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class T2A {
    public static final /* synthetic */ T2A[] LJLIL;
    public static final T2A RANGE1;
    public static final T2A RANGE2;
    public static final T2A RANGE3;
    public static final T2A RANGE4;
    public static final T2A RANGE5;
    public static final T2A RANGE6;
    public static final T2A RANGE7;

    public T2A() {
        throw null;
    }

    public static T2A valueOf(String str) {
        return (T2A) V0N.LJJJ(T2A.class, str);
    }

    public static T2A[] values() {
        return (T2A[]) LJLIL.clone();
    }

    public abstract int getMax$compliance_business_release();

    public abstract int getMin$compliance_business_release();

    static {
        T2A t2a = new T2A() { // from class: X.T2B
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 12;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 2;
            }
        };
        RANGE1 = t2a;
        T2A t2a2 = new T2A() { // from class: X.T2C
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 17;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 13;
            }
        };
        RANGE2 = t2a2;
        T2A t2a3 = new T2A() { // from class: X.T2D
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 24;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 18;
            }
        };
        RANGE3 = t2a3;
        T2A t2a4 = new T2A() { // from class: X.T2E
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 34;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 25;
            }
        };
        RANGE4 = t2a4;
        T2A t2a5 = new T2A() { // from class: X.T2F
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 44;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 35;
            }
        };
        RANGE5 = t2a5;
        T2A t2a6 = new T2A() { // from class: X.T2G
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 54;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 45;
            }
        };
        RANGE6 = t2a6;
        T2A t2a7 = new T2A() { // from class: X.T2H
            @Override // X.T2A
            public final int getMax$compliance_business_release() {
                return 122;
            }

            @Override // X.T2A
            public final int getMin$compliance_business_release() {
                return 55;
            }
        };
        RANGE7 = t2a7;
        LJLIL = new T2A[]{t2a, t2a2, t2a3, t2a4, t2a5, t2a6, t2a7};
    }

    public T2A(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
