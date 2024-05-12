package X;

import X.YIP;
import X.YIX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes16.dex */
public abstract class YIP<MessageType extends YIP<MessageType, BuilderType>, BuilderType extends YIX<MessageType, BuilderType>> implements YIH {
    public int zzb;

    @Override // X.YIH
    public final C87135YHr LJ() {
        try {
            YIN yin = (YIN) this;
            int LIZ = yin.LIZ();
            byte[] bArr = new byte[LIZ];
            C87154YIk c87154YIk = new C87154YIk(bArr, LIZ);
            YIV LIZ2 = C87158YIo.LIZJ.LIZ(yin.getClass());
            C87149YIf c87149YIf = c87154YIk.LJLJJI;
            if (c87149YIf == null) {
                c87149YIf = new C87149YIf(c87154YIk);
            }
            LIZ2.LJI(yin, c87149YIf);
            if (LIZ - c87154YIk.LJLJLLL == 0) {
                return new C87135YHr(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    public int LJFF() {
        throw null;
    }

    public void LJII(int i) {
        throw null;
    }

    public final byte[] LJIIIIZZ() {
        try {
            YIN yin = (YIN) this;
            int LIZ = yin.LIZ();
            byte[] bArr = new byte[LIZ];
            C87154YIk c87154YIk = new C87154YIk(bArr, LIZ);
            YIV LIZ2 = C87158YIo.LIZJ.LIZ(yin.getClass());
            C87149YIf c87149YIf = c87154YIk.LJLJJI;
            if (c87149YIf == null) {
                c87149YIf = new C87149YIf(c87154YIk);
            }
            LIZ2.LJI(yin, c87149YIf);
            if (LIZ - c87154YIk.LJLJLLL == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException("Serializing " + getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJI(Iterable iterable, XM7 xm7) {
        iterable.getClass();
        if (iterable instanceof XM3) {
            List LJI = ((XM3) iterable).LJI();
            XM3 xm3 = (XM3) xm7;
            int size = xm7.size();
            for (Object obj : LJI) {
                if (obj == null) {
                    String str = "Element at index " + (xm3.size() - size) + " is null.";
                    int size2 = xm3.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        } else {
                            xm3.remove(size2);
                        }
                    }
                    throw new NullPointerException(str);
                }
                if (obj instanceof AbstractC87134YHq) {
                    xm3.LJIILIIL((AbstractC87134YHq) obj);
                } else {
                    xm3.add(obj);
                }
            }
            return;
        }
        if (!(iterable instanceof InterfaceC84688XLo)) {
            if ((xm7 instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) xm7).ensureCapacity(((Collection) iterable).size() + xm7.size());
            }
            int size3 = xm7.size();
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    String str2 = "Element at index " + (xm7.size() - size3) + " is null.";
                    int size4 = xm7.size();
                    while (true) {
                        size4--;
                        if (size4 < size3) {
                            break;
                        } else {
                            ListProtector.remove(xm7, size4);
                        }
                    }
                    throw new NullPointerException(str2);
                }
                xm7.add(obj2);
            }
            return;
        }
        xm7.addAll((Collection) iterable);
    }
}
