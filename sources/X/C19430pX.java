package X;

import android.os.Build;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;

/* renamed from: X.0pX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19430pX {
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x004b: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:36:0x0055 (LINE:16777291), block:B:35:0x004b */
    public static C0VR LIZ(byte[] bArr) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        C0VR c0vr = new C0VR();
        if (bArr == null) {
            return c0vr;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int readInt = objectInputStream.readInt(); readInt > 0; readInt--) {
                            ((HashSet) c0vr.LIZ).add(new C0VQ(objectInputStream.readBoolean(), android.net.Uri.parse(objectInputStream.readUTF())));
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e2) {
                        e = e2;
                        C16880lQ.LLLLIIL(e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e3) {
                                C16880lQ.LLLLIIL(e3);
                            }
                        }
                        byteArrayInputStream.close();
                        return c0vr;
                    }
                } catch (Throwable th) {
                    th = th;
                    if (objectInputStream2 != null) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e4) {
                            C16880lQ.LLLLIIL(e4);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                    } catch (IOException e5) {
                        C16880lQ.LLLLIIL(e5);
                    }
                    throw th;
                }
            } catch (IOException e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e7) {
            C16880lQ.LLLLIIL(e7);
        }
        return c0vr;
    }

    public static C0VM LIZIZ(int i) {
        if (i != 0) {
            if (i == 1) {
                return C0VM.LINEAR;
            }
            throw new IllegalArgumentException(C0NY.LIZIZ("Could not convert ", i, " to BackoffPolicy"));
        }
        return C0VM.EXPONENTIAL;
    }

    public static C0VX LIZJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return C0VX.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(C0NY.LIZIZ("Could not convert ", i, " to NetworkType"));
                        }
                        return C0VX.METERED;
                    }
                    return C0VX.NOT_ROAMING;
                }
                return C0VX.UNMETERED;
            }
            return C0VX.CONNECTED;
        }
        return C0VX.NOT_REQUIRED;
    }

    public static EnumC08500Va LIZLLL(int i) {
        if (i != 0) {
            if (i == 1) {
                return EnumC08500Va.DROP_WORK_REQUEST;
            }
            throw new IllegalArgumentException(C0NY.LIZIZ("Could not convert ", i, " to OutOfQuotaPolicy"));
        }
        return EnumC08500Va.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
    }

    public static EnumC08510Vb LJ(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC08510Vb.CANCELLED;
                            }
                            throw new IllegalArgumentException(C0NY.LIZIZ("Could not convert ", i, " to State"));
                        }
                        return EnumC08510Vb.BLOCKED;
                    }
                    return EnumC08510Vb.FAILED;
                }
                return EnumC08510Vb.SUCCEEDED;
            }
            return EnumC08510Vb.RUNNING;
        }
        return EnumC08510Vb.ENQUEUED;
    }

    public static int LJFF(EnumC08510Vb enumC08510Vb) {
        switch (C19420pW.LIZ[enumC08510Vb.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Could not convert ");
                LIZ.append(enumC08510Vb);
                LIZ.append(" to int");
                throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
        }
    }
}
