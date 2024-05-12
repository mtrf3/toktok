package X;

import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.AddYoursModelCheckService;

/* renamed from: X.8kz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220458kz extends AbstractC65781Prl implements InterfaceC88472Yns<PublishModel, Boolean> {
    public static final C220458kz LJLIL = new C220458kz();

    public C220458kz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(PublishModel publishModel) {
        PublishModel publishModel2 = publishModel;
        if (publishModel2 == null) {
            return Boolean.FALSE;
        }
        return Boolean.valueOf(AddYoursModelCheckService.LIZJ().LIZ(publishModel2));
    }
}
