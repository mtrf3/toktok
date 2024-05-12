package X;

import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.HmB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45051HmB implements InterfaceC45141Hnd {
    public final String LIZ;
    public final String LIZIZ;
    public long LIZJ = -1;
    public long LIZLLL = -1;
    public long LJ = -1;

    @Override // X.InterfaceC45141Hnd
    public final void LIZIZ() {
        this.LIZJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC45141Hnd
    public final void LIZLLL() {
        this.LJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC45141Hnd
    public final void LJ() {
        this.LIZLLL = System.currentTimeMillis();
    }

    public C45051HmB(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC45141Hnd
    public final void LJFF(int i, String str, String str2, boolean z) {
        long LIZLLL = C45049Hm9.LIZLLL(this.LJ);
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZ(!z ? 1 : 0, "status");
        c145995oB.LIZ(i, "error_code");
        c145995oB.LJI("error_msg", str);
        c145995oB.LIZIZ(LIZLLL, "duration");
        c145995oB.LJI("zip_url", str2);
        c145995oB.LJI("shoot_way", str3);
        c145995oB.LJI("creation_id", str4);
        java.util.Map<String, String> map = c145995oB.LIZ;
        FMX.LJIIL("tool_performance_autocut_tos", map);
        C45049Hm9.LJJIFFI("tool_performance_autocut_tos", map, z);
    }

    @Override // X.InterfaceC45141Hnd
    public final void LIZJ(VecMeta vecMeta, boolean z, int i, int i2, String str, String str2, Long l, String str3, String str4, boolean z2) {
        CutsameDataItem cutsameDataItem;
        String str5;
        Integer num;
        ArrayList<String> arrayList;
        List<CutsameDataItem> list;
        long LIZLLL = C45049Hm9.LIZLLL(this.LIZJ);
        OSJ<TemplateList, String, String> LJJIJIL = C45087Hml.LJJIJIL(str3);
        TemplateList first = LJJIJIL.getFirst();
        String third = LJJIJIL.getThird();
        java.util.Set set = null;
        if (first != null && (list = first.templateList) != null) {
            cutsameDataItem = (CutsameDataItem) ORZ.LJLLLL(list);
        } else {
            cutsameDataItem = null;
        }
        if (z2) {
            if (cutsameDataItem != null && (arrayList = cutsameDataItem.ursList) != null) {
                set = ORZ.LLJJ(arrayList);
            } else if (cutsameDataItem == null) {
                str5 = null;
                num = null;
                C45087Hml.LJJIIZI(set, str5, num);
            }
            str5 = cutsameDataItem.templateData;
            num = Integer.valueOf(cutsameDataItem.templateType);
            C45087Hml.LJJIIZI(set, str5, num);
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C45050HmA(third, str3, this, z, cutsameDataItem, vecMeta, i, i2, str, LIZLLL, str2, l, str4, null), 3);
    }

    @Override // X.InterfaceC45141Hnd
    public final void LIZ(boolean z, int i, int i2, String str, String str2, String str3, String str4, String str5, VecMeta vecMeta, Boolean bool, String str6, String str7) {
        long LIZLLL = C45049Hm9.LIZLLL(this.LIZLLL);
        if (str4 != null) {
            C45049Hm9.LJIILL(z, i, i2, str, LIZLLL, str2, str3, this.LIZ, this.LIZIZ, str4, vecMeta, bool, str6, str7);
        } else {
            XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZ), null, null, new C45052HmC(str5, this, z, i, i2, str, LIZLLL, str2, str3, str6, str7, null), 3);
        }
    }
}
