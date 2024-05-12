package X;

import android.text.TextUtils;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QBR extends AbstractC38123Exj<JSONObject, JSONObject> {
    public final int LJLIL;
    public String LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJL;
    public InterfaceC92693kP LJLL;
    public C65250PjC LJLLI;
    public String LJLILLLLZI = "";
    public String LJLJJLL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        InterfaceC92693kP interfaceC92693kP = this.LJLL;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
    }

    public QBR(SparkContext sparkContext) {
        int i;
        android.net.Uri uri = UriProtector.parse(sparkContext.url);
        FCH.LIZIZ.getClass();
        o.LJIIJ(uri, "uri");
        if (C86793Y4n.LJJIZ(uri) == EnumC60689Nrp.LYNX) {
            i = 1;
        } else {
            i = 0;
        }
        this.LJLIL = i;
    }

    public static List<C05130Ib> LJJI(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                arrayList.add(new C05130Ib(next, jSONObject.optString(next, "")));
            }
        }
        return arrayList;
    }

    public QBR(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(JSONObject jSONObject, C38131Exr c38131Exr) {
        final boolean z;
        JSONObject optJSONObject;
        C65250PjC c65250PjC;
        JSONObject jSONObject2 = jSONObject;
        final String optString = jSONObject2.optString("url", "");
        this.LJLILLLLZI = jSONObject2.optString("method", "get").toLowerCase(Locale.US);
        final JSONObject optJSONObject2 = jSONObject2.optJSONObject("headers");
        final JSONObject optJSONObject3 = jSONObject2.optJSONObject("params");
        final JSONObject optJSONObject4 = jSONObject2.optJSONObject("data");
        if (jSONObject2.optString("preferredContentType", "Json").equalsIgnoreCase("Protobuf") && (optJSONObject = jSONObject2.optJSONObject("extraPBConfig")) != null) {
            String optString2 = optJSONObject.optString("channel");
            o.LJIIIIZZ(optString2, "source.optString(\"channel\")");
            if (!TextUtils.isEmpty(optString2)) {
                String optString3 = optJSONObject.optString("dataMessageName");
                o.LJIIIIZZ(optString3, "source.optString(\"dataMessageName\")");
                if (!TextUtils.isEmpty(optString3)) {
                    String optString4 = optJSONObject.optString("dataShrinkConfig");
                    o.LJIIIIZZ(optString4, "source.optString(\"dataShrinkConfig\")");
                    String optString5 = optJSONObject.optString("extraMessageName");
                    o.LJIIIIZZ(optString5, "source.optString(\"extraMessageName\")");
                    String optString6 = optJSONObject.optString("extraShrinkConfig");
                    o.LJIIIIZZ(optString6, "source.optString(\"extraShrinkConfig\")");
                    c65250PjC = new C65250PjC(optString2, optString3, optString4, optString5, optString6);
                    this.LJLLI = c65250PjC;
                }
            }
            c65250PjC = null;
            this.LJLLI = c65250PjC;
        }
        C65250PjC c65250PjC2 = this.LJLLI;
        if (c65250PjC2 != null) {
            String channel = c65250PjC2.LIZ;
            o.LJIIIZ(channel, "channel");
            if (C04550Fv.LIZ.containsKey(channel)) {
                z = true;
                if (optJSONObject2 == null) {
                    optJSONObject2 = new JSONObject();
                }
                optJSONObject2.put("response-format", "protobuf");
                AbstractC73638SvC.LJIJ(this.LJLILLLLZI).LJJIIJ(T16.LIZ()).LJIJI(new InterfaceC48038ItG() { // from class: X.PjB
                    /* JADX WARN: Removed duplicated region for block: B:35:0x010d  */
                    @Override // X.InterfaceC48038ItG
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object apply(java.lang.Object r16) {
                        /*
                            Method dump skipped, instructions count: 571
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C65249PjB.apply(java.lang.Object):java.lang.Object");
                    }
                }).LJIJJ(C73969T1h.LIZIZ()).LIZ(new QBS(this, c38131Exr));
            }
        }
        z = false;
        AbstractC73638SvC.LJIJ(this.LJLILLLLZI).LJJIIJ(T16.LIZ()).LJIJI(new InterfaceC48038ItG() { // from class: X.PjB
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 571
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C65249PjB.apply(java.lang.Object):java.lang.Object");
            }
        }).LJIJJ(C73969T1h.LIZIZ()).LIZ(new QBS(this, c38131Exr));
    }
}
