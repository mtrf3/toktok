package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WnU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83352WnU implements InterfaceC83392Wo8 {
    public final /* synthetic */ C83374Wnq LIZ;

    public C83352WnU(C83374Wnq c83374Wnq) {
        this.LIZ = c83374Wnq;
    }

    @Override // X.InterfaceC83392Wo8
    public final void LIZ(AbstractC83369Wnl message) {
        o.LJIIIZ(message, "message");
        if (!(message instanceof C83356WnY)) {
            return;
        }
        C83356WnY c83356WnY = (C83356WnY) message;
        if (c83356WnY.LJ) {
            C2ND.LIZ(new AqS164S0100000_14(this.LIZ, 53), 0L);
            return;
        }
        if (c83356WnY.LJFF) {
            InterfaceC137005Zg interfaceC137005Zg = this.LIZ.LJLJJLL;
            if (interfaceC137005Zg != null) {
                interfaceC137005Zg.rm0();
            }
            C83374Wnq c83374Wnq = this.LIZ;
            C83376Wns c83376Wns = c83374Wnq.LJLLLL;
            String string = C78688UuS.LJJIII(c83374Wnq).getString(R.string.e0q);
            o.LJIIIIZZ(string, "context.getString(R.stri…_editsRemovedMessage_btn)");
            c83376Wns.LIZ(new C83351WnT(string, null, null, null, null, false, null, 1790));
            VideoPublishEditModel model = this.LIZ.LLLLIL();
            String str = message.LIZIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String messageId = message.LIZ;
            C83351WnT c83351WnT = c83356WnY.LIZJ;
            String str3 = c83351WnT.LJ;
            if (str3 != null) {
                str2 = str3;
            }
            String creationType = c83351WnT.LIZIZ();
            o.LJIIIZ(model, "model");
            o.LJIIIZ(messageId, "messageId");
            o.LJIIIZ(creationType, "creationType");
            C188727au c188727au = new C188727au();
            C83348WnQ.LIZLLL(model, c188727au);
            c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
            c188727au.LJIIIZ("process_id", str);
            c188727au.LJIIIZ("message_id", messageId);
            c188727au.LJIIIZ("server_message_id", str2);
            c188727au.LJIIIZ("message_type", "creation");
            c188727au.LJI("creation_message_type", creationType);
            FMX.LJIIL("tikbot_undo_click", c188727au.LIZ);
            return;
        }
        InterfaceC83373Wnp<Integer, Boolean> interfaceC83373Wnp = this.LIZ.LJZ;
        if (interfaceC83373Wnp == null) {
            return;
        }
        interfaceC83373Wnp.invoke(Integer.valueOf(c83356WnY.LIZLLL));
    }
}
