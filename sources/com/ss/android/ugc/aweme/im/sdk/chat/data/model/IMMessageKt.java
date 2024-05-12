package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.C109544Rq;
import X.C113554cx;
import X.C117824jq;
import X.C1DJ;
import X.C2UW;
import X.C32H;
import X.C46U;
import X.C64537PUn;
import X.C78897Uxp;
import X.C93793mB;
import X.EnumC109604Rw;
import X.F9E;
import X.X1D;
import com.bytedance.im.core.proto.ReferenceInfo;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMMessageKt {
    /* JADX WARN: Type inference failed for: r6v0, types: [X.46R] */
    public static final MessageState toMessageState(C109544Rq c109544Rq, boolean z, C109544Rq c109544Rq2, C109544Rq c109544Rq3, boolean z2, boolean z3) {
        Map map;
        Integer num;
        boolean z4;
        boolean z5;
        EnumC109604Rw enumC109604Rw;
        o.LJIIIZ(c109544Rq, "<this>");
        Map<String, List<C32H>> propertyItemListMap = c109544Rq.getPropertyItemListMap();
        String str = null;
        if (propertyItemListMap != null) {
            map = C113554cx.LJJLIL(propertyItemListMap);
        } else {
            map = null;
        }
        String content = c109544Rq.getContent();
        C64537PUn contentPB = c109544Rq.getContentPB();
        ReferenceInfo referenceInfo = c109544Rq.getReferenceInfo();
        if (referenceInfo != null && (enumC109604Rw = referenceInfo.referenced_message_status) != null) {
            num = Integer.valueOf(enumC109604Rw.getValue());
        } else {
            num = null;
        }
        ReferenceInfo referenceInfo2 = c109544Rq.getReferenceInfo();
        if (referenceInfo2 != null) {
            str = referenceInfo2.hint;
        }
        int msgStatus = c109544Rq.getMsgStatus();
        if (c109544Rq2 == null || (c109544Rq2 instanceof FakeMessage)) {
            z4 = true;
        } else {
            z4 = false;
        }
        int processChatBubbleState = ChatRedesignBubbleDiff.INSTANCE.processChatBubbleState(c109544Rq, c109544Rq2, c109544Rq3);
        String str2 = c109544Rq.getLocalExt().get("text_view_click_status");
        boolean LJJIFFI = C1DJ.LJJIFFI(c109544Rq);
        List<C117824jq> attachments = c109544Rq.getAttachments();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c109544Rq.getLocalExt().get("feed_video_cover_uri"));
        LIZ.append(c109544Rq.getLocalExt().get("feed_ad_fake_nickname"));
        LIZ.append(c109544Rq.getLocalExt().get("feed_video_status_text"));
        LIZ.append(c109544Rq.getLocalExt().get("feed_video_status_flag"));
        String LIZIZ = X1D.LIZIZ(LIZ);
        o.LJIIIIZZ(LIZIZ, "StringBuilder()\n        …)\n            .toString()");
        boolean LJJIIJZLJL = C78897Uxp.LJJIIJZLJL(c109544Rq);
        String str3 = c109544Rq.getLocalExt().get("quoted_preview");
        boolean LJIL = C1DJ.LJIL(c109544Rq);
        boolean LJIIZILJ = C93793mB.LJIIZILJ(c109544Rq);
        String str4 = c109544Rq.getLocalExt().get("formatted-timestamp");
        C2UW c2uw = new C2UW(C46U.LJFF(c109544Rq), C46U.LJI(c109544Rq), c109544Rq.getLocalExt().get("SUGGESTED_REPLIES"), c109544Rq.getLocalExt().get("SUG_REPLY_SHOW_TIME"), Boolean.valueOf(C46U.LJIIIIZZ(c109544Rq)));
        ?? r6 = new F9E(C78897Uxp.LJJIJIL(c109544Rq), o.LJ(c109544Rq.getExt().get("a:is_nude"), "true")) { // from class: X.46R
            public final boolean LJLIL;
            public final boolean LJLILLLLZI;

            @Override // X.F9E
            public final Object[] getObjects() {
                return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
            }

            {
                this.LJLIL = r1;
                this.LJLILLLLZI = r2;
            }
        };
        if (c109544Rq.getLocalExt().get("a:sticker_store_inline") != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        return new MessageState(map, content, contentPB, num, str, msgStatus, z, z2, z3, z4, processChatBubbleState, str2, LJJIFFI, LIZIZ, attachments, LJJIIJZLJL, str4, LJIL, str3, LJIIZILJ, c2uw, r6, z5);
    }
}
