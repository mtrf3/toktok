package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.experiment.NewStyleBubbleConfig;
import java.util.HashMap;

/* renamed from: X.7G4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7G4 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends UrlModel>> {
    public static final C7G4 LJLIL = new C7G4();

    public C7G4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends UrlModel> invoke() {
        NewStyleBubbleConfig[] newStyleBubbleConfigArr = (NewStyleBubbleConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("social_bubble_anchors", NewStyleBubbleConfig[].class, null);
        try {
            HashMap hashMap = new HashMap();
            if (newStyleBubbleConfigArr != null) {
                for (NewStyleBubbleConfig newStyleBubbleConfig : newStyleBubbleConfigArr) {
                    String str = newStyleBubbleConfig.subtype;
                    if (str != null) {
                        int i = newStyleBubbleConfig.type;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(i);
                        LIZ.append(str);
                        hashMap.put(X1D.LIZIZ(LIZ), newStyleBubbleConfig.icon);
                    }
                }
                return hashMap;
            }
            return hashMap;
        } catch (Exception e) {
            C71Y.LIZIZ("AnchorSubtypeResSetting", String.valueOf(e.getMessage()));
            return C113554cx.LJJJLIIL();
        }
    }
}
