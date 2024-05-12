package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.vesdk.VERecorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Wr6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83576Wr6 implements InterfaceC83586WrG {
    public final InterfaceC83727WtX LIZ;
    public final IAW LIZIZ;
    public final VERecorder LIZLLL;
    public FilterBean LIZJ = null;
    public C83580WrA LJ = null;
    public C83581WrB LJFF = null;
    public float LJI = 0.0f;
    public String LJII = null;
    public String LJIIIIZZ = null;

    public final String LIZJ() {
        String filterFolder;
        String ca = this.LIZ.ca();
        FilterBean filterBean = this.LIZJ;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null || ca == null || !ca.contains(filterFolder)) {
            return null;
        }
        return filterFolder;
    }

    public final void LIZLLL(String... strArr) {
        this.LIZ.m(LIZIZ(Arrays.asList(strArr), Collections.emptyList(), Collections.emptyList()));
    }

    public C83576Wr6(IAW iaw, VERecorder vERecorder) {
        this.LIZIZ = iaw;
        this.LIZ = iaw.LIZ;
        this.LIZLLL = vERecorder;
    }

    public static List LIZ(FilterBean filterBean, float f) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ComposerInfo(C44659Hfr.LIZIZ(filterBean, f), filterBean.getExtra(), String.valueOf(filterBean.getId()), ""));
        return arrayList;
    }

    public static List LIZIZ(List list, List list2, List list3) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            if (i >= list2.size()) {
                str = "";
            } else {
                str = (String) ListProtector.get(list2, i);
            }
            if (i >= list3.size()) {
                str2 = "";
            } else {
                str2 = (String) ListProtector.get(list3, i);
            }
            arrayList.add(new ComposerInfo((String) ListProtector.get(list, i), str, str2, ""));
        }
        return arrayList;
    }

    public final void LJI(String str, String str2, float f) {
        String[] strArr = {str, str2};
        String[] strArr2 = {"leftSlidePosition", "rightSlidePosition"};
        float[] fArr = {f, f};
        VERecorder vERecorder = this.LIZLLL;
        if (vERecorder == null || 2 != strArr2.length || strArr2.length != 2) {
            return;
        }
        vERecorder.LIZIZ.updateMultiComposerNodes(2, strArr, strArr2, fArr);
    }

    public final void LJFF(float f, float f2, int i, int i2) {
        InterfaceC83727WtX interfaceC83727WtX = this.LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.ka(f, f2, i, i2);
        }
    }

    public final void LJ(float f, float f2, float f3, float f4, float f5) {
        InterfaceC83727WtX interfaceC83727WtX = this.LIZ;
        if (interfaceC83727WtX != null) {
            interfaceC83727WtX.ba(f, f2, f3, f4, f5);
        }
    }
}
