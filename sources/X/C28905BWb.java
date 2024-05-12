package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS136S0200000_5;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BWb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28905BWb extends ClickableSpan {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ C28907BWd LJLJI;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        String str;
        o.LJIIIZ(widget, "widget");
        Context context = this.LJLIL;
        DataChannel dataChannel = this.LJLILLLLZI;
        C28907BWd c28907BWd = this.LJLJI;
        RoomCreateInfo roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        if (roomCreateInfo == null || (str = roomCreateInfo.blockDetailUrl) == null) {
            str = "";
        }
        AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(context, 757);
        c28907BWd.getClass();
        o.LJIIIZ(context, "context");
        C28906BWc.LIZ(context, c28907BWd.LIZJ, str, "toast", new AqS136S0200000_5(c28907BWd, aqS171S0100000_5, 39));
        DataChannel dataChannel2 = this.LJLILLLLZI;
        BZI LIZ = C28787BRn.LIZ("livesdk_appeal_click");
        LIZ.LJIILLIIL(dataChannel2);
        LIZ.LJIJJ("toast", "enter_from");
        LIZ.LJIJJ("general", "appeal_type");
        LIZ.LJJIIJZLJL();
    }

    public C28905BWb(Context context, DataChannel dataChannel, C28907BWd c28907BWd) {
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = c28907BWd;
    }
}
