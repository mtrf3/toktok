package com.ss.android.ugc.aweme.sticker;

import X.ActivityC45651qj;
import X.C58096Mr6;
import X.C84913XUf;
import X.HWR;
import com.ss.android.ugc.aweme.addyours.model.AddYourRecordParam;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AddYoursStickerRecordServiceImpl implements IAddYoursStickerRecordService {
    public static IAddYoursStickerRecordService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IAddYoursStickerRecordService.class, false);
        if (LIZ != null) {
            return (IAddYoursStickerRecordService) LIZ;
        }
        if (C58096Mr6.l7 == null) {
            synchronized (IAddYoursStickerRecordService.class) {
                if (C58096Mr6.l7 == null) {
                    C58096Mr6.l7 = new AddYoursStickerRecordServiceImpl();
                }
            }
        }
        return C58096Mr6.l7;
    }

    @Override // com.ss.android.ugc.aweme.tools.sticker.IAddYoursStickerRecordService
    public final HWR LIZ(ActivityC45651qj thisActivity, Aweme aweme, AddYourRecordParam addYourRecordParam) {
        AddYoursStickerStruct addYoursStickerStruct;
        o.LJIIIZ(thisActivity, "thisActivity");
        AddYoursStickerStruct addYoursStickerStruct2 = addYourRecordParam.getAddYoursStickerStruct();
        if (addYoursStickerStruct2 != null) {
            addYoursStickerStruct = AddYoursStickerStruct.copy$default(addYoursStickerStruct2, null, null, null, null, null, null, null, null, null, 0L, 1023, null);
        } else {
            addYoursStickerStruct = null;
        }
        HWR hwr = new HWR(thisActivity, aweme, AddYourRecordParam.copy$default(addYourRecordParam, addYoursStickerStruct, false, false, null, null, null, null, false, false, null, null, null, 4094, null));
        hwr.LIZLLL = new C84913XUf(hwr.LIZ, hwr.LJIIJJI, false);
        return hwr;
    }
}
