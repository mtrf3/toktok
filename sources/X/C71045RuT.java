package X;

import android.content.Context;
import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.RuT, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71045RuT extends AbstractC71050RuY {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        Context context;
        View view;
        InterfaceC71047RuV interfaceC71047RuV = (InterfaceC71047RuV) xBaseParamModel;
        o.LJIIIZ(type, "type");
        ArrayList arrayList = new ArrayList();
        for (InterfaceC71046RuU interfaceC71046RuU : interfaceC71047RuV.getGalleryList()) {
            Number type2 = interfaceC71046RuU.getType();
            o.LJII(type2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) type2).intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    String videoID = interfaceC71046RuU.getVideoID();
                    String videoMainURL = interfaceC71046RuU.getVideoMainURL();
                    String videoBackupURL = interfaceC71046RuU.getVideoBackupURL();
                    String coverImageURL = interfaceC71046RuU.getCoverImageURL();
                    Double d = (Double) interfaceC71046RuU.getVideoDuration();
                    Integer num = (Integer) interfaceC71046RuU.getVideoWidth();
                    Integer num2 = (Integer) interfaceC71046RuU.getVideoHeight();
                    KJR kjr = new KJR(EnumC48951JJb.VIDEO);
                    kjr.LIZIZ = videoID;
                    kjr.LIZJ = videoMainURL;
                    kjr.LIZLLL = videoBackupURL;
                    kjr.LJ = coverImageURL;
                    kjr.LJFF = d;
                    kjr.LJI = num;
                    kjr.LJII = num2;
                    arrayList.add(kjr);
                }
            } else {
                String imageURL = interfaceC71046RuU.getImageURL();
                C51462KHq c51462KHq = new C51462KHq(EnumC48951JJb.PHOTO);
                c51462KHq.LIZIZ = imageURL;
                arrayList.add(c51462KHq);
            }
        }
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null && (view = interfaceC38263Ezz.getView()) != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        o.LJI(context);
        DialogC70776Rq8 dialogC70776Rq8 = new DialogC70776Rq8(context);
        dialogC70776Rq8.LJFF(arrayList);
        Number index = interfaceC71047RuV.getIndex();
        o.LJII(index, "null cannot be cast to non-null type kotlin.Int");
        dialogC70776Rq8.LJI(((Integer) index).intValue(), null);
        c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC71048RuW.class, null), "");
    }
}
