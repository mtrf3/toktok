package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationFilterItem;
import com.ss.android.ugc.aweme.share.core.ui.campaign.OperationPlatform;
import com.ss.android.ugc.aweme.share.core.ui.campaign.SharingOperationConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OcT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62285OcT {
    public static final List<OperationFilterItem> LIZ;
    public static final SharingOperationConfig LIZIZ;

    static {
        ArrayList LJII = C47261Igj.LJII(new OperationFilterItem("^(.*)((?i)padre)+(.*)$", "padre", "1", new ArrayList(), new ArrayList()));
        LIZ = LJII;
        LIZIZ = new SharingOperationConfig("1", "fathers_day", 0L, 0L, LJII, C47261Igj.LJII(new OperationFilterItem("^[^fnrtv]*(dad)+[^fnrtv]*$", "padre", "1", new ArrayList(), new ArrayList())), -1, C47261Igj.LJII("1", "2", "3"), "https://p16-sg.tiktokcdn.com/obj/tiktok-obj/ug-sharing/campaign/", null, null, new OperationPlatform("fathers_day", "Father's Day"), "campaign_icon.png");
    }

    public static SharingOperationConfig LIZ() {
        try {
            return (SharingOperationConfig) SettingsManager.LIZLLL().LJIIIIZZ("sharing_operation_config", SharingOperationConfig.class, LIZIZ);
        } catch (Exception unused) {
            return null;
        }
    }
}
