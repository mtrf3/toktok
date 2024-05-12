package Y;

import X.C37203Eit;
import X.C39214FaE;
import X.C45161Hnx;
import X.C67J;
import X.C67P;
import X.C76732zl;
import X.C76800UCe;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.bytedance.ies.smartmovie.jni.IMetaInfoDelegate;
import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS8S1400000_2 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S1400000_2 aCallableS8S1400000_2) {
        Canvas canvas = new Canvas((Bitmap) aCallableS8S1400000_2.l1);
        ((C67P) aCallableS8S1400000_2.l3).measure(View.MeasureSpec.makeMeasureSpec(((ViewGroup) aCallableS8S1400000_2.l2).getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(((ViewGroup) aCallableS8S1400000_2.l2).getHeight(), 1073741824));
        ((C67P) aCallableS8S1400000_2.l3).layout(0, 0, ((ViewGroup) aCallableS8S1400000_2.l2).getWidth(), ((ViewGroup) aCallableS8S1400000_2.l2).getHeight());
        C39214FaE c39214FaE = C37203Eit.LIZJ;
        C67P c67p = (C67P) aCallableS8S1400000_2.l3;
        c39214FaE.getClass();
        C39214FaE.LIZ(c67p, canvas);
        return new TextStickerCompileResult(((C67P) aCallableS8S1400000_2.l3).LJ(), new C67J(aCallableS8S1400000_2.s0, ((C76732zl) aCallableS8S1400000_2.l4).element, ((C67P) aCallableS8S1400000_2.l3).hashCode()));
    }

    public static final Object call$1(ACallableS8S1400000_2 aCallableS8S1400000_2) {
        boolean z;
        final C76732zl c76732zl = new C76732zl();
        final int size = ((List) aCallableS8S1400000_2.l1).size();
        List<Meta> list = (List) aCallableS8S1400000_2.l1;
        String str = aCallableS8S1400000_2.s0;
        final InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) aCallableS8S1400000_2.l2;
        final VecMeta vecMeta = (VecMeta) aCallableS8S1400000_2.l3;
        final InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCallableS8S1400000_2.l4;
        for (Meta meta : list) {
            IMetaInfoDelegate iMetaInfoDelegate = (IMetaInfoDelegate) C45161Hnx.LJ.getValue();
            if (size > 1) {
                z = true;
            } else {
                z = false;
            }
            iMetaInfoDelegate.compressMeta(meta, str, z, new CommonRequestCallback() { // from class: X.5oN
                @Override // com.bytedance.ies.smartmovie.jni.CommonRequestCallback
                public final void onSuccess(String str2) {
                    C146045oG c146045oG = C146045oG.LIZ;
                    C76732zl c76732zl2 = C76732zl.this;
                    int i = size;
                    InterfaceC88472Yns<VecMeta, C76800UCe> interfaceC88472Yns2 = interfaceC88472Yns;
                    VecMeta vecMeta2 = vecMeta;
                    synchronized (c146045oG) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("AutoCutTemplateUtils single compress: des: ");
                        LIZ.append(str2);
                        LIZ.append(' ');
                        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
                        int i2 = c76732zl2.element + 1;
                        c76732zl2.element = i2;
                        if (i2 == i) {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("AutoCutTemplateUtils all compress onSuccess done, actual size = ");
                            LIZ2.append(i);
                            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ2));
                            interfaceC88472Yns2.invoke(vecMeta2);
                        }
                    }
                }

                @Override // com.bytedance.ies.smartmovie.jni.CommonRequestCallback
                public final void onFailure(int i, String str2, UnorderedMapStrStr extraParams) {
                    o.LJIIIZ(extraParams, "extraParams");
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("AutoCutTemplateUtils compress onFailure: code = ");
                    LIZ.append(i);
                    LIZ.append(", msg = ");
                    LIZ.append(str2);
                    C45049Hm9.LIZ(LogLevel.LEVEL_ERROR, X1D.LIZIZ(LIZ));
                    interfaceC88471Ynr.invoke(Integer.valueOf(i), str2);
                }
            });
        }
        return C76800UCe.LIZ;
    }

    public ACallableS8S1400000_2(Object obj, Object obj2, Object obj3, String str, Object obj4, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.l3 = obj3;
        this.s0 = str;
        this.l4 = obj4;
    }
}
