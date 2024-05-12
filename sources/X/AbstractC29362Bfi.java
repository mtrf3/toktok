package X;

import X.AbstractC29362Bfi;
import java.util.HashMap;

/* renamed from: X.Bfi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29362Bfi<T extends AbstractC29362Bfi<T>> extends AbstractC29365Bfl<AbstractC29362Bfi<T>> {
    public long LIZIZ;
    public HashMap<String, String> LIZJ;
    public EnumC29290BeY LIZLLL = EnumC29290BeY.Default;
    public boolean LJ;
    public boolean LJFF;

    public abstract C29363Bfj LIZJ();

    public abstract T LIZLLL();

    @Override // X.AbstractC29365Bfl
    public /* bridge */ /* synthetic */ AbstractC29365Bfl LIZ() {
        LIZLLL();
        return this;
    }

    public final T LJ(long j) {
        this.LIZIZ = j;
        LIZLLL();
        return this;
    }
}
