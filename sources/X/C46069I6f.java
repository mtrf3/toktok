package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VETimelineParams;
import defpackage.s1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.I6f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46069I6f implements InterfaceC46047I5j {
    public final InterfaceC153045zY LIZ;
    public final I61 LIZIZ;
    public final java.util.Map<String, String> LIZJ;
    public final java.util.Map<String, String> LIZLLL;
    public int LJ;
    public VETimelineParams LJFF;
    public C5RU LJI;

    public final MultiEditVideoRecordData LIZLLL() {
        MultiEditVideoRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LIZIZ.LIZLLL;
        if (multiEditVideoStatusRecordData == null || (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) == null) {
            multiEditVideoRecordData = new MultiEditVideoRecordData();
        }
        if (multiEditVideoRecordData.segmentDataList == null) {
            multiEditVideoRecordData.segmentDataList = new ArrayList();
        }
        return multiEditVideoRecordData;
    }

    public final boolean LJ() {
        MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = this.LIZIZ.LIZLLL;
        if (multiEditVideoStatusRecordData != null) {
            return multiEditVideoStatusRecordData.isLibraryMode;
        }
        return false;
    }

    public C46069I6f(InterfaceC153045zY interfaceC153045zY, I61 editAdjustClipsModel) {
        o.LJIIIZ(editAdjustClipsModel, "editAdjustClipsModel");
        this.LIZ = interfaceC153045zY;
        this.LIZIZ = editAdjustClipsModel;
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = -1;
        if (!C78946Uyc.LJIJJLI(editAdjustClipsModel)) {
            XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C36117EFl(this, null), 2);
        }
    }

    @Override // X.InterfaceC46047I5j
    public final void LIZIZ(OSZ osz, boolean z) {
        if (osz == null) {
            this.LIZ.LLIZ(-1, VEEditor.SET_RANGE_MODE.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
        }
        int i = 0;
        if (C78946Uyc.LJIJJLI(this.LIZIZ)) {
            if (!z) {
                if (osz != null) {
                    this.LIZ.LLIIIZ(C46104I7o.LJIIL(LIZLLL()), (int) ((Number) osz.getFirst()).longValue(), (int) ((Number) osz.getSecond()).longValue());
                    return;
                } else {
                    this.LIZ.LLJJIJIL(C46104I7o.LJIIL(LIZLLL()));
                    return;
                }
            }
            List<MultiEditVideoSegmentRecordData> list = LIZLLL().segmentDataList;
            o.LJIIIIZZ(list, "curRecordData.segmentDataList");
            ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boolean.valueOf(it.next().enable));
            }
            boolean[] zArr = new boolean[arrayList.size()];
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                zArr[i] = ((Boolean) it2.next()).booleanValue();
                i++;
            }
            this.LIZ.LLLI(zArr, LIZJ(LIZLLL(), true, this.LIZJ, this.LIZLLL, -1));
            this.LIZ.LLJILJIL(true);
            if (osz == null) {
                return;
            }
            LJFF((int) ((Number) osz.getFirst()).longValue(), (int) ((Number) osz.getSecond()).longValue());
            return;
        }
        this.LIZ.LLI(LIZJ(LIZLLL(), false, this.LIZJ, this.LIZLLL, -1));
        this.LIZ.LLJILJIL(true);
        if (osz == null) {
            return;
        }
        LJFF((int) ((Number) osz.getFirst()).longValue(), (int) ((Number) osz.getSecond()).longValue());
    }

    public final void LJFF(int i, int i2) {
        this.LIZ.LLLFZ(i, i2);
    }

    public final void LJI(int i, int i2) {
        if (!this.LIZIZ.LIZIZ) {
            ((MultiEditVideoSegmentRecordData) ListProtector.get(LIZLLL().segmentDataList, i)).rotate = i2;
        }
        if (C78946Uyc.LJIJJLI(this.LIZIZ)) {
            VETimelineParams vETimelineParams = this.LJFF;
            if (vETimelineParams == null) {
                vETimelineParams = C46104I7o.LJIIL(LIZLLL());
            }
            if (i >= 0) {
                ROTATE_DEGREE[] rotate_degreeArr = vETimelineParams.rotate;
                if (i < rotate_degreeArr.length) {
                    rotate_degreeArr[i] = C44513HdV.LIZJ(i2);
                }
            }
            this.LIZ.LLJJIJIL(vETimelineParams);
            return;
        }
        C5RU c5ru = this.LJI;
        if (c5ru == null) {
            c5ru = LIZJ(LIZLLL(), false, this.LIZJ, this.LIZLLL, i);
        }
        ROTATE_DEGREE[] rotate_degreeArr2 = c5ru.LJIIJ;
        if (rotate_degreeArr2 != null) {
            rotate_degreeArr2[0] = C44513HdV.LIZJ(i2);
        }
        this.LIZ.LLI(c5ru);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C5RU LIZJ(MultiEditVideoRecordData multiEditVideoRecordData, boolean z, java.util.Map map, java.util.Map map2, int i) {
        List<MultiEditVideoSegmentRecordData> list;
        String[] strArr;
        if (i >= 0 && i < multiEditVideoRecordData.segmentDataList.size()) {
            list = C47261Igj.LJJIJ(ListProtector.get(multiEditVideoRecordData.segmentDataList, i));
        } else {
            list = multiEditVideoRecordData.segmentDataList;
            if (!z) {
                ArrayList LIZIZ = s1.LIZIZ(list, "segmentDataList");
                for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                    if (multiEditVideoSegmentRecordData.enable) {
                        LIZIZ.add(multiEditVideoSegmentRecordData);
                    }
                }
                list = LIZIZ;
            }
        }
        int size = list.size();
        String[] strArr2 = new String[size];
        String[] strArr3 = new String[size];
        for (int i2 = 0; i2 < size; i2++) {
            strArr3[i2] = "";
        }
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        float[] fArr = new float[size];
        String[] strArr4 = new String[size];
        String[] strArr5 = new String[size];
        for (int i3 = 0; i3 < size; i3++) {
            strArr5[i3] = "";
        }
        int[] iArr3 = new int[size];
        int[] iArr4 = new int[size];
        float[] fArr2 = new float[size];
        ROTATE_DEGREE[] rotate_degreeArr = new ROTATE_DEGREE[size];
        Iterator<MultiEditVideoSegmentRecordData> it = list.iterator();
        int i4 = 0;
        while (true) {
            String[] strArr6 = null;
            if (it.hasNext()) {
                MultiEditVideoSegmentRecordData next = it.next();
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData2 = next;
                    String str = multiEditVideoSegmentRecordData2.videoPath;
                    strArr2[i4] = str;
                    Object obj = ((LinkedHashMap) map).get(str);
                    if (obj == null) {
                        obj = "";
                    }
                    strArr3[i4] = obj;
                    iArr[i4] = (int) multiEditVideoSegmentRecordData2.getStartTime();
                    iArr2[i4] = (int) multiEditVideoSegmentRecordData2.getEndTime();
                    fArr[i4] = multiEditVideoSegmentRecordData2.getVideoSpeed();
                    String str2 = multiEditVideoSegmentRecordData2.audioPath;
                    strArr4[i4] = str2;
                    Object obj2 = ((LinkedHashMap) map2).get(str2);
                    if (obj2 == null) {
                        obj2 = "";
                    }
                    strArr5[i4] = obj2;
                    iArr3[i4] = (int) (((float) multiEditVideoSegmentRecordData2.getStartTime()) * multiEditVideoSegmentRecordData2.audioSpeed);
                    float endTime = (float) multiEditVideoSegmentRecordData2.getEndTime();
                    float f = multiEditVideoSegmentRecordData2.audioSpeed;
                    iArr4[i4] = (int) (endTime * f);
                    fArr2[i4] = f;
                    rotate_degreeArr[i4] = C44513HdV.LIZJ(multiEditVideoSegmentRecordData2.rotate);
                    i4 = i5;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            } else {
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < size; i6++) {
                    String str3 = strArr4[i6];
                    if (str3 != null && str3.length() != 0) {
                        arrayList.add(str3);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr = null;
                } else {
                    strArr6 = strArr4;
                    strArr = strArr5;
                }
                return new C5RU(strArr2, strArr3, iArr, iArr2, fArr, strArr6, strArr, iArr3, iArr4, fArr2, rotate_degreeArr);
            }
        }
    }

    @Override // X.InterfaceC46047I5j
    public final boolean LIZ(float f, float f2, float f3, int i, int i2) {
        this.LIZ.LLJJIJI(f2, f3, f, i, i2);
        return true;
    }
}
