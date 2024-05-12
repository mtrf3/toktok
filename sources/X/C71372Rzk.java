package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.ecommerce.anchor.model.GylBackToTopEventParams;
import com.ss.android.ugc.aweme.ecommerce.model.RelatedProductInfo;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Rzk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71372Rzk extends FrameLayout implements InterfaceC60061Nhh, InterfaceC72822Si2 {
    public static final /* synthetic */ int LJLJJL = 0;
    public SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LJLIL;
    public String LJLILLLLZI;
    public C71373Rzl LJLJI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJI;

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        java.util.Map map;
        String str;
        if (o.LJ(c199097rd.LJLIL, "ec_gyl_global_state")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                map = u.LJJIZ(interfaceC78280Uns);
            } else {
                map = null;
            }
            C71373Rzl c71373Rzl = this.LJLJI;
            if (c71373Rzl != null && (str = c71373Rzl.LIZLLL) != null) {
                String str2 = c71373Rzl.LJ;
                S0X s0x = C71370Rzi.LJFF;
                s0x.getClass();
                RelatedProductInfo relatedProductInfo = s0x.get(S0X.LIZ(str, str2));
                if (relatedProductInfo != null) {
                    relatedProductInfo.sessionImpressionInfo.clear();
                    relatedProductInfo.sessionImpressionInfo.add(map);
                } else {
                    RelatedProductInfo relatedProductInfo2 = new RelatedProductInfo(str, str2, null, null, null, null, 60, null);
                    relatedProductInfo2.sessionImpressionInfo.add(map);
                    s0x.put(S0X.LIZ(str, str2), relatedProductInfo2);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71372Rzk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
    }

    @Override // X.InterfaceC60061Nhh
    public final void onEvent(String eventName, String str) {
        Integer num;
        o.LJIIIZ(eventName, "eventName");
        if (o.LJ(eventName, "ec_gyl_back_to_top")) {
            try {
                GylBackToTopEventParams gylBackToTopEventParams = (GylBackToTopEventParams) C75792yF.LIZ(str, GylBackToTopEventParams.class);
                String str2 = null;
                if (gylBackToTopEventParams != null && gylBackToTopEventParams.scene != null) {
                    String str3 = gylBackToTopEventParams.scene;
                    C71373Rzl c71373Rzl = this.LJLJI;
                    if (c71373Rzl != null) {
                        str2 = c71373Rzl.LJIIIZ;
                    }
                    if (o.LJ(str3, str2) && o.LJ(gylBackToTopEventParams.actionType, "click") && (num = gylBackToTopEventParams.backType) != null) {
                        int intValue = num.intValue();
                        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJI;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(Integer.valueOf(intValue));
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
