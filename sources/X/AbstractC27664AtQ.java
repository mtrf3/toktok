package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BrickStyle;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.CommonData;
import java.util.UUID;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* renamed from: X.AtQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27664AtQ<T, E> implements InterfaceC57784Mm4 {
    public final C5H3 _bizData$delegate;
    public T bizData;
    public final C5H3 bizExtra$delegate;
    public final BrickInfo brickInfo;
    public final CommonData commonData;
    public String identifier;
    public boolean isReportShow;

    public boolean LJIIIZ() {
        return true;
    }

    public abstract Object LJIIJ(String str);

    public abstract Object LJIIJJI(String str);

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    public final T LIZ() {
        T t = this.bizData;
        if (t == null) {
            return (T) this._bizData$delegate.getValue();
        }
        return t;
    }

    public final E LIZIZ() {
        return (E) this.bizExtra$delegate.getValue();
    }

    public final int LJI() {
        return LJ().brickName;
    }

    public final BrickStyle LJII() {
        return LJ().brickStyle;
    }

    public int hashCode() {
        int i;
        T LIZ = LIZ();
        int i2 = 0;
        if (LIZ != null) {
            i = LIZ.hashCode();
        } else {
            i = 0;
        }
        BrickStyle LJII = LJII();
        if (LJII != null) {
            i2 = LJII.hashCode();
        }
        return i & i2;
    }

    public BrickInfo LJ() {
        return this.brickInfo;
    }

    public CommonData LJIIIIZZ() {
        return this.commonData;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return equals(interfaceC57784Mm4);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof AbstractC27664AtQ) {
            AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) interfaceC57784Mm4;
            if (LJI() == abstractC27664AtQ.LJI() && o.LJ(this.identifier, abstractC27664AtQ.identifier)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC27664AtQ) {
            AbstractC27664AtQ abstractC27664AtQ = (AbstractC27664AtQ) obj;
            if (o.LJ(LIZ(), abstractC27664AtQ.LIZ()) && o.LJ(LJII(), abstractC27664AtQ.LJII())) {
                return true;
            }
        }
        return false;
    }

    public AbstractC27664AtQ(BrickInfo brickInfo, CommonData commonData) {
        String uuid = UUID.randomUUID().toString();
        o.LJIIIIZZ(uuid, "randomUUID().toString()");
        o.LJIIIZ(brickInfo, "brickInfo");
        this.brickInfo = brickInfo;
        this.commonData = commonData;
        this.identifier = uuid;
        this._bizData$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, (AbstractC27664AtQ<Object, Object>) 1174));
        this.bizExtra$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, (AbstractC27664AtQ<Object, Object>) 1175));
    }
}
