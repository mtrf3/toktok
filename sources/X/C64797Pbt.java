package X;

import com.bytedance.retrofit2.mime.TypedInput;

/* renamed from: X.Pbt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64797Pbt<T> {
    public final C36910EeA LIZ;
    public final T LIZIZ;
    public final TypedInput LIZJ;
    public C64738Paw LIZLLL;

    public final boolean LIZIZ() {
        return this.LIZ.LIZJ();
    }

    public final void LIZJ() {
        this.LIZ.getClass();
    }

    public static <T> C64797Pbt<T> LIZ(TypedInput typedInput, C36910EeA c36910EeA) {
        if (typedInput != null) {
            if (c36910EeA != null) {
                if (!c36910EeA.LIZJ()) {
                    return new C64797Pbt<>(c36910EeA, null, typedInput);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            }
            throw new NullPointerException("rawResponse == null");
        }
        throw new NullPointerException("body == null");
    }

    public static <T> C64797Pbt<T> LIZLLL(T t, C36910EeA c36910EeA) {
        if (c36910EeA != null) {
            if (c36910EeA.LIZJ()) {
                return new C64797Pbt<>(c36910EeA, t, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        throw new NullPointerException("rawResponse == null");
    }

    public C64797Pbt(C36910EeA c36910EeA, T t, TypedInput typedInput) {
        this.LIZ = c36910EeA;
        this.LIZIZ = t;
        this.LIZJ = typedInput;
    }
}
