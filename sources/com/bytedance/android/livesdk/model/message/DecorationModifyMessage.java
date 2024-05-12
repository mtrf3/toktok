package com.bytedance.android.livesdk.model.message;

import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.model.DonationSticker;
import java.util.List;

/* loaded from: classes6.dex */
public class DecorationModifyMessage extends CR6 {

    @InterfaceC65349Pkn("donation_sticker")
    public List<DonationSticker> decorationList;

    public DecorationModifyMessage() {
        this.type = EnumC31509CYf.MODIFY_DECORATION;
    }
}
