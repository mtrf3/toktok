package X;

import com.bytedance.ies.effectcreator.swig.AssetImageTexture;
import com.bytedance.ies.effectcreator.swig.EEStdUIAnnotationBaseList;
import com.bytedance.ies.effectcreator.swig.Element;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.bytedance.ies.effectcreator.swig.FeatureType;
import com.bytedance.ies.effectcreator.swig.UIAnnotationAssetTexture;
import com.bytedance.ies.effectcreator.swig.UIAnnotationBase;
import com.bytedance.ies.effectcreator.swig.UIAnnotationTransform2D;
import com.bytedance.ies.effectcreator.swig.UIAnnotationUIType;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.aip, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94551aip extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ InterfaceC88472Yns LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94551aip(long j, InterfaceC88472Yns interfaceC88472Yns) {
        super(1);
        this.LJLIL = j;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Boolean bool) {
        Feature LJFF;
        boolean booleanValue = bool.booleanValue();
        C93829aXB c93829aXB = CKEffectEditorContext.LJIILL;
        if (c93829aXB != null && (LJFF = c93829aXB.LJFF(this.LJLIL)) != null) {
            EEStdUIAnnotationBaseList uiAnnotations = LJFF.getUiAnnotations();
            AssetImageTexture assetImageTexture = null;
            if (uiAnnotations != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<UIAnnotationBase> it = uiAnnotations.iterator();
                while (it.hasNext()) {
                    UIAnnotationBase next = it.next();
                    UIAnnotationBase it2 = next;
                    o.LJIIIIZZ(it2, "it");
                    if (it2.getUIType() == UIAnnotationUIType.UIAnnotationUIType_AssetTexture) {
                        arrayList.add(next);
                    }
                }
                Element element = (Element) ORZ.LJLLLL(arrayList);
                if (element != null) {
                    UIAnnotationAssetTexture assetTexture = UIAnnotationAssetTexture.dynamicCast(element);
                    o.LJIIIIZZ(assetTexture, "assetTexture");
                    assetImageTexture = assetTexture.getAssetTexture();
                }
            }
            EEStdUIAnnotationBaseList uiAnnotations2 = LJFF.getUiAnnotations();
            if (uiAnnotations2 != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<UIAnnotationBase> it3 = uiAnnotations2.iterator();
                while (it3.hasNext()) {
                    UIAnnotationBase next2 = it3.next();
                    UIAnnotationBase it4 = next2;
                    o.LJIIIIZZ(it4, "it");
                    if (it4.getUIType() == UIAnnotationUIType.UIAnnotationUIType_Transform2D) {
                        arrayList2.add(next2);
                    }
                }
                Element element2 = (Element) ORZ.LJLLLL(arrayList2);
                if (element2 != null && assetImageTexture != null) {
                    FeatureType type = LJFF.getType();
                    o.LJIIIIZZ(type, "feature.type");
                    UIAnnotationTransform2D dynamicCast = UIAnnotationTransform2D.dynamicCast(element2);
                    o.LJIIIIZZ(dynamicCast, "UIAnnotationTransform2D.dynamicCast(transform2D)");
                    C93847aXT.LIZ(type, assetImageTexture, dynamicCast, true);
                }
            }
        }
        InterfaceC88472Yns interfaceC88472Yns = this.LJLILLLLZI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(booleanValue));
        }
        return C76800UCe.LIZ;
    }
}
