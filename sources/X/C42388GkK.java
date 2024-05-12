package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishNodeTimeout;
import com.ss.android.ugc.aweme.wavepublish.monitor.callback.PublishTimeoutConfigModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.GkK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42388GkK {
    public static final int LIZ() {
        return LIZIZ(H1U.COMPILE);
    }

    public static final int LIZJ() {
        return LIZIZ(H1U.UPLOAD);
    }

    public static int LIZIZ(H1U h1u) {
        int i;
        List<PublishNodeTimeout> nodes;
        PublishNodeTimeout publishNodeTimeout = null;
        PublishTimeoutConfigModel publishTimeoutConfigModel = (PublishTimeoutConfigModel) SettingsManager.LIZLLL().LJIIIIZZ("studio_publish_timeout_config", PublishTimeoutConfigModel.class, null);
        if (publishTimeoutConfigModel != null && (nodes = publishTimeoutConfigModel.getNodes()) != null) {
            Iterator<PublishNodeTimeout> it = nodes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                PublishNodeTimeout next = it.next();
                String nodeName = next.getNodeName();
                Locale locale = Locale.ROOT;
                String lowerCase = nodeName.toLowerCase(locale);
                o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                String lowerCase2 = h1u.name().toLowerCase(locale);
                o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                if (o.LJ(lowerCase, lowerCase2)) {
                    publishNodeTimeout = next;
                    break;
                }
            }
            PublishNodeTimeout publishNodeTimeout2 = publishNodeTimeout;
            if (publishNodeTimeout2 != null) {
                i = publishNodeTimeout2.getTimeoutSetting();
                C1I0.LIZIZ().LJFF("timeoutSetting", new AqS107S0101000_7(h1u, i, 7));
                return i;
            }
        }
        i = -1;
        C1I0.LIZIZ().LJFF("timeoutSetting", new AqS107S0101000_7(h1u, i, 7));
        return i;
    }
}
