package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* renamed from: X.Mb6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57104Mb6 {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;

    public C57104Mb6() {
        try {
            String[] split = "05:00".split(":");
            this.LIZ = CastIntegerProtector.parseInt(split[0]);
            this.LIZIZ = CastIntegerProtector.parseInt(split[1]);
        } catch (Exception unused) {
            this.LIZ = 5;
            this.LIZIZ = 0;
        }
        this.LIZJ = 0;
    }
}
