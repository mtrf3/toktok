package X;

import android.graphics.Rect;
import com.ss.android.ugc.asve.wrap.ASSimpleFaceInfo;
import com.ss.android.vesdk.faceinfo.VEFaceAttribute;
import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.WyN, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C84027WyN implements InterfaceC84042Wyc {
    public final /* synthetic */ C84024WyK LIZ;

    public C84027WyN(C84024WyK c84024WyK) {
        this.LIZ = c84024WyK;
    }

    @Override // X.InterfaceC84042Wyc
    public final void LIZ(VEFaceAttributeInfo vEFaceAttributeInfo, VEFaceDetectInfo vEFaceDetectInfo) {
        ASSimpleFaceInfo[] aSSimpleFaceInfoArr;
        if (this.LIZ.LJIIIIZZ.invoke().booleanValue()) {
            return;
        }
        for (InterfaceC83327Wn5 interfaceC83327Wn5 : ORZ.LLJI(this.LIZ.LIZ)) {
            if (vEFaceAttributeInfo != null) {
                ArrayList arrayList = new ArrayList();
                VEFaceAttribute[] info = vEFaceAttributeInfo.getInfo();
                o.LJIIIIZZ(info, "info");
                for (VEFaceAttribute it : info) {
                    o.LJIIIIZZ(it, "it");
                    arrayList.add(new ASSimpleFaceInfo(it.getBoyProb()));
                }
                Object[] array = arrayList.toArray(new ASSimpleFaceInfo[0]);
                if (array != null) {
                    aSSimpleFaceInfoArr = (ASSimpleFaceInfo[]) array;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                aSSimpleFaceInfoArr = null;
            }
            if (vEFaceDetectInfo != null) {
                ArrayList arrayList2 = new ArrayList();
                Z92[] info2 = vEFaceDetectInfo.getInfo();
                if (info2 != null) {
                    for (Z92 it2 : info2) {
                        o.LJIIIIZZ(it2, "it");
                        Rect rect = it2.LIZ;
                        o.LJIIIIZZ(rect, "it.rect");
                        arrayList2.add(rect);
                    }
                }
                if (arrayList2.toArray(new Rect[0]) == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            interfaceC83327Wn5.LIZ(aSSimpleFaceInfoArr);
        }
    }
}
