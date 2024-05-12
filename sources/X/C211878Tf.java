package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8Tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211878Tf {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayList LIZ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) it.next();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) it2.next();
                    if (anchorCommonStruct2 != null) {
                        if (C88547Yp5.LIZIZ.LJIIL() && !AV1.LJIILLIIL()) {
                            int type = anchorCommonStruct.getType();
                            EnumC42934Gt8 enumC42934Gt8 = EnumC42934Gt8.ANCHOR_LIBRARY;
                            if (type == enumC42934Gt8.getTYPE() && anchorCommonStruct2.getType() == enumC42934Gt8.getTYPE() && o.LJ(anchorCommonStruct.getExtra(), anchorCommonStruct2.getExtra()) && o.LJ(anchorCommonStruct.getKeyword(), anchorCommonStruct2.getKeyword())) {
                                break;
                            }
                        } else if (o.LJ(anchorCommonStruct.getId(), anchorCommonStruct2.getId()) && o.LJ(anchorCommonStruct.getKeyword(), anchorCommonStruct2.getKeyword()) && anchorCommonStruct.getType() == EnumC42934Gt8.PROP.getTYPE()) {
                            break;
                        }
                    }
                } else {
                    arrayList.add(anchorCommonStruct);
                    break;
                }
            }
        }
        return arrayList;
    }
}
