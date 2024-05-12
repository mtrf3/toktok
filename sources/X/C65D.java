package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.65D, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C65D implements AnonymousClass645 {
    public final /* synthetic */ C65C LIZ;

    @Override // X.AnonymousClass645
    public final void dismiss() {
        this.LIZ.LIZJ().LLILLJJLI().LJII(new OSZ<>(Boolean.TRUE, Boolean.FALSE));
        this.LIZ.LIZJ().Zu0();
        C65C c65c = this.LIZ;
        C146915pf c146915pf = c65c.LLD;
        VideoPublishEditModel model = (VideoPublishEditModel) c65c.LJLLL.LIZ(c65c, C65C.LLIIIJ[0]);
        c146915pf.getClass();
        o.LJIIIZ(model, "model");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("group_id", C78983UzD.LJJIJL());
        int i = model.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        FMX.LJIIL("text_complete", c145995oB.LIZ);
    }

    @Override // X.AnonymousClass645
    public final void show() {
        C29901Fi<OSZ<Boolean, Boolean>> LLILLJJLI = this.LIZ.LIZJ().LLILLJJLI();
        Boolean bool = Boolean.FALSE;
        LLILLJJLI.LJII(new OSZ<>(bool, bool));
        this.LIZ.getClass();
        C65C c65c = this.LIZ;
        C146915pf c146915pf = c65c.LLD;
        VideoPublishEditModel model = (VideoPublishEditModel) c65c.LJLLL.LIZ(c65c, C65C.LLIIIJ[0]);
        c146915pf.getClass();
        o.LJIIIZ(model, "model");
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", model.getCreationId());
        c145995oB.LJI("group_id", C78983UzD.LJJIJL());
        int i = model.draftId;
        if (i != 0) {
            c145995oB.LIZ(i, "draft_id");
        }
        FMX.LJIIL("click_text_entrance", c145995oB.LIZ);
    }

    public C65D(C65C c65c) {
        this.LIZ = c65c;
    }
}
