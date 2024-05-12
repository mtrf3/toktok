package X;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;

/* renamed from: X.Zip, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90707Zip extends C90232ZbA implements InterfaceC90294ZcA {
    public C90707Zip(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // X.InterfaceC90294ZcA
    public final InterfaceC90109ZYb LJJLJ(String str, String str2, BinderC90871ZlT binderC90871ZlT) {
        InterfaceC90109ZYb c90627ZhX;
        Parcel LJLJI = LJLJI();
        LJLJI.writeString(str);
        LJLJI.writeString(str2);
        C90257ZbZ.LIZJ(LJLJI, binderC90871ZlT);
        Parcel LLJI = LLJI(LJLJI, 2);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90627ZhX = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISession");
            if (queryLocalInterface instanceof InterfaceC90109ZYb) {
                c90627ZhX = (InterfaceC90109ZYb) queryLocalInterface;
            } else {
                c90627ZhX = new C90627ZhX(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90627ZhX;
    }

    @Override // X.InterfaceC90294ZcA
    public final InterfaceC90112ZYe LLF(CastOptions castOptions, InterfaceC68163Qp5 interfaceC68163Qp5, BinderC90870ZlS binderC90870ZlS) {
        InterfaceC90112ZYe c90632Zhc;
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZIZ(LJLJI, castOptions);
        C90257ZbZ.LIZJ(LJLJI, interfaceC68163Qp5);
        C90257ZbZ.LIZJ(LJLJI, binderC90870ZlS);
        Parcel LLJI = LLJI(LJLJI, 3);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90632Zhc = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastSession");
            if (queryLocalInterface instanceof InterfaceC90112ZYe) {
                c90632Zhc = (InterfaceC90112ZYe) queryLocalInterface;
            } else {
                c90632Zhc = new C90632Zhc(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90632Zhc;
    }

    @Override // X.InterfaceC90294ZcA
    public final InterfaceC90108ZYa LLILIL(BinderC68153Qov binderC68153Qov, InterfaceC68163Qp5 interfaceC68163Qp5, InterfaceC68163Qp5 interfaceC68163Qp52) {
        InterfaceC90108ZYa c90623ZhT;
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC68153Qov);
        C90257ZbZ.LIZJ(LJLJI, interfaceC68163Qp5);
        C90257ZbZ.LIZJ(LJLJI, interfaceC68163Qp52);
        Parcel LLJI = LLJI(LJLJI, 5);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90623ZhT = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
            if (queryLocalInterface instanceof InterfaceC90108ZYa) {
                c90623ZhT = (InterfaceC90108ZYa) queryLocalInterface;
            } else {
                c90623ZhT = new C90623ZhT(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90623ZhT;
    }

    @Override // X.InterfaceC90294ZcA
    public final InterfaceC90425ZeH LLLII(BinderC68153Qov binderC68153Qov, BinderC90781Zk1 binderC90781Zk1, int i, int i2) {
        InterfaceC90425ZeH c90783Zk3;
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC68153Qov);
        C90257ZbZ.LIZJ(LJLJI, binderC90781Zk1);
        LJLJI.writeInt(i);
        LJLJI.writeInt(i2);
        LJLJI.writeInt(0);
        LJLJI.writeLong(2097152L);
        LJLJI.writeInt(5);
        LJLJI.writeInt(333);
        LJLJI.writeInt(10000);
        Parcel LLJI = LLJI(LJLJI, 6);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90783Zk3 = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTask");
            if (queryLocalInterface instanceof InterfaceC90425ZeH) {
                c90783Zk3 = (InterfaceC90425ZeH) queryLocalInterface;
            } else {
                c90783Zk3 = new C90783Zk3(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90783Zk3;
    }

    @Override // X.InterfaceC90294ZcA
    public final InterfaceC90110ZYc LLZZZIL(BinderC68153Qov binderC68153Qov, CastOptions castOptions, InterfaceC90412Ze4 interfaceC90412Ze4, java.util.Map map) {
        InterfaceC90110ZYc c90628ZhY;
        Parcel LJLJI = LJLJI();
        C90257ZbZ.LIZJ(LJLJI, binderC68153Qov);
        C90257ZbZ.LIZIZ(LJLJI, castOptions);
        C90257ZbZ.LIZJ(LJLJI, interfaceC90412Ze4);
        LJLJI.writeMap(map);
        Parcel LLJI = LLJI(LJLJI, 1);
        IBinder readStrongBinder = LLJI.readStrongBinder();
        if (readStrongBinder == null) {
            c90628ZhY = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            if (queryLocalInterface instanceof InterfaceC90110ZYc) {
                c90628ZhY = (InterfaceC90110ZYc) queryLocalInterface;
            } else {
                c90628ZhY = new C90628ZhY(readStrongBinder);
            }
        }
        LLJI.recycle();
        return c90628ZhY;
    }
}
