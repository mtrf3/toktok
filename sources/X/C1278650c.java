package X;

import Y.AObserverS70S0100000_2;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.ugc.android.editor.preview.PreviewPanelViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.50c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1278650c implements C5Q2 {
    public final PreviewPanelViewModel LIZ;
    public final /* synthetic */ C127604zc LIZIZ;

    @Override // X.C5Q2
    public final void LIZ(InterfaceC132925Jo interfaceC132925Jo, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
    }

    @Override // X.C5Q2
    public final void LIZJ(InterfaceC132925Jo interfaceC132925Jo, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
    }

    @Override // X.C5Q2
    public final void LJ() {
    }

    @Override // X.C5Q2
    public final void LJIIIIZZ() {
    }

    @Override // X.C5Q2
    public final void LJIIIZ(InterfaceC132925Jo interfaceC132925Jo, NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
    }

    @Override // X.C5Q2
    public final void LJIIJ() {
    }

    @Override // X.C5Q2
    public final void LJIIL() {
    }

    public C1278650c(C127604zc c127604zc) {
        this.LIZIZ = c127604zc;
        PreviewPanelViewModel previewPanelViewModel = (PreviewPanelViewModel) C165706es.LJIIIIZZ(c127604zc.LJLLLLLL, null, null, 6).get(PreviewPanelViewModel.class);
        this.LIZ = previewPanelViewModel;
        previewPanelViewModel.LJLJL.observe(c127604zc.LJLLLLLL, new AObserverS70S0100000_2(this, 168));
    }

    @Override // X.C5Q2
    public final void LIZLLL(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.C5Q2
    public final void LJFF(MotionEvent e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.C5Q2
    public final void LJIIJJI(MotionEvent event) {
        o.LJIIIZ(event, "event");
        if (event.getAction() == 0) {
            this.LIZIZ.LJIILL().getPlayer().pause();
            this.LIZ.LJZL = false;
        }
    }

    @Override // X.C5Q2
    public final boolean LIZIZ(InterfaceC132925Jo interfaceC132925Jo, NLETrack track, NLETrackSlot slot, MotionEvent e) {
        String str;
        VideoPublishEditModel LJJIIZ;
        String str2;
        String str3;
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        if (interfaceC132925Jo instanceof C132005Ga) {
            if (this.LIZIZ.LJIILL().getSelectedTrackSlot() == null && (LJJIIZ = C127604zc.LJJIIZ()) != null) {
                C127604zc c127604zc = this.LIZIZ;
                if (AnonymousClass636.LJIIL(slot)) {
                    str2 = "click_text_caption";
                } else {
                    str2 = "click_text";
                }
                C5QW.LJJIZ(LJJIIZ, c127604zc.LJIILL(), str2);
                if (c127604zc.LLIIII) {
                    str3 = "text_time";
                } else {
                    str3 = "edit_page";
                }
                H8F.LJJJJLL(LJJIIZ, "", 1, str3, null, 16);
            }
            C79057V0z.LJJJJL(this.LIZIZ.LJIILL(), "select_slot_event", new C127594zb(slot, null, 14));
            return false;
        }
        NLETrackSlot selectedTrackSlot = this.LIZIZ.LJIILL().getSelectedTrackSlot();
        if (selectedTrackSlot != null) {
            str = selectedTrackSlot.getUUID();
        } else {
            str = null;
        }
        if (o.LJ(str, slot.getUUID())) {
            C79057V0z.LJJJJL(this.LIZIZ.LJIILL(), "select_slot_event", new C127594zb(null, null, 14));
            return true;
        }
        C79057V0z.LJJJJL(this.LIZIZ.LJIILL(), "select_slot_event", new C127594zb(slot, null, 14));
        return true;
    }

    @Override // X.C5Q2
    public final void LJI(InterfaceC132925Jo interfaceC132925Jo, NLETrack track, NLETrackSlot slot, MotionEvent e) {
        o.LJIIIZ(track, "track");
        o.LJIIIZ(slot, "slot");
        o.LJIIIZ(e, "e");
        C79057V0z.LJJJJL(this.LIZIZ.LJIILL(), "select_slot_event", new C127594zb(slot, null, 14));
        this.LIZ.LJZL = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x01cb, code lost:
    
        if (r0 != 0) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C5Q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(X.InterfaceC132925Jo r16, boolean r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278650c.LJII(X.5Jo, boolean, boolean, boolean):void");
    }
}
