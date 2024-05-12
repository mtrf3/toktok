package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.powerpermissions.FakeActivity;
import com.bytedance.ies.powerpermissions.FakeFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Nye, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61112Nye extends AbstractC61106NyY {
    public final Activity LIZIZ;
    public final FakeFragment LIZJ = null;
    public final InterfaceC61107NyZ LIZLLL;

    public C61112Nye(Activity activity, InterfaceC61107NyZ interfaceC61107NyZ) {
        this.LIZIZ = activity;
        this.LIZLLL = interfaceC61107NyZ;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.AbstractC61106NyY
    public final void LIZ(C61101NyT c61101NyT, String... strArr) {
        boolean z;
        boolean z2;
        List<AbstractC61106NyY> list;
        o.LJIIIZ(strArr, OHQ.LIZIZ);
        int length = strArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i < length) {
                String str = strArr[i];
                OHI ohi = OHI.LIZ;
                Activity activity = this.LIZIZ;
                ohi.getClass();
                if (!OHI.LJ(activity, str)) {
                    z2 = false;
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        Boolean bool = null;
        if (c61101NyT != null && (list = c61101NyT.LIZJ) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!(it.next() instanceof C61102NyU)) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            bool = Boolean.valueOf(z);
        }
        if (z2 && o.LJ(bool, Boolean.TRUE)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : strArr) {
                arrayList2.add(new C164906da(str2, EnumC61598OFm.GRANTED));
            }
            C17J.LJJJJLI(14);
            InterfaceC61107NyZ interfaceC61107NyZ = this.LIZLLL;
            C164906da[] c164906daArr = (C164906da[]) arrayList2.toArray(new C164906da[0]);
            interfaceC61107NyZ.LIZIZ((C164906da[]) Arrays.copyOf(c164906daArr, c164906daArr.length));
            return;
        }
        if (c61101NyT != null) {
            C61113Nyf c61113Nyf = new C61113Nyf(this, c61101NyT, strArr);
            Activity activity2 = this.LIZIZ;
            if (activity2 instanceof ActivityC45651qj) {
                c61113Nyf.LIZ((ActivityC45651qj) activity2);
            } else {
                Intent intent = new Intent(this.LIZIZ, (Class<?>) FakeActivity.class);
                Activity activity3 = this.LIZIZ;
                o.LJIIIZ(activity3, "activity");
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("permission-request-key-");
                LIZ.append(activity3);
                String LIZIZ = X1D.LIZIZ(LIZ);
                C41729GZh.LIZ.put(LIZIZ, c61113Nyf);
                intent.putExtra("power_permission_request_key", LIZIZ);
                C16880lQ.LIZIZ(this.LIZIZ, intent);
            }
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        InterfaceC61107NyZ interfaceC61107NyZ2 = this.LIZLLL;
        C164906da[] c164906daArr2 = (C164906da[]) ((ArrayList) C17J.LJIJ(this.LIZIZ, C61898ORa.LJIILL(strArr))).toArray(new C164906da[0]);
        interfaceC61107NyZ2.LIZIZ((C164906da[]) Arrays.copyOf(c164906daArr2, c164906daArr2.length));
        C17J.LJJJJLI(17);
    }
}
