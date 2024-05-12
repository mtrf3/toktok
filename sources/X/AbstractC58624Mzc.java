package X;

import com.bytedance.ies.android.base.runtime.depend.IAppLogDepend;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC58624Mzc extends C58620MzY implements InterfaceC56578MIk {
    public final IAppLogDepend LJFF;

    public InterfaceC58549MyP LJJ() {
        return C58627Mzf.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC58624Mzc(Object... contexts) {
        super(Arrays.copyOf(contexts, contexts.length));
        o.LJIIIZ(contexts, "contexts");
        this.LJFF = C59835Ne3.LIZ();
    }

    @Override // X.InterfaceC56578MIk
    public final void LIZIZ(C56588MIu event) {
        o.LJIIIZ(event, "event");
        java.util.Map<String, Object> LJIL = LJIL(event, null);
        if (LJIL == null) {
            return;
        }
        LJJI(event.LIZIZ(), LJIL);
    }

    @Override // X.InterfaceC56578MIk
    public final void LJIILJJIL(InterfaceC58626Mze<?> event, InterfaceC88472Yns<? super C58620MzY, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(event, "event");
        java.util.Map<String, Object> LJIL = LJIL(event, interfaceC88472Yns);
        if (LJIL == null) {
            return;
        }
        LJJI(event.LIZIZ(), LJIL);
    }

    public final java.util.Map<String, Object> LJIL(InterfaceC58626Mze<?> event, InterfaceC88472Yns<? super C58620MzY, C76800UCe> interfaceC88472Yns) {
        C58620MzY c58620MzY;
        M95 m95;
        C58308MuW c58308MuW;
        o.LJIIIZ(event, "event");
        if (interfaceC88472Yns == null) {
            c58620MzY = null;
        } else {
            c58620MzY = new C58620MzY(new Object[0]);
            interfaceC88472Yns.invoke(c58620MzY);
        }
        if (c58620MzY != null) {
            m95 = new M95(this, c58620MzY);
            c58308MuW = new C58308MuW(this, c58620MzY);
        } else {
            m95 = new M95(this);
            c58308MuW = new C58308MuW(this);
        }
        java.util.Map<String, Object> LJIIZILJ = LJIIZILJ(event.getKeys(), m95, c58308MuW);
        InterfaceC58549MyP LJJ = LJJ();
        InterfaceC58549MyP LIZ = event.LIZ();
        if (LIZ == null) {
            LIZ = C58627Mzf.LIZ;
        }
        o.LJIIIZ(LJJ, "<this>");
        return new C58550MyQ(LJJ, LIZ).LIZ(m95, event.LIZIZ(), C113554cx.LJJLIL(LJIIZILJ));
    }

    public void LJJI(String eventName, java.util.Map<String, ? extends Object> map) {
        String obj;
        o.LJIIIZ(eventName, "eventName");
        IAppLogDepend iAppLogDepend = this.LJFF;
        if (iAppLogDepend == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                obj = null;
            } else {
                obj = value.toString();
            }
            linkedHashMap.put(key, obj);
        }
        iAppLogDepend.onEventV3Map(eventName, linkedHashMap);
    }
}
