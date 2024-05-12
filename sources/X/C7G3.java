package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.experiment.NewStyleBubbleConfig;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* renamed from: X.7G3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7G3 extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<Integer, ? extends UrlModel>> {
    public static final C7G3 LJLIL = new C7G3();

    public C7G3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final java.util.Map<Integer, ? extends UrlModel> invoke() {
        NewStyleBubbleConfig[] newStyleBubbleConfigArr = (NewStyleBubbleConfig[]) SettingsManager.LIZLLL().LJIIIIZZ("social_bubble_anchors", NewStyleBubbleConfig[].class, null);
        try {
            HashMap hashMap = new HashMap();
            if (newStyleBubbleConfigArr != null) {
                for (NewStyleBubbleConfig newStyleBubbleConfig : newStyleBubbleConfigArr) {
                    hashMap.put(Integer.valueOf(newStyleBubbleConfig.type), newStyleBubbleConfig.icon);
                }
                return hashMap;
            }
            return hashMap;
        } catch (Exception e) {
            C71Y.LIZIZ("AnchorsResourceSettings", String.valueOf(e.getMessage()));
            return new LinkedHashMap();
        }
    }
}
