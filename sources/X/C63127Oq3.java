package X;

import android.os.Message;

/* renamed from: X.Oq3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63127Oq3 implements InterfaceC63351Otf {
    public static C63127Oq3 LJLIL;

    public static C63127Oq3 LIZIZ() {
        if (LJLIL == null) {
            synchronized (C63127Oq3.class) {
                LJLIL = new C63127Oq3();
            }
        }
        return LJLIL;
    }

    public C63127Oq3() {
        LIZ();
    }

    public static void LIZ() {
        C63308Osy.LJI().LIZIZ().LJIJJLI();
    }

    @Override // X.InterfaceC63351Otf
    public final void handleMsg(Message message) {
        Object obj = message.obj;
        if (!(obj instanceof C63128Oq4)) {
            return;
        }
        switch (message.what) {
            case 101:
                obj.getClass();
                if (C63131Oq7.LIZ) {
                    return;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("IMFTSEntityDao addFTSEntity, entityList:");
                LIZ.append((Object) null);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ));
                return;
            case 102:
                obj.getClass();
                return;
            case 103:
                obj.getClass();
                if (C63131Oq7.LIZ) {
                    return;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("IMFTSEntityDao deleteFTSEntity, list:");
                LIZ2.append((Object) null);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ2));
                return;
            case 104:
                obj.getClass();
                if (C63131Oq7.LIZ) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("IMFTSEntityDao deleteFTSEntityById, list:");
                LIZ3.append((Object) null);
                LIZ3.append(", columnKey:");
                LIZ3.append((String) null);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ3));
                return;
            case 105:
                obj.getClass();
                if (C63131Oq7.LIZ) {
                    return;
                }
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("IMFTSEntityDao deleteFTSEntityByIdAndType, list:");
                LIZ4.append((Object) null);
                LIZ4.append(", columnKey:");
                LIZ4.append((String) null);
                LIZ4.append(", type:");
                LIZ4.append(0);
                C63322OtC.LJFF(X1D.LIZIZ(LIZ4));
                return;
            default:
                return;
        }
    }
}
