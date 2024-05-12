package X;

import com.ss.android.vesdk.VEConfigCenter;
import kotlin.jvm.internal.o;

/* renamed from: X.Hin, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44841Hin implements InterfaceC44844Hiq {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ VEConfigCenter.ValuePkt LIZIZ;

    @Override // X.InterfaceC44844Hiq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC44844Hiq
    public final Object LIZ() {
        Object value = this.LIZIZ.getValue();
        o.LJIIIIZZ(value, "valuePkt.getValue()");
        return value;
    }

    @Override // X.InterfaceC44844Hiq
    public final EnumC44843Hip type() {
        VEConfigCenter.DataType dataType = this.LIZIZ.getDataType();
        if (dataType != null) {
            int i = C63864P4q.LIZ[dataType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EnumC44843Hip.String;
                            }
                        } else {
                            return EnumC44843Hip.Integer;
                        }
                    } else {
                        return EnumC44843Hip.Float;
                    }
                } else {
                    return EnumC44843Hip.Boolean;
                }
            } else {
                return EnumC44843Hip.Long;
            }
        }
        return EnumC44843Hip.String;
    }

    @Override // X.InterfaceC44844Hiq
    public final String key() {
        return this.LIZ;
    }

    public C44841Hin(String str, VEConfigCenter.ValuePkt valuePkt) {
        this.LIZ = str;
        this.LIZIZ = valuePkt;
    }
}
