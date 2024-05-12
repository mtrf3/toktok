package Y;

import X.C025908h;
import X.C172966qa;
import X.C2V;
import X.C38330F2o;
import X.C38977FRl;
import X.C38995FSd;
import X.C45881HzZ;
import X.C78514Ure;
import X.C82887Wfz;
import X.C83573Wr3;
import X.C86589Xyb;
import X.C86595Xyh;
import X.C86597Xyj;
import X.EnumC84256X4y;
import X.InterfaceC78280Uns;
import X.InterfaceC78505UrV;
import X.JBR;
import X.RunnableC82878Wfq;
import X.UFL;
import X.X1D;
import X.XN5;
import X.XNE;
import X.XNG;
import android.graphics.Bitmap;
import android.util.SparseArray;
import com.bytedance.ies.effecteditor.swig.EEStdStringVector;
import com.bytedance.ies.effecteditor.swig.UIAnnotationAssetUIMore;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.ies.effecteditor.swig.UIAnnotationUpdateType;
import com.bytedance.ies.xbridge.base.runtime.depend.IHostNetworkDepend;
import com.ss.android.socialbase.downloader.depend.IDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class ARunnableS18S0400000_15 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        SparseArray sparseArray;
        SparseArray sparseArray2 = (SparseArray) this.l0;
        if (sparseArray2 != null) {
            synchronized (sparseArray2) {
                for (int i = 0; i < ((SparseArray) this.l0).size(); i++) {
                    IDownloadListener iDownloadListener = (IDownloadListener) ((SparseArray) this.l0).get(((SparseArray) this.l0).keyAt(i));
                    if (iDownloadListener != null) {
                        iDownloadListener.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(EnumC84256X4y.MAIN, iDownloadListener);
                    }
                }
            }
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.l1;
        if (downloadInfo != null && downloadInfo.canShowNotification() && (sparseArray = (SparseArray) this.l3) != null) {
            synchronized (sparseArray) {
                for (int i2 = 0; i2 < ((SparseArray) this.l3).size(); i2++) {
                    IDownloadListener iDownloadListener2 = (IDownloadListener) ((SparseArray) this.l3).get(((SparseArray) this.l3).keyAt(i2));
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(EnumC84256X4y.NOTIFICATION, iDownloadListener2);
                    }
                }
            }
        }
    }

    public final void LIZ$1() {
        SparseArray sparseArray;
        SparseArray sparseArray2 = (SparseArray) this.l0;
        if (sparseArray2 != null) {
            synchronized (sparseArray2) {
                for (int i = 0; i < ((SparseArray) this.l0).size(); i++) {
                    IDownloadListener iDownloadListener = (IDownloadListener) ((SparseArray) this.l0).get(((SparseArray) this.l0).keyAt(i));
                    if (iDownloadListener != null) {
                        iDownloadListener.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(EnumC84256X4y.MAIN, iDownloadListener);
                    }
                }
            }
        }
        DownloadInfo downloadInfo = (DownloadInfo) this.l1;
        if (downloadInfo != null && downloadInfo.canShowNotification() && (sparseArray = (SparseArray) this.l3) != null) {
            synchronized (sparseArray) {
                for (int i2 = 0; i2 < ((SparseArray) this.l3).size(); i2++) {
                    IDownloadListener iDownloadListener2 = (IDownloadListener) ((SparseArray) this.l3).get(((SparseArray) this.l3).keyAt(i2));
                    if (iDownloadListener2 != null) {
                        iDownloadListener2.onCanceled((DownloadInfo) this.l1);
                        ((DownloadTask) this.l2).removeCallback(EnumC84256X4y.NOTIFICATION, iDownloadListener2);
                    }
                }
            }
        }
    }

    public final void LIZ$2() {
        if (((IDownloadListener) this.l0) != null) {
            if (((DownloadInfo) this.l1).getStatus() == -3) {
                ((IDownloadListener) this.l0).onSuccessed((DownloadInfo) this.l1);
                ((DownloadTask) this.l2).removeCallback((EnumC84256X4y) this.l3, (IDownloadListener) this.l0);
            } else {
                if (((DownloadInfo) this.l1).getStatus() != -1) {
                    return;
                }
                ((IDownloadListener) this.l0).onFailed((DownloadInfo) this.l1, new BaseException(1000, "try add listener for failed task"));
                ((DownloadTask) this.l2).removeCallback((EnumC84256X4y) this.l3, (IDownloadListener) this.l0);
            }
        }
    }

    public final void LIZ$3() {
        C86597Xyj c86597Xyj = C86597Xyj.LIZ;
        InterfaceC78280Uns interfaceC78280Uns = ((C86589Xyb) this.l1).LIZLLL;
        c86597Xyj.getClass();
        LinkedHashMap LIZIZ = C86597Xyj.LIZIZ(interfaceC78280Uns);
        InterfaceC78280Uns interfaceC78280Uns2 = ((C86589Xyb) this.l1).LIZJ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC78280Uns2 != null) {
            UFL LIZ = interfaceC78280Uns2.LIZ();
            while (LIZ.hasNextKey()) {
                String nextKey = LIZ.nextKey();
                InterfaceC78505UrV interfaceC78505UrV = interfaceC78280Uns2.get(nextKey);
                int i = C78514Ure.LIZ[interfaceC78505UrV.getType().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                linkedHashMap.put(nextKey, interfaceC78505UrV.asString());
                            }
                        } else {
                            linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asDouble()));
                        }
                    } else {
                        linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asBoolean()));
                    }
                } else {
                    linkedHashMap.put(nextKey, String.valueOf(interfaceC78505UrV.asInt()));
                }
            }
        }
        Integer num = ((C86589Xyb) this.l1).LJFF;
        C86595Xyh c86595Xyh = new C86595Xyh(this);
        if (num == null || (num.intValue() != 0 && num.intValue() != 1)) {
            C86597Xyj c86597Xyj2 = C86597Xyj.LIZ;
            String str = ((C86589Xyb) this.l1).LIZ;
            if (str != null) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.l3;
                HashMap hashMap = new HashMap();
                IHostNetworkDepend LJIIIZ = ((C45881HzZ) this.l0).LJIIIZ();
                c86597Xyj2.getClass();
                C86597Xyj.LJII(str, LIZIZ, linkedHashMap2, hashMap, c86595Xyh, LJIIIZ);
                return;
            }
            o.LJIJI("url");
            throw null;
        }
        C86597Xyj c86597Xyj3 = C86597Xyj.LIZ;
        String str2 = ((C86589Xyb) this.l1).LIZ;
        if (str2 != null) {
            LinkedHashMap linkedHashMap3 = (LinkedHashMap) this.l3;
            IHostNetworkDepend LJIIIZ2 = ((C45881HzZ) this.l0).LJIIIZ();
            c86597Xyj3.getClass();
            C86597Xyj.LJII(str2, LIZIZ, linkedHashMap3, linkedHashMap, c86595Xyh, LJIIIZ2);
            return;
        }
        o.LJIJI("url");
        throw null;
    }

    public static final void run$0(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0400000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0400000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0400000_15.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        boolean LIZ;
        try {
            aRunnableS18S0400000_15.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String[], java.io.Serializable] */
    public static final void run$4(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        EEStdStringVector eEStdStringVector;
        XNE xne = (XNE) aRunnableS18S0400000_15.l0;
        Object obj = aRunnableS18S0400000_15.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS18S0400000_15.l2;
        C2V c2v = (C2V) aRunnableS18S0400000_15.l3;
        xne.getClass();
        if (obj instanceof Object[]) {
            if (((Object[]) obj).length > 0) {
                if (obj instanceof Bitmap[]) {
                    C82887Wfz.LIZ();
                    C38995FSd.LIZJ().execute(new ARunnableS18S0400000_15(xne, (Bitmap[]) obj, c2v, uIAnnotationUpdateType, 5));
                } else if (obj instanceof C172966qa[]) {
                    C82887Wfz.LIZ();
                    C38995FSd.LIZJ().execute(new ARunnableS18S0400000_15(xne, (C172966qa[]) obj, c2v, uIAnnotationUpdateType, 6));
                } else if (obj instanceof String[]) {
                    C82887Wfz.LIZ();
                    C38995FSd.LIZJ().execute(new RunnableC82878Wfq(xne, (String[]) obj, uIAnnotationUpdateType, c2v, 0));
                } else {
                    C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
                }
            } else {
                U u = xne.LIZJ;
                if (u != 0) {
                    UIAnnotationAssetUIMore dynamicCast = UIAnnotationAssetUIMore.dynamicCast(u.getUIMore());
                    U u2 = xne.LIZJ;
                    if (dynamicCast != null) {
                        eEStdStringVector = dynamicCast.getLastValue();
                    } else {
                        eEStdStringVector = new EEStdStringVector();
                    }
                    u2.updateValue(eEStdStringVector, uIAnnotationUpdateType, new XN5(c2v));
                } else {
                    C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
                }
            }
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_UpdateValueFault);
        }
        C82887Wfz.LIZIZ();
    }

    public static final void run$5(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        XNE xne = (XNE) aRunnableS18S0400000_15.l0;
        Bitmap[] bitmapArr = (Bitmap[]) aRunnableS18S0400000_15.l1;
        C2V c2v = (C2V) aRunnableS18S0400000_15.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS18S0400000_15.l3;
        xne.getClass();
        ArrayList arrayList = new ArrayList(bitmapArr.length);
        for (Bitmap bitmap : bitmapArr) {
            String LIZIZ = C38330F2o.LIZIZ(bitmap);
            if (LIZIZ == null) {
                LIZIZ = UUID.randomUUID().toString();
            }
            String LJFF = i0.LJFF(LIZIZ, ".png");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(xne.LJFF);
            String str = C38977FRl.LIZ;
            String LJFF2 = JBR.LJFF(LIZ, str, LJFF, LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            if (C38977FRl.LIZLLL(bitmap, Bitmap.CompressFormat.PNG, C025908h.LIZIZ(LIZ2, xne.LJ, str, LJFF, LIZ2))) {
                arrayList.add(LJFF2);
            } else {
                C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C82887Wfz.LIZIZ();
                return;
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        U u = xne.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new XN5(c2v));
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C82887Wfz.LIZIZ();
    }

    public static final void run$6(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        XNE xne = (XNE) aRunnableS18S0400000_15.l0;
        C172966qa[] c172966qaArr = (C172966qa[]) aRunnableS18S0400000_15.l1;
        C2V c2v = (C2V) aRunnableS18S0400000_15.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS18S0400000_15.l3;
        xne.getClass();
        ArrayList arrayList = new ArrayList(c172966qaArr.length);
        for (C172966qa c172966qa : c172966qaArr) {
            c172966qa.getClass();
            String LIZIZ = C38330F2o.LIZIZ(null);
            if (LIZIZ == null) {
                LIZIZ = UUID.randomUUID().toString();
            }
            String LJFF = i0.LJFF(LIZIZ, ".png");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(xne.LJFF);
            String str = C38977FRl.LIZ;
            String LJFF2 = JBR.LJFF(LIZ, str, LJFF, LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            if (C38977FRl.LIZLLL(null, Bitmap.CompressFormat.PNG, C025908h.LIZIZ(LIZ2, xne.LJ, str, LJFF, LIZ2))) {
                arrayList.add(LJFF2);
            } else {
                C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C82887Wfz.LIZIZ();
                return;
            }
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        U u = xne.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new XN5(c2v));
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C82887Wfz.LIZIZ();
    }

    public static final void run$7(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        XNE xne = (XNE) aRunnableS18S0400000_15.l0;
        String[] strArr = (String[]) aRunnableS18S0400000_15.l1;
        C2V c2v = (C2V) aRunnableS18S0400000_15.l2;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS18S0400000_15.l3;
        xne.getClass();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            String substring = str.substring(str.lastIndexOf(".") + 1);
            String LIZJ = C38330F2o.LIZJ(str);
            if (LIZJ == null) {
                LIZJ = UUID.randomUUID().toString();
            }
            String LJ = a1.LJ(LIZJ, ".", substring);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(xne.LJFF);
            String str2 = C38977FRl.LIZ;
            String LJFF = JBR.LJFF(LIZ, str2, LJ, LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(xne.LJ);
            LIZ2.append(str2);
            LIZ2.append(LJ);
            if (C38977FRl.LIZ(str, X1D.LIZIZ(LIZ2))) {
                arrayList.add(LJFF);
            } else {
                C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_AssetsSaveFailed);
                C82887Wfz.LIZIZ();
                return;
            }
        }
        String[] strArr2 = new String[arrayList.size()];
        arrayList.toArray(strArr2);
        U u = xne.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr2), uIAnnotationUpdateType, new XN5(c2v));
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C82887Wfz.LIZIZ();
    }

    public static final void run$8(ARunnableS18S0400000_15 aRunnableS18S0400000_15) {
        XNG xng = (XNG) aRunnableS18S0400000_15.l0;
        String[] strArr = (String[]) aRunnableS18S0400000_15.l1;
        UIAnnotationUpdateType uIAnnotationUpdateType = (UIAnnotationUpdateType) aRunnableS18S0400000_15.l2;
        C2V c2v = (C2V) aRunnableS18S0400000_15.l3;
        U u = xng.LIZJ;
        if (u != 0) {
            u.updateValue(new EEStdStringVector(strArr), uIAnnotationUpdateType, new XN5(c2v));
        } else {
            C83573Wr3.LIZIZ(c2v, UIAnnotationErrorCode.UIAnnotationErrorCode_NullPtr);
        }
        C82887Wfz.LIZIZ();
    }

    public ARunnableS18S0400000_15(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
