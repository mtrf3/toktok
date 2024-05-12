package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.model.CreateInfoPerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.BWg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28910BWg extends ClickableSpan {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ CreateInfoPerceptionMessage LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        Context context = this.LJLIL;
        String str = this.LJLILLLLZI.detailUrl;
        if (C29306Beo.LJIJJLI(str)) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, str);
        }
        PunishEventInfo punishEventInfo = this.LJLILLLLZI.punishInfo;
        if (punishEventInfo != null) {
            C0N7.LJIILJJIL(this.LJLJI, punishEventInfo.punishId, punishEventInfo.punishType, punishEventInfo.punishReason, Long.valueOf(punishEventInfo.violationUid));
        }
    }

    public C28910BWg(Context context, CreateInfoPerceptionMessage createInfoPerceptionMessage, DataChannel dataChannel) {
        this.LJLIL = context;
        this.LJLILLLLZI = createInfoPerceptionMessage;
        this.LJLJI = dataChannel;
    }
}
