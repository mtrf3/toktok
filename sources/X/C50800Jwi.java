package X;

import X.C0M9;
import android.view.View;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Jwi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50800Jwi extends AbstractC60800Ntc {
    public final /* synthetic */ C50799Jwh LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void onDestroy() {
        C15280iq.LIZIZ("SparkViewContainer", "onDestroy");
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZJ;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.onDestroy();
        }
        C50799Jwh c50799Jwh = this.LJLIL;
        c50799Jwh.LJ.clear();
        c50799Jwh.LJFF.clear();
    }

    public C50800Jwi(C50799Jwh c50799Jwh) {
        this.LJLIL = c50799Jwh;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        C50340JpI c50340JpI;
        String str;
        String str2;
        o.LJIIIZ(view, "view");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFinish");
        LIZ.append(view);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        C50799Jwh c50799Jwh = this.LJLIL;
        if (C50346JpO.LIZIZ()) {
            c50340JpI = new C50339JpH(view);
        } else {
            c50340JpI = new C50340JpI(view);
        }
        c50799Jwh.LIZIZ = c50340JpI;
        C50799Jwh c50799Jwh2 = this.LJLIL;
        c50799Jwh2.getClass();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("handleAllPendingIfHave: events:");
        LIZ2.append(c50799Jwh2.LJ);
        LIZ2.append(" and updates:");
        LIZ2.append(c50799Jwh2.LJFF);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ2));
        Iterator it = ((C0M9.b) c50799Jwh2.LJ.entrySet()).iterator();
        while (true) {
            C0M8 c0m8 = (C0M8) it;
            if (!c0m8.hasNext()) {
                break;
            }
            c0m8.next();
            Object key = c0m8.getKey();
            o.LJIIIIZZ(key, "it.key");
            Object value = c0m8.getValue();
            o.LJIIIIZZ(value, "it.value");
            c50799Jwh2.LIZ((String) key, (JSONObject) value);
        }
        Iterator<Object> it2 = c50799Jwh2.LJFF.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof TemplateData) {
                c50799Jwh2.LJFF((TemplateData) next);
            }
            if (next instanceof String) {
                c50799Jwh2.LIZJ((String) next);
            }
        }
        c50799Jwh2.LJ.clear();
        c50799Jwh2.LJFF.clear();
        Iterator<AbstractC50814Jww> it3 = c50799Jwh2.LJI.iterator();
        while (it3.hasNext()) {
            AbstractC50814Jww next2 = it3.next();
            C50340JpI c50340JpI2 = c50799Jwh2.LIZIZ;
            o.LJI(c50340JpI2);
            next2.getClass();
            C50340JpI c50340JpI3 = next2.LJLILLLLZI;
            if (c50340JpI3 != null) {
                Object obj = c50340JpI3.LIZ;
                o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
                ((View) obj).removeOnAttachStateChangeListener(next2.LJLJI);
            }
            Object obj2 = c50340JpI2.LIZ;
            o.LJII(obj2, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            ((View) obj2).addOnAttachStateChangeListener(next2.LJLJI);
            next2.LIZJ(c50340JpI2);
            next2.LJLILLLLZI = c50340JpI2;
        }
        C50340JpI c50340JpI4 = c50799Jwh2.LIZIZ;
        C37942Euo c37942Euo = null;
        if (c50340JpI4 != null) {
            InterfaceC60761Nsz interfaceC60761Nsz = c50340JpI4.LIZ;
            o.LJII(interfaceC60761Nsz, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
            C60737Nsb hybridContext = ((C60726NsQ) interfaceC60761Nsz).getHybridContext();
            if (hybridContext != null) {
                c37942Euo = (C37942Euo) hybridContext.LIZIZ(C37942Euo.class);
            }
        }
        String str3 = "";
        if (c37942Euo != null) {
            Iterator<AbstractC50008Jjw> it4 = c50799Jwh2.LJII.iterator();
            while (it4.hasNext()) {
                AbstractC50008Jjw next3 = it4.next();
                next3.getClass();
                C38236EzY c38236EzY = new C38236EzY();
                c38236EzY.LIZ(next3.LIZ());
                c38236EzY.LIZJ = "";
                c38236EzY.LIZIZ(EnumC38085Ex7.PUBLIC);
                c38236EzY.LIZLLL = new C50009Jjx(next3);
                c37942Euo.LJIILJJIL(c38236EzY);
            }
        }
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZJ;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJ(view);
        }
        C50799Jwh c50799Jwh3 = this.LJLIL;
        C50831JxD c50831JxD = c50799Jwh3.LJIILIIL;
        DynamicPatch dynamicPatch = c50799Jwh3.LJIIIZ;
        boolean z = c50799Jwh3.LJIIL;
        c50831JxD.getClass();
        long currentTimeMillis = System.currentTimeMillis() - c50831JxD.LIZ;
        if (dynamicPatch != null && (str2 = dynamicPatch.schema) != null) {
            str3 = str2;
        }
        int LIZ3 = C50106JlW.LIZ(dynamicPatch);
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "load_success");
        c50102JlS.LJIIZILJ("schema", str3);
        c50102JlS.LJIIZILJ("load_time", String.valueOf(currentTimeMillis));
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c50102JlS.LJIIZILJ("preload", str);
        int i = 1;
        if (LIZ3 != 1) {
            i = 0;
        }
        c50102JlS.LJIIZILJ("is_built_in", String.valueOf(i));
        c50102JlS.LJIL(2);
        c50102JlS.LJIILIIL();
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadStart:");
        LIZ.append(url);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZJ;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJJL(view, url);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        String str2;
        int i;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLoadFailed reason:");
        LIZ.append(str);
        LIZ.append(" schema:");
        LIZ.append(url);
        C15280iq.LIZIZ("SparkViewContainer", X1D.LIZIZ(LIZ));
        AbstractC60800Ntc abstractC60800Ntc = this.LJLIL.LIZJ;
        if (abstractC60800Ntc != null) {
            abstractC60800Ntc.LJJJJ(view, url);
        }
        C50799Jwh c50799Jwh = this.LJLIL;
        C50831JxD c50831JxD = c50799Jwh.LJIILIIL;
        DynamicPatch dynamicPatch = c50799Jwh.LJIIIZ;
        c50831JxD.getClass();
        if (dynamicPatch == null || (str2 = dynamicPatch.schema) == null) {
            str2 = "";
        }
        int LIZ2 = C50106JlW.LIZ(dynamicPatch);
        C50102JlS c50102JlS = new C50102JlS();
        c50102JlS.LJIIZILJ("type", "load_failed");
        c50102JlS.LJIIZILJ("schema", str2);
        c50102JlS.LJIIZILJ("error", str);
        if (LIZ2 == 1) {
            i = 1;
        } else {
            i = 0;
        }
        c50102JlS.LJIIZILJ("is_built_in", String.valueOf(i));
        c50102JlS.LJIL(1);
        c50102JlS.LJIILIIL();
        C50101JlR.LIZIZ(str2);
        C50799Jwh c50799Jwh2 = this.LJLIL;
        c50799Jwh2.LJ.clear();
        c50799Jwh2.LJFF.clear();
    }
}
