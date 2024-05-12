package X;

import com.bytedance.forest.Forest;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NsB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60711NsB extends AbstractC58874N8s {
    public final String LJLJJL = "preloadWebContent";

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        C60737Nsb c60737Nsb;
        Forest forest;
        InterfaceC60761Nsz interfaceC60761Nsz;
        o.LJIIJ(type, "type");
        InterfaceC60712NsC webContent = ((InterfaceC58875N8t) xBaseParamModel).getWebContent();
        if (webContent != null) {
            InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
            if (interfaceC38263Ezz != null && (interfaceC60761Nsz = (InterfaceC60761Nsz) interfaceC38263Ezz.LJ(InterfaceC60761Nsz.class)) != null) {
                c60737Nsb = interfaceC60761Nsz.getHybridContext();
            } else {
                c60737Nsb = null;
            }
            InterfaceC61488OBg LIZIZ = C60905NvJ.LIZIZ(c60737Nsb, Boolean.TRUE);
            if (!(LIZIZ instanceof C39902FlK)) {
                LIZIZ = null;
            }
            C39902FlK c39902FlK = (C39902FlK) LIZIZ;
            if (c39902FlK != null && (forest = c39902FlK.LIZ) != null) {
                webContent.getCustomUA();
                webContent.getWebKey();
                ArrayList arrayList = new ArrayList();
                List<String> css = webContent.getCss();
                if (css != null) {
                    Iterator<String> it = css.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C61027NxH(it.next()));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                List<String> js = webContent.getJs();
                if (js != null) {
                    Iterator<String> it2 = js.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new C61027NxH(it2.next()));
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                List<String> img = webContent.getImg();
                if (img != null) {
                    Iterator<String> it3 = img.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C61027NxH(it3.next()));
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                List<String> universal = webContent.getUniversal();
                if (universal != null) {
                    Iterator<String> it4 = universal.iterator();
                    while (it4.hasNext()) {
                        arrayList4.add(new C61027NxH(it4.next()));
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!arrayList.isEmpty()) {
                    linkedHashMap.put("css", arrayList);
                }
                if (!arrayList2.isEmpty()) {
                    linkedHashMap.put("script", arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    linkedHashMap.put("image", arrayList3);
                }
                if (!arrayList4.isEmpty()) {
                    linkedHashMap.put("other", arrayList4);
                }
                Forest.preload$default(forest, new C60714NsE(webContent.getHtml(), EnumC60713NsD.WEB, linkedHashMap), null, null, 6, null);
                C39048FUe.LIZIZ(C39048FUe.LIZIZ, "invoke forest preload web content", null, this.LJLJJL, 2);
                c37356ElM.onSuccess((XBaseResultModel) ED5.LIZJ(InterfaceC58873N8r.class, null), "");
                return;
            }
            C31626Cb8.LIZ(c37356ElM, 0, "Fail to get resource service.", 4);
            return;
        }
        C31626Cb8.LIZ(c37356ElM, -3, "webContent is required", 4);
    }
}
